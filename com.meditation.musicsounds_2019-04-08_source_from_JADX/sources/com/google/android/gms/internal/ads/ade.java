package com.google.android.gms.internal.ads;

final class ade {

    /* renamed from: a */
    private static final adf f11536a = (adc.m15813a() && adc.m15819b() ? new adh() : new adg());

    /* renamed from: a */
    static int m15883a(CharSequence charSequence) {
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
                                throw new zzbep(i2, length2);
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
    static int m15884a(CharSequence charSequence, byte[] bArr, int i, int i2) {
        return f11536a.mo11739a(charSequence, bArr, i, i2);
    }

    /* renamed from: a */
    public static boolean m15885a(byte[] bArr) {
        return f11536a.mo11740a(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public static boolean m15886a(byte[] bArr, int i, int i2) {
        return f11536a.mo11740a(bArr, i, i2);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static int m15887b(int i) {
        if (i > -12) {
            return -1;
        }
        return i;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static int m15888b(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static int m15889b(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static int m15891c(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        switch (i2 - i) {
            case 0:
                return m15887b(b);
            case 1:
                return m15888b(b, bArr[i]);
            case 2:
                return m15889b((int) b, (int) bArr[i], (int) bArr[i + 1]);
            default:
                throw new AssertionError();
        }
    }
}
