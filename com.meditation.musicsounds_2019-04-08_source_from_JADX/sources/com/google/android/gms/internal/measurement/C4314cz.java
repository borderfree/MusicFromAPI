package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.cz */
public final class C4314cz extends C4478ir<C4314cz> {

    /* renamed from: f */
    private static volatile C4314cz[] f15985f;

    /* renamed from: a */
    public Long f15986a;

    /* renamed from: b */
    public String f15987b;

    /* renamed from: c */
    public String f15988c;

    /* renamed from: d */
    public Long f15989d;

    /* renamed from: e */
    public Double f15990e;

    /* renamed from: g */
    private Float f15991g;

    public C4314cz() {
        this.f15986a = null;
        this.f15987b = null;
        this.f15988c = null;
        this.f15989d = null;
        this.f15991g = null;
        this.f15990e = null;
        this.f16310L = null;
        this.f16326M = -1;
    }

    /* renamed from: a */
    public static C4314cz[] m21224a() {
        if (f15985f == null) {
            synchronized (C4482iv.f16324b) {
                if (f15985f == null) {
                    f15985f = new C4314cz[0];
                }
            }
        }
        return f15985f;
    }

    /* renamed from: a */
    public final /* synthetic */ C4483iw mo14223a(C4475io ioVar) {
        while (true) {
            int a = ioVar.mo14707a();
            if (a == 0) {
                return this;
            }
            if (a == 8) {
                this.f15986a = Long.valueOf(ioVar.mo14720e());
            } else if (a == 18) {
                this.f15987b = ioVar.mo14717c();
            } else if (a == 26) {
                this.f15988c = ioVar.mo14717c();
            } else if (a == 32) {
                this.f15989d = Long.valueOf(ioVar.mo14720e());
            } else if (a == 45) {
                this.f15991g = Float.valueOf(Float.intBitsToFloat(ioVar.mo14722f()));
            } else if (a == 49) {
                this.f15990e = Double.valueOf(Double.longBitsToDouble(ioVar.mo14723g()));
            } else if (!super.mo14761a(ioVar, a)) {
                return this;
            }
        }
    }

    /* renamed from: a */
    public final void mo14224a(C4477iq iqVar) {
        if (this.f15986a != null) {
            iqVar.mo14757b(1, this.f15986a.longValue());
        }
        if (this.f15987b != null) {
            iqVar.mo14754a(2, this.f15987b);
        }
        if (this.f15988c != null) {
            iqVar.mo14754a(3, this.f15988c);
        }
        if (this.f15989d != null) {
            iqVar.mo14757b(4, this.f15989d.longValue());
        }
        if (this.f15991g != null) {
            iqVar.mo14749a(5, this.f15991g.floatValue());
        }
        if (this.f15990e != null) {
            iqVar.mo14748a(6, this.f15990e.doubleValue());
        }
        super.mo14224a(iqVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo14225b() {
        int b = super.mo14225b();
        if (this.f15986a != null) {
            b += C4477iq.m22228c(1, this.f15986a.longValue());
        }
        if (this.f15987b != null) {
            b += C4477iq.m22225b(2, this.f15987b);
        }
        if (this.f15988c != null) {
            b += C4477iq.m22225b(3, this.f15988c);
        }
        if (this.f15989d != null) {
            b += C4477iq.m22228c(4, this.f15989d.longValue());
        }
        if (this.f15991g != null) {
            this.f15991g.floatValue();
            b += C4477iq.m22222b(5) + 4;
        }
        if (this.f15990e == null) {
            return b;
        }
        this.f15990e.doubleValue();
        return b + C4477iq.m22222b(6) + 8;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4314cz)) {
            return false;
        }
        C4314cz czVar = (C4314cz) obj;
        if (this.f15986a == null) {
            if (czVar.f15986a != null) {
                return false;
            }
        } else if (!this.f15986a.equals(czVar.f15986a)) {
            return false;
        }
        if (this.f15987b == null) {
            if (czVar.f15987b != null) {
                return false;
            }
        } else if (!this.f15987b.equals(czVar.f15987b)) {
            return false;
        }
        if (this.f15988c == null) {
            if (czVar.f15988c != null) {
                return false;
            }
        } else if (!this.f15988c.equals(czVar.f15988c)) {
            return false;
        }
        if (this.f15989d == null) {
            if (czVar.f15989d != null) {
                return false;
            }
        } else if (!this.f15989d.equals(czVar.f15989d)) {
            return false;
        }
        if (this.f15991g == null) {
            if (czVar.f15991g != null) {
                return false;
            }
        } else if (!this.f15991g.equals(czVar.f15991g)) {
            return false;
        }
        if (this.f15990e == null) {
            if (czVar.f15990e != null) {
                return false;
            }
        } else if (!this.f15990e.equals(czVar.f15990e)) {
            return false;
        }
        return (this.f16310L == null || this.f16310L.mo14773b()) ? czVar.f16310L == null || czVar.f16310L.mo14773b() : this.f16310L.equals(czVar.f16310L);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((((((((((((getClass().getName().hashCode() + 527) * 31) + (this.f15986a == null ? 0 : this.f15986a.hashCode())) * 31) + (this.f15987b == null ? 0 : this.f15987b.hashCode())) * 31) + (this.f15988c == null ? 0 : this.f15988c.hashCode())) * 31) + (this.f15989d == null ? 0 : this.f15989d.hashCode())) * 31) + (this.f15991g == null ? 0 : this.f15991g.hashCode())) * 31) + (this.f15990e == null ? 0 : this.f15990e.hashCode())) * 31;
        if (this.f16310L != null && !this.f16310L.mo14773b()) {
            i = this.f16310L.hashCode();
        }
        return hashCode + i;
    }
}
