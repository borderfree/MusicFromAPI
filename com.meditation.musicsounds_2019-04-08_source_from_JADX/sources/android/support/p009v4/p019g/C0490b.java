package android.support.p009v4.p019g;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: android.support.v4.g.b */
public final class C0490b<E> implements Collection<E>, Set<E> {

    /* renamed from: a */
    private static final int[] f1456a = new int[0];

    /* renamed from: b */
    private static final Object[] f1457b = new Object[0];

    /* renamed from: c */
    private static Object[] f1458c;

    /* renamed from: d */
    private static int f1459d;

    /* renamed from: e */
    private static Object[] f1460e;

    /* renamed from: f */
    private static int f1461f;

    /* renamed from: g */
    private int[] f1462g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public Object[] f1463h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public int f1464i;

    /* renamed from: j */
    private C0497h<E, E> f1465j;

    public C0490b() {
        this(0);
    }

    public C0490b(int i) {
        if (i == 0) {
            this.f1462g = f1456a;
            this.f1463h = f1457b;
        } else {
            m2181d(i);
        }
        this.f1464i = 0;
    }

    /* renamed from: a */
    private int m2175a() {
        int i = this.f1464i;
        if (i == 0) {
            return -1;
        }
        int a = C0492c.m2196a(this.f1462g, i, 0);
        if (a < 0 || this.f1463h[a] == null) {
            return a;
        }
        int i2 = a + 1;
        while (i2 < i && this.f1462g[i2] == 0) {
            if (this.f1463h[i2] == null) {
                return i2;
            }
            i2++;
        }
        int i3 = a - 1;
        while (i3 >= 0 && this.f1462g[i3] == 0) {
            if (this.f1463h[i3] == null) {
                return i3;
            }
            i3--;
        }
        return i2 ^ -1;
    }

