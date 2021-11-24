package com.google.android.gms.maps.p133a;

import android.os.Parcel;
import com.google.android.gms.internal.p132g.C4191b;

/* renamed from: com.google.android.gms.maps.a.y */
public abstract class C4577y extends C4191b implements C4576x {
    public C4577y() {
        super("com.google.android.gms.maps.internal.ICancelableCallback");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo14033a(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                mo15094a();
                break;
            case 2:
                mo15095b();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
