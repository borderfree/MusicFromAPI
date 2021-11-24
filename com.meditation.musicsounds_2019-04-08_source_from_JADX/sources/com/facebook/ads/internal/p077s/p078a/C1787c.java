package com.facebook.ads.internal.p077s.p078a;

import org.json.JSONArray;

/* renamed from: com.facebook.ads.internal.s.a.c */
public enum C1787c {
    APP_AD(0),
    LINK_AD(1),
    APP_AD_V2(2),
    LINK_AD_V2(3),
    APP_ENGAGEMENT_AD(4),
    AD_CHOICES(5),
    JS_TRIGGER(6),
    JS_TRIGGER_NO_AUTO_IMP_LOGGING(7),
    VIDEO_AD(8),
    INLINE_VIDEO_AD(9),
    BANNER_TO_INTERSTITIAL(10),
    NATIVE_CLOSE_BUTTON(11),
    UNIFIED_LOGGING(16),
    HTTP_LINKS(17);
    

    /* renamed from: o */
    public static final C1787c[] f5827o = null;

    /* renamed from: q */
    private static final String f5828q = null;

    /* renamed from: p */
    private final int f5830p;

    static {
        int i;
        f5827o = new C1787c[]{LINK_AD_V2, APP_ENGAGEMENT_AD, AD_CHOICES, JS_TRIGGER_NO_AUTO_IMP_LOGGING, NATIVE_CLOSE_BUTTON, UNIFIED_LOGGING, HTTP_LINKS};
        JSONArray jSONArray = new JSONArray();
        for (C1787c a : f5827o) {
            jSONArray.put(a.mo7054a());
        }
        f5828q = jSONArray.toString();
    }

    private C1787c(int i) {
        this.f5830p = i;
    }

    /* renamed from: b */
    public static String m8876b() {
        return f5828q;
    }

    /* renamed from: a */
    public int mo7054a() {
        return this.f5830p;
    }

    public String toString() {
        return String.valueOf(this.f5830p);
    }
}
