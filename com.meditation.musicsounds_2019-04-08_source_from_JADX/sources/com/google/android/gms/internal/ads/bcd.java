package com.google.android.gms.internal.ads;

import android.os.RemoteException;

final class bcd implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ bbw f13567a;

    bcd(bbw bbw) {
        this.f13567a = bbw;
    }

    public final void run() {
        try {
            this.f13567a.f13554a.mo12668d();
        } catch (RemoteException e) {
            C3731me.m19177d("#007 Could not call remote method.", e);
        }
    }
}
