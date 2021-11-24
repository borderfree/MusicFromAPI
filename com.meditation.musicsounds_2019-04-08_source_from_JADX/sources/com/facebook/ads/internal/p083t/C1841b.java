package com.facebook.ads.internal.p083t;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.t.b */
public class C1841b {

    /* renamed from: a */
    private C1842c f6048a;

    /* renamed from: b */
    private float f6049b;

    /* renamed from: c */
    private Map<String, String> f6050c;

    public C1841b(C1842c cVar) {
        this(cVar, 0.0f);
    }

    public C1841b(C1842c cVar, float f) {
        this(cVar, f, null);
    }

    public C1841b(C1842c cVar, float f, Map<String, String> map) {
        this.f6048a = cVar;
        this.f6049b = f;
        if (map != null) {
            this.f6050c = map;
        } else {
            this.f6050c = new HashMap();
        }
    }

    /* renamed from: a */
    public boolean mo7116a() {
        return this.f6048a == C1842c.IS_VIEWABLE;
    }

    /* renamed from: b */
    public int mo7117b() {
        return this.f6048a.mo7120a();
    }

    /* renamed from: c */
    public float mo7118c() {
        return this.f6049b;
    }

    /* renamed from: d */
    public Map<String, String> mo7119d() {
        return this.f6050c;
    }
}
