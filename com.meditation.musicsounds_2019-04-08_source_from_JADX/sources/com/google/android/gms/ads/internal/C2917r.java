package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.C3622id;
import com.google.android.gms.internal.ads.C3623ie;

/* renamed from: com.google.android.gms.ads.internal.r */
final class C2917r implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C3623ie f10092a;

    /* renamed from: b */
    private final /* synthetic */ zzbc f10093b;

    C2917r(zzbc zzbc, C3623ie ieVar) {
        this.f10093b = zzbc;
        this.f10092a = ieVar;
    }

    public final void run() {
        zzbc zzbc = this.f10093b;
        C3622id idVar = new C3622id(this.f10092a, null, null, null, null, null, null, null);
        zzbc.zzb(idVar);
    }
}
