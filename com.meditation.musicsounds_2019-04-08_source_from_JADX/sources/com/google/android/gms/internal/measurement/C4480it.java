package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.it */
public final class C4480it implements Cloneable {

    /* renamed from: a */
    private static final C4481iu f16315a = new C4481iu();

    /* renamed from: b */
    private boolean f16316b;

    /* renamed from: c */
    private int[] f16317c;

    /* renamed from: d */
    private C4481iu[] f16318d;

    /* renamed from: e */
    private int f16319e;

    C4480it() {
        this(10);
    }

    private C4480it(int i) {
        this.f16316b = false;
        int c = m22253c(i);
        this.f16317c = new int[c];
        this.f16318d = new C4481iu[c];
        this.f16319e = 0;
    }

    /* renamed from: c */
    private static int m22253c(int i) {
        int i2 = i << 2;
        int i3 = 4;
        while (true) {
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (i2 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        return i2 / 4;
    }

    /* renamed from: d */
    private final int m22254d(int i) {
        int i2 = this.f16319e - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            int i5 = this.f16317c[i4];
            if (i5 < i) {
                i3 = i4 + 1;
            } else if (i5 <= i) {
                return i4;
            } else {
                i2 = i4 - 1;
            }
        }
        return i3 ^ -1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final int mo14769a() {
        return this.f16319e;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C4481iu mo14770a(int i) {
        int d = m22254d(i);
        if (d < 0 || this.f16318d[d] == f16315a) {
            return null;
        }
        return this.f16318d[d];
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo14771a(int i, C4481iu iuVar) {
        int d = m22254d(i);
        if (d >= 0) {
            this.f16318d[d] = iuVar;
            return;
        }
        int i2 = d ^ -1;
        if (i2 >= this.f16319e || this.f16318d[i2] != f16315a) {
            if (this.f16319e >= this.f16317c.length) {
                int c = m22253c(this.f16319e + 1);
                int[] iArr = new int[c];
                C4481iu[] iuVarArr = new C4481iu[c];
                System.arraycopy(this.f16317c, 0, iArr, 0, this.f16317c.length);
                System.arraycopy(this.f16318d, 0, iuVarArr, 0, this.f16318d.length);
                this.f16317c = iArr;
                this.f16318d = iuVarArr;
            }
            if (this.f16319e - i2 != 0) {
                int i3 = i2 + 1;
                System.arraycopy(this.f16317c, i2, this.f16317c, i3, this.f16319e - i2);
                System.arraycopy(this.f16318d, i2, this.f16318d, i3, this.f16319e - i2);
            }
            this.f16317c[i2] = i;
            this.f16318d[i2] = iuVar;
            this.f16319e++;
            return;
        }
        this.f16317c[i2] = i;
        this.f16318d[i2] = iuVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final C4481iu mo14772b(int i) {
        return this.f16318d[i];
    }

    /* renamed from: b */
    public final boolean mo14773b() {
        return this.f16319e == 0;
    }

    public final /* synthetic */ Object clone() {
        int i = this.f16319e;
        C4480it itVar = new C4480it(i);
        System.arraycopy(this.f16317c, 0, itVar.f16317c, 0, i);
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f16318d[i2] != null) {
                itVar.f16318d[i2] = (C4481iu) this.f16318d[i2].clone();
            }
        }
        itVar.f16319e = i;
        return itVar;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4480it)) {
            return false;
        }
        C4480it itVar = (C4480it) obj;
        if (this.f16319e != itVar.f16319e) {
            return false;
        }
        int[] iArr = this.f16317c;
        int[] iArr2 = itVar.f16317c;
        int i = this.f16319e;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                z = true;
                break;
            } else if (iArr[i2] != iArr2[i2]) {
                z = false;
                break;
            } else {
                i2++;
            }
        }
        if (z) {
            C4481iu[] iuVarArr = this.f16318d;
            C4481iu[] iuVarArr2 = itVar.f16318d;
            int i3 = this.f16319e;
            int i4 = 0;
            while (true) {
                if (i4 >= i3) {
                    z2 = true;
                    break;
                } else if (!iuVarArr[i4].equals(iuVarArr2[i4])) {
                    z2 = false;
                    break;
                } else {
                    i4++;
                }
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 17;
        for (int i2 = 0; i2 < this.f16319e; i2++) {
            i = (((i * 31) + this.f16317c[i2]) * 31) + this.f16318d[i2].hashCode();
        }
        return i;
    }
}
