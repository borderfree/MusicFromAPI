package com.google.android.exoplayer2.p102c;

/* renamed from: com.google.android.exoplayer2.c.q */
public final class C2509q {

    /* renamed from: a */
    private long f8120a;

    /* renamed from: b */
    private long f8121b;

    /* renamed from: c */
    private volatile long f8122c = -9223372036854775807L;

    public C2509q(long j) {
        mo8876a(j);
    }

    /* renamed from: d */
    public static long m11783d(long j) {
        return (j * 1000000) / 90000;
    }

    /* renamed from: e */
    public static long m11784e(long j) {
        return (j * 90000) / 1000000;
    }

    /* renamed from: a */
    public long mo8875a() {
        return this.f8120a;
    }

    /* renamed from: a */
    public synchronized void mo8876a(long j) {
        C2488a.m11668b(this.f8122c == -9223372036854775807L);
        this.f8120a = j;
    }

    /* renamed from: b */
    public long mo8877b() {
        if (this.f8122c != -9223372036854775807L) {
            return this.f8122c;
        }
        if (this.f8120a != Long.MAX_VALUE) {
            return this.f8120a;
        }
        return -9223372036854775807L;
    }

    /* renamed from: b */
    public long mo8878b(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.f8122c != -9223372036854775807L) {
            long e = m11784e(this.f8122c);
            long j2 = (4294967296L + e) / 8589934592L;
            long j3 = ((j2 - 1) * 8589934592L) + j;
            j += j2 * 8589934592L;
            if (Math.abs(j3 - e) < Math.abs(j - e)) {
                j = j3;
            }
        }
        return mo8880c(m11783d(j));
    }

    /* renamed from: c */
    public long mo8879c() {
        if (this.f8120a == Long.MAX_VALUE) {
            return 0;
        }
        if (this.f8122c == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return this.f8121b;
    }

    /* renamed from: c */
    public long mo8880c(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.f8122c != -9223372036854775807L) {
            this.f8122c = j;
        } else {
            if (this.f8120a != Long.MAX_VALUE) {
                this.f8121b = this.f8120a - j;
            }
            synchronized (this) {
                this.f8122c = j;
                notifyAll();
            }
        }
        return j + this.f8121b;
    }

    /* renamed from: d */
    public void mo8881d() {
        this.f8122c = -9223372036854775807L;
    }
}
