package com.facebook.ads.internal.p073r.p075b;

import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.facebook.ads.internal.r.b.d */
class C1765d {

    /* renamed from: d */
    private static final Pattern f5766d = Pattern.compile("[R,r]ange:[ ]?bytes=(\\d*)-");

    /* renamed from: e */
    private static final Pattern f5767e = Pattern.compile("GET /(.*) HTTP");

    /* renamed from: a */
    public final String f5768a;

    /* renamed from: b */
    public final long f5769b;

    /* renamed from: c */
    public final boolean f5770c;

    public C1765d(String str) {
        C1777j.m8841a(str);
        long a = m8794a(str);
        this.f5769b = Math.max(0, a);
        this.f5770c = a >= 0;
        this.f5768a = m8796b(str);
    }

    /* renamed from: a */
    private long m8794a(String str) {
        Matcher matcher = f5766d.matcher(str);
        if (matcher.find()) {
            return Long.parseLong(matcher.group(1));
        }
        return -1;
    }

    /* renamed from: a */
    public static C1765d m8795a(InputStream inputStream) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (TextUtils.isEmpty(readLine)) {
                return new C1765d(sb.toString());
            }
            sb.append(readLine);
            sb.append(10);
        }
    }

    /* renamed from: b */
    private String m8796b(String str) {
        Matcher matcher = f5767e.matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid request `");
        sb.append(str);
        sb.append("`: url not found!");
        throw new IllegalArgumentException(sb.toString());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GetRequest{rangeOffset=");
        sb.append(this.f5769b);
        sb.append(", partial=");
        sb.append(this.f5770c);
        sb.append(", uri='");
        sb.append(this.f5768a);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
