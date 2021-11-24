package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.zo */
final class C4126zo extends C4124zm {

    /* renamed from: d */
    private final byte[] f15182d;

    /* renamed from: e */
    private final boolean f15183e;

    /* renamed from: f */
    private int f15184f;

    /* renamed from: g */
    private int f15185g;

    /* renamed from: h */
    private int f15186h;

    /* renamed from: i */
    private int f15187i;

    /* renamed from: j */
    private int f15188j;

    /* renamed from: k */
    private int f15189k;

    private C4126zo(byte[] bArr, int i, int i2, boolean z) {
        super();
        this.f15189k = Integer.MAX_VALUE;
        this.f15182d = bArr;
        this.f15184f = i2 + i;
        this.f15186h = i;
        this.f15187i = this.f15186h;
        this.f15183e = z;
    }

    /* renamed from: A */
    private final byte m20461A() {
        if (this.f15186h != this.f15184f) {
            byte[] bArr = this.f15182d;
            int i = this.f15186h;
            this.f15186h = i + 1;
            return bArr[i];
        }
        throw zzbbu.zzadl();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0068, code lost:
        if (r1[r2] >= 0) goto L_0x006a;
     */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m20462v() {
        /*
            r5 = this;
            int r0 = r5.f15186h
            int r1 = r5.f15184f
            if (r1 == r0) goto L_0x006d
            byte[] r1 = r5.f15182d
            int r2 = r0 + 1
            byte r0 = r1[r0]
            if (r0 < 0) goto L_0x0011
            r5.f15186h = r2
            return r0
        L_0x0011:
            int r3 = r5.f15184f
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
            r5.f15186h = r3
            return r0
        L_0x006d:
            long r0 = r5.mo13868s()
            int r0 = (int) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4126zo.m20462v():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b2, code lost:
        if (((long) r1[r0]) >= 0) goto L_0x0070;
     */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final long m20463w() {
        /*
            r11 = this;
            int r0 = r11.f15186h
            int r1 = r11.f15184f
            if (r1 == r0) goto L_0x00b8
            byte[] r1 = r11.f15182d
            int r2 = r0 + 1
            byte r0 = r1[r0]
            if (r0 < 0) goto L_0x0012
            r11.f15186h = r2
            long r0 = (long) r0
            return r0
        L_0x0012:
            int r3 = r11.f15184f
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
            r11.f15186h = r0
            return r2
        L_0x00b8:
            long r0 = r11.mo13868s()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4126zo.m20463w():long");
    }

    /* renamed from: x */
    private final int m20464x() {
        int i = this.f15186h;
        if (this.f15184f - i >= 4) {
            byte[] bArr = this.f15182d;
            this.f15186h = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }
        throw zzbbu.zzadl();
    }

    /* renamed from: y */
    private final long m20465y() {
        int i = this.f15186h;
        if (this.f15184f - i >= 8) {
            byte[] bArr = this.f15182d;
            this.f15186h = i + 8;
            return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
        }
        throw zzbbu.zzadl();
    }

    /* renamed from: z */
    private final void m20466z() {
        this.f15184f += this.f15185g;
        int i = this.f15184f - this.f15187i;
        if (i > this.f15189k) {
            this.f15185g = i - this.f15189k;
            this.f15184f -= this.f15185g;
            return;
        }
        this.f15185g = 0;
    }

    /* renamed from: a */
    public final int mo13845a() {
        if (mo13869t()) {
            this.f15188j = 0;
            return 0;
        }
        this.f15188j = m20462v();
        if ((this.f15188j >>> 3) != 0) {
            return this.f15188j;
        }
        throw zzbbu.zzado();
    }

    /* renamed from: a */
    public final void mo13846a(int i) {
        if (this.f15188j != i) {
            throw zzbbu.zzadp();
        }
    }

    /* renamed from: b */
    public final double mo13847b() {
        return Double.longBitsToDouble(m20465y());
    }

    /* renamed from: b */
    public final boolean mo13848b(int i) {
        int a;
        int i2 = 0;
        switch (i & 7) {
            case 0:
                if (this.f15184f - this.f15186h >= 10) {
                    while (i2 < 10) {
                        byte[] bArr = this.f15182d;
                        int i3 = this.f15186h;
                        this.f15186h = i3 + 1;
                        if (bArr[i3] < 0) {
                            i2++;
                        }
                    }
                    throw zzbbu.zzadn();
                }
                while (i2 < 10) {
                    if (m20461A() < 0) {
                        i2++;
                    }
                }
                throw zzbbu.zzadn();
                return true;
            case 1:
                mo13854e(8);
                return true;
            case 2:
                mo13854e(m20462v());
                return true;
            case 3:
                break;
            case 4:
                return false;
            case 5:
                mo13854e(4);
                return true;
            default:
                throw zzbbu.zzadq();
        }
        do {
            a = mo13845a();
            if (a != 0) {
            }
            mo13846a(((i >>> 3) << 3) | 4);
            return true;
        } while (mo13848b(a));
        mo13846a(((i >>> 3) << 3) | 4);
        return true;
    }

    /* renamed from: c */
    public final float mo13849c() {
        return Float.intBitsToFloat(m20464x());
    }

    /* renamed from: c */
    public final int mo13850c(int i) {
        if (i >= 0) {
            int u = i + mo13870u();
            int i2 = this.f15189k;
            if (u <= i2) {
                this.f15189k = u;
                m20466z();
                return i2;
            }
            throw zzbbu.zzadl();
        }
        throw zzbbu.zzadm();
    }

    /* renamed from: d */
    public final long mo13851d() {
        return m20463w();
    }

    /* renamed from: d */
    public final void mo13852d(int i) {
        this.f15189k = i;
        m20466z();
    }

    /* renamed from: e */
    public final long mo13853e() {
        return m20463w();
    }

    /* renamed from: e */
    public final void mo13854e(int i) {
        if (i >= 0 && i <= this.f15184f - this.f15186h) {
            this.f15186h += i;
        } else if (i < 0) {
            throw zzbbu.zzadm();
        } else {
            throw zzbbu.zzadl();
        }
    }

    /* renamed from: f */
    public final int mo13855f() {
        return m20462v();
    }

    /* renamed from: g */
    public final long mo13856g() {
        return m20465y();
    }

    /* renamed from: h */
    public final int mo13857h() {
        return m20464x();
    }

    /* renamed from: i */
    public final boolean mo13858i() {
        return m20463w() != 0;
    }

    /* renamed from: j */
    public final String mo13859j() {
        int v = m20462v();
        if (v > 0 && v <= this.f15184f - this.f15186h) {
            String str = new String(this.f15182d, this.f15186h, v, aak.f11362a);
            this.f15186h += v;
            return str;
        } else if (v == 0) {
            return "";
        } else {
            if (v < 0) {
                throw zzbbu.zzadm();
            }
            throw zzbbu.zzadl();
        }
    }

    /* renamed from: k */
    public final String mo13860k() {
        int v = m20462v();
        if (v <= 0 || v > this.f15184f - this.f15186h) {
            if (v == 0) {
                return "";
            }
            if (v <= 0) {
                throw zzbbu.zzadm();
            }
            throw zzbbu.zzadl();
        } else if (ade.m15886a(this.f15182d, this.f15186h, this.f15186h + v)) {
            int i = this.f15186h;
            this.f15186h += v;
            return new String(this.f15182d, i, v, aak.f11362a);
        } else {
            throw zzbbu.zzads();
        }
    }

    /* renamed from: l */
    public final zzbah mo13861l() {
        byte[] bArr;
        int v = m20462v();
        if (v > 0 && v <= this.f15184f - this.f15186h) {
            zzbah zzc = zzbah.zzc(this.f15182d, this.f15186h, v);
            this.f15186h += v;
            return zzc;
        } else if (v == 0) {
            return zzbah.zzdpq;
        } else {
            if (v > 0 && v <= this.f15184f - this.f15186h) {
                int i = this.f15186h;
                this.f15186h += v;
                bArr = Arrays.copyOfRange(this.f15182d, i, this.f15186h);
            } else if (v > 0) {
                throw zzbbu.zzadl();
            } else if (v == 0) {
                bArr = aak.f11363b;
            } else {
                throw zzbbu.zzadm();
            }
            return zzbah.zzp(bArr);
        }
    }

    /* renamed from: m */
    public final int mo13862m() {
        return m20462v();
    }

    /* renamed from: n */
    public final int mo13863n() {
        return m20462v();
    }

    /* renamed from: o */
    public final int mo13864o() {
        return m20464x();
    }

    /* renamed from: p */
    public final long mo13865p() {
        return m20465y();
    }

    /* renamed from: q */
    public final int mo13866q() {
        return m20434f(m20462v());
    }

    /* renamed from: r */
    public final long mo13867r() {
        return m20432a(m20463w());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: s */
    public final long mo13868s() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte A = m20461A();
            j |= ((long) (A & Byte.MAX_VALUE)) << i;
            if ((A & 128) == 0) {
                return j;
            }
        }
        throw zzbbu.zzadn();
    }

    /* renamed from: t */
    public final boolean mo13869t() {
        return this.f15186h == this.f15184f;
    }

    /* renamed from: u */
    public final int mo13870u() {
        return this.f15186h - this.f15187i;
    }
}
