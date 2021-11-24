package com.google.android.gms.internal.ads;

import android.os.RemoteException;

final class awu implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ awv f13233a;

    /* renamed from: b */
    private final /* synthetic */ aww f13234b;

    awu(avv avv, awv awv, aww aww) {
        this.f13233a = awv;
        this.f13234b = aww;
    }

    public final void run() {
        try {
            this.f13233a.mo12537a(this.f13234b);
        } catch (RemoteException e) {
            C3643iy.m19175c("Could not propagate interstitial ad event.", e);
        }
    }
}
