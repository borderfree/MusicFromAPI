package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.cj */
public final class C4298cj extends C4478ir<C4298cj> {

    /* renamed from: g */
    private static volatile C4298cj[] f15871g;

    /* renamed from: a */
    public Integer f15872a;

    /* renamed from: b */
    public String f15873b;

    /* renamed from: c */
    public C4299ck[] f15874c;

    /* renamed from: d */
    public C4300cl f15875d;

    /* renamed from: e */
    public Boolean f15876e;

    /* renamed from: f */
    public Boolean f15877f;

    /* renamed from: h */
    private Boolean f15878h;

    public C4298cj() {
        this.f15872a = null;
        this.f15873b = null;
        this.f15874c = C4299ck.m21167a();
        this.f15878h = null;
        this.f15875d = null;
        this.f15876e = null;
        this.f15877f = null;
        this.f16310L = null;
        this.f16326M = -1;
    }

    /* renamed from: a */
    public static C4298cj[] m21163a() {
        if (f15871g == null) {
            synchronized (C4482iv.f16324b) {
                if (f15871g == null) {
                    f15871g = new C4298cj[0];
                }
            }
        }
        return f15871g;
    }

    /* renamed from: a */
    public final /* synthetic */ C4483iw mo14223a(C4475io ioVar) {
        while (true) {
            int a = ioVar.mo14707a();
            if (a == 0) {
                return this;
            }
            if (a == 8) {
                this.f15872a = Integer.valueOf(ioVar.mo14718d());
            } else if (a == 18) {
                this.f15873b = ioVar.mo14717c();
            } else if (a == 26) {
                int a2 = C4486iz.m22281a(ioVar, 26);
                int length = this.f15874c == null ? 0 : this.f15874c.length;
                C4299ck[] ckVarArr = new C4299ck[(a2 + length)];
                if (length != 0) {
                    System.arraycopy(this.f15874c, 0, ckVarArr, 0, length);
                }
                while (length < ckVarArr.length - 1) {
                    ckVarArr[length] = new C4299ck();
                    ioVar.mo14710a((C4483iw) ckVarArr[length]);
                    ioVar.mo14707a();
                    length++;
                }
                ckVarArr[length] = new C4299ck();
                ioVar.mo14710a((C4483iw) ckVarArr[length]);
                this.f15874c = ckVarArr;
            } else if (a == 32) {
                this.f15878h = Boolean.valueOf(ioVar.mo14714b());
            } else if (a == 42) {
                if (this.f15875d == null) {
                    this.f15875d = new C4300cl();
                }
                ioVar.mo14710a((C4483iw) this.f15875d);
            } else if (a == 48) {
                this.f15876e = Boolean.valueOf(ioVar.mo14714b());
            } else if (a == 56) {
                this.f15877f = Boolean.valueOf(ioVar.mo14714b());
            } else if (!super.mo14761a(ioVar, a)) {
                return this;
            }
        }
    }

    /* renamed from: a */
    public final void mo14224a(C4477iq iqVar) {
        if (this.f15872a != null) {
            iqVar.mo14750a(1, this.f15872a.intValue());
        }
        if (this.f15873b != null) {
            iqVar.mo14754a(2, this.f15873b);
        }
        if (this.f15874c != null && this.f15874c.length > 0) {
            for (C4299ck ckVar : this.f15874c) {
                if (ckVar != null) {
                    iqVar.mo14753a(3, (C4483iw) ckVar);
                }
            }
        }
        if (this.f15878h != null) {
            iqVar.mo14755a(4, this.f15878h.booleanValue());
        }
        if (this.f15875d != null) {
            iqVar.mo14753a(5, (C4483iw) this.f15875d);
        }
        if (this.f15876e != null) {
            iqVar.mo14755a(6, this.f15876e.booleanValue());
        }
        if (this.f15877f != null) {
            iqVar.mo14755a(7, this.f15877f.booleanValue());
        }
        super.mo14224a(iqVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo14225b() {
        int b = super.mo14225b();
        if (this.f15872a != null) {
            b += C4477iq.m22223b(1, this.f15872a.intValue());
        }
        if (this.f15873b != null) {
            b += C4477iq.m22225b(2, this.f15873b);
        }
        if (this.f15874c != null && this.f15874c.length > 0) {
            for (C4299ck ckVar : this.f15874c) {
                if (ckVar != null) {
                    b += C4477iq.m22224b(3, (C4483iw) ckVar);
                }
            }
        }
        if (this.f15878h != null) {
            this.f15878h.booleanValue();
            b += C4477iq.m22222b(4) + 1;
        }
        if (this.f15875d != null) {
            b += C4477iq.m22224b(5, (C4483iw) this.f15875d);
        }
        if (this.f15876e != null) {
            this.f15876e.booleanValue();
            b += C4477iq.m22222b(6) + 1;
        }
        if (this.f15877f == null) {
            return b;
        }
        this.f15877f.booleanValue();
        return b + C4477iq.m22222b(7) + 1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4298cj)) {
            return false;
        }
        C4298cj cjVar = (C4298cj) obj;
        if (this.f15872a == null) {
            if (cjVar.f15872a != null) {
                return false;
            }
        } else if (!this.f15872a.equals(cjVar.f15872a)) {
            return false;
        }
        if (this.f15873b == null) {
            if (cjVar.f15873b != null) {
                return false;
            }
        } else if (!this.f15873b.equals(cjVar.f15873b)) {
            return false;
        }
        if (!C4482iv.m22271a((Object[]) this.f15874c, (Object[]) cjVar.f15874c)) {
            return false;
        }
        if (this.f15878h == null) {
            if (cjVar.f15878h != null) {
                return false;
            }
        } else if (!this.f15878h.equals(cjVar.f15878h)) {
            return false;
        }
        if (this.f15875d == null) {
            if (cjVar.f15875d != null) {
                return false;
            }
        } else if (!this.f15875d.equals(cjVar.f15875d)) {
            return false;
        }
        if (this.f15876e == null) {
            if (cjVar.f15876e != null) {
                return false;
            }
        } else if (!this.f15876e.equals(cjVar.f15876e)) {
            return false;
        }
        if (this.f15877f == null) {
            if (cjVar.f15877f != null) {
                return false;
            }
        } else if (!this.f15877f.equals(cjVar.f15877f)) {
            return false;
        }
        return (this.f16310L == null || this.f16310L.mo14773b()) ? cjVar.f16310L == null || cjVar.f16310L.mo14773b() : this.f16310L.equals(cjVar.f16310L);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((((((((getClass().getName().hashCode() + 527) * 31) + (this.f15872a == null ? 0 : this.f15872a.hashCode())) * 31) + (this.f15873b == null ? 0 : this.f15873b.hashCode())) * 31) + C4482iv.m22267a((Object[]) this.f15874c)) * 31) + (this.f15878h == null ? 0 : this.f15878h.hashCode());
        C4300cl clVar = this.f15875d;
        int hashCode2 = ((((((hashCode * 31) + (clVar == null ? 0 : clVar.hashCode())) * 31) + (this.f15876e == null ? 0 : this.f15876e.hashCode())) * 31) + (this.f15877f == null ? 0 : this.f15877f.hashCode())) * 31;
        if (this.f16310L != null && !this.f16310L.mo14773b()) {
            i = this.f16310L.hashCode();
        }
        return hashCode2 + i;
    }
}
