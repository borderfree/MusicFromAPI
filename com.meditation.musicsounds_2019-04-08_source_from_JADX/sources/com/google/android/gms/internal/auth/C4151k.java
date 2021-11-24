package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.auth.k */
public final class C4151k extends C4141a implements C4149i {
    C4151k(IBinder iBinder) {
        super(iBinder, "com.google.android.auth.IAuthManagerService");
    }

    /* renamed from: a */
    public final Bundle mo13998a(Account account, String str, Bundle bundle) {
        Parcel a = mo13992a();
        C4147g.m20778a(a, (Parcelable) account);
        a.writeString(str);
        C4147g.m20778a(a, (Parcelable) bundle);
        Parcel a2 = mo13993a(5, a);
        Bundle bundle2 = (Bundle) C4147g.m20777a(a2, Bundle.CREATOR);
        a2.recycle();
        return bundle2;
    }

    /* renamed from: a */
    public final Bundle mo13999a(String str, Bundle bundle) {
        Parcel a = mo13992a();
        a.writeString(str);
        C4147g.m20778a(a, (Parcelable) bundle);
        Parcel a2 = mo13993a(2, a);
        Bundle bundle2 = (Bundle) C4147g.m20777a(a2, Bundle.CREATOR);
        a2.recycle();
        return bundle2;
    }
}
