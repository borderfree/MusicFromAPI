package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

final class aen {

    /* renamed from: a */
    static CountDownLatch f11648a = new CountDownLatch(1);

    /* renamed from: b */
    private static boolean f11649b = false;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static MessageDigest f11650c;

    /* renamed from: d */
    private static final Object f11651d = new Object();

    /* renamed from: e */
    private static final Object f11652e = new Object();

    /* renamed from: a */
    private static C4110yz m16074a(long j) {
        C4110yz yzVar = new C4110yz();
        yzVar.f15145k = Long.valueOf(4096);
        return yzVar;
    }

    /* renamed from: a */
    static String m16075a(C4110yz yzVar, String str) {
        byte[] bArr;
        byte[] a = C3401ads.m16013a((C3401ads) yzVar);
        if (((Boolean) ane.m16650f().mo12297a(aqm.f12699bL)).booleanValue()) {
            Vector a2 = m16077a(a, 255);
            if (a2 == null || a2.size() == 0) {
                bArr = m16080a(C3401ads.m16013a((C3401ads) m16074a(4096)), str, true);
            } else {
                aej aej = new aej();
                aej.f11638a = new byte[a2.size()][];
                Iterator it = a2.iterator();
                int i = 0;
                while (it.hasNext()) {
                    int i2 = i + 1;
                    aej.f11638a[i] = m16080a((byte[]) it.next(), str, false);
                    i = i2;
                }
                aej.f11639b = m16079a(a);
                bArr = C3401ads.m16013a((C3401ads) aej);
            }
        } else if (agg.f11966a != null) {
            byte[] a3 = agg.f11966a.mo13688a(a, str != null ? str.getBytes() : new byte[0]);
            aej aej2 = new aej();
            aej2.f11638a = new byte[][]{a3};
            aej2.f11640c = Integer.valueOf(2);
            bArr = C3401ads.m16013a((C3401ads) aej2);
        } else {
            throw new GeneralSecurityException();
        }
        return ael.m16070a(bArr, true);
    }

    /* renamed from: a */
    private static Vector<byte[]> m16077a(byte[] bArr, int i) {
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        int length = ((bArr.length + 255) - 1) / 255;
        Vector<byte[]> vector = new Vector<>();
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 * 255;
            try {
                vector.add(Arrays.copyOfRange(bArr, i3, bArr.length - i3 > 255 ? i3 + 255 : bArr.length));
                i2++;
            } catch (IndexOutOfBoundsException unused) {
                return null;
            }
        }
        return vector;
    }

    /* renamed from: a */
    static void m16078a() {
        synchronized (f11652e) {
            if (!f11649b) {
                f11649b = true;
                new Thread(new aep()).start();
            }
        }
    }

    /* renamed from: a */
    public static byte[] m16079a(byte[] bArr) {
        byte[] digest;
        synchronized (f11651d) {
            MessageDigest b = m16081b();
            if (b != null) {
                b.reset();
                b.update(bArr);
                digest = f11650c.digest();
            } else {
                throw new NoSuchAlgorithmException("Cannot compute hash");
            }
        }
        return digest;
    }

    /* renamed from: a */
    private static byte[] m16080a(byte[] bArr, String str, boolean z) {
        ByteBuffer put;
        int i = z ? 239 : 255;
        if (bArr.length > i) {
            bArr = C3401ads.m16013a((C3401ads) m16074a(4096));
        }
        if (bArr.length < i) {
            byte[] bArr2 = new byte[(i - bArr.length)];
            new SecureRandom().nextBytes(bArr2);
            put = ByteBuffer.allocate(i + 1).put((byte) bArr.length).put(bArr).put(bArr2);
        } else {
            put = ByteBuffer.allocate(i + 1).put((byte) bArr.length).put(bArr);
        }
        byte[] array = put.array();
        if (z) {
            array = ByteBuffer.allocate(256).put(m16079a(array)).put(array).array();
        }
        byte[] bArr3 = new byte[256];
        for (aes a : new aeq().f11799cN) {
            a.mo11840a(array, bArr3);
        }
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            new C4106yv(str.getBytes("UTF-8")).mo13831a(bArr3);
        }
        return bArr3;
    }

    /* renamed from: b */
    private static MessageDigest m16081b() {
        boolean z;
        m16078a();
        try {
            z = f11648a.await(2, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
            z = false;
        }
        if (z && f11650c != null) {
            return f11650c;
        }
        return null;
    }
}
