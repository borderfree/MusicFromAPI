package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.do */
public abstract class C3497do extends ahn implements C3496dn {
    public C3497do() {
        super("com.google.android.gms.ads.internal.request.IAdResponseListener");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        mo12854a((zzaej) aho.m16238a(parcel, zzaej.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
