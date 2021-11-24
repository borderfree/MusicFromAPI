package com.seattleclouds.billing;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class PurchaseError implements Parcelable {
    public static final Creator<PurchaseError> CREATOR = new Creator<PurchaseError>() {
        /* renamed from: a */
        public PurchaseError createFromParcel(Parcel parcel) {
            return new PurchaseError(parcel);
        }

        /* renamed from: a */
        public PurchaseError[] newArray(int i) {
            return new PurchaseError[i];
        }
    };

    /* renamed from: a */
    private String f19030a;

    /* renamed from: b */
    private String f19031b;

    /* renamed from: c */
    private boolean f19032c;

    private PurchaseError(Parcel parcel) {
        this.f19030a = parcel.readString();
        this.f19031b = parcel.readString();
        boolean z = true;
        if (parcel.readInt() != 1) {
            z = false;
        }
        this.f19032c = z;
    }

    public PurchaseError(String str, String str2, boolean z) {
        this.f19030a = str;
        this.f19031b = str2;
        this.f19032c = z;
    }

    /* renamed from: a */
    public String mo17442a() {
        return this.f19030a;
    }

    /* renamed from: b */
    public boolean mo17443b() {
        return this.f19032c;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f19030a);
        parcel.writeString(this.f19031b);
        parcel.writeByte(this.f19032c ? (byte) 1 : 0);
    }
}
