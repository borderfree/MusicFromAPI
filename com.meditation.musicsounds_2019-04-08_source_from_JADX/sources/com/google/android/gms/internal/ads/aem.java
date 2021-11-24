package com.google.android.gms.internal.ads;

import java.util.HashMap;

public final class aem extends aek<Integer, Object> {

    /* renamed from: a */
    public String f11643a;

    /* renamed from: b */
    public long f11644b;

    /* renamed from: c */
    public String f11645c;

    /* renamed from: d */
    public String f11646d;

    /* renamed from: e */
    public String f11647e;

    public aem() {
        this.f11643a = "E";
        this.f11644b = -1;
        this.f11645c = "E";
        this.f11646d = "E";
        this.f11647e = "E";
    }

    public aem(String str) {
        this();
        mo11837a(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final HashMap<Integer, Object> mo11836a() {
        HashMap<Integer, Object> hashMap = new HashMap<>();
        hashMap.put(Integer.valueOf(0), this.f11643a);
        hashMap.put(Integer.valueOf(4), this.f11647e);
        hashMap.put(Integer.valueOf(3), this.f11646d);
        hashMap.put(Integer.valueOf(2), this.f11645c);
        hashMap.put(Integer.valueOf(1), Long.valueOf(this.f11644b));
        return hashMap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11837a(String str) {
        HashMap b = m16067b(str);
        if (b != null) {
            this.f11643a = b.get(Integer.valueOf(0)) == null ? "E" : (String) b.get(Integer.valueOf(0));
            this.f11644b = b.get(Integer.valueOf(1)) == null ? -1 : ((Long) b.get(Integer.valueOf(1))).longValue();
            this.f11645c = b.get(Integer.valueOf(2)) == null ? "E" : (String) b.get(Integer.valueOf(2));
            this.f11646d = b.get(Integer.valueOf(3)) == null ? "E" : (String) b.get(Integer.valueOf(3));
            this.f11647e = b.get(Integer.valueOf(4)) == null ? "E" : (String) b.get(Integer.valueOf(4));
        }
    }
}
