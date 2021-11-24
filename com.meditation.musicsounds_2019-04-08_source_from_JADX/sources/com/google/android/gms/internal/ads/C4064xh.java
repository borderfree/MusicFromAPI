package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.ads.xh */
public final class C4064xh implements C3914sz {

    /* renamed from: a */
    private final byte[] f15028a;

    /* renamed from: b */
    private final byte[] f15029b;

    /* renamed from: c */
    private final SecretKeySpec f15030c;

    /* renamed from: d */
    private final int f15031d;

    public C4064xh(byte[] bArr, int i) {
        if (i == 12 || i == 16) {
            this.f15031d = i;
            this.f15030c = new SecretKeySpec(bArr, "AES");
            Cipher instance = Cipher.getInstance("AES/ECB/NOPADDING");
            instance.init(1, this.f15030c);
            this.f15028a = m20316a(instance.doFinal(new byte[16]));
            this.f15029b = m20316a(this.f15028a);
            return;
        }
        throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
    }

    /* renamed from: a */
    private final byte[] m20315a(Cipher cipher, int i, byte[] bArr, int i2, int i3) {
        byte[] bArr2;
        byte[] b;
        byte[] bArr3 = new byte[16];
        bArr3[15] = (byte) i;
        if (i3 == 0) {
            b = m20317b(bArr3, this.f15028a);
        } else {
            byte[] doFinal = cipher.doFinal(bArr3);
            byte[] bArr4 = doFinal;
            int i4 = 0;
            while (i3 - i4 > 16) {
                for (int i5 = 0; i5 < 16; i5++) {
                    bArr4[i5] = (byte) (bArr4[i5] ^ bArr[(i2 + i4) + i5]);
                }
                bArr4 = cipher.doFinal(bArr4);
                i4 += 16;
            }
            byte[] copyOfRange = Arrays.copyOfRange(bArr, i4 + i2, i2 + i3);
            if (copyOfRange.length == 16) {
                bArr2 = m20317b(copyOfRange, this.f15028a);
            } else {
                byte[] copyOf = Arrays.copyOf(this.f15029b, 16);
                for (int i6 = 0; i6 < copyOfRange.length; i6++) {
                    copyOf[i6] = (byte) (copyOf[i6] ^ copyOfRange[i6]);
                }
                copyOf[copyOfRange.length] = (byte) (copyOf[copyOfRange.length] ^ 128);
                bArr2 = copyOf;
            }
            b = m20317b(bArr4, bArr2);
        }
        return cipher.doFinal(b);
    }

    /* renamed from: a */
    private static byte[] m20316a(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i = 0;
        int i2 = 0;
        while (i2 < 15) {
            int i3 = i2 + 1;
            bArr2[i2] = (byte) ((bArr[i2] << 1) ^ ((bArr[i3] & 255) >>> 7));
            i2 = i3;
        }
        int i4 = bArr[15] << 1;
        if ((bArr[0] & 128) != 0) {
            i = 135;
        }
        bArr2[15] = (byte) (i4 ^ i);
        return bArr2;
    }

    /* renamed from: b */
    private static byte[] m20317b(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr3[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
        return bArr3;
    }

    /* renamed from: a */
    public final byte[] mo13681a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = bArr;
        if (bArr3.length <= (Integer.MAX_VALUE - this.f15031d) - 16) {
            byte[] bArr4 = new byte[(this.f15031d + bArr3.length + 16)];
            byte[] a = C4093yj.m20365a(this.f15031d);
            System.arraycopy(a, 0, bArr4, 0, this.f15031d);
            Cipher instance = Cipher.getInstance("AES/ECB/NOPADDING");
            instance.init(1, this.f15030c);
            byte[] a2 = m20315a(instance, 0, a, 0, a.length);
            byte[] bArr5 = bArr2 == null ? new byte[0] : bArr2;
            byte[] a3 = m20315a(instance, 1, bArr5, 0, bArr5.length);
            Cipher instance2 = Cipher.getInstance("AES/CTR/NOPADDING");
            instance2.init(1, this.f15030c, new IvParameterSpec(a2));
            instance2.doFinal(bArr, 0, bArr3.length, bArr4, this.f15031d);
            byte[] a4 = m20315a(instance, 2, bArr4, this.f15031d, bArr3.length);
            int length = bArr3.length + this.f15031d;
            for (int i = 0; i < 16; i++) {
                bArr4[length + i] = (byte) ((a3[i] ^ a2[i]) ^ a4[i]);
            }
            return bArr4;
        }
        throw new GeneralSecurityException("plaintext too long");
    }
}
