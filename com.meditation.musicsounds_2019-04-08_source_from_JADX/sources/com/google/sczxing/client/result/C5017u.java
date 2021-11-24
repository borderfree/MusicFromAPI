package com.google.sczxing.client.result;

import java.util.Locale;
import java.util.regex.Pattern;

/* renamed from: com.google.sczxing.client.result.u */
public final class C5017u extends C5009m {

    /* renamed from: a */
    private static final Pattern f17906a = Pattern.compile(":/*([^/@]+)@[^/]+");

    /* renamed from: b */
    private final String f17907b;

    /* renamed from: c */
    private final String f17908c;

    public C5017u(String str, String str2) {
        super(ParsedResultType.URI);
        this.f17907b = m24874a(str);
        this.f17908c = str2;
    }

    /* renamed from: a */
    private static String m24874a(String str) {
        StringBuilder sb;
        String trim = str.trim();
        int indexOf = trim.indexOf(58);
        if (indexOf < 0) {
            sb = new StringBuilder();
        } else if (m24875a(trim, indexOf)) {
            sb = new StringBuilder();
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(trim.substring(0, indexOf).toLowerCase(Locale.ENGLISH));
            sb2.append(trim.substring(indexOf));
            return sb2.toString();
        }
        sb.append("http://");
        sb.append(trim);
        return sb.toString();
    }

    /* renamed from: a */
    private static boolean m24875a(String str, int i) {
        int i2 = i + 1;
        int indexOf = str.indexOf(47, i2);
        if (indexOf < 0) {
            indexOf = str.length();
        }
        if (indexOf <= i2) {
            return false;
        }
        while (i2 < indexOf) {
            if (str.charAt(i2) < '0' || str.charAt(i2) > '9') {
                return false;
            }
            i2++;
        }
        return true;
    }

    /* renamed from: a */
    public String mo16357a() {
        return this.f17907b;
    }

    /* renamed from: o */
    public String mo16330o() {
        StringBuilder sb = new StringBuilder(30);
        m24845a(this.f17908c, sb);
        m24845a(this.f17907b, sb);
        return sb.toString();
    }
}
