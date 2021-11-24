package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.measurement.internal.cw */
final class C4693cw implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C4684cn f16917a;

    /* renamed from: b */
    private final /* synthetic */ C4689cs f16918b;

    C4693cw(C4689cs csVar, C4684cn cnVar) {
        this.f16918b = csVar;
        this.f16917a = cnVar;
    }

    public final void run() {
        long j;
        String str;
        String str2;
        String packageName;
        C4758i d = this.f16918b.f16905b;
        if (d == null) {
            this.f16918b.mo15253r().mo15852u_().mo15858a("Failed to send current screen to service");
            return;
        }
        try {
            if (this.f16917a == null) {
                j = 0;
                str = null;
                str2 = null;
                packageName = this.f16918b.mo15249n().getPackageName();
            } else {
                j = this.f16917a.f16890c;
                str = this.f16917a.f16888a;
                str2 = this.f16917a.f16889b;
                packageName = this.f16918b.mo15249n().getPackageName();
            }
            d.mo15361a(j, str, str2, packageName);
            this.f16918b.m23260I();
        } catch (RemoteException e) {
            this.f16918b.mo15253r().mo15852u_().mo15859a("Failed to send current screen to the service", e);
        }
    }
}
