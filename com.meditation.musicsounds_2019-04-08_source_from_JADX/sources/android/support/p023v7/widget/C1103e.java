package android.support.p023v7.widget;

import android.support.p009v4.p019g.C0505k.C0506a;
import android.support.p009v4.p019g.C0505k.C0507b;
import android.support.p023v7.widget.RecyclerView.C0958w;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v7.widget.e */
class C1103e implements C1046a {

    /* renamed from: a */
    final ArrayList<C1105b> f3832a;

    /* renamed from: b */
    final ArrayList<C1105b> f3833b;

    /* renamed from: c */
    final C1104a f3834c;

    /* renamed from: d */
    Runnable f3835d;

    /* renamed from: e */
    final boolean f3836e;

    /* renamed from: f */
    final C1045as f3837f;

    /* renamed from: g */
    private C0506a<C1105b> f3838g;

    /* renamed from: h */
    private int f3839h;

    /* renamed from: android.support.v7.widget.e$a */
    interface C1104a {
        /* renamed from: a */
        C0958w mo4308a(int i);

        /* renamed from: a */
        void mo4309a(int i, int i2);

        /* renamed from: a */
        void mo4310a(int i, int i2, Object obj);

        /* renamed from: a */
        void mo4311a(C1105b bVar);

        /* renamed from: b */
        void mo4312b(int i, int i2);

        /* renamed from: b */
        void mo4313b(C1105b bVar);

        /* renamed from: c */
        void mo4314c(int i, int i2);

        /* renamed from: d */
        void mo4316d(int i, int i2);
    }

    /* renamed from: android.support.v7.widget.e$b */
    static class C1105b {

        /* renamed from: a */
        int f3840a;

        /* renamed from: b */
        int f3841b;

        /* renamed from: c */
        Object f3842c;

        /* renamed from: d */
        int f3843d;

        C1105b(int i, int i2, int i3, Object obj) {
            this.f3840a = i;
            this.f3841b = i2;
            this.f3843d = i3;
            this.f3842c = obj;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public String mo5442a() {
            int i = this.f3840a;
            if (i == 4) {
                return "up";
            }
            if (i == 8) {
                return "mv";
            }
            switch (i) {
                case 1:
                    return "add";
                case 2:
                    return "rm";
                default:
                    return "??";
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C1105b bVar = (C1105b) obj;
            if (this.f3840a != bVar.f3840a) {
                return false;
            }
            if (this.f3840a == 8 && Math.abs(this.f3843d - this.f3841b) == 1 && this.f3843d == bVar.f3841b && this.f3841b == bVar.f3843d) {
                return true;
            }
            if (this.f3843d != bVar.f3843d || this.f3841b != bVar.f3841b) {
                return false;
            }
            if (this.f3842c != null) {
                if (!this.f3842c.equals(bVar.f3842c)) {
                    return false;
                }
            } else if (bVar.f3842c != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f3840a * 31) + this.f3841b) * 31) + this.f3843d;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append("[");
            sb.append(mo5442a());
            sb.append(",s:");
            sb.append(this.f3841b);
            sb.append("c:");
            sb.append(this.f3843d);
            sb.append(",p:");
            sb.append(this.f3842c);
            sb.append("]");
            return sb.toString();
        }
    }

    C1103e(C1104a aVar) {
        this(aVar, false);
    }

    C1103e(C1104a aVar, boolean z) {
        this.f3838g = new C0507b(30);
        this.f3832a = new ArrayList<>();
        this.f3833b = new ArrayList<>();
        this.f3839h = 0;
        this.f3834c = aVar;
        this.f3836e = z;
        this.f3837f = new C1045as(this);
    }

