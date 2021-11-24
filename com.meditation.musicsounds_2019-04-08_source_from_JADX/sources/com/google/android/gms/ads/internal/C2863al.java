package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.C3622id;
import com.google.android.gms.internal.ads.C3623ie;

/* renamed from: com.google.android.gms.ads.internal.al */
final class C2863al implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C3623ie f9947a;

    /* renamed from: b */
    private final /* synthetic */ zzi f9948b;

    C2863al(zzi zzi, C3623ie ieVar) {
        this.f9948b = zzi;
        this.f9947a = ieVar;
    }

    public final void run() {
        zzi zzi = this.f9948b;
        C3622id idVar = new C3622id(this.f9947a, null, null, null, null, null, null, null);
        zzi.zzb(idVar);
    }
}
