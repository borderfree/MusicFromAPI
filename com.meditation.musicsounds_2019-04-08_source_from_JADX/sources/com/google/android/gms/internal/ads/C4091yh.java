package com.google.android.gms.internal.ads;

import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;

/* renamed from: com.google.android.gms.internal.ads.yh */
public final class C4091yh implements C3927tl {

    /* renamed from: a */
    private Mac f15069a;

    /* renamed from: b */
    private final int f15070b;

    /* renamed from: c */
    private final String f15071c;

    /* renamed from: d */
    private final Key f15072d;

    public C4091yh(String str, Key key, int i) {
        if (i >= 10) {
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -1823053428) {
                if (hashCode != 392315118) {
                    if (hashCode == 392317873 && str.equals("HMACSHA512")) {
                        c = 2;
                    }
                } else if (str.equals("HMACSHA256")) {
                    c = 1;
                }
            } else if (str.equals("HMACSHA1")) {
                c = 0;
            }
            switch (c) {
                case 0:
                    if (i > 20) {
                        throw new InvalidAlgorithmParameterException("tag size too big");
                    }
                    break;
                case 1:
                    if (i > 32) {
                        throw new InvalidAlgorithmParameterException("tag size too big");
                    }
                    break;
                case 2:
                    if (i > 64) {
                        throw new InvalidAlgorithmParameterException("tag size too big");
                    }
                    break;
                default:
                    String str2 = "unknown Hmac algorithm: ";
                    String valueOf = String.valueOf(str);
                    throw new NoSuchAlgorithmException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            }
            this.f15071c = str;
            this.f15070b = i;
            this.f15072d = key;
            this.f15069a = (Mac) C4078xv.f15057b.mo13822a(str);
            this.f15069a.init(key);
            return;
        }
        throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
    }

    /* renamed from: a */
    public final byte[] mo13699a(byte[] bArr) {
        Mac mac;
        try {
            mac = (Mac) this.f15069a.clone();
        } catch (CloneNotSupportedException unused) {
            mac = (Mac) C4078xv.f15057b.mo13822a(this.f15071c);
            mac.init(this.f15072d);
        }
        mac.update(bArr);
        byte[] bArr2 = new byte[this.f15070b];
        System.arraycopy(mac.doFinal(), 0, bArr2, 0, this.f15070b);
        return bArr2;
    }
}
