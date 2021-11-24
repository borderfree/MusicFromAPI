package com.google.android.gms.internal.ads;

public final class agw extends ahl {

    /* renamed from: d */
    private static volatile Long f12009d;

    /* renamed from: e */
    private static final Object f12010e = new Object();

    public agw(aga aga, String str, String str2, C4110yz yzVar, int i, int i2) {
        super(aga, str, str2, yzVar, i, 22);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11906a() {
        if (f12009d == null) {
            synchronized (f12010e) {
                if (f12009d == null) {
                    f12009d = (Long) this.f12043c.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.f12042b) {
            this.f12042b.f15146l = f12009d;
        }
    }
}
