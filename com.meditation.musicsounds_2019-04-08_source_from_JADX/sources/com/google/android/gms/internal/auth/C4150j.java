package com.google.android.gms.internal.auth;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.auth.j */
public abstract class C4150j extends C4146f implements C4149i {
    /* renamed from: a */
    public static C4149i m20781a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.auth.IAuthManagerService");
        return queryLocalInterface instanceof C4149i ? (C4149i) queryLocalInterface : new C4151k(iBinder);
    }
}
