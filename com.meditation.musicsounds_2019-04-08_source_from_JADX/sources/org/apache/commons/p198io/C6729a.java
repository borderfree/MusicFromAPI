package org.apache.commons.p198io;

import java.nio.charset.Charset;

/* renamed from: org.apache.commons.io.a */
public class C6729a {

    /* renamed from: a */
    public static final Charset f23623a = Charset.forName("ISO-8859-1");

    /* renamed from: b */
    public static final Charset f23624b = Charset.forName("US-ASCII");

    /* renamed from: c */
    public static final Charset f23625c = Charset.forName("UTF-16");

    /* renamed from: d */
    public static final Charset f23626d = Charset.forName("UTF-16BE");

    /* renamed from: e */
    public static final Charset f23627e = Charset.forName("UTF-16LE");

    /* renamed from: f */
    public static final Charset f23628f = Charset.forName("UTF-8");

    /* renamed from: a */
    public static Charset m32448a(String str) {
        return str == null ? Charset.defaultCharset() : Charset.forName(str);
    }

    /* renamed from: a */
    public static Charset m32449a(Charset charset) {
        return charset == null ? Charset.defaultCharset() : charset;
    }
}
