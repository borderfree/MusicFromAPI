package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.ct */
public final class C4308ct extends C4478ir<C4308ct> {

    /* renamed from: f */
    private static volatile C4308ct[] f15923f;

    /* renamed from: a */
    public C4309cu[] f15924a;

    /* renamed from: b */
    public String f15925b;

    /* renamed from: c */
    public Long f15926c;

    /* renamed from: d */
    public Long f15927d;

    /* renamed from: e */
    public Integer f15928e;

    public C4308ct() {
        this.f15924a = C4309cu.m21206a();
        this.f15925b = null;
        this.f15926c = null;
        this.f15927d = null;
        this.f15928e = null;
        this.f16310L = null;
        this.f16326M = -1;
    }

    /* renamed from: a */
    public static C4308ct[] m21202a() {
        if (f15923f == null) {
            synchronized (C4482iv.f16324b) {
                if (f15923f == null) {
                    f15923f = new C4308ct[0];
                }
            }
        }
        return f15923f;
    }

    /* renamed from: a */
    public final /* synthetic */ C4483iw mo14223a(C4475io ioVar) {
        while (true) {
            int a = ioVar.mo14707a();
            if (a == 0) {
                return this;
            }
            if (a == 10) {
                int a2 = C4486iz.m22281a(ioVar, 10);
                int length = this.f15924a == null ? 0 : this.f15924a.length;
                C4309cu[] cuVarArr = new C4309cu[(a2 + length)];
                if (length != 0) {
                    System.arraycopy(this.f15924a, 0, cuVarArr, 0, length);
                }
                while (length < cuVarArr.length - 1) {
                    cuVarArr[length] = new C4309cu();
                    ioVar.mo14710a((C4483iw) cuVarArr[length]);
                    ioVar.mo14707a();
                    length++;
                }
                cuVarArr[length] = new C4309cu();
                ioVar.mo14710a((C4483iw) cuVarArr[length]);
                this.f15924a = cuVarArr;
            } else if (a == 18) {
                this.f15925b = ioVar.mo14717c();
            } else if (a == 24) {
                this.f15926c = Long.valueOf(ioVar.mo14720e());
            } else if (a == 32) {
                this.f15927d = Long.valueOf(ioVar.mo14720e());
            } else if (a == 40) {
                this.f15928e = Integer.valueOf(ioVar.mo14718d());
            } else if (!super.mo14761a(ioVar, a)) {
                return this;
            }
        }
    }

    /* renamed from: a */
    public final void mo14224a(C4477iq iqVar) {
        if (this.f15924a != null && this.f15924a.length > 0) {
            for (C4309cu cuVar : this.f15924a) {
                if (cuVar != null) {
                    iqVar.mo14753a(1, (C4483iw) cuVar);
                }
            }
        }
        if (this.f15925b != null) {
            iqVar.mo14754a(2, this.f15925b);
        }
        if (this.f15926c != null) {
            iqVar.mo14757b(3, this.f15926c.longValue());
        }
        if (this.f15927d != null) {
            iqVar.mo14757b(4, this.f15927d.longValue());
        }
        if (this.f15928e != null) {
            iqVar.mo14750a(5, this.f15928e.intValue());
        }
        super.mo14224a(iqVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo14225b() {
        int b = super.mo14225b();
        if (this.f15924a != null && this.f15924a.length > 0) {
            for (C4309cu cuVar : this.f15924a) {
                if (cuVar != null) {
                    b += C4477iq.m22224b(1, (C4483iw) cuVar);
                }
            }
        }
        if (this.f15925b != null) {
            b += C4477iq.m22225b(2, this.f15925b);
        }
        if (this.f15926c != null) {
            b += C4477iq.m22228c(3, this.f15926c.longValue());
        }
        if (this.f15927d != null) {
            b += C4477iq.m22228c(4, this.f15927d.longValue());
        }
        return this.f15928e != null ? b + C4477iq.m22223b(5, this.f15928e.intValue()) : b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4308ct)) {
            return false;
        }
        C4308ct ctVar = (C4308ct) obj;
        if (!C4482iv.m22271a((Object[]) this.f15924a, (Object[]) ctVar.f15924a)) {
            return false;
        }
        if (this.f15925b == null) {
            if (ctVar.f15925b != null) {
                return false;
            }
        } else if (!this.f15925b.equals(ctVar.f15925b)) {
            return false;
        }
        if (this.f15926c == null) {
            if (ctVar.f15926c != null) {
                return false;
            }
        } else if (!this.f15926c.equals(ctVar.f15926c)) {
            return false;
        }
        if (this.f15927d == null) {
            if (ctVar.f15927d != null) {
                return false;
            }
        } else if (!this.f15927d.equals(ctVar.f15927d)) {
            return false;
        }
        if (this.f15928e == null) {
            if (ctVar.f15928e != null) {
                return false;
            }
        } else if (!this.f15928e.equals(ctVar.f15928e)) {
            return false;
        }
        return (this.f16310L == null || this.f16310L.mo14773b()) ? ctVar.f16310L == null || ctVar.f16310L.mo14773b() : this.f16310L.equals(ctVar.f16310L);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((((((((((getClass().getName().hashCode() + 527) * 31) + C4482iv.m22267a((Object[]) this.f15924a)) * 31) + (this.f15925b == null ? 0 : this.f15925b.hashCode())) * 31) + (this.f15926c == null ? 0 : this.f15926c.hashCode())) * 31) + (this.f15927d == null ? 0 : this.f15927d.hashCode())) * 31) + (this.f15928e == null ? 0 : this.f15928e.hashCode())) * 31;
        if (this.f16310L != null && !this.f16310L.mo14773b()) {
            i = this.f16310L.hashCode();
        }
        return hashCode + i;
    }
}
