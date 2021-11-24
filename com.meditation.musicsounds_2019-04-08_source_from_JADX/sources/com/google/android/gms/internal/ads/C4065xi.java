package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.ads.xi */
public final class C4065xi implements C3914sz {

    /* renamed from: a */
    private final SecretKey f15032a;

    public C4065xi(byte[] bArr) {
        this.f15032a = new SecretKeySpec(bArr, "AES");
    }

    /* renamed from: a */
    public final byte[] mo13681a(byte[] bArr, byte[] bArr2) {
        if (bArr.length <= 2147483619) {
            byte[] bArr3 = new byte[(bArr.length + 12 + 16)];
            byte[] a = C4093yj.m20365a(12);
            System.arraycopy(a, 0, bArr3, 0, 12);
            Cipher cipher = (Cipher) C4078xv.f15056a.mo13822a("AES/GCM/NoPadding");
            cipher.init(1, this.f15032a, new GCMParameterSpec(128, a));
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            cipher.updateAAD(bArr2);
            cipher.doFinal(bArr, 0, bArr.length, bArr3, 12);
            return bArr3;
        }
        throw new GeneralSecurityException("plaintext too long");
    }
}
