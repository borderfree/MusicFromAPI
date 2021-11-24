package com.facebook.ads.internal.p072o;

/* renamed from: com.facebook.ads.internal.o.f */
public enum C1732f {
    TEST("test"),
    BROWSER_SESSION("browser_session"),
    CLOSE("close"),
    IMPRESSION("impression"),
    INVALIDATION("invalidation"),
    STORE("store"),
    OFF_TARGET_CLICK("off_target_click"),
    OPEN_LINK("open_link"),
    NATIVE_VIEW("native_view"),
    VIDEO("video"),
    USER_RETURN("user_return"),
    AD_REPORTING("x_out");
    

    /* renamed from: m */
    private String f5716m;

    private C1732f(String str) {
        this.f5716m = str;
    }

    /* renamed from: a */
    public static C1732f m8679a(String str) {
        C1732f[] values;
        for (C1732f fVar : values()) {
            if (fVar.f5716m.equalsIgnoreCase(str)) {
                return fVar;
            }
        }
        return null;
    }

    public String toString() {
        return this.f5716m;
    }
}
