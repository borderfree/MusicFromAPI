package com.seattleclouds.modules.dynamiclist;

/* renamed from: com.seattleclouds.modules.dynamiclist.d */
public class C5573d {

    /* renamed from: a */
    private String f19851a;

    /* renamed from: b */
    private int f19852b;

    /* renamed from: c */
    private String f19853c;

    /* renamed from: d */
    private String f19854d;

    /* renamed from: e */
    private String f19855e;

    /* renamed from: f */
    private int f19856f;

    /* renamed from: g */
    private String f19857g;

    /* renamed from: h */
    private String f19858h;

    /* renamed from: i */
    private String f19859i;

    /* renamed from: j */
    private int f19860j = 2;

    /* renamed from: a */
    public int mo18033a() {
        return this.f19852b;
    }

    /* renamed from: a */
    public C5573d mo18034a(int i) {
        this.f19852b = i;
        return this;
    }

    /* renamed from: a */
    public C5573d mo18035a(String str) {
        this.f19851a = str;
        return this;
    }

    /* renamed from: b */
    public C5573d mo18036b(int i) {
        this.f19856f = i;
        return this;
    }

    /* renamed from: b */
    public C5573d mo18037b(String str) {
        this.f19853c = str;
        return this;
    }

    /* renamed from: b */
    public String mo18038b() {
        return this.f19853c;
    }

    /* renamed from: c */
    public C5573d mo18039c(int i) {
        this.f19860j = i;
        return this;
    }

    /* renamed from: c */
    public C5573d mo18040c(String str) {
        this.f19854d = str;
        return this;
    }

    /* renamed from: c */
    public String mo18041c() {
        return this.f19854d;
    }

    /* renamed from: d */
    public C5573d mo18042d(String str) {
        this.f19855e = str;
        return this;
    }

    /* renamed from: d */
    public String mo18043d() {
        return this.f19855e;
    }

    /* renamed from: e */
    public C5573d mo18044e(String str) {
        this.f19857g = str;
        return this;
    }

    /* renamed from: e */
    public String mo18045e() {
        return this.f19857g;
    }

    /* renamed from: f */
    public C5573d mo18046f(String str) {
        this.f19858h = str;
        return this;
    }

    /* renamed from: f */
    public String mo18047f() {
        return this.f19858h;
    }

    /* renamed from: g */
    public C5573d mo18048g(String str) {
        this.f19859i = str;
        return this;
    }

    /* renamed from: g */
    public String mo18049g() {
        return this.f19859i;
    }

    /* renamed from: h */
    public int mo18050h() {
        return this.f19860j;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DynamicListItem [section=");
        sb.append(this.f19851a);
        sb.append(", style=");
        sb.append(this.f19853c);
        sb.append(", text=");
        sb.append(this.f19854d);
        sb.append(", detailText=");
        sb.append(this.f19855e);
        sb.append(", detailTextLines=");
        sb.append(this.f19856f);
        sb.append(", action=");
        sb.append(this.f19857g);
        sb.append(", actionParam=");
        sb.append(this.f19858h);
        sb.append(", type=");
        sb.append(this.f19860j);
        sb.append("]");
        return sb.toString();
    }
}
