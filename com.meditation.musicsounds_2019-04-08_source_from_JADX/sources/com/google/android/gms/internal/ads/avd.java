package com.google.android.gms.internal.ads;

final class avd implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f13176a;

    /* renamed from: b */
    private final /* synthetic */ long f13177b;

    /* renamed from: c */
    private final /* synthetic */ auc f13178c;

    avd(auc auc, String str, long j) {
        this.f13178c = auc;
        this.f13176a = str;
        this.f13177b = j;
    }

    public final void run() {
        this.f13178c.f13151a.mo12869a(this.f13176a, this.f13177b);
        this.f13178c.f13151a.mo12868a(toString());
    }
}
