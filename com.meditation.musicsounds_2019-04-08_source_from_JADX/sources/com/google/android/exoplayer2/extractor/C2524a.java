package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.p102c.C2511s;

/* renamed from: com.google.android.exoplayer2.extractor.a */
public final class C2524a implements C2657m {

    /* renamed from: a */
    public final int f8149a;

    /* renamed from: b */
    public final int[] f8150b;

    /* renamed from: c */
    public final long[] f8151c;

    /* renamed from: d */
    public final long[] f8152d;

    /* renamed from: e */
    public final long[] f8153e;

    /* renamed from: f */
    private final long f8154f;

    public C2524a(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f8150b = iArr;
        this.f8151c = jArr;
        this.f8152d = jArr2;
        this.f8153e = jArr3;
        this.f8149a = iArr.length;
        this.f8154f = this.f8149a > 0 ? jArr2[this.f8149a - 1] + jArr3[this.f8149a - 1] : 0;
    }

    /* renamed from: a */
    public int mo8929a(long j) {
        return C2511s.m11800a(this.f8153e, j, true, true);
    }

    /* renamed from: a */
    public boolean mo8930a() {
        return true;
    }

    /* renamed from: b */
    public long mo8931b() {
        return this.f8154f;
    }

    /* renamed from: b */
    public long mo8932b(long j) {
        return this.f8151c[mo8929a(j)];
    }
}
