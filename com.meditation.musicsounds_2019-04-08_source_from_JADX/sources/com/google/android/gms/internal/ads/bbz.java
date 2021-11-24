package com.google.android.gms.internal.ads;

import android.os.RemoteException;

final class bbz implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ bbw f13557a;

    bbz(bbw bbw) {
        this.f13557a = bbw;
    }

    public final void run() {
        try {
            this.f13557a.f13554a.mo12669e();
        } catch (RemoteException e) {
            C3731me.m19177d("#007 Could not call remote method.", e);
        }
    }
}
