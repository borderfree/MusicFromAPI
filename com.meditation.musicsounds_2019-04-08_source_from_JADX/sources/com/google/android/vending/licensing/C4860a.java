package com.google.android.vending.licensing;

import com.google.android.vending.licensing.util.Base64DecoderException;
import com.google.android.vending.licensing.util.C4878a;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.vending.licensing.a */
public class C4860a implements C4873i {

    /* renamed from: a */
    private static final byte[] f17514a = {16, 74, 71, -80, 32, 101, -47, 72, 117, -14, 0, -29, 70, 65, -12, 74};

    /* renamed from: b */
    private Cipher f17515b;

    /* renamed from: c */
    private Cipher f17516c;

    public C4860a(byte[] bArr, String str, String str2) {
        try {
            SecretKeyFactory instance = SecretKeyFactory.getInstance("PBEWITHSHAAND256BITAES-CBC-BC");
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(str2);
            SecretKeySpec secretKeySpec = new SecretKeySpec(instance.generateSecret(new PBEKeySpec(sb.toString().toCharArray(), bArr, 1024, 256)).getEncoded(), "AES");
            this.f17515b = Cipher.getInstance("AES/CBC/PKCS5Padding");
            this.f17515b.init(1, secretKeySpec, new IvParameterSpec(f17514a));
            this.f17516c = Cipher.getInstance("AES/CBC/PKCS5Padding");
            this.f17516c.init(2, secretKeySpec, new IvParameterSpec(f17514a));
        } catch (GeneralSecurityException e) {
            throw new RuntimeException("Invalid environment", e);
        }
    }

    /* renamed from: a */
    public String mo16050a(String str, String str2) {
        if (str == null) {
            return null;
        }
        try {
            Cipher cipher = this.f17515b;
            StringBuilder sb = new StringBuilder();
            sb.append("com.android.vending.licensing.AESObfuscator-1|");
            sb.append(str2);
            sb.append(str);
            return C4878a.m24381a(cipher.doFinal(sb.toString().getBytes("UTF-8")));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("Invalid environment", e);
        } catch (GeneralSecurityException e2) {
            throw new RuntimeException("Invalid environment", e2);
        }
    }

    /* renamed from: b */
    public String mo16051b(String str, String str2) {
        if (str == null) {
            return null;
        }
        try {
            String str3 = new String(this.f17516c.doFinal(C4878a.m24383a(str)), "UTF-8");
            StringBuilder sb = new StringBuilder();
            sb.append("com.android.vending.licensing.AESObfuscator-1|");
            sb.append(str2);
            if (str3.indexOf(sb.toString()) == 0) {
                return str3.substring("com.android.vending.licensing.AESObfuscator-1|".length() + str2.length(), str3.length());
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Header not found (invalid data or key):");
            sb2.append(str);
            throw new ValidationException(sb2.toString());
        } catch (Base64DecoderException e) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(e.getMessage());
            sb3.append(":");
            sb3.append(str);
            throw new ValidationException(sb3.toString());
        } catch (IllegalBlockSizeException e2) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(e2.getMessage());
            sb4.append(":");
            sb4.append(str);
            throw new ValidationException(sb4.toString());
        } catch (BadPaddingException e3) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(e3.getMessage());
            sb5.append(":");
            sb5.append(str);
            throw new ValidationException(sb5.toString());
        } catch (UnsupportedEncodingException e4) {
            throw new RuntimeException("Invalid environment", e4);
        }
    }
}
