package com.google.android.gms.internal.ads;

import android.os.RemoteException;

final /* synthetic */ class avr implements Runnable {

    /* renamed from: a */
    private final avq f13194a;

    /* renamed from: b */
    private final avj f13195b;

    /* renamed from: c */
    private final C3763nj f13196c;

    /* renamed from: d */
    private final zzsg f13197d;

    avr(avq avq, avj avj, C3763nj njVar, zzsg zzsg) {
        this.f13194a = avq;
        this.f13195b = avj;
        this.f13196c = njVar;
        this.f13197d = zzsg;
    }

    public final void run() {
        avq avq = this.f13194a;
        avj avj = this.f13195b;
        C3763nj njVar = this.f13196c;
        try {
            njVar.mo13296b(avj.mo10737e().mo12528a(this.f13197d));
        } catch (RemoteException e) {
            C3643iy.m19173b("Unable to obtain a cache service instance.", e);
            njVar.mo13295a(e);
            avq.f13191a.m17475a();
        }
    }
}
