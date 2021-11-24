package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.cp */
public final class C4304cp extends C4478ir<C4304cp> {

    /* renamed from: a */
    public Long f15904a;

    /* renamed from: b */
    public String f15905b;

    /* renamed from: c */
    public C4305cq[] f15906c;

    /* renamed from: d */
    public C4303co[] f15907d;

    /* renamed from: e */
    public C4297ci[] f15908e;

    /* renamed from: f */
    private Integer f15909f;

    /* renamed from: g */
    private String f15910g;

    /* renamed from: h */
    private Boolean f15911h;

    public C4304cp() {
        this.f15904a = null;
        this.f15905b = null;
        this.f15909f = null;
        this.f15906c = C4305cq.m21190a();
        this.f15907d = C4303co.m21183a();
        this.f15908e = C4297ci.m21159a();
        this.f15910g = null;
        this.f15911h = null;
        this.f16310L = null;
        this.f16326M = -1;
    }

    /* renamed from: a */
    public final /* synthetic */ C4483iw mo14223a(C4475io ioVar) {
        while (true) {
            int a = ioVar.mo14707a();
            if (a == 0) {
                return this;
            }
            if (a == 8) {
                this.f15904a = Long.valueOf(ioVar.mo14720e());
            } else if (a == 18) {
                this.f15905b = ioVar.mo14717c();
            } else if (a == 24) {
                this.f15909f = Integer.valueOf(ioVar.mo14718d());
            } else if (a == 34) {
                int a2 = C4486iz.m22281a(ioVar, 34);
                int length = this.f15906c == null ? 0 : this.f15906c.length;
                C4305cq[] cqVarArr = new C4305cq[(a2 + length)];
                if (length != 0) {
                    System.arraycopy(this.f15906c, 0, cqVarArr, 0, length);
                }
                while (length < cqVarArr.length - 1) {
                    cqVarArr[length] = new C4305cq();
                    ioVar.mo14710a((C4483iw) cqVarArr[length]);
                    ioVar.mo14707a();
                    length++;
                }
                cqVarArr[length] = new C4305cq();
                ioVar.mo14710a((C4483iw) cqVarArr[length]);
                this.f15906c = cqVarArr;
            } else if (a == 42) {
                int a3 = C4486iz.m22281a(ioVar, 42);
                int length2 = this.f15907d == null ? 0 : this.f15907d.length;
                C4303co[] coVarArr = new C4303co[(a3 + length2)];
                if (length2 != 0) {
                    System.arraycopy(this.f15907d, 0, coVarArr, 0, length2);
                }
                while (length2 < coVarArr.length - 1) {
                    coVarArr[length2] = new C4303co();
                    ioVar.mo14710a((C4483iw) coVarArr[length2]);
                    ioVar.mo14707a();
                    length2++;
                }
                coVarArr[length2] = new C4303co();
                ioVar.mo14710a((C4483iw) coVarArr[length2]);
                this.f15907d = coVarArr;
            } else if (a == 50) {
                int a4 = C4486iz.m22281a(ioVar, 50);
                int length3 = this.f15908e == null ? 0 : this.f15908e.length;
                C4297ci[] ciVarArr = new C4297ci[(a4 + length3)];
                if (length3 != 0) {
                    System.arraycopy(this.f15908e, 0, ciVarArr, 0, length3);
                }
                while (length3 < ciVarArr.length - 1) {
                    ciVarArr[length3] = new C4297ci();
                    ioVar.mo14710a((C4483iw) ciVarArr[length3]);
                    ioVar.mo14707a();
                    length3++;
                }
                ciVarArr[length3] = new C4297ci();
                ioVar.mo14710a((C4483iw) ciVarArr[length3]);
                this.f15908e = ciVarArr;
            } else if (a == 58) {
                this.f15910g = ioVar.mo14717c();
            } else if (a == 64) {
                this.f15911h = Boolean.valueOf(ioVar.mo14714b());
            } else if (!super.mo14761a(ioVar, a)) {
                return this;
            }
        }
    }

