package com.google.android.gms.internal.ads;

import java.util.HashMap;

public final class afy extends aek<Integer, Object> {

    /* renamed from: a */
    public Long f11928a;

    /* renamed from: b */
    public Boolean f11929b;

    /* renamed from: c */
    public Boolean f11930c;

    public afy() {
    }

    public afy(String str) {
        mo11837a(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final HashMap<Integer, Object> mo11836a() {
        HashMap<Integer, Object> hashMap = new HashMap<>();
        hashMap.put(Integer.valueOf(0), this.f11928a);
        hashMap.put(Integer.valueOf(1), this.f11929b);
        hashMap.put(Integer.valueOf(2), this.f11930c);
        return hashMap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11837a(String str) {
        HashMap b = m16067b(str);
        if (b != null) {
            this.f11928a = (Long) b.get(Integer.valueOf(0));
            this.f11929b = (Boolean) b.get(Integer.valueOf(1));
            this.f11930c = (Boolean) b.get(Integer.valueOf(2));
        }
    }
}
