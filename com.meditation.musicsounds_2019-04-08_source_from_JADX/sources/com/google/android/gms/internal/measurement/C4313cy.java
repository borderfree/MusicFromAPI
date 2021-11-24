package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.cy */
public final class C4313cy extends C4478ir<C4313cy> {

    /* renamed from: c */
    private static volatile C4313cy[] f15982c;

    /* renamed from: a */
    public Integer f15983a;

    /* renamed from: b */
    public long[] f15984b;

    public C4313cy() {
        this.f15983a = null;
        this.f15984b = C4486iz.f16330b;
        this.f16310L = null;
        this.f16326M = -1;
    }

    /* renamed from: a */
    public static C4313cy[] m21220a() {
        if (f15982c == null) {
            synchronized (C4482iv.f16324b) {
                if (f15982c == null) {
                    f15982c = new C4313cy[0];
                }
            }
        }
        return f15982c;
    }

    /* renamed from: a */
    public final /* synthetic */ C4483iw mo14223a(C4475io ioVar) {
        while (true) {
            int a = ioVar.mo14707a();
            if (a == 0) {
                return this;
            }
            if (a == 8) {
                this.f15983a = Integer.valueOf(ioVar.mo14718d());
            } else if (a == 16) {
                int a2 = C4486iz.m22281a(ioVar, 16);
                int length = this.f15984b == null ? 0 : this.f15984b.length;
                long[] jArr = new long[(a2 + length)];
                if (length != 0) {
                    System.arraycopy(this.f15984b, 0, jArr, 0, length);
                }
                while (length < jArr.length - 1) {
                    jArr[length] = ioVar.mo14720e();
                    ioVar.mo14707a();
                    length++;
                }
                jArr[length] = ioVar.mo14720e();
                this.f15984b = jArr;
            } else if (a == 18) {
                int c = ioVar.mo14716c(ioVar.mo14718d());
                int i = ioVar.mo14725i();
                int i2 = 0;
                while (ioVar.mo14724h() > 0) {
                    ioVar.mo14720e();
                    i2++;
                }
                ioVar.mo14721e(i);
                int length2 = this.f15984b == null ? 0 : this.f15984b.length;
                long[] jArr2 = new long[(i2 + length2)];
                if (length2 != 0) {
                    System.arraycopy(this.f15984b, 0, jArr2, 0, length2);
                }
                while (length2 < jArr2.length) {
                    jArr2[length2] = ioVar.mo14720e();
                    length2++;
                }
                this.f15984b = jArr2;
                ioVar.mo14719d(c);
            } else if (!super.mo14761a(ioVar, a)) {
                return this;
            }
        }
    }

    /* renamed from: a */
    public final void mo14224a(C4477iq iqVar) {
        if (this.f15983a != null) {
            iqVar.mo14750a(1, this.f15983a.intValue());
        }
        if (this.f15984b != null && this.f15984b.length > 0) {
            for (long b : this.f15984b) {
                iqVar.mo14757b(2, b);
            }
        }
        super.mo14224a(iqVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo14225b() {
        int b = super.mo14225b();
        if (this.f15983a != null) {
            b += C4477iq.m22223b(1, this.f15983a.intValue());
        }
        if (this.f15984b == null || this.f15984b.length <= 0) {
            return b;
        }
        int i = 0;
        for (long a : this.f15984b) {
            i += C4477iq.m22216a(a);
        }
        return b + i + (this.f15984b.length * 1);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4313cy)) {
            return false;
        }
        C4313cy cyVar = (C4313cy) obj;
        if (this.f15983a == null) {
            if (cyVar.f15983a != null) {
                return false;
            }
        } else if (!this.f15983a.equals(cyVar.f15983a)) {
            return false;
        }
        if (!C4482iv.m22270a(this.f15984b, cyVar.f15984b)) {
            return false;
        }
        return (this.f16310L == null || this.f16310L.mo14773b()) ? cyVar.f16310L == null || cyVar.f16310L.mo14773b() : this.f16310L.equals(cyVar.f16310L);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((((getClass().getName().hashCode() + 527) * 31) + (this.f15983a == null ? 0 : this.f15983a.hashCode())) * 31) + C4482iv.m22266a(this.f15984b)) * 31;
        if (this.f16310L != null && !this.f16310L.mo14773b()) {
            i = this.f16310L.hashCode();
        }
        return hashCode + i;
    }
}
