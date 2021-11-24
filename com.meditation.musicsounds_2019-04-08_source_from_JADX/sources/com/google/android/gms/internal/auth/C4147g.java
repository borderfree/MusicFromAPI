package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: com.google.android.gms.internal.auth.g */
public class C4147g {

    /* renamed from: a */
    private static final ClassLoader f15545a = C4147g.class.getClassLoader();

    private C4147g() {
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m20777a(Parcel parcel, Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* renamed from: a */
    public static void m20778a(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }
}
