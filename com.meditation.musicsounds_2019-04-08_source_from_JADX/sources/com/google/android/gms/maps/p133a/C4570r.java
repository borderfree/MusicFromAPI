package com.google.android.gms.maps.p133a;

import android.os.Parcel;
import com.google.android.gms.dynamic.C3323b.C3324a;
import com.google.android.gms.internal.p132g.C4191b;

/* renamed from: com.google.android.gms.maps.a.r */
public abstract class C4570r extends C4191b implements C4569q {
    public C4570r() {
        super("com.google.android.gms.maps.internal.IOnMyLocationChangeListener");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo14033a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        mo15093a(C3324a.m15129a(parcel.readStrongBinder()));
        parcel2.writeNoException();
        return true;
    }
}
