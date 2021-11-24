package org.jsoup.helper;

/* renamed from: org.jsoup.helper.a */
public final class C6758a {

    /* renamed from: a */
    private static final String[] f23718a = {"", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          "};

    /* renamed from: a */
    public static String m32598a(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("width must be > 0");
        } else if (i < f23718a.length) {
            return f23718a[i];
        } else {
            char[] cArr = new char[i];
            for (int i2 = 0; i2 < i; i2++) {
                cArr[i2] = ' ';
            }
            return String.valueOf(cArr);
        }
    }

    /* renamed from: a */
    public static boolean m32599a(String str) {
        if (!(str == null || str.length() == 0)) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                if (!Character.isWhitespace(str.codePointAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m32600a(String str, String... strArr) {
        for (String equals : strArr) {
            if (equals.equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static String m32601b(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        int length = str.length();
        boolean z = false;
        boolean z2 = false;
        for (int i = 0; i < length; i++) {
            int codePointAt = str.codePointAt(i);
            if (!Character.isWhitespace(codePointAt)) {
                sb.appendCodePoint(codePointAt);
                z2 = false;
            } else if (z2) {
                z = true;
            } else {
                if (codePointAt != 32) {
                    z = true;
                }
                sb.append(' ');
                z2 = true;
            }
        }
        return z ? sb.toString() : str;
    }
}
