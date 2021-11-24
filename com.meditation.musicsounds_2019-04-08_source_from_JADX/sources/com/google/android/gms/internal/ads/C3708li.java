package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzbv;
import javax.annotation.concurrent.GuardedBy;

@C3464ci
/* renamed from: com.google.android.gms.internal.ads.li */
public final class C3708li {

    /* renamed from: a */
    private long f14391a;
    @GuardedBy("mLock")

    /* renamed from: b */
    private long f14392b = Long.MIN_VALUE;

    /* renamed from: c */
    private Object f14393c = new Object();

    public C3708li(long j) {
        this.f14391a = j;
    }

    /* renamed from: a */
    public final boolean mo13219a() {
        synchronized (this.f14393c) {
            long b = zzbv.zzer().mo11327b();
            if (this.f14392b + this.f14391a > b) {
                return false;
            }
            this.f14392b = b;
            return true;
        }
    }
}
