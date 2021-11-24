package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.p129d.C4167b;

/* renamed from: com.google.android.gms.common.internal.ar */
public abstract class C3220ar extends C4167b implements C3219aq {
    /* renamed from: a */
    public static C3219aq m14744a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
        return queryLocalInterface instanceof C3219aq ? (C3219aq) queryLocalInterface : new C3221as(iBinder);
    }
}
