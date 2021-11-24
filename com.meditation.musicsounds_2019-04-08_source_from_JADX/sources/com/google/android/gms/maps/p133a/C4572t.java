package com.google.android.gms.maps.p133a;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.p132g.C4190a;
import com.google.android.gms.internal.p132g.C4192c;
import com.google.android.gms.maps.model.VisibleRegion;

/* renamed from: com.google.android.gms.maps.a.t */
public final class C4572t extends C4190a implements C4557e {
    C4572t(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IProjectionDelegate");
    }

    /* renamed from: a */
    public final VisibleRegion mo15086a() {
        Parcel a = mo14029a(3, mo14032s_());
        VisibleRegion visibleRegion = (VisibleRegion) C4192c.m20834a(a, VisibleRegion.CREATOR);
        a.recycle();
        return visibleRegion;
    }
}
