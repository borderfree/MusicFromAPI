package com.google.android.gms.internal.ads;

public final class ahb extends ahl {

    /* renamed from: d */
    private final boolean f12023d;

    public ahb(aga aga, String str, String str2, C4110yz yzVar, int i, int i2) {
        super(aga, str, str2, yzVar, i, 61);
        this.f12023d = aga.mo11879j();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11906a() {
        long longValue = ((Long) this.f12043c.invoke(null, new Object[]{this.f12041a.mo11866a(), Boolean.valueOf(this.f12023d)})).longValue();
        synchronized (this.f12042b) {
            this.f12042b.f15107P = Long.valueOf(longValue);
        }
    }
}
