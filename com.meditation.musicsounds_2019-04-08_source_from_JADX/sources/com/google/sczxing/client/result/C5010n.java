package com.google.sczxing.client.result;

import com.google.sczxing.client.p140a.C4988f;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: com.google.sczxing.client.result.n */
public abstract class C5010n {

    /* renamed from: a */
    private static final C5010n[] f17892a = {new C5002f(), new C4999c(), new C5006j(), new C4998b(), new C5020x(), new C5001e(), new C5021y(), new C5005i(), new C5015s(), new C5011o(), new C5013q(), new C5008l(), new C5019w(), new C5018v()};

    /* renamed from: b */
    private static final Pattern f17893b = Pattern.compile("\\d*");

    /* renamed from: c */
    private static final Pattern f17894c = Pattern.compile("[a-zA-Z0-9]*");

    /* renamed from: d */
    private static final Pattern f17895d = Pattern.compile("&");

    /* renamed from: e */
    private static final Pattern f17896e = Pattern.compile("=");

    /* renamed from: a */
    protected static int m24849a(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        char c2 = 'a';
        if (c < 'a' || c > 'f') {
            c2 = 'A';
            if (c < 'A' || c > 'F') {
                return -1;
            }
        }
        return (c - c2) + 10;
    }

    /* renamed from: a */
    private static void m24850a(CharSequence charSequence, Map<String, String> map) {
        String[] split = f17896e.split(charSequence, 2);
        if (split.length == 2) {
            try {
                map.put(split[0], URLDecoder.decode(split[1], "UTF-8"));
            } catch (UnsupportedEncodingException e) {
                throw new IllegalStateException(e);
            }
        }
    }

    /* renamed from: a */
    protected static boolean m24851a(CharSequence charSequence, int i) {
        return charSequence != null && i == charSequence.length() && f17893b.matcher(charSequence).matches();
    }

    /* renamed from: a */
    static String[] m24852a(String str, String str2, char c, boolean z) {
        int length = str2.length();
        List list = null;
        int i = 0;
        while (i < length) {
            int indexOf = str2.indexOf(str, i);
            if (indexOf < 0) {
                break;
            }
            int length2 = indexOf + str.length();
            boolean z2 = true;
            List list2 = list;
            int i2 = length2;
            while (z2) {
                int indexOf2 = str2.indexOf(c, i2);
                if (indexOf2 < 0) {
                    i2 = str2.length();
                } else if (str2.charAt(indexOf2 - 1) == '\\') {
                    i2 = indexOf2 + 1;
                } else {
                    if (list2 == null) {
                        list2 = new ArrayList(3);
                    }
                    String c2 = m24856c(str2.substring(length2, indexOf2));
                    if (z) {
                        c2 = c2.trim();
                    }
                    list2.add(c2);
                    i2 = indexOf2 + 1;
                }
                z2 = false;
            }
            i = i2;
            list = list2;
        }
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (String[]) list.toArray(new String[list.size()]);
    }

    /* renamed from: b */
    static String m24853b(String str, String str2, char c, boolean z) {
        String[] a = m24852a(str, str2, c, z);
        if (a == null) {
            return null;
        }
        return a[0];
    }

    /* renamed from: b */
    protected static String[] m24854b(String str) {
        if (str == null) {
            return null;
        }
        return new String[]{str};
    }

    /* renamed from: c */
    public static C5009m m24855c(C4988f fVar) {
        for (C5010n b : f17892a) {
            C5009m b2 = b.mo16314b(fVar);
            if (b2 != null) {
                return b2;
            }
        }
        return new C5016t(fVar.mo16290a(), null);
    }

    /* renamed from: c */
    protected static String m24856c(String str) {
        int indexOf = str.indexOf(92);
        if (indexOf < 0) {
            return str;
        }
        int length = str.length();
        StringBuilder sb = new StringBuilder(length - 1);
        sb.append(str.toCharArray(), 0, indexOf);
        boolean z = false;
        while (indexOf < length) {
            char charAt = str.charAt(indexOf);
            if (z || charAt != '\\') {
                sb.append(charAt);
                z = false;
            } else {
                z = true;
            }
            indexOf++;
        }
        return sb.toString();
    }

    /* renamed from: d */
    static Map<String, String> m24857d(String str) {
        int indexOf = str.indexOf(63);
        if (indexOf < 0) {
            return null;
        }
        HashMap hashMap = new HashMap(3);
        for (String a : f17895d.split(str.substring(indexOf + 1))) {
            m24850a((CharSequence) a, (Map<String, String>) hashMap);
        }
        return hashMap;
    }

    /* renamed from: b */
    public abstract C5009m mo16314b(C4988f fVar);
}
