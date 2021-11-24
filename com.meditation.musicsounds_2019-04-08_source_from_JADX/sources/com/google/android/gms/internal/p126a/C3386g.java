package com.google.android.gms.internal.p126a;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.a.g */
public final class C3386g extends C3380a implements C3384e {
    C3386g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    /* renamed from: a */
    public final String mo11424a() {
        Parcel a = mo11419a(1, mo11421r_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: a */
    public final boolean mo11425a(boolean z) {
        Parcel r_ = mo11421r_();
        C3382c.m15279a(r_, true);
        Parcel a = mo11419a(2, r_);
        boolean a2 = C3382c.m15280a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: b */
    public final boolean mo11426b() {
        Parcel a = mo11419a(6, mo11421r_());
        boolean a2 = C3382c.m15280a(a);
        a.recycle();
        return a2;
    }
}
