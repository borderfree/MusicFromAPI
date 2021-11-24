package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.cx */
public final class C4312cx extends C4478ir<C4312cx> {

    /* renamed from: a */
    public long[] f15978a;

    /* renamed from: b */
    public long[] f15979b;

    /* renamed from: c */
    public C4307cs[] f15980c;

    /* renamed from: d */
    public C4313cy[] f15981d;

    public C4312cx() {
        this.f15978a = C4486iz.f16330b;
        this.f15979b = C4486iz.f16330b;
        this.f15980c = C4307cs.m21198a();
        this.f15981d = C4313cy.m21220a();
        this.f16310L = null;
        this.f16326M = -1;
    }

    /* renamed from: a */
    public final /* synthetic */ C4483iw mo14223a(C4475io ioVar) {
        int i;
        while (true) {
            int a = ioVar.mo14707a();
            if (a == 0) {
                return this;
            }
            if (a != 8) {
                if (a == 10) {
                    i = ioVar.mo14716c(ioVar.mo14718d());
                    int i2 = ioVar.mo14725i();
                    int i3 = 0;
                    while (ioVar.mo14724h() > 0) {
                        ioVar.mo14720e();
                        i3++;
                    }
                    ioVar.mo14721e(i2);
                    int length = this.f15978a == null ? 0 : this.f15978a.length;
                    long[] jArr = new long[(i3 + length)];
                    if (length != 0) {
                        System.arraycopy(this.f15978a, 0, jArr, 0, length);
                    }
                    while (length < jArr.length) {
                        jArr[length] = ioVar.mo14720e();
                        length++;
                    }
                    this.f15978a = jArr;
                } else if (a == 16) {
                    int a2 = C4486iz.m22281a(ioVar, 16);
                    int length2 = this.f15979b == null ? 0 : this.f15979b.length;
                    long[] jArr2 = new long[(a2 + length2)];
                    if (length2 != 0) {
                        System.arraycopy(this.f15979b, 0, jArr2, 0, length2);
                    }
                    while (length2 < jArr2.length - 1) {
                        jArr2[length2] = ioVar.mo14720e();
                        ioVar.mo14707a();
                        length2++;
                    }
                    jArr2[length2] = ioVar.mo14720e();
                    this.f15979b = jArr2;
                } else if (a == 18) {
                    i = ioVar.mo14716c(ioVar.mo14718d());
                    int i4 = ioVar.mo14725i();
                    int i5 = 0;
                    while (ioVar.mo14724h() > 0) {
                        ioVar.mo14720e();
                        i5++;
                    }
                    ioVar.mo14721e(i4);
                    int length3 = this.f15979b == null ? 0 : this.f15979b.length;
                    long[] jArr3 = new long[(i5 + length3)];
                    if (length3 != 0) {
                        System.arraycopy(this.f15979b, 0, jArr3, 0, length3);
                    }
                    while (length3 < jArr3.length) {
                        jArr3[length3] = ioVar.mo14720e();
                        length3++;
                    }
                    this.f15979b = jArr3;
                } else if (a == 26) {
                    int a3 = C4486iz.m22281a(ioVar, 26);
                    int length4 = this.f15980c == null ? 0 : this.f15980c.length;
                    C4307cs[] csVarArr = new C4307cs[(a3 + length4)];
                    if (length4 != 0) {
                        System.arraycopy(this.f15980c, 0, csVarArr, 0, length4);
                    }
                    while (length4 < csVarArr.length - 1) {
                        csVarArr[length4] = new C4307cs();
                        ioVar.mo14710a((C4483iw) csVarArr[length4]);
                        ioVar.mo14707a();
                        length4++;
                    }
                    csVarArr[length4] = new C4307cs();
                    ioVar.mo14710a((C4483iw) csVarArr[length4]);
                    this.f15980c = csVarArr;
                } else if (a == 34) {
                    int a4 = C4486iz.m22281a(ioVar, 34);
                    int length5 = this.f15981d == null ? 0 : this.f15981d.length;
                    C4313cy[] cyVarArr = new C4313cy[(a4 + length5)];
                    if (length5 != 0) {
                        System.arraycopy(this.f15981d, 0, cyVarArr, 0, length5);
                    }
                    while (length5 < cyVarArr.length - 1) {
                        cyVarArr[length5] = new C4313cy();
                        ioVar.mo14710a((C4483iw) cyVarArr[length5]);
                        ioVar.mo14707a();
                        length5++;
                    }
                    cyVarArr[length5] = new C4313cy();
                    ioVar.mo14710a((C4483iw) cyVarArr[length5]);
                    this.f15981d = cyVarArr;
                } else if (!super.mo14761a(ioVar, a)) {
                    return this;
                }
                ioVar.mo14719d(i);
            } else {
                int a5 = C4486iz.m22281a(ioVar, 8);
                int length6 = this.f15978a == null ? 0 : this.f15978a.length;
                long[] jArr4 = new long[(a5 + length6)];
                if (length6 != 0) {
                    System.arraycopy(this.f15978a, 0, jArr4, 0, length6);
                }
                while (length6 < jArr4.length - 1) {
                    jArr4[length6] = ioVar.mo14720e();
                    ioVar.mo14707a();
                    length6++;
                }
                jArr4[length6] = ioVar.mo14720e();
                this.f15978a = jArr4;
            }
        }
    }