    /* renamed from: b */
    private int m6024b(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        for (int size = this.f3833b.size() - 1; size >= 0; size--) {
            C1105b bVar = (C1105b) this.f3833b.get(size);
            if (bVar.f3840a == 8) {
                if (bVar.f3841b < bVar.f3843d) {
                    i5 = bVar.f3841b;
                    i4 = bVar.f3843d;
                } else {
                    i5 = bVar.f3843d;
                    i4 = bVar.f3841b;
                }
                if (i < i5 || i > i4) {
                    if (i < bVar.f3841b) {
                        if (i2 == 1) {
                            bVar.f3841b++;
                            i6 = bVar.f3843d + 1;
                        } else if (i2 == 2) {
                            bVar.f3841b--;
                            i6 = bVar.f3843d - 1;
                        }
                        bVar.f3843d = i6;
                    }
                } else if (i5 == bVar.f3841b) {
                    if (i2 == 1) {
                        i8 = bVar.f3843d + 1;
                    } else {
                        if (i2 == 2) {
                            i8 = bVar.f3843d - 1;
                        }
                        i++;
                    }
                    bVar.f3843d = i8;
                    i++;
                } else {
                    if (i2 == 1) {
                        i7 = bVar.f3841b + 1;
                    } else {
                        if (i2 == 2) {
                            i7 = bVar.f3841b - 1;
                        }
                        i--;
                    }
                    bVar.f3841b = i7;
                    i--;
                }
            } else if (bVar.f3841b > i) {
                if (i2 == 1) {
                    i3 = bVar.f3841b + 1;
                } else if (i2 == 2) {
                    i3 = bVar.f3841b - 1;
                }
                bVar.f3841b = i3;
            } else if (bVar.f3840a == 1) {
                i -= bVar.f3843d;
            } else if (bVar.f3840a == 2) {
                i += bVar.f3843d;
            }
        }
        for (int size2 = this.f3833b.size() - 1; size2 >= 0; size2--) {
            C1105b bVar2 = (C1105b) this.f3833b.get(size2);
            if (bVar2.f3840a == 8) {
                if (bVar2.f3843d != bVar2.f3841b && bVar2.f3843d >= 0) {
                }
            } else if (bVar2.f3843d > 0) {
            }
            this.f3833b.remove(size2);
            mo5178a(bVar2);
        }
        return i;
    }

    /* renamed from: b */
    private void m6025b(C1105b bVar) {
        m6031g(bVar);
    }

    /* renamed from: c */
    private void m6026c(C1105b bVar) {
        char c;
        boolean z;
        boolean z2;
        int i = bVar.f3841b;
        int i2 = bVar.f3841b + bVar.f3843d;
        int i3 = bVar.f3841b;
        int i4 = 0;
        char c2 = 65535;
        while (i3 < i2) {
            if (this.f3834c.mo4308a(i3) != null || m6028d(i3)) {
                if (c2 == 0) {
                    m6029e(mo5177a(2, i, i4, null));
                    z2 = true;
                } else {
                    z2 = false;
                }
                c = 1;
            } else {
                if (c2 == 1) {
                    m6031g(mo5177a(2, i, i4, null));
                    z = true;
                } else {
                    z = false;
                }
                c = 0;
            }
            if (z) {
                i3 -= i4;
                i2 -= i4;
                i4 = 1;
            } else {
                i4++;
            }
            i3++;
            c2 = c;
        }
        if (i4 != bVar.f3843d) {
            mo5178a(bVar);
            bVar = mo5177a(2, i, i4, null);
        }
        if (c2 == 0) {
            m6029e(bVar);
        } else {
            m6031g(bVar);
        }
    }

    /* renamed from: d */
    private void m6027d(C1105b bVar) {
        int i = bVar.f3841b;
        int i2 = bVar.f3841b + bVar.f3843d;
        char c = 65535;
        int i3 = i;
        int i4 = 0;
        for (int i5 = bVar.f3841b; i5 < i2; i5++) {
            if (this.f3834c.mo4308a(i5) != null || m6028d(i5)) {
                if (c == 0) {
                    m6029e(mo5177a(4, i3, i4, bVar.f3842c));
                    i3 = i5;
                    i4 = 0;
                }
                c = 1;
            } else {
                if (c == 1) {
                    m6031g(mo5177a(4, i3, i4, bVar.f3842c));
                    i3 = i5;
                    i4 = 0;
                }
                c = 0;
            }
            i4++;
        }
        if (i4 != bVar.f3843d) {
            Object obj = bVar.f3842c;
            mo5178a(bVar);
            bVar = mo5177a(4, i3, i4, obj);
        }
        if (c == 0) {
            m6029e(bVar);
        } else {
            m6031g(bVar);
        }
    }

