package org.jsoup.helper;

/* renamed from: org.jsoup.helper.b */
public final class C6759b {
    /* renamed from: a */
    public static void m32602a(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("Object must not be null");
        }
    }

    /* renamed from: a */
    public static void m32603a(String str) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("String must not be empty");
        }
    }

    /* renamed from: a */
    public static void m32604a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException("Must be true");
        }
    }

    /* renamed from: a */
    public static void m32605a(boolean z, String str) {
        if (z) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: a */
    public static void m32606a(Object[] objArr) {
        m32607a(objArr, "Array must not contain any null objects");
    }

    /* renamed from: a */
    public static void m32607a(Object[] objArr, String str) {
        int length = objArr.length;
        int i = 0;
        while (i < length) {
            if (objArr[i] != null) {
                i++;
            } else {
                throw new IllegalArgumentException(str);
            }
        }
    }

    /* renamed from: b */
    public static void m32608b(String str) {
        throw new IllegalArgumentException(str);
    }

    /* renamed from: b */
    public static void m32609b(boolean z) {
        if (z) {
            throw new IllegalArgumentException("Must be false");
        }
    }
}
