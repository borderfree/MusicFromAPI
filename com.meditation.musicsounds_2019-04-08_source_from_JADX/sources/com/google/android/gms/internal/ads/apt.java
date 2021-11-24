package com.google.android.gms.internal.ads;

import android.os.RemoteException;

final class apt implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ aps f12585a;

    apt(aps aps) {
        this.f12585a = aps;
    }

    public final void run() {
        if (this.f12585a.f12584a != null) {
            try {
                this.f12585a.f12584a.mo12547a(1);
            } catch (RemoteException e) {
                C3731me.m19175c("Could not notify onRewardedVideoAdFailedToLoad event.", e);
            }
        }
    }
}
