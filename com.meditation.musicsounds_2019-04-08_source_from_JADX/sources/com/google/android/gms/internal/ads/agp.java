package com.google.android.gms.internal.ads;

public final class agp extends ahl {

    /* renamed from: d */
    private static volatile String f11999d;

    /* renamed from: e */
    private static final Object f12000e = new Object();

    public agp(aga aga, String str, String str2, C4110yz yzVar, int i, int i2) {
        super(aga, str, str2, yzVar, i, 29);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11906a() {
        this.f12042b.f15149o = "E";
        if (f11999d == null) {
            synchronized (f12000e) {
                if (f11999d == null) {
                    f11999d = (String) this.f12043c.invoke(null, new Object[]{this.f12041a.mo11866a()});
                }
            }
        }
        synchronized (this.f12042b) {
            this.f12042b.f15149o = ael.m16070a(f11999d.getBytes(), true);
        }
    }
}
