package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.dynamic.C3327d;

/* renamed from: com.google.android.gms.internal.ads.gl */
final class C3576gl implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ bav f14031a;

    /* renamed from: b */
    private final /* synthetic */ zzjj f14032b;

    /* renamed from: c */
    private final /* synthetic */ C3582gr f14033c;

    /* renamed from: d */
    private final /* synthetic */ C3574gj f14034d;

    C3576gl(C3574gj gjVar, bav bav, zzjj zzjj, C3582gr grVar) {
        this.f14034d = gjVar;
        this.f14031a = bav;
        this.f14032b = zzjj;
        this.f14033c = grVar;
    }

    public final void run() {
        try {
            this.f14031a.mo12689a(C3327d.m15136a(this.f14034d.f14016c), this.f14032b, (String) null, (C3590gz) this.f14033c, this.f14034d.f14020g);
        } catch (RemoteException e) {
            String str = "Fail to initialize adapter ";
            String valueOf = String.valueOf(this.f14034d.f14014a);
            C3643iy.m19175c(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), e);
            this.f14034d.mo12939a(this.f14034d.f14014a, 0);
        }
    }
}
