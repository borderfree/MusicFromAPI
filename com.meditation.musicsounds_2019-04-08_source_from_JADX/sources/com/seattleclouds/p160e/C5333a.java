package com.seattleclouds.p160e;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.seattleclouds.e.a */
public class C5333a {

    /* renamed from: a */
    private String f19113a;

    /* renamed from: b */
    private String f19114b;

    /* renamed from: c */
    private HashMap<String, Object> f19115c = new HashMap<>();

    /* renamed from: d */
    private Map<String, C5333a> f19116d = new HashMap();

    public C5333a(String str) {
        mo17529a(str);
    }

    /* renamed from: a */
    public String mo17528a() {
        return this.f19113a;
    }

    /* renamed from: a */
    public void mo17529a(String str) {
        this.f19113a = str;
    }

    /* renamed from: a */
    public void mo17530a(String str, int i) {
        this.f19115c.put(str, Integer.valueOf(i));
    }

    /* renamed from: a */
    public void mo17531a(String str, String str2) {
        this.f19115c.put(str, str2);
    }

    /* renamed from: a */
    public void mo17532a(HashMap<String, Object> hashMap) {
        this.f19115c = hashMap;
    }

    /* renamed from: a */
    public void mo17533a(Map<String, C5333a> map) {
        this.f19116d = map;
    }

    /* renamed from: b */
    public String mo17534b() {
        return this.f19114b;
    }

    /* renamed from: b */
    public void mo17535b(String str) {
        this.f19114b = str;
    }

    /* renamed from: c */
    public C5333a mo17536c(String str) {
        String str2 = (String) this.f19115c.get(str);
        if (this.f19116d != null) {
            return (C5333a) this.f19116d.get(str2);
        }
        return null;
    }

    /* renamed from: c */
    public Map<String, C5333a> mo17537c() {
        return this.f19116d;
    }

    /* renamed from: d */
    public Integer mo17538d(String str) {
        return (Integer) this.f19115c.get(str);
    }

    /* renamed from: d */
    public HashMap<String, Object> mo17539d() {
        return this.f19115c;
    }
}
