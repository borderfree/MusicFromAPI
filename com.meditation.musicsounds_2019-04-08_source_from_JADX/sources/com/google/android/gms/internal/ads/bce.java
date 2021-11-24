package com.google.android.gms.internal.ads;

import android.os.RemoteException;

final class bce implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ bbw f13568a;

    bce(bbw bbw) {
        this.f13568a = bbw;
    }

    public final void run() {
        try {
            this.f13568a.f13554a.mo12669e();
        } catch (RemoteException e) {
            C3731me.m19177d("#007 Could not call remote method.", e);
        }
    }
}
