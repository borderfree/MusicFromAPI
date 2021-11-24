package com.seattleclouds.api;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.seattleclouds.api.c */
public class C5269c {

    /* renamed from: a */
    private String f18883a;

    /* renamed from: b */
    private String f18884b;

    /* renamed from: c */
    private Map<String, String> f18885c;

    /* renamed from: d */
    private Map<String, String> f18886d;

    /* renamed from: e */
    private int f18887e = 30000;

    public C5269c(String str, String str2, Map<String, String> map, Map<String, String> map2) {
        this.f18883a = str;
        this.f18884b = str2;
        this.f18885c = map;
        this.f18886d = map2;
    }

    /* renamed from: a */
    public Map<String, String> mo17328a() {
        return this.f18885c;
    }

    /* renamed from: a */
    public void mo17329a(int i) {
        this.f18887e = i;
    }

    /* renamed from: a */
    public void mo17330a(String str, String str2) {
        if (this.f18886d == null) {
            this.f18886d = new HashMap();
        }
        this.f18886d.put(str, str2);
    }

    /* renamed from: b */
    public Map<String, String> mo17331b() {
        return this.f18886d;
    }

    /* renamed from: c */
    public String mo17332c() {
        return this.f18883a;
    }

    /* renamed from: d */
    public String mo17333d() {
        return this.f18884b;
    }

    /* renamed from: e */
    public int mo17334e() {
        return this.f18887e;
    }
}
