package com.google.android.gms.auth.api.signin.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.internal.p127b.C4152a;
import com.google.android.gms.internal.p127b.C4154c;

/* renamed from: com.google.android.gms.auth.api.signin.internal.s */
public final class C2998s extends C4152a implements C2997r {
    C2998s(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    /* renamed from: a */
    public final void mo10747a(C2995p pVar, GoogleSignInOptions googleSignInOptions) {
        Parcel a = mo14000a();
        C4154c.m20788a(a, (IInterface) pVar);
        C4154c.m20789a(a, (Parcelable) googleSignInOptions);
        mo14001a(103, a);
    }
}
