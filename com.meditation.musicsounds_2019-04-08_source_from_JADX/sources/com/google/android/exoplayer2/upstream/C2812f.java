package com.google.android.exoplayer2.upstream;

import com.google.android.exoplayer2.p102c.C2488a;
import com.google.android.exoplayer2.p102c.C2511s;
import java.util.Arrays;

/* renamed from: com.google.android.exoplayer2.upstream.f */
public final class C2812f implements C2806b {

    /* renamed from: a */
    private final boolean f9724a;

    /* renamed from: b */
    private final int f9725b;

    /* renamed from: c */
    private final byte[] f9726c;

    /* renamed from: d */
    private final C2805a[] f9727d;

    /* renamed from: e */
    private int f9728e;

    /* renamed from: f */
    private int f9729f;

    /* renamed from: g */
    private int f9730g;

    /* renamed from: h */
    private C2805a[] f9731h;

    public C2812f(boolean z, int i) {
        this(z, i, 0);
    }

    public C2812f(boolean z, int i, int i2) {
        C2488a.m11666a(i > 0);
        C2488a.m11666a(i2 >= 0);
        this.f9724a = z;
        this.f9725b = i;
        this.f9730g = i2;
        this.f9731h = new C2805a[(i2 + 100)];
        if (i2 > 0) {
            this.f9726c = new byte[(i2 * i)];
            for (int i3 = 0; i3 < i2; i3++) {
                this.f9731h[i3] = new C2805a(this.f9726c, i3 * i);
            }
        } else {
            this.f9726c = null;
        }
        this.f9727d = new C2805a[1];
    }

    /* renamed from: a */
    public synchronized C2805a mo9539a() {
        C2805a aVar;
        this.f9729f++;
        if (this.f9730g > 0) {
            C2805a[] aVarArr = this.f9731h;
            int i = this.f9730g - 1;
            this.f9730g = i;
            aVar = aVarArr[i];
            this.f9731h[this.f9730g] = null;
        } else {
            aVar = new C2805a(new byte[this.f9725b], 0);
        }
        return aVar;
    }

    /* renamed from: a */
    public synchronized void mo9548a(int i) {
        boolean z = i < this.f9728e;
        this.f9728e = i;
        if (z) {
            mo9542b();
        }
    }

    /* renamed from: a */
    public synchronized void mo9540a(C2805a aVar) {
        this.f9727d[0] = aVar;
        mo9541a(this.f9727d);
    }

    /* renamed from: a */
    public synchronized void mo9541a(C2805a[] aVarArr) {
        boolean z;
        if (this.f9730g + aVarArr.length >= this.f9731h.length) {
            this.f9731h = (C2805a[]) Arrays.copyOf(this.f9731h, Math.max(this.f9731h.length * 2, this.f9730g + aVarArr.length));
        }
        for (C2805a aVar : aVarArr) {
            if (aVar.f9715a != this.f9726c) {
                if (aVar.f9715a.length != this.f9725b) {
                    z = false;
                    C2488a.m11666a(z);
                    C2805a[] aVarArr2 = this.f9731h;
                    int i = this.f9730g;
                    this.f9730g = i + 1;
                    aVarArr2[i] = aVar;
                }
            }
            z = true;
            C2488a.m11666a(z);
            C2805a[] aVarArr22 = this.f9731h;
            int i2 = this.f9730g;
            this.f9730g = i2 + 1;
            aVarArr22[i2] = aVar;
        }
        this.f9729f -= aVarArr.length;
        notifyAll();
    }

    /* renamed from: b */
    public synchronized void mo9542b() {
        int i = 0;
        int max = Math.max(0, C2511s.m11797a(this.f9728e, this.f9725b) - this.f9729f);
        if (max < this.f9730g) {
            if (this.f9726c != null) {
                int i2 = this.f9730g - 1;
                while (i <= i2) {
                    C2805a aVar = this.f9731h[i];
                    if (aVar.f9715a == this.f9726c) {
                        i++;
                    } else {
                        C2805a aVar2 = this.f9731h[i2];
                        if (aVar2.f9715a != this.f9726c) {
                            i2--;
                        } else {
                            int i3 = i + 1;
                            this.f9731h[i] = aVar2;
                            int i4 = i2 - 1;
                            this.f9731h[i2] = aVar;
                            i2 = i4;
                            i = i3;
                        }
                    }
                }
                max = Math.max(max, i);
                if (max >= this.f9730g) {
                    return;
                }
            }
            Arrays.fill(this.f9731h, max, this.f9730g, null);
            this.f9730g = max;
        }
    }

    /* renamed from: c */
    public int mo9543c() {
        return this.f9725b;
    }

    /* renamed from: d */
    public synchronized void mo9549d() {
        if (this.f9724a) {
            mo9548a(0);
        }
    }

    /* renamed from: e */
    public synchronized int mo9550e() {
        return this.f9729f * this.f9725b;
    }
}
