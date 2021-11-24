package com.seattleclouds.modules.order.indiapay.p180c;

import android.util.Log;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.seattleclouds.modules.order.indiapay.c.a */
public class C5998a {

    /* renamed from: a */
    public static final String f21255a = "a";

    /* renamed from: b */
    private static boolean f21256b = false;

    /* renamed from: c */
    private static String f21257c = "AES/CBC/PKCS5Padding";

    /* renamed from: d */
    private static String f21258d = "AES";

    /* renamed from: e */
    private static String f21259e = "SHA-256";

    /* renamed from: f */
    private Cipher f21260f;

    /* renamed from: g */
    private SecretKey f21261g;

    /* renamed from: h */
    private IvParameterSpec f21262h;

    public C5998a(String str, byte[] bArr) {
        String str2;
        String sb;
        byte[] a = m29387a(str);
        try {
            this.f21260f = Cipher.getInstance(f21257c);
        } catch (NoSuchAlgorithmException e) {
            e = e;
            if (f21256b) {
                str2 = f21255a;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("No such algorithm ");
                sb2.append(f21258d);
                sb = sb2.toString();
                Log.e(str2, sb, e);
            }
        } catch (NoSuchPaddingException e2) {
            e = e2;
            if (f21256b) {
                str2 = f21255a;
                sb = "No such padding PKCS5";
                Log.e(str2, sb, e);
            }
        }
        this.f21261g = new SecretKeySpec(a, f21258d);
        this.f21262h = new IvParameterSpec(bArr);
    }

    /* renamed from: a */
    private byte[] m29387a(String str) {
        try {
            return MessageDigest.getInstance(f21259e).digest(str.getBytes());
        } catch (NoSuchAlgorithmException e) {
            if (f21256b) {
                String str2 = f21255a;
                StringBuilder sb = new StringBuilder();
                sb.append("No such algorithm ");
                sb.append(f21259e);
                Log.e(str2, sb.toString(), e);
            }
            return null;
        }
    }

    /* renamed from: a */
    public byte[] mo18908a(byte[] bArr) {
        String str;
        String str2;
        try {
            this.f21260f.init(1, this.f21261g, this.f21262h);
        } catch (InvalidKeyException e) {
            e = e;
            if (f21256b) {
                str = f21255a;
                str2 = "Invalid key";
                Log.e(str, str2, e);
            }
        } catch (InvalidAlgorithmParameterException e2) {
            e = e2;
            if (f21256b) {
                str = f21255a;
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid algorithm ");
                sb.append(f21258d);
                str2 = sb.toString();
                Log.e(str, str2, e);
            }
        }
        return mo18910c(bArr);
    }

    /* renamed from: b */
    public byte[] mo18909b(byte[] bArr) {
        String str;
        String str2;
        try {
            this.f21260f.init(2, this.f21261g, this.f21262h);
        } catch (InvalidKeyException e) {
            e = e;
            if (f21256b) {
                str = f21255a;
                str2 = "Invalid key";
                Log.e(str, str2, e);
            }
        } catch (InvalidAlgorithmParameterException e2) {
            e = e2;
            if (f21256b) {
                str = f21255a;
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid algorithm ");
                sb.append(f21258d);
                str2 = sb.toString();
                Log.e(str, str2, e);
            }
        }
        return mo18910c(bArr);
    }

    /* renamed from: c */
    public byte[] mo18910c(byte[] bArr) {
        String str;
        String str2;
        try {
            return this.f21260f.doFinal(bArr);
        } catch (IllegalBlockSizeException e) {
            e = e;
            if (f21256b) {
                str = f21255a;
                str2 = "Illegal block size";
                Log.e(str, str2, e);
            }
            return null;
        } catch (BadPaddingException e2) {
            e = e2;
            if (f21256b) {
                str = f21255a;
                str2 = "Bad padding";
                Log.e(str, str2, e);
            }
            return null;
        }
    }
}
