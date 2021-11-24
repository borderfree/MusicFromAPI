package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.ads.xg */
public final class C4063xg implements C4090yg {

    /* renamed from: a */
    private final SecretKeySpec f15025a;

    /* renamed from: b */
    private final int f15026b;

    /* renamed from: c */
    private final int f15027c = ((Cipher) C4078xv.f15056a.mo13822a("AES/CTR/NoPadding")).getBlockSize();

    public C4063xg(byte[] bArr, int i) {
        this.f15025a = new SecretKeySpec(bArr, "AES");
        if (i < 12 || i > this.f15027c) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.f15026b = i;
    }

    /* renamed from: a */
    public final byte[] mo13815a(byte[] bArr) {
        if (bArr.length <= Integer.MAX_VALUE - this.f15026b) {
            byte[] bArr2 = new byte[(this.f15026b + bArr.length)];
            byte[] a = C4093yj.m20365a(this.f15026b);
            System.arraycopy(a, 0, bArr2, 0, this.f15026b);
            int length = bArr.length;
            int i = this.f15026b;
            Cipher cipher = (Cipher) C4078xv.f15056a.mo13822a("AES/CTR/NoPadding");
            byte[] bArr3 = new byte[this.f15027c];
            System.arraycopy(a, 0, bArr3, 0, this.f15026b);
            cipher.init(1, this.f15025a, new IvParameterSpec(bArr3));
            if (cipher.doFinal(bArr, 0, length, bArr2, i) == length) {
                return bArr2;
            }
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
        int i2 = Integer.MAX_VALUE - this.f15026b;
        StringBuilder sb = new StringBuilder(43);
        sb.append("plaintext length can not exceed ");
        sb.append(i2);
        throw new GeneralSecurityException(sb.toString());
    }
}
