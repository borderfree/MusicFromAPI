package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.cl */
public final class C4300cl extends C4478ir<C4300cl> {

    /* renamed from: a */
    public Integer f15884a;

    /* renamed from: b */
    public Boolean f15885b;

    /* renamed from: c */
    public String f15886c;

    /* renamed from: d */
    public String f15887d;

    /* renamed from: e */
    public String f15888e;

    public C4300cl() {
        this.f15884a = null;
        this.f15885b = null;
        this.f15886c = null;
        this.f15887d = null;
        this.f15888e = null;
        this.f16310L = null;
        this.f16326M = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final C4300cl mo14223a(C4475io ioVar) {
        int d;
        while (true) {
            int a = ioVar.mo14707a();
            if (a == 0) {
                return this;
            }
            if (a == 8) {
                try {
                    d = ioVar.mo14718d();
                    if (d < 0 || d > 4) {
                        StringBuilder sb = new StringBuilder(46);
                        sb.append(d);
                        sb.append(" is not a valid enum ComparisonType");
                    } else {
                        this.f15884a = Integer.valueOf(d);
                    }
                } catch (IllegalArgumentException unused) {
                    ioVar.mo14721e(ioVar.mo14725i());
                    mo14761a(ioVar, a);
                }
            } else if (a == 16) {
                this.f15885b = Boolean.valueOf(ioVar.mo14714b());
            } else if (a == 26) {
                this.f15886c = ioVar.mo14717c();
            } else if (a == 34) {
                this.f15887d = ioVar.mo14717c();
            } else if (a == 42) {
                this.f15888e = ioVar.mo14717c();
            } else if (!super.mo14761a(ioVar, a)) {
                return this;
            }
        }
        StringBuilder sb2 = new StringBuilder(46);
        sb2.append(d);
        sb2.append(" is not a valid enum ComparisonType");
        throw new IllegalArgumentException(sb2.toString());
    }

    /* renamed from: a */
    public final void mo14224a(C4477iq iqVar) {
        if (this.f15884a != null) {
            iqVar.mo14750a(1, this.f15884a.intValue());
        }
        if (this.f15885b != null) {
            iqVar.mo14755a(2, this.f15885b.booleanValue());
        }
        if (this.f15886c != null) {
            iqVar.mo14754a(3, this.f15886c);
        }
        if (this.f15887d != null) {
            iqVar.mo14754a(4, this.f15887d);
        }
        if (this.f15888e != null) {
            iqVar.mo14754a(5, this.f15888e);
        }
        super.mo14224a(iqVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo14225b() {
        int b = super.mo14225b();
        if (this.f15884a != null) {
            b += C4477iq.m22223b(1, this.f15884a.intValue());
        }
        if (this.f15885b != null) {
            this.f15885b.booleanValue();
            b += C4477iq.m22222b(2) + 1;
        }
        if (this.f15886c != null) {
            b += C4477iq.m22225b(3, this.f15886c);
        }
        if (this.f15887d != null) {
            b += C4477iq.m22225b(4, this.f15887d);
        }
        return this.f15888e != null ? b + C4477iq.m22225b(5, this.f15888e) : b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4300cl)) {
            return false;
        }
        C4300cl clVar = (C4300cl) obj;
        if (this.f15884a == null) {
            if (clVar.f15884a != null) {
                return false;
            }
        } else if (!this.f15884a.equals(clVar.f15884a)) {
            return false;
        }
        if (this.f15885b == null) {
            if (clVar.f15885b != null) {
                return false;
            }
        } else if (!this.f15885b.equals(clVar.f15885b)) {
            return false;
        }
        if (this.f15886c == null) {
            if (clVar.f15886c != null) {
                return false;
            }
        } else if (!this.f15886c.equals(clVar.f15886c)) {
            return false;
        }
        if (this.f15887d == null) {
            if (clVar.f15887d != null) {
                return false;
            }
        } else if (!this.f15887d.equals(clVar.f15887d)) {
            return false;
        }
        if (this.f15888e == null) {
            if (clVar.f15888e != null) {
                return false;
            }
        } else if (!this.f15888e.equals(clVar.f15888e)) {
            return false;
        }
        return (this.f16310L == null || this.f16310L.mo14773b()) ? clVar.f16310L == null || clVar.f16310L.mo14773b() : this.f16310L.equals(clVar.f16310L);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((((((((((getClass().getName().hashCode() + 527) * 31) + (this.f15884a == null ? 0 : this.f15884a.intValue())) * 31) + (this.f15885b == null ? 0 : this.f15885b.hashCode())) * 31) + (this.f15886c == null ? 0 : this.f15886c.hashCode())) * 31) + (this.f15887d == null ? 0 : this.f15887d.hashCode())) * 31) + (this.f15888e == null ? 0 : this.f15888e.hashCode())) * 31;
        if (this.f16310L != null && !this.f16310L.mo14773b()) {
            i = this.f16310L.hashCode();
        }
        return hashCode + i;
    }
}
