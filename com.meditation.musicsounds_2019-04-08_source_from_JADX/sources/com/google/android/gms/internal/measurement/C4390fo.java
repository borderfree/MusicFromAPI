package com.google.android.gms.internal.measurement;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: com.google.android.gms.internal.measurement.fo */
public final class C4390fo {

    /* renamed from: a */
    static final Charset f16136a = Charset.forName("UTF-8");

    /* renamed from: b */
    public static final byte[] f16137b;

    /* renamed from: c */
    private static final Charset f16138c = Charset.forName("ISO-8859-1");

    /* renamed from: d */
    private static final ByteBuffer f16139d;

    /* renamed from: e */
    private static final C4359eq f16140e;

    static {
        byte[] bArr = new byte[0];
        f16137b = bArr;
        f16139d = ByteBuffer.wrap(bArr);
        byte[] bArr2 = f16137b;
        f16140e = C4359eq.m21336a(bArr2, 0, bArr2.length, false);
    }

    /* renamed from: a */
    static int m21604a(int i, byte[] bArr, int i2, int i3) {
        int i4 = i;
        for (int i5 = i2; i5 < i2 + i3; i5++) {
            i4 = (i4 * 31) + bArr[i5];
        }
        return i4;
    }

    /* renamed from: a */
    public static int m21605a(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: a */
    public static int m21606a(boolean z) {
        return z ? 1231 : 1237;
    }

    /* renamed from: a */
    static <T> T m21607a(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    static Object m21608a(Object obj, Object obj2) {
        return ((C4419gq) obj).mo14499j().mo14305a((C4419gq) obj2).mo14507e();
    }

    /* renamed from: a */
    static <T> T m21609a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: a */
    static boolean m21610a(C4419gq gqVar) {
        return false;
    }

    /* renamed from: a */
    public static boolean m21611a(byte[] bArr) {
        return C4468ih.m22090a(bArr);
    }

    /* renamed from: b */
    public static String m21612b(byte[] bArr) {
        return new String(bArr, f16136a);
    }

    /* renamed from: c */
    public static int m21613c(byte[] bArr) {
        int length = bArr.length;
        int a = m21604a(length, bArr, 0, length);
        if (a == 0) {
            return 1;
        }
        return a;
    }
}
