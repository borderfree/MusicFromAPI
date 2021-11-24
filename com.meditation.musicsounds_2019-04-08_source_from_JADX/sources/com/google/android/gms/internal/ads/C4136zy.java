package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.zy */
final class C4136zy {

    /* renamed from: a */
    private final Object f15226a;

    /* renamed from: b */
    private final int f15227b;

    C4136zy(Object obj, int i) {
        this.f15226a = obj;
        this.f15227b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4136zy)) {
            return false;
        }
        C4136zy zyVar = (C4136zy) obj;
        return this.f15226a == zyVar.f15226a && this.f15227b == zyVar.f15227b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f15226a) * 65535) + this.f15227b;
    }
}
