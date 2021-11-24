package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.C3323b;

public abstract class asz extends ahn implements asy {
    public asz() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    /* renamed from: a */
    public static asy m17237a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        return queryLocalInterface instanceof asy ? (asy) queryLocalInterface : new ata(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                C3323b a = mo12354a();
                parcel2.writeNoException();
                aho.m16239a(parcel2, (IInterface) a);
                break;
            case 2:
                Uri b = mo12355b();
                parcel2.writeNoException();
                aho.m16244b(parcel2, b);
                break;
            case 3:
                double c = mo12356c();
                parcel2.writeNoException();
                parcel2.writeDouble(c);
                break;
            default:
                return false;
        }
        return true;
    }
}
