package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.C2717q;
import com.google.android.exoplayer2.C2717q.C2719a;
import com.google.android.exoplayer2.C2717q.C2720b;
import com.google.android.exoplayer2.p102c.C2488a;

/* renamed from: com.google.android.exoplayer2.source.g */
public final class C2738g extends C2717q {

    /* renamed from: b */
    private static final Object f9374b = new Object();

    /* renamed from: c */
    private final long f9375c;

    /* renamed from: d */
    private final long f9376d;

    /* renamed from: e */
    private final long f9377e;

    /* renamed from: f */
    private final long f9378f;

    /* renamed from: g */
    private final boolean f9379g;

    /* renamed from: h */
    private final boolean f9380h;

    public C2738g(long j, long j2, long j3, long j4, boolean z, boolean z2) {
        this.f9375c = j;
        this.f9376d = j2;
        this.f9377e = j3;
        this.f9378f = j4;
        this.f9379g = z;
        this.f9380h = z2;
    }

    public C2738g(long j, boolean z) {
        this(j, j, 0, 0, z, false);
    }

    /* renamed from: a */
    public int mo9318a(Object obj) {
        return f9374b.equals(obj) ? 0 : -1;
    }

    /* renamed from: a */
    public C2719a mo9320a(int i, C2719a aVar, boolean z) {
        C2488a.m11663a(i, 0, 1);
        Object obj = z ? f9374b : null;
        return aVar.mo9328a(obj, obj, 0, this.f9375c, -this.f9377e, false);
    }

    /* renamed from: a */
    public C2720b mo9323a(int i, C2720b bVar, boolean z, long j) {
        C2488a.m11663a(i, 0, 1);
        Object obj = z ? f9374b : null;
        long j2 = this.f9378f;
        if (this.f9380h) {
            j2 += j;
            if (j2 > this.f9376d) {
                j2 = -9223372036854775807L;
            }
        }
        return bVar.mo9331a(obj, -9223372036854775807L, -9223372036854775807L, this.f9379g, this.f9380h, j2, this.f9376d, 0, 0, this.f9377e);
    }

    /* renamed from: b */
    public int mo9325b() {
        return 1;
    }

    /* renamed from: c */
    public int mo9326c() {
        return 1;
    }
}
