package com.google.sczxing.client.result;

/* renamed from: com.google.sczxing.client.result.k */
public final class C5007k extends C5009m {

    /* renamed from: a */
    private final double f17886a;

    /* renamed from: b */
    private final double f17887b;

    /* renamed from: c */
    private final double f17888c;

    /* renamed from: d */
    private final String f17889d;

    C5007k(double d, double d2, double d3, String str) {
        super(ParsedResultType.GEO);
        this.f17886a = d;
        this.f17887b = d2;
        this.f17888c = d3;
        this.f17889d = str;
    }

    /* renamed from: a */
    public String mo16345a() {
        StringBuilder sb = new StringBuilder();
        sb.append("geo:");
        sb.append(this.f17886a);
        sb.append(',');
        sb.append(this.f17887b);
        if (this.f17888c > 0.0d) {
            sb.append(',');
            sb.append(this.f17888c);
        }
        if (this.f17889d != null) {
            sb.append('?');
            sb.append(this.f17889d);
        }
        return sb.toString();
    }

    /* renamed from: o */
    public String mo16330o() {
        StringBuilder sb = new StringBuilder(20);
        sb.append(this.f17886a);
        sb.append(", ");
        sb.append(this.f17887b);
        if (this.f17888c > 0.0d) {
            sb.append(", ");
            sb.append(this.f17888c);
            sb.append('m');
        }
        if (this.f17889d != null) {
            sb.append(" (");
            sb.append(this.f17889d);
            sb.append(')');
        }
        return sb.toString();
    }
}
