package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.cs */
public final class C4307cs extends C4478ir<C4307cs> {

    /* renamed from: c */
    private static volatile C4307cs[] f15920c;

    /* renamed from: a */
    public Integer f15921a;

    /* renamed from: b */
    public Long f15922b;

    public C4307cs() {
        this.f15921a = null;
        this.f15922b = null;
        this.f16310L = null;
        this.f16326M = -1;
    }

    /* renamed from: a */
    public static C4307cs[] m21198a() {
        if (f15920c == null) {
            synchronized (C4482iv.f16324b) {
                if (f15920c == null) {
                    f15920c = new C4307cs[0];
                }
            }
        }
        return f15920c;
    }

    /* renamed from: a */
    public final /* synthetic */ C4483iw mo14223a(C4475io ioVar) {
        while (true) {
            int a = ioVar.mo14707a();
            if (a == 0) {
                return this;
            }
            if (a == 8) {
                this.f15921a = Integer.valueOf(ioVar.mo14718d());
            } else if (a == 16) {
                this.f15922b = Long.valueOf(ioVar.mo14720e());
            } else if (!super.mo14761a(ioVar, a)) {
                return this;
            }
        }
    }

    /* renamed from: a */
    public final void mo14224a(C4477iq iqVar) {
        if (this.f15921a != null) {
            iqVar.mo14750a(1, this.f15921a.intValue());
        }
        if (this.f15922b != null) {
            iqVar.mo14757b(2, this.f15922b.longValue());
        }
        super.mo14224a(iqVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo14225b() {
        int b = super.mo14225b();
        if (this.f15921a != null) {
            b += C4477iq.m22223b(1, this.f15921a.intValue());
        }
        return this.f15922b != null ? b + C4477iq.m22228c(2, this.f15922b.longValue()) : b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4307cs)) {
            return false;
        }
        C4307cs csVar = (C4307cs) obj;
        if (this.f15921a == null) {
            if (csVar.f15921a != null) {
                return false;
            }
        } else if (!this.f15921a.equals(csVar.f15921a)) {
            return false;
        }
        if (this.f15922b == null) {
            if (csVar.f15922b != null) {
                return false;
            }
        } else if (!this.f15922b.equals(csVar.f15922b)) {
            return false;
        }
        return (this.f16310L == null || this.f16310L.mo14773b()) ? csVar.f16310L == null || csVar.f16310L.mo14773b() : this.f16310L.equals(csVar.f16310L);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((((getClass().getName().hashCode() + 527) * 31) + (this.f15921a == null ? 0 : this.f15921a.hashCode())) * 31) + (this.f15922b == null ? 0 : this.f15922b.hashCode())) * 31;
        if (this.f16310L != null && !this.f16310L.mo14773b()) {
            i = this.f16310L.hashCode();
        }
        return hashCode + i;
    }
}
