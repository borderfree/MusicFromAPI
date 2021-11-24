package com.google.android.exoplayer2.extractor.p104b;

import com.google.android.exoplayer2.p102c.C2511s;

/* renamed from: com.google.android.exoplayer2.extractor.b.a */
final class C2537a implements C2540a {

    /* renamed from: a */
    private final long f8275a;

    /* renamed from: b */
    private final int f8276b;

    /* renamed from: c */
    private final long f8277c;

    public C2537a(long j, int i, long j2) {
        this.f8275a = j;
        this.f8276b = i;
        this.f8277c = j2 == -1 ? -9223372036854775807L : mo8977a(j2);
    }

    /* renamed from: a */
    public long mo8977a(long j) {
        return ((Math.max(0, j - this.f8275a) * 1000000) * 8) / ((long) this.f8276b);
    }

    /* renamed from: a */
    public boolean mo8930a() {
        return this.f8277c != -9223372036854775807L;
    }

    /* renamed from: b */
    public long mo8931b() {
        return this.f8277c;
    }

    /* renamed from: b */
    public long mo8932b(long j) {
        if (this.f8277c == -9223372036854775807L) {
            return 0;
        }
        return this.f8275a + ((C2511s.m11801a(j, 0, this.f8277c) * ((long) this.f8276b)) / 8000000);
    }
}
