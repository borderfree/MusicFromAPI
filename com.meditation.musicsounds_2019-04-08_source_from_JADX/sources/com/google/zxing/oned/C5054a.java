package com.google.zxing.oned;

/* renamed from: com.google.zxing.oned.a */
public final class C5054a extends C5066m {

    /* renamed from: a */
    static final char[] f18005a = "0123456789-$:/.+ABCD".toCharArray();

    /* renamed from: b */
    static final int[] f18006b = {3, 6, 9, 96, 18, 66, 33, 36, 48, 72, 12, 24, 69, 81, 84, 21, 26, 41, 11, 14};

    /* renamed from: c */
    private static final char[] f18007c = {'A', 'B', 'C', 'D'};

    /* renamed from: a */
    static boolean m25073a(char[] cArr, char c) {
        if (cArr != null) {
            for (char c2 : cArr) {
                if (c2 == c) {
                    return true;
                }
            }
        }
        return false;
    }
}
