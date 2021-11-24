package com.google.android.exoplayer2.extractor.p104b;

import com.google.android.exoplayer2.extractor.C2655k;
import com.google.android.exoplayer2.p102c.C2500k;
import com.google.android.exoplayer2.p102c.C2511s;

/* renamed from: com.google.android.exoplayer2.extractor.b.d */
final class C2542d implements C2540a {

    /* renamed from: a */
    private final long f8298a;

    /* renamed from: b */
    private final long f8299b;

    /* renamed from: c */
    private final long f8300c;

    /* renamed from: d */
    private final long[] f8301d;

    /* renamed from: e */
    private final long f8302e;

    /* renamed from: f */
    private final int f8303f;

    private C2542d(long j, long j2, long j3) {
        this(j, j2, j3, null, 0, 0);
    }

    private C2542d(long j, long j2, long j3, long[] jArr, long j4, int i) {
        this.f8298a = j;
        this.f8299b = j2;
        this.f8300c = j3;
        this.f8301d = jArr;
        this.f8302e = j4;
        this.f8303f = i;
    }

    /* renamed from: a */
    private long m11984a(int i) {
        return (this.f8299b * ((long) i)) / 100;
    }

    /* renamed from: a */
    public static C2542d m11985a(C2655k kVar, C2500k kVar2, long j, long j2) {
        C2655k kVar3 = kVar;
        int i = kVar3.f9024g;
        int i2 = kVar3.f9021d;
        long j3 = j + ((long) kVar3.f9020c);
        int n = kVar2.mo8841n();
        if ((n & 1) == 1) {
            int t = kVar2.mo8847t();
            if (t != 0) {
                long b = C2511s.m11814b((long) t, ((long) i) * 1000000, (long) i2);
                if ((n & 6) != 6) {
                    C2542d dVar = new C2542d(j3, b, j2);
                    return dVar;
                }
                long t2 = (long) kVar2.mo8847t();
                kVar2.mo8829d(1);
                long[] jArr = new long[99];
                for (int i3 = 0; i3 < 99; i3++) {
                    jArr[i3] = (long) kVar2.mo8834g();
                }
                C2542d dVar2 = new C2542d(j3, b, j2, jArr, t2, kVar3.f9020c);
                return dVar2;
            }
        }
        return null;
    }

    /* renamed from: a */
    public long mo8977a(long j) {
        long j2 = 0;
        if (!mo8930a() || j < this.f8298a) {
            return 0;
        }
        double d = (double) (j - this.f8298a);
        Double.isNaN(d);
        double d2 = d * 256.0d;
        double d3 = (double) this.f8302e;
        Double.isNaN(d3);
        double d4 = d2 / d3;
        int a = C2511s.m11800a(this.f8301d, (long) d4, true, false) + 1;
        long a2 = m11984a(a);
        long j3 = a == 0 ? 0 : this.f8301d[a - 1];
        long j4 = a == 99 ? 256 : this.f8301d[a];
        long a3 = m11984a(a + 1);
        if (j4 != j3) {
            double d5 = (double) (a3 - a2);
            double d6 = (double) j3;
            Double.isNaN(d6);
            double d7 = d4 - d6;
            Double.isNaN(d5);
            double d8 = d5 * d7;
            double d9 = (double) (j4 - j3);
            Double.isNaN(d9);
            j2 = (long) (d8 / d9);
        }
        return a2 + j2;
    }

    /* renamed from: a */
    public boolean mo8930a() {
        return this.f8301d != null;
    }

    /* renamed from: b */
    public long mo8931b() {
        return this.f8299b;
    }

    /* renamed from: b */
    public long mo8932b(long j) {
        if (!mo8930a()) {
            return this.f8298a;
        }
        float f = (((float) j) * 100.0f) / ((float) this.f8299b);
        float f2 = 256.0f;
        float f3 = 0.0f;
        if (f <= 0.0f) {
            f2 = 0.0f;
        } else if (f < 100.0f) {
            int i = (int) f;
            if (i != 0) {
                f3 = (float) this.f8301d[i - 1];
            }
            if (i < 99) {
                f2 = (float) this.f8301d[i];
            }
            f2 = ((f2 - f3) * (f - ((float) i))) + f3;
        }
        double d = (double) f2;
        Double.isNaN(d);
        double d2 = d * 0.00390625d;
        double d3 = (double) this.f8302e;
        Double.isNaN(d3);
        return Math.min(Math.round(d2 * d3) + this.f8298a, (this.f8300c != -1 ? this.f8300c : (this.f8298a - ((long) this.f8303f)) + this.f8302e) - 1);
    }
}
