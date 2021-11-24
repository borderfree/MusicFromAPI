package com.google.android.exoplayer2.p102c;

import android.annotation.TargetApi;
import android.os.Trace;

/* renamed from: com.google.android.exoplayer2.c.r */
public final class C2510r {
    /* renamed from: a */
    public static void m11792a() {
        if (C2511s.f8123a >= 18) {
            m11794b();
        }
    }

    /* renamed from: a */
    public static void m11793a(String str) {
        if (C2511s.f8123a >= 18) {
            m11795b(str);
        }
    }

    @TargetApi(18)
    /* renamed from: b */
    private static void m11794b() {
        Trace.endSection();
    }

    @TargetApi(18)
    /* renamed from: b */
    private static void m11795b(String str) {
        Trace.beginSection(str);
    }
}
