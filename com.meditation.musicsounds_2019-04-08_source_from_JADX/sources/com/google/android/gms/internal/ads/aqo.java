package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build.VERSION;
import com.google.android.gms.ads.internal.zzbv;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Future;

@C3464ci
public final class aqo {

    /* renamed from: a */
    private String f12918a;

    /* renamed from: b */
    private Map<String, String> f12919b;

    /* renamed from: c */
    private Context f12920c = null;

    /* renamed from: d */
    private String f12921d = null;

    public aqo(Context context, String str) {
        this.f12920c = context;
        this.f12921d = str;
        this.f12918a = (String) ane.m16650f().mo12297a(aqm.f12622O);
        this.f12919b = new LinkedHashMap();
        this.f12919b.put("s", "gmob_sdk");
        this.f12919b.put("v", "3");
        this.f12919b.put("os", VERSION.RELEASE);
        this.f12919b.put("sdk", VERSION.SDK);
        zzbv.zzek();
        this.f12919b.put("device", C3653jh.m18890b());
        this.f12919b.put("app", context.getApplicationContext() != null ? context.getApplicationContext().getPackageName() : context.getPackageName());
        Map<String, String> map = this.f12919b;
        String str2 = "is_lite_sdk";
        zzbv.zzek();
        map.put(str2, C3653jh.m18910k(context) ? "1" : "0");
        Future a = zzbv.zzev().mo12896a(this.f12920c);
        try {
            a.get();
            this.f12919b.put("network_coarse", Integer.toString(((C3533ew) a.get()).f13924n));
            this.f12919b.put("network_fine", Integer.toString(((C3533ew) a.get()).f13925o));
        } catch (Exception e) {
            zzbv.zzeo().mo13047a((Throwable) e, "CsiConfiguration.CsiConfiguration");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final String mo12301a() {
        return this.f12918a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final Context mo12302b() {
        return this.f12920c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final String mo12303c() {
        return this.f12921d;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final Map<String, String> mo12304d() {
        return this.f12919b;
    }
}
