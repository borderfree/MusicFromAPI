package com.facebook.ads.internal.p073r.p074a;

/* renamed from: com.facebook.ads.internal.r.a.h */
public abstract class C1744h {

    /* renamed from: a */
    protected String f5741a = "";

    /* renamed from: b */
    protected C1746j f5742b;

    /* renamed from: c */
    protected String f5743c;

    /* renamed from: d */
    protected byte[] f5744d;

    public C1744h(String str, C1748l lVar) {
        if (str != null) {
            this.f5741a = str;
        }
        if (lVar != null) {
            String a = lVar.mo6996a();
            StringBuilder sb = new StringBuilder();
            sb.append(this.f5741a);
            sb.append("?");
            sb.append(a);
            this.f5741a = sb.toString();
        }
    }

    /* renamed from: a */
    public String mo6983a() {
        return this.f5741a;
    }

    /* renamed from: b */
    public C1746j mo6984b() {
        return this.f5742b;
    }

    /* renamed from: c */
    public String mo6985c() {
        return this.f5743c;
    }

    /* renamed from: d */
    public byte[] mo6986d() {
        return this.f5744d;
    }
}
