package com.google.android.gms.internal.ads;

import android.os.RemoteException;

final class bcx implements C3896sh<Object, Object> {

    /* renamed from: a */
    private final /* synthetic */ bcm f13577a;

    /* renamed from: b */
    private final /* synthetic */ bay f13578b;

    bcx(bcw bcw, bcm bcm, bay bay) {
        this.f13577a = bcm;
        this.f13578b = bay;
    }

    /* renamed from: a */
    public final void mo12801a(String str) {
        try {
            this.f13577a.mo12792a(str);
        } catch (RemoteException e) {
            C3731me.m19173b("", e);
        }
    }
}
