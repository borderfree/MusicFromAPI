package com.google.android.gms.maps.p133a;

import android.os.Parcel;
import com.google.android.gms.internal.p132g.C4191b;
import com.google.android.gms.internal.p132g.C4192c;
import com.google.android.gms.internal.p132g.C4198i;

/* renamed from: com.google.android.gms.maps.a.p */
public abstract class C4568p extends C4191b implements C4567o {
    public C4568p() {
        super("com.google.android.gms.maps.internal.IOnMarkerClickListener");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo14033a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        boolean a = mo15092a(C4198i.m20850a(parcel.readStrongBinder()));
        parcel2.writeNoException();
        C4192c.m20837a(parcel2, a);
        return true;
    }
}
