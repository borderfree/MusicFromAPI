package android.support.p023v7.widget;

import android.support.p009v4.p019g.C0488a;
import android.support.p009v4.p019g.C0495f;
import android.support.p009v4.p019g.C0505k.C0506a;
import android.support.p009v4.p019g.C0505k.C0507b;
import android.support.p023v7.widget.RecyclerView.C0931f.C0934c;
import android.support.p023v7.widget.RecyclerView.C0958w;

/* renamed from: android.support.v7.widget.br */
class C1091br {

    /* renamed from: a */
    final C0488a<C0958w, C1092a> f3803a = new C0488a<>();

    /* renamed from: b */
    final C0495f<C0958w> f3804b = new C0495f<>();

    /* renamed from: android.support.v7.widget.br$a */
    static class C1092a {

        /* renamed from: d */
        static C0506a<C1092a> f3805d = new C0507b(20);

        /* renamed from: a */
        int f3806a;

        /* renamed from: b */
        C0934c f3807b;

        /* renamed from: c */
        C0934c f3808c;

        private C1092a() {
        }

        /* renamed from: a */
        static C1092a m5996a() {
            C1092a aVar = (C1092a) f3805d.mo2001a();
            return aVar == null ? new C1092a() : aVar;
        }

        /* renamed from: a */
        static void m5997a(C1092a aVar) {
            aVar.f3806a = 0;
            aVar.f3807b = null;
            aVar.f3808c = null;
            f3805d.mo2002a(aVar);
        }

        /* renamed from: b */
        static void m5998b() {
            do {
            } while (f3805d.mo2001a() != null);
        }
    }

    /* renamed from: android.support.v7.widget.br$b */
    interface C1093b {
        /* renamed from: a */
        void mo4293a(C0958w wVar);

        /* renamed from: a */
        void mo4294a(C0958w wVar, C0934c cVar, C0934c cVar2);

        /* renamed from: b */
        void mo4295b(C0958w wVar, C0934c cVar, C0934c cVar2);

        /* renamed from: c */
        void mo4296c(C0958w wVar, C0934c cVar, C0934c cVar2);
    }

    C1091br() {
    }

    /* renamed from: a */
    private C0934c m5979a(C0958w wVar, int i) {
        C0934c cVar;
        int a = this.f3803a.mo2004a((Object) wVar);
        if (a < 0) {
            return null;
        }
        C1092a aVar = (C1092a) this.f3803a.mo2011c(a);
        if (aVar == null || (aVar.f3806a & i) == 0) {
            return null;
        }
        aVar.f3806a &= i ^ -1;
        if (i == 4) {
            cVar = aVar.f3807b;
        } else if (i == 8) {
            cVar = aVar.f3808c;
        } else {
            throw new IllegalArgumentException("Must provide flag PRE or POST");
        }
        if ((aVar.f3806a & 12) == 0) {
            this.f3803a.mo2015d(a);
            C1092a.m5997a(aVar);
        }
        return cVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C0958w mo5394a(long j) {
        return (C0958w) this.f3804b.mo1916a(j);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5395a() {
        this.f3803a.clear();
        this.f3804b.mo1925c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5396a(long j, C0958w wVar) {
        this.f3804b.mo1922b(j, wVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5397a(C0958w wVar, C0934c cVar) {
        C1092a aVar = (C1092a) this.f3803a.get(wVar);
        if (aVar == null) {
            aVar = C1092a.m5996a();
            this.f3803a.put(wVar, aVar);
        }
        aVar.f3807b = cVar;
        aVar.f3806a |= 4;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5398a(C1093b bVar) {
        C0934c cVar;
        C0934c cVar2;
        for (int size = this.f3803a.size() - 1; size >= 0; size--) {
            C0958w wVar = (C0958w) this.f3803a.mo2010b(size);
            C1092a aVar = (C1092a) this.f3803a.mo2015d(size);
            if ((aVar.f3806a & 3) != 3) {
                if ((aVar.f3806a & 1) == 0) {
                    if ((aVar.f3806a & 14) != 14) {
                        if ((aVar.f3806a & 12) == 12) {
                            bVar.mo4296c(wVar, aVar.f3807b, aVar.f3808c);
                        } else if ((aVar.f3806a & 4) != 0) {
                            cVar = aVar.f3807b;
                            cVar2 = null;
                        } else if ((aVar.f3806a & 8) == 0) {
                            int i = aVar.f3806a;
                        }
                        C1092a.m5997a(aVar);
                    }
                    bVar.mo4295b(wVar, aVar.f3807b, aVar.f3808c);
                    C1092a.m5997a(aVar);
                } else if (aVar.f3807b != null) {
                    cVar = aVar.f3807b;
                    cVar2 = aVar.f3808c;
                }
                bVar.mo4294a(wVar, cVar, cVar2);
                C1092a.m5997a(aVar);
            }
            bVar.mo4293a(wVar);
            C1092a.m5997a(aVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo5399a(C0958w wVar) {
        C1092a aVar = (C1092a) this.f3803a.get(wVar);
        return (aVar == null || (aVar.f3806a & 1) == 0) ? false : true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C0934c mo5400b(C0958w wVar) {
        return m5979a(wVar, 4);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo5401b() {
        C1092a.m5998b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo5402b(C0958w wVar, C0934c cVar) {
        C1092a aVar = (C1092a) this.f3803a.get(wVar);
        if (aVar == null) {
            aVar = C1092a.m5996a();
            this.f3803a.put(wVar, aVar);
        }
        aVar.f3806a |= 2;
        aVar.f3807b = cVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public C0934c mo5403c(C0958w wVar) {
        return m5979a(wVar, 8);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo5404c(C0958w wVar, C0934c cVar) {
        C1092a aVar = (C1092a) this.f3803a.get(wVar);
        if (aVar == null) {
            aVar = C1092a.m5996a();
            this.f3803a.put(wVar, aVar);
        }
        aVar.f3808c = cVar;
        aVar.f3806a |= 8;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public boolean mo5405d(C0958w wVar) {
        C1092a aVar = (C1092a) this.f3803a.get(wVar);
        return (aVar == null || (aVar.f3806a & 4) == 0) ? false : true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo5406e(C0958w wVar) {
        C1092a aVar = (C1092a) this.f3803a.get(wVar);
        if (aVar == null) {
            aVar = C1092a.m5996a();
            this.f3803a.put(wVar, aVar);
        }
        aVar.f3806a |= 1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo5407f(C0958w wVar) {
        C1092a aVar = (C1092a) this.f3803a.get(wVar);
        if (aVar != null) {
            aVar.f3806a &= -2;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo5408g(C0958w wVar) {
        int b = this.f3804b.mo1919b() - 1;
        while (true) {
            if (b < 0) {
                break;
            } else if (wVar == this.f3804b.mo1924c(b)) {
                this.f3804b.mo1918a(b);
                break;
            } else {
                b--;
            }
        }
        C1092a aVar = (C1092a) this.f3803a.remove(wVar);
        if (aVar != null) {
            C1092a.m5997a(aVar);
        }
    }

    /* renamed from: h */
    public void mo5409h(C0958w wVar) {
        mo5407f(wVar);
    }
}
