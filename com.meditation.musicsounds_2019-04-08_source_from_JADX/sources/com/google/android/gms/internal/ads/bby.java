package com.google.android.gms.internal.ads;

import android.os.RemoteException;

final class bby implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ bbw f13556a;

    bby(bbw bbw) {
        this.f13556a = bbw;
    }

    public final void run() {
        try {
            this.f13556a.f13554a.mo12668d();
        } catch (RemoteException e) {
            C3731me.m19177d("#007 Could not call remote method.", e);
        }
    }
}
