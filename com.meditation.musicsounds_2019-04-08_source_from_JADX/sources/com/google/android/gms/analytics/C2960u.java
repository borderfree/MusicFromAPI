package com.google.android.gms.analytics;

import android.text.TextUtils;
import com.google.android.gms.common.internal.C3266s;
import com.google.android.gms.internal.measurement.C4267bf;
import com.google.android.gms.internal.measurement.C4286by;
import com.google.android.gms.internal.measurement.C4452hw;
import com.google.android.gms.internal.measurement.C4489k;
import com.google.android.gms.internal.measurement.C4498t;
import com.google.android.gms.internal.measurement.C4502x;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.analytics.u */
final class C2960u implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ Map f10416a;

    /* renamed from: b */
    private final /* synthetic */ boolean f10417b;

    /* renamed from: c */
    private final /* synthetic */ String f10418c;

    /* renamed from: d */
    private final /* synthetic */ long f10419d;

    /* renamed from: e */
    private final /* synthetic */ boolean f10420e;

    /* renamed from: f */
    private final /* synthetic */ boolean f10421f;

    /* renamed from: g */
    private final /* synthetic */ String f10422g;

    /* renamed from: h */
    private final /* synthetic */ C2940e f10423h;

    C2960u(C2940e eVar, Map map, boolean z, String str, long j, boolean z2, boolean z3, String str2) {
        this.f10423h = eVar;
        this.f10416a = map;
        this.f10417b = z;
        this.f10418c = str;
        this.f10419d = j;
        this.f10420e = z2;
        this.f10421f = z3;
        this.f10422g = str2;
    }

    public final void run() {
        if (this.f10423h.f10377e.mo10616b()) {
            this.f10416a.put("sc", "start");
        }
        C2935b m = this.f10423h.mo14830m();
        C3266s.m14926c("getClientId can not be called from the main thread");
        C4286by.m21139b(this.f10416a, "cid", m.mo10620f().mo14856o().mo14136b());
        String str = (String) this.f10416a.get("sf");
        if (str != null) {
            double a = C4286by.m21127a(str, 100.0d);
            if (C4286by.m21134a(a, (String) this.f10416a.get("cid"))) {
                this.f10423h.mo14812b("Sampling enabled. Hit sampled out. sample rate", Double.valueOf(a));
                return;
            }
        }
        C4489k b = this.f10423h.mo14836s();
        if (this.f10417b) {
            C4286by.m21133a(this.f10416a, "ate", b.mo14791b());
            C4286by.m21131a(this.f10416a, "adid", b.mo14792c());
        } else {
            this.f10416a.remove("ate");
            this.f10416a.remove("adid");
        }
        C4452hw b2 = this.f10423h.mo14837t().mo14121b();
        C4286by.m21131a(this.f10416a, "an", b2.mo14630a());
        C4286by.m21131a(this.f10416a, "av", b2.mo14633b());
        C4286by.m21131a(this.f10416a, "aid", b2.mo14635c());
        C4286by.m21131a(this.f10416a, "aiid", b2.mo14637d());
        this.f10416a.put("v", "1");
        this.f10416a.put("_v", C4498t.f16367b);
        C4286by.m21131a(this.f10416a, "ul", this.f10423h.mo14838u().mo14157b().mo14217a());
        C4286by.m21131a(this.f10416a, "sr", this.f10423h.mo14838u().mo14158c());
        if ((this.f10418c.equals("transaction") || this.f10418c.equals("item")) || this.f10423h.f10376d.mo14177a()) {
            long a2 = C4286by.m21128a((String) this.f10416a.get("ht"));
            if (a2 == 0) {
                a2 = this.f10419d;
            }
            long j = a2;
            if (this.f10420e) {
                C4267bf bfVar = new C4267bf(this.f10423h, this.f10416a, j, this.f10421f);
                this.f10423h.mo14827j().mo14816c("Dry run enabled. Would have sent hit", bfVar);
                return;
            }
            String str2 = (String) this.f10416a.get("cid");
            HashMap hashMap = new HashMap();
            C4286by.m21132a((Map<String, String>) hashMap, "uid", this.f10416a);
            C4286by.m21132a((Map<String, String>) hashMap, "an", this.f10416a);
            C4286by.m21132a((Map<String, String>) hashMap, "aid", this.f10416a);
            C4286by.m21132a((Map<String, String>) hashMap, "av", this.f10416a);
            C4286by.m21132a((Map<String, String>) hashMap, "aiid", this.f10416a);
            C4502x xVar = new C4502x(0, str2, this.f10422g, !TextUtils.isEmpty((CharSequence) this.f10416a.get("adid")), 0, hashMap);
            this.f10416a.put("_s", String.valueOf(this.f10423h.mo14831n().mo14793a(xVar)));
            C4267bf bfVar2 = new C4267bf(this.f10423h, this.f10416a, j, this.f10421f);
            this.f10423h.mo14831n().mo14796a(bfVar2);
            return;
        }
        this.f10423h.mo14827j().mo14180a(this.f10416a, "Too many hits sent too quickly, rate limiting invoked");
    }
}
