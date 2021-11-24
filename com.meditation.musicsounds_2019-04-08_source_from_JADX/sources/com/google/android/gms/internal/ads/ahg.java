package com.google.android.gms.internal.ads;

public final class ahg extends ahl {

    /* renamed from: d */
    private static volatile Long f12029d;

    /* renamed from: e */
    private static final Object f12030e = new Object();

    public ahg(aga aga, String str, String str2, C4110yz yzVar, int i, int i2) {
        super(aga, str, str2, yzVar, i, 33);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11906a() {
        if (f12029d == null) {
            synchronized (f12030e) {
                if (f12029d == null) {
                    f12029d = (Long) this.f12043c.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.f12042b) {
            this.f12042b.f15152r = f12029d;
        }
    }
}
