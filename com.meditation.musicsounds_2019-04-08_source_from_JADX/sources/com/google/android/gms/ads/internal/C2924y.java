package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.C3643iy;
import com.google.android.gms.internal.ads.atu;
import com.google.android.gms.internal.ads.aui;

/* renamed from: com.google.android.gms.ads.internal.y */
final class C2924y implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ atu f10112a;

    /* renamed from: b */
    private final /* synthetic */ zzbc f10113b;

    C2924y(zzbc zzbc, atu atu) {
        this.f10113b = zzbc;
        this.f10112a = atu;
    }

    public final void run() {
        try {
            ((aui) this.f10113b.f10120e.f10266m.get(this.f10112a.mo12372l())).mo12514a(this.f10112a);
        } catch (RemoteException e) {
            C3643iy.m19177d("#007 Could not call remote method.", e);
        }
    }
}
