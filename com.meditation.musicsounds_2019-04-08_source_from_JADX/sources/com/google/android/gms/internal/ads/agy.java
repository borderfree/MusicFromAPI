package com.google.android.gms.internal.ads;

public final class agy extends ahl {

    /* renamed from: d */
    private static volatile String f12012d;

    /* renamed from: e */
    private static final Object f12013e = new Object();

    public agy(aga aga, String str, String str2, C4110yz yzVar, int i, int i2) {
        super(aga, str, str2, yzVar, i, 1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11906a() {
        this.f12042b.f15116a = "E";
        if (f12012d == null) {
            synchronized (f12013e) {
                if (f12012d == null) {
                    f12012d = (String) this.f12043c.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.f12042b) {
            this.f12042b.f15116a = f12012d;
        }
    }
}
