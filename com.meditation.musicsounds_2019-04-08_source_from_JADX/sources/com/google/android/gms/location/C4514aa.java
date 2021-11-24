package com.google.android.gms.location;

import android.location.Location;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.location.C4200a;
import com.google.android.gms.internal.location.C4202ab;

/* renamed from: com.google.android.gms.location.aa */
public final class C4514aa extends C4200a implements C4540y {
    C4514aa(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.ILocationListener");
    }

    /* renamed from: a */
    public final void mo14071a(Location location) {
        Parcel a = mo14045a();
        C4202ab.m20864a(a, (Parcelable) location);
        mo14048b(1, a);
    }
}
