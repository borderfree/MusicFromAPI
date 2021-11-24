package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.measurement.internal.cv */
final class C4692cv implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ zzk f16915a;

    /* renamed from: b */
    private final /* synthetic */ C4689cs f16916b;

    C4692cv(C4689cs csVar, zzk zzk) {
        this.f16916b = csVar;
        this.f16915a = zzk;
    }

    public final void run() {
        C4758i d = this.f16916b.f16905b;
        if (d == null) {
            this.f16916b.mo15253r().mo15852u_().mo15858a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            d.mo15365a(this.f16915a);
            this.f16916b.mo15459a(d, null, this.f16915a);
            this.f16916b.m23260I();
        } catch (RemoteException e) {
            this.f16916b.mo15253r().mo15852u_().mo15859a("Failed to send app launch to the service", e);
        }
    }
}
