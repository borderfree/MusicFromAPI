package com.google.android.gms.internal.ads;

public final class ahh extends ahl {
    public ahh(aga aga, String str, String str2, C4110yz yzVar, int i, int i2) {
        super(aga, str, str2, yzVar, i, 48);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11906a() {
        C4110yz yzVar;
        Integer valueOf;
        this.f12042b.f15096E = Integer.valueOf(2);
        boolean booleanValue = ((Boolean) this.f12043c.invoke(null, new Object[]{this.f12041a.mo11866a()})).booleanValue();
        synchronized (this.f12042b) {
            if (booleanValue) {
                try {
                    yzVar = this.f12042b;
                    valueOf = Integer.valueOf(1);
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                yzVar = this.f12042b;
                valueOf = Integer.valueOf(0);
            }
            yzVar.f15096E = valueOf;
        }
    }
}
