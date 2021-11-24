package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.measurement.internal.cy */
final class C4695cy implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ zzk f16920a;

    /* renamed from: b */
    private final /* synthetic */ C4689cs f16921b;

    C4695cy(C4689cs csVar, zzk zzk) {
        this.f16921b = csVar;
        this.f16920a = zzk;
    }

    public final void run() {
        C4758i d = this.f16921b.f16905b;
        if (d == null) {
            this.f16921b.mo15253r().mo15852u_().mo15858a("Failed to send measurementEnabled to service");
            return;
        }
        try {
            d.mo15370b(this.f16920a);
            this.f16921b.m23260I();
        } catch (RemoteException e) {
            this.f16921b.mo15253r().mo15852u_().mo15859a("Failed to send measurementEnabled to the service", e);
        }
    }
}
