package com.google.android.gms.internal.ads;

import android.os.RemoteException;

final class bcy implements C3896sh<C3897si, Object> {

    /* renamed from: a */
    private final /* synthetic */ bco f13579a;

    /* renamed from: b */
    private final /* synthetic */ bay f13580b;

    /* renamed from: c */
    private final /* synthetic */ bcw f13581c;

    bcy(bcw bcw, bco bco, bay bay) {
        this.f13581c = bcw;
        this.f13579a = bco;
        this.f13580b = bay;
    }

    /* renamed from: a */
    public final void mo12801a(String str) {
        try {
            this.f13579a.mo12793a(str);
        } catch (RemoteException e) {
            C3731me.m19173b("", e);
        }
    }
}
