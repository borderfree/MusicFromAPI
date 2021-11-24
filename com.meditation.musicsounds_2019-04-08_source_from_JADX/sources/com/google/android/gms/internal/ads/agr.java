package com.google.android.gms.internal.ads;

public final class agr extends ahl {
    public agr(aga aga, String str, String str2, C4110yz yzVar, int i, int i2) {
        super(aga, str, str2, yzVar, i, 5);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11906a() {
        this.f12042b.f15138d = Long.valueOf(-1);
        this.f12042b.f15139e = Long.valueOf(-1);
        int[] iArr = (int[]) this.f12043c.invoke(null, new Object[]{this.f12041a.mo11866a()});
        synchronized (this.f12042b) {
            this.f12042b.f15138d = Long.valueOf((long) iArr[0]);
            this.f12042b.f15139e = Long.valueOf((long) iArr[1]);
            if (iArr[2] != Integer.MIN_VALUE) {
                this.f12042b.f15105N = Long.valueOf((long) iArr[2]);
            }
        }
    }
}
