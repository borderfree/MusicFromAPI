package com.google.android.gms.internal.ads;

import android.os.RemoteException;

final class bcf implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ bbw f13569a;

    bcf(bbw bbw) {
        this.f13569a = bbw;
    }

    public final void run() {
        try {
            this.f13569a.f13554a.mo12666b();
        } catch (RemoteException e) {
            C3731me.m19177d("#007 Could not call remote method.", e);
        }
    }
}
