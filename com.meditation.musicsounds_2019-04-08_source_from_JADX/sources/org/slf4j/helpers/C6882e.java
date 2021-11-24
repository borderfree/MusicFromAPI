package org.slf4j.helpers;

import java.io.PrintStream;

/* renamed from: org.slf4j.helpers.e */
public class C6882e {
    /* renamed from: a */
    public static final void m32930a(String str) {
        PrintStream printStream = System.err;
        StringBuilder sb = new StringBuilder();
        sb.append("SLF4J: ");
        sb.append(str);
        printStream.println(sb.toString());
    }

    /* renamed from: a */
    public static final void m32931a(String str, Throwable th) {
        System.err.println(str);
        System.err.println("Reported exception:");
        th.printStackTrace();
    }
}
