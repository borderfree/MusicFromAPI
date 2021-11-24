package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class zzbr implements Parcelable {
    @Deprecated
    public static final Creator<zzbr> CREATOR = new C4249ao();

    /* renamed from: a */
    private String f16403a;

    /* renamed from: b */
    private String f16404b;

    /* renamed from: c */
    private String f16405c;

    @Deprecated
    public zzbr() {
    }

    @Deprecated
    zzbr(Parcel parcel) {
        this.f16403a = parcel.readString();
        this.f16404b = parcel.readString();
        this.f16405c = parcel.readString();
    }

    /* renamed from: a */
    public final String mo14873a() {
        return this.f16403a;
    }

    /* renamed from: b */
    public final String mo14874b() {
        return this.f16405c;
    }

    @Deprecated
    public final int describeContents() {
        return 0;
    }

    @Deprecated
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f16403a);
        parcel.writeString(this.f16404b);
        parcel.writeString(this.f16405c);
    }
}
