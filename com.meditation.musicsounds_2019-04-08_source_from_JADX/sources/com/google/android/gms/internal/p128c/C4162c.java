package com.google.android.gms.internal.p128c;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: com.google.android.gms.internal.c.c */
public class C4162c {

    /* renamed from: a */
    private static final ClassLoader f15604a = C4162c.class.getClassLoader();

    private C4162c() {
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m20799a(Parcel parcel, Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* renamed from: a */
    public static void m20800a(Parcel parcel, IInterface iInterface) {
        parcel.writeStrongBinder(iInterface == null ? null : iInterface.asBinder());
    }

    /* renamed from: a */
    public static void m20801a(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    /* renamed from: a */
    public static void m20802a(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }
}
