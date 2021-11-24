package com.google.android.gms.internal.ads;

public final class adp implements Cloneable {

    /* renamed from: a */
    private static final adq f11555a = new adq();

    /* renamed from: b */
    private boolean f11556b;

    /* renamed from: c */
    private int[] f11557c;

    /* renamed from: d */
    private adq[] f11558d;

    /* renamed from: e */
    private int f11559e;

    adp() {
        this(10);
    }

    private adp(int i) {
        this.f11556b = false;
        int c = m15999c(i);
        this.f11557c = new int[c];
        this.f11558d = new adq[c];
        this.f11559e = 0;
    }

    /* renamed from: c */
    private static int m15999c(int i) {
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
    private final int m16000d(int i) {
        int i2 = this.f11559e - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            int i5 = this.f11557c[i4];
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
    public final int mo11816a() {
        return this.f11559e;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final adq mo11817a(int i) {
        int d = m16000d(i);
        if (d < 0 || this.f11558d[d] == f11555a) {
            return null;
        }
        return this.f11558d[d];
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo11818a(int i, adq adq) {
        int d = m16000d(i);
        if (d >= 0) {
            this.f11558d[d] = adq;
            return;
        }
        int i2 = d ^ -1;
        if (i2 >= this.f11559e || this.f11558d[i2] != f11555a) {
            if (this.f11559e >= this.f11557c.length) {
                int c = m15999c(this.f11559e + 1);
                int[] iArr = new int[c];
                adq[] adqArr = new adq[c];
                System.arraycopy(this.f11557c, 0, iArr, 0, this.f11557c.length);
                System.arraycopy(this.f11558d, 0, adqArr, 0, this.f11558d.length);
                this.f11557c = iArr;
                this.f11558d = adqArr;
            }
            if (this.f11559e - i2 != 0) {
                int i3 = i2 + 1;
                System.arraycopy(this.f11557c, i2, this.f11557c, i3, this.f11559e - i2);
                System.arraycopy(this.f11558d, i2, this.f11558d, i3, this.f11559e - i2);
            }
            this.f11557c[i2] = i;
            this.f11558d[i2] = adq;
            this.f11559e++;
            return;
        }
        this.f11557c[i2] = i;
        this.f11558d[i2] = adq;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final adq mo11819b(int i) {
        return this.f11558d[i];
    }

    public final /* synthetic */ Object clone() {
        int i = this.f11559e;
        adp adp = new adp(i);
        System.arraycopy(this.f11557c, 0, adp.f11557c, 0, i);
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f11558d[i2] != null) {
                adp.f11558d[i2] = (adq) this.f11558d[i2].clone();
            }
        }
        adp.f11559e = i;
        return adp;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof adp)) {
            return false;
        }
        adp adp = (adp) obj;
        if (this.f11559e != adp.f11559e) {
            return false;
        }
        int[] iArr = this.f11557c;
        int[] iArr2 = adp.f11557c;
        int i = this.f11559e;
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
            adq[] adqArr = this.f11558d;
            adq[] adqArr2 = adp.f11558d;
            int i3 = this.f11559e;
            int i4 = 0;
            while (true) {
                if (i4 >= i3) {
                    z2 = true;
                    break;
                } else if (!adqArr[i4].equals(adqArr2[i4])) {
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
        for (int i2 = 0; i2 < this.f11559e; i2++) {
            i = (((i * 31) + this.f11557c[i2]) * 31) + this.f11558d[i2].hashCode();
        }
        return i;
    }
}
