package com.seattleclouds.modules.mosaic;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class ImgMetadata implements Parcelable {
    public static final Creator<ImgMetadata> CREATOR = new Creator<ImgMetadata>() {
        /* renamed from: a */
        public ImgMetadata createFromParcel(Parcel parcel) {
            return new ImgMetadata(parcel);
        }

        /* renamed from: a */
        public ImgMetadata[] newArray(int i) {
            return new ImgMetadata[i];
        }
    };

    /* renamed from: a */
    public String f20779a;

    /* renamed from: b */
    public String f20780b;

    /* renamed from: c */
    public String f20781c;

    /* renamed from: d */
    public boolean f20782d;

    public ImgMetadata() {
        this.f20782d = false;
    }

    private ImgMetadata(Parcel parcel) {
        boolean z = false;
        this.f20782d = false;
        this.f20779a = parcel.readString();
        this.f20780b = parcel.readString();
        this.f20781c = parcel.readString();
        if (parcel.readInt() == 1) {
            z = true;
        }
        this.f20782d = z;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f20779a);
        parcel.writeString(this.f20780b);
        parcel.writeString(this.f20781c);
        parcel.writeInt(this.f20782d ? 1 : 0);
    }
}
