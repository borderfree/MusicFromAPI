package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.C3323b;
import com.google.android.gms.internal.p129d.C4167b;
import com.google.android.gms.internal.p129d.C4168c;

/* renamed from: com.google.android.gms.common.internal.an */
public abstract class C3216an extends C4167b implements C3215am {
    public C3216an() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    /* renamed from: a */
    public static C3215am m14736a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        return queryLocalInterface instanceof C3215am ? (C3215am) queryLocalInterface : new C3217ao(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo11191a(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                C3323b a = mo11189a();
                parcel2.writeNoException();
                C4168c.m20808a(parcel2, (IInterface) a);
                break;
            case 2:
                int b = mo11190b();
                parcel2.writeNoException();
                parcel2.writeInt(b);
                break;
            default:
                return false;
        }
        return true;
    }
}
