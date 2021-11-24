package p194nl.siegmann.epublib.util;

/* renamed from: nl.siegmann.epublib.util.c */
public class C6725c {
    /* renamed from: a */
    public static int m32418a(String... strArr) {
        int i = 31;
        for (String valueOf : strArr) {
            i ^= String.valueOf(valueOf).hashCode();
        }
        return i;
    }

    /* renamed from: a */
    public static String m32419a(String str, char c) {
        if (m32427c(str)) {
            return str;
        }
        int indexOf = str.indexOf(c);
        return indexOf < 0 ? str : str.substring(0, indexOf);
    }

    /* renamed from: a */
    public static String m32420a(Object... objArr) {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (int i = 0; i < objArr.length; i += 2) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(objArr[i]);
            sb.append(": ");
            Object obj = null;
            int i2 = i + 1;
            if (i2 < objArr.length) {
                obj = objArr[i2];
            }
            if (obj == null) {
                sb.append("<null>");
            } else {
                sb.append('\'');
                sb.append(obj);
                sb.append('\'');
            }
        }
        sb.append(']');
        return sb.toString();
    }

    /* renamed from: a */
    public static boolean m32421a(String str) {
        return !m32425b(str);
    }

    /* renamed from: a */
    public static boolean m32422a(String str, String str2) {
        if (m32427c(str2)) {
            return true;
        }
        if (!m32427c(str) && str2.length() <= str.length()) {
            return str.substring(str.length() - str2.length()).toLowerCase().endsWith(str2.toLowerCase());
        }
        return false;
    }

    /* renamed from: b */
    public static String m32423b(String str, char c) {
        if (m32427c(str)) {
            return str;
        }
        int lastIndexOf = str.lastIndexOf(c);
        return lastIndexOf < 0 ? str : str.substring(0, lastIndexOf);
    }

    /* renamed from: b */
    public static String m32424b(String str, String str2) {
        return str == null ? str2 : str;
    }

    /* renamed from: b */
    public static boolean m32425b(String str) {
        if (m32427c(str)) {
            return true;
        }
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isWhitespace(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    public static String m32426c(String str, char c) {
        if (m32427c(str)) {
            return str;
        }
        int lastIndexOf = str.lastIndexOf(c);
        return lastIndexOf < 0 ? "" : str.substring(lastIndexOf + 1);
    }

    /* renamed from: c */
    public static boolean m32427c(String str) {
        return str == null || str.length() == 0;
    }

    /* renamed from: c */
    public static boolean m32428c(String str, String str2) {
        if (str != null) {
            return str.equals(str2);
        }
        return str2 == null;
    }

    /* renamed from: d */
    public static String m32429d(String str) {
        return m32424b(str, "");
    }

    /* renamed from: d */
    public static String m32430d(String str, char c) {
        if (m32427c(str)) {
            return str;
        }
        int indexOf = str.indexOf(c);
        return indexOf < 0 ? "" : str.substring(indexOf + 1);
    }
}
