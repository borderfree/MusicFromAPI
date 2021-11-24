package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.C3643iy;
import com.google.android.gms.internal.ads.arx;

/* renamed from: com.google.android.gms.ads.internal.ar */
final class C2869ar implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ arx f9959a;

    /* renamed from: b */
    private final /* synthetic */ zzq f9960b;

    C2869ar(zzq zzq, arx arx) {
        this.f9960b = zzq;
        this.f9959a = arx;
    }

    public final void run() {
        try {
            if (this.f9960b.f10120e.f10264k != null) {
                this.f9960b.f10120e.f10264k.mo12516a(this.f9959a);
                this.f9960b.mo10290a(this.f9959a.mo12423n());
            }
        } catch (RemoteException e) {
            C3643iy.m19177d("#007 Could not call remote method.", e);
        }
    }
}
