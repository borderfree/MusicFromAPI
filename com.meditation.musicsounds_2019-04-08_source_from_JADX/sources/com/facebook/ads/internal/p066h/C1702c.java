package com.facebook.ads.internal.p066h;

import java.util.Map;

/* renamed from: com.facebook.ads.internal.h.c */
public class C1702c {

    /* renamed from: a */
    private double f5607a;

    /* renamed from: b */
    private double f5608b;

    /* renamed from: c */
    private String f5609c;

    /* renamed from: d */
    private Map<String, String> f5610d;

    public C1702c(double d, String str, Map<String, String> map) {
        this.f5607a = d;
        this.f5609c = str;
        this.f5610d = map;
        double currentTimeMillis = (double) System.currentTimeMillis();
        Double.isNaN(currentTimeMillis);
        this.f5608b = currentTimeMillis / 1000.0d;
    }

    /* renamed from: a */
    public String mo6878a() {
        return "debug";
    }

    /* renamed from: b */
    public double mo6879b() {
        return this.f5608b;
    }

    /* renamed from: c */
    public double mo6880c() {
        return this.f5607a;
    }

    /* renamed from: d */
    public String mo6881d() {
        return this.f5609c;
    }

    /* renamed from: e */
    public Map<String, String> mo6882e() {
        return this.f5610d;
    }
}
