package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.zzk;
import com.google.android.gms.dynamic.C3323b;
import com.google.android.gms.internal.p129d.C4166a;
import com.google.android.gms.internal.p129d.C4168c;

/* renamed from: com.google.android.gms.common.internal.as */
public final class C3221as extends C4166a implements C3219aq {
    C3221as(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    /* renamed from: a */
    public final boolean mo11195a(zzk zzk, C3323b bVar) {
        Parcel c = mo14014c();
        C4168c.m20809a(c, (Parcelable) zzk);
        C4168c.m20808a(c, (IInterface) bVar);
        Parcel a = mo14011a(5, c);
        boolean a2 = C4168c.m20811a(a);
        a.recycle();
        return a2;
    }
}
