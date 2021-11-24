package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.C3643iy;
import com.google.android.gms.internal.ads.ars;

/* renamed from: com.google.android.gms.ads.internal.at */
final class C2871at implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ ars f9963a;

    /* renamed from: b */
    private final /* synthetic */ zzq f9964b;

    C2871at(zzq zzq, ars ars) {
        this.f9964b = zzq;
        this.f9963a = ars;
    }

    public final void run() {
        try {
            if (this.f9964b.f10120e.f10263j != null) {
                this.f9964b.f10120e.f10263j.mo12487a(this.f9963a);
                this.f9964b.mo10290a(this.f9963a.mo12392j());
            }
        } catch (RemoteException e) {
            C3643iy.m19177d("#007 Could not call remote method.", e);
        }
    }
}
