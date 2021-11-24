package android.support.p009v4.p019g;

/* renamed from: android.support.v4.g.f */
public class C0495f<E> implements Cloneable {

    /* renamed from: a */
    private static final Object f1472a = new Object();

    /* renamed from: b */
    private boolean f1473b;

    /* renamed from: c */
    private long[] f1474c;

    /* renamed from: d */
    private Object[] f1475d;

    /* renamed from: e */
    private int f1476e;

    public C0495f() {
        this(10);
    }

    public C0495f(int i) {
        Object[] objArr;
        this.f1473b = false;
        if (i == 0) {
            this.f1474c = C0492c.f1468b;
            objArr = C0492c.f1469c;
        } else {
            int b = C0492c.m2199b(i);
            this.f1474c = new long[b];
            objArr = new Object[b];
        }
        this.f1475d = objArr;
        this.f1476e = 0;
    }

    /* renamed from: d */
    private void m2203d() {
        int i = this.f1476e;
        long[] jArr = this.f1474c;
        Object[] objArr = this.f1475d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f1472a) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f1473b = false;
        this.f1476e = i2;
    }

    /* renamed from: a */
    public C0495f<E> clone() {
        try {
            C0495f<E> fVar = (C0495f) super.clone();
            try {
                fVar.f1474c = (long[]) this.f1474c.clone();
                fVar.f1475d = (Object[]) this.f1475d.clone();
                return fVar;
            } catch (CloneNotSupportedException unused) {
                return fVar;
            }
        } catch (CloneNotSupportedException unused2) {
            return null;
        }
    }

    /* renamed from: a */
    public E mo1916a(long j) {
        return mo1917a(j, null);
    }

    /* renamed from: a */
    public E mo1917a(long j, E e) {
        int a = C0492c.m2197a(this.f1474c, this.f1476e, j);
        return (a < 0 || this.f1475d[a] == f1472a) ? e : this.f1475d[a];
    }

    /* renamed from: a */
    public void mo1918a(int i) {
        if (this.f1475d[i] != f1472a) {
            this.f1475d[i] = f1472a;
            this.f1473b = true;
        }
    }

    /* renamed from: b */
    public int mo1919b() {
        if (this.f1473b) {
            m2203d();
        }
        return this.f1476e;
    }

    /* renamed from: b */
    public long mo1920b(int i) {
        if (this.f1473b) {
            m2203d();
        }
        return this.f1474c[i];
    }

    /* renamed from: b */
    public void mo1921b(long j) {
        int a = C0492c.m2197a(this.f1474c, this.f1476e, j);
        if (a >= 0 && this.f1475d[a] != f1472a) {
            this.f1475d[a] = f1472a;
            this.f1473b = true;
        }
    }

    /* renamed from: b */
    public void mo1922b(long j, E e) {
        int a = C0492c.m2197a(this.f1474c, this.f1476e, j);
        if (a >= 0) {
            this.f1475d[a] = e;
        } else {
            int i = a ^ -1;
            if (i >= this.f1476e || this.f1475d[i] != f1472a) {
                if (this.f1473b && this.f1476e >= this.f1474c.length) {
                    m2203d();
                    i = C0492c.m2197a(this.f1474c, this.f1476e, j) ^ -1;
                }
                if (this.f1476e >= this.f1474c.length) {
                    int b = C0492c.m2199b(this.f1476e + 1);
                    long[] jArr = new long[b];
                    Object[] objArr = new Object[b];
                    System.arraycopy(this.f1474c, 0, jArr, 0, this.f1474c.length);
                    System.arraycopy(this.f1475d, 0, objArr, 0, this.f1475d.length);
                    this.f1474c = jArr;
                    this.f1475d = objArr;
                }
                if (this.f1476e - i != 0) {
                    int i2 = i + 1;
                    System.arraycopy(this.f1474c, i, this.f1474c, i2, this.f1476e - i);
                    System.arraycopy(this.f1475d, i, this.f1475d, i2, this.f1476e - i);
                }
                this.f1474c[i] = j;
                this.f1475d[i] = e;
                this.f1476e++;
            } else {
                this.f1474c[i] = j;
                this.f1475d[i] = e;
            }
        }
    }

    /* renamed from: c */
    public int mo1923c(long j) {
        if (this.f1473b) {
            m2203d();
        }
        return C0492c.m2197a(this.f1474c, this.f1476e, j);
    }

    /* renamed from: c */
    public E mo1924c(int i) {
        if (this.f1473b) {
            m2203d();
        }
        return this.f1475d[i];
    }

    /* renamed from: c */
    public void mo1925c() {
        int i = this.f1476e;
        Object[] objArr = this.f1475d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f1476e = 0;
        this.f1473b = false;
    }

    public String toString() {
        if (mo1919b() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1476e * 28);
        sb.append('{');
        for (int i = 0; i < this.f1476e; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(mo1920b(i));
            sb.append('=');
            Object c = mo1924c(i);
            if (c != this) {
                sb.append(c);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
