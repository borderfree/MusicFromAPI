package com.google.android.gms.internal.ads;

import android.os.RemoteException;

final class apo implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ apn f12583a;

    apo(apn apn) {
        this.f12583a = apn;
    }

    public final void run() {
        if (this.f12583a.f12582a != null) {
            try {
                this.f12583a.f12582a.mo12091a(1);
            } catch (RemoteException e) {
                C3731me.m19175c("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
