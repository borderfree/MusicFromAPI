package com.google.android.gms.internal.ads;

public final class adk {

    /* renamed from: a */
    private final byte[] f11538a;

    /* renamed from: b */
    private final int f11539b;

    /* renamed from: c */
    private final int f11540c;

    /* renamed from: d */
    private int f11541d;

    /* renamed from: e */
    private int f11542e;

    /* renamed from: f */
    private int f11543f;

    /* renamed from: g */
    private int f11544g;

    /* renamed from: h */
    private int f11545h = Integer.MAX_VALUE;

    /* renamed from: i */
    private int f11546i;

    /* renamed from: j */
    private int f11547j = 64;

    /* renamed from: k */
    private int f11548k = 67108864;

    private adk(byte[] bArr, int i, int i2) {
        this.f11538a = bArr;
        this.f11539b = i;
        int i3 = i2 + i;
        this.f11541d = i3;
        this.f11540c = i3;
        this.f11543f = i;
    }

    /* renamed from: a */
    public static adk m15941a(byte[] bArr, int i, int i2) {
        return new adk(bArr, 0, i2);
    }

    /* renamed from: f */
    private final void m15942f(int i) {
        if (i < 0) {
            throw zzbfh.zzagr();
        } else if (this.f11543f + i > this.f11545h) {
            m15942f(this.f11545h - this.f11543f);
            throw zzbfh.zzagq();
        } else if (i <= this.f11541d - this.f11543f) {
            this.f11543f += i;
        } else {
            throw zzbfh.zzagq();
        }
    }

    /* renamed from: k */
    private final void m15943k() {
        this.f11541d += this.f11542e;
        int i = this.f11541d;
        if (i > this.f11545h) {
            this.f11542e = i - this.f11545h;
            this.f11541d -= this.f11542e;
            return;
        }
        this.f11542e = 0;
    }

    /* renamed from: l */
    private final byte m15944l() {
        if (this.f11543f != this.f11541d) {
            byte[] bArr = this.f11538a;
            int i = this.f11543f;
            this.f11543f = i + 1;
            return bArr[i];
        }
        throw zzbfh.zzagq();
    }

