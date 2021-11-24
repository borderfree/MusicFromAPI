package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.ac */
public final class C3395ac extends ahn implements C3388aa {
    /* renamed from: a */
    public static C3388aa m15560a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseManager");
        return queryLocalInterface instanceof C3388aa ? (C3388aa) queryLocalInterface : new C3396ad(iBinder);
    }
}
