package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.C3622id;
import com.google.android.gms.internal.ads.C3643iy;
import com.google.android.gms.internal.ads.aru;
import com.google.android.gms.internal.ads.aui;

/* renamed from: com.google.android.gms.ads.internal.x */
final class C2923x implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f10109a;

    /* renamed from: b */
    private final /* synthetic */ C3622id f10110b;

    /* renamed from: c */
    private final /* synthetic */ zzbc f10111c;

    C2923x(zzbc zzbc, String str, C3622id idVar) {
        this.f10111c = zzbc;
        this.f10109a = str;
        this.f10110b = idVar;
    }

    public final void run() {
        try {
            ((aui) this.f10111c.f10120e.f10266m.get(this.f10109a)).mo12514a((aru) this.f10110b.f14117C);
        } catch (RemoteException e) {
            C3643iy.m19177d("#007 Could not call remote method.", e);
        }
    }
}
