package com.pollfish.p146b;

import com.pollfish.p150f.p152b.C5163a;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;

/* renamed from: com.pollfish.b.a */
public class C5111a {

    /* renamed from: a */
    private Cipher f18260a;

    /* renamed from: b */
    private Cipher f18261b;

    /* renamed from: c */
    private byte[] f18262c = {-87, -101, -56, 50, 86, 53, -29, 3};

    public C5111a() {
        SecretKey generateSecret = SecretKeyFactory.getInstance("PBEWithMD5AndDES").generateSecret(new PBEKeySpec("skasdh*h3jkas^7938UbnJGshas72123".toCharArray(), this.f18262c, 2));
        this.f18260a = Cipher.getInstance(generateSecret.getAlgorithm());
        this.f18261b = Cipher.getInstance(generateSecret.getAlgorithm());
        PBEParameterSpec pBEParameterSpec = new PBEParameterSpec(this.f18262c, 2);
        this.f18260a.init(1, generateSecret, pBEParameterSpec);
        this.f18261b.init(2, generateSecret, pBEParameterSpec);
    }

    /* renamed from: a */
    public String mo16667a(String str) {
        return new String(this.f18261b.doFinal(C5163a.m25521a(str, 0)));
    }
}
