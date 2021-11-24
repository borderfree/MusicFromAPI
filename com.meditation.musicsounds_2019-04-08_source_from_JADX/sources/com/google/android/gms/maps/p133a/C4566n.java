package com.google.android.gms.maps.p133a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.p132g.C4191b;

/* renamed from: com.google.android.gms.maps.a.n */
public abstract class C4566n extends C4191b implements C4565m {
    public C4566n() {
        super("com.google.android.gms.maps.internal.IOnMapReadyCallback");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo14033a(int i, Parcel parcel, Parcel parcel2, int i2) {
        C4553b bVar;
        if (i != 1) {
            return false;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            bVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            bVar = queryLocalInterface instanceof C4553b ? (C4553b) queryLocalInterface : new C4547ab(readStrongBinder);
        }
        mo15091a(bVar);
        parcel2.writeNoException();
        return true;
    }
}
