package com.google.android.gms.ads.internal;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.C3464ci;
import com.google.android.gms.internal.ads.C3626ih;
import com.google.android.gms.internal.ads.C3643iy;
import com.google.android.gms.internal.ads.C3738ml;
import com.google.android.gms.internal.ads.C3740mn;
import com.google.android.gms.internal.ads.C3751my;
import com.google.android.gms.internal.ads.C3758ne;
import com.google.android.gms.internal.ads.ane;
import com.google.android.gms.internal.ads.aqm;
import com.google.android.gms.internal.ads.azj;
import com.google.android.gms.internal.ads.azo;
import com.google.android.gms.internal.ads.zzang;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
@C3464ci
public final class zzad {

    /* renamed from: a */
    private final Object f10129a = new Object();

    /* renamed from: b */
    private Context f10130b;

    /* renamed from: c */
    private long f10131c = 0;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo10166a(Context context, zzang zzang, boolean z, C3626ih ihVar, String str, String str2, Runnable runnable) {
        if (zzbv.zzer().mo11327b() - this.f10131c < 5000) {
            C3643iy.m19178e("Not retrying to fetch app settings");
            return;
        }
        this.f10131c = zzbv.zzer().mo11327b();
        boolean z2 = true;
        if (ihVar != null) {
            if (!(zzbv.zzer().mo11326a() - ihVar.mo13037a() > ((Long) ane.m16650f().mo12297a(aqm.f12786ct)).longValue()) && ihVar.mo13038b()) {
                z2 = false;
            }
        }
        if (z2) {
            if (context == null) {
                C3643iy.m19178e("Context not provided to fetch application settings");
            } else if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext == null) {
                    applicationContext = context;
                }
                this.f10130b = applicationContext;
                azj a = zzbv.zzey().mo12647a(this.f10130b, zzang).mo12650a("google.afma.config.fetchAppSettings", azo.f13379a, azo.f13379a);
                try {
                    JSONObject jSONObject = new JSONObject();
                    if (!TextUtils.isEmpty(str)) {
                        jSONObject.put("app_id", str);
                    } else if (!TextUtils.isEmpty(str2)) {
                        jSONObject.put("ad_unit_id", str2);
                    }
                    jSONObject.put("is_init", z);
                    jSONObject.put("pn", context.getPackageName());
                    C3751my b = a.mo12646b(jSONObject);
                    C3751my a2 = C3740mn.m19193a(b, C2875c.f9970a, C3758ne.f14482b);
                    if (runnable != null) {
                        b.mo13268a(runnable, C3758ne.f14482b);
                    }
                    C3738ml.m19187a(a2, "ConfigLoader.maybeFetchNewAppSettings");
                } catch (Exception e) {
                    C3643iy.m19173b("Error requesting application settings", e);
                }
            } else {
                C3643iy.m19178e("App settings could not be fetched. Required parameters missing");
            }
        }
    }

    public final void zza(Context context, zzang zzang, String str, Runnable runnable) {
        mo10166a(context, zzang, true, null, str, null, runnable);
    }
}