    /* renamed from: a */
    public final int mo11782a() {
        if (this.f11543f == this.f11541d) {
            this.f11544g = 0;
            return 0;
        }
        this.f11544g = mo11796g();
        if (this.f11544g != 0) {
            return this.f11544g;
        }
        throw new zzbfh("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: a */
    public final void mo11783a(int i) {
        if (this.f11544g != i) {
            throw new zzbfh("Protocol message end-group tag did not match expected tag.");
        }
    }

    /* renamed from: a */
    public final void mo11784a(C3401ads ads) {
        int g = mo11796g();
        if (this.f11546i < this.f11547j) {
            int c = mo11790c(g);
            this.f11546i++;
            ads.mo11511a(this);
            mo11783a(0);
            this.f11546i--;
            mo11791d(c);
            return;
        }
        throw new zzbfh("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    /* renamed from: a */
    public final byte[] mo11785a(int i, int i2) {
        if (i2 == 0) {
            return adv.f11573e;
        }
        byte[] bArr = new byte[i2];
        System.arraycopy(this.f11538a, this.f11539b + i, bArr, 0, i2);
        return bArr;
    }

    /* renamed from: b */
    public final long mo11786b() {
        return mo11797h();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo11787b(int i, int i2) {
        if (i > this.f11543f - this.f11539b) {
            int i3 = this.f11543f - this.f11539b;
            StringBuilder sb = new StringBuilder(50);
            sb.append("Position ");
            sb.append(i);
            sb.append(" is beyond current ");
            sb.append(i3);
            throw new IllegalArgumentException(sb.toString());
        } else if (i >= 0) {
            this.f11543f = this.f11539b + i;
            this.f11544g = i2;
        } else {
            StringBuilder sb2 = new StringBuilder(24);
            sb2.append("Bad position ");
            sb2.append(i);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    /* renamed from: b */
    public final boolean mo11788b(int i) {
        int a;
        switch (i & 7) {
            case 0:
                mo11796g();
                return true;
            case 1:
                m15944l();
                m15944l();
                m15944l();
                m15944l();
                m15944l();
                m15944l();
                m15944l();
                m15944l();
                return true;
            case 2:
                m15942f(mo11796g());
                return true;
            case 3:
                break;
            case 4:
                return false;
            case 5:
                m15944l();
                m15944l();
                m15944l();
                m15944l();
                return true;
            default:
                throw new zzbfh("Protocol message tag had invalid wire type.");
        }
        do {
            a = mo11782a();
            if (a != 0) {
            }
            mo11783a(((i >>> 3) << 3) | 4);
            return true;
        } while (mo11788b(a));
        mo11783a(((i >>> 3) << 3) | 4);
        return true;
    }

    /* renamed from: c */
    public final int mo11789c() {
        return mo11796g();
    }

    /* renamed from: c */
    public final int mo11790c(int i) {
        if (i >= 0) {
            int i2 = i + this.f11543f;
            int i3 = this.f11545h;
            if (i2 <= i3) {
                this.f11545h = i2;
                m15943k();
                return i3;
            }
            throw zzbfh.zzagq();
        }
        throw zzbfh.zzagr();
    }

    /* renamed from: d */
    public final void mo11791d(int i) {
        this.f11545h = i;
        m15943k();
    }

    /* renamed from: d */
    public final boolean mo11792d() {
        return mo11796g() != 0;
    }

    /* renamed from: e */
    public final String mo11793e() {
        int g = mo11796g();
        if (g < 0) {
            throw zzbfh.zzagr();
        } else if (g <= this.f11541d - this.f11543f) {
            String str = new String(this.f11538a, this.f11543f, g, adr.f11563a);
            this.f11543f += g;
            return str;
        } else {
            throw zzbfh.zzagq();
        }
    }

    /* renamed from: e */
    public final void mo11794e(int i) {
        mo11787b(i, this.f11544g);
    }

    /* renamed from: f */
    public final byte[] mo11795f() {
        int g = mo11796g();
        if (g < 0) {
            throw zzbfh.zzagr();
        } else if (g == 0) {
            return adv.f11573e;
        } else {
            if (g <= this.f11541d - this.f11543f) {
                byte[] bArr = new byte[g];
                System.arraycopy(this.f11538a, this.f11543f, bArr, 0, g);
                this.f11543f += g;
                return bArr;
            }
            throw zzbfh.zzagq();
        }
    }

    /* renamed from: g */
    public final int mo11796g() {
        byte b;
        int i;
        byte l = m15944l();
        if (l >= 0) {
            return l;
        }
        byte b2 = l & Byte.MAX_VALUE;
        byte l2 = m15944l();
        if (l2 >= 0) {
            i = l2 << 7;
        } else {
            b2 |= (l2 & Byte.MAX_VALUE) << 7;
            byte l3 = m15944l();
            if (l3 >= 0) {
                i = l3 << 14;
            } else {
                b2 |= (l3 & Byte.MAX_VALUE) << 14;
                byte l4 = m15944l();
                if (l4 >= 0) {
                    i = l4 << 21;
                } else {
                    byte b3 = b2 | ((l4 & Byte.MAX_VALUE) << 21);
                    byte l5 = m15944l();
                    b = b3 | (l5 << 28);
                    if (l5 < 0) {
                        for (int i2 = 0; i2 < 5; i2++) {
                            if (m15944l() >= 0) {
                                return b;
                            }
                        }
                        throw zzbfh.zzags();
                    }
                    return b;
                }
            }
        }
        b = b2 | i;
        return b;
    }

    /* renamed from: h */
    public final long mo11797h() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte l = m15944l();
            j |= ((long) (l & Byte.MAX_VALUE)) << i;
            if ((l & 128) == 0) {
                return j;
            }
        }
        throw zzbfh.zzags();
    }

    /* renamed from: i */
    public final int mo11798i() {
        if (this.f11545h == Integer.MAX_VALUE) {
            return -1;
        }
        return this.f11545h - this.f11543f;
    }

    /* renamed from: j */
    public final int mo11799j() {
        return this.f11543f - this.f11539b;
    }
}
