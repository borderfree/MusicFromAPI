package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.gf */
final class C4408gf extends C4347ee<Long> implements C4394fs<Long>, C4432hc, RandomAccess {

    /* renamed from: a */
    private static final C4408gf f16161a;

    /* renamed from: b */
    private long[] f16162b;

    /* renamed from: c */
    private int f16163c;

    static {
        C4408gf gfVar = new C4408gf();
        f16161a = gfVar;
        gfVar.mo14312b();
    }

    C4408gf() {
        this(new long[10], 0);
    }

    private C4408gf(long[] jArr, int i) {
        this.f16162b = jArr;
        this.f16163c = i;
    }

    /* renamed from: a */
    private final void m21665a(int i, long j) {
        mo14313c();
        if (i < 0 || i > this.f16163c) {
            throw new IndexOutOfBoundsException(m21667d(i));
        }
        if (this.f16163c < this.f16162b.length) {
            System.arraycopy(this.f16162b, i, this.f16162b, i + 1, this.f16163c - i);
        } else {
            long[] jArr = new long[(((this.f16163c * 3) / 2) + 1)];
            System.arraycopy(this.f16162b, 0, jArr, 0, i);
            System.arraycopy(this.f16162b, i, jArr, i + 1, this.f16163c - i);
            this.f16162b = jArr;
        }
        this.f16162b[i] = j;
        this.f16163c++;
        this.modCount++;
    }

    /* renamed from: c */
    private final void m21666c(int i) {
        if (i < 0 || i >= this.f16163c) {
            throw new IndexOutOfBoundsException(m21667d(i));
        }
    }

    /* renamed from: d */
    private final String m21667d(int i) {
        int i2 = this.f16163c;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: a */
    public final /* synthetic */ C4394fs mo14322a(int i) {
        if (i >= this.f16163c) {
            return new C4408gf(Arrays.copyOf(this.f16162b, i), this.f16163c);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public final void mo14553a(long j) {
        m21665a(this.f16163c, j);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        m21665a(i, ((Long) obj).longValue());
    }

    public final boolean addAll(Collection<? extends Long> collection) {
        mo14313c();
        C4390fo.m21607a(collection);
        if (!(collection instanceof C4408gf)) {
            return super.addAll(collection);
        }
        C4408gf gfVar = (C4408gf) collection;
        if (gfVar.f16163c == 0) {
            return false;
        }
        if (Integer.MAX_VALUE - this.f16163c >= gfVar.f16163c) {
            int i = this.f16163c + gfVar.f16163c;
            if (i > this.f16162b.length) {
                this.f16162b = Arrays.copyOf(this.f16162b, i);
            }
            System.arraycopy(gfVar.f16162b, 0, this.f16162b, this.f16163c, gfVar.f16163c);
            this.f16163c = i;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: b */
    public final long mo14554b(int i) {
        m21666c(i);
        return this.f16162b[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4408gf)) {
            return super.equals(obj);
        }
        C4408gf gfVar = (C4408gf) obj;
        if (this.f16163c != gfVar.f16163c) {
            return false;
        }
        long[] jArr = gfVar.f16162b;
        for (int i = 0; i < this.f16163c; i++) {
            if (this.f16162b[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        return Long.valueOf(mo14554b(i));
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f16163c; i2++) {
            i = (i * 31) + C4390fo.m21605a(this.f16162b[i2]);
        }
        return i;
    }

    public final /* synthetic */ Object remove(int i) {
        mo14313c();
        m21666c(i);
        long j = this.f16162b[i];
        if (i < this.f16163c - 1) {
            System.arraycopy(this.f16162b, i + 1, this.f16162b, i, (this.f16163c - i) - 1);
        }
        this.f16163c--;
        this.modCount++;
        return Long.valueOf(j);
    }

    public final boolean remove(Object obj) {
        mo14313c();
        for (int i = 0; i < this.f16163c; i++) {
            if (obj.equals(Long.valueOf(this.f16162b[i]))) {
                System.arraycopy(this.f16162b, i + 1, this.f16162b, i, (this.f16163c - i) - 1);
                this.f16163c--;
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
            System.arraycopy(this.f16162b, i2, this.f16162b, i, this.f16163c - i2);
            this.f16163c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        mo14313c();
        m21666c(i);
        long j = this.f16162b[i];
        this.f16162b[i] = longValue;
        return Long.valueOf(j);
    }

    public final int size() {
        return this.f16163c;
    }
}
