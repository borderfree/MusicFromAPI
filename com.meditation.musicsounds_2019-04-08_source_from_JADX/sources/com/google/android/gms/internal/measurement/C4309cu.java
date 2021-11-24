package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.cu */
public final class C4309cu extends C4478ir<C4309cu> {

    /* renamed from: e */
    private static volatile C4309cu[] f15929e;

    /* renamed from: a */
    public String f15930a;

    /* renamed from: b */
    public String f15931b;

    /* renamed from: c */
    public Long f15932c;

    /* renamed from: d */
    public Double f15933d;

    /* renamed from: f */
    private Float f15934f;

    public C4309cu() {
        this.f15930a = null;
        this.f15931b = null;
        this.f15932c = null;
        this.f15934f = null;
        this.f15933d = null;
        this.f16310L = null;
        this.f16326M = -1;
    }

    /* renamed from: a */
    public static C4309cu[] m21206a() {
        if (f15929e == null) {
            synchronized (C4482iv.f16324b) {
                if (f15929e == null) {
                    f15929e = new C4309cu[0];
                }
            }
        }
        return f15929e;
    }

    /* renamed from: a */
    public final /* synthetic */ C4483iw mo14223a(C4475io ioVar) {
        while (true) {
            int a = ioVar.mo14707a();
            if (a == 0) {
                return this;
            }
            if (a == 10) {
                this.f15930a = ioVar.mo14717c();
            } else if (a == 18) {
                this.f15931b = ioVar.mo14717c();
            } else if (a == 24) {
                this.f15932c = Long.valueOf(ioVar.mo14720e());
            } else if (a == 37) {
                this.f15934f = Float.valueOf(Float.intBitsToFloat(ioVar.mo14722f()));
            } else if (a == 41) {
                this.f15933d = Double.valueOf(Double.longBitsToDouble(ioVar.mo14723g()));
            } else if (!super.mo14761a(ioVar, a)) {
                return this;
            }
        }
    }

    /* renamed from: a */
    public final void mo14224a(C4477iq iqVar) {
        if (this.f15930a != null) {
            iqVar.mo14754a(1, this.f15930a);
        }
        if (this.f15931b != null) {
            iqVar.mo14754a(2, this.f15931b);
        }
        if (this.f15932c != null) {
            iqVar.mo14757b(3, this.f15932c.longValue());
        }
        if (this.f15934f != null) {
            iqVar.mo14749a(4, this.f15934f.floatValue());
        }
        if (this.f15933d != null) {
            iqVar.mo14748a(5, this.f15933d.doubleValue());
        }
        super.mo14224a(iqVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo14225b() {
        int b = super.mo14225b();
        if (this.f15930a != null) {
            b += C4477iq.m22225b(1, this.f15930a);
        }
        if (this.f15931b != null) {
            b += C4477iq.m22225b(2, this.f15931b);
        }
        if (this.f15932c != null) {
            b += C4477iq.m22228c(3, this.f15932c.longValue());
        }
        if (this.f15934f != null) {
            this.f15934f.floatValue();
            b += C4477iq.m22222b(4) + 4;
        }
        if (this.f15933d == null) {
            return b;
        }
        this.f15933d.doubleValue();
        return b + C4477iq.m22222b(5) + 8;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4309cu)) {
            return false;
        }
        C4309cu cuVar = (C4309cu) obj;
        if (this.f15930a == null) {
            if (cuVar.f15930a != null) {
                return false;
            }
        } else if (!this.f15930a.equals(cuVar.f15930a)) {
            return false;
        }
        if (this.f15931b == null) {
            if (cuVar.f15931b != null) {
                return false;
            }
        } else if (!this.f15931b.equals(cuVar.f15931b)) {
            return false;
        }
        if (this.f15932c == null) {
            if (cuVar.f15932c != null) {
                return false;
            }
        } else if (!this.f15932c.equals(cuVar.f15932c)) {
            return false;
        }
        if (this.f15934f == null) {
            if (cuVar.f15934f != null) {
                return false;
            }
        } else if (!this.f15934f.equals(cuVar.f15934f)) {
            return false;
        }
        if (this.f15933d == null) {
            if (cuVar.f15933d != null) {
                return false;
            }
        } else if (!this.f15933d.equals(cuVar.f15933d)) {
            return false;
        }
        return (this.f16310L == null || this.f16310L.mo14773b()) ? cuVar.f16310L == null || cuVar.f16310L.mo14773b() : this.f16310L.equals(cuVar.f16310L);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((((((((((getClass().getName().hashCode() + 527) * 31) + (this.f15930a == null ? 0 : this.f15930a.hashCode())) * 31) + (this.f15931b == null ? 0 : this.f15931b.hashCode())) * 31) + (this.f15932c == null ? 0 : this.f15932c.hashCode())) * 31) + (this.f15934f == null ? 0 : this.f15934f.hashCode())) * 31) + (this.f15933d == null ? 0 : this.f15933d.hashCode())) * 31;
        if (this.f16310L != null && !this.f16310L.mo14773b()) {
            i = this.f16310L.hashCode();
        }
        return hashCode + i;
    }
}
