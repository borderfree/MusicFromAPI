package com.google.android.gms.internal.p131f;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.f.b */
public class C4182b {

    /* renamed from: a */
    private static final ClassLoader f15621a = C4182b.class.getClassLoader();

    private C4182b() {
    }

    /* renamed from: a */
    public static void m20822a(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }
}
