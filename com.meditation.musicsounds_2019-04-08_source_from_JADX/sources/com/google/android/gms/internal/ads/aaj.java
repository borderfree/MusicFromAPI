package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class aaj extends C4113zb<Integer> implements aan<Integer>, RandomAccess {

    /* renamed from: a */
    private static final aaj f11359a;

    /* renamed from: b */
    private int[] f11360b;

    /* renamed from: c */
    private int f11361c;

    static {
        aaj aaj = new aaj();
        f11359a = aaj;
        aaj.mo11502b();
    }

    aaj() {
        this(new int[10], 0);
    }

    private aaj(int[] iArr, int i) {
        this.f11360b = iArr;
        this.f11361c = i;
    }

    /* renamed from: a */
    private final void m15372a(int i, int i2) {
        mo13833c();
        if (i < 0 || i > this.f11361c) {
            throw new IndexOutOfBoundsException(m15374e(i));
        }
        if (this.f11361c < this.f11360b.length) {
            System.arraycopy(this.f11360b, i, this.f11360b, i + 1, this.f11361c - i);
        } else {
            int[] iArr = new int[(((this.f11361c * 3) / 2) + 1)];
            System.arraycopy(this.f11360b, 0, iArr, 0, i);
            System.arraycopy(this.f11360b, i, iArr, i + 1, this.f11361c - i);
            this.f11360b = iArr;
        }
        this.f11360b[i] = i2;
        this.f11361c++;
        this.modCount++;
    }

    /* renamed from: d */
    private final void m15373d(int i) {
        if (i < 0 || i >= this.f11361c) {
            throw new IndexOutOfBoundsException(m15374e(i));
        }
    }

    /* renamed from: e */
    private final String m15374e(int i) {
        int i2 = this.f11361c;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: a */
    public final /* synthetic */ aan mo11460a(int i) {
        if (i >= this.f11361c) {
            return new aaj(Arrays.copyOf(this.f11360b, i), this.f11361c);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ void add(int i, Object obj) {
        m15372a(i, ((Integer) obj).intValue());
    }

    public final boolean addAll(Collection<? extends Integer> collection) {
        mo13833c();
        aak.m15381a(collection);
        if (!(collection instanceof aaj)) {
            return super.addAll(collection);
        }
        aaj aaj = (aaj) collection;
        if (aaj.f11361c == 0) {
            return false;
        }
        if (Integer.MAX_VALUE - this.f11361c >= aaj.f11361c) {
            int i = this.f11361c + aaj.f11361c;
            if (i > this.f11360b.length) {
                this.f11360b = Arrays.copyOf(this.f11360b, i);
            }
            System.arraycopy(aaj.f11360b, 0, this.f11360b, this.f11361c, aaj.f11361c);
            this.f11361c = i;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: b */
    public final int mo11494b(int i) {
        m15373d(i);
        return this.f11360b[i];
    }

    /* renamed from: c */
    public final void mo11495c(int i) {
        m15372a(this.f11361c, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aaj)) {
            return super.equals(obj);
        }
        aaj aaj = (aaj) obj;
        if (this.f11361c != aaj.f11361c) {
            return false;
        }
        int[] iArr = aaj.f11360b;
        for (int i = 0; i < this.f11361c; i++) {
            if (this.f11360b[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        return Integer.valueOf(mo11494b(i));
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f11361c; i2++) {
            i = (i * 31) + this.f11360b[i2];
        }
        return i;
    }

    public final /* synthetic */ Object remove(int i) {
        mo13833c();
        m15373d(i);
        int i2 = this.f11360b[i];
        if (i < this.f11361c - 1) {
            System.arraycopy(this.f11360b, i + 1, this.f11360b, i, this.f11361c - i);
        }
        this.f11361c--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    public final boolean remove(Object obj) {
        mo13833c();
        for (int i = 0; i < this.f11361c; i++) {
            if (obj.equals(Integer.valueOf(this.f11360b[i]))) {
                System.arraycopy(this.f11360b, i + 1, this.f11360b, i, this.f11361c - i);
                this.f11361c--;
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
            System.arraycopy(this.f11360b, i2, this.f11360b, i, this.f11361c - i2);
            this.f11361c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        mo13833c();
        m15373d(i);
        int i2 = this.f11360b[i];
        this.f11360b[i] = intValue;
        return Integer.valueOf(i2);
    }

    public final int size() {
        return this.f11361c;
    }
}
