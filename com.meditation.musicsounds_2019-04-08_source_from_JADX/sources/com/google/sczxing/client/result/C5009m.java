package com.google.sczxing.client.result;

/* renamed from: com.google.sczxing.client.result.m */
public abstract class C5009m {

    /* renamed from: a */
    private final ParsedResultType f17891a;

    protected C5009m(ParsedResultType parsedResultType) {
        this.f17891a = parsedResultType;
    }

    /* renamed from: a */
    public static void m24845a(String str, StringBuilder sb) {
        if (str != null && str.length() > 0) {
            if (sb.length() > 0) {
                sb.append(10);
            }
            sb.append(str);
        }
    }

    /* renamed from: a */
    public static void m24846a(String[] strArr, StringBuilder sb) {
        if (strArr != null) {
            for (String str : strArr) {
                if (str != null && str.length() > 0) {
                    if (sb.length() > 0) {
                        sb.append(10);
                    }
                    sb.append(str);
                }
            }
        }
    }

    /* renamed from: o */
    public abstract String mo16330o();

    /* renamed from: p */
    public ParsedResultType mo16347p() {
        return this.f17891a;
    }

    public String toString() {
        return mo16330o();
    }
}
