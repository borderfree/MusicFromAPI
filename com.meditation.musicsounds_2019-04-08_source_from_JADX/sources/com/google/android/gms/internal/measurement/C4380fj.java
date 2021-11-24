package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.fj */
final class C4380fj extends C4347ee<Float> implements C4394fs<Float>, C4432hc, RandomAccess {

    /* renamed from: a */
    private static final C4380fj f16109a;

    /* renamed from: b */
    private float[] f16110b;

    /* renamed from: c */
    private int f16111c;

    static {
        C4380fj fjVar = new C4380fj();
        f16109a = fjVar;
        fjVar.mo14312b();
    }

    C4380fj() {
        this(new float[10], 0);
    }

    private C4380fj(float[] fArr, int i) {
        this.f16110b = fArr;
        this.f16111c = i;
    }

    /* renamed from: a */
    private final void m21558a(int i, float f) {
        mo14313c();
        if (i < 0 || i > this.f16111c) {
            throw new IndexOutOfBoundsException(m21560c(i));
        }
        if (this.f16111c < this.f16110b.length) {
            System.arraycopy(this.f16110b, i, this.f16110b, i + 1, this.f16111c - i);
        } else {
            float[] fArr = new float[(((this.f16111c * 3) / 2) + 1)];
            System.arraycopy(this.f16110b, 0, fArr, 0, i);
            System.arraycopy(this.f16110b, i, fArr, i + 1, this.f16111c - i);
            this.f16110b = fArr;
        }
        this.f16110b[i] = f;
        this.f16111c++;
        this.modCount++;
    }

    /* renamed from: b */
    private final void m21559b(int i) {
        if (i < 0 || i >= this.f16111c) {
            throw new IndexOutOfBoundsException(m21560c(i));
        }
    }

    /* renamed from: c */
    private final String m21560c(int i) {
        int i2 = this.f16111c;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: a */
    public final /* synthetic */ C4394fs mo14322a(int i) {
        if (i >= this.f16111c) {
            return new C4380fj(Arrays.copyOf(this.f16110b, i), this.f16111c);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public final void mo14485a(float f) {
        m21558a(this.f16111c, f);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        m21558a(i, ((Float) obj).floatValue());
    }

    public final boolean addAll(Collection<? extends Float> collection) {
        mo14313c();
        C4390fo.m21607a(collection);
        if (!(collection instanceof C4380fj)) {
            return super.addAll(collection);
        }
        C4380fj fjVar = (C4380fj) collection;
        if (fjVar.f16111c == 0) {
            return false;
        }
        if (Integer.MAX_VALUE - this.f16111c >= fjVar.f16111c) {
            int i = this.f16111c + fjVar.f16111c;
            if (i > this.f16110b.length) {
                this.f16110b = Arrays.copyOf(this.f16110b, i);
            }
            System.arraycopy(fjVar.f16110b, 0, this.f16110b, this.f16111c, fjVar.f16111c);
            this.f16111c = i;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4380fj)) {
            return super.equals(obj);
        }
        C4380fj fjVar = (C4380fj) obj;
        if (this.f16111c != fjVar.f16111c) {
            return false;
        }
        float[] fArr = fjVar.f16110b;
        for (int i = 0; i < this.f16111c; i++) {
            if (Float.floatToIntBits(this.f16110b[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        m21559b(i);
        return Float.valueOf(this.f16110b[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f16111c; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f16110b[i2]);
        }
        return i;
    }

    public final /* synthetic */ Object remove(int i) {
        mo14313c();
        m21559b(i);
        float f = this.f16110b[i];
        if (i < this.f16111c - 1) {
            System.arraycopy(this.f16110b, i + 1, this.f16110b, i, (this.f16111c - i) - 1);
        }
        this.f16111c--;
        this.modCount++;
        return Float.valueOf(f);
    }

    public final boolean remove(Object obj) {
        mo14313c();
        for (int i = 0; i < this.f16111c; i++) {
            if (obj.equals(Float.valueOf(this.f16110b[i]))) {
                System.arraycopy(this.f16110b, i + 1, this.f16110b, i, (this.f16111c - i) - 1);
                this.f16111c--;
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
            System.arraycopy(this.f16110b, i2, this.f16110b, i, this.f16111c - i2);
            this.f16111c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        mo14313c();
        m21559b(i);
        float f = this.f16110b[i];
        this.f16110b[i] = floatValue;
        return Float.valueOf(f);
    }

    public final int size() {
        return this.f16111c;
    }
}
