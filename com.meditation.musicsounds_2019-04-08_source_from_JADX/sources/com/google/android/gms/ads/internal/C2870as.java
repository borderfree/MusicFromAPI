package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.C3643iy;
import com.google.android.gms.internal.ads.arq;

/* renamed from: com.google.android.gms.ads.internal.as */
final class C2870as implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ arq f9961a;

    /* renamed from: b */
    private final /* synthetic */ zzq f9962b;

    C2870as(zzq zzq, arq arq) {
        this.f9962b = zzq;
        this.f9961a = arq;
    }

    public final void run() {
        try {
            if (this.f9962b.f10120e.f10262i != null) {
                this.f9962b.f10120e.f10262i.mo12486a(this.f9961a);
                this.f9962b.mo10290a(this.f9961a.mo12370j());
            }
        } catch (RemoteException e) {
            C3643iy.m19177d("#007 Could not call remote method.", e);
        }
    }
}
