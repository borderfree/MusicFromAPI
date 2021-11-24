package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.cr */
public final class C4306cr extends C4478ir<C4306cr> {

    /* renamed from: e */
    private static volatile C4306cr[] f15915e;

    /* renamed from: a */
    public Integer f15916a;

    /* renamed from: b */
    public C4312cx f15917b;

    /* renamed from: c */
    public C4312cx f15918c;

    /* renamed from: d */
    public Boolean f15919d;

    public C4306cr() {
        this.f15916a = null;
        this.f15917b = null;
        this.f15918c = null;
        this.f15919d = null;
        this.f16310L = null;
        this.f16326M = -1;
    }

    /* renamed from: a */
    public static C4306cr[] m21194a() {
        if (f15915e == null) {
            synchronized (C4482iv.f16324b) {
                if (f15915e == null) {
                    f15915e = new C4306cr[0];
                }
            }
        }
        return f15915e;
    }

    /* renamed from: a */
    public final /* synthetic */ C4483iw mo14223a(C4475io ioVar) {
        C4312cx cxVar;
        while (true) {
            int a = ioVar.mo14707a();
            if (a == 0) {
                return this;
            }
            if (a != 8) {
                if (a == 18) {
                    if (this.f15917b == null) {
                        this.f15917b = new C4312cx();
                    }
                    cxVar = this.f15917b;
                } else if (a == 26) {
                    if (this.f15918c == null) {
                        this.f15918c = new C4312cx();
                    }
                    cxVar = this.f15918c;
                } else if (a == 32) {
                    this.f15919d = Boolean.valueOf(ioVar.mo14714b());
                } else if (!super.mo14761a(ioVar, a)) {
                    return this;
                }
                ioVar.mo14710a((C4483iw) cxVar);
            } else {
                this.f15916a = Integer.valueOf(ioVar.mo14718d());
            }
        }
    }

    /* renamed from: a */
    public final void mo14224a(C4477iq iqVar) {
        if (this.f15916a != null) {
            iqVar.mo14750a(1, this.f15916a.intValue());
        }
        if (this.f15917b != null) {
            iqVar.mo14753a(2, (C4483iw) this.f15917b);
        }
        if (this.f15918c != null) {
            iqVar.mo14753a(3, (C4483iw) this.f15918c);
        }
        if (this.f15919d != null) {
            iqVar.mo14755a(4, this.f15919d.booleanValue());
        }
        super.mo14224a(iqVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo14225b() {
        int b = super.mo14225b();
        if (this.f15916a != null) {
            b += C4477iq.m22223b(1, this.f15916a.intValue());
        }
        if (this.f15917b != null) {
            b += C4477iq.m22224b(2, (C4483iw) this.f15917b);
        }
        if (this.f15918c != null) {
            b += C4477iq.m22224b(3, (C4483iw) this.f15918c);
        }
        if (this.f15919d == null) {
            return b;
        }
        this.f15919d.booleanValue();
        return b + C4477iq.m22222b(4) + 1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4306cr)) {
            return false;
        }
        C4306cr crVar = (C4306cr) obj;
        if (this.f15916a == null) {
            if (crVar.f15916a != null) {
                return false;
            }
        } else if (!this.f15916a.equals(crVar.f15916a)) {
            return false;
        }
        if (this.f15917b == null) {
            if (crVar.f15917b != null) {
                return false;
            }
        } else if (!this.f15917b.equals(crVar.f15917b)) {
            return false;
        }
        if (this.f15918c == null) {
            if (crVar.f15918c != null) {
                return false;
            }
        } else if (!this.f15918c.equals(crVar.f15918c)) {
            return false;
        }
        if (this.f15919d == null) {
            if (crVar.f15919d != null) {
                return false;
            }
        } else if (!this.f15919d.equals(crVar.f15919d)) {
            return false;
        }
        return (this.f16310L == null || this.f16310L.mo14773b()) ? crVar.f16310L == null || crVar.f16310L.mo14773b() : this.f16310L.equals(crVar.f16310L);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((getClass().getName().hashCode() + 527) * 31) + (this.f15916a == null ? 0 : this.f15916a.hashCode());
        C4312cx cxVar = this.f15917b;
        int hashCode2 = (hashCode * 31) + (cxVar == null ? 0 : cxVar.hashCode());
        C4312cx cxVar2 = this.f15918c;
        int hashCode3 = ((((hashCode2 * 31) + (cxVar2 == null ? 0 : cxVar2.hashCode())) * 31) + (this.f15919d == null ? 0 : this.f15919d.hashCode())) * 31;
        if (this.f16310L != null && !this.f16310L.mo14773b()) {
            i = this.f16310L.hashCode();
        }
        return hashCode3 + i;
    }
}
