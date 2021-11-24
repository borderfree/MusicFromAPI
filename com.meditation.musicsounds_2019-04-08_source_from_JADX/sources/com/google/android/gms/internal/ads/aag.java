package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class aag extends C4113zb<Float> implements aan<Float>, RandomAccess {

    /* renamed from: a */
    private static final aag f11337a;

    /* renamed from: b */
    private float[] f11338b;

    /* renamed from: c */
    private int f11339c;

    static {
        aag aag = new aag();
        f11337a = aag;
        aag.mo11502b();
    }

    aag() {
        this(new float[10], 0);
    }

    private aag(float[] fArr, int i) {
        this.f11338b = fArr;
        this.f11339c = i;
    }

    /* renamed from: a */
    private final void m15333a(int i, float f) {
        mo13833c();
        if (i < 0 || i > this.f11339c) {
            throw new IndexOutOfBoundsException(m15335c(i));
        }
        if (this.f11339c < this.f11338b.length) {
            System.arraycopy(this.f11338b, i, this.f11338b, i + 1, this.f11339c - i);
        } else {
            float[] fArr = new float[(((this.f11339c * 3) / 2) + 1)];
            System.arraycopy(this.f11338b, 0, fArr, 0, i);
            System.arraycopy(this.f11338b, i, fArr, i + 1, this.f11339c - i);
            this.f11338b = fArr;
        }
        this.f11338b[i] = f;
        this.f11339c++;
        this.modCount++;
    }

    /* renamed from: b */
    private final void m15334b(int i) {
        if (i < 0 || i >= this.f11339c) {
            throw new IndexOutOfBoundsException(m15335c(i));
        }
    }

    /* renamed from: c */
    private final String m15335c(int i) {
        int i2 = this.f11339c;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: a */
    public final /* synthetic */ aan mo11460a(int i) {
        if (i >= this.f11339c) {
            return new aag(Arrays.copyOf(this.f11338b, i), this.f11339c);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public final void mo11461a(float f) {
        m15333a(this.f11339c, f);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        m15333a(i, ((Float) obj).floatValue());
    }

    public final boolean addAll(Collection<? extends Float> collection) {
        mo13833c();
        aak.m15381a(collection);
        if (!(collection instanceof aag)) {
            return super.addAll(collection);
        }
        aag aag = (aag) collection;
        if (aag.f11339c == 0) {
            return false;
        }
        if (Integer.MAX_VALUE - this.f11339c >= aag.f11339c) {
            int i = this.f11339c + aag.f11339c;
            if (i > this.f11338b.length) {
                this.f11338b = Arrays.copyOf(this.f11338b, i);
            }
            System.arraycopy(aag.f11338b, 0, this.f11338b, this.f11339c, aag.f11339c);
            this.f11339c = i;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aag)) {
            return super.equals(obj);
        }
        aag aag = (aag) obj;
        if (this.f11339c != aag.f11339c) {
            return false;
        }
        float[] fArr = aag.f11338b;
        for (int i = 0; i < this.f11339c; i++) {
            if (this.f11338b[i] != fArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        m15334b(i);
        return Float.valueOf(this.f11338b[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f11339c; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f11338b[i2]);
        }
        return i;
    }

    public final /* synthetic */ Object remove(int i) {
        mo13833c();
        m15334b(i);
        float f = this.f11338b[i];
        if (i < this.f11339c - 1) {
            System.arraycopy(this.f11338b, i + 1, this.f11338b, i, this.f11339c - i);
        }
        this.f11339c--;
        this.modCount++;
        return Float.valueOf(f);
    }

    public final boolean remove(Object obj) {
        mo13833c();
        for (int i = 0; i < this.f11339c; i++) {
            if (obj.equals(Float.valueOf(this.f11338b[i]))) {
                System.arraycopy(this.f11338b, i + 1, this.f11338b, i, this.f11339c - i);
                this.f11339c--;
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
            System.arraycopy(this.f11338b, i2, this.f11338b, i, this.f11339c - i2);
            this.f11339c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        mo13833c();
        m15334b(i);
        float f = this.f11338b[i];
        this.f11338b[i] = floatValue;
        return Float.valueOf(f);
    }

    public final int size() {
        return this.f11339c;
    }
}
