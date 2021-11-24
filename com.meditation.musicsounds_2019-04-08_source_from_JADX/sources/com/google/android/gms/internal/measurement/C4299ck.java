package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.ck */
public final class C4299ck extends C4478ir<C4299ck> {

    /* renamed from: e */
    private static volatile C4299ck[] f15879e;

    /* renamed from: a */
    public C4302cn f15880a;

    /* renamed from: b */
    public C4300cl f15881b;

    /* renamed from: c */
    public Boolean f15882c;

    /* renamed from: d */
    public String f15883d;

    public C4299ck() {
        this.f15880a = null;
        this.f15881b = null;
        this.f15882c = null;
        this.f15883d = null;
        this.f16310L = null;
        this.f16326M = -1;
    }

    /* renamed from: a */
    public static C4299ck[] m21167a() {
        if (f15879e == null) {
            synchronized (C4482iv.f16324b) {
                if (f15879e == null) {
                    f15879e = new C4299ck[0];
                }
            }
        }
        return f15879e;
    }

    /* renamed from: a */
    public final /* synthetic */ C4483iw mo14223a(C4475io ioVar) {
        C4483iw iwVar;
        while (true) {
            int a = ioVar.mo14707a();
            if (a == 0) {
                return this;
            }
            if (a == 10) {
                if (this.f15880a == null) {
                    this.f15880a = new C4302cn();
                }
                iwVar = this.f15880a;
            } else if (a == 18) {
                if (this.f15881b == null) {
                    this.f15881b = new C4300cl();
                }
                iwVar = this.f15881b;
            } else if (a == 24) {
                this.f15882c = Boolean.valueOf(ioVar.mo14714b());
            } else if (a == 34) {
                this.f15883d = ioVar.mo14717c();
            } else if (!super.mo14761a(ioVar, a)) {
                return this;
            }
            ioVar.mo14710a(iwVar);
        }
    }

    /* renamed from: a */
    public final void mo14224a(C4477iq iqVar) {
        if (this.f15880a != null) {
            iqVar.mo14753a(1, (C4483iw) this.f15880a);
        }
        if (this.f15881b != null) {
            iqVar.mo14753a(2, (C4483iw) this.f15881b);
        }
        if (this.f15882c != null) {
            iqVar.mo14755a(3, this.f15882c.booleanValue());
        }
        if (this.f15883d != null) {
            iqVar.mo14754a(4, this.f15883d);
        }
        super.mo14224a(iqVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo14225b() {
        int b = super.mo14225b();
        if (this.f15880a != null) {
            b += C4477iq.m22224b(1, (C4483iw) this.f15880a);
        }
        if (this.f15881b != null) {
            b += C4477iq.m22224b(2, (C4483iw) this.f15881b);
        }
        if (this.f15882c != null) {
            this.f15882c.booleanValue();
            b += C4477iq.m22222b(3) + 1;
        }
        return this.f15883d != null ? b + C4477iq.m22225b(4, this.f15883d) : b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4299ck)) {
            return false;
        }
        C4299ck ckVar = (C4299ck) obj;
        if (this.f15880a == null) {
            if (ckVar.f15880a != null) {
                return false;
            }
        } else if (!this.f15880a.equals(ckVar.f15880a)) {
            return false;
        }
        if (this.f15881b == null) {
            if (ckVar.f15881b != null) {
                return false;
            }
        } else if (!this.f15881b.equals(ckVar.f15881b)) {
            return false;
        }
        if (this.f15882c == null) {
            if (ckVar.f15882c != null) {
                return false;
            }
        } else if (!this.f15882c.equals(ckVar.f15882c)) {
            return false;
        }
        if (this.f15883d == null) {
            if (ckVar.f15883d != null) {
                return false;
            }
        } else if (!this.f15883d.equals(ckVar.f15883d)) {
            return false;
        }
        return (this.f16310L == null || this.f16310L.mo14773b()) ? ckVar.f16310L == null || ckVar.f16310L.mo14773b() : this.f16310L.equals(ckVar.f16310L);
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode() + 527;
        C4302cn cnVar = this.f15880a;
        int i = 0;
        int hashCode2 = (hashCode * 31) + (cnVar == null ? 0 : cnVar.hashCode());
        C4300cl clVar = this.f15881b;
        int hashCode3 = ((((((hashCode2 * 31) + (clVar == null ? 0 : clVar.hashCode())) * 31) + (this.f15882c == null ? 0 : this.f15882c.hashCode())) * 31) + (this.f15883d == null ? 0 : this.f15883d.hashCode())) * 31;
        if (this.f16310L != null && !this.f16310L.mo14773b()) {
            i = this.f16310L.hashCode();
        }
        return hashCode3 + i;
    }
}
