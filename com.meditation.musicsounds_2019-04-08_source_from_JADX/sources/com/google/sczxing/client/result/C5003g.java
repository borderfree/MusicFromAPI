package com.google.sczxing.client.result;

/* renamed from: com.google.sczxing.client.result.g */
public final class C5003g extends C5009m {

    /* renamed from: a */
    private final String f17873a;

    /* renamed from: b */
    private final String f17874b;

    /* renamed from: c */
    private final String f17875c;

    /* renamed from: d */
    private final String f17876d;

    /* renamed from: e */
    private final String f17877e;

    /* renamed from: f */
    private final String f17878f;

    /* renamed from: g */
    private final double f17879g;

    /* renamed from: h */
    private final double f17880h;

    public C5003g(String str, String str2, String str3, String str4, String str5, String str6, double d, double d2) {
        super(ParsedResultType.CALENDAR);
        m24823a(str2);
        this.f17873a = str;
        this.f17874b = str2;
        if (str3 != null) {
            m24823a(str3);
            this.f17875c = str3;
        } else {
            this.f17875c = null;
        }
        this.f17876d = str4;
        this.f17877e = str5;
        this.f17878f = str6;
        this.f17879g = d;
        this.f17880h = d2;
    }

    /* renamed from: a */
    private static void m24823a(CharSequence charSequence) {
        if (charSequence != null) {
            int length = charSequence.length();
            if (length == 8 || length == 15 || length == 16) {
                int i = 0;
                while (i < 8) {
                    if (Character.isDigit(charSequence.charAt(i))) {
                        i++;
                    } else {
                        throw new IllegalArgumentException();
                    }
                }
                if (length <= 8) {
                    return;
                }
                if (charSequence.charAt(8) == 'T') {
                    int i2 = 9;
                    while (i2 < 15) {
                        if (Character.isDigit(charSequence.charAt(i2))) {
                            i2++;
                        } else {
                            throw new IllegalArgumentException();
                        }
                    }
                    if (length == 16 && charSequence.charAt(15) != 'Z') {
                        throw new IllegalArgumentException();
                    }
                    return;
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: a */
    public String mo16333a() {
        return this.f17873a;
    }

    /* renamed from: b */
    public String mo16334b() {
        return this.f17874b;
    }

    /* renamed from: c */
    public String mo16335c() {
        return this.f17875c;
    }

    /* renamed from: d */
    public String mo16336d() {
        return this.f17876d;
    }

    /* renamed from: e */
    public String mo16337e() {
        return this.f17877e;
    }

    /* renamed from: f */
    public String mo16338f() {
        return this.f17878f;
    }

    /* renamed from: o */
    public String mo16330o() {
        StringBuilder sb = new StringBuilder(100);
        m24845a(this.f17873a, sb);
        m24845a(this.f17874b, sb);
        m24845a(this.f17875c, sb);
        m24845a(this.f17876d, sb);
        m24845a(this.f17877e, sb);
        m24845a(this.f17878f, sb);
        return sb.toString();
    }
}
