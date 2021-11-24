package com.google.android.gms.internal.ads;

import android.os.RemoteException;

final class bci implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ bbw f13572a;

    bci(bbw bbw) {
        this.f13572a = bbw;
    }

    public final void run() {
        try {
            this.f13572a.f13554a.mo12667c();
        } catch (RemoteException e) {
            C3731me.m19177d("#007 Could not call remote method.", e);
        }
    }
}
