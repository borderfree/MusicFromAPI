package com.google.android.gms.internal.ads;

import android.os.RemoteException;

final class bca implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ bbw f13563a;

    bca(bbw bbw) {
        this.f13563a = bbw;
    }

    public final void run() {
        try {
            this.f13563a.f13554a.mo12666b();
        } catch (RemoteException e) {
            C3731me.m19177d("#007 Could not call remote method.", e);
        }
    }
}
