package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.cm */
public final class C4301cm extends C4478ir<C4301cm> {

    /* renamed from: f */
    private static volatile C4301cm[] f15889f;

    /* renamed from: a */
    public Integer f15890a;

    /* renamed from: b */
    public String f15891b;

    /* renamed from: c */
    public C4299ck f15892c;

    /* renamed from: d */
    public Boolean f15893d;

    /* renamed from: e */
    public Boolean f15894e;

    public C4301cm() {
        this.f15890a = null;
        this.f15891b = null;
        this.f15892c = null;
        this.f15893d = null;
        this.f15894e = null;
        this.f16310L = null;
        this.f16326M = -1;
    }

    /* renamed from: a */
    public static C4301cm[] m21175a() {
        if (f15889f == null) {
            synchronized (C4482iv.f16324b) {
                if (f15889f == null) {
                    f15889f = new C4301cm[0];
                }
            }
        }
        return f15889f;
    }

    /* renamed from: a */
    public final /* synthetic */ C4483iw mo14223a(C4475io ioVar) {
        while (true) {
            int a = ioVar.mo14707a();
            if (a == 0) {
                return this;
            }
            if (a == 8) {
                this.f15890a = Integer.valueOf(ioVar.mo14718d());
            } else if (a == 18) {
                this.f15891b = ioVar.mo14717c();
            } else if (a == 26) {
                if (this.f15892c == null) {
                    this.f15892c = new C4299ck();
                }
                ioVar.mo14710a((C4483iw) this.f15892c);
            } else if (a == 32) {
                this.f15893d = Boolean.valueOf(ioVar.mo14714b());
            } else if (a == 40) {
                this.f15894e = Boolean.valueOf(ioVar.mo14714b());
            } else if (!super.mo14761a(ioVar, a)) {
                return this;
            }
        }
    }

    /* renamed from: a */
    public final void mo14224a(C4477iq iqVar) {
        if (this.f15890a != null) {
            iqVar.mo14750a(1, this.f15890a.intValue());
        }
        if (this.f15891b != null) {
            iqVar.mo14754a(2, this.f15891b);
        }
        if (this.f15892c != null) {
            iqVar.mo14753a(3, (C4483iw) this.f15892c);
        }
        if (this.f15893d != null) {
            iqVar.mo14755a(4, this.f15893d.booleanValue());
        }
        if (this.f15894e != null) {
            iqVar.mo14755a(5, this.f15894e.booleanValue());
        }
        super.mo14224a(iqVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo14225b() {
        int b = super.mo14225b();
        if (this.f15890a != null) {
            b += C4477iq.m22223b(1, this.f15890a.intValue());
        }
        if (this.f15891b != null) {
            b += C4477iq.m22225b(2, this.f15891b);
        }
        if (this.f15892c != null) {
            b += C4477iq.m22224b(3, (C4483iw) this.f15892c);
        }
        if (this.f15893d != null) {
            this.f15893d.booleanValue();
            b += C4477iq.m22222b(4) + 1;
        }
        if (this.f15894e == null) {
            return b;
        }
        this.f15894e.booleanValue();
        return b + C4477iq.m22222b(5) + 1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4301cm)) {
            return false;
        }
        C4301cm cmVar = (C4301cm) obj;
        if (this.f15890a == null) {
            if (cmVar.f15890a != null) {
                return false;
            }
        } else if (!this.f15890a.equals(cmVar.f15890a)) {
            return false;
        }
        if (this.f15891b == null) {
            if (cmVar.f15891b != null) {
                return false;
            }
        } else if (!this.f15891b.equals(cmVar.f15891b)) {
            return false;
        }
        if (this.f15892c == null) {
            if (cmVar.f15892c != null) {
                return false;
            }
        } else if (!this.f15892c.equals(cmVar.f15892c)) {
            return false;
        }
        if (this.f15893d == null) {
            if (cmVar.f15893d != null) {
                return false;
            }
        } else if (!this.f15893d.equals(cmVar.f15893d)) {
            return false;
        }
        if (this.f15894e == null) {
            if (cmVar.f15894e != null) {
                return false;
            }
        } else if (!this.f15894e.equals(cmVar.f15894e)) {
            return false;
        }
        return (this.f16310L == null || this.f16310L.mo14773b()) ? cmVar.f16310L == null || cmVar.f16310L.mo14773b() : this.f16310L.equals(cmVar.f16310L);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((((getClass().getName().hashCode() + 527) * 31) + (this.f15890a == null ? 0 : this.f15890a.hashCode())) * 31) + (this.f15891b == null ? 0 : this.f15891b.hashCode());
        C4299ck ckVar = this.f15892c;
        int hashCode2 = ((((((hashCode * 31) + (ckVar == null ? 0 : ckVar.hashCode())) * 31) + (this.f15893d == null ? 0 : this.f15893d.hashCode())) * 31) + (this.f15894e == null ? 0 : this.f15894e.hashCode())) * 31;
        if (this.f16310L != null && !this.f16310L.mo14773b()) {
            i = this.f16310L.hashCode();
        }
        return hashCode2 + i;
    }
}
