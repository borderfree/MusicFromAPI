package com.facebook.share.model;

import android.os.Parcel;

public abstract class ShareMessengerActionButton implements ShareModel {

    /* renamed from: a */
    private final String f7508a;

    ShareMessengerActionButton(Parcel parcel) {
        this.f7508a = parcel.readString();
    }

    /* renamed from: a */
    public String mo8234a() {
        return this.f7508a;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7508a);
    }
}
