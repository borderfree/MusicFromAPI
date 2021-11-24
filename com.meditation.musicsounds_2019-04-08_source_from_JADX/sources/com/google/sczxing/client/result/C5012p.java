package com.google.sczxing.client.result;

/* renamed from: com.google.sczxing.client.result.p */
public final class C5012p extends C5009m {

    /* renamed from: a */
    private final String[] f17897a;

    /* renamed from: b */
    private final String[] f17898b;

    /* renamed from: c */
    private final String f17899c;

    /* renamed from: d */
    private final String f17900d;

    public C5012p(String str, String str2, String str3, String str4) {
        super(ParsedResultType.SMS);
        this.f17897a = new String[]{str};
        this.f17898b = new String[]{str2};
        this.f17899c = str3;
        this.f17900d = str4;
    }

    public C5012p(String[] strArr, String[] strArr2, String str, String str2) {
        super(ParsedResultType.SMS);
        this.f17897a = strArr;
        this.f17898b = strArr2;
        this.f17899c = str;
        this.f17900d = str2;
    }

    /* renamed from: a */
    public String[] mo16350a() {
        return this.f17897a;
    }

    /* renamed from: b */
    public String mo16351b() {
        return this.f17899c;
    }

    /* renamed from: c */
    public String mo16352c() {
        return this.f17900d;
    }

    /* renamed from: o */
    public String mo16330o() {
        StringBuilder sb = new StringBuilder(100);
        m24846a(this.f17897a, sb);
        m24845a(this.f17899c, sb);
        m24845a(this.f17900d, sb);
        return sb.toString();
    }
}