    /* renamed from: d */
    private boolean m6028d(int i) {
        int size = this.f3833b.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1105b bVar = (C1105b) this.f3833b.get(i2);
            if (bVar.f3840a == 8) {
                if (mo5429a(bVar.f3843d, i2 + 1) == i) {
                    return true;
                }
            } else if (bVar.f3840a == 1) {
                int i3 = bVar.f3841b + bVar.f3843d;
                for (int i4 = bVar.f3841b; i4 < i3; i4++) {
                    if (mo5429a(i4, i2 + 1) == i) {
                        return true;
                    }
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    /* renamed from: e */
    private void m6029e(C1105b bVar) {
        int i;
        if (bVar.f3840a == 1 || bVar.f3840a == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int b = m6024b(bVar.f3841b, bVar.f3840a);
        int i2 = bVar.f3841b;
        int i3 = bVar.f3840a;
        if (i3 == 2) {
            i = 0;
        } else if (i3 == 4) {
            i = 1;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("op should be remove or update.");
            sb.append(bVar);
            throw new IllegalArgumentException(sb.toString());
        }
        int i4 = b;
        int i5 = i2;
        int i6 = 1;
        for (int i7 = 1; i7 < bVar.f3843d; i7++) {
            int b2 = m6024b(bVar.f3841b + (i * i7), bVar.f3840a);
            int i8 = bVar.f3840a;
            if (i8 == 2 ? b2 == i4 : i8 == 4 && b2 == i4 + 1) {
                i6++;
            } else {
                C1105b a = mo5177a(bVar.f3840a, i4, i6, bVar.f3842c);
                mo5431a(a, i5);
                mo5178a(a);
                if (bVar.f3840a == 4) {
                    i5 += i6;
                }
                i4 = b2;
                i6 = 1;
            }
        }
        Object obj = bVar.f3842c;
        mo5178a(bVar);
        if (i6 > 0) {
            C1105b a2 = mo5177a(bVar.f3840a, i4, i6, obj);
            mo5431a(a2, i5);
            mo5178a(a2);
        }
    }

    /* renamed from: f */
    private void m6030f(C1105b bVar) {
        m6031g(bVar);
    }

    /* renamed from: g */
    private void m6031g(C1105b bVar) {
        this.f3833b.add(bVar);
        int i = bVar.f3840a;
        if (i == 4) {
            this.f3834c.mo4310a(bVar.f3841b, bVar.f3843d, bVar.f3842c);
        } else if (i != 8) {
            switch (i) {
                case 1:
                    this.f3834c.mo4314c(bVar.f3841b, bVar.f3843d);
                    return;
                case 2:
                    this.f3834c.mo4312b(bVar.f3841b, bVar.f3843d);
                    return;
                default:
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unknown update op type for ");
                    sb.append(bVar);
                    throw new IllegalArgumentException(sb.toString());
            }
        } else {
            this.f3834c.mo4316d(bVar.f3841b, bVar.f3843d);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo5429a(int i, int i2) {
        int size = this.f3833b.size();
        while (i2 < size) {
            C1105b bVar = (C1105b) this.f3833b.get(i2);
            if (bVar.f3840a == 8) {
                if (bVar.f3841b == i) {
                    i = bVar.f3843d;
                } else {
                    if (bVar.f3841b < i) {
                        i--;
                    }
                    if (bVar.f3843d <= i) {
                        i++;
                    }
                }
            } else if (bVar.f3841b > i) {
                continue;
            } else if (bVar.f3840a == 2) {
                if (i < bVar.f3841b + bVar.f3843d) {
                    return -1;
                }
                i -= bVar.f3843d;
            } else if (bVar.f3840a == 1) {
                i += bVar.f3843d;
            }
            i2++;
        }
        return i;
    }

    /* renamed from: a */
    public C1105b mo5177a(int i, int i2, int i3, Object obj) {
        C1105b bVar = (C1105b) this.f3838g.mo2001a();
        if (bVar == null) {
            return new C1105b(i, i2, i3, obj);
        }
        bVar.f3840a = i;
        bVar.f3841b = i2;
        bVar.f3843d = i3;
        bVar.f3842c = obj;
        return bVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5430a() {
        mo5432a((List<C1105b>) this.f3832a);
        mo5432a((List<C1105b>) this.f3833b);
        this.f3839h = 0;
    }

    /* renamed from: a */
    public void mo5178a(C1105b bVar) {
        if (!this.f3836e) {
            bVar.f3842c = null;
            this.f3838g.mo2002a(bVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5431a(C1105b bVar, int i) {
        this.f3834c.mo4311a(bVar);
        int i2 = bVar.f3840a;
        if (i2 == 2) {
            this.f3834c.mo4309a(i, bVar.f3843d);
        } else if (i2 == 4) {
            this.f3834c.mo4310a(i, bVar.f3843d, bVar.f3842c);
        } else {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5432a(List<C1105b> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            mo5178a((C1105b) list.get(i));
        }
        list.clear();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo5433a(int i) {
        return (i & this.f3839h) != 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo5434a(int i, int i2, Object obj) {
        boolean z = false;
        if (i2 < 1) {
            return false;
        }
        this.f3832a.add(mo5177a(4, i, i2, obj));
        this.f3839h |= 4;
        if (this.f3832a.size() == 1) {
            z = true;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo5435b(int i) {
        return mo5429a(i, 0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo5436b() {
        this.f3837f.mo5174a(this.f3832a);
        int size = this.f3832a.size();
        for (int i = 0; i < size; i++) {
            C1105b bVar = (C1105b) this.f3832a.get(i);
            int i2 = bVar.f3840a;
            if (i2 == 4) {
                m6027d(bVar);
            } else if (i2 != 8) {
                switch (i2) {
                    case 1:
                        m6030f(bVar);
                        break;
                    case 2:
                        m6026c(bVar);
                        break;
                }
            } else {
                m6025b(bVar);
            }
            if (this.f3835d != null) {
                this.f3835d.run();
            }
        }
        this.f3832a.clear();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0047, code lost:
        continue;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo5437c(int r6) {
        /*
            r5 = this;
            java.util.ArrayList<android.support.v7.widget.e$b> r0 = r5.f3832a
            int r0 = r0.size()
            r1 = 0
        L_0x0007:
            if (r1 >= r0) goto L_0x004a
            java.util.ArrayList<android.support.v7.widget.e$b> r2 = r5.f3832a
            java.lang.Object r2 = r2.get(r1)
            android.support.v7.widget.e$b r2 = (android.support.p023v7.widget.C1103e.C1105b) r2
            int r3 = r2.f3840a
            r4 = 8
            if (r3 == r4) goto L_0x0034
            switch(r3) {
                case 1: goto L_0x002c;
                case 2: goto L_0x001b;
                default: goto L_0x001a;
            }
        L_0x001a:
            goto L_0x0047
        L_0x001b:
            int r3 = r2.f3841b
            if (r3 > r6) goto L_0x0047
            int r3 = r2.f3841b
            int r4 = r2.f3843d
            int r3 = r3 + r4
            if (r3 <= r6) goto L_0x0028
            r6 = -1
            return r6
        L_0x0028:
            int r2 = r2.f3843d
            int r6 = r6 - r2
            goto L_0x0047
        L_0x002c:
            int r3 = r2.f3841b
            if (r3 > r6) goto L_0x0047
            int r2 = r2.f3843d
            int r6 = r6 + r2
            goto L_0x0047
        L_0x0034:
            int r3 = r2.f3841b
            if (r3 != r6) goto L_0x003b
            int r6 = r2.f3843d
            goto L_0x0047
        L_0x003b:
            int r3 = r2.f3841b
            if (r3 >= r6) goto L_0x0041
            int r6 = r6 + -1
        L_0x0041:
            int r2 = r2.f3843d
            if (r2 > r6) goto L_0x0047
            int r6 = r6 + 1
        L_0x0047:
            int r1 = r1 + 1
            goto L_0x0007
        L_0x004a:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p023v7.widget.C1103e.mo5437c(int):int");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo5438c() {
        int size = this.f3833b.size();
        for (int i = 0; i < size; i++) {
            this.f3834c.mo4313b((C1105b) this.f3833b.get(i));
        }
        mo5432a((List<C1105b>) this.f3833b);
        this.f3839h = 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public boolean mo5439d() {
        return this.f3832a.size() > 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo5440e() {
        mo5438c();
        int size = this.f3832a.size();
        for (int i = 0; i < size; i++) {
            C1105b bVar = (C1105b) this.f3832a.get(i);
            int i2 = bVar.f3840a;
            if (i2 == 4) {
                this.f3834c.mo4313b(bVar);
                this.f3834c.mo4310a(bVar.f3841b, bVar.f3843d, bVar.f3842c);
            } else if (i2 != 8) {
                switch (i2) {
                    case 1:
                        this.f3834c.mo4313b(bVar);
                        this.f3834c.mo4314c(bVar.f3841b, bVar.f3843d);
                        break;
                    case 2:
                        this.f3834c.mo4313b(bVar);
                        this.f3834c.mo4309a(bVar.f3841b, bVar.f3843d);
                        break;
                }
            } else {
                this.f3834c.mo4313b(bVar);
                this.f3834c.mo4316d(bVar.f3841b, bVar.f3843d);
            }
            if (this.f3835d != null) {
                this.f3835d.run();
            }
        }
        mo5432a((List<C1105b>) this.f3832a);
        this.f3839h = 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public boolean mo5441f() {
        return !this.f3833b.isEmpty() && !this.f3832a.isEmpty();
    }
}
