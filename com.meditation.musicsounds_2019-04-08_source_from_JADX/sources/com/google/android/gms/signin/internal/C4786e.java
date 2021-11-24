package com.google.android.gms.signin.internal;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p128c.C4161b;
import com.google.android.gms.internal.p128c.C4162c;

/* renamed from: com.google.android.gms.signin.internal.e */
public abstract class C4786e extends C4161b implements C4785d {
    public C4786e() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo11158a(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 3:
                mo15895a((ConnectionResult) C4162c.m20799a(parcel, ConnectionResult.CREATOR), (zaa) C4162c.m20799a(parcel, zaa.CREATOR));
                break;
            case 4:
                mo15896a((Status) C4162c.m20799a(parcel, Status.CREATOR));
                break;
            case 6:
                mo15898b((Status) C4162c.m20799a(parcel, Status.CREATOR));
                break;
            case 7:
                mo15897a((Status) C4162c.m20799a(parcel, Status.CREATOR), (GoogleSignInAccount) C4162c.m20799a(parcel, GoogleSignInAccount.CREATOR));
                break;
            case 8:
                mo10895a((zaj) C4162c.m20799a(parcel, zaj.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
