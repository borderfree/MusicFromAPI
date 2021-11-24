package com.google.android.gms.internal.ads;

public final class ahd extends ahl {

    /* renamed from: d */
    private final StackTraceElement[] f12026d;

    public ahd(aga aga, String str, String str2, C4110yz yzVar, int i, int i2, StackTraceElement[] stackTraceElementArr) {
        super(aga, str, str2, yzVar, i, 45);
        this.f12026d = stackTraceElementArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11906a() {
        if (this.f12026d != null) {
            afy afy = new afy((String) this.f12043c.invoke(null, new Object[]{this.f12026d}));
            synchronized (this.f12042b) {
                this.f12042b.f15093B = afy.f11928a;
                if (afy.f11929b.booleanValue()) {
                    this.f12042b.f15101J = Integer.valueOf(afy.f11930c.booleanValue() ^ true ? 1 : 0);
                }
            }
        }
    }
}
