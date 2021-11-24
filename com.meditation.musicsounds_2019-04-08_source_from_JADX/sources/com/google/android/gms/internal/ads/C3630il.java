package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzbv;

/* renamed from: com.google.android.gms.internal.ads.il */
final class C3630il {

    /* renamed from: a */
    private final Object f14209a;

    /* renamed from: b */
    private volatile int f14210b;

    /* renamed from: c */
    private volatile long f14211c;

    private C3630il() {
        this.f14209a = new Object();
        this.f14210b = C3631im.f14212a;
        this.f14211c = 0;
    }

    /* synthetic */ C3630il(C3629ik ikVar) {
        this();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m18743a(int r5, int r6) {
        /*
            r4 = this;
            r4.m18744d()
            com.google.android.gms.common.util.e r0 = com.google.android.gms.ads.internal.zzbv.zzer()
            long r0 = r0.mo11326a()
            java.lang.Object r2 = r4.f14209a
            monitor-enter(r2)
            int r3 = r4.f14210b     // Catch:{ all -> 0x0020 }
            if (r3 == r5) goto L_0x0014
            monitor-exit(r2)     // Catch:{ all -> 0x0020 }
            return
        L_0x0014:
            r4.f14210b = r6     // Catch:{ all -> 0x0020 }
            int r5 = r4.f14210b     // Catch:{ all -> 0x0020 }
            int r6 = com.google.android.gms.internal.ads.C3631im.f14214c     // Catch:{ all -> 0x0020 }
            if (r5 != r6) goto L_0x001e
            r4.f14211c = r0     // Catch:{ all -> 0x0020 }
        L_0x001e:
            monitor-exit(r2)     // Catch:{ all -> 0x0020 }
            return
        L_0x0020:
            r5 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0020 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3630il.m18743a(int, int):void");
    }

    /* renamed from: d */
    private final void m18744d() {
        long a = zzbv.zzer().mo11326a();
        synchronized (this.f14209a) {
            if (this.f14210b == C3631im.f14214c) {
                if (this.f14211c + ((Long) ane.m16650f().mo12297a(aqm.f12828di)).longValue() <= a) {
                    this.f14210b = C3631im.f14212a;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo13065a(boolean z) {
        int i;
        int i2;
        if (z) {
            i = C3631im.f14212a;
            i2 = C3631im.f14213b;
        } else {
            i = C3631im.f14213b;
            i2 = C3631im.f14212a;
        }
        m18743a(i, i2);
    }

    /* renamed from: a */
    public final boolean mo13066a() {
        m18744d();
        return this.f14210b == C3631im.f14213b;
    }

    /* renamed from: b */
    public final boolean mo13067b() {
        m18744d();
        return this.f14210b == C3631im.f14214c;
    }

    /* renamed from: c */
    public final void mo13068c() {
        m18743a(C3631im.f14213b, C3631im.f14214c);
    }
}
