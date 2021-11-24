package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class aak {

    /* renamed from: a */
    static final Charset f11362a = Charset.forName("UTF-8");

    /* renamed from: b */
    public static final byte[] f11363b;

    /* renamed from: c */
    private static final Charset f11364c = Charset.forName("ISO-8859-1");

    /* renamed from: d */
    private static final ByteBuffer f11365d;

    /* renamed from: e */
    private static final C4124zm f11366e;

    static {
        byte[] bArr = new byte[0];
        f11363b = bArr;
        f11365d = ByteBuffer.wrap(bArr);
        byte[] bArr2 = f11363b;
        f11366e = C4124zm.m20433a(bArr2, 0, bArr2.length, false);
    }

    /* renamed from: a */
    static int m15378a(int i, byte[] bArr, int i2, int i3) {
        int i4 = i;
        for (int i5 = i2; i5 < i2 + i3; i5++) {
            i4 = (i4 * 31) + bArr[i5];
        }
        return i4;
    }

    /* renamed from: a */
    public static int m15379a(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: a */
    public static int m15380a(boolean z) {
        return z ? 1231 : 1237;
    }

    /* renamed from: a */
    static <T> T m15381a(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    static Object m15382a(Object obj, Object obj2) {
        return ((abl) obj).mo11482n().mo11554a((abl) obj2).mo11492d();
    }

    /* renamed from: a */
    static <T> T m15383a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: a */
    static boolean m15384a(abl abl) {
        return false;
    }

    /* renamed from: a */
    public static boolean m15385a(byte[] bArr) {
        return ade.m15885a(bArr);
    }

    /* renamed from: b */
    public static String m15386b(byte[] bArr) {
        return new String(bArr, f11362a);
    }

    /* renamed from: c */
    public static int m15387c(byte[] bArr) {
        int length = bArr.length;
        int a = m15378a(length, bArr, 0, length);
        if (a == 0) {
            return 1;
        }
        return a;
    }
}
