package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class zzbav extends C4118zg {

    /* renamed from: b */
    private static final Logger f15392b = Logger.getLogger(zzbav.class.getName());
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final boolean f15393c = adc.m15813a();

    /* renamed from: a */
    C4130zs f15394a = this;

    /* renamed from: com.google.android.gms.internal.ads.zzbav$a */
    static class C4139a extends zzbav {

        /* renamed from: b */
        private final byte[] f15395b;

        /* renamed from: c */
        private final int f15396c;

        /* renamed from: d */
        private final int f15397d;

        /* renamed from: e */
        private int f15398e;

        C4139a(byte[] bArr, int i, int i2) {
            super();
            if (bArr != null) {
                int i3 = i2 + 0;
                if ((i2 | 0 | (bArr.length - i3)) >= 0) {
                    this.f15395b = bArr;
                    this.f15396c = 0;
                    this.f15398e = 0;
                    this.f15397d = i3;
                    return;
                }
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(0), Integer.valueOf(i2)}));
            }
            throw new NullPointerException("buffer");
        }

        /* renamed from: a */
        public final int mo13922a() {
            return this.f15397d - this.f15398e;
        }

        /* renamed from: a */
        public final void mo13923a(byte b) {
            try {
                byte[] bArr = this.f15395b;
                int i = this.f15398e;
                this.f15398e = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f15398e), Integer.valueOf(this.f15397d), Integer.valueOf(1)}), e);
            }
        }

        /* renamed from: a */
        public final void mo13926a(int i) {
            if (i >= 0) {
                mo13943b(i);
            } else {
                mo13936a((long) i);
            }
        }

        /* renamed from: a */
        public final void mo13929a(int i, int i2) {
            mo13943b((i << 3) | i2);
        }

        /* renamed from: a */
        public final void mo13930a(int i, long j) {
            mo13929a(i, 0);
            mo13936a(j);
        }

        /* renamed from: a */
        public final void mo13931a(int i, abl abl) {
            mo13929a(1, 3);
            mo13950c(2, i);
            mo13929a(3, 2);
            mo13937a(abl);
            mo13929a(1, 4);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo13932a(int i, abl abl, ace ace) {
            mo13929a(i, 2);
            C4107yw ywVar = (C4107yw) abl;
            int j = ywVar.mo11479j();
            if (j == -1) {
                j = ace.mo11561b(ywVar);
                ywVar.mo11475a(j);
            }
            mo13943b(j);
            ace.mo11558a(abl, (adj) this.f15394a);
        }

        /* renamed from: a */
        public final void mo13933a(int i, zzbah zzbah) {
            mo13929a(i, 2);
            mo13938a(zzbah);
        }

        /* renamed from: a */
        public final void mo13934a(int i, String str) {
            mo13929a(i, 2);
            mo13939a(str);
        }

        /* renamed from: a */
        public final void mo13935a(int i, boolean z) {
            mo13929a(i, 0);
            mo13923a(z ? (byte) 1 : 0);
        }

        /* renamed from: a */
        public final void mo13936a(long j) {
            if (!zzbav.f15393c || mo13922a() < 10) {
                while ((j & -128) != 0) {
                    byte[] bArr = this.f15395b;
                    int i = this.f15398e;
                    this.f15398e = i + 1;
                    bArr[i] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f15395b;
                    int i2 = this.f15398e;
                    this.f15398e = i2 + 1;
                    bArr2[i2] = (byte) ((int) j);
                } catch (IndexOutOfBoundsException e) {
                    throw new zzb(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f15398e), Integer.valueOf(this.f15397d), Integer.valueOf(1)}), e);
                }
            } else {
                while ((j & -128) != 0) {
                    byte[] bArr3 = this.f15395b;
                    int i3 = this.f15398e;
                    this.f15398e = i3 + 1;
                    adc.m15812a(bArr3, (long) i3, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr4 = this.f15395b;
                int i4 = this.f15398e;
                this.f15398e = i4 + 1;
                adc.m15812a(bArr4, (long) i4, (byte) ((int) j));
            }
        }

        /* renamed from: a */
        public final void mo13937a(abl abl) {
            mo13943b(abl.mo11481l());
            abl.mo11476a(this);
        }

        /* renamed from: a */
        public final void mo13938a(zzbah zzbah) {
            mo13943b(zzbah.size());
            zzbah.zza((C4118zg) this);
        }

        /* renamed from: a */
        public final void mo13939a(String str) {
            int i = this.f15398e;
            try {
                int g = m20670g(str.length() * 3);
                int g2 = m20670g(str.length());
                if (g2 == g) {
                    this.f15398e = i + g2;
                    int a = ade.m15884a(str, this.f15395b, this.f15398e, mo13922a());
                    this.f15398e = i;
                    mo13943b((a - i) - g2);
                    this.f15398e = a;
                    return;
                }
                mo13943b(ade.m15883a((CharSequence) str));
                this.f15398e = ade.m15884a(str, this.f15395b, this.f15398e, mo13922a());
            } catch (zzbep e) {
                this.f15398e = i;
                mo13940a(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new zzb(e2);
            }
        }

        /* renamed from: a */
        public final void mo13838a(byte[] bArr, int i, int i2) {
            mo13948b(bArr, i, i2);
        }

        /* renamed from: b */
        public final void mo13943b(int i) {
            if (!zzbav.f15393c || mo13922a() < 10) {
                while ((i & -128) != 0) {
                    byte[] bArr = this.f15395b;
                    int i2 = this.f15398e;
                    this.f15398e = i2 + 1;
                    bArr[i2] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f15395b;
                    int i3 = this.f15398e;
                    this.f15398e = i3 + 1;
                    bArr2[i3] = (byte) i;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzb(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f15398e), Integer.valueOf(this.f15397d), Integer.valueOf(1)}), e);
                }
            } else {
                while ((i & -128) != 0) {
                    byte[] bArr3 = this.f15395b;
                    int i4 = this.f15398e;
                    this.f15398e = i4 + 1;
                    adc.m15812a(bArr3, (long) i4, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
                byte[] bArr4 = this.f15395b;
                int i5 = this.f15398e;
                this.f15398e = i5 + 1;
                adc.m15812a(bArr4, (long) i5, (byte) i);
            }
        }

        /* renamed from: b */
        public final void mo13944b(int i, int i2) {
            mo13929a(i, 0);
            mo13926a(i2);
        }

        /* renamed from: b */
        public final void mo13946b(int i, zzbah zzbah) {
            mo13929a(1, 3);
            mo13950c(2, i);
            mo13933a(3, zzbah);
            mo13929a(1, 4);
        }

        /* renamed from: b */
        public final void mo13948b(byte[] bArr, int i, int i2) {
            try {
                System.arraycopy(bArr, i, this.f15395b, this.f15398e, i2);
                this.f15398e += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f15398e), Integer.valueOf(this.f15397d), Integer.valueOf(i2)}), e);
            }
        }

        /* renamed from: c */
        public final void mo13950c(int i, int i2) {
            mo13929a(i, 0);
            mo13943b(i2);
        }

        /* renamed from: c */
        public final void mo13951c(int i, long j) {
            mo13929a(i, 1);
            mo13952c(j);
        }

        /* renamed from: c */
        public final void mo13952c(long j) {
            try {
                byte[] bArr = this.f15395b;
                int i = this.f15398e;
                this.f15398e = i + 1;
                bArr[i] = (byte) ((int) j);
                byte[] bArr2 = this.f15395b;
                int i2 = this.f15398e;
                this.f15398e = i2 + 1;
                bArr2[i2] = (byte) ((int) (j >> 8));
                byte[] bArr3 = this.f15395b;
                int i3 = this.f15398e;
                this.f15398e = i3 + 1;
                bArr3[i3] = (byte) ((int) (j >> 16));
                byte[] bArr4 = this.f15395b;
                int i4 = this.f15398e;
                this.f15398e = i4 + 1;
                bArr4[i4] = (byte) ((int) (j >> 24));
                byte[] bArr5 = this.f15395b;
                int i5 = this.f15398e;
                this.f15398e = i5 + 1;
                bArr5[i5] = (byte) ((int) (j >> 32));
                byte[] bArr6 = this.f15395b;
                int i6 = this.f15398e;
                this.f15398e = i6 + 1;
                bArr6[i6] = (byte) ((int) (j >> 40));
                byte[] bArr7 = this.f15395b;
                int i7 = this.f15398e;
                this.f15398e = i7 + 1;
                bArr7[i7] = (byte) ((int) (j >> 48));
                byte[] bArr8 = this.f15395b;
                int i8 = this.f15398e;
                this.f15398e = i8 + 1;
                bArr8[i8] = (byte) ((int) (j >> 56));
            } catch (IndexOutOfBoundsException e) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f15398e), Integer.valueOf(this.f15397d), Integer.valueOf(1)}), e);
            }
        }

        /* renamed from: c */
        public final void mo13953c(byte[] bArr, int i, int i2) {
            mo13943b(i2);
            mo13948b(bArr, 0, i2);
        }

        /* JADX WARNING: type inference failed for: r0v4, types: [byte[]] */
        /* JADX WARNING: type inference failed for: r5v2, types: [byte, int] */
        /* JADX WARNING: Incorrect type for immutable var: ssa=byte[], code=null, for r0v4, types: [byte[]] */
        /* JADX WARNING: Incorrect type for immutable var: ssa=int, code=null, for r5v2, types: [byte, int] */
        /* JADX WARNING: Unknown variable types count: 2 */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo13954d(int r5) {
            /*
                r4 = this;
                byte[] r0 = r4.f15395b     // Catch:{ IndexOutOfBoundsException -> 0x0032 }
                int r1 = r4.f15398e     // Catch:{ IndexOutOfBoundsException -> 0x0032 }
                int r2 = r1 + 1
                r4.f15398e = r2     // Catch:{ IndexOutOfBoundsException -> 0x0032 }
                byte r2 = (byte) r5     // Catch:{ IndexOutOfBoundsException -> 0x0032 }
                r0[r1] = r2     // Catch:{ IndexOutOfBoundsException -> 0x0032 }
                byte[] r0 = r4.f15395b     // Catch:{ IndexOutOfBoundsException -> 0x0032 }
                int r1 = r4.f15398e     // Catch:{ IndexOutOfBoundsException -> 0x0032 }
                int r2 = r1 + 1
                r4.f15398e = r2     // Catch:{ IndexOutOfBoundsException -> 0x0032 }
                int r2 = r5 >> 8
                byte r2 = (byte) r2     // Catch:{ IndexOutOfBoundsException -> 0x0032 }
                r0[r1] = r2     // Catch:{ IndexOutOfBoundsException -> 0x0032 }
                byte[] r0 = r4.f15395b     // Catch:{ IndexOutOfBoundsException -> 0x0032 }
                int r1 = r4.f15398e     // Catch:{ IndexOutOfBoundsException -> 0x0032 }
                int r2 = r1 + 1
                r4.f15398e = r2     // Catch:{ IndexOutOfBoundsException -> 0x0032 }
                int r2 = r5 >> 16
                byte r2 = (byte) r2     // Catch:{ IndexOutOfBoundsException -> 0x0032 }
                r0[r1] = r2     // Catch:{ IndexOutOfBoundsException -> 0x0032 }
                byte[] r0 = r4.f15395b     // Catch:{ IndexOutOfBoundsException -> 0x0032 }
                int r1 = r4.f15398e     // Catch:{ IndexOutOfBoundsException -> 0x0032 }
                int r2 = r1 + 1
                r4.f15398e = r2     // Catch:{ IndexOutOfBoundsException -> 0x0032 }
                int r5 = r5 >> 24
                r0[r1] = r5     // Catch:{ IndexOutOfBoundsException -> 0x0032 }
                return
            L_0x0032:
                r5 = move-exception
                com.google.android.gms.internal.ads.zzbav$zzb r0 = new com.google.android.gms.internal.ads.zzbav$zzb
                r1 = 3
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r2 = 0
                int r3 = r4.f15398e
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r1[r2] = r3
                int r2 = r4.f15397d
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r3 = 1
                r1[r3] = r2
                r2 = 2
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r1[r2] = r3
                java.lang.String r2 = "Pos: %d, limit: %d, len: %d"
                java.lang.String r1 = java.lang.String.format(r2, r1)
                r0.<init>(r1, r5)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbav.C4139a.mo13954d(int):void");
        }

        /* renamed from: e */
        public final void mo13956e(int i, int i2) {
            mo13929a(i, 5);
            mo13954d(i2);
        }
    }

    public static class zzb extends IOException {
        zzb() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        zzb(String str, Throwable th) {
            String valueOf = String.valueOf("CodedOutputStream was writing to a flat byte array and ran out of space.: ");
            String valueOf2 = String.valueOf(str);
            super(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), th);
        }

        zzb(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }
    }

    private zzbav() {
    }

    /* renamed from: a */
    public static int m20638a(int i, aat aat) {
        int e = m20663e(i);
        int b = aat.mo11517b();
        return e + m20670g(b) + b;
    }

    /* renamed from: a */
    public static int m20639a(aat aat) {
        int b = aat.mo11517b();
        return m20670g(b) + b;
    }

    /* renamed from: a */
    static int m20640a(abl abl, ace ace) {
        C4107yw ywVar = (C4107yw) abl;
        int j = ywVar.mo11479j();
        if (j == -1) {
            j = ace.mo11561b(ywVar);
            ywVar.mo11475a(j);
        }
        return m20670g(j) + j;
    }

    /* renamed from: a */
    public static zzbav m20641a(byte[] bArr) {
        return new C4139a(bArr, 0, bArr.length);
    }

    /* renamed from: b */
    public static int m20642b(double d) {
        return 8;
    }

    /* renamed from: b */
    public static int m20643b(float f) {
        return 4;
    }

    /* renamed from: b */
    public static int m20644b(int i, double d) {
        return m20663e(i) + 8;
    }

    /* renamed from: b */
    public static int m20645b(int i, float f) {
        return m20663e(i) + 4;
    }

    /* renamed from: b */
    public static int m20646b(int i, aat aat) {
        return (m20663e(1) << 1) + m20671g(2, i) + m20638a(3, aat);
    }

    /* renamed from: b */
    public static int m20647b(int i, abl abl) {
        return (m20663e(1) << 1) + m20671g(2, i) + m20663e(3) + m20651b(abl);
    }

    /* renamed from: b */
    static int m20648b(int i, abl abl, ace ace) {
        return m20663e(i) + m20640a(abl, ace);
    }

    /* renamed from: b */
    public static int m20649b(int i, String str) {
        return m20663e(i) + m20653b(str);
    }

    /* renamed from: b */
    public static int m20650b(int i, boolean z) {
        return m20663e(i) + 1;
    }

    /* renamed from: b */
    public static int m20651b(abl abl) {
        int l = abl.mo11481l();
        return m20670g(l) + l;
    }

    /* renamed from: b */
    public static int m20652b(zzbah zzbah) {
        int size = zzbah.size();
        return m20670g(size) + size;
    }

    /* renamed from: b */
    public static int m20653b(String str) {
        int i;
        try {
            i = ade.m15883a((CharSequence) str);
        } catch (zzbep unused) {
            i = str.getBytes(aak.f11362a).length;
        }
        return m20670g(i) + i;
    }

    /* renamed from: b */
    public static int m20654b(boolean z) {
        return 1;
    }

    /* renamed from: b */
    public static int m20655b(byte[] bArr) {
        int length = bArr.length;
        return m20670g(length) + length;
    }

    @Deprecated
    /* renamed from: c */
    static int m20656c(int i, abl abl, ace ace) {
        int e = m20663e(i) << 1;
        C4107yw ywVar = (C4107yw) abl;
        int j = ywVar.mo11479j();
        if (j == -1) {
            j = ace.mo11561b(ywVar);
            ywVar.mo11475a(j);
        }
        return e + j;
    }

    /* renamed from: c */
    public static int m20657c(int i, zzbah zzbah) {
        int e = m20663e(i);
        int size = zzbah.size();
        return e + m20670g(size) + size;
    }

    @Deprecated
    /* renamed from: c */
    public static int m20658c(abl abl) {
        return abl.mo11481l();
    }

    /* renamed from: d */
    public static int m20660d(int i, long j) {
        return m20663e(i) + m20665e(j);
    }

    /* renamed from: d */
    public static int m20661d(int i, zzbah zzbah) {
        return (m20663e(1) << 1) + m20671g(2, i) + m20657c(3, zzbah);
    }

    /* renamed from: d */
    public static int m20662d(long j) {
        return m20665e(j);
    }

    /* renamed from: e */
    public static int m20663e(int i) {
        return m20670g(i << 3);
    }

    /* renamed from: e */
    public static int m20664e(int i, long j) {
        return m20663e(i) + m20665e(j);
    }

    /* renamed from: e */
    public static int m20665e(long j) {
        int i;
        if ((-128 & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if ((-34359738368L & j) != 0) {
            i = 6;
            j >>>= 28;
        } else {
            i = 2;
        }
        if ((-2097152 & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        if ((j & -16384) != 0) {
            i++;
        }
        return i;
    }

    /* renamed from: f */
    public static int m20666f(int i) {
        if (i >= 0) {
            return m20670g(i);
        }
        return 10;
    }

    /* renamed from: f */
    public static int m20667f(int i, int i2) {
        return m20663e(i) + m20666f(i2);
    }

    /* renamed from: f */
    public static int m20668f(int i, long j) {
        return m20663e(i) + m20665e(m20680i(j));
    }

    /* renamed from: f */
    public static int m20669f(long j) {
        return m20665e(m20680i(j));
    }

    /* renamed from: g */
    public static int m20670g(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        return (i & -268435456) == 0 ? 4 : 5;
    }

    /* renamed from: g */
    public static int m20671g(int i, int i2) {
        return m20663e(i) + m20670g(i2);
    }

    /* renamed from: g */
    public static int m20672g(int i, long j) {
        return m20663e(i) + 8;
    }

    /* renamed from: g */
    public static int m20673g(long j) {
        return 8;
    }

    /* renamed from: h */
    public static int m20674h(int i) {
        return m20670g(m20686m(i));
    }

    /* renamed from: h */
    public static int m20675h(int i, int i2) {
        return m20663e(i) + m20670g(m20686m(i2));
    }

    /* renamed from: h */
    public static int m20676h(int i, long j) {
        return m20663e(i) + 8;
    }

    /* renamed from: h */
    public static int m20677h(long j) {
        return 8;
    }

    /* renamed from: i */
    public static int m20678i(int i) {
        return 4;
    }

    /* renamed from: i */
    public static int m20679i(int i, int i2) {
        return m20663e(i) + 4;
    }

    /* renamed from: i */
    private static long m20680i(long j) {
        return (j >> 63) ^ (j << 1);
    }

    /* renamed from: j */
    public static int m20681j(int i) {
        return 4;
    }

    /* renamed from: j */
    public static int m20682j(int i, int i2) {
        return m20663e(i) + 4;
    }

    /* renamed from: k */
    public static int m20683k(int i) {
        return m20666f(i);
    }

    /* renamed from: k */
    public static int m20684k(int i, int i2) {
        return m20663e(i) + m20666f(i2);
    }

    @Deprecated
    /* renamed from: l */
    public static int m20685l(int i) {
        return m20670g(i);
    }

    /* renamed from: m */
    private static int m20686m(int i) {
        return (i >> 31) ^ (i << 1);
    }

    /* renamed from: a */
    public abstract int mo13922a();

    /* renamed from: a */
    public abstract void mo13923a(byte b);

    /* renamed from: a */
    public final void mo13924a(double d) {
        mo13952c(Double.doubleToRawLongBits(d));
    }

    /* renamed from: a */
    public final void mo13925a(float f) {
        mo13954d(Float.floatToRawIntBits(f));
    }

    /* renamed from: a */
    public abstract void mo13926a(int i);

    /* renamed from: a */
    public final void mo13927a(int i, double d) {
        mo13951c(i, Double.doubleToRawLongBits(d));
    }

    /* renamed from: a */
    public final void mo13928a(int i, float f) {
        mo13956e(i, Float.floatToRawIntBits(f));
    }

    /* renamed from: a */
    public abstract void mo13929a(int i, int i2);

    /* renamed from: a */
    public abstract void mo13930a(int i, long j);

    /* renamed from: a */
    public abstract void mo13931a(int i, abl abl);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo13932a(int i, abl abl, ace ace);

    /* renamed from: a */
    public abstract void mo13933a(int i, zzbah zzbah);

    /* renamed from: a */
    public abstract void mo13934a(int i, String str);

    /* renamed from: a */
    public abstract void mo13935a(int i, boolean z);

    /* renamed from: a */
    public abstract void mo13936a(long j);

    /* renamed from: a */
    public abstract void mo13937a(abl abl);

    /* renamed from: a */
    public abstract void mo13938a(zzbah zzbah);

    /* renamed from: a */
    public abstract void mo13939a(String str);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo13940a(String str, zzbep zzbep) {
        f15392b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", zzbep);
        byte[] bytes = str.getBytes(aak.f11362a);
        try {
            mo13943b(bytes.length);
            mo13838a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new zzb(e);
        } catch (zzb e2) {
            throw e2;
        }
    }

    /* renamed from: a */
    public final void mo13941a(boolean z) {
        mo13923a(z ? (byte) 1 : 0);
    }

    /* renamed from: b */
    public final void mo13942b() {
        if (mo13922a() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* renamed from: b */
    public abstract void mo13943b(int i);

    /* renamed from: b */
    public abstract void mo13944b(int i, int i2);

    /* renamed from: b */
    public final void mo13945b(int i, long j) {
        mo13930a(i, m20680i(j));
    }

    /* renamed from: b */
    public abstract void mo13946b(int i, zzbah zzbah);

    /* renamed from: b */
    public final void mo13947b(long j) {
        mo13936a(m20680i(j));
    }

    /* renamed from: b */
    public abstract void mo13948b(byte[] bArr, int i, int i2);

    /* renamed from: c */
    public final void mo13949c(int i) {
        mo13943b(m20686m(i));
    }

    /* renamed from: c */
    public abstract void mo13950c(int i, int i2);

    /* renamed from: c */
    public abstract void mo13951c(int i, long j);

    /* renamed from: c */
    public abstract void mo13952c(long j);

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public abstract void mo13953c(byte[] bArr, int i, int i2);

    /* renamed from: d */
    public abstract void mo13954d(int i);

    /* renamed from: d */
    public final void mo13955d(int i, int i2) {
        mo13950c(i, m20686m(i2));
    }

    /* renamed from: e */
    public abstract void mo13956e(int i, int i2);
}
