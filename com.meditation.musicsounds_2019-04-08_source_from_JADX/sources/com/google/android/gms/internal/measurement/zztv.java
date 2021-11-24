package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class zztv extends C4350eh {

    /* renamed from: b */
    private static final Logger f16414b = Logger.getLogger(zztv.class.getName());
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final boolean f16415c = C4462if.m22009a();

    /* renamed from: a */
    C4365ew f16416a = this;

    /* renamed from: com.google.android.gms.internal.measurement.zztv$a */
    static class C4508a extends zztv {

        /* renamed from: b */
        private final byte[] f16417b;

        /* renamed from: c */
        private final int f16418c;

        /* renamed from: d */
        private final int f16419d;

        /* renamed from: e */
        private int f16420e;

        C4508a(byte[] bArr, int i, int i2) {
            super();
            if (bArr != null) {
                int i3 = i + i2;
                if ((i | i2 | (bArr.length - i3)) >= 0) {
                    this.f16417b = bArr;
                    this.f16418c = i;
                    this.f16420e = i;
                    this.f16419d = i3;
                    return;
                }
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)}));
            }
            throw new NullPointerException("buffer");
        }

        /* renamed from: a */
        public void mo14896a() {
        }

        /* renamed from: a */
        public final void mo14897a(byte b) {
            try {
                byte[] bArr = this.f16417b;
                int i = this.f16420e;
                this.f16420e = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f16420e), Integer.valueOf(this.f16419d), Integer.valueOf(1)}), e);
            }
        }

        /* renamed from: a */
        public final void mo14900a(int i) {
            if (i >= 0) {
                mo14918b(i);
            } else {
                mo14910a((long) i);
            }
        }

        /* renamed from: a */
        public final void mo14903a(int i, int i2) {
            mo14918b((i << 3) | i2);
        }

        /* renamed from: a */
        public final void mo14904a(int i, long j) {
            mo14903a(i, 0);
            mo14910a(j);
        }

        /* renamed from: a */
        public final void mo14905a(int i, C4419gq gqVar) {
            mo14903a(i, 2);
            mo14911a(gqVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo14906a(int i, C4419gq gqVar, C4437hh hhVar) {
            mo14903a(i, 2);
            C4343ea eaVar = (C4343ea) gqVar;
            int e = eaVar.mo14302e();
            if (e == -1) {
                e = hhVar.mo14575b(eaVar);
                eaVar.mo14300a(e);
            }
            mo14918b(e);
            hhVar.mo14573a(gqVar, (C4474in) this.f16416a);
        }

        /* renamed from: a */
        public final void mo14907a(int i, zzte zzte) {
            mo14903a(i, 2);
            mo14913a(zzte);
        }

        /* renamed from: a */
        public final void mo14908a(int i, String str) {
            mo14903a(i, 2);
            mo14914a(str);
        }

        /* renamed from: a */
        public final void mo14909a(int i, boolean z) {
            mo14903a(i, 0);
            mo14897a(z ? (byte) 1 : 0);
        }

        /* renamed from: a */
        public final void mo14910a(long j) {
            if (!zztv.f16415c || mo14917b() < 10) {
                while ((j & -128) != 0) {
                    byte[] bArr = this.f16417b;
                    int i = this.f16420e;
                    this.f16420e = i + 1;
                    bArr[i] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f16417b;
                    int i2 = this.f16420e;
                    this.f16420e = i2 + 1;
                    bArr2[i2] = (byte) ((int) j);
                } catch (IndexOutOfBoundsException e) {
                    throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f16420e), Integer.valueOf(this.f16419d), Integer.valueOf(1)}), e);
                }
            } else {
                while ((j & -128) != 0) {
                    byte[] bArr3 = this.f16417b;
                    int i3 = this.f16420e;
                    this.f16420e = i3 + 1;
                    C4462if.m22007a(bArr3, (long) i3, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr4 = this.f16417b;
                int i4 = this.f16420e;
                this.f16420e = i4 + 1;
                C4462if.m22007a(bArr4, (long) i4, (byte) ((int) j));
            }
        }

        /* renamed from: a */
        public final void mo14911a(C4419gq gqVar) {
            mo14918b(gqVar.mo14497h());
            gqVar.mo14493a(this);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo14912a(C4419gq gqVar, C4437hh hhVar) {
            C4343ea eaVar = (C4343ea) gqVar;
            int e = eaVar.mo14302e();
            if (e == -1) {
                e = hhVar.mo14575b(eaVar);
                eaVar.mo14300a(e);
            }
            mo14918b(e);
            hhVar.mo14573a(gqVar, (C4474in) this.f16416a);
        }

        /* renamed from: a */
        public final void mo14913a(zzte zzte) {
            mo14918b(zzte.size());
            zzte.zza((C4350eh) this);
        }

        /* renamed from: a */
        public final void mo14914a(String str) {
            int i = this.f16420e;
            try {
                int g = m22440g(str.length() * 3);
                int g2 = m22440g(str.length());
                if (g2 == g) {
                    this.f16420e = i + g2;
                    int a = C4468ih.m22088a(str, this.f16417b, this.f16420e, mo14917b());
                    this.f16420e = i;
                    mo14918b((a - i) - g2);
                    this.f16420e = a;
                    return;
                }
                mo14918b(C4468ih.m22087a((CharSequence) str));
                this.f16420e = C4468ih.m22088a(str, this.f16417b, this.f16420e, mo14917b());
            } catch (zzxp e) {
                this.f16420e = i;
                mo14915a(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new zzc((Throwable) e2);
            }
        }

        /* renamed from: a */
        public final void mo14327a(byte[] bArr, int i, int i2) {
            mo14924b(bArr, i, i2);
        }

        /* renamed from: b */
        public final int mo14917b() {
            return this.f16419d - this.f16420e;
        }

        /* renamed from: b */
        public final void mo14918b(int i) {
            if (!zztv.f16415c || mo14917b() < 10) {
                while ((i & -128) != 0) {
                    byte[] bArr = this.f16417b;
                    int i2 = this.f16420e;
                    this.f16420e = i2 + 1;
                    bArr[i2] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f16417b;
                    int i3 = this.f16420e;
                    this.f16420e = i3 + 1;
                    bArr2[i3] = (byte) i;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f16420e), Integer.valueOf(this.f16419d), Integer.valueOf(1)}), e);
                }
            } else {
                while ((i & -128) != 0) {
                    byte[] bArr3 = this.f16417b;
                    int i4 = this.f16420e;
                    this.f16420e = i4 + 1;
                    C4462if.m22007a(bArr3, (long) i4, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
                byte[] bArr4 = this.f16417b;
                int i5 = this.f16420e;
                this.f16420e = i5 + 1;
                C4462if.m22007a(bArr4, (long) i5, (byte) i);
            }
        }

        /* renamed from: b */
        public final void mo14919b(int i, int i2) {
            mo14903a(i, 0);
            mo14900a(i2);
        }

        /* renamed from: b */
        public final void mo14921b(int i, C4419gq gqVar) {
            mo14903a(1, 3);
            mo14926c(2, i);
            mo14905a(3, gqVar);
            mo14903a(1, 4);
        }

        /* renamed from: b */
        public final void mo14922b(int i, zzte zzte) {
            mo14903a(1, 3);
            mo14926c(2, i);
            mo14907a(3, zzte);
            mo14903a(1, 4);
        }

        /* renamed from: b */
        public final void mo14924b(byte[] bArr, int i, int i2) {
            try {
                System.arraycopy(bArr, i, this.f16417b, this.f16420e, i2);
                this.f16420e += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f16420e), Integer.valueOf(this.f16419d), Integer.valueOf(i2)}), e);
            }
        }

        /* renamed from: c */
        public final void mo14926c(int i, int i2) {
            mo14903a(i, 0);
            mo14918b(i2);
        }

        /* renamed from: c */
        public final void mo14927c(int i, long j) {
            mo14903a(i, 1);
            mo14928c(j);
        }

        /* renamed from: c */
        public final void mo14928c(long j) {
            try {
                byte[] bArr = this.f16417b;
                int i = this.f16420e;
                this.f16420e = i + 1;
                bArr[i] = (byte) ((int) j);
                byte[] bArr2 = this.f16417b;
                int i2 = this.f16420e;
                this.f16420e = i2 + 1;
                bArr2[i2] = (byte) ((int) (j >> 8));
                byte[] bArr3 = this.f16417b;
                int i3 = this.f16420e;
                this.f16420e = i3 + 1;
                bArr3[i3] = (byte) ((int) (j >> 16));
                byte[] bArr4 = this.f16417b;
                int i4 = this.f16420e;
                this.f16420e = i4 + 1;
                bArr4[i4] = (byte) ((int) (j >> 24));
                byte[] bArr5 = this.f16417b;
                int i5 = this.f16420e;
                this.f16420e = i5 + 1;
                bArr5[i5] = (byte) ((int) (j >> 32));
                byte[] bArr6 = this.f16417b;
                int i6 = this.f16420e;
                this.f16420e = i6 + 1;
                bArr6[i6] = (byte) ((int) (j >> 40));
                byte[] bArr7 = this.f16417b;
                int i7 = this.f16420e;
                this.f16420e = i7 + 1;
                bArr7[i7] = (byte) ((int) (j >> 48));
                byte[] bArr8 = this.f16417b;
                int i8 = this.f16420e;
                this.f16420e = i8 + 1;
                bArr8[i8] = (byte) ((int) (j >> 56));
            } catch (IndexOutOfBoundsException e) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f16420e), Integer.valueOf(this.f16419d), Integer.valueOf(1)}), e);
            }
        }

        /* renamed from: c */
        public final void mo14929c(byte[] bArr, int i, int i2) {
            mo14918b(i2);
            mo14924b(bArr, 0, i2);
        }

        /* renamed from: d */
        public final int mo14933d() {
            return this.f16420e - this.f16418c;
        }

        /* renamed from: d */
        public final void mo14930d(int i) {
            try {
                byte[] bArr = this.f16417b;
                int i2 = this.f16420e;
                this.f16420e = i2 + 1;
                bArr[i2] = (byte) i;
                byte[] bArr2 = this.f16417b;
                int i3 = this.f16420e;
                this.f16420e = i3 + 1;
                bArr2[i3] = (byte) (i >> 8);
                byte[] bArr3 = this.f16417b;
                int i4 = this.f16420e;
                this.f16420e = i4 + 1;
                bArr3[i4] = (byte) (i >> 16);
                byte[] bArr4 = this.f16417b;
                int i5 = this.f16420e;
                this.f16420e = i5 + 1;
                bArr4[i5] = (byte) (i >>> 24);
            } catch (IndexOutOfBoundsException e) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f16420e), Integer.valueOf(this.f16419d), Integer.valueOf(1)}), e);
            }
        }

        /* renamed from: e */
        public final void mo14932e(int i, int i2) {
            mo14903a(i, 5);
            mo14930d(i2);
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.zztv$b */
    static final class C4509b extends C4508a {

        /* renamed from: b */
        private final ByteBuffer f16421b;

        /* renamed from: c */
        private int f16422c;

        C4509b(ByteBuffer byteBuffer) {
            super(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            this.f16421b = byteBuffer;
            this.f16422c = byteBuffer.position();
        }

        /* renamed from: a */
        public final void mo14896a() {
            this.f16421b.position(this.f16422c + mo14933d());
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.zztv$c */
    static final class C4510c extends zztv {

        /* renamed from: b */
        private final ByteBuffer f16423b;

        /* renamed from: c */
        private final ByteBuffer f16424c;

        /* renamed from: d */
        private final int f16425d;

        C4510c(ByteBuffer byteBuffer) {
            super();
            this.f16423b = byteBuffer;
            this.f16424c = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            this.f16425d = byteBuffer.position();
        }

        /* renamed from: c */
        private final void m22524c(String str) {
            try {
                C4468ih.m22089a((CharSequence) str, this.f16424c);
            } catch (IndexOutOfBoundsException e) {
                throw new zzc((Throwable) e);
            }
        }

        /* renamed from: a */
        public final void mo14896a() {
            this.f16423b.position(this.f16424c.position());
        }

        /* renamed from: a */
        public final void mo14897a(byte b) {
            try {
                this.f16424c.put(b);
            } catch (BufferOverflowException e) {
                throw new zzc((Throwable) e);
            }
        }

        /* renamed from: a */
        public final void mo14900a(int i) {
            if (i >= 0) {
                mo14918b(i);
            } else {
                mo14910a((long) i);
            }
        }

        /* renamed from: a */
        public final void mo14903a(int i, int i2) {
            mo14918b((i << 3) | i2);
        }

        /* renamed from: a */
        public final void mo14904a(int i, long j) {
            mo14903a(i, 0);
            mo14910a(j);
        }

        /* renamed from: a */
        public final void mo14905a(int i, C4419gq gqVar) {
            mo14903a(i, 2);
            mo14911a(gqVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo14906a(int i, C4419gq gqVar, C4437hh hhVar) {
            mo14903a(i, 2);
            mo14912a(gqVar, hhVar);
        }

        /* renamed from: a */
        public final void mo14907a(int i, zzte zzte) {
            mo14903a(i, 2);
            mo14913a(zzte);
        }

        /* renamed from: a */
        public final void mo14908a(int i, String str) {
            mo14903a(i, 2);
            mo14914a(str);
        }

        /* renamed from: a */
        public final void mo14909a(int i, boolean z) {
            mo14903a(i, 0);
            mo14897a(z ? (byte) 1 : 0);
        }

        /* renamed from: a */
        public final void mo14910a(long j) {
            while ((-128 & j) != 0) {
                this.f16424c.put((byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            try {
                this.f16424c.put((byte) ((int) j));
            } catch (BufferOverflowException e) {
                throw new zzc((Throwable) e);
            }
        }

        /* renamed from: a */
        public final void mo14911a(C4419gq gqVar) {
            mo14918b(gqVar.mo14497h());
            gqVar.mo14493a(this);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo14912a(C4419gq gqVar, C4437hh hhVar) {
            C4343ea eaVar = (C4343ea) gqVar;
            int e = eaVar.mo14302e();
            if (e == -1) {
                e = hhVar.mo14575b(eaVar);
                eaVar.mo14300a(e);
            }
            mo14918b(e);
            hhVar.mo14573a(gqVar, (C4474in) this.f16416a);
        }

        /* renamed from: a */
        public final void mo14913a(zzte zzte) {
            mo14918b(zzte.size());
            zzte.zza((C4350eh) this);
        }

        /* renamed from: a */
        public final void mo14914a(String str) {
            int position = this.f16424c.position();
            try {
                int g = m22440g(str.length() * 3);
                int g2 = m22440g(str.length());
                if (g2 == g) {
                    int position2 = this.f16424c.position() + g2;
                    this.f16424c.position(position2);
                    m22524c(str);
                    int position3 = this.f16424c.position();
                    this.f16424c.position(position);
                    mo14918b(position3 - position2);
                    this.f16424c.position(position3);
                    return;
                }
                mo14918b(C4468ih.m22087a((CharSequence) str));
                m22524c(str);
            } catch (zzxp e) {
                this.f16424c.position(position);
                mo14915a(str, e);
            } catch (IllegalArgumentException e2) {
                throw new zzc((Throwable) e2);
            }
        }

        /* renamed from: a */
        public final void mo14327a(byte[] bArr, int i, int i2) {
            mo14924b(bArr, i, i2);
        }

        /* renamed from: b */
        public final int mo14917b() {
            return this.f16424c.remaining();
        }

        /* renamed from: b */
        public final void mo14918b(int i) {
            while ((i & -128) != 0) {
                this.f16424c.put((byte) ((i & 127) | 128));
                i >>>= 7;
            }
            try {
                this.f16424c.put((byte) i);
            } catch (BufferOverflowException e) {
                throw new zzc((Throwable) e);
            }
        }

        /* renamed from: b */
        public final void mo14919b(int i, int i2) {
            mo14903a(i, 0);
            mo14900a(i2);
        }

        /* renamed from: b */
        public final void mo14921b(int i, C4419gq gqVar) {
            mo14903a(1, 3);
            mo14926c(2, i);
            mo14905a(3, gqVar);
            mo14903a(1, 4);
        }

        /* renamed from: b */
        public final void mo14922b(int i, zzte zzte) {
            mo14903a(1, 3);
            mo14926c(2, i);
            mo14907a(3, zzte);
            mo14903a(1, 4);
        }

        /* renamed from: b */
        public final void mo14924b(byte[] bArr, int i, int i2) {
            try {
                this.f16424c.put(bArr, i, i2);
            } catch (IndexOutOfBoundsException e) {
                throw new zzc((Throwable) e);
            } catch (BufferOverflowException e2) {
                throw new zzc((Throwable) e2);
            }
        }

        /* renamed from: c */
        public final void mo14926c(int i, int i2) {
            mo14903a(i, 0);
            mo14918b(i2);
        }

        /* renamed from: c */
        public final void mo14927c(int i, long j) {
            mo14903a(i, 1);
            mo14928c(j);
        }

        /* renamed from: c */
        public final void mo14928c(long j) {
            try {
                this.f16424c.putLong(j);
            } catch (BufferOverflowException e) {
                throw new zzc((Throwable) e);
            }
        }

        /* renamed from: c */
        public final void mo14929c(byte[] bArr, int i, int i2) {
            mo14918b(i2);
            mo14924b(bArr, 0, i2);
        }

        /* renamed from: d */
        public final void mo14930d(int i) {
            try {
                this.f16424c.putInt(i);
            } catch (BufferOverflowException e) {
                throw new zzc((Throwable) e);
            }
        }

        /* renamed from: e */
        public final void mo14932e(int i, int i2) {
            mo14903a(i, 5);
            mo14930d(i2);
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.zztv$d */
    static final class C4511d extends zztv {

        /* renamed from: b */
        private final ByteBuffer f16426b;

        /* renamed from: c */
        private final ByteBuffer f16427c;

        /* renamed from: d */
        private final long f16428d;

        /* renamed from: e */
        private final long f16429e;

        /* renamed from: f */
        private final long f16430f;

        /* renamed from: g */
        private final long f16431g = (this.f16430f - 10);

        /* renamed from: h */
        private long f16432h = this.f16429e;

        C4511d(ByteBuffer byteBuffer) {
            super();
            this.f16426b = byteBuffer;
            this.f16427c = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            this.f16428d = C4462if.m21996a(byteBuffer);
            this.f16429e = this.f16428d + ((long) byteBuffer.position());
            this.f16430f = this.f16428d + ((long) byteBuffer.limit());
        }

        /* renamed from: i */
        private final void m22553i(long j) {
            this.f16427c.position((int) (j - this.f16428d));
        }

        /* renamed from: a */
        public final void mo14896a() {
            this.f16426b.position((int) (this.f16432h - this.f16428d));
        }

        /* renamed from: a */
        public final void mo14897a(byte b) {
            if (this.f16432h < this.f16430f) {
                long j = this.f16432h;
                this.f16432h = 1 + j;
                C4462if.m21999a(j, b);
                return;
            }
            throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(this.f16432h), Long.valueOf(this.f16430f), Integer.valueOf(1)}));
        }

        /* renamed from: a */
        public final void mo14900a(int i) {
            if (i >= 0) {
                mo14918b(i);
            } else {
                mo14910a((long) i);
            }
        }

        /* renamed from: a */
        public final void mo14903a(int i, int i2) {
            mo14918b((i << 3) | i2);
        }

        /* renamed from: a */
        public final void mo14904a(int i, long j) {
            mo14903a(i, 0);
            mo14910a(j);
        }

        /* renamed from: a */
        public final void mo14905a(int i, C4419gq gqVar) {
            mo14903a(i, 2);
            mo14911a(gqVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo14906a(int i, C4419gq gqVar, C4437hh hhVar) {
            mo14903a(i, 2);
            mo14912a(gqVar, hhVar);
        }

        /* renamed from: a */
        public final void mo14907a(int i, zzte zzte) {
            mo14903a(i, 2);
            mo14913a(zzte);
        }

        /* renamed from: a */
        public final void mo14908a(int i, String str) {
            mo14903a(i, 2);
            mo14914a(str);
        }

        /* renamed from: a */
        public final void mo14909a(int i, boolean z) {
            mo14903a(i, 0);
            mo14897a(z ? (byte) 1 : 0);
        }

        /* renamed from: a */
        public final void mo14910a(long j) {
            if (this.f16432h <= this.f16431g) {
                while ((j & -128) != 0) {
                    long j2 = this.f16432h;
                    this.f16432h = j2 + 1;
                    C4462if.m21999a(j2, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
            } else {
                while (this.f16432h < this.f16430f) {
                    if ((j & -128) != 0) {
                        long j3 = this.f16432h;
                        this.f16432h = j3 + 1;
                        C4462if.m21999a(j3, (byte) ((((int) j) & 127) | 128));
                        j >>>= 7;
                    }
                }
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(this.f16432h), Long.valueOf(this.f16430f), Integer.valueOf(1)}));
            }
            long j4 = this.f16432h;
            this.f16432h = 1 + j4;
            C4462if.m21999a(j4, (byte) ((int) j));
        }

        /* renamed from: a */
        public final void mo14911a(C4419gq gqVar) {
            mo14918b(gqVar.mo14497h());
            gqVar.mo14493a(this);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo14912a(C4419gq gqVar, C4437hh hhVar) {
            C4343ea eaVar = (C4343ea) gqVar;
            int e = eaVar.mo14302e();
            if (e == -1) {
                e = hhVar.mo14575b(eaVar);
                eaVar.mo14300a(e);
            }
            mo14918b(e);
            hhVar.mo14573a(gqVar, (C4474in) this.f16416a);
        }

        /* renamed from: a */
        public final void mo14913a(zzte zzte) {
            mo14918b(zzte.size());
            zzte.zza((C4350eh) this);
        }

        /* renamed from: a */
        public final void mo14914a(String str) {
            long j = this.f16432h;
            try {
                int g = m22440g(str.length() * 3);
                int g2 = m22440g(str.length());
                if (g2 == g) {
                    int i = ((int) (this.f16432h - this.f16428d)) + g2;
                    this.f16427c.position(i);
                    C4468ih.m22089a((CharSequence) str, this.f16427c);
                    int position = this.f16427c.position() - i;
                    mo14918b(position);
                    this.f16432h += (long) position;
                    return;
                }
                int a = C4468ih.m22087a((CharSequence) str);
                mo14918b(a);
                m22553i(this.f16432h);
                C4468ih.m22089a((CharSequence) str, this.f16427c);
                this.f16432h += (long) a;
            } catch (zzxp e) {
                this.f16432h = j;
                m22553i(this.f16432h);
                mo14915a(str, e);
            } catch (IllegalArgumentException e2) {
                throw new zzc((Throwable) e2);
            } catch (IndexOutOfBoundsException e3) {
                throw new zzc((Throwable) e3);
            }
        }

        /* renamed from: a */
        public final void mo14327a(byte[] bArr, int i, int i2) {
            mo14924b(bArr, i, i2);
        }

        /* renamed from: b */
        public final int mo14917b() {
            return (int) (this.f16430f - this.f16432h);
        }

        /* renamed from: b */
        public final void mo14918b(int i) {
            if (this.f16432h <= this.f16431g) {
                while ((i & -128) != 0) {
                    long j = this.f16432h;
                    this.f16432h = j + 1;
                    C4462if.m21999a(j, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
            } else {
                while (this.f16432h < this.f16430f) {
                    if ((i & -128) != 0) {
                        long j2 = this.f16432h;
                        this.f16432h = j2 + 1;
                        C4462if.m21999a(j2, (byte) ((i & 127) | 128));
                        i >>>= 7;
                    }
                }
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(this.f16432h), Long.valueOf(this.f16430f), Integer.valueOf(1)}));
            }
            long j3 = this.f16432h;
            this.f16432h = 1 + j3;
            C4462if.m21999a(j3, (byte) i);
        }

        /* renamed from: b */
        public final void mo14919b(int i, int i2) {
            mo14903a(i, 0);
            mo14900a(i2);
        }

        /* renamed from: b */
        public final void mo14921b(int i, C4419gq gqVar) {
            mo14903a(1, 3);
            mo14926c(2, i);
            mo14905a(3, gqVar);
            mo14903a(1, 4);
        }

        /* renamed from: b */
        public final void mo14922b(int i, zzte zzte) {
            mo14903a(1, 3);
            mo14926c(2, i);
            mo14907a(3, zzte);
            mo14903a(1, 4);
        }

        /* renamed from: b */
        public final void mo14924b(byte[] bArr, int i, int i2) {
            if (bArr != null && i >= 0 && i2 >= 0 && bArr.length - i2 >= i) {
                long j = (long) i2;
                if (this.f16430f - j >= this.f16432h) {
                    C4462if.m22008a(bArr, (long) i, this.f16432h, j);
                    this.f16432h += j;
                    return;
                }
            }
            if (bArr == null) {
                throw new NullPointerException("value");
            }
            throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(this.f16432h), Long.valueOf(this.f16430f), Integer.valueOf(i2)}));
        }

        /* renamed from: c */
        public final void mo14926c(int i, int i2) {
            mo14903a(i, 0);
            mo14918b(i2);
        }

        /* renamed from: c */
        public final void mo14927c(int i, long j) {
            mo14903a(i, 1);
            mo14928c(j);
        }

        /* renamed from: c */
        public final void mo14928c(long j) {
            this.f16427c.putLong((int) (this.f16432h - this.f16428d), j);
            this.f16432h += 8;
        }

        /* renamed from: c */
        public final void mo14929c(byte[] bArr, int i, int i2) {
            mo14918b(i2);
            mo14924b(bArr, 0, i2);
        }

        /* renamed from: d */
        public final void mo14930d(int i) {
            this.f16427c.putInt((int) (this.f16432h - this.f16428d), i);
            this.f16432h += 4;
        }

        /* renamed from: e */
        public final void mo14932e(int i, int i2) {
            mo14903a(i, 5);
            mo14930d(i2);
        }
    }

    public static class zzc extends IOException {
        zzc() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        zzc(String str) {
            String valueOf = String.valueOf("CodedOutputStream was writing to a flat byte array and ran out of space.: ");
            String valueOf2 = String.valueOf(str);
            super(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
        }

        zzc(String str, Throwable th) {
            String valueOf = String.valueOf("CodedOutputStream was writing to a flat byte array and ran out of space.: ");
            String valueOf2 = String.valueOf(str);
            super(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), th);
        }

        zzc(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }
    }

    private zztv() {
    }

    /* renamed from: a */
    public static int m22406a(int i, C4400fy fyVar) {
        int e = m22433e(i);
        int b = fyVar.mo14527b();
        return e + m22440g(b) + b;
    }

    /* renamed from: a */
    public static int m22407a(C4400fy fyVar) {
        int b = fyVar.mo14527b();
        return m22440g(b) + b;
    }

    /* renamed from: a */
    public static zztv m22408a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return new C4509b(byteBuffer);
        }
        if (byteBuffer.isDirect() && !byteBuffer.isReadOnly()) {
            return C4462if.m22014b() ? new C4511d(byteBuffer) : new C4510c(byteBuffer);
        }
        throw new IllegalArgumentException("ByteBuffer is read-only");
    }

    /* renamed from: a */
    public static zztv m22409a(byte[] bArr) {
        return new C4508a(bArr, 0, bArr.length);
    }

    /* renamed from: b */
    public static int m22410b(double d) {
        return 8;
    }

    /* renamed from: b */
    public static int m22411b(float f) {
        return 4;
    }

    /* renamed from: b */
    public static int m22412b(int i, double d) {
        return m22433e(i) + 8;
    }

    /* renamed from: b */
    public static int m22413b(int i, float f) {
        return m22433e(i) + 4;
    }

    /* renamed from: b */
    public static int m22414b(int i, C4400fy fyVar) {
        return (m22433e(1) << 1) + m22441g(2, i) + m22406a(3, fyVar);
    }

    /* renamed from: b */
    static int m22415b(int i, C4419gq gqVar, C4437hh hhVar) {
        return m22433e(i) + m22419b(gqVar, hhVar);
    }

    /* renamed from: b */
    public static int m22416b(int i, String str) {
        return m22433e(i) + m22421b(str);
    }

    /* renamed from: b */
    public static int m22417b(int i, boolean z) {
        return m22433e(i) + 1;
    }

    /* renamed from: b */
    public static int m22418b(C4419gq gqVar) {
        int h = gqVar.mo14497h();
        return m22440g(h) + h;
    }

    /* renamed from: b */
    static int m22419b(C4419gq gqVar, C4437hh hhVar) {
        C4343ea eaVar = (C4343ea) gqVar;
        int e = eaVar.mo14302e();
        if (e == -1) {
            e = hhVar.mo14575b(eaVar);
            eaVar.mo14300a(e);
        }
        return m22440g(e) + e;
    }

    /* renamed from: b */
    public static int m22420b(zzte zzte) {
        int size = zzte.size();
        return m22440g(size) + size;
    }

    /* renamed from: b */
    public static int m22421b(String str) {
        int i;
        try {
            i = C4468ih.m22087a((CharSequence) str);
        } catch (zzxp unused) {
            i = str.getBytes(C4390fo.f16136a).length;
        }
        return m22440g(i) + i;
    }

    /* renamed from: b */
    public static int m22422b(boolean z) {
        return 1;
    }

    /* renamed from: b */
    public static int m22423b(byte[] bArr) {
        int length = bArr.length;
        return m22440g(length) + length;
    }

    /* renamed from: c */
    public static int m22424c(int i, C4419gq gqVar) {
        return m22433e(i) + m22418b(gqVar);
    }

    @Deprecated
    /* renamed from: c */
    static int m22425c(int i, C4419gq gqVar, C4437hh hhVar) {
        int e = m22433e(i) << 1;
        C4343ea eaVar = (C4343ea) gqVar;
        int e2 = eaVar.mo14302e();
        if (e2 == -1) {
            e2 = hhVar.mo14575b(eaVar);
            eaVar.mo14300a(e2);
        }
        return e + e2;
    }

    /* renamed from: c */
    public static int m22426c(int i, zzte zzte) {
        int e = m22433e(i);
        int size = zzte.size();
        return e + m22440g(size) + size;
    }

    @Deprecated
    /* renamed from: c */
    public static int m22427c(C4419gq gqVar) {
        return gqVar.mo14497h();
    }

    /* renamed from: d */
    public static int m22429d(int i, long j) {
        return m22433e(i) + m22435e(j);
    }

    /* renamed from: d */
    public static int m22430d(int i, C4419gq gqVar) {
        return (m22433e(1) << 1) + m22441g(2, i) + m22424c(3, gqVar);
    }

    /* renamed from: d */
    public static int m22431d(int i, zzte zzte) {
        return (m22433e(1) << 1) + m22441g(2, i) + m22426c(3, zzte);
    }

    /* renamed from: d */
    public static int m22432d(long j) {
        return m22435e(j);
    }

    /* renamed from: e */
    public static int m22433e(int i) {
        return m22440g(i << 3);
    }

    /* renamed from: e */
    public static int m22434e(int i, long j) {
        return m22433e(i) + m22435e(j);
    }

    /* renamed from: e */
    public static int m22435e(long j) {
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
    public static int m22436f(int i) {
        if (i >= 0) {
            return m22440g(i);
        }
        return 10;
    }

    /* renamed from: f */
    public static int m22437f(int i, int i2) {
        return m22433e(i) + m22436f(i2);
    }

    /* renamed from: f */
    public static int m22438f(int i, long j) {
        return m22433e(i) + m22435e(m22450i(j));
    }

    /* renamed from: f */
    public static int m22439f(long j) {
        return m22435e(m22450i(j));
    }

    /* renamed from: g */
    public static int m22440g(int i) {
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
    public static int m22441g(int i, int i2) {
        return m22433e(i) + m22440g(i2);
    }

    /* renamed from: g */
    public static int m22442g(int i, long j) {
        return m22433e(i) + 8;
    }

    /* renamed from: g */
    public static int m22443g(long j) {
        return 8;
    }

    /* renamed from: h */
    public static int m22444h(int i) {
        return m22440g(m22456m(i));
    }

    /* renamed from: h */
    public static int m22445h(int i, int i2) {
        return m22433e(i) + m22440g(m22456m(i2));
    }

    /* renamed from: h */
    public static int m22446h(int i, long j) {
        return m22433e(i) + 8;
    }

    /* renamed from: h */
    public static int m22447h(long j) {
        return 8;
    }

    /* renamed from: i */
    public static int m22448i(int i) {
        return 4;
    }

    /* renamed from: i */
    public static int m22449i(int i, int i2) {
        return m22433e(i) + 4;
    }

    /* renamed from: i */
    private static long m22450i(long j) {
        return (j >> 63) ^ (j << 1);
    }

    /* renamed from: j */
    public static int m22451j(int i) {
        return 4;
    }

    /* renamed from: j */
    public static int m22452j(int i, int i2) {
        return m22433e(i) + 4;
    }

    /* renamed from: k */
    public static int m22453k(int i) {
        return m22436f(i);
    }

    /* renamed from: k */
    public static int m22454k(int i, int i2) {
        return m22433e(i) + m22436f(i2);
    }

    @Deprecated
    /* renamed from: l */
    public static int m22455l(int i) {
        return m22440g(i);
    }

    /* renamed from: m */
    private static int m22456m(int i) {
        return (i >> 31) ^ (i << 1);
    }

    /* renamed from: a */
    public abstract void mo14896a();

    /* renamed from: a */
    public abstract void mo14897a(byte b);

    /* renamed from: a */
    public final void mo14898a(double d) {
        mo14928c(Double.doubleToRawLongBits(d));
    }

    /* renamed from: a */
    public final void mo14899a(float f) {
        mo14930d(Float.floatToRawIntBits(f));
    }

    /* renamed from: a */
    public abstract void mo14900a(int i);

    /* renamed from: a */
    public final void mo14901a(int i, double d) {
        mo14927c(i, Double.doubleToRawLongBits(d));
    }

    /* renamed from: a */
    public final void mo14902a(int i, float f) {
        mo14932e(i, Float.floatToRawIntBits(f));
    }

    /* renamed from: a */
    public abstract void mo14903a(int i, int i2);

    /* renamed from: a */
    public abstract void mo14904a(int i, long j);

    /* renamed from: a */
    public abstract void mo14905a(int i, C4419gq gqVar);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo14906a(int i, C4419gq gqVar, C4437hh hhVar);

    /* renamed from: a */
    public abstract void mo14907a(int i, zzte zzte);

    /* renamed from: a */
    public abstract void mo14908a(int i, String str);

    /* renamed from: a */
    public abstract void mo14909a(int i, boolean z);

    /* renamed from: a */
    public abstract void mo14910a(long j);

    /* renamed from: a */
    public abstract void mo14911a(C4419gq gqVar);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo14912a(C4419gq gqVar, C4437hh hhVar);

    /* renamed from: a */
    public abstract void mo14913a(zzte zzte);

    /* renamed from: a */
    public abstract void mo14914a(String str);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo14915a(String str, zzxp zzxp) {
        f16414b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", zzxp);
        byte[] bytes = str.getBytes(C4390fo.f16136a);
        try {
            mo14918b(bytes.length);
            mo14327a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new zzc((Throwable) e);
        } catch (zzc e2) {
            throw e2;
        }
    }

    /* renamed from: a */
    public final void mo14916a(boolean z) {
        mo14897a(z ? (byte) 1 : 0);
    }

    /* renamed from: b */
    public abstract int mo14917b();

    /* renamed from: b */
    public abstract void mo14918b(int i);

    /* renamed from: b */
    public abstract void mo14919b(int i, int i2);

    /* renamed from: b */
    public final void mo14920b(int i, long j) {
        mo14904a(i, m22450i(j));
    }

    /* renamed from: b */
    public abstract void mo14921b(int i, C4419gq gqVar);

    /* renamed from: b */
    public abstract void mo14922b(int i, zzte zzte);

    /* renamed from: b */
    public final void mo14923b(long j) {
        mo14910a(m22450i(j));
    }

    /* renamed from: b */
    public abstract void mo14924b(byte[] bArr, int i, int i2);

    /* renamed from: c */
    public final void mo14925c(int i) {
        mo14918b(m22456m(i));
    }

    /* renamed from: c */
    public abstract void mo14926c(int i, int i2);

    /* renamed from: c */
    public abstract void mo14927c(int i, long j);

    /* renamed from: c */
    public abstract void mo14928c(long j);

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public abstract void mo14929c(byte[] bArr, int i, int i2);

    /* renamed from: d */
    public abstract void mo14930d(int i);

    /* renamed from: d */
    public final void mo14931d(int i, int i2) {
        mo14926c(i, m22456m(i2));
    }

    /* renamed from: e */
    public abstract void mo14932e(int i, int i2);
}
