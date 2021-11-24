package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.ads.zf */
final class C4117zf extends C4113zb<Boolean> implements aan<Boolean>, RandomAccess {

    /* renamed from: a */
    private static final C4117zf f15168a;

    /* renamed from: b */
    private boolean[] f15169b;

    /* renamed from: c */
    private int f15170c;

    static {
        C4117zf zfVar = new C4117zf();
        f15168a = zfVar;
        zfVar.mo11502b();
    }

    C4117zf() {
        this(new boolean[10], 0);
    }

    private C4117zf(boolean[] zArr, int i) {
        this.f15169b = zArr;
        this.f15170c = i;
    }

    /* renamed from: a */
    private final void m20420a(int i, boolean z) {
        mo13833c();
        if (i < 0 || i > this.f15170c) {
            throw new IndexOutOfBoundsException(m20422c(i));
        }
        if (this.f15170c < this.f15169b.length) {
            System.arraycopy(this.f15169b, i, this.f15169b, i + 1, this.f15170c - i);
        } else {
            boolean[] zArr = new boolean[(((this.f15170c * 3) / 2) + 1)];
            System.arraycopy(this.f15169b, 0, zArr, 0, i);
            System.arraycopy(this.f15169b, i, zArr, i + 1, this.f15170c - i);
            this.f15169b = zArr;
        }
        this.f15169b[i] = z;
        this.f15170c++;
        this.modCount++;
    }

    /* renamed from: b */
    private final void m20421b(int i) {
        if (i < 0 || i >= this.f15170c) {
            throw new IndexOutOfBoundsException(m20422c(i));
        }
    }

    /* renamed from: c */
    private final String m20422c(int i) {
        int i2 = this.f15170c;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: a */
    public final /* synthetic */ aan mo11460a(int i) {
        if (i >= this.f15170c) {
            return new C4117zf(Arrays.copyOf(this.f15169b, i), this.f15170c);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public final void mo13834a(boolean z) {
        m20420a(this.f15170c, z);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        m20420a(i, ((Boolean) obj).booleanValue());
    }

    public final boolean addAll(Collection<? extends Boolean> collection) {
        mo13833c();
        aak.m15381a(collection);
        if (!(collection instanceof C4117zf)) {
            return super.addAll(collection);
        }
        C4117zf zfVar = (C4117zf) collection;
        if (zfVar.f15170c == 0) {
            return false;
        }
        if (Integer.MAX_VALUE - this.f15170c >= zfVar.f15170c) {
            int i = this.f15170c + zfVar.f15170c;
            if (i > this.f15169b.length) {
                this.f15169b = Arrays.copyOf(this.f15169b, i);
            }
            System.arraycopy(zfVar.f15169b, 0, this.f15169b, this.f15170c, zfVar.f15170c);
            this.f15170c = i;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4117zf)) {
            return super.equals(obj);
        }
        C4117zf zfVar = (C4117zf) obj;
        if (this.f15170c != zfVar.f15170c) {
            return false;
        }
        boolean[] zArr = zfVar.f15169b;
        for (int i = 0; i < this.f15170c; i++) {
            if (this.f15169b[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        m20421b(i);
        return Boolean.valueOf(this.f15169b[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f15170c; i2++) {
            i = (i * 31) + aak.m15380a(this.f15169b[i2]);
        }
        return i;
    }

    public final /* synthetic */ Object remove(int i) {
        mo13833c();
        m20421b(i);
        boolean z = this.f15169b[i];
        if (i < this.f15170c - 1) {
            System.arraycopy(this.f15169b, i + 1, this.f15169b, i, this.f15170c - i);
        }
        this.f15170c--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    public final boolean remove(Object obj) {
        mo13833c();
        for (int i = 0; i < this.f15170c; i++) {
            if (obj.equals(Boolean.valueOf(this.f15169b[i]))) {
                System.arraycopy(this.f15169b, i + 1, this.f15169b, i, this.f15170c - i);
                this.f15170c--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo13833c();
        if (i2 >= i) {
            System.arraycopy(this.f15169b, i2, this.f15169b, i, this.f15170c - i2);
            this.f15170c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo13833c();
        m20421b(i);
        boolean z = this.f15169b[i];
        this.f15169b[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    public final int size() {
        return this.f15170c;
    }
}
