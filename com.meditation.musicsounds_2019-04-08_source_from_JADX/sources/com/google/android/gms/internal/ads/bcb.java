package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.AdRequest.ErrorCode;

final class bcb implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ ErrorCode f13564a;

    /* renamed from: b */
    private final /* synthetic */ bbw f13565b;

    bcb(bbw bbw, ErrorCode errorCode) {
        this.f13565b = bbw;
        this.f13564a = errorCode;
    }

    public final void run() {
        try {
            this.f13565b.f13554a.mo12659a(bcj.m18135a(this.f13564a));
        } catch (RemoteException e) {
            C3731me.m19177d("#007 Could not call remote method.", e);
        }
    }
}
