package com.google.android.gms.internal.ads;

import java.util.HashMap;

public final class afo extends aek<Integer, Long> {

    /* renamed from: a */
    public long f11914a;

    /* renamed from: b */
    public long f11915b;

    public afo() {
        this.f11914a = -1;
        this.f11915b = -1;
    }

    public afo(String str) {
        this();
        mo11837a(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final HashMap<Integer, Long> mo11836a() {
        HashMap<Integer, Long> hashMap = new HashMap<>();
        hashMap.put(Integer.valueOf(0), Long.valueOf(this.f11914a));
        hashMap.put(Integer.valueOf(1), Long.valueOf(this.f11915b));
        return hashMap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11837a(String str) {
        HashMap b = m16067b(str);
        if (b != null) {
            this.f11914a = ((Long) b.get(Integer.valueOf(0))).longValue();
            this.f11915b = ((Long) b.get(Integer.valueOf(1))).longValue();
        }
    }
}
