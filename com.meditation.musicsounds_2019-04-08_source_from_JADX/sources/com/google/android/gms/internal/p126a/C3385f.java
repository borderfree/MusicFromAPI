package com.google.android.gms.internal.p126a;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.a.f */
public abstract class C3385f extends C3381b implements C3384e {
    /* renamed from: a */
    public static C3384e m15284a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        return queryLocalInterface instanceof C3384e ? (C3384e) queryLocalInterface : new C3386g(iBinder);
    }
}
