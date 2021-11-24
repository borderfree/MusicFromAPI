package com.facebook.ads.internal.protocol;

/* renamed from: com.facebook.ads.internal.protocol.b */
public class C1734b extends Exception {

    /* renamed from: a */
    private final AdErrorType f5724a;

    /* renamed from: b */
    private final String f5725b;

    public C1734b(AdErrorType adErrorType, String str) {
        this(adErrorType, str, null);
    }

    public C1734b(AdErrorType adErrorType, String str, Throwable th) {
        super(str, th);
        this.f5724a = adErrorType;
        this.f5725b = str;
    }

    /* renamed from: a */
    public AdErrorType mo6954a() {
        return this.f5724a;
    }

    /* renamed from: b */
    public String mo6955b() {
        return this.f5725b;
    }
}
