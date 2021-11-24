package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.measurement.gv */
public final class C4424gv extends C4316da implements C4368ez {
    C4424gv(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    /* renamed from: a */
    public final Bundle mo14451a(Bundle bundle) {
        Parcel a = mo14267a();
        C4324di.m21254a(a, (Parcelable) bundle);
        Parcel a2 = mo14268a(1, a);
        Bundle bundle2 = (Bundle) C4324di.m21253a(a2, Bundle.CREATOR);
        a2.recycle();
        return bundle2;
    }
}
