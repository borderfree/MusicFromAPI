package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aai.C3393e;
import java.util.Arrays;

public final class acx {

    /* renamed from: a */
    private static final acx f11499a = new acx(0, new int[0], new Object[0], false);

    /* renamed from: b */
    private int f11500b;

    /* renamed from: c */
    private int[] f11501c;

    /* renamed from: d */
    private Object[] f11502d;

    /* renamed from: e */
    private int f11503e;

    /* renamed from: f */
    private boolean f11504f;

    private acx() {
        this(0, new int[8], new Object[8], true);
    }

    private acx(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f11503e = -1;
        this.f11500b = i;
        this.f11501c = iArr;
        this.f11502d = objArr;
        this.f11504f = z;
    }

    /* renamed from: a */
    public static acx m15765a() {
        return f11499a;
    }

    /* renamed from: a */
    static acx m15766a(acx acx, acx acx2) {
        int i = acx.f11500b + acx2.f11500b;
        int[] copyOf = Arrays.copyOf(acx.f11501c, i);
        System.arraycopy(acx2.f11501c, 0, copyOf, acx.f11500b, acx2.f11500b);
        Object[] copyOf2 = Arrays.copyOf(acx.f11502d, i);
        System.arraycopy(acx2.f11502d, 0, copyOf2, acx.f11500b, acx2.f11500b);
        return new acx(i, copyOf, copyOf2, true);
    }

    /* renamed from: a */
    private static void m15767a(int i, Object obj, adj adj) {
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 != 5) {
            switch (i3) {
                case 0:
                    adj.mo11746a(i2, ((Long) obj).longValue());
                    return;
                case 1:
                    adj.mo11767d(i2, ((Long) obj).longValue());
                    return;
                case 2:
                    adj.mo11748a(i2, (zzbah) obj);
                    return;
                case 3:
                    if (adj.mo11741a() == C3393e.f11354j) {
                        adj.mo11742a(i2);
                        ((acx) obj).mo11702b(adj);
                        adj.mo11756b(i2);
                        return;
                    }
                    adj.mo11756b(i2);
                    ((acx) obj).mo11702b(adj);
                    adj.mo11742a(i2);
                    return;
                default:
                    throw new RuntimeException(zzbbu.zzadq());
            }
        } else {
            adj.mo11766d(i2, ((Integer) obj).intValue());
        }
    }

    /* renamed from: b */
    static acx m15768b() {
        return new acx();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo11699a(int i, Object obj) {
        if (this.f11504f) {
            if (this.f11500b == this.f11501c.length) {
                int i2 = this.f11500b + (this.f11500b < 4 ? 8 : this.f11500b >> 1);
                this.f11501c = Arrays.copyOf(this.f11501c, i2);
                this.f11502d = Arrays.copyOf(this.f11502d, i2);
            }
            this.f11501c[this.f11500b] = i;
            this.f11502d[this.f11500b] = obj;
            this.f11500b++;
            return;
        }
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo11700a(adj adj) {
        if (adj.mo11741a() == C3393e.f11355k) {
            for (int i = this.f11500b - 1; i >= 0; i--) {
                adj.mo11749a(this.f11501c[i] >>> 3, this.f11502d[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.f11500b; i2++) {
            adj.mo11749a(this.f11501c[i2] >>> 3, this.f11502d[i2]);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo11701a(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f11500b; i2++) {
            abo.m15482a(sb, i, String.valueOf(this.f11501c[i2] >>> 3), this.f11502d[i2]);
        }
    }

    /* renamed from: b */
    public final void mo11702b(adj adj) {
        if (this.f11500b != 0) {
            if (adj.mo11741a() == C3393e.f11354j) {
                for (int i = 0; i < this.f11500b; i++) {
                    m15767a(this.f11501c[i], this.f11502d[i], adj);
                }
                return;
            }
            for (int i2 = this.f11500b - 1; i2 >= 0; i2--) {
                m15767a(this.f11501c[i2], this.f11502d[i2], adj);
            }
        }
    }

    /* renamed from: c */
    public final void mo11703c() {
        this.f11504f = false;
    }

    /* renamed from: d */
    public final int mo11704d() {
        int i = this.f11503e;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f11500b; i3++) {
            i2 += zzbav.m20661d(this.f11501c[i3] >>> 3, (zzbah) this.f11502d[i3]);
        }
        this.f11503e = i2;
        return i2;
    }

    /* renamed from: e */
    public final int mo11705e() {
        int i;
        int i2 = this.f11503e;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f11500b; i4++) {
            int i5 = this.f11501c[i4];
            int i6 = i5 >>> 3;
            int i7 = i5 & 7;
            if (i7 != 5) {
                switch (i7) {
                    case 0:
                        i = zzbav.m20664e(i6, ((Long) this.f11502d[i4]).longValue());
                        break;
                    case 1:
                        i = zzbav.m20672g(i6, ((Long) this.f11502d[i4]).longValue());
                        break;
                    case 2:
                        i = zzbav.m20657c(i6, (zzbah) this.f11502d[i4]);
                        break;
                    case 3:
                        i = (zzbav.m20663e(i6) << 1) + ((acx) this.f11502d[i4]).mo11705e();
                        break;
                    default:
                        throw new IllegalStateException(zzbbu.zzadq());
                }
            } else {
                i = zzbav.m20679i(i6, ((Integer) this.f11502d[i4]).intValue());
            }
            i3 += i;
        }
        this.f11503e = i3;
        return i3;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof acx)) {
            return false;
        }
        acx acx = (acx) obj;
        if (this.f11500b == acx.f11500b) {
            int[] iArr = this.f11501c;
            int[] iArr2 = acx.f11501c;
            int i = this.f11500b;
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
                Object[] objArr = this.f11502d;
                Object[] objArr2 = acx.f11502d;
                int i3 = this.f11500b;
                int i4 = 0;
                while (true) {
                    if (i4 >= i3) {
                        z2 = true;
                        break;
                    } else if (!objArr[i4].equals(objArr2[i4])) {
                        z2 = false;
                        break;
                    } else {
                        i4++;
                    }
                }
                return z2;
            }
        }
    }

    public final int hashCode() {
        int i = (this.f11500b + 527) * 31;
        int[] iArr = this.f11501c;
        int i2 = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < this.f11500b; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = (i + i3) * 31;
        Object[] objArr = this.f11502d;
        for (int i6 = 0; i6 < this.f11500b; i6++) {
            i2 = (i2 * 31) + objArr[i6].hashCode();
        }
        return i5 + i2;
    }
}
