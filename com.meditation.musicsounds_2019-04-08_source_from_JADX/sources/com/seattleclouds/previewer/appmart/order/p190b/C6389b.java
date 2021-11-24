package com.seattleclouds.previewer.appmart.order.p190b;

/* renamed from: com.seattleclouds.previewer.appmart.order.b.b */
public class C6389b {

    /* renamed from: a */
    private String f22734a = this.f22734a;

    /* renamed from: b */
    private String f22735b;

    /* renamed from: c */
    private int f22736c;

    /* renamed from: d */
    private String f22737d;

    /* renamed from: a */
    public String mo19943a() {
        return this.f22734a;
    }

    /* renamed from: a */
    public void mo19944a(int i) {
        this.f22736c = i;
    }

    /* renamed from: a */
    public void mo19945a(String str) {
        this.f22734a = str;
    }

    /* renamed from: b */
    public String mo19946b() {
        return this.f22735b;
    }

    /* renamed from: b */
    public void mo19947b(String str) {
        this.f22735b = str;
    }

    /* renamed from: c */
    public String mo19948c() {
        StringBuilder sb = new StringBuilder();
        sb.append(" $ ");
        sb.append(this.f22736c);
        return sb.toString();
    }

    /* renamed from: c */
    public void mo19949c(String str) {
        this.f22737d = str;
    }

    /* renamed from: d */
    public String mo19950d() {
        return this.f22737d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f22734a);
        sb.append(" $");
        sb.append(this.f22736c);
        return sb.toString();
    }
}
