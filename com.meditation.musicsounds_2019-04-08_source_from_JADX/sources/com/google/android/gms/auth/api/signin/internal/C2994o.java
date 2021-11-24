package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import com.google.android.gms.internal.p127b.C4153b;

/* renamed from: com.google.android.gms.auth.api.signin.internal.o */
public abstract class C2994o extends C4153b implements C2993n {
    public C2994o() {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo10746a(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                mo10744a();
                break;
            case 2:
                mo10745b();
                break;
            default:
                return false;
        }
        return true;
    }
}
