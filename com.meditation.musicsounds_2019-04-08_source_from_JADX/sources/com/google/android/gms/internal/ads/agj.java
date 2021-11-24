package com.google.android.gms.internal.ads;

import java.util.HashMap;

public final class agj extends aek<Integer, Long> {

    /* renamed from: a */
    public Long f11979a;

    /* renamed from: b */
    public Long f11980b;

    /* renamed from: c */
    public Long f11981c;

    public agj() {
    }

    public agj(String str) {
        mo11837a(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final HashMap<Integer, Long> mo11836a() {
        HashMap<Integer, Long> hashMap = new HashMap<>();
        hashMap.put(Integer.valueOf(0), this.f11979a);
        hashMap.put(Integer.valueOf(1), this.f11980b);
        hashMap.put(Integer.valueOf(2), this.f11981c);
        return hashMap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11837a(String str) {
        HashMap b = m16067b(str);
        if (b != null) {
            this.f11979a = (Long) b.get(Integer.valueOf(0));
            this.f11980b = (Long) b.get(Integer.valueOf(1));
            this.f11981c = (Long) b.get(Integer.valueOf(2));
        }
    }
}
