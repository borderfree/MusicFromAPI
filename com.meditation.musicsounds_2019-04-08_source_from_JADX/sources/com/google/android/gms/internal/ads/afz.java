package com.google.android.gms.internal.ads;

import java.util.HashMap;

public final class afz extends aek<Integer, Long> {

    /* renamed from: a */
    public Long f11931a;

    /* renamed from: b */
    public Long f11932b;

    public afz() {
    }

    public afz(String str) {
        mo11837a(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final HashMap<Integer, Long> mo11836a() {
        HashMap<Integer, Long> hashMap = new HashMap<>();
        hashMap.put(Integer.valueOf(0), this.f11931a);
        hashMap.put(Integer.valueOf(1), this.f11932b);
        return hashMap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11837a(String str) {
        HashMap b = m16067b(str);
        if (b != null) {
            this.f11931a = (Long) b.get(Integer.valueOf(0));
            this.f11932b = (Long) b.get(Integer.valueOf(1));
        }
    }
}
