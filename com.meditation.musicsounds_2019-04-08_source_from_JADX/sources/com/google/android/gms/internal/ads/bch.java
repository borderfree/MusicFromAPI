package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.AdRequest.ErrorCode;

final class bch implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ ErrorCode f13570a;

    /* renamed from: b */
    private final /* synthetic */ bbw f13571b;

    bch(bbw bbw, ErrorCode errorCode) {
        this.f13571b = bbw;
        this.f13570a = errorCode;
    }

    public final void run() {
        try {
            this.f13571b.f13554a.mo12659a(bcj.m18135a(this.f13570a));
        } catch (RemoteException e) {
            C3731me.m19177d("#007 Could not call remote method.", e);
        }
    }
}
