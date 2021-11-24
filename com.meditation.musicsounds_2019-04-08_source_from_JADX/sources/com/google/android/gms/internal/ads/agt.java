package com.google.android.gms.internal.ads;

public final class agt extends ahl {

    /* renamed from: d */
    private long f12006d;

    public agt(aga aga, String str, String str2, C4110yz yzVar, long j, int i, int i2) {
        super(aga, str, str2, yzVar, i, 25);
        this.f12006d = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11906a() {
        long longValue = ((Long) this.f12043c.invoke(null, new Object[0])).longValue();
        synchronized (this.f12042b) {
            this.f12042b.f15114W = Long.valueOf(longValue);
            if (this.f12006d != 0) {
                this.f12042b.f15144j = Long.valueOf(longValue - this.f12006d);
                this.f12042b.f15147m = Long.valueOf(this.f12006d);
            }
        }
    }
}
