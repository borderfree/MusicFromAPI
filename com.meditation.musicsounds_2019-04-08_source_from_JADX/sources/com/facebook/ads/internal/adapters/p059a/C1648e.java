package com.facebook.ads.internal.adapters.p059a;

import java.io.Serializable;

/* renamed from: com.facebook.ads.internal.adapters.a.e */
public class C1648e implements Serializable {
    private static final long serialVersionUID = -4041915335826065133L;

    /* renamed from: a */
    private final String f5372a;

    /* renamed from: b */
    private final String f5373b;

    C1648e(String str, String str2) {
        this.f5372a = m8261a(str);
        this.f5373b = m8261a(str2);
    }

    /* renamed from: a */
    private static String m8261a(String str) {
        return "null".equalsIgnoreCase(str) ? "" : str;
    }

    /* renamed from: a */
    public String mo6713a() {
        return this.f5372a;
    }

    /* renamed from: b */
    public String mo6714b() {
        return this.f5373b;
    }
}
