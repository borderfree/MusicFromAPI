package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.zzbv;

/* renamed from: com.google.android.gms.internal.ads.ek */
final class C3521ek implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ zzaef f13839a;

    /* renamed from: b */
    private final /* synthetic */ C3496dn f13840b;

    /* renamed from: c */
    private final /* synthetic */ C3519ei f13841c;

    C3521ek(C3519ei eiVar, zzaef zzaef, C3496dn dnVar) {
        this.f13841c = eiVar;
        this.f13839a = zzaef;
        this.f13840b = dnVar;
    }

    public final void run() {
        zzaej zzaej;
        try {
            zzaej = this.f13841c.mo12859a(this.f13839a);
        } catch (Exception e) {
            zzbv.zzeo().mo13047a((Throwable) e, "AdRequestServiceImpl.loadAdAsync");
            C3643iy.m19175c("Could not fetch ad response due to an Exception.", e);
            zzaej = null;
        }
        if (zzaej == null) {
            zzaej = new zzaej(0);
        }
        try {
            this.f13840b.mo12854a(zzaej);
        } catch (RemoteException e2) {
            C3643iy.m19175c("Fail to forward ad response.", e2);
        }
    }
}