    /* renamed from: a */
    public final void mo14224a(C4477iq iqVar) {
        if (this.f15978a != null && this.f15978a.length > 0) {
            for (long a : this.f15978a) {
                iqVar.mo14751a(1, a);
            }
        }
        if (this.f15979b != null && this.f15979b.length > 0) {
            for (long a2 : this.f15979b) {
                iqVar.mo14751a(2, a2);
            }
        }
        if (this.f15980c != null && this.f15980c.length > 0) {
            for (C4307cs csVar : this.f15980c) {
                if (csVar != null) {
                    iqVar.mo14753a(3, (C4483iw) csVar);
                }
            }
        }
        if (this.f15981d != null && this.f15981d.length > 0) {
            for (C4313cy cyVar : this.f15981d) {
                if (cyVar != null) {
                    iqVar.mo14753a(4, (C4483iw) cyVar);
                }
            }
        }
        super.mo14224a(iqVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo14225b() {
        int b = super.mo14225b();
        if (this.f15978a != null && this.f15978a.length > 0) {
            int i = 0;
            for (long a : this.f15978a) {
                i += C4477iq.m22216a(a);
            }
            b = b + i + (this.f15978a.length * 1);
        }
        if (this.f15979b != null && this.f15979b.length > 0) {
            int i2 = 0;
            for (long a2 : this.f15979b) {
                i2 += C4477iq.m22216a(a2);
            }
            b = b + i2 + (this.f15979b.length * 1);
        }
        if (this.f15980c != null && this.f15980c.length > 0) {
            int i3 = b;
            for (C4307cs csVar : this.f15980c) {
                if (csVar != null) {
                    i3 += C4477iq.m22224b(3, (C4483iw) csVar);
                }
            }
            b = i3;
        }
        if (this.f15981d != null && this.f15981d.length > 0) {
            for (C4313cy cyVar : this.f15981d) {
                if (cyVar != null) {
                    b += C4477iq.m22224b(4, (C4483iw) cyVar);
                }
            }
        }
        return b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4312cx)) {
            return false;
        }
        C4312cx cxVar = (C4312cx) obj;
        if (C4482iv.m22270a(this.f15978a, cxVar.f15978a) && C4482iv.m22270a(this.f15979b, cxVar.f15979b) && C4482iv.m22271a((Object[]) this.f15980c, (Object[]) cxVar.f15980c) && C4482iv.m22271a((Object[]) this.f15981d, (Object[]) cxVar.f15981d)) {
            return (this.f16310L == null || this.f16310L.mo14773b()) ? cxVar.f16310L == null || cxVar.f16310L.mo14773b() : this.f16310L.equals(cxVar.f16310L);
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((getClass().getName().hashCode() + 527) * 31) + C4482iv.m22266a(this.f15978a)) * 31) + C4482iv.m22266a(this.f15979b)) * 31) + C4482iv.m22267a((Object[]) this.f15980c)) * 31) + C4482iv.m22267a((Object[]) this.f15981d)) * 31) + ((this.f16310L == null || this.f16310L.mo14773b()) ? 0 : this.f16310L.hashCode());
    }
}
