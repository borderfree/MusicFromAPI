package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.measurement.io */
public final class C4475io {

    /* renamed from: a */
    private final byte[] f16285a;

    /* renamed from: b */
    private final int f16286b;

    /* renamed from: c */
    private final int f16287c;

    /* renamed from: d */
    private int f16288d;

    /* renamed from: e */
    private int f16289e;

    /* renamed from: f */
    private int f16290f;

    /* renamed from: g */
    private int f16291g;

    /* renamed from: h */
    private int f16292h = Integer.MAX_VALUE;

    /* renamed from: i */
    private int f16293i;

    /* renamed from: j */
    private int f16294j = 64;

    /* renamed from: k */
    private int f16295k = 67108864;

    /* renamed from: l */
    private C4359eq f16296l;

    private C4475io(byte[] bArr, int i, int i2) {
        this.f16285a = bArr;
        this.f16286b = i;
        int i3 = i2 + i;
        this.f16288d = i3;
        this.f16287c = i3;
        this.f16290f = i;
    }

    /* renamed from: a */
    public static C4475io m22169a(byte[] bArr) {
        return m22170a(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public static C4475io m22170a(byte[] bArr, int i, int i2) {
        return new C4475io(bArr, 0, i2);
    }

    /* renamed from: f */
    private final void m22171f(int i) {
        if (i < 0) {
            throw zzyh.zzze();
        } else if (this.f16290f + i > this.f16292h) {
            m22171f(this.f16292h - this.f16290f);
            throw zzyh.zzzd();
        } else if (i <= this.f16288d - this.f16290f) {
            this.f16290f += i;
        } else {
            throw zzyh.zzzd();
        }
    }

    /* renamed from: j */
    private final C4359eq m22172j() {
        if (this.f16296l == null) {
            this.f16296l = C4359eq.m21335a(this.f16285a, this.f16286b, this.f16287c);
        }
        int u = this.f16296l.mo14363u();
        int i = this.f16290f - this.f16286b;
        if (u <= i) {
            this.f16296l.mo14348f(i - u);
            this.f16296l.mo14342c(this.f16294j - this.f16293i);
            return this.f16296l;
        }
        throw new IOException(String.format("CodedInputStream read ahead of CodedInputByteBufferNano: %s > %s", new Object[]{Integer.valueOf(u), Integer.valueOf(i)}));
    }

    /* renamed from: k */
    private final void m22173k() {
        this.f16288d += this.f16289e;
        int i = this.f16288d;
        if (i > this.f16292h) {
            this.f16289e = i - this.f16292h;
            this.f16288d -= this.f16289e;
            return;
        }
        this.f16289e = 0;
    }

    /* renamed from: l */
    private final byte m22174l() {
        if (this.f16290f != this.f16288d) {
            byte[] bArr = this.f16285a;
            int i = this.f16290f;
            this.f16290f = i + 1;
            return bArr[i];
        }
        throw zzyh.zzzd();
    }

    /* renamed from: a */
    public final int mo14707a() {
        if (this.f16290f == this.f16288d) {
            this.f16291g = 0;
            return 0;
        }
        this.f16291g = mo14718d();
        if (this.f16291g != 0) {
            return this.f16291g;
        }
        throw new zzyh("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: a */
    public final <T extends C4383fm<T, ?>> T mo14708a(C4431hb<T> hbVar) {
        try {
            T t = (C4383fm) m22172j().mo14337a(hbVar, C4371fb.m21503b());
            mo14715b(this.f16291g);
            return t;
        } catch (zzuv e) {
            throw new zzyh("", e);
        }
    }

    /* renamed from: a */
    public final void mo14709a(int i) {
        if (this.f16291g != i) {
            throw new zzyh("Protocol message end-group tag did not match expected tag.");
        }
    }

    /* renamed from: a */
    public final void mo14710a(C4483iw iwVar) {
        int d = mo14718d();
        if (this.f16293i < this.f16294j) {
            int c = mo14716c(d);
            this.f16293i++;
            iwVar.mo14223a(this);
            mo14709a(0);
            this.f16293i--;
            mo14719d(c);
            return;
        }
        throw zzyh.zzzg();
    }

    /* renamed from: a */
    public final void mo14711a(C4483iw iwVar, int i) {
        if (this.f16293i < this.f16294j) {
            this.f16293i++;
            iwVar.mo14223a(this);
            mo14709a((i << 3) | 4);
            this.f16293i--;
            return;
        }
        throw zzyh.zzzg();
    }

    /* renamed from: a */
    public final byte[] mo14712a(int i, int i2) {
        if (i2 == 0) {
            return C4486iz.f16332d;
        }
        byte[] bArr = new byte[i2];
        System.arraycopy(this.f16285a, this.f16286b + i, bArr, 0, i2);
        return bArr;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo14713b(int i, int i2) {
        if (i > this.f16290f - this.f16286b) {
            int i3 = this.f16290f - this.f16286b;
            StringBuilder sb = new StringBuilder(50);
            sb.append("Position ");
            sb.append(i);
            sb.append(" is beyond current ");
            sb.append(i3);
            throw new IllegalArgumentException(sb.toString());
        } else if (i >= 0) {
            this.f16290f = this.f16286b + i;
            this.f16291g = i2;
        } else {
            StringBuilder sb2 = new StringBuilder(24);
            sb2.append("Bad position ");
            sb2.append(i);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    /* renamed from: b */
    public final boolean mo14714b() {
        return mo14718d() != 0;
    }

    /* renamed from: b */
    public final boolean mo14715b(int i) {
        int a;
        switch (i & 7) {
            case 0:
                mo14718d();
                return true;
            case 1:
                mo14723g();
                return true;
            case 2:
                m22171f(mo14718d());
                return true;
            case 3:
                break;
            case 4:
                return false;
            case 5:
                mo14722f();
                return true;
            default:
                throw new zzyh("Protocol message tag had invalid wire type.");
        }
        do {
            a = mo14707a();
            if (a != 0) {
            }
            mo14709a(((i >>> 3) << 3) | 4);
            return true;
        } while (mo14715b(a));
        mo14709a(((i >>> 3) << 3) | 4);
        return true;
    }

    /* renamed from: c */
    public final int mo14716c(int i) {
        if (i >= 0) {
            int i2 = i + this.f16290f;
            int i3 = this.f16292h;
            if (i2 <= i3) {
                this.f16292h = i2;
                m22173k();
                return i3;
            }
            throw zzyh.zzzd();
        }
        throw zzyh.zzze();
    }

    /* renamed from: c */
    public final String mo14717c() {
        int d = mo14718d();
        if (d < 0) {
            throw zzyh.zzze();
        } else if (d <= this.f16288d - this.f16290f) {
            String str = new String(this.f16285a, this.f16290f, d, C4482iv.f16323a);
            this.f16290f += d;
            return str;
        } else {
            throw zzyh.zzzd();
        }
    }

    /* renamed from: d */
    public final int mo14718d() {
        byte b;
        int i;
        byte l = m22174l();
        if (l >= 0) {
            return l;
        }
        byte b2 = l & Byte.MAX_VALUE;
        byte l2 = m22174l();
        if (l2 >= 0) {
            i = l2 << 7;
        } else {
            b2 |= (l2 & Byte.MAX_VALUE) << 7;
            byte l3 = m22174l();
            if (l3 >= 0) {
                i = l3 << 14;
            } else {
                b2 |= (l3 & Byte.MAX_VALUE) << 14;
                byte l4 = m22174l();
                if (l4 >= 0) {
                    i = l4 << 21;
                } else {
                    byte b3 = b2 | ((l4 & Byte.MAX_VALUE) << 21);
                    byte l5 = m22174l();
                    b = b3 | (l5 << 28);
                    if (l5 < 0) {
                        for (int i2 = 0; i2 < 5; i2++) {
                            if (m22174l() >= 0) {
                                return b;
                            }
                        }
                        throw zzyh.zzzf();
                    }
                    return b;
                }
            }
        }
        b = b2 | i;
        return b;
    }

    /* renamed from: d */
    public final void mo14719d(int i) {
        this.f16292h = i;
        m22173k();
    }

    /* renamed from: e */
    public final long mo14720e() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte l = m22174l();
            j |= ((long) (l & Byte.MAX_VALUE)) << i;
            if ((l & 128) == 0) {
                return j;
            }
        }
        throw zzyh.zzzf();
    }

    /* renamed from: e */
    public final void mo14721e(int i) {
        mo14713b(i, this.f16291g);
    }

    /* renamed from: f */
    public final int mo14722f() {
        return (m22174l() & 255) | ((m22174l() & 255) << 8) | ((m22174l() & 255) << 16) | ((m22174l() & 255) << 24);
    }

    /* renamed from: g */
    public final long mo14723g() {
        byte l = m22174l();
        byte l2 = m22174l();
        return ((((long) l2) & 255) << 8) | (((long) l) & 255) | ((((long) m22174l()) & 255) << 16) | ((((long) m22174l()) & 255) << 24) | ((((long) m22174l()) & 255) << 32) | ((((long) m22174l()) & 255) << 40) | ((((long) m22174l()) & 255) << 48) | ((((long) m22174l()) & 255) << 56);
    }

    /* renamed from: h */
    public final int mo14724h() {
        if (this.f16292h == Integer.MAX_VALUE) {
            return -1;
        }
        return this.f16292h - this.f16290f;
    }

    /* renamed from: i */
    public final int mo14725i() {
        return this.f16290f - this.f16286b;
    }
}
