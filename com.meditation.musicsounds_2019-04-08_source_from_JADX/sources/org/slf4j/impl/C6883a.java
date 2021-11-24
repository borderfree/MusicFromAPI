package org.slf4j.impl;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import org.slf4j.C6875a;

/* renamed from: org.slf4j.impl.a */
public class C6883a implements C6875a {

    /* renamed from: a */
    private final Map<String, AndroidLogger> f23834a = new HashMap();

    /* renamed from: c */
    private final String m32934c(String str) {
        if (str == null || str.length() <= 23) {
            return str;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(str, ".");
        if (stringTokenizer.hasMoreTokens()) {
            StringBuilder sb = new StringBuilder();
            do {
                String nextToken = stringTokenizer.nextToken();
                if (nextToken.length() == 1) {
                    sb.append(nextToken);
                    sb.append('.');
                } else {
                    if (stringTokenizer.hasMoreTokens()) {
                        sb.append(nextToken.charAt(0));
                        nextToken = "*.";
                    }
                    sb.append(nextToken);
                }
            } while (stringTokenizer.hasMoreTokens());
            str = sb.toString();
        }
        if (str.length() <= 23) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str.substring(0, 22));
        sb2.append('*');
        return sb2.toString();
    }

    /* renamed from: b */
    public AndroidLogger mo21474a(String str) {
        AndroidLogger androidLogger;
        String c = m32934c(str);
        synchronized (this) {
            androidLogger = (AndroidLogger) this.f23834a.get(c);
            if (androidLogger == null) {
                if (!c.equals(str)) {
                    String simpleName = C6883a.class.getSimpleName();
                    StringBuilder sb = new StringBuilder();
                    sb.append("Logger name '");
                    sb.append(str);
                    sb.append("' exceeds maximum length of ");
                    sb.append(23);
                    sb.append(" characters, using '");
                    sb.append(c);
                    sb.append("' instead.");
                    Log.i(simpleName, sb.toString());
                }
                androidLogger = new AndroidLogger(c);
                this.f23834a.put(c, androidLogger);
            }
        }
        return androidLogger;
    }
}
