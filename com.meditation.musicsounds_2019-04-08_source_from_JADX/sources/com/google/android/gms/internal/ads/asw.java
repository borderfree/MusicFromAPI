package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

public final class asw extends ahm implements asu {
    asw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    /* renamed from: a */
    public final String mo12340a() {
        Parcel a = mo11917a(2, mo11920q_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: b */
    public final List<asy> mo12341b() {
        Parcel a = mo11917a(3, mo11920q_());
        ArrayList b = aho.m16243b(a);
        a.recycle();
        return b;
    }
}
