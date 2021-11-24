package com.seattleclouds.modules.signaturestamp;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class DrawHistory implements Parcelable {
    public static final Creator<DrawHistory> CREATOR = new Creator<DrawHistory>() {
        /* renamed from: a */
        public DrawHistory createFromParcel(Parcel parcel) {
            return new DrawHistory(parcel);
        }

        /* renamed from: a */
        public DrawHistory[] newArray(int i) {
            return new DrawHistory[i];
        }
    };

    /* renamed from: a */
    public final float f22279a;

    /* renamed from: b */
    public final float f22280b;

    /* renamed from: c */
    public final int f22281c;

    /* renamed from: d */
    public final int f22282d;

    /* renamed from: e */
    public final int f22283e;

    public DrawHistory(float f, float f2, int i, int i2, int i3) {
        this.f22279a = f;
        this.f22280b = f2;
        this.f22281c = i;
        this.f22282d = i2;
        this.f22283e = i3;
    }

    protected DrawHistory(Parcel parcel) {
        this.f22279a = parcel.readFloat();
        this.f22280b = parcel.readFloat();
        this.f22281c = parcel.readInt();
        this.f22282d = parcel.readInt();
        this.f22283e = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.f22279a);
        parcel.writeFloat(this.f22280b);
        parcel.writeInt(this.f22281c);
        parcel.writeInt(this.f22282d);
        parcel.writeInt(this.f22283e);
    }
}
