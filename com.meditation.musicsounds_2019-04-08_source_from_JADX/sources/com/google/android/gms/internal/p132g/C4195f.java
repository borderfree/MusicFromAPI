package com.google.android.gms.internal.p132g;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.g.f */
public abstract class C4195f extends C4191b implements C4194e {
    /* renamed from: a */
    public static C4194e m20840a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
        return queryLocalInterface instanceof C4194e ? (C4194e) queryLocalInterface : new C4196g(iBinder);
    }
}
