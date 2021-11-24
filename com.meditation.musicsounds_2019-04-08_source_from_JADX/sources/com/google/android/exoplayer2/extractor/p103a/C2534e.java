package com.google.android.exoplayer2.extractor.p103a;

import com.google.android.exoplayer2.extractor.C2650g;
import com.google.android.exoplayer2.p102c.C2500k;

/* renamed from: com.google.android.exoplayer2.extractor.a.e */
final class C2534e {

    /* renamed from: a */
    private final C2500k f8262a = new C2500k(8);

    /* renamed from: b */
    private int f8263b;

    /* renamed from: b */
    private long m11934b(C2650g gVar) {
        int i = 0;
        gVar.mo8975c(this.f8262a.f8094a, 0, 1);
        byte b = this.f8262a.f8094a[0] & 255;
        if (b == 0) {
            return Long.MIN_VALUE;
        }
        int i2 = 128;
        int i3 = 0;
        while ((b & i2) == 0) {
            i2 >>= 1;
            i3++;
        }
        int i4 = b & (i2 ^ -1);
        gVar.mo8975c(this.f8262a.f8094a, 1, i3);
        while (i < i3) {
            i++;
            i4 = (this.f8262a.f8094a[i] & 255) + (i4 << 8);
        }
        this.f8263b += i3 + 1;
        return (long) i4;
    }

    /* renamed from: a */
    public boolean mo8959a(C2650g gVar) {
        C2650g gVar2 = gVar;
        long d = gVar.mo8976d();
        long j = 1024;
        if (d != -1 && d <= 1024) {
            j = d;
        }
        int i = (int) j;
        gVar2.mo8975c(this.f8262a.f8094a, 0, 4);
        long l = this.f8262a.mo8839l();
        this.f8263b = 4;
        while (true) {
            boolean z = true;
            if (l != 440786851) {
                int i2 = this.f8263b + 1;
                this.f8263b = i2;
                if (i2 == i) {
                    return false;
                }
                gVar2.mo8975c(this.f8262a.f8094a, 0, 1);
                l = ((l << 8) & -256) | ((long) (this.f8262a.f8094a[0] & 255));
            } else {
                long b = m11934b(gVar);
                long j2 = (long) this.f8263b;
                if (b == Long.MIN_VALUE || (d != -1 && j2 + b >= d)) {
                    return false;
                }
                while (true) {
                    long j3 = j2 + b;
                    if (((long) this.f8263b) >= j3) {
                        if (((long) this.f8263b) != j3) {
                            z = false;
                        }
                        return z;
                    } else if (m11934b(gVar) == Long.MIN_VALUE) {
                        return false;
                    } else {
                        long b2 = m11934b(gVar);
                        if (b2 < 0 || b2 > 2147483647L) {
                            return false;
                        }
                        if (b2 != 0) {
                            gVar2.mo8974c((int) b2);
                            this.f8263b = (int) (((long) this.f8263b) + b2);
                        }
                    }
                }
                return false;
            }
        }
    }
}
