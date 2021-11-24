package com.google.android.gms.internal.ads;

import java.lang.Thread.UncaughtExceptionHandler;

/* renamed from: com.google.android.gms.internal.ads.ce */
final class C3460ce implements UncaughtExceptionHandler {

    /* renamed from: a */
    private final /* synthetic */ UncaughtExceptionHandler f13686a;

    /* renamed from: b */
    private final /* synthetic */ C3458cc f13687b;

    C3460ce(C3458cc ccVar, UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f13687b = ccVar;
        this.f13686a = uncaughtExceptionHandler;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0018, code lost:
        if (r2.f13686a == null) goto L_0x001b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        if (r2.f13686a != null) goto L_0x0009;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0009, code lost:
        r2.f13686a.uncaughtException(r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void uncaughtException(java.lang.Thread r3, java.lang.Throwable r4) {
        /*
            r2 = this;
            com.google.android.gms.internal.ads.cc r0 = r2.f13687b     // Catch:{ Throwable -> 0x0011 }
            r0.mo12835a(r3, r4)     // Catch:{ Throwable -> 0x0011 }
            java.lang.Thread$UncaughtExceptionHandler r0 = r2.f13686a
            if (r0 == 0) goto L_0x001b
        L_0x0009:
            java.lang.Thread$UncaughtExceptionHandler r0 = r2.f13686a
            r0.uncaughtException(r3, r4)
            return
        L_0x000f:
            r0 = move-exception
            goto L_0x001c
        L_0x0011:
            java.lang.String r0 = "AdMob exception reporter failed reporting the exception."
            com.google.android.gms.internal.ads.C3731me.m19174c(r0)     // Catch:{ all -> 0x000f }
            java.lang.Thread$UncaughtExceptionHandler r0 = r2.f13686a
            if (r0 == 0) goto L_0x001b
            goto L_0x0009
        L_0x001b:
            return
        L_0x001c:
            java.lang.Thread$UncaughtExceptionHandler r1 = r2.f13686a
            if (r1 == 0) goto L_0x0025
            java.lang.Thread$UncaughtExceptionHandler r1 = r2.f13686a
            r1.uncaughtException(r3, r4)
        L_0x0025:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3460ce.uncaughtException(java.lang.Thread, java.lang.Throwable):void");
    }
}
