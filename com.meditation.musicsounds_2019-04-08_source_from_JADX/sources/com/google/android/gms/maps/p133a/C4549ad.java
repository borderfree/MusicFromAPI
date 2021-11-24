package com.google.android.gms.maps.p133a;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.C3323b;
import com.google.android.gms.internal.p132g.C4191b;
import com.google.android.gms.internal.p132g.C4192c;
import com.google.android.gms.internal.p132g.C4198i;

/* renamed from: com.google.android.gms.maps.a.ad */
public abstract class C4549ad extends C4191b implements C4548ac {
    public C4549ad() {
        super("com.google.android.gms.maps.internal.IInfoWindowAdapter");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo14033a(int i, Parcel parcel, Parcel parcel2, int i2) {
        C3323b bVar;
        switch (i) {
            case 1:
                bVar = mo15073a(C4198i.m20850a(parcel.readStrongBinder()));
                break;
            case 2:
                bVar = mo15074b(C4198i.m20850a(parcel.readStrongBinder()));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        C4192c.m20835a(parcel2, (IInterface) bVar);
        return true;
    }
}
