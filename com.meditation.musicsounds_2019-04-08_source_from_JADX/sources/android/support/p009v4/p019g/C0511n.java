package android.support.p009v4.p019g;

/* renamed from: android.support.v4.g.n */
public class C0511n<E> implements Cloneable {

    /* renamed from: a */
    private static final Object f1512a = new Object();

    /* renamed from: b */
    private boolean f1513b;

    /* renamed from: c */
    private int[] f1514c;

    /* renamed from: d */
    private Object[] f1515d;

    /* renamed from: e */
    private int f1516e;

    public C0511n() {
        this(10);
    }

    public C0511n(int i) {
        Object[] objArr;
        this.f1513b = false;
        if (i == 0) {
            this.f1514c = C0492c.f1467a;
            objArr = C0492c.f1469c;
        } else {
            int a = C0492c.m2195a(i);
            this.f1514c = new int[a];
            objArr = new Object[a];
        }
        this.f1515d = objArr;
        this.f1516e = 0;
    }

    /* renamed from: d */
    private void m2266d() {
        int i = this.f1516e;
        int[] iArr = this.f1514c;
        Object[] objArr = this.f1515d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f1512a) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f1513b = false;
        this.f1516e = i2;
    }

    /* renamed from: a */
    public C0511n<E> clone() {
        try {
            C0511n<E> nVar = (C0511n) super.clone();
            try {
                nVar.f1514c = (int[]) this.f1514c.clone();
                nVar.f1515d = (Object[]) this.f1515d.clone();
                return nVar;
            } catch (CloneNotSupportedException unused) {
                return nVar;
            }
        } catch (CloneNotSupportedException unused2) {
            return null;
        }
    }

    /* renamed from: a */
    public E mo2025a(int i) {
        return mo2026a(i, null);
    }

    /* renamed from: a */
    public E mo2026a(int i, E e) {
        int a = C0492c.m2196a(this.f1514c, this.f1516e, i);
        return (a < 0 || this.f1515d[a] == f1512a) ? e : this.f1515d[a];
    }

    /* renamed from: b */
    public int mo2027b() {
        if (this.f1513b) {
            m2266d();
        }
        return this.f1516e;
    }

    /* renamed from: b */
    public void mo2028b(int i) {
        int a = C0492c.m2196a(this.f1514c, this.f1516e, i);
        if (a >= 0 && this.f1515d[a] != f1512a) {
            this.f1515d[a] = f1512a;
            this.f1513b = true;
        }
    }

    /* renamed from: b */
    public void mo2029b(int i, E e) {
        int a = C0492c.m2196a(this.f1514c, this.f1516e, i);
        if (a >= 0) {
            this.f1515d[a] = e;
        } else {
            int i2 = a ^ -1;
            if (i2 >= this.f1516e || this.f1515d[i2] != f1512a) {
                if (this.f1513b && this.f1516e >= this.f1514c.length) {
                    m2266d();
                    i2 = C0492c.m2196a(this.f1514c, this.f1516e, i) ^ -1;
                }
                if (this.f1516e >= this.f1514c.length) {
                    int a2 = C0492c.m2195a(this.f1516e + 1);
                    int[] iArr = new int[a2];
                    Object[] objArr = new Object[a2];
                    System.arraycopy(this.f1514c, 0, iArr, 0, this.f1514c.length);
                    System.arraycopy(this.f1515d, 0, objArr, 0, this.f1515d.length);
                    this.f1514c = iArr;
                    this.f1515d = objArr;
                }
                if (this.f1516e - i2 != 0) {
                    int i3 = i2 + 1;
                    System.arraycopy(this.f1514c, i2, this.f1514c, i3, this.f1516e - i2);
                    System.arraycopy(this.f1515d, i2, this.f1515d, i3, this.f1516e - i2);
                }
                this.f1514c[i2] = i;
                this.f1515d[i2] = e;
                this.f1516e++;
            } else {
                this.f1514c[i2] = i;
                this.f1515d[i2] = e;
            }
        }
    }

    /* renamed from: c */
    public void mo2030c() {
        int i = this.f1516e;
        Object[] objArr = this.f1515d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f1516e = 0;
        this.f1513b = false;
    }

    /* renamed from: c */
    public void mo2031c(int i) {
        mo2028b(i);
    }

    /* renamed from: c */
    public void mo2032c(int i, E e) {
        if (this.f1516e == 0 || i > this.f1514c[this.f1516e - 1]) {
            if (this.f1513b && this.f1516e >= this.f1514c.length) {
                m2266d();
            }
            int i2 = this.f1516e;
            if (i2 >= this.f1514c.length) {
                int a = C0492c.m2195a(i2 + 1);
                int[] iArr = new int[a];
                Object[] objArr = new Object[a];
                System.arraycopy(this.f1514c, 0, iArr, 0, this.f1514c.length);
                System.arraycopy(this.f1515d, 0, objArr, 0, this.f1515d.length);
                this.f1514c = iArr;
                this.f1515d = objArr;
            }
            this.f1514c[i2] = i;
            this.f1515d[i2] = e;
            this.f1516e = i2 + 1;
            return;
        }
        mo2029b(i, e);
    }

    /* renamed from: d */
    public int mo2034d(int i) {
        if (this.f1513b) {
            m2266d();
        }
        return this.f1514c[i];
    }

    /* renamed from: e */
    public E mo2035e(int i) {
        if (this.f1513b) {
            m2266d();
        }
        return this.f1515d[i];
    }

    /* renamed from: f */
    public int mo2036f(int i) {
        if (this.f1513b) {
            m2266d();
        }
        return C0492c.m2196a(this.f1514c, this.f1516e, i);
    }

    public String toString() {
        if (mo2027b() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1516e * 28);
        sb.append('{');
        for (int i = 0; i < this.f1516e; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(mo2034d(i));
            sb.append('=');
            Object e = mo2035e(i);
            if (e != this) {
                sb.append(e);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
