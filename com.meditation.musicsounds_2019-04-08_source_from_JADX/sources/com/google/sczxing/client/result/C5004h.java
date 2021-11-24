package com.google.sczxing.client.result;

/* renamed from: com.google.sczxing.client.result.h */
public final class C5004h extends C5009m {

    /* renamed from: a */
    private final String f17881a;

    /* renamed from: b */
    private final String f17882b;

    /* renamed from: c */
    private final String f17883c;

    /* renamed from: d */
    private final String f17884d;

    C5004h(String str, String str2, String str3, String str4) {
        super(ParsedResultType.EMAIL_ADDRESS);
        this.f17881a = str;
        this.f17882b = str2;
        this.f17883c = str3;
        this.f17884d = str4;
    }

    /* renamed from: a */
    public String mo16339a() {
        return this.f17881a;
    }

    /* renamed from: b */
    public String mo16340b() {
        return this.f17882b;
    }

    /* renamed from: c */
    public String mo16341c() {
        return this.f17883c;
    }

    /* renamed from: d */
    public String mo16342d() {
        return this.f17884d;
    }

    /* renamed from: o */
    public String mo16330o() {
        StringBuilder sb = new StringBuilder(30);
        m24845a(this.f17881a, sb);
        m24845a(this.f17882b, sb);
        m24845a(this.f17883c, sb);
        return sb.toString();
    }
}
