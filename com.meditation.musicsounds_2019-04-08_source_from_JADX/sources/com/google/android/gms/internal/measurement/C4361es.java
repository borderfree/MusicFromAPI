package com.google.android.gms.internal.measurement;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.measurement.es */
final class C4361es extends C4359eq {

    /* renamed from: d */
    private final byte[] f16072d;

    /* renamed from: e */
    private final boolean f16073e;

    /* renamed from: f */
    private int f16074f;

    /* renamed from: g */
    private int f16075g;

    /* renamed from: h */
    private int f16076h;

    /* renamed from: i */
    private int f16077i;

    /* renamed from: j */
    private int f16078j;

    /* renamed from: k */
    private int f16079k;

    private C4361es(byte[] bArr, int i, int i2, boolean z) {
        super();
        this.f16079k = Integer.MAX_VALUE;
        this.f16072d = bArr;
        this.f16074f = i2 + i;
        this.f16076h = i;
        this.f16077i = this.f16076h;
        this.f16073e = z;
    }

    /* renamed from: A */
    private final byte m21365A() {
        if (this.f16076h != this.f16074f) {
            byte[] bArr = this.f16072d;
            int i = this.f16076h;
            this.f16076h = i + 1;
            return bArr[i];
        }
        throw zzuv.zzwq();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0068, code lost:
        if (r1[r2] >= 0) goto L_0x006a;
     */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m21366v() {
        /*
            r5 = this;
            int r0 = r5.f16076h
            int r1 = r5.f16074f
            if (r1 == r0) goto L_0x006d
            byte[] r1 = r5.f16072d
            int r2 = r0 + 1
            byte r0 = r1[r0]
            if (r0 < 0) goto L_0x0011
            r5.f16076h = r2
            return r0
        L_0x0011:
            int r3 = r5.f16074f
            int r3 = r3 - r2
            r4 = 9
            if (r3 < r4) goto L_0x006d
            int r3 = r2 + 1
            byte r2 = r1[r2]
            int r2 = r2 << 7
            r0 = r0 ^ r2
            if (r0 >= 0) goto L_0x0024
            r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
            goto L_0x006a
        L_0x0024:
            int r2 = r3 + 1
            byte r3 = r1[r3]
            int r3 = r3 << 14
            r0 = r0 ^ r3
            if (r0 < 0) goto L_0x0031
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L_0x002f:
            r3 = r2
            goto L_0x006a
        L_0x0031:
            int r3 = r2 + 1
            byte r2 = r1[r2]
            int r2 = r2 << 21
            r0 = r0 ^ r2
            if (r0 >= 0) goto L_0x003f
            r1 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r1
            goto L_0x006a
        L_0x003f:
            int r2 = r3 + 1
            byte r3 = r1[r3]
            int r4 = r3 << 28
            r0 = r0 ^ r4
            r4 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r4
            if (r3 >= 0) goto L_0x002f
            int r3 = r2 + 1
            byte r2 = r1[r2]
            if (r2 >= 0) goto L_0x006a
            int r2 = r3 + 1
            byte r3 = r1[r3]
            if (r3 >= 0) goto L_0x002f
            int r3 = r2 + 1
            byte r2 = r1[r2]
            if (r2 >= 0) goto L_0x006a
            int r2 = r3 + 1
            byte r3 = r1[r3]
            if (r3 >= 0) goto L_0x002f
            int r3 = r2 + 1
            byte r1 = r1[r2]
            if (r1 < 0) goto L_0x006d
        L_0x006a:
            r5.f16076h = r3
            return r0
        L_0x006d:
            long r0 = r5.mo14361s()
            int r0 = (int) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C4361es.m21366v():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b2, code lost:
        if (((long) r1[r0]) >= 0) goto L_0x0070;
     */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final long m21367w() {
        /*
            r11 = this;
            int r0 = r11.f16076h
            int r1 = r11.f16074f
            if (r1 == r0) goto L_0x00b8
            byte[] r1 = r11.f16072d
            int r2 = r0 + 1
            byte r0 = r1[r0]
            if (r0 < 0) goto L_0x0012
            r11.f16076h = r2
            long r0 = (long) r0
            return r0
        L_0x0012:
            int r3 = r11.f16074f
            int r3 = r3 - r2
            r4 = 9
            if (r3 < r4) goto L_0x00b8
            int r3 = r2 + 1
            byte r2 = r1[r2]
            int r2 = r2 << 7
            r0 = r0 ^ r2
            if (r0 >= 0) goto L_0x002a
            r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
        L_0x0024:
            long r0 = (long) r0
            r9 = r0
            r0 = r3
        L_0x0027:
            r2 = r9
            goto L_0x00b5
        L_0x002a:
            int r2 = r3 + 1
            byte r3 = r1[r3]
            int r3 = r3 << 14
            r0 = r0 ^ r3
            if (r0 < 0) goto L_0x0039
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            long r0 = (long) r0
            r9 = r0
            r0 = r2
            goto L_0x0027
        L_0x0039:
            int r3 = r2 + 1
            byte r2 = r1[r2]
            int r2 = r2 << 21
            r0 = r0 ^ r2
            if (r0 >= 0) goto L_0x0047
            r1 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r1
            goto L_0x0024
        L_0x0047:
            long r4 = (long) r0
            int r0 = r3 + 1
            byte r2 = r1[r3]
            long r2 = (long) r2
            r6 = 28
            long r2 = r2 << r6
            long r2 = r2 ^ r4
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto L_0x005c
            r4 = 266354560(0xfe03f80, double:1.315966377E-315)
        L_0x005a:
            long r2 = r2 ^ r4
            goto L_0x00b5
        L_0x005c:
            int r6 = r0 + 1
            byte r0 = r1[r0]
            long r7 = (long) r0
            r0 = 35
            long r7 = r7 << r0
            long r2 = r2 ^ r7
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0072
            r0 = -34093383808(0xfffffff80fe03f80, double:NaN)
        L_0x006e:
            long r0 = r0 ^ r2
            r2 = r0
        L_0x0070:
            r0 = r6
            goto L_0x00b5
        L_0x0072:
            int r0 = r6 + 1
            byte r6 = r1[r6]
            long r6 = (long) r6
            r8 = 42
            long r6 = r6 << r8
            long r2 = r2 ^ r6
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto L_0x0085
            r4 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
            goto L_0x005a
        L_0x0085:
            int r6 = r0 + 1
            byte r0 = r1[r0]
            long r7 = (long) r0
            r0 = 49
            long r7 = r7 << r0
            long r2 = r2 ^ r7
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0098
            r0 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
            goto L_0x006e
        L_0x0098:
            int r0 = r6 + 1
            byte r6 = r1[r6]
            long r6 = (long) r6
            r8 = 56
            long r6 = r6 << r8
            long r2 = r2 ^ r6
            r6 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
            long r2 = r2 ^ r6
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x00b5
            int r6 = r0 + 1
            byte r0 = r1[r0]
            long r0 = (long) r0
            int r7 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r7 < 0) goto L_0x00b8
            goto L_0x0070
        L_0x00b5:
            r11.f16076h = r0
            return r2
        L_0x00b8:
            long r0 = r11.mo14361s()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C4361es.m21367w():long");
    }

    /* renamed from: x */
    private final int m21368x() {
        int i = this.f16076h;
        if (this.f16074f - i >= 4) {
            byte[] bArr = this.f16072d;
            this.f16076h = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }
        throw zzuv.zzwq();
    }

    /* renamed from: y */
    private final long m21369y() {
        int i = this.f16076h;
        if (this.f16074f - i >= 8) {
            byte[] bArr = this.f16072d;
            this.f16076h = i + 8;
            return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
        }
        throw zzuv.zzwq();
    }

    /* renamed from: z */
    private final void m21370z() {
        this.f16074f += this.f16075g;
        int i = this.f16074f - this.f16077i;
        if (i > this.f16079k) {
            this.f16075g = i - this.f16079k;
            this.f16074f -= this.f16075g;
            return;
        }
        this.f16075g = 0;
    }

    /* renamed from: a */
    public final int mo14336a() {
        if (mo14362t()) {
            this.f16078j = 0;
            return 0;
        }
        this.f16078j = m21366v();
        if ((this.f16078j >>> 3) != 0) {
            return this.f16078j;
        }
        throw new zzuv("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: a */
    public final <T extends C4419gq> T mo14337a(C4431hb<T> hbVar, C4371fb fbVar) {
        int v = m21366v();
        if (this.f16067a < this.f16068b) {
            int d = mo14343d(v);
            this.f16067a++;
            T t = (C4419gq) hbVar.mo14509a(this, fbVar);
            mo14338a(0);
            this.f16067a--;
            mo14346e(d);
            return t;
        }
        throw zzuv.zzwv();
    }

    /* renamed from: a */
    public final void mo14338a(int i) {
        if (this.f16078j != i) {
            throw zzuv.zzwt();
        }
    }

    /* renamed from: b */
    public final double mo14339b() {
        return Double.longBitsToDouble(m21369y());
    }

    /* renamed from: b */
    public final boolean mo14340b(int i) {
        int a;
        int i2 = 0;
        switch (i & 7) {
            case 0:
                if (this.f16074f - this.f16076h >= 10) {
                    while (i2 < 10) {
                        byte[] bArr = this.f16072d;
                        int i3 = this.f16076h;
                        this.f16076h = i3 + 1;
                        if (bArr[i3] < 0) {
                            i2++;
                        }
                    }
                    throw zzuv.zzws();
                }
                while (i2 < 10) {
                    if (m21365A() < 0) {
                        i2++;
                    }
                }
                throw zzuv.zzws();
                return true;
            case 1:
                mo14348f(8);
                return true;
            case 2:
                mo14348f(m21366v());
                return true;
            case 3:
                break;
            case 4:
                return false;
            case 5:
                mo14348f(4);
                return true;
            default:
                throw zzuv.zzwu();
        }
        do {
            a = mo14336a();
            if (a != 0) {
            }
            mo14338a(((i >>> 3) << 3) | 4);
            return true;
        } while (mo14340b(a));
        mo14338a(((i >>> 3) << 3) | 4);
        return true;
    }

    /* renamed from: c */
    public final float mo14341c() {
        return Float.intBitsToFloat(m21368x());
    }

    /* renamed from: d */
    public final int mo14343d(int i) {
        if (i >= 0) {
            int u = i + mo14363u();
            int i2 = this.f16079k;
            if (u <= i2) {
                this.f16079k = u;
                m21370z();
                return i2;
            }
            throw zzuv.zzwq();
        }
        throw zzuv.zzwr();
    }

    /* renamed from: d */
    public final long mo14344d() {
        return m21367w();
    }

    /* renamed from: e */
    public final long mo14345e() {
        return m21367w();
    }

    /* renamed from: e */
    public final void mo14346e(int i) {
        this.f16079k = i;
        m21370z();
    }

    /* renamed from: f */
    public final int mo14347f() {
        return m21366v();
    }

    /* renamed from: f */
    public final void mo14348f(int i) {
        if (i >= 0 && i <= this.f16074f - this.f16076h) {
            this.f16076h += i;
        } else if (i < 0) {
            throw zzuv.zzwr();
        } else {
            throw zzuv.zzwq();
        }
    }

    /* renamed from: g */
    public final long mo14349g() {
        return m21369y();
    }

    /* renamed from: h */
    public final int mo14350h() {
        return m21368x();
    }

    /* renamed from: i */
    public final boolean mo14351i() {
        return m21367w() != 0;
    }

    /* renamed from: j */
    public final String mo14352j() {
        int v = m21366v();
        if (v > 0 && v <= this.f16074f - this.f16076h) {
            String str = new String(this.f16072d, this.f16076h, v, C4390fo.f16136a);
            this.f16076h += v;
            return str;
        } else if (v == 0) {
            return "";
        } else {
            if (v < 0) {
                throw zzuv.zzwr();
            }
            throw zzuv.zzwq();
        }
    }

    /* renamed from: k */
    public final String mo14353k() {
        int v = m21366v();
        if (v > 0 && v <= this.f16074f - this.f16076h) {
            String b = C4468ih.m22095b(this.f16072d, this.f16076h, v);
            this.f16076h += v;
            return b;
        } else if (v == 0) {
            return "";
        } else {
            if (v <= 0) {
                throw zzuv.zzwr();
            }
            throw zzuv.zzwq();
        }
    }

    /* renamed from: l */
    public final zzte mo14354l() {
        byte[] bArr;
        int v = m21366v();
        if (v > 0 && v <= this.f16074f - this.f16076h) {
            zzte zzb = zzte.zzb(this.f16072d, this.f16076h, v);
            this.f16076h += v;
            return zzb;
        } else if (v == 0) {
            return zzte.zzbtq;
        } else {
            if (v > 0 && v <= this.f16074f - this.f16076h) {
                int i = this.f16076h;
                this.f16076h += v;
                bArr = Arrays.copyOfRange(this.f16072d, i, this.f16076h);
            } else if (v > 0) {
                throw zzuv.zzwq();
            } else if (v == 0) {
                bArr = C4390fo.f16137b;
            } else {
                throw zzuv.zzwr();
            }
            return zzte.zzi(bArr);
        }
    }

    /* renamed from: m */
    public final int mo14355m() {
        return m21366v();
    }

    /* renamed from: n */
    public final int mo14356n() {
        return m21366v();
    }

    /* renamed from: o */
    public final int mo14357o() {
        return m21368x();
    }

    /* renamed from: p */
    public final long mo14358p() {
        return m21369y();
    }

    /* renamed from: q */
    public final int mo14359q() {
        int v = m21366v();
        return (-(v & 1)) ^ (v >>> 1);
    }

    /* renamed from: r */
    public final long mo14360r() {
        long w = m21367w();
        return (-(w & 1)) ^ (w >>> 1);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: s */
    public final long mo14361s() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte A = m21365A();
            j |= ((long) (A & Byte.MAX_VALUE)) << i;
            if ((A & 128) == 0) {
                return j;
            }
        }
        throw zzuv.zzws();
    }

    /* renamed from: t */
    public final boolean mo14362t() {
        return this.f16076h == this.f16074f;
    }

    /* renamed from: u */
    public final int mo14363u() {
        return this.f16076h - this.f16077i;
    }
}
