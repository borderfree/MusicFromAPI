package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public abstract class ahr extends ahn implements ahq {
    /* renamed from: a */
    public static ahq m16252a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.clearcut.IClearcut");
        return queryLocalInterface instanceof ahq ? (ahq) queryLocalInterface : new ahs(iBinder);
    }
}
