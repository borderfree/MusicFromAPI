package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class afn {

    /* renamed from: b */
    private static Cipher f11910b;

    /* renamed from: c */
    private static final Object f11911c = new Object();

    /* renamed from: d */
    private static final Object f11912d = new Object();

    /* renamed from: a */
    private final SecureRandom f11913a = null;

    public afn(SecureRandom secureRandom) {
    }

    /* renamed from: a */
    private static Cipher m16126a() {
        Cipher cipher;
        synchronized (f11912d) {
            if (f11910b == null) {
                f11910b = Cipher.getInstance("AES/CBC/PKCS5Padding");
            }
            cipher = f11910b;
        }
        return cipher;
    }

    /* renamed from: a */
    public final String mo11855a(byte[] bArr, byte[] bArr2) {
        byte[] doFinal;
        byte[] iv;
        if (bArr.length == 16) {
            try {
                SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
                synchronized (f11911c) {
                    m16126a().init(1, secretKeySpec, null);
                    doFinal = m16126a().doFinal(bArr2);
                    iv = m16126a().getIV();
                }
                int length = doFinal.length + iv.length;
                ByteBuffer allocate = ByteBuffer.allocate(length);
                allocate.put(iv).put(doFinal);
                allocate.flip();
                byte[] bArr3 = new byte[length];
                allocate.get(bArr3);
                return ael.m16070a(bArr3, false);
            } catch (NoSuchAlgorithmException e) {
                throw new zzcl(this, e);
            } catch (InvalidKeyException e2) {
                throw new zzcl(this, e2);
            } catch (IllegalBlockSizeException e3) {
                throw new zzcl(this, e3);
            } catch (NoSuchPaddingException e4) {
                throw new zzcl(this, e4);
            } catch (BadPaddingException e5) {
                throw new zzcl(this, e5);
            }
        } else {
            throw new zzcl(this);
        }
    }

    /* renamed from: a */
    public final byte[] mo11856a(String str) {
        try {
            byte[] a = ael.m16071a(str, false);
            if (a.length == 32) {
                byte[] bArr = new byte[16];
                ByteBuffer.wrap(a, 4, 16).get(bArr);
                for (int i = 0; i < 16; i++) {
                    bArr[i] = (byte) (bArr[i] ^ 68);
                }
                return bArr;
            }
            throw new zzcl(this);
        } catch (IllegalArgumentException e) {
            throw new zzcl(this, e);
        }
    }

    /* renamed from: a */
    public final byte[] mo11857a(byte[] bArr, String str) {
        byte[] doFinal;
        if (bArr.length == 16) {
            try {
                byte[] a = ael.m16071a(str, false);
                if (a.length > 16) {
                    ByteBuffer allocate = ByteBuffer.allocate(a.length);
                    allocate.put(a);
                    allocate.flip();
                    byte[] bArr2 = new byte[16];
                    byte[] bArr3 = new byte[(a.length - 16)];
                    allocate.get(bArr2);
                    allocate.get(bArr3);
                    SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
                    synchronized (f11911c) {
                        m16126a().init(2, secretKeySpec, new IvParameterSpec(bArr2));
                        doFinal = m16126a().doFinal(bArr3);
                    }
                    return doFinal;
                }
                throw new zzcl(this);
            } catch (NoSuchAlgorithmException e) {
                throw new zzcl(this, e);
            } catch (InvalidKeyException e2) {
                throw new zzcl(this, e2);
            } catch (IllegalBlockSizeException e3) {
                throw new zzcl(this, e3);
            } catch (NoSuchPaddingException e4) {
                throw new zzcl(this, e4);
            } catch (BadPaddingException e5) {
                throw new zzcl(this, e5);
            } catch (InvalidAlgorithmParameterException e6) {
                throw new zzcl(this, e6);
            } catch (IllegalArgumentException e7) {
                throw new zzcl(this, e7);
            }
        } else {
            throw new zzcl(this);
        }
    }
}
