package com.google.android.gms.maps.p133a;

import android.os.Parcel;
import com.google.android.gms.internal.p132g.C4191b;
import com.google.android.gms.internal.p132g.C4198i;

/* renamed from: com.google.android.gms.maps.a.j */
public abstract class C4562j extends C4191b implements C4561i {
    public C4562j() {
        super("com.google.android.gms.maps.internal.IOnInfoWindowClickListener");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo14033a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        mo15089a(C4198i.m20850a(parcel.readStrongBinder()));
        parcel2.writeNoException();
        return true;
    }
}
