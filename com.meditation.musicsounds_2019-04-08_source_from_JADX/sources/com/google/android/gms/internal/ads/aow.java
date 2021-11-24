package com.google.android.gms.internal.ads;

import android.os.Parcel;

public abstract class aow extends ahn implements aov {
    public aow() {
        super("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                mo12144a();
                break;
            case 2:
                mo12146b();
                break;
            case 3:
                mo12147c();
                break;
            case 4:
                mo12148d();
                break;
            case 5:
                mo12145a(aho.m16242a(parcel));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
