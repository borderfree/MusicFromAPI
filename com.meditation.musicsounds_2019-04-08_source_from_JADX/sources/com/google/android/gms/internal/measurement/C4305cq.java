package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.cq */
public final class C4305cq extends C4478ir<C4305cq> {

    /* renamed from: c */
    private static volatile C4305cq[] f15912c;

    /* renamed from: a */
    public String f15913a;

    /* renamed from: b */
    public String f15914b;

    public C4305cq() {
        this.f15913a = null;
        this.f15914b = null;
        this.f16310L = null;
        this.f16326M = -1;
    }

    /* renamed from: a */
    public static C4305cq[] m21190a() {
        if (f15912c == null) {
            synchronized (C4482iv.f16324b) {
                if (f15912c == null) {
                    f15912c = new C4305cq[0];
                }
            }
        }
        return f15912c;
    }

    /* renamed from: a */
    public final /* synthetic */ C4483iw mo14223a(C4475io ioVar) {
        while (true) {
            int a = ioVar.mo14707a();
            if (a == 0) {
                return this;
            }
            if (a == 10) {
                this.f15913a = ioVar.mo14717c();
            } else if (a == 18) {
                this.f15914b = ioVar.mo14717c();
            } else if (!super.mo14761a(ioVar, a)) {
                return this;
            }
        }
    }

    /* renamed from: a */
    public final void mo14224a(C4477iq iqVar) {
        if (this.f15913a != null) {
            iqVar.mo14754a(1, this.f15913a);
        }
        if (this.f15914b != null) {
            iqVar.mo14754a(2, this.f15914b);
        }
        super.mo14224a(iqVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo14225b() {
        int b = super.mo14225b();
        if (this.f15913a != null) {
            b += C4477iq.m22225b(1, this.f15913a);
        }
        return this.f15914b != null ? b + C4477iq.m22225b(2, this.f15914b) : b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4305cq)) {
            return false;
        }
        C4305cq cqVar = (C4305cq) obj;
        if (this.f15913a == null) {
            if (cqVar.f15913a != null) {
                return false;
            }
        } else if (!this.f15913a.equals(cqVar.f15913a)) {
            return false;
        }
        if (this.f15914b == null) {
            if (cqVar.f15914b != null) {
                return false;
            }
        } else if (!this.f15914b.equals(cqVar.f15914b)) {
            return false;
        }
        return (this.f16310L == null || this.f16310L.mo14773b()) ? cqVar.f16310L == null || cqVar.f16310L.mo14773b() : this.f16310L.equals(cqVar.f16310L);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((((getClass().getName().hashCode() + 527) * 31) + (this.f15913a == null ? 0 : this.f15913a.hashCode())) * 31) + (this.f15914b == null ? 0 : this.f15914b.hashCode())) * 31;
        if (this.f16310L != null && !this.f16310L.mo14773b()) {
            i = this.f16310L.hashCode();
        }
        return hashCode + i;
    }
}
