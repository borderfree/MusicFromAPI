package com.google.android.gms.internal.p132g;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.g.i */
public abstract class C4198i extends C4191b implements C4197h {
    /* renamed from: a */
    public static C4197h m20850a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
        return queryLocalInterface instanceof C4197h ? (C4197h) queryLocalInterface : new C4199j(iBinder);
    }
}
