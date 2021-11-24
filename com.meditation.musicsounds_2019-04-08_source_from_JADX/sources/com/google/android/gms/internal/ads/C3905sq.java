package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.sq */
public abstract class C3905sq extends ahn implements C3904sp {
    /* renamed from: a */
    public static C3904sp m19849a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.omid.IOmid");
        return queryLocalInterface instanceof C3904sp ? (C3904sp) queryLocalInterface : new C3906sr(iBinder);
    }
}
