package com.google.android.gms.common.util;

import android.os.SystemClock;

/* renamed from: com.google.android.gms.common.util.h */
public class C3303h implements C3300e {

    /* renamed from: a */
    private static final C3303h f11200a = new C3303h();

    private C3303h() {
    }

    /* renamed from: d */
    public static C3300e m15052d() {
        return f11200a;
    }

    /* renamed from: a */
    public long mo11326a() {
        return System.currentTimeMillis();
    }

    /* renamed from: b */
    public long mo11327b() {
        return SystemClock.elapsedRealtime();
    }

    /* renamed from: c */
    public long mo11328c() {
        return System.nanoTime();
    }
}
