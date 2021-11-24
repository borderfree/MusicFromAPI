package com.android.vending.billing.util;

import android.text.TextUtils;
import android.util.Log;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;

/* renamed from: com.android.vending.billing.util.f */
public class C1164f {
    /* renamed from: a */
    public static PublicKey m6298a(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(C1148a.m6248a(str)));
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        } catch (InvalidKeySpecException e2) {
            Log.e("IABUtil/Security", "Invalid key specification.");
            throw new IllegalArgumentException(e2);
        } catch (Base64DecoderException e3) {
            Log.e("IABUtil/Security", "Base64 decoding failed.");
            throw new IllegalArgumentException(e3);
        }
    }

    /* renamed from: a */
    public static boolean m6299a(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str3)) {
            return m6300a(m6298a(str), str2, str3);
        }
        Log.e("IABUtil/Security", "Purchase verification failed: missing data.");
        return false;
    }

    /* renamed from: a */
    public static boolean m6300a(PublicKey publicKey, String str, String str2) {
        String str3;
        String str4;
        try {
            Signature instance = Signature.getInstance("SHA1withRSA");
            instance.initVerify(publicKey);
            instance.update(str.getBytes());
            if (instance.verify(C1148a.m6248a(str2))) {
                return true;
            }
            Log.e("IABUtil/Security", "Signature verification failed.");
            return false;
        } catch (NoSuchAlgorithmException unused) {
            str4 = "IABUtil/Security";
            str3 = "NoSuchAlgorithmException.";
            Log.e(str4, str3);
            return false;
        } catch (InvalidKeyException unused2) {
            str4 = "IABUtil/Security";
            str3 = "Invalid key specification.";
            Log.e(str4, str3);
            return false;
        } catch (SignatureException unused3) {
            str4 = "IABUtil/Security";
            str3 = "Signature exception.";
            Log.e(str4, str3);
            return false;
        } catch (Base64DecoderException unused4) {
            str4 = "IABUtil/Security";
            str3 = "Base64 decoding failed.";
            Log.e(str4, str3);
            return false;
        }
    }
}
