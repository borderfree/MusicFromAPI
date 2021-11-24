package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.ex */
final class C4366ex extends C4347ee<Double> implements C4394fs<Double>, C4432hc, RandomAccess {

    /* renamed from: a */
    private static final C4366ex f16086a;

    /* renamed from: b */
    private double[] f16087b;

    /* renamed from: c */
    private int f16088c;

    static {
        C4366ex exVar = new C4366ex();
        f16086a = exVar;
        exVar.mo14312b();
    }

    C4366ex() {
        this(new double[10], 0);
    }

    private C4366ex(double[] dArr, int i) {
        this.f16087b = dArr;
        this.f16088c = i;
    }

    /* renamed from: a */
    private final void m21491a(int i, double d) {
        mo14313c();
        if (i < 0 || i > this.f16088c) {
            throw new IndexOutOfBoundsException(m21493c(i));
        }
        if (this.f16088c < this.f16087b.length) {
            System.arraycopy(this.f16087b, i, this.f16087b, i + 1, this.f16088c - i);
        } else {
            double[] dArr = new double[(((this.f16088c * 3) / 2) + 1)];
            System.arraycopy(this.f16087b, 0, dArr, 0, i);
            System.arraycopy(this.f16087b, i, dArr, i + 1, this.f16088c - i);
            this.f16087b = dArr;
        }
        this.f16087b[i] = d;
        this.f16088c++;
        this.modCount++;
    }

    /* renamed from: b */
    private final void m21492b(int i) {
        if (i < 0 || i >= this.f16088c) {
            throw new IndexOutOfBoundsException(m21493c(i));
        }
    }

    /* renamed from: c */
    private final String m21493c(int i) {
        int i2 = this.f16088c;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: a */
    public final /* synthetic */ C4394fs mo14322a(int i) {
        if (i >= this.f16088c) {
            return new C4366ex(Arrays.copyOf(this.f16087b, i), this.f16088c);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public final void mo14447a(double d) {
        m21491a(this.f16088c, d);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        m21491a(i, ((Double) obj).doubleValue());
    }

    public final boolean addAll(Collection<? extends Double> collection) {
        mo14313c();
        C4390fo.m21607a(collection);
        if (!(collection instanceof C4366ex)) {
            return super.addAll(collection);
        }
        C4366ex exVar = (C4366ex) collection;
        if (exVar.f16088c == 0) {
            return false;
        }
        if (Integer.MAX_VALUE - this.f16088c >= exVar.f16088c) {
            int i = this.f16088c + exVar.f16088c;
            if (i > this.f16087b.length) {
                this.f16087b = Arrays.copyOf(this.f16087b, i);
            }
            System.arraycopy(exVar.f16087b, 0, this.f16087b, this.f16088c, exVar.f16088c);
            this.f16088c = i;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4366ex)) {
            return super.equals(obj);
        }
        C4366ex exVar = (C4366ex) obj;
        if (this.f16088c != exVar.f16088c) {
            return false;
        }
        double[] dArr = exVar.f16087b;
        for (int i = 0; i < this.f16088c; i++) {
            if (Double.doubleToLongBits(this.f16087b[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        m21492b(i);
        return Double.valueOf(this.f16087b[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f16088c; i2++) {
            i = (i * 31) + C4390fo.m21605a(Double.doubleToLongBits(this.f16087b[i2]));
        }
        return i;
    }

    public final /* synthetic */ Object remove(int i) {
        mo14313c();
        m21492b(i);
        double d = this.f16087b[i];
        if (i < this.f16088c - 1) {
            System.arraycopy(this.f16087b, i + 1, this.f16087b, i, (this.f16088c - i) - 1);
        }
        this.f16088c--;
        this.modCount++;
        return Double.valueOf(d);
    }

    public final boolean remove(Object obj) {
        mo14313c();
        for (int i = 0; i < this.f16088c; i++) {
            if (obj.equals(Double.valueOf(this.f16087b[i]))) {
                System.arraycopy(this.f16087b, i + 1, this.f16087b, i, (this.f16088c - i) - 1);
                this.f16088c--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo14313c();
        if (i2 >= i) {
            System.arraycopy(this.f16087b, i2, this.f16087b, i, this.f16088c - i2);
            this.f16088c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        mo14313c();
        m21492b(i);
        double d = this.f16087b[i];
        this.f16087b[i] = doubleValue;
        return Double.valueOf(d);
    }

    public final int size() {
        return this.f16088c;
    }
}
