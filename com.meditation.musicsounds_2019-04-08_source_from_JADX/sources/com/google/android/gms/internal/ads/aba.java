package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class aba extends C4113zb<Long> implements aan<Long>, RandomAccess {

    /* renamed from: a */
    private static final aba f11384a;

    /* renamed from: b */
    private long[] f11385b;

    /* renamed from: c */
    private int f11386c;

    static {
        aba aba = new aba();
        f11384a = aba;
        aba.mo11502b();
    }

    aba() {
        this(new long[10], 0);
    }

    private aba(long[] jArr, int i) {
        this.f11385b = jArr;
        this.f11386c = i;
    }

    /* renamed from: a */
    private final void m15429a(int i, long j) {
        mo13833c();
        if (i < 0 || i > this.f11386c) {
            throw new IndexOutOfBoundsException(m15431d(i));
        }
        if (this.f11386c < this.f11385b.length) {
            System.arraycopy(this.f11385b, i, this.f11385b, i + 1, this.f11386c - i);
        } else {
            long[] jArr = new long[(((this.f11386c * 3) / 2) + 1)];
            System.arraycopy(this.f11385b, 0, jArr, 0, i);
            System.arraycopy(this.f11385b, i, jArr, i + 1, this.f11386c - i);
            this.f11385b = jArr;
        }
        this.f11385b[i] = j;
        this.f11386c++;
        this.modCount++;
    }

    /* renamed from: c */
    private final void m15430c(int i) {
        if (i < 0 || i >= this.f11386c) {
            throw new IndexOutOfBoundsException(m15431d(i));
        }
    }

    /* renamed from: d */
    private final String m15431d(int i) {
        int i2 = this.f11386c;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: a */
    public final /* synthetic */ aan mo11460a(int i) {
        if (i >= this.f11386c) {
            return new aba(Arrays.copyOf(this.f11385b, i), this.f11386c);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public final void mo11535a(long j) {
        m15429a(this.f11386c, j);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        m15429a(i, ((Long) obj).longValue());
    }

    public final boolean addAll(Collection<? extends Long> collection) {
        mo13833c();
        aak.m15381a(collection);
        if (!(collection instanceof aba)) {
            return super.addAll(collection);
        }
        aba aba = (aba) collection;
        if (aba.f11386c == 0) {
            return false;
        }
        if (Integer.MAX_VALUE - this.f11386c >= aba.f11386c) {
            int i = this.f11386c + aba.f11386c;
            if (i > this.f11385b.length) {
                this.f11385b = Arrays.copyOf(this.f11385b, i);
            }
            System.arraycopy(aba.f11385b, 0, this.f11385b, this.f11386c, aba.f11386c);
            this.f11386c = i;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: b */
    public final long mo11536b(int i) {
        m15430c(i);
        return this.f11385b[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aba)) {
            return super.equals(obj);
        }
        aba aba = (aba) obj;
        if (this.f11386c != aba.f11386c) {
            return false;
        }
        long[] jArr = aba.f11385b;
        for (int i = 0; i < this.f11386c; i++) {
            if (this.f11385b[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        return Long.valueOf(mo11536b(i));
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f11386c; i2++) {
            i = (i * 31) + aak.m15379a(this.f11385b[i2]);
        }
        return i;
    }

    public final /* synthetic */ Object remove(int i) {
        mo13833c();
        m15430c(i);
        long j = this.f11385b[i];
        if (i < this.f11386c - 1) {
            System.arraycopy(this.f11385b, i + 1, this.f11385b, i, this.f11386c - i);
        }
        this.f11386c--;
        this.modCount++;
        return Long.valueOf(j);
    }

    public final boolean remove(Object obj) {
        mo13833c();
        for (int i = 0; i < this.f11386c; i++) {
            if (obj.equals(Long.valueOf(this.f11385b[i]))) {
                System.arraycopy(this.f11385b, i + 1, this.f11385b, i, this.f11386c - i);
                this.f11386c--;
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
            System.arraycopy(this.f11385b, i2, this.f11385b, i, this.f11386c - i2);
            this.f11386c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        mo13833c();
        m15430c(i);
        long j = this.f11385b[i];
        this.f11385b[i] = longValue;
        return Long.valueOf(j);
    }

    public final int size() {
        return this.f11386c;
    }
}
