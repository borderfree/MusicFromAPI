package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.ads.zt */
final class C4131zt extends C4113zb<Double> implements aan<Double>, RandomAccess {

    /* renamed from: a */
    private static final C4131zt f15196a;

    /* renamed from: b */
    private double[] f15197b;

    /* renamed from: c */
    private int f15198c;

    static {
        C4131zt ztVar = new C4131zt();
        f15196a = ztVar;
        ztVar.mo11502b();
    }

    C4131zt() {
        this(new double[10], 0);
    }

    private C4131zt(double[] dArr, int i) {
        this.f15197b = dArr;
        this.f15198c = i;
    }

    /* renamed from: a */
    private final void m20586a(int i, double d) {
        mo13833c();
        if (i < 0 || i > this.f15198c) {
            throw new IndexOutOfBoundsException(m20588c(i));
        }
        if (this.f15198c < this.f15197b.length) {
            System.arraycopy(this.f15197b, i, this.f15197b, i + 1, this.f15198c - i);
        } else {
            double[] dArr = new double[(((this.f15198c * 3) / 2) + 1)];
            System.arraycopy(this.f15197b, 0, dArr, 0, i);
            System.arraycopy(this.f15197b, i, dArr, i + 1, this.f15198c - i);
            this.f15197b = dArr;
        }
        this.f15197b[i] = d;
        this.f15198c++;
        this.modCount++;
    }

    /* renamed from: b */
    private final void m20587b(int i) {
        if (i < 0 || i >= this.f15198c) {
            throw new IndexOutOfBoundsException(m20588c(i));
        }
    }

    /* renamed from: c */
    private final String m20588c(int i) {
        int i2 = this.f15198c;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: a */
    public final /* synthetic */ aan mo11460a(int i) {
        if (i >= this.f15198c) {
            return new C4131zt(Arrays.copyOf(this.f15197b, i), this.f15198c);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public final void mo13871a(double d) {
        m20586a(this.f15198c, d);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        m20586a(i, ((Double) obj).doubleValue());
    }

    public final boolean addAll(Collection<? extends Double> collection) {
        mo13833c();
        aak.m15381a(collection);
        if (!(collection instanceof C4131zt)) {
            return super.addAll(collection);
        }
        C4131zt ztVar = (C4131zt) collection;
        if (ztVar.f15198c == 0) {
            return false;
        }
        if (Integer.MAX_VALUE - this.f15198c >= ztVar.f15198c) {
            int i = this.f15198c + ztVar.f15198c;
            if (i > this.f15197b.length) {
                this.f15197b = Arrays.copyOf(this.f15197b, i);
            }
            System.arraycopy(ztVar.f15197b, 0, this.f15197b, this.f15198c, ztVar.f15198c);
            this.f15198c = i;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4131zt)) {
            return super.equals(obj);
        }
        C4131zt ztVar = (C4131zt) obj;
        if (this.f15198c != ztVar.f15198c) {
            return false;
        }
        double[] dArr = ztVar.f15197b;
        for (int i = 0; i < this.f15198c; i++) {
            if (this.f15197b[i] != dArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        m20587b(i);
        return Double.valueOf(this.f15197b[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f15198c; i2++) {
            i = (i * 31) + aak.m15379a(Double.doubleToLongBits(this.f15197b[i2]));
        }
        return i;
    }

    public final /* synthetic */ Object remove(int i) {
        mo13833c();
        m20587b(i);
        double d = this.f15197b[i];
        if (i < this.f15198c - 1) {
            System.arraycopy(this.f15197b, i + 1, this.f15197b, i, this.f15198c - i);
        }
        this.f15198c--;
        this.modCount++;
        return Double.valueOf(d);
    }

    public final boolean remove(Object obj) {
        mo13833c();
        for (int i = 0; i < this.f15198c; i++) {
            if (obj.equals(Double.valueOf(this.f15197b[i]))) {
                System.arraycopy(this.f15197b, i + 1, this.f15197b, i, this.f15198c - i);
                this.f15198c--;
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
            System.arraycopy(this.f15197b, i2, this.f15197b, i, this.f15198c - i2);
            this.f15198c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        mo13833c();
        m20587b(i);
        double d = this.f15197b[i];
        this.f15197b[i] = doubleValue;
        return Double.valueOf(d);
    }

    public final int size() {
        return this.f15198c;
    }
}
