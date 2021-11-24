package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p127b.C4153b;
import com.google.android.gms.internal.p127b.C4154c;

/* renamed from: com.google.android.gms.auth.api.signin.internal.q */
public abstract class C2996q extends C4153b implements C2995p {
    public C2996q() {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo10746a(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 101:
                mo10728a((GoogleSignInAccount) C4154c.m20787a(parcel, GoogleSignInAccount.CREATOR), (Status) C4154c.m20787a(parcel, Status.CREATOR));
                break;
            case 102:
                mo10729a((Status) C4154c.m20787a(parcel, Status.CREATOR));
                break;
            case 103:
                mo10730b((Status) C4154c.m20787a(parcel, Status.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
