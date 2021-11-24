package com.google.android.gms.internal.ads;

import android.os.RemoteException;

final class apm implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ apl f12581a;

    apm(apl apl) {
        this.f12581a = apl;
    }

    public final void run() {
        if (this.f12581a.f12580a.f12579a != null) {
            try {
                this.f12581a.f12580a.f12579a.mo12091a(1);
            } catch (RemoteException e) {
                C3731me.m19175c("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
