package com.google.android.gms.ads.internal;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C3266s;
import com.google.android.gms.dynamic.C3323b;
import com.google.android.gms.dynamic.C3327d;
import com.google.android.gms.internal.ads.C3464ci;
import com.google.android.gms.internal.ads.C3551fn;
import com.google.android.gms.internal.ads.C3589gy;
import com.google.android.gms.internal.ads.C3590gz;
import com.google.android.gms.internal.ads.C3643iy;
import com.google.android.gms.internal.ads.C3674kb;
import com.google.android.gms.internal.ads.ane;
import com.google.android.gms.internal.ads.aoo;
import com.google.android.gms.internal.ads.aqm;
import com.google.android.gms.internal.ads.bab;
import com.google.android.gms.internal.ads.bac;
import com.google.android.gms.internal.ads.bav;
import com.google.android.gms.internal.ads.zzang;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;

@ParametersAreNonnullByDefault
@C3464ci
public final class zzay extends aoo {

    /* renamed from: b */
    private static final Object f10182b = new Object();
    @GuardedBy("sLock")

    /* renamed from: c */
    private static zzay f10183c;

    /* renamed from: a */
    private final Context f10184a;

    /* renamed from: d */
    private final Object f10185d = new Object();

    /* renamed from: e */
    private boolean f10186e;

    /* renamed from: f */
    private zzang f10187f;

    private zzay(Context context, zzang zzang) {
        this.f10184a = context;
        this.f10187f = zzang;
        this.f10186e = false;
    }

    public static zzay zza(Context context, zzang zzang) {
        zzay zzay;
        synchronized (f10182b) {
            if (f10183c == null) {
                f10183c = new zzay(context.getApplicationContext(), zzang);
            }
            zzay = f10183c;
        }
        return zzay;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo10202a(Runnable runnable) {
        Context context = this.f10184a;
        C3266s.m14922b("Adapters must be initialized on the main thread.");
        Map e = zzbv.zzeo().mo13060l().mo13116h().mo13041e();
        if (e != null && !e.isEmpty()) {
            if (runnable != null) {
                try {
                    runnable.run();
                } catch (Throwable th) {
                    C3643iy.m19175c("Could not initialize rewarded ads.", th);
                    return;
                }
            }
            C3551fn i = C3551fn.m18434i();
            if (i != null) {
                Collection<bac> values = e.values();
                HashMap hashMap = new HashMap();
                C3323b a = C3327d.m15136a(context);
                for (bac bac : values) {
                    for (bab bab : bac.f13423a) {
                        String str = bab.f13412k;
                        for (String str2 : bab.f13404c) {
                            if (!hashMap.containsKey(str2)) {
                                hashMap.put(str2, new ArrayList());
                            }
                            if (str != null) {
                                ((Collection) hashMap.get(str2)).add(str);
                            }
                        }
                    }
                }
                for (Entry entry : hashMap.entrySet()) {
                    String str3 = (String) entry.getKey();
                    try {
                        C3589gy a2 = i.mo12919a(str3);
                        if (a2 != null) {
                            bav a3 = a2.mo12971a();
                            if (!a3.mo12702g()) {
                                if (a3.mo12708m()) {
                                    a3.mo12687a(a, (C3590gz) a2.mo12972b(), (List) entry.getValue());
                                    String str4 = "Initialized rewarded video mediation adapter ";
                                    String valueOf = String.valueOf(str3);
                                    C3643iy.m19172b(valueOf.length() != 0 ? str4.concat(valueOf) : new String(str4));
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 56);
                        sb.append("Failed to initialize rewarded video mediation adapter \"");
                        sb.append(str3);
                        sb.append("\"");
                        C3643iy.m19175c(sb.toString(), th2);
                    }
                }
            }
        }
    }

    public final void setAppMuted(boolean z) {
        zzbv.zzfj().mo13168a(z);
    }

    public final void setAppVolume(float f) {
        zzbv.zzfj().mo13167a(f);
    }

    public final void zza() {
        synchronized (f10182b) {
            if (this.f10186e) {
                C3643iy.m19178e("Mobile ads is initialized already.");
                return;
            }
            this.f10186e = true;
            aqm.m16920a(this.f10184a);
            zzbv.zzeo().mo13044a(this.f10184a, this.f10187f);
            zzbv.zzeq().mo12073a(this.f10184a);
        }
    }

    public final void zza(String str, C3323b bVar) {
        if (!TextUtils.isEmpty(str)) {
            aqm.m16920a(this.f10184a);
            boolean booleanValue = ((Boolean) ane.m16650f().mo12297a(aqm.f12785cs)).booleanValue() | ((Boolean) ane.m16650f().mo12297a(aqm.f12638aD)).booleanValue();
            C2908o oVar = null;
            if (((Boolean) ane.m16650f().mo12297a(aqm.f12638aD)).booleanValue()) {
                booleanValue = true;
                oVar = new C2908o(this, (Runnable) C3327d.m15137a(bVar));
            }
            if (booleanValue) {
                zzbv.zzes().zza(this.f10184a, this.f10187f, str, oVar);
            }
        }
    }

    public final void zzb(C3323b bVar, String str) {
        if (bVar == null) {
            C3643iy.m19174c("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context = (Context) C3327d.m15137a(bVar);
        if (context == null) {
            C3643iy.m19174c("Context is null. Failed to open debug menu.");
            return;
        }
        C3674kb kbVar = new C3674kb(context);
        kbVar.mo13178a(str);
        kbVar.mo13181b(this.f10187f.f15360a);
        kbVar.mo13175a();
    }

    public final float zzdo() {
        return zzbv.zzfj().mo13166a();
    }

    public final boolean zzdp() {
        return zzbv.zzfj().mo13169b();
    }

    public final void zzt(String str) {
        aqm.m16920a(this.f10184a);
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) ane.m16650f().mo12297a(aqm.f12785cs)).booleanValue()) {
                zzbv.zzes().zza(this.f10184a, this.f10187f, str, null);
            }
        }
    }
}
