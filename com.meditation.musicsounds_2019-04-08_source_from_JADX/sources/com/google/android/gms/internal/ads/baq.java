package com.google.android.gms.internal.ads;

import android.os.RemoteException;

final class baq implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ baj f13514a;

    baq(bap bap, baj baj) {
        this.f13514a = baj;
    }

    public final void run() {
        try {
            this.f13514a.f13475c.mo12698c();
        } catch (RemoteException e) {
            C3643iy.m19175c("Could not destroy mediation adapter.", e);
        }
    }
}
