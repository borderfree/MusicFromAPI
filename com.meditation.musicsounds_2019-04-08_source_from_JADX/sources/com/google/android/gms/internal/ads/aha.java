package com.google.android.gms.internal.ads;

import java.util.List;

public final class aha extends ahl {

    /* renamed from: d */
    private List<Long> f12022d = null;

    public aha(aga aga, String str, String str2, C4110yz yzVar, int i, int i2) {
        super(aga, str, str2, yzVar, i, 31);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11906a() {
        this.f12042b.f15150p = Long.valueOf(-1);
        this.f12042b.f15151q = Long.valueOf(-1);
        if (this.f12022d == null) {
            this.f12022d = (List) this.f12043c.invoke(null, new Object[]{this.f12041a.mo11866a()});
        }
        if (this.f12022d != null && this.f12022d.size() == 2) {
            synchronized (this.f12042b) {
                this.f12042b.f15150p = Long.valueOf(((Long) this.f12022d.get(0)).longValue());
                this.f12042b.f15151q = Long.valueOf(((Long) this.f12022d.get(1)).longValue());
            }
        }
    }
}
