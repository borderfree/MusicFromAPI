package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.eg */
final class C4349eg extends C4347ee<Boolean> implements C4394fs<Boolean>, C4432hc, RandomAccess {

    /* renamed from: a */
    private static final C4349eg f16059a;

    /* renamed from: b */
    private boolean[] f16060b;

    /* renamed from: c */
    private int f16061c;

    static {
        C4349eg egVar = new C4349eg();
        f16059a = egVar;
        egVar.mo14312b();
    }

    C4349eg() {
        this(new boolean[10], 0);
    }

    private C4349eg(boolean[] zArr, int i) {
        this.f16060b = zArr;
        this.f16061c = i;
    }

    /* renamed from: a */
    private final void m21322a(int i, boolean z) {
        mo14313c();
        if (i < 0 || i > this.f16061c) {
            throw new IndexOutOfBoundsException(m21324c(i));
        }
        if (this.f16061c < this.f16060b.length) {
            System.arraycopy(this.f16060b, i, this.f16060b, i + 1, this.f16061c - i);
        } else {
            boolean[] zArr = new boolean[(((this.f16061c * 3) / 2) + 1)];
            System.arraycopy(this.f16060b, 0, zArr, 0, i);
            System.arraycopy(this.f16060b, i, zArr, i + 1, this.f16061c - i);
            this.f16060b = zArr;
        }
        this.f16060b[i] = z;
        this.f16061c++;
        this.modCount++;
    }

    /* renamed from: b */
    private final void m21323b(int i) {
        if (i < 0 || i >= this.f16061c) {
            throw new IndexOutOfBoundsException(m21324c(i));
        }
    }

    /* renamed from: c */
    private final String m21324c(int i) {
        int i2 = this.f16061c;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: a */
    public final /* synthetic */ C4394fs mo14322a(int i) {
        if (i >= this.f16061c) {
            return new C4349eg(Arrays.copyOf(this.f16060b, i), this.f16061c);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public final void mo14323a(boolean z) {
        m21322a(this.f16061c, z);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        m21322a(i, ((Boolean) obj).booleanValue());
    }

    public final boolean addAll(Collection<? extends Boolean> collection) {
        mo14313c();
        C4390fo.m21607a(collection);
        if (!(collection instanceof C4349eg)) {
            return super.addAll(collection);
        }
        C4349eg egVar = (C4349eg) collection;
        if (egVar.f16061c == 0) {
            return false;
        }
        if (Integer.MAX_VALUE - this.f16061c >= egVar.f16061c) {
            int i = this.f16061c + egVar.f16061c;
            if (i > this.f16060b.length) {
                this.f16060b = Arrays.copyOf(this.f16060b, i);
            }
            System.arraycopy(egVar.f16060b, 0, this.f16060b, this.f16061c, egVar.f16061c);
            this.f16061c = i;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4349eg)) {
            return super.equals(obj);
        }
        C4349eg egVar = (C4349eg) obj;
        if (this.f16061c != egVar.f16061c) {
            return false;
        }
        boolean[] zArr = egVar.f16060b;
        for (int i = 0; i < this.f16061c; i++) {
            if (this.f16060b[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        m21323b(i);
        return Boolean.valueOf(this.f16060b[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f16061c; i2++) {
            i = (i * 31) + C4390fo.m21606a(this.f16060b[i2]);
        }
        return i;
    }

    public final /* synthetic */ Object remove(int i) {
        mo14313c();
        m21323b(i);
        boolean z = this.f16060b[i];
        if (i < this.f16061c - 1) {
            System.arraycopy(this.f16060b, i + 1, this.f16060b, i, (this.f16061c - i) - 1);
        }
        this.f16061c--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    public final boolean remove(Object obj) {
        mo14313c();
        for (int i = 0; i < this.f16061c; i++) {
            if (obj.equals(Boolean.valueOf(this.f16060b[i]))) {
                System.arraycopy(this.f16060b, i + 1, this.f16060b, i, (this.f16061c - i) - 1);
                this.f16061c--;
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
            System.arraycopy(this.f16060b, i2, this.f16060b, i, this.f16061c - i2);
            this.f16061c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo14313c();
        m21323b(i);
        boolean z = this.f16060b[i];
        this.f16060b[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    public final int size() {
        return this.f16061c;
    }
}
