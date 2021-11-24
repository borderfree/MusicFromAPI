package com.google.android.gms.internal.ads;

public final class ahf extends ahl {

    /* renamed from: d */
    private final agk f12027d;

    /* renamed from: e */
    private long f12028e;

    public ahf(aga aga, String str, String str2, C4110yz yzVar, int i, int i2, agk agk) {
        super(aga, str, str2, yzVar, i, 53);
        this.f12027d = agk;
        if (agk != null) {
            this.f12028e = agk.mo11891a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11906a() {
        if (this.f12027d != null) {
            this.f12042b.f15100I = (Long) this.f12043c.invoke(null, new Object[]{Long.valueOf(this.f12028e)});
        }
    }
}