    /* renamed from: a */
    public final void mo14224a(C4477iq iqVar) {
        if (this.f15904a != null) {
            iqVar.mo14757b(1, this.f15904a.longValue());
        }
        if (this.f15905b != null) {
            iqVar.mo14754a(2, this.f15905b);
        }
        if (this.f15909f != null) {
            iqVar.mo14750a(3, this.f15909f.intValue());
        }
        if (this.f15906c != null && this.f15906c.length > 0) {
            for (C4305cq cqVar : this.f15906c) {
                if (cqVar != null) {
                    iqVar.mo14753a(4, (C4483iw) cqVar);
                }
            }
        }
        if (this.f15907d != null && this.f15907d.length > 0) {
            for (C4303co coVar : this.f15907d) {
                if (coVar != null) {
                    iqVar.mo14753a(5, (C4483iw) coVar);
                }
            }
        }
        if (this.f15908e != null && this.f15908e.length > 0) {
            for (C4297ci ciVar : this.f15908e) {
                if (ciVar != null) {
                    iqVar.mo14753a(6, (C4483iw) ciVar);
                }
            }
        }
        if (this.f15910g != null) {
            iqVar.mo14754a(7, this.f15910g);
        }
        if (this.f15911h != null) {
            iqVar.mo14755a(8, this.f15911h.booleanValue());
        }
        super.mo14224a(iqVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo14225b() {
        int b = super.mo14225b();
        if (this.f15904a != null) {
            b += C4477iq.m22228c(1, this.f15904a.longValue());
        }
        if (this.f15905b != null) {
            b += C4477iq.m22225b(2, this.f15905b);
        }
        if (this.f15909f != null) {
            b += C4477iq.m22223b(3, this.f15909f.intValue());
        }
        if (this.f15906c != null && this.f15906c.length > 0) {
            int i = b;
            for (C4305cq cqVar : this.f15906c) {
                if (cqVar != null) {
                    i += C4477iq.m22224b(4, (C4483iw) cqVar);
                }
            }
            b = i;
        }
        if (this.f15907d != null && this.f15907d.length > 0) {
            int i2 = b;
            for (C4303co coVar : this.f15907d) {
                if (coVar != null) {
                    i2 += C4477iq.m22224b(5, (C4483iw) coVar);
                }
            }
            b = i2;
        }
        if (this.f15908e != null && this.f15908e.length > 0) {
            for (C4297ci ciVar : this.f15908e) {
                if (ciVar != null) {
                    b += C4477iq.m22224b(6, (C4483iw) ciVar);
                }
            }
        }
        if (this.f15910g != null) {
            b += C4477iq.m22225b(7, this.f15910g);
        }
        if (this.f15911h == null) {
            return b;
        }
        this.f15911h.booleanValue();
        return b + C4477iq.m22222b(8) + 1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4304cp)) {
            return false;
        }
        C4304cp cpVar = (C4304cp) obj;
        if (this.f15904a == null) {
            if (cpVar.f15904a != null) {
                return false;
            }
        } else if (!this.f15904a.equals(cpVar.f15904a)) {
            return false;
        }
        if (this.f15905b == null) {
            if (cpVar.f15905b != null) {
                return false;
            }
        } else if (!this.f15905b.equals(cpVar.f15905b)) {
            return false;
        }
        if (this.f15909f == null) {
            if (cpVar.f15909f != null) {
                return false;
            }
        } else if (!this.f15909f.equals(cpVar.f15909f)) {
            return false;
        }
        if (!C4482iv.m22271a((Object[]) this.f15906c, (Object[]) cpVar.f15906c) || !C4482iv.m22271a((Object[]) this.f15907d, (Object[]) cpVar.f15907d) || !C4482iv.m22271a((Object[]) this.f15908e, (Object[]) cpVar.f15908e)) {
            return false;
        }
        if (this.f15910g == null) {
            if (cpVar.f15910g != null) {
                return false;
            }
        } else if (!this.f15910g.equals(cpVar.f15910g)) {
            return false;
        }
        if (this.f15911h == null) {
            if (cpVar.f15911h != null) {
                return false;
            }
        } else if (!this.f15911h.equals(cpVar.f15911h)) {
            return false;
        }
        return (this.f16310L == null || this.f16310L.mo14773b()) ? cpVar.f16310L == null || cpVar.f16310L.mo14773b() : this.f16310L.equals(cpVar.f16310L);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((((((((((((((((getClass().getName().hashCode() + 527) * 31) + (this.f15904a == null ? 0 : this.f15904a.hashCode())) * 31) + (this.f15905b == null ? 0 : this.f15905b.hashCode())) * 31) + (this.f15909f == null ? 0 : this.f15909f.hashCode())) * 31) + C4482iv.m22267a((Object[]) this.f15906c)) * 31) + C4482iv.m22267a((Object[]) this.f15907d)) * 31) + C4482iv.m22267a((Object[]) this.f15908e)) * 31) + (this.f15910g == null ? 0 : this.f15910g.hashCode())) * 31) + (this.f15911h == null ? 0 : this.f15911h.hashCode())) * 31;
        if (this.f16310L != null && !this.f16310L.mo14773b()) {
            i = this.f16310L.hashCode();
        }
        return hashCode + i;
    }
}
