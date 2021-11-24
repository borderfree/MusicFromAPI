package com.google.android.gms.internal.ads;

import android.os.RemoteException;

final class bbx implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ bbw f13555a;

    bbx(bbw bbw) {
        this.f13555a = bbw;
    }

    public final void run() {
        try {
            this.f13555a.f13554a.mo12658a();
        } catch (RemoteException e) {
            C3731me.m19177d("#007 Could not call remote method.", e);
        }
    }
}
