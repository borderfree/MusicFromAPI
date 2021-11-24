package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.ads.xq */
public final class C4073xq {

    /* renamed from: a */
    private ECPublicKey f15048a;

    public C4073xq(ECPublicKey eCPublicKey) {
        this.f15048a = eCPublicKey;
    }

    /* renamed from: a */
    public final C4074xr mo13819a(String str, byte[] bArr, byte[] bArr2, int i, zzayw zzayw) {
        byte[] bArr3;
        KeyPair a = C4075xs.m20334a(this.f15048a.getParams());
        ECPublicKey eCPublicKey = (ECPublicKey) a.getPublic();
        ECPrivateKey eCPrivateKey = (ECPrivateKey) a.getPrivate();
        ECPublicKey eCPublicKey2 = this.f15048a;
        ECParameterSpec params = eCPublicKey2.getParams();
        ECParameterSpec params2 = eCPrivateKey.getParams();
        if (!params.getCurve().equals(params2.getCurve()) || !params.getGenerator().equals(params2.getGenerator()) || !params.getOrder().equals(params2.getOrder()) || params.getCofactor() != params2.getCofactor()) {
            throw new GeneralSecurityException("invalid public key spec");
        }
        byte[] a2 = C4075xs.m20339a(eCPrivateKey, eCPublicKey2.getW());
        EllipticCurve curve = eCPublicKey.getParams().getCurve();
        ECPoint w = eCPublicKey.getW();
        C4075xs.m20338a(w, curve);
        int a3 = C4075xs.m20333a(curve);
        int i2 = 1;
        switch (C4076xt.f15051a[zzayw.ordinal()]) {
            case 1:
                int i3 = (a3 * 2) + 1;
                byte[] bArr4 = new byte[i3];
                byte[] byteArray = w.getAffineX().toByteArray();
                byte[] byteArray2 = w.getAffineY().toByteArray();
                System.arraycopy(byteArray2, 0, bArr4, i3 - byteArray2.length, byteArray2.length);
                System.arraycopy(byteArray, 0, bArr4, (a3 + 1) - byteArray.length, byteArray.length);
                bArr4[0] = 4;
                bArr3 = bArr4;
                break;
            case 2:
                int i4 = a3 + 1;
                bArr3 = new byte[i4];
                byte[] byteArray3 = w.getAffineX().toByteArray();
                System.arraycopy(byteArray3, 0, bArr3, i4 - byteArray3.length, byteArray3.length);
                bArr3[0] = (byte) (w.getAffineY().testBit(0) ? 3 : 2);
                break;
            default:
                String valueOf = String.valueOf(zzayw);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 15);
                sb.append("invalid format:");
                sb.append(valueOf);
                throw new GeneralSecurityException(sb.toString());
        }
        byte[] a4 = C4066xj.m20321a(bArr3, a2);
        Mac mac = (Mac) C4078xv.f15057b.mo13822a(str);
        if (i <= mac.getMacLength() * 255) {
            if (bArr == null || bArr.length == 0) {
                mac.init(new SecretKeySpec(new byte[mac.getMacLength()], str));
            } else {
                mac.init(new SecretKeySpec(bArr, str));
            }
            byte[] doFinal = mac.doFinal(a4);
            byte[] bArr5 = new byte[i];
            mac.init(new SecretKeySpec(doFinal, str));
            byte[] bArr6 = new byte[0];
            int i5 = 0;
            while (true) {
                mac.update(bArr6);
                mac.update(bArr2);
                mac.update((byte) i2);
                bArr6 = mac.doFinal();
                if (bArr6.length + i5 < i) {
                    System.arraycopy(bArr6, 0, bArr5, i5, bArr6.length);
                    i5 += bArr6.length;
                    i2++;
                } else {
                    System.arraycopy(bArr6, 0, bArr5, i5, i - i5);
                    return new C4074xr(bArr3, bArr5);
                }
            }
        } else {
            throw new GeneralSecurityException("size too large");
        }
    }
}
