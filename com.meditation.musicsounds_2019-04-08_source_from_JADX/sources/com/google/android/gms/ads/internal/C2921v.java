package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.C3643iy;
import com.google.android.gms.internal.ads.arx;

/* renamed from: com.google.android.gms.ads.internal.v */
final class C2921v implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ arx f10105a;

    /* renamed from: b */
    private final /* synthetic */ zzbc f10106b;

    C2921v(zzbc zzbc, arx arx) {
        this.f10106b = zzbc;
        this.f10105a = arx;
    }

    public final void run() {
        try {
            if (this.f10106b.f10120e.f10264k != null) {
                this.f10106b.f10120e.f10264k.mo12516a(this.f10105a);
                this.f10106b.mo10211a(this.f10105a.mo12423n());
            }
        } catch (RemoteException e) {
            C3643iy.m19177d("#007 Could not call remote method.", e);
        }
    }
}
