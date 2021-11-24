package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.C3643iy;
import com.google.android.gms.internal.ads.arq;

/* renamed from: com.google.android.gms.ads.internal.u */
final class C2920u implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ arq f10103a;

    /* renamed from: b */
    private final /* synthetic */ zzbc f10104b;

    C2920u(zzbc zzbc, arq arq) {
        this.f10104b = zzbc;
        this.f10103a = arq;
    }

    public final void run() {
        try {
            if (this.f10104b.f10120e.f10262i != null) {
                this.f10104b.f10120e.f10262i.mo12486a(this.f10103a);
                this.f10104b.mo10211a(this.f10103a.mo12370j());
            }
        } catch (RemoteException e) {
            C3643iy.m19177d("#007 Could not call remote method.", e);
        }
    }
}
