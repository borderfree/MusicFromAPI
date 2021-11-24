package org.apache.commons.p198io;

import java.io.File;

/* renamed from: org.apache.commons.io.c */
public class C6731c {

    /* renamed from: a */
    public static final String f23639a = Character.toString('.');

    /* renamed from: b */
    private static final char f23640b = File.separatorChar;

    /* renamed from: c */
    private static final char f23641c = (m32473a() ? '/' : '\\');

    /* renamed from: a */
    public static int m32472a(String str) {
        if (str == null) {
            return -1;
        }
        return Math.max(str.lastIndexOf(47), str.lastIndexOf(92));
    }

    /* renamed from: a */
    static boolean m32473a() {
        return f23640b == '\\';
    }

    /* renamed from: b */
    public static int m32474b(String str) {
        int i = -1;
        if (str == null) {
            return -1;
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (m32472a(str) <= lastIndexOf) {
            i = lastIndexOf;
        }
        return i;
    }

    /* renamed from: c */
    public static String m32475c(String str) {
        if (str == null) {
            return null;
        }
        return str.substring(m32472a(str) + 1);
    }

    /* renamed from: d */
    public static String m32476d(String str) {
        return m32478f(m32475c(str));
    }

    /* renamed from: e */
    public static String m32477e(String str) {
        if (str == null) {
            return null;
        }
        int b = m32474b(str);
        return b == -1 ? "" : str.substring(b + 1);
    }

    /* renamed from: f */
    public static String m32478f(String str) {
        if (str == null) {
            return null;
        }
        int b = m32474b(str);
        return b == -1 ? str : str.substring(0, b);
    }
}
