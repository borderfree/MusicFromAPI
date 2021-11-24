package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.cn */
public final class C4302cn extends C4478ir<C4302cn> {

    /* renamed from: a */
    public Integer f15895a;

    /* renamed from: b */
    public String f15896b;

    /* renamed from: c */
    public Boolean f15897c;

    /* renamed from: d */
    public String[] f15898d;

    public C4302cn() {
        this.f15895a = null;
        this.f15896b = null;
        this.f15897c = null;
        this.f15898d = C4486iz.f16331c;
        this.f16310L = null;
        this.f16326M = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final C4302cn mo14223a(C4475io ioVar) {
        int d;
        while (true) {
            int a = ioVar.mo14707a();
            if (a == 0) {
                return this;
            }
            if (a == 8) {
                try {
                    d = ioVar.mo14718d();
                    if (d < 0 || d > 6) {
                        StringBuilder sb = new StringBuilder(41);
                        sb.append(d);
                        sb.append(" is not a valid enum MatchType");
                    } else {
                        this.f15895a = Integer.valueOf(d);
                    }
                } catch (IllegalArgumentException unused) {
                    ioVar.mo14721e(ioVar.mo14725i());
                    mo14761a(ioVar, a);
                }
            } else if (a == 18) {
                this.f15896b = ioVar.mo14717c();
            } else if (a == 24) {
                this.f15897c = Boolean.valueOf(ioVar.mo14714b());
            } else if (a == 34) {
                int a2 = C4486iz.m22281a(ioVar, 34);
                int length = this.f15898d == null ? 0 : this.f15898d.length;
                String[] strArr = new String[(a2 + length)];
                if (length != 0) {
                    System.arraycopy(this.f15898d, 0, strArr, 0, length);
                }
                while (length < strArr.length - 1) {
                    strArr[length] = ioVar.mo14717c();
                    ioVar.mo14707a();
                    length++;
                }
                strArr[length] = ioVar.mo14717c();
                this.f15898d = strArr;
            } else if (!super.mo14761a(ioVar, a)) {
                return this;
            }
        }
        StringBuilder sb2 = new StringBuilder(41);
        sb2.append(d);
        sb2.append(" is not a valid enum MatchType");
        throw new IllegalArgumentException(sb2.toString());
    }

    /* renamed from: a */
    public final void mo14224a(C4477iq iqVar) {
        if (this.f15895a != null) {
            iqVar.mo14750a(1, this.f15895a.intValue());
        }
        if (this.f15896b != null) {
            iqVar.mo14754a(2, this.f15896b);
        }
        if (this.f15897c != null) {
            iqVar.mo14755a(3, this.f15897c.booleanValue());
        }
        if (this.f15898d != null && this.f15898d.length > 0) {
            for (String str : this.f15898d) {
                if (str != null) {
                    iqVar.mo14754a(4, str);
                }
            }
        }
        super.mo14224a(iqVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo14225b() {
        int b = super.mo14225b();
        if (this.f15895a != null) {
            b += C4477iq.m22223b(1, this.f15895a.intValue());
        }
        if (this.f15896b != null) {
            b += C4477iq.m22225b(2, this.f15896b);
        }
        if (this.f15897c != null) {
            this.f15897c.booleanValue();
            b += C4477iq.m22222b(3) + 1;
        }
        if (this.f15898d == null || this.f15898d.length <= 0) {
            return b;
        }
        int i = 0;
        int i2 = 0;
        for (String str : this.f15898d) {
            if (str != null) {
                i2++;
                i += C4477iq.m22218a(str);
            }
        }
        return b + i + (i2 * 1);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4302cn)) {
            return false;
        }
        C4302cn cnVar = (C4302cn) obj;
        if (this.f15895a == null) {
            if (cnVar.f15895a != null) {
                return false;
            }
        } else if (!this.f15895a.equals(cnVar.f15895a)) {
            return false;
        }
        if (this.f15896b == null) {
            if (cnVar.f15896b != null) {
                return false;
            }
        } else if (!this.f15896b.equals(cnVar.f15896b)) {
            return false;
        }
        if (this.f15897c == null) {
            if (cnVar.f15897c != null) {
                return false;
            }
        } else if (!this.f15897c.equals(cnVar.f15897c)) {
            return false;
        }
        if (!C4482iv.m22271a((Object[]) this.f15898d, (Object[]) cnVar.f15898d)) {
            return false;
        }
        return (this.f16310L == null || this.f16310L.mo14773b()) ? cnVar.f16310L == null || cnVar.f16310L.mo14773b() : this.f16310L.equals(cnVar.f16310L);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((((((((getClass().getName().hashCode() + 527) * 31) + (this.f15895a == null ? 0 : this.f15895a.intValue())) * 31) + (this.f15896b == null ? 0 : this.f15896b.hashCode())) * 31) + (this.f15897c == null ? 0 : this.f15897c.hashCode())) * 31) + C4482iv.m22267a((Object[]) this.f15898d)) * 31;
        if (this.f16310L != null && !this.f16310L.mo14773b()) {
            i = this.f16310L.hashCode();
        }
        return hashCode + i;
    }
}
