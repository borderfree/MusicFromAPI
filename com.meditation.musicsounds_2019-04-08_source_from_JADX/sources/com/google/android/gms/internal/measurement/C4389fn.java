package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.fn */
final class C4389fn extends C4347ee<Integer> implements C4394fs<Integer>, C4432hc, RandomAccess {

    /* renamed from: a */
    private static final C4389fn f16133a;

    /* renamed from: b */
    private int[] f16134b;

    /* renamed from: c */
    private int f16135c;

    static {
        C4389fn fnVar = new C4389fn();
        f16133a = fnVar;
        fnVar.mo14312b();
    }

    C4389fn() {
        this(new int[10], 0);
    }

    private C4389fn(int[] iArr, int i) {
        this.f16134b = iArr;
        this.f16135c = i;
    }

    /* renamed from: a */
    private final void m21598a(int i, int i2) {
        mo14313c();
        if (i < 0 || i > this.f16135c) {
            throw new IndexOutOfBoundsException(m21600e(i));
        }
        if (this.f16135c < this.f16134b.length) {
            System.arraycopy(this.f16134b, i, this.f16134b, i + 1, this.f16135c - i);
        } else {
            int[] iArr = new int[(((this.f16135c * 3) / 2) + 1)];
            System.arraycopy(this.f16134b, 0, iArr, 0, i);
            System.arraycopy(this.f16134b, i, iArr, i + 1, this.f16135c - i);
            this.f16134b = iArr;
        }
        this.f16134b[i] = i2;
        this.f16135c++;
        this.modCount++;
    }

    /* renamed from: d */
    private final void m21599d(int i) {
        if (i < 0 || i >= this.f16135c) {
            throw new IndexOutOfBoundsException(m21600e(i));
        }
    }

    /* renamed from: e */
    private final String m21600e(int i) {
        int i2 = this.f16135c;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: a */
    public final /* synthetic */ C4394fs mo14322a(int i) {
        if (i >= this.f16135c) {
            return new C4389fn(Arrays.copyOf(this.f16134b, i), this.f16135c);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ void add(int i, Object obj) {
        m21598a(i, ((Integer) obj).intValue());
    }

    public final boolean addAll(Collection<? extends Integer> collection) {
        mo14313c();
        C4390fo.m21607a(collection);
        if (!(collection instanceof C4389fn)) {
            return super.addAll(collection);
        }
        C4389fn fnVar = (C4389fn) collection;
        if (fnVar.f16135c == 0) {
            return false;
        }
        if (Integer.MAX_VALUE - this.f16135c >= fnVar.f16135c) {
            int i = this.f16135c + fnVar.f16135c;
            if (i > this.f16134b.length) {
                this.f16134b = Arrays.copyOf(this.f16134b, i);
            }
            System.arraycopy(fnVar.f16134b, 0, this.f16134b, this.f16135c, fnVar.f16135c);
            this.f16135c = i;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: b */
    public final int mo14510b(int i) {
        m21599d(i);
        return this.f16134b[i];
    }

    /* renamed from: c */
    public final void mo14511c(int i) {
        m21598a(this.f16135c, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4389fn)) {
            return super.equals(obj);
        }
        C4389fn fnVar = (C4389fn) obj;
        if (this.f16135c != fnVar.f16135c) {
            return false;
        }
        int[] iArr = fnVar.f16134b;
        for (int i = 0; i < this.f16135c; i++) {
            if (this.f16134b[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        return Integer.valueOf(mo14510b(i));
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f16135c; i2++) {
            i = (i * 31) + this.f16134b[i2];
        }
        return i;
    }

    public final /* synthetic */ Object remove(int i) {
        mo14313c();
        m21599d(i);
        int i2 = this.f16134b[i];
        if (i < this.f16135c - 1) {
            System.arraycopy(this.f16134b, i + 1, this.f16134b, i, (this.f16135c - i) - 1);
        }
        this.f16135c--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    public final boolean remove(Object obj) {
        mo14313c();
        for (int i = 0; i < this.f16135c; i++) {
            if (obj.equals(Integer.valueOf(this.f16134b[i]))) {
                System.arraycopy(this.f16134b, i + 1, this.f16134b, i, (this.f16135c - i) - 1);
                this.f16135c--;
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
            System.arraycopy(this.f16134b, i2, this.f16134b, i, this.f16135c - i2);
            this.f16135c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        mo14313c();
        m21599d(i);
        int i2 = this.f16134b[i];
        this.f16134b[i] = intValue;
        return Integer.valueOf(i2);
    }

    public final int size() {
        return this.f16135c;
    }
}
