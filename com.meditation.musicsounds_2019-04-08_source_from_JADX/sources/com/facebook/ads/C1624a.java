package com.facebook.ads;

import android.text.TextUtils;

/* renamed from: com.facebook.ads.a */
public class C1624a {

    /* renamed from: a */
    public static final C1624a f5277a = new C1624a(1000, "Network Error");

    /* renamed from: b */
    public static final C1624a f5278b = new C1624a(1001, "No Fill");

    /* renamed from: c */
    public static final C1624a f5279c = new C1624a(1002, "Ad was re-loaded too frequently");

    /* renamed from: d */
    public static final C1624a f5280d = new C1624a(2000, "Server Error");

    /* renamed from: e */
    public static final C1624a f5281e = new C1624a(2001, "Internal Error");

    /* renamed from: f */
    public static final C1624a f5282f = new C1624a(2002, "Cache Error");

    /* renamed from: g */
    public static final C1624a f5283g = new C1624a(3001, "Mediation Error");
    @Deprecated

    /* renamed from: h */
    public static final C1624a f5284h = new C1624a(2002, "Native ad failed to load due to missing properties");

    /* renamed from: i */
    public static final C1624a f5285i = new C1624a(2100, "Native ad failed to load its media");

    /* renamed from: j */
    public static final C1624a f5286j = new C1624a(6003, "unsupported type of ad assets");

    /* renamed from: k */
    public static final C1624a f5287k = new C1624a(7001, "Ad not loaded. First call loadAd() and wait for onAdLoaded() to be invoked before executing show()");

    /* renamed from: l */
    private final int f5288l;

    /* renamed from: m */
    private final String f5289m;

    public C1624a(int i, String str) {
        if (TextUtils.isEmpty(str)) {
            str = "unknown error";
        }
        this.f5288l = i;
        this.f5289m = str;
    }

    /* renamed from: a */
    public static C1624a m8164a(int i) {
        return new C1624a(i, "Internal error");
    }
}
