package com.google.sczxing.client.result;

/* renamed from: com.google.sczxing.client.result.d */
public final class C5000d extends C5009m {

    /* renamed from: a */
    private final String[] f17859a;

    /* renamed from: b */
    private final String f17860b;

    /* renamed from: c */
    private final String[] f17861c;

    /* renamed from: d */
    private final String[] f17862d;

    /* renamed from: e */
    private final String[] f17863e;

    /* renamed from: f */
    private final String[] f17864f;

    /* renamed from: g */
    private final String f17865g;

    /* renamed from: h */
    private final String f17866h;

    /* renamed from: i */
    private final String[] f17867i;

    /* renamed from: j */
    private final String[] f17868j;

    /* renamed from: k */
    private final String f17869k;

    /* renamed from: l */
    private final String f17870l;

    /* renamed from: m */
    private final String f17871m;

    /* renamed from: n */
    private final String f17872n;

    public C5000d(String[] strArr, String str, String[] strArr2, String[] strArr3, String[] strArr4, String[] strArr5, String str2, String str3, String[] strArr6, String[] strArr7, String str4, String str5, String str6, String str7) {
        super(ParsedResultType.ADDRESSBOOK);
        this.f17859a = strArr;
        this.f17860b = str;
        this.f17861c = strArr2;
        this.f17862d = strArr3;
        this.f17863e = strArr4;
        this.f17864f = strArr5;
        this.f17865g = str2;
        this.f17866h = str3;
        this.f17867i = strArr6;
        this.f17868j = strArr7;
        this.f17869k = str4;
        this.f17870l = str5;
        this.f17871m = str6;
        this.f17872n = str7;
    }

    /* renamed from: a */
    public String[] mo16316a() {
        return this.f17859a;
    }

    /* renamed from: b */
    public String mo16317b() {
        return this.f17860b;
    }

    /* renamed from: c */
    public String[] mo16318c() {
        return this.f17861c;
    }

    /* renamed from: d */
    public String[] mo16319d() {
        return this.f17862d;
    }

    /* renamed from: e */
    public String[] mo16320e() {
        return this.f17863e;
    }

    /* renamed from: f */
    public String[] mo16321f() {
        return this.f17864f;
    }

    /* renamed from: g */
    public String mo16322g() {
        return this.f17865g;
    }

    /* renamed from: h */
    public String mo16323h() {
        return this.f17866h;
    }

    /* renamed from: i */
    public String[] mo16324i() {
        return this.f17867i;
    }

    /* renamed from: j */
    public String[] mo16325j() {
        return this.f17868j;
    }

    /* renamed from: k */
    public String mo16326k() {
        return this.f17871m;
    }

    /* renamed from: l */
    public String mo16327l() {
        return this.f17869k;
    }

    /* renamed from: m */
    public String mo16328m() {
        return this.f17872n;
    }

    /* renamed from: n */
    public String mo16329n() {
        return this.f17870l;
    }

    /* renamed from: o */
    public String mo16330o() {
        StringBuilder sb = new StringBuilder(100);
        m24846a(this.f17859a, sb);
        m24845a(this.f17860b, sb);
        m24845a(this.f17871m, sb);
        m24845a(this.f17869k, sb);
        m24846a(this.f17867i, sb);
        m24846a(this.f17861c, sb);
        m24846a(this.f17863e, sb);
        m24845a(this.f17865g, sb);
        m24845a(this.f17872n, sb);
        m24845a(this.f17870l, sb);
        m24845a(this.f17866h, sb);
        return sb.toString();
    }
}
