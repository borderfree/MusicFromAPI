package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.y */
public final class C4083y extends ahn implements C4054x {
    /* renamed from: a */
    public static C4054x m20350a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener");
        return queryLocalInterface instanceof C4054x ? (C4054x) queryLocalInterface : new C4111z(iBinder);
    }
}
