package com.google.android.gms.maps.p133a;

import android.os.Parcel;
import com.google.android.gms.internal.p132g.C4191b;
import com.google.android.gms.internal.p132g.C4192c;
import com.google.android.gms.maps.model.CameraPosition;

/* renamed from: com.google.android.gms.maps.a.ag */
public abstract class C4552ag extends C4191b implements C4551af {
    public C4552ag() {
        super("com.google.android.gms.maps.internal.IOnCameraChangeListener");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo14033a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        mo15083a((CameraPosition) C4192c.m20834a(parcel, CameraPosition.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