    /* renamed from: a */
    private int m2177a(Object obj, int i) {
        int i2 = this.f1464i;
        if (i2 == 0) {
            return -1;
        }
        int a = C0492c.m2196a(this.f1462g, i2, i);
        if (a < 0 || obj.equals(this.f1463h[a])) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.f1462g[i3] == i) {
            if (obj.equals(this.f1463h[i3])) {
                return i3;
            }
            i3++;
        }
        int i4 = a - 1;
        while (i4 >= 0 && this.f1462g[i4] == i) {
            if (obj.equals(this.f1463h[i4])) {
                return i4;
            }
            i4--;
        }
        return i3 ^ -1;
    }

    /* renamed from: a */
    private static void m2178a(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C0490b.class) {
                if (f1461f < 10) {
                    objArr[0] = f1460e;
                    objArr[1] = iArr;
                    for (int i2 = i - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f1460e = objArr;
                    f1461f++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (C0490b.class) {
                if (f1459d < 10) {
                    objArr[0] = f1458c;
                    objArr[1] = iArr;
                    for (int i3 = i - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f1458c = objArr;
                    f1459d++;
                }
            }
        }
    }

    /* renamed from: b */
    private C0497h<E, E> m2179b() {
        if (this.f1465j == null) {
            this.f1465j = new C0497h<E, E>() {
                /* access modifiers changed from: protected */
                /* renamed from: a */
                public int mo1883a() {
                    return C0490b.this.f1464i;
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public int mo1884a(Object obj) {
                    return C0490b.this.mo1892a(obj);
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public Object mo1885a(int i, int i2) {
                    return C0490b.this.f1463h[i];
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public E mo1886a(int i, E e) {
                    throw new UnsupportedOperationException("not a map");
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public void mo1887a(int i) {
                    C0490b.this.mo1897c(i);
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public void mo1888a(E e, E e2) {
                    C0490b.this.add(e);
                }

                /* access modifiers changed from: protected */
                /* renamed from: b */
                public int mo1889b(Object obj) {
                    return C0490b.this.mo1892a(obj);
                }

                /* access modifiers changed from: protected */
                /* renamed from: b */
                public Map<E, E> mo1890b() {
                    throw new UnsupportedOperationException("not a map");
                }

                /* access modifiers changed from: protected */
                /* renamed from: c */
                public void mo1891c() {
                    C0490b.this.clear();
                }
            };
        }
        return this.f1465j;
    }

    /* renamed from: d */
    private void m2181d(int i) {
        if (i == 8) {
            synchronized (C0490b.class) {
                if (f1460e != null) {
                    Object[] objArr = f1460e;
                    this.f1463h = objArr;
                    f1460e = (Object[]) objArr[0];
                    this.f1462g = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f1461f--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C0490b.class) {
                if (f1458c != null) {
                    Object[] objArr2 = f1458c;
                    this.f1463h = objArr2;
                    f1458c = (Object[]) objArr2[0];
                    this.f1462g = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f1459d--;
                    return;
                }
            }
        }
        this.f1462g = new int[i];
        this.f1463h = new Object[i];
    }

    /* renamed from: a */
    public int mo1892a(Object obj) {
        return obj == null ? m2175a() : m2177a(obj, obj.hashCode());
    }

    /* renamed from: a */
    public void mo1893a(int i) {
        if (this.f1462g.length < i) {
            int[] iArr = this.f1462g;
            Object[] objArr = this.f1463h;
            m2181d(i);
            if (this.f1464i > 0) {
                System.arraycopy(iArr, 0, this.f1462g, 0, this.f1464i);
                System.arraycopy(objArr, 0, this.f1463h, 0, this.f1464i);
            }
            m2178a(iArr, objArr, this.f1464i);
        }
    }

    public boolean add(E e) {
        int i;
        int i2;
        if (e == null) {
            i2 = m2175a();
            i = 0;
        } else {
            int hashCode = e.hashCode();
            i = hashCode;
            i2 = m2177a(e, hashCode);
        }
        if (i2 >= 0) {
            return false;
        }
        int i3 = i2 ^ -1;
        if (this.f1464i >= this.f1462g.length) {
            int i4 = 4;
            if (this.f1464i >= 8) {
                i4 = (this.f1464i >> 1) + this.f1464i;
            } else if (this.f1464i >= 4) {
                i4 = 8;
            }
            int[] iArr = this.f1462g;
            Object[] objArr = this.f1463h;
            m2181d(i4);
            if (this.f1462g.length > 0) {
                System.arraycopy(iArr, 0, this.f1462g, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f1463h, 0, objArr.length);
            }
            m2178a(iArr, objArr, this.f1464i);
        }
        if (i3 < this.f1464i) {
            int i5 = i3 + 1;
            System.arraycopy(this.f1462g, i3, this.f1462g, i5, this.f1464i - i3);
            System.arraycopy(this.f1463h, i3, this.f1463h, i5, this.f1464i - i3);
        }
        this.f1462g[i3] = i;
        this.f1463h[i3] = e;
        this.f1464i++;
        return true;
    }

    public boolean addAll(Collection<? extends E> collection) {
        mo1893a(this.f1464i + collection.size());
        boolean z = false;
        for (Object add : collection) {
            z |= add(add);
        }
        return z;
    }

    /* renamed from: b */
    public E mo1896b(int i) {
        return this.f1463h[i];
    }

    /* renamed from: c */
    public E mo1897c(int i) {
        E e = this.f1463h[i];
        if (this.f1464i <= 1) {
            m2178a(this.f1462g, this.f1463h, this.f1464i);
            this.f1462g = f1456a;
            this.f1463h = f1457b;
            this.f1464i = 0;
        } else {
            int i2 = 8;
            if (this.f1462g.length <= 8 || this.f1464i >= this.f1462g.length / 3) {
                this.f1464i--;
                if (i < this.f1464i) {
                    int i3 = i + 1;
                    System.arraycopy(this.f1462g, i3, this.f1462g, i, this.f1464i - i);
                    System.arraycopy(this.f1463h, i3, this.f1463h, i, this.f1464i - i);
                }
                this.f1463h[this.f1464i] = null;
            } else {
                if (this.f1464i > 8) {
                    i2 = (this.f1464i >> 1) + this.f1464i;
                }
                int[] iArr = this.f1462g;
                Object[] objArr = this.f1463h;
                m2181d(i2);
                this.f1464i--;
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.f1462g, 0, i);
                    System.arraycopy(objArr, 0, this.f1463h, 0, i);
                }
                if (i < this.f1464i) {
                    int i4 = i + 1;
                    System.arraycopy(iArr, i4, this.f1462g, i, this.f1464i - i);
                    System.arraycopy(objArr, i4, this.f1463h, i, this.f1464i - i);
                }
            }
        }
        return e;
    }

    public void clear() {
        if (this.f1464i != 0) {
            m2178a(this.f1462g, this.f1463h, this.f1464i);
            this.f1462g = f1456a;
            this.f1463h = f1457b;
            this.f1464i = 0;
        }
    }

    public boolean contains(Object obj) {
        return mo1892a(obj) >= 0;
    }

    public boolean containsAll(Collection<?> collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            int i = 0;
            while (i < this.f1464i) {
                try {
                    if (!set.contains(mo1896b(i))) {
                        return false;
                    }
                    i++;
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        int[] iArr = this.f1462g;
        int i = 0;
        for (int i2 = 0; i2 < this.f1464i; i2++) {
            i += iArr[i2];
        }
        return i;
    }

    public boolean isEmpty() {
        return this.f1464i <= 0;
    }

    public Iterator<E> iterator() {
        return m2179b().mo1939e().iterator();
    }

    public boolean remove(Object obj) {
        int a = mo1892a(obj);
        if (a < 0) {
            return false;
        }
        mo1897c(a);
        return true;
    }

    public boolean removeAll(Collection<?> collection) {
        boolean z = false;
        for (Object remove : collection) {
            z |= remove(remove);
        }
        return z;
    }

    public boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int i = this.f1464i - 1; i >= 0; i--) {
            if (!collection.contains(this.f1463h[i])) {
                mo1897c(i);
                z = true;
            }
        }
        return z;
    }

    public int size() {
        return this.f1464i;
    }

    public Object[] toArray() {
        Object[] objArr = new Object[this.f1464i];
        System.arraycopy(this.f1463h, 0, objArr, 0, this.f1464i);
        return objArr;
    }

    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f1464i) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f1464i);
        }
        System.arraycopy(this.f1463h, 0, tArr, 0, this.f1464i);
        if (tArr.length > this.f1464i) {
            tArr[this.f1464i] = null;
        }
        return tArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1464i * 14);
        sb.append('{');
        for (int i = 0; i < this.f1464i; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object b = mo1896b(i);
            if (b != this) {
                sb.append(b);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
