package com.google.android.exoplayer2.extractor.p104b;

import com.google.android.exoplayer2.extractor.C2655k;
import com.google.android.exoplayer2.p102c.C2500k;
import com.google.android.exoplayer2.p102c.C2511s;

/* renamed from: com.google.android.exoplayer2.extractor.b.c */
final class C2541c implements C2540a {

    /* renamed from: a */
    private final long[] f8295a;

    /* renamed from: b */
    private final long[] f8296b;

    /* renamed from: c */
    private final long f8297c;

    private C2541c(long[] jArr, long[] jArr2, long j) {
        this.f8295a = jArr;
        this.f8296b = jArr2;
        this.f8297c = j;
    }

    /* renamed from: a */
    public static C2541c m11979a(C2655k kVar, C2500k kVar2, long j, long j2) {
        int i;
        C2655k kVar3 = kVar;
        C2500k kVar4 = kVar2;
        long j3 = j2;
        kVar4.mo8829d(10);
        int n = kVar2.mo8841n();
        C2541c cVar = null;
        if (n <= 0) {
            return null;
        }
        int i2 = kVar3.f9021d;
        long b = C2511s.m11814b((long) n, 1000000 * ((long) (i2 >= 32000 ? 1152 : 576)), (long) i2);
        int h = kVar2.mo8835h();
        int h2 = kVar2.mo8835h();
        int h3 = kVar2.mo8835h();
        kVar4.mo8829d(2);
        long j4 = j + ((long) kVar3.f9020c);
        int i3 = h + 1;
        long[] jArr = new long[i3];
        long[] jArr2 = new long[i3];
        jArr[0] = 0;
        jArr2[0] = j4;
        int i4 = 1;
        while (i4 < jArr.length) {
            switch (h3) {
                case 1:
                    i = kVar2.mo8834g();
                    break;
                case 2:
                    i = kVar2.mo8835h();
                    break;
                case 3:
                    i = kVar2.mo8838k();
                    break;
                case 4:
                    i = kVar2.mo8847t();
                    break;
                default:
                    return cVar;
            }
            j4 += (long) (i * h2);
            long j5 = b;
            jArr[i4] = (((long) i4) * b) / ((long) h);
            jArr2[i4] = j3 == -1 ? j4 : Math.min(j3, j4);
            i4++;
            b = j5;
            cVar = null;
        }
        return new C2541c(jArr, jArr2, b);
    }

    /* renamed from: a */
    public long mo8977a(long j) {
        return this.f8295a[C2511s.m11800a(this.f8296b, j, true, true)];
    }

    /* renamed from: a */
    public boolean mo8930a() {
        return true;
    }

    /* renamed from: b */
    public long mo8931b() {
        return this.f8297c;
    }

    /* renamed from: b */
    public long mo8932b(long j) {
        return this.f8296b[C2511s.m11800a(this.f8295a, j, true, true)];
    }
}
