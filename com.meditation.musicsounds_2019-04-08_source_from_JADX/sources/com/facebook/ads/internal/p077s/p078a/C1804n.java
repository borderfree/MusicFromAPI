package com.facebook.ads.internal.p077s.p078a;

import java.io.PrintWriter;
import java.io.StringWriter;

/* renamed from: com.facebook.ads.internal.s.a.n */
public class C1804n {
    /* renamed from: a */
    public static final String m8919a(Throwable th) {
        if (th == null) {
            return null;
        }
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.close();
        return stringWriter.toString();
    }
}
