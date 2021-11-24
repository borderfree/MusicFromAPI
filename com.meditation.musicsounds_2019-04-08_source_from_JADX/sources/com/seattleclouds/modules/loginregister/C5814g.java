package com.seattleclouds.modules.loginregister;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.hardware.fingerprint.FingerprintManager.CryptoObject;
import android.os.Build.VERSION;
import android.security.keystore.KeyGenParameterSpec.Builder;
import android.util.Base64;
import com.seattleclouds.App;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource.PSpecified;

/* renamed from: com.seattleclouds.modules.loginregister.g */
public class C5814g {

    /* renamed from: a */
    private static KeyStore f20603a;

    /* renamed from: b */
    private static KeyPairGenerator f20604b;

    /* renamed from: c */
    private static Cipher f20605c;

    /* renamed from: a */
    static CryptoObject m28630a() {
        if (!m28640g() || !m28636c() || !m28637d() || !m28632a(2) || VERSION.SDK_INT < 23) {
            return null;
        }
        return new CryptoObject(f20605c);
    }

    /* renamed from: a */
    public static String m28631a(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(Base64.encode(str.getBytes(), 2));
            StringBuilder sb = new StringBuilder();
            for (byte valueOf : instance.digest()) {
                sb.append(String.format("%02x", new Object[]{Byte.valueOf(valueOf)}));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException unused) {
            return "";
        }
    }

    /* renamed from: a */
    private static boolean m28632a(int i) {
        return m28633a(i, true);
    }

    /* renamed from: a */
    private static boolean m28633a(int i, boolean z) {
        try {
            f20603a.load(null);
            switch (i) {
                case 1:
                    PublicKey publicKey = f20603a.getCertificate("FINGERPRINT_KEY_PAIR_ALIAS").getPublicKey();
                    f20605c.init(i, KeyFactory.getInstance(publicKey.getAlgorithm()).generatePublic(new X509EncodedKeySpec(publicKey.getEncoded())), new OAEPParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA1, PSpecified.DEFAULT));
                    break;
                case 2:
                    f20605c.init(i, (PrivateKey) f20603a.getKey("FINGERPRINT_KEY_PAIR_ALIAS", null));
                    break;
                default:
                    return false;
            }
            return true;
        } catch (IOException | InvalidAlgorithmParameterException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | UnrecoverableKeyException | CertificateException | InvalidKeySpecException e) {
            try {
                f20603a.deleteEntry("FINGERPRINT_KEY_PAIR_ALIAS");
                if (z) {
                    m28633a(i, false);
                }
            } catch (KeyStoreException e2) {
                e2.printStackTrace();
            }
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m28634a(Context context) {
        if (VERSION.SDK_INT >= 23) {
            FingerprintManager fingerprintManager = (FingerprintManager) context.getSystemService("fingerprint");
            if (fingerprintManager != null && fingerprintManager.isHardwareDetected() && fingerprintManager.hasEnrolledFingerprints()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m28635b() {
        Boolean valueOf = Boolean.valueOf(true);
        if (m28634a(App.m25647e()) && App.f18501c.mo16915Q().mo18494a().booleanValue()) {
            return valueOf.booleanValue();
        }
        return false;
    }

    /* renamed from: c */
    private static boolean m28636c() {
        try {
            f20605c = Cipher.getInstance("RSA/ECB/OAEPWithSHA-256AndMGF1Padding");
            return true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: d */
    private static boolean m28637d() {
        boolean z = false;
        try {
            if (f20603a.containsAlias("FINGERPRINT_KEY_PAIR_ALIAS") || m28638e()) {
                z = true;
            }
            return z;
        } catch (KeyStoreException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: e */
    private static boolean m28638e() {
        if (m28639f()) {
            try {
                if (VERSION.SDK_INT < 23) {
                    return false;
                }
                f20604b.initialize(new Builder("FINGERPRINT_KEY_PAIR_ALIAS", 3).setDigests(new String[]{"SHA-256", "SHA-512"}).setEncryptionPaddings(new String[]{"OAEPPadding"}).setUserAuthenticationRequired(true).build());
                f20604b.generateKeyPair();
                return true;
            } catch (InvalidAlgorithmParameterException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    /* renamed from: f */
    private static boolean m28639f() {
        try {
            f20604b = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
            return true;
        } catch (NoSuchAlgorithmException | NoSuchProviderException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: g */
    private static boolean m28640g() {
        try {
            f20603a = KeyStore.getInstance("AndroidKeyStore");
            f20603a.load(null);
            return true;
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException e) {
            e.printStackTrace();
            return false;
        }
    }
}
