package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.C3643iy;
import com.google.android.gms.internal.ads.ars;

/* renamed from: com.google.android.gms.ads.internal.w */
final class C2922w implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ ars f10107a;

    /* renamed from: b */
    private final /* synthetic */ zzbc f10108b;

    C2922w(zzbc zzbc, ars ars) {
        this.f10108b = zzbc;
        this.f10107a = ars;
    }

    public final void run() {
        try {
            if (this.f10108b.f10120e.f10263j != null) {
                this.f10108b.f10120e.f10263j.mo12487a(this.f10107a);
                this.f10108b.mo10211a(this.f10107a.mo12392j());
            }
        } catch (RemoteException e) {
            C3643iy.m19177d("#007 Could not call remote method.", e);
        }
    }
}
