package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.co */
public final class C4303co extends C4478ir<C4303co> {

    /* renamed from: e */
    private static volatile C4303co[] f15899e;

    /* renamed from: a */
    public String f15900a;

    /* renamed from: b */
    public Boolean f15901b;

    /* renamed from: c */
    public Boolean f15902c;

    /* renamed from: d */
    public Integer f15903d;

    public C4303co() {
        this.f15900a = null;
        this.f15901b = null;
        this.f15902c = null;
        this.f15903d = null;
        this.f16310L = null;
        this.f16326M = -1;
    }

    /* renamed from: a */
    public static C4303co[] m21183a() {
        if (f15899e == null) {
            synchronized (C4482iv.f16324b) {
                if (f15899e == null) {
                    f15899e = new C4303co[0];
                }
            }
        }
        return f15899e;
    }

    /* renamed from: a */
    public final /* synthetic */ C4483iw mo14223a(C4475io ioVar) {
        while (true) {
            int a = ioVar.mo14707a();
            if (a == 0) {
                return this;
            }
            if (a == 10) {
                this.f15900a = ioVar.mo14717c();
            } else if (a == 16) {
                this.f15901b = Boolean.valueOf(ioVar.mo14714b());
            } else if (a == 24) {
                this.f15902c = Boolean.valueOf(ioVar.mo14714b());
            } else if (a == 32) {
                this.f15903d = Integer.valueOf(ioVar.mo14718d());
            } else if (!super.mo14761a(ioVar, a)) {
                return this;
            }
        }
    }

    /* renamed from: a */
    public final void mo14224a(C4477iq iqVar) {
        if (this.f15900a != null) {
            iqVar.mo14754a(1, this.f15900a);
        }
        if (this.f15901b != null) {
            iqVar.mo14755a(2, this.f15901b.booleanValue());
        }
        if (this.f15902c != null) {
            iqVar.mo14755a(3, this.f15902c.booleanValue());
        }
        if (this.f15903d != null) {
            iqVar.mo14750a(4, this.f15903d.intValue());
        }
        super.mo14224a(iqVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo14225b() {
        int b = super.mo14225b();
        if (this.f15900a != null) {
            b += C4477iq.m22225b(1, this.f15900a);
        }
        if (this.f15901b != null) {
            this.f15901b.booleanValue();
            b += C4477iq.m22222b(2) + 1;
        }
        if (this.f15902c != null) {
            this.f15902c.booleanValue();
            b += C4477iq.m22222b(3) + 1;
        }
        return this.f15903d != null ? b + C4477iq.m22223b(4, this.f15903d.intValue()) : b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4303co)) {
            return false;
        }
        C4303co coVar = (C4303co) obj;
        if (this.f15900a == null) {
            if (coVar.f15900a != null) {
                return false;
            }
        } else if (!this.f15900a.equals(coVar.f15900a)) {
            return false;
        }
        if (this.f15901b == null) {
            if (coVar.f15901b != null) {
                return false;
            }
        } else if (!this.f15901b.equals(coVar.f15901b)) {
            return false;
        }
        if (this.f15902c == null) {
            if (coVar.f15902c != null) {
                return false;
            }
        } else if (!this.f15902c.equals(coVar.f15902c)) {
            return false;
        }
        if (this.f15903d == null) {
            if (coVar.f15903d != null) {
                return false;
            }
        } else if (!this.f15903d.equals(coVar.f15903d)) {
            return false;
        }
        return (this.f16310L == null || this.f16310L.mo14773b()) ? coVar.f16310L == null || coVar.f16310L.mo14773b() : this.f16310L.equals(coVar.f16310L);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((((((((getClass().getName().hashCode() + 527) * 31) + (this.f15900a == null ? 0 : this.f15900a.hashCode())) * 31) + (this.f15901b == null ? 0 : this.f15901b.hashCode())) * 31) + (this.f15902c == null ? 0 : this.f15902c.hashCode())) * 31) + (this.f15903d == null ? 0 : this.f15903d.hashCode())) * 31;
        if (this.f16310L != null && !this.f16310L.mo14773b()) {
            i = this.f16310L.hashCode();
        }
        return hashCode + i;
    }
}
