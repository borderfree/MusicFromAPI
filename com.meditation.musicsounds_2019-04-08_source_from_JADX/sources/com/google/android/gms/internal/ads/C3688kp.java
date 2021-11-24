package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.C3261q;

/* renamed from: com.google.android.gms.internal.ads.kp */
public final class C3688kp {

    /* renamed from: a */
    public final String f14343a;

    /* renamed from: b */
    public final double f14344b;

    /* renamed from: c */
    public final int f14345c;

    /* renamed from: d */
    private final double f14346d;

    /* renamed from: e */
    private final double f14347e;

    public C3688kp(String str, double d, double d2, double d3, int i) {
        this.f14343a = str;
        this.f14347e = d;
        this.f14346d = d2;
        this.f14344b = d3;
        this.f14345c = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3688kp)) {
            return false;
        }
        C3688kp kpVar = (C3688kp) obj;
        return C3261q.m14906a(this.f14343a, kpVar.f14343a) && this.f14346d == kpVar.f14346d && this.f14347e == kpVar.f14347e && this.f14345c == kpVar.f14345c && Double.compare(this.f14344b, kpVar.f14344b) == 0;
    }

    public final int hashCode() {
        return C3261q.m14904a(this.f14343a, Double.valueOf(this.f14346d), Double.valueOf(this.f14347e), Double.valueOf(this.f14344b), Integer.valueOf(this.f14345c));
    }

    public final String toString() {
        return C3261q.m14905a((Object) this).mo11288a("name", this.f14343a).mo11288a("minBound", Double.valueOf(this.f14347e)).mo11288a("maxBound", Double.valueOf(this.f14346d)).mo11288a("percent", Double.valueOf(this.f14344b)).mo11288a("count", Integer.valueOf(this.f14345c)).toString();
    }
}
