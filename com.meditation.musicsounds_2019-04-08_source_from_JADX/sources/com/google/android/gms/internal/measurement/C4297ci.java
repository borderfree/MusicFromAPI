package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.ci */
public final class C4297ci extends C4478ir<C4297ci> {

    /* renamed from: d */
    private static volatile C4297ci[] f15865d;

    /* renamed from: a */
    public Integer f15866a;

    /* renamed from: b */
    public C4301cm[] f15867b;

    /* renamed from: c */
    public C4298cj[] f15868c;

    /* renamed from: e */
    private Boolean f15869e;

    /* renamed from: f */
    private Boolean f15870f;

    public C4297ci() {
        this.f15866a = null;
        this.f15867b = C4301cm.m21175a();
        this.f15868c = C4298cj.m21163a();
        this.f15869e = null;
        this.f15870f = null;
        this.f16310L = null;
        this.f16326M = -1;
    }

    /* renamed from: a */
    public static C4297ci[] m21159a() {
        if (f15865d == null) {
            synchronized (C4482iv.f16324b) {
                if (f15865d == null) {
                    f15865d = new C4297ci[0];
                }
            }
        }
        return f15865d;
    }

    /* renamed from: a */
    public final /* synthetic */ C4483iw mo14223a(C4475io ioVar) {
        while (true) {
            int a = ioVar.mo14707a();
            if (a == 0) {
                return this;
            }
            if (a == 8) {
                this.f15866a = Integer.valueOf(ioVar.mo14718d());
            } else if (a == 18) {
                int a2 = C4486iz.m22281a(ioVar, 18);
                int length = this.f15867b == null ? 0 : this.f15867b.length;
                C4301cm[] cmVarArr = new C4301cm[(a2 + length)];
                if (length != 0) {
                    System.arraycopy(this.f15867b, 0, cmVarArr, 0, length);
                }
                while (length < cmVarArr.length - 1) {
                    cmVarArr[length] = new C4301cm();
                    ioVar.mo14710a((C4483iw) cmVarArr[length]);
                    ioVar.mo14707a();
                    length++;
                }
                cmVarArr[length] = new C4301cm();
                ioVar.mo14710a((C4483iw) cmVarArr[length]);
                this.f15867b = cmVarArr;
            } else if (a == 26) {
                int a3 = C4486iz.m22281a(ioVar, 26);
                int length2 = this.f15868c == null ? 0 : this.f15868c.length;
                C4298cj[] cjVarArr = new C4298cj[(a3 + length2)];
                if (length2 != 0) {
                    System.arraycopy(this.f15868c, 0, cjVarArr, 0, length2);
                }
                while (length2 < cjVarArr.length - 1) {
                    cjVarArr[length2] = new C4298cj();
                    ioVar.mo14710a((C4483iw) cjVarArr[length2]);
                    ioVar.mo14707a();
                    length2++;
                }
                cjVarArr[length2] = new C4298cj();
                ioVar.mo14710a((C4483iw) cjVarArr[length2]);
                this.f15868c = cjVarArr;
            } else if (a == 32) {
                this.f15869e = Boolean.valueOf(ioVar.mo14714b());
            } else if (a == 40) {
                this.f15870f = Boolean.valueOf(ioVar.mo14714b());
            } else if (!super.mo14761a(ioVar, a)) {
                return this;
            }
        }
    }

    /* renamed from: a */
    public final void mo14224a(C4477iq iqVar) {
        if (this.f15866a != null) {
            iqVar.mo14750a(1, this.f15866a.intValue());
        }
        if (this.f15867b != null && this.f15867b.length > 0) {
            for (C4301cm cmVar : this.f15867b) {
                if (cmVar != null) {
                    iqVar.mo14753a(2, (C4483iw) cmVar);
                }
            }
        }
        if (this.f15868c != null && this.f15868c.length > 0) {
            for (C4298cj cjVar : this.f15868c) {
                if (cjVar != null) {
                    iqVar.mo14753a(3, (C4483iw) cjVar);
                }
            }
        }
        if (this.f15869e != null) {
            iqVar.mo14755a(4, this.f15869e.booleanValue());
        }
        if (this.f15870f != null) {
            iqVar.mo14755a(5, this.f15870f.booleanValue());
        }
        super.mo14224a(iqVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo14225b() {
        int b = super.mo14225b();
        if (this.f15866a != null) {
            b += C4477iq.m22223b(1, this.f15866a.intValue());
        }
        if (this.f15867b != null && this.f15867b.length > 0) {
            int i = b;
            for (C4301cm cmVar : this.f15867b) {
                if (cmVar != null) {
                    i += C4477iq.m22224b(2, (C4483iw) cmVar);
                }
            }
            b = i;
        }
        if (this.f15868c != null && this.f15868c.length > 0) {
            for (C4298cj cjVar : this.f15868c) {
                if (cjVar != null) {
                    b += C4477iq.m22224b(3, (C4483iw) cjVar);
                }
            }
        }
        if (this.f15869e != null) {
            this.f15869e.booleanValue();
            b += C4477iq.m22222b(4) + 1;
        }
        if (this.f15870f == null) {
            return b;
        }
        this.f15870f.booleanValue();
        return b + C4477iq.m22222b(5) + 1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4297ci)) {
            return false;
        }
        C4297ci ciVar = (C4297ci) obj;
        if (this.f15866a == null) {
            if (ciVar.f15866a != null) {
                return false;
            }
        } else if (!this.f15866a.equals(ciVar.f15866a)) {
            return false;
        }
        if (!C4482iv.m22271a((Object[]) this.f15867b, (Object[]) ciVar.f15867b) || !C4482iv.m22271a((Object[]) this.f15868c, (Object[]) ciVar.f15868c)) {
            return false;
        }
        if (this.f15869e == null) {
            if (ciVar.f15869e != null) {
                return false;
            }
        } else if (!this.f15869e.equals(ciVar.f15869e)) {
            return false;
        }
        if (this.f15870f == null) {
            if (ciVar.f15870f != null) {
                return false;
            }
        } else if (!this.f15870f.equals(ciVar.f15870f)) {
            return false;
        }
        return (this.f16310L == null || this.f16310L.mo14773b()) ? ciVar.f16310L == null || ciVar.f16310L.mo14773b() : this.f16310L.equals(ciVar.f16310L);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((((((((((getClass().getName().hashCode() + 527) * 31) + (this.f15866a == null ? 0 : this.f15866a.hashCode())) * 31) + C4482iv.m22267a((Object[]) this.f15867b)) * 31) + C4482iv.m22267a((Object[]) this.f15868c)) * 31) + (this.f15869e == null ? 0 : this.f15869e.hashCode())) * 31) + (this.f15870f == null ? 0 : this.f15870f.hashCode())) * 31;
        if (this.f16310L != null && !this.f16310L.mo14773b()) {
            i = this.f16310L.hashCode();
        }
        return hashCode + i;
    }
}
