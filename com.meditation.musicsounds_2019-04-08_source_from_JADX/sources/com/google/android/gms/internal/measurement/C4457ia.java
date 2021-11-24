package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C4383fm.C4388e;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.measurement.ia */
public final class C4457ia {

    /* renamed from: a */
    private static final C4457ia f16247a = new C4457ia(0, new int[0], new Object[0], false);

    /* renamed from: b */
    private int f16248b;

    /* renamed from: c */
    private int[] f16249c;

    /* renamed from: d */
    private Object[] f16250d;

    /* renamed from: e */
    private int f16251e;

    /* renamed from: f */
    private boolean f16252f;

    private C4457ia() {
        this(0, new int[8], new Object[8], true);
    }

    private C4457ia(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f16251e = -1;
        this.f16248b = i;
        this.f16249c = iArr;
        this.f16250d = objArr;
        this.f16252f = z;
    }

    /* renamed from: a */
    public static C4457ia m21959a() {
        return f16247a;
    }

    /* renamed from: a */
    static C4457ia m21960a(C4457ia iaVar, C4457ia iaVar2) {
        int i = iaVar.f16248b + iaVar2.f16248b;
        int[] copyOf = Arrays.copyOf(iaVar.f16249c, i);
        System.arraycopy(iaVar2.f16249c, 0, copyOf, iaVar.f16248b, iaVar2.f16248b);
        Object[] copyOf2 = Arrays.copyOf(iaVar.f16250d, i);
        System.arraycopy(iaVar2.f16250d, 0, copyOf2, iaVar.f16248b, iaVar2.f16248b);
        return new C4457ia(i, copyOf, copyOf2, true);
    }

    /* renamed from: a */
    private static void m21961a(int i, Object obj, C4474in inVar) {
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 != 5) {
            switch (i3) {
                case 0:
                    inVar.mo14411a(i2, ((Long) obj).longValue());
                    return;
                case 1:
                    inVar.mo14432d(i2, ((Long) obj).longValue());
                    return;
                case 2:
                    inVar.mo14413a(i2, (zzte) obj);
                    return;
                case 3:
                    if (inVar.mo14406a() == C4388e.f16128j) {
                        inVar.mo14407a(i2);
                        ((C4457ia) obj).mo14665b(inVar);
                        inVar.mo14421b(i2);
                        return;
                    }
                    inVar.mo14421b(i2);
                    ((C4457ia) obj).mo14665b(inVar);
                    inVar.mo14407a(i2);
                    return;
                default:
                    throw new RuntimeException(zzuv.zzwu());
            }
        } else {
            inVar.mo14431d(i2, ((Integer) obj).intValue());
        }
    }

    /* renamed from: b */
    static C4457ia m21962b() {
        return new C4457ia();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo14662a(int i, Object obj) {
        if (this.f16252f) {
            if (this.f16248b == this.f16249c.length) {
                int i2 = this.f16248b + (this.f16248b < 4 ? 8 : this.f16248b >> 1);
                this.f16249c = Arrays.copyOf(this.f16249c, i2);
                this.f16250d = Arrays.copyOf(this.f16250d, i2);
            }
            this.f16249c[this.f16248b] = i;
            this.f16250d[this.f16248b] = obj;
            this.f16248b++;
            return;
        }
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo14663a(C4474in inVar) {
        if (inVar.mo14406a() == C4388e.f16129k) {
            for (int i = this.f16248b - 1; i >= 0; i--) {
                inVar.mo14414a(this.f16249c[i] >>> 3, this.f16250d[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.f16248b; i2++) {
            inVar.mo14414a(this.f16249c[i2] >>> 3, this.f16250d[i2]);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo14664a(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f16248b; i2++) {
            C4422gt.m21717a(sb, i, String.valueOf(this.f16249c[i2] >>> 3), this.f16250d[i2]);
        }
    }

    /* renamed from: b */
    public final void mo14665b(C4474in inVar) {
        if (this.f16248b != 0) {
            if (inVar.mo14406a() == C4388e.f16128j) {
                for (int i = 0; i < this.f16248b; i++) {
                    m21961a(this.f16249c[i], this.f16250d[i], inVar);
                }
                return;
            }
            for (int i2 = this.f16248b - 1; i2 >= 0; i2--) {
                m21961a(this.f16249c[i2], this.f16250d[i2], inVar);
            }
        }
    }

    /* renamed from: c */
    public final void mo14666c() {
        this.f16252f = false;
    }

    /* renamed from: d */
    public final int mo14667d() {
        int i = this.f16251e;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f16248b; i3++) {
            i2 += zztv.m22431d(this.f16249c[i3] >>> 3, (zzte) this.f16250d[i3]);
        }
        this.f16251e = i2;
        return i2;
    }

    /* renamed from: e */
    public final int mo14668e() {
        int i;
        int i2 = this.f16251e;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f16248b; i4++) {
            int i5 = this.f16249c[i4];
            int i6 = i5 >>> 3;
            int i7 = i5 & 7;
            if (i7 != 5) {
                switch (i7) {
                    case 0:
                        i = zztv.m22434e(i6, ((Long) this.f16250d[i4]).longValue());
                        break;
                    case 1:
                        i = zztv.m22442g(i6, ((Long) this.f16250d[i4]).longValue());
                        break;
                    case 2:
                        i = zztv.m22426c(i6, (zzte) this.f16250d[i4]);
                        break;
                    case 3:
                        i = (zztv.m22433e(i6) << 1) + ((C4457ia) this.f16250d[i4]).mo14668e();
                        break;
                    default:
                        throw new IllegalStateException(zzuv.zzwu());
                }
            } else {
                i = zztv.m22449i(i6, ((Integer) this.f16250d[i4]).intValue());
            }
            i3 += i;
        }
        this.f16251e = i3;
        return i3;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C4457ia)) {
            return false;
        }
        C4457ia iaVar = (C4457ia) obj;
        if (this.f16248b == iaVar.f16248b) {
            int[] iArr = this.f16249c;
            int[] iArr2 = iaVar.f16249c;
            int i = this.f16248b;
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
                Object[] objArr = this.f16250d;
                Object[] objArr2 = iaVar.f16250d;
                int i3 = this.f16248b;
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
        int i = (this.f16248b + 527) * 31;
        int[] iArr = this.f16249c;
        int i2 = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < this.f16248b; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = (i + i3) * 31;
        Object[] objArr = this.f16250d;
        for (int i6 = 0; i6 < this.f16248b; i6++) {
            i2 = (i2 * 31) + objArr[i6].hashCode();
        }
        return i5 + i2;
    }
}
