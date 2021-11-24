package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Handler;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzbv;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;
import org.json.JSONObject;

@C3464ci
/* renamed from: com.google.android.gms.internal.ads.ki */
public final class C3681ki {

    /* renamed from: a */
    private final Object f14327a = new Object();
    @GuardedBy("mLock")

    /* renamed from: b */
    private String f14328b = "";
    @GuardedBy("mLock")

    /* renamed from: c */
    private String f14329c = "";
    @GuardedBy("mLock")

    /* renamed from: d */
    private boolean f14330d = false;

    /* renamed from: e */
    private String f14331e = "";

    /* renamed from: a */
    private final String m19016a(Context context) {
        String str;
        synchronized (this.f14327a) {
            if (TextUtils.isEmpty(this.f14328b)) {
                zzbv.zzek();
                this.f14328b = C3653jh.m18895c(context, "debug_signals_id.txt");
                if (TextUtils.isEmpty(this.f14328b)) {
                    zzbv.zzek();
                    this.f14328b = C3653jh.m18865a();
                    zzbv.zzek();
                    C3653jh.m18892b(context, "debug_signals_id.txt", this.f14328b);
                }
            }
            str = this.f14328b;
        }
        return str;
    }

    /* renamed from: a */
    private final void m19017a(Context context, String str, boolean z, boolean z2) {
        if (!(context instanceof Activity)) {
            C3643iy.m19176d("Can not create dialog without Activity Context");
            return;
        }
        Handler handler = C3653jh.f14275a;
        C3682kj kjVar = new C3682kj(this, context, str, z, z2);
        handler.post(kjVar);
    }

    /* renamed from: b */
    private final boolean m19018b(Context context, String str, String str2) {
        String d = m19021d(context, m19019c(context, (String) ane.m16650f().mo12297a(aqm.f12760cT), str, str2).toString(), str2);
        if (TextUtils.isEmpty(d)) {
            C3643iy.m19172b("Not linked for in app preview.");
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(d.trim());
            String optString = jSONObject.optString("gct");
            this.f14331e = jSONObject.optString("status");
            synchronized (this.f14327a) {
                this.f14329c = optString;
            }
            return true;
        } catch (JSONException e) {
            C3643iy.m19175c("Fail to get in app preview response json.", e);
            return false;
        }
    }

    /* renamed from: c */
    private final Uri m19019c(Context context, String str, String str2, String str3) {
        Builder buildUpon = Uri.parse(str).buildUpon();
        buildUpon.appendQueryParameter("linkedDeviceId", m19016a(context));
        buildUpon.appendQueryParameter("adSlotPath", str2);
        buildUpon.appendQueryParameter("afmaVersion", str3);
        return buildUpon.build();
    }

    /* renamed from: c */
    private final boolean m19020c(Context context, String str, String str2) {
        String d = m19021d(context, m19019c(context, (String) ane.m16650f().mo12297a(aqm.f12761cU), str, str2).toString(), str2);
        if (TextUtils.isEmpty(d)) {
            C3643iy.m19172b("Not linked for debug signals.");
            return false;
        }
        try {
            boolean equals = "1".equals(new JSONObject(d.trim()).optString("debug_mode"));
            synchronized (this.f14327a) {
                this.f14330d = equals;
            }
            return equals;
        } catch (JSONException e) {
            C3643iy.m19175c("Fail to get debug mode response json.", e);
            return false;
        }
    }

    /* renamed from: d */
    private static String m19021d(Context context, String str, String str2) {
        String str3;
        Throwable e;
        String str4;
        String str5;
        HashMap hashMap = new HashMap();
        hashMap.put("User-Agent", zzbv.zzek().mo13131b(context, str2));
        C3751my a = new C3690kr(context).mo13208a(str, (Map<String, String>) hashMap);
        try {
            return (String) a.get((long) ((Integer) ane.m16650f().mo12297a(aqm.f12763cW)).intValue(), TimeUnit.MILLISECONDS);
        } catch (TimeoutException e2) {
            e = e2;
            str5 = "Timeout while retriving a response from: ";
            str4 = String.valueOf(str);
            if (str4.length() == 0) {
                str3 = new String(str5);
                C3643iy.m19173b(str3, e);
                a.cancel(true);
                return null;
            }
            str3 = str5.concat(str4);
            C3643iy.m19173b(str3, e);
            a.cancel(true);
            return null;
        } catch (InterruptedException e3) {
            e = e3;
            str5 = "Interrupted while retriving a response from: ";
            str4 = String.valueOf(str);
            if (str4.length() == 0) {
                str3 = new String(str5);
                C3643iy.m19173b(str3, e);
                a.cancel(true);
                return null;
            }
            str3 = str5.concat(str4);
            C3643iy.m19173b(str3, e);
            a.cancel(true);
            return null;
        } catch (Exception e4) {
            String str6 = "Error retriving a response from: ";
            String valueOf = String.valueOf(str);
            C3643iy.m19173b(valueOf.length() != 0 ? str6.concat(valueOf) : new String(str6), e4);
            return null;
        }
    }

    /* renamed from: e */
    private final void m19022e(Context context, String str, String str2) {
        zzbv.zzek();
        C3653jh.m18874a(context, m19019c(context, (String) ane.m16650f().mo12297a(aqm.f12759cS), str, str2));
    }

    /* renamed from: a */
    public final String mo13192a() {
        String str;
        synchronized (this.f14327a) {
            str = this.f14329c;
        }
        return str;
    }

    /* renamed from: a */
    public final void mo13193a(Context context, String str, String str2) {
        if (!m19018b(context, str, str2)) {
            m19017a(context, "In-app preview failed to load because of a system error. Please try again later.", true, true);
        } else if ("2".equals(this.f14331e)) {
            C3643iy.m19172b("Creative is not pushed for this device.");
            m19017a(context, "There was no creative pushed from DFP to the device.", false, false);
        } else if ("1".equals(this.f14331e)) {
            C3643iy.m19172b("The app is not linked for creative preview.");
            m19022e(context, str, str2);
        } else {
            if ("0".equals(this.f14331e)) {
                C3643iy.m19172b("Device is linked for in app preview.");
                m19017a(context, "The device is successfully linked for creative preview.", false, true);
            }
        }
    }

    /* renamed from: a */
    public final void mo13194a(Context context, String str, String str2, @Nullable String str3) {
        boolean b = mo13196b();
        if (m19020c(context, str, str2)) {
            if (!b && !TextUtils.isEmpty(str3)) {
                mo13195b(context, str2, str3, str);
            }
            C3643iy.m19172b("Device is linked for debug signals.");
            m19017a(context, "The device is successfully linked for troubleshooting.", false, true);
            return;
        }
        m19022e(context, str, str2);
    }

    /* renamed from: b */
    public final void mo13195b(Context context, String str, String str2, String str3) {
        Builder buildUpon = m19019c(context, (String) ane.m16650f().mo12297a(aqm.f12762cV), str3, str).buildUpon();
        buildUpon.appendQueryParameter("debugData", str2);
        zzbv.zzek();
        C3653jh.m18875a(context, str, buildUpon.build().toString());
    }

    /* renamed from: b */
    public final boolean mo13196b() {
        boolean z;
        synchronized (this.f14327a) {
            z = this.f14330d;
        }
        return z;
    }
}
