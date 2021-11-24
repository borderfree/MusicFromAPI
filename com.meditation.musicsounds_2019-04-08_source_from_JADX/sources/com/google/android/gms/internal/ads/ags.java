package com.google.android.gms.internal.ads;

public final class ags extends ahl {

    /* renamed from: d */
    private static volatile Long f12004d;

    /* renamed from: e */
    private static final Object f12005e = new Object();

    public ags(aga aga, String str, String str2, C4110yz yzVar, int i, int i2) {
        super(aga, str, str2, yzVar, i, 44);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11906a() {
        if (f12004d == null) {
            synchronized (f12005e) {
                if (f12004d == null) {
                    f12004d = (Long) this.f12043c.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.f12042b) {
            this.f12042b.f15092A = f12004d;
        }
    }
}
