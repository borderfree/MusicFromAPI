package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.C3643iy;
import com.google.android.gms.internal.ads.atu;
import com.google.android.gms.internal.ads.aui;

/* renamed from: com.google.android.gms.ads.internal.au */
final class C2872au implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ atu f9965a;

    /* renamed from: b */
    private final /* synthetic */ zzq f9966b;

    C2872au(zzq zzq, atu atu) {
        this.f9966b = zzq;
        this.f9965a = atu;
    }

    public final void run() {
        try {
            ((aui) this.f9966b.f10120e.f10266m.get(this.f9965a.mo12372l())).mo12514a(this.f9965a);
        } catch (RemoteException e) {
            C3643iy.m19177d("#007 Could not call remote method.", e);
        }
    }
}
