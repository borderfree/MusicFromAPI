package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzbv;

/* renamed from: com.google.android.gms.internal.ads.kt */
final class C3692kt implements C3735mi<Throwable, T> {

    /* renamed from: a */
    private final /* synthetic */ C3696kx f14354a;

    C3692kt(C3690kr krVar, C3696kx kxVar) {
        this.f14354a = kxVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C3751my mo10012a(Object obj) {
        Throwable th = (Throwable) obj;
        C3643iy.m19173b("Error occurred while dispatching http response in getter.", th);
        zzbv.zzeo().mo13047a(th, "HttpGetter.deliverResponse.1");
        return C3740mn.m19191a(this.f14354a.mo12781a());
    }
}
