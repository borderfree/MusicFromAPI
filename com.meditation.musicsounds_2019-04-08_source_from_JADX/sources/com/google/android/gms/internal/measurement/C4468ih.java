package com.google.android.gms.internal.measurement;

import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.measurement.ih */
final class C4468ih {

    /* renamed from: a */
    private static final C4470ij f16283a = ((!(C4462if.m22009a() && C4462if.m22014b()) || C4348ef.m21320a()) ? new C4471ik() : new C4472il());

    /* renamed from: a */
    static int m22087a(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char charAt2 = charSequence.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) >= 65536) {
                                i2++;
                            } else {
                                throw new zzxp(i2, length2);
                            }
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        long j = ((long) i3) + 4294967296L;
        StringBuilder sb = new StringBuilder(54);
        sb.append("UTF-8 length does not fit in int: ");
        sb.append(j);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    static int m22088a(CharSequence charSequence, byte[] bArr, int i, int i2) {
        return f16283a.mo14703a(charSequence, bArr, i, i2);
    }

    /* renamed from: a */
    static void m22089a(CharSequence charSequence, ByteBuffer byteBuffer) {
        C4470ij ijVar = f16283a;
        if (byteBuffer.hasArray()) {
            int arrayOffset = byteBuffer.arrayOffset();
            byteBuffer.position(m22088a(charSequence, byteBuffer.array(), byteBuffer.position() + arrayOffset, byteBuffer.remaining()) - arrayOffset);
        } else if (byteBuffer.isDirect()) {
            ijVar.mo14704a(charSequence, byteBuffer);
        } else {
            C4470ij.m22113b(charSequence, byteBuffer);
        }
    }

    /* renamed from: a */
    public static boolean m22090a(byte[] bArr) {
        return f16283a.mo14705a(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public static boolean m22091a(byte[] bArr, int i, int i2) {
        return f16283a.mo14705a(bArr, i, i2);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static int m22092b(int i) {
        if (i > -12) {
            return -1;
        }
        return i;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static int m22093b(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static int m22094b(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    /* renamed from: b */
    static String m22095b(byte[] bArr, int i, int i2) {
        return f16283a.mo14706b(bArr, i, i2);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static int m22097d(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        switch (i2 - i) {
            case 0:
                return m22092b(b);
            case 1:
                return m22093b(b, bArr[i]);
            case 2:
                return m22094b((int) b, (int) bArr[i], (int) bArr[i + 1]);
            default:
                throw new AssertionError();
        }
    }
}
