package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.measurement.fv */
public abstract class C4397fv extends C4317db implements C4368ez {
    /* renamed from: a */
    public static C4368ez m21619a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        return queryLocalInterface instanceof C4368ez ? (C4368ez) queryLocalInterface : new C4424gv(iBinder);
    }
}
