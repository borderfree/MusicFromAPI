package com.google.android.gms.internal.ads;

import android.os.RemoteException;

final class bcc implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ bbw f13566a;

    bcc(bbw bbw) {
        this.f13566a = bbw;
    }

    public final void run() {
        try {
            this.f13566a.f13554a.mo12667c();
        } catch (RemoteException e) {
            C3731me.m19177d("#007 Could not call remote method.", e);
        }
    }
}
