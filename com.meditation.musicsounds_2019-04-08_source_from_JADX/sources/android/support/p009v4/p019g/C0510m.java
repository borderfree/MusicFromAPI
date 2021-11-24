package android.support.p009v4.p019g;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* renamed from: android.support.v4.g.m */
public class C0510m<K, V> {

    /* renamed from: b */
    static Object[] f1505b;

    /* renamed from: c */
    static int f1506c;

    /* renamed from: d */
    static Object[] f1507d;

    /* renamed from: e */
    static int f1508e;

    /* renamed from: f */
    int[] f1509f;

    /* renamed from: g */
    Object[] f1510g;

    /* renamed from: h */
    int f1511h;

    public C0510m() {
        this.f1509f = C0492c.f1467a;
        this.f1510g = C0492c.f1469c;
        this.f1511h = 0;
    }

    public C0510m(int i) {
        if (i == 0) {
            this.f1509f = C0492c.f1467a;
            this.f1510g = C0492c.f1469c;
        } else {
            m2255e(i);
        }
        this.f1511h = 0;
    }

    public C0510m(C0510m<K, V> mVar) {
        this();
        if (mVar != null) {
            mo2008a(mVar);
        }
    }

    /* renamed from: a */
    private static int m2253a(int[] iArr, int i, int i2) {
        try {
            return C0492c.m2196a(iArr, i, i2);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: a */
    private static void m2254a(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C0488a.class) {
                if (f1508e < 10) {
                    objArr[0] = f1507d;
                    objArr[1] = iArr;
                    for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f1507d = objArr;
                    f1508e++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (C0488a.class) {
                if (f1506c < 10) {
                    objArr[0] = f1505b;
                    objArr[1] = iArr;
                    for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f1505b = objArr;
                    f1506c++;
                }
            }
        }
    }

    /* renamed from: e */
    private void m2255e(int i) {
        if (i == 8) {
            synchronized (C0488a.class) {
                if (f1507d != null) {
                    Object[] objArr = f1507d;
                    this.f1510g = objArr;
                    f1507d = (Object[]) objArr[0];
                    this.f1509f = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f1508e--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C0488a.class) {
                if (f1505b != null) {
                    Object[] objArr2 = f1505b;
                    this.f1510g = objArr2;
                    f1505b = (Object[]) objArr2[0];
                    this.f1509f = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f1506c--;
                    return;
                }
            }
        }
        this.f1509f = new int[i];
        this.f1510g = new Object[(i << 1)];
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo2003a() {
        int i = this.f1511h;
        if (i == 0) {
            return -1;
        }
        int a = m2253a(this.f1509f, i, 0);
        if (a < 0 || this.f1510g[a << 1] == null) {
            return a;
        }
        int i2 = a + 1;
        while (i2 < i && this.f1509f[i2] == 0) {
            if (this.f1510g[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        int i3 = a - 1;
        while (i3 >= 0 && this.f1509f[i3] == 0) {
            if (this.f1510g[i3 << 1] == null) {
                return i3;
            }
            i3--;
        }
        return i2 ^ -1;
    }

    /* renamed from: a */
    public int mo2004a(Object obj) {
        return obj == null ? mo2003a() : mo2005a(obj, obj.hashCode());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo2005a(Object obj, int i) {
        int i2 = this.f1511h;
        if (i2 == 0) {
            return -1;
        }
        int a = m2253a(this.f1509f, i2, i);
        if (a < 0 || obj.equals(this.f1510g[a << 1])) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.f1509f[i3] == i) {
            if (obj.equals(this.f1510g[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        int i4 = a - 1;
        while (i4 >= 0 && this.f1509f[i4] == i) {
            if (obj.equals(this.f1510g[i4 << 1])) {
                return i4;
            }
            i4--;
        }
        return i3 ^ -1;
    }

    /* renamed from: a */
    public V mo2006a(int i, V v) {
        int i2 = (i << 1) + 1;
        V v2 = this.f1510g[i2];
        this.f1510g[i2] = v;
        return v2;
    }

    /* renamed from: a */
    public void mo2007a(int i) {
        int i2 = this.f1511h;
        if (this.f1509f.length < i) {
            int[] iArr = this.f1509f;
            Object[] objArr = this.f1510g;
            m2255e(i);
            if (this.f1511h > 0) {
                System.arraycopy(iArr, 0, this.f1509f, 0, i2);
                System.arraycopy(objArr, 0, this.f1510g, 0, i2 << 1);
            }
            m2254a(iArr, objArr, i2);
        }
        if (this.f1511h != i2) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: a */
    public void mo2008a(C0510m<? extends K, ? extends V> mVar) {
        int i = mVar.f1511h;
        mo2007a(this.f1511h + i);
        if (this.f1511h != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(mVar.mo2010b(i2), mVar.mo2011c(i2));
            }
        } else if (i > 0) {
            System.arraycopy(mVar.f1509f, 0, this.f1509f, 0, i);
            System.arraycopy(mVar.f1510g, 0, this.f1510g, 0, i << 1);
            this.f1511h = i;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo2009b(Object obj) {
        int i = this.f1511h * 2;
        Object[] objArr = this.f1510g;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
        } else {
            for (int i3 = 1; i3 < i; i3 += 2) {
                if (obj.equals(objArr[i3])) {
                    return i3 >> 1;
                }
            }
        }
        return -1;
    }

    /* renamed from: b */
    public K mo2010b(int i) {
        return this.f1510g[i << 1];
    }

    /* renamed from: c */
    public V mo2011c(int i) {
        return this.f1510g[(i << 1) + 1];
    }

    public void clear() {
        if (this.f1511h > 0) {
            int[] iArr = this.f1509f;
            Object[] objArr = this.f1510g;
            int i = this.f1511h;
            this.f1509f = C0492c.f1467a;
            this.f1510g = C0492c.f1469c;
            this.f1511h = 0;
            m2254a(iArr, objArr, i);
        }
        if (this.f1511h > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return mo2004a(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return mo2009b(obj) >= 0;
    }

    /* renamed from: d */
    public V mo2015d(int i) {
        int i2 = i << 1;
        V v = this.f1510g[i2 + 1];
        int i3 = this.f1511h;
        int i4 = 0;
        if (i3 <= 1) {
            m2254a(this.f1509f, this.f1510g, i3);
            this.f1509f = C0492c.f1467a;
            this.f1510g = C0492c.f1469c;
        } else {
            int i5 = i3 - 1;
            int i6 = 8;
            if (this.f1509f.length <= 8 || this.f1511h >= this.f1509f.length / 3) {
                if (i < i5) {
                    int i7 = i + 1;
                    int i8 = i5 - i;
                    System.arraycopy(this.f1509f, i7, this.f1509f, i, i8);
                    System.arraycopy(this.f1510g, i7 << 1, this.f1510g, i2, i8 << 1);
                }
                int i9 = i5 << 1;
                this.f1510g[i9] = null;
                this.f1510g[i9 + 1] = null;
            } else {
                if (i3 > 8) {
                    i6 = i3 + (i3 >> 1);
                }
                int[] iArr = this.f1509f;
                Object[] objArr = this.f1510g;
                m2255e(i6);
                if (i3 == this.f1511h) {
                    if (i > 0) {
                        System.arraycopy(iArr, 0, this.f1509f, 0, i);
                        System.arraycopy(objArr, 0, this.f1510g, 0, i2);
                    }
                    if (i < i5) {
                        int i10 = i + 1;
                        int i11 = i5 - i;
                        System.arraycopy(iArr, i10, this.f1509f, i, i11);
                        System.arraycopy(objArr, i10 << 1, this.f1510g, i2, i11 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            }
            i4 = i5;
        }
        if (i3 == this.f1511h) {
            this.f1511h = i4;
            return v;
        }
        throw new ConcurrentModificationException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0510m) {
            C0510m mVar = (C0510m) obj;
            if (size() != mVar.size()) {
                return false;
            }
            int i = 0;
            while (i < this.f1511h) {
                try {
                    Object b = mo2010b(i);
                    Object c = mo2011c(i);
                    Object obj2 = mVar.get(b);
                    if (c == null) {
                        if (obj2 != null || !mVar.containsKey(b)) {
                            return false;
                        }
                    } else if (!c.equals(obj2)) {
                        return false;
                    }
                    i++;
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            int i2 = 0;
            while (i2 < this.f1511h) {
                try {
                    Object b2 = mo2010b(i2);
                    Object c2 = mo2011c(i2);
                    Object obj3 = map.get(b2);
                    if (c2 == null) {
                        if (obj3 != null || !map.containsKey(b2)) {
                            return false;
                        }
                    } else if (!c2.equals(obj3)) {
                        return false;
                    }
                    i2++;
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public V get(Object obj) {
        int a = mo2004a(obj);
        if (a >= 0) {
            return this.f1510g[(a << 1) + 1];
        }
        return null;
    }

    public int hashCode() {
        int[] iArr = this.f1509f;
        Object[] objArr = this.f1510g;
        int i = this.f1511h;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < i) {
            Object obj = objArr[i3];
            i4 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i2];
            i2++;
            i3 += 2;
        }
        return i4;
    }

    public boolean isEmpty() {
        return this.f1511h <= 0;
    }

    public V put(K k, V v) {
        int i;
        int i2;
        int i3 = this.f1511h;
        if (k == null) {
            i2 = mo2003a();
            i = 0;
        } else {
            int hashCode = k.hashCode();
            i = hashCode;
            i2 = mo2005a((Object) k, hashCode);
        }
        if (i2 >= 0) {
            int i4 = (i2 << 1) + 1;
            V v2 = this.f1510g[i4];
            this.f1510g[i4] = v;
            return v2;
        }
        int i5 = i2 ^ -1;
        if (i3 >= this.f1509f.length) {
            int i6 = 4;
            if (i3 >= 8) {
                i6 = (i3 >> 1) + i3;
            } else if (i3 >= 4) {
                i6 = 8;
            }
            int[] iArr = this.f1509f;
            Object[] objArr = this.f1510g;
            m2255e(i6);
            if (i3 == this.f1511h) {
                if (this.f1509f.length > 0) {
                    System.arraycopy(iArr, 0, this.f1509f, 0, iArr.length);
                    System.arraycopy(objArr, 0, this.f1510g, 0, objArr.length);
                }
                m2254a(iArr, objArr, i3);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i5 < i3) {
            int i7 = i5 + 1;
            System.arraycopy(this.f1509f, i5, this.f1509f, i7, i3 - i5);
            System.arraycopy(this.f1510g, i5 << 1, this.f1510g, i7 << 1, (this.f1511h - i5) << 1);
        }
        if (i3 != this.f1511h || i5 >= this.f1509f.length) {
            throw new ConcurrentModificationException();
        }
        this.f1509f[i5] = i;
        int i8 = i5 << 1;
        this.f1510g[i8] = k;
        this.f1510g[i8 + 1] = v;
        this.f1511h++;
        return null;
    }

    public V remove(Object obj) {
        int a = mo2004a(obj);
        if (a >= 0) {
            return mo2015d(a);
        }
        return null;
    }

    public int size() {
        return this.f1511h;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1511h * 28);
        sb.append('{');
        for (int i = 0; i < this.f1511h; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object b = mo2010b(i);
            if (b != this) {
                sb.append(b);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object c = mo2011c(i);
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
