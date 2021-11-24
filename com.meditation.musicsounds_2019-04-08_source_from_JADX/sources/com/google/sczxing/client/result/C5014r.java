package com.google.sczxing.client.result;

/* renamed from: com.google.sczxing.client.result.r */
public final class C5014r extends C5009m {

    /* renamed from: a */
    private final String f17901a;

    /* renamed from: b */
    private final String f17902b;

    /* renamed from: c */
    private final String f17903c;

    public C5014r(String str, String str2, String str3) {
        super(ParsedResultType.TEL);
        this.f17901a = str;
        this.f17902b = str2;
        this.f17903c = str3;
    }

    /* renamed from: a */
    public String mo16354a() {
        return this.f17901a;
    }

    /* renamed from: b */
    public String mo16355b() {
        return this.f17902b;
    }

    /* renamed from: o */
    public String mo16330o() {
        StringBuilder sb = new StringBuilder(20);
        m24845a(this.f17901a, sb);
        m24845a(this.f17903c, sb);
        return sb.toString();
    }
}
