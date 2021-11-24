package com.google.android.exoplayer2.extractor.p106d;

import com.google.android.exoplayer2.extractor.C2650g;
import com.google.android.exoplayer2.p102c.C2488a;
import com.google.android.exoplayer2.p102c.C2500k;
import java.util.Arrays;

/* renamed from: com.google.android.exoplayer2.extractor.d.d */
final class C2584d {

    /* renamed from: a */
    private final C2585e f8643a = new C2585e();

    /* renamed from: b */
    private final C2500k f8644b = new C2500k(new byte[65025], 0);

    /* renamed from: c */
    private int f8645c = -1;

    /* renamed from: d */
    private int f8646d;

    /* renamed from: e */
    private boolean f8647e;

    C2584d() {
    }

    /* renamed from: a */
    private int m12196a(int i) {
        int i2 = 0;
        this.f8646d = 0;
        while (this.f8646d + i < this.f8643a.f8655g) {
            int[] iArr = this.f8643a.f8658j;
            int i3 = this.f8646d;
            this.f8646d = i3 + 1;
            int i4 = iArr[i3 + i];
            i2 += i4;
            if (i4 != 255) {
                break;
            }
        }
        return i2;
    }

    /* renamed from: a */
    public void mo9042a() {
        this.f8643a.mo9047a();
        this.f8644b.mo8819a();
        this.f8645c = -1;
        this.f8647e = false;
    }

    /* renamed from: a */
    public boolean mo9043a(C2650g gVar) {
        int i;
        C2488a.m11668b(gVar != null);
        if (this.f8647e) {
            this.f8647e = false;
            this.f8644b.mo8819a();
        }
        while (!this.f8647e) {
            if (this.f8645c < 0) {
                if (!this.f8643a.mo9048a(gVar, true)) {
                    return false;
                }
                int i2 = this.f8643a.f8656h;
                if ((this.f8643a.f8650b & 1) == 1 && this.f8644b.mo8826c() == 0) {
                    i2 += m12196a(0);
                    i = this.f8646d + 0;
                } else {
                    i = 0;
                }
                gVar.mo8969b(i2);
                this.f8645c = i;
            }
            int a = m12196a(this.f8645c);
            int i3 = this.f8645c + this.f8646d;
            if (a > 0) {
                if (this.f8644b.mo8830e() < this.f8644b.mo8826c() + a) {
                    this.f8644b.f8094a = Arrays.copyOf(this.f8644b.f8094a, this.f8644b.mo8826c() + a);
                }
                gVar.mo8970b(this.f8644b.f8094a, this.f8644b.mo8826c(), a);
                this.f8644b.mo8825b(this.f8644b.mo8826c() + a);
                this.f8647e = this.f8643a.f8658j[i3 + -1] != 255;
            }
            if (i3 == this.f8643a.f8655g) {
                i3 = -1;
            }
            this.f8645c = i3;
        }
        return true;
    }

    /* renamed from: b */
    public C2585e mo9044b() {
        return this.f8643a;
    }

    /* renamed from: c */
    public C2500k mo9045c() {
        return this.f8644b;
    }

    /* renamed from: d */
    public void mo9046d() {
        if (this.f8644b.f8094a.length != 65025) {
            this.f8644b.f8094a = Arrays.copyOf(this.f8644b.f8094a, Math.max(65025, this.f8644b.mo8826c()));
        }
    }
}
