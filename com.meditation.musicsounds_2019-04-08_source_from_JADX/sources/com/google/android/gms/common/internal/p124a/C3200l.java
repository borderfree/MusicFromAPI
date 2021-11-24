package com.google.android.gms.common.internal.p124a;

import android.os.Parcel;
import com.google.android.gms.internal.p128c.C4161b;

/* renamed from: com.google.android.gms.common.internal.a.l */
public abstract class C3200l extends C4161b implements C3199k {
    public C3200l() {
        super("com.google.android.gms.common.internal.service.ICommonCallbacks");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo11158a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        mo11156a(parcel.readInt());
        parcel2.writeNoException();
        return true;
    }
}
