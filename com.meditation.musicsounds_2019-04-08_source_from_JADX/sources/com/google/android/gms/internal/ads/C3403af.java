package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.af */
public final class C3403af extends ahn implements C3402ae {
    /* renamed from: a */
    public static C3402ae m16090a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
        return queryLocalInterface instanceof C3402ae ? (C3402ae) queryLocalInterface : new C3404ag(iBinder);
    }
}
