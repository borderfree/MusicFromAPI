package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.C3323b;
import com.google.android.gms.dynamic.C3323b.C3324a;

public abstract class atd extends ahn implements atc {
    public atd() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    /* renamed from: a */
    public static atc m17247a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
        return queryLocalInterface instanceof atc ? (atc) queryLocalInterface : new ate(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                mo12250a(parcel.readString(), C3324a.m15129a(parcel.readStrongBinder()));
                break;
            case 2:
                C3323b a = mo12246a(parcel.readString());
                parcel2.writeNoException();
                aho.m16239a(parcel2, (IInterface) a);
                break;
            case 3:
                mo12248a(C3324a.m15129a(parcel.readStrongBinder()));
                break;
            case 4:
                mo12247a();
                break;
            case 5:
                mo12249a(C3324a.m15129a(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 6:
                mo12251b(C3324a.m15129a(parcel.readStrongBinder()));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
