package com.facebook.ads.internal.p083t;

/* renamed from: com.facebook.ads.internal.t.c */
enum C1842c {
    UNKNOWN(0),
    IS_VIEWABLE(1),
    AD_IS_NULL(2),
    INVALID_PARENT(3),
    INVALID_WINDOW(4),
    AD_IS_NOT_VISIBLE(5),
    INVALID_DIMENSIONS(6),
    AD_IS_TRANSPARENT(7),
    AD_IS_OBSTRUCTED(8),
    AD_OFFSCREEN_HORIZONTALLY(9),
    AD_OFFSCREEN_TOP(10),
    AD_OFFSCREEN_BOTTOM(11),
    SCREEN_NOT_INTERACTIVE(12),
    AD_INSUFFICIENT_VISIBLE_AREA(13),
    AD_VIEWABILITY_TICK_DURATION(14),
    AD_IS_OBSTRUCTED_BY_KEYGUARD(15),
    AD_IN_LOCKSCREEN(16),
    AD_IS_NOT_IN_ACTIVITY(17);
    

    /* renamed from: s */
    private final int f6070s;

    private C1842c(int i) {
        this.f6070s = i;
    }

    /* renamed from: a */
    public int mo7120a() {
        return this.f6070s;
    }
}
