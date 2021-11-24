package com.seattleclouds.modules.photoeffect;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class MaskProperty implements Parcelable {
    public static final Creator<MaskProperty> CREATOR = new Creator<MaskProperty>() {
        /* renamed from: a */
        public MaskProperty createFromParcel(Parcel parcel) {
            return new MaskProperty(parcel);
        }

        /* renamed from: a */
        public MaskProperty[] newArray(int i) {
            return new MaskProperty[i];
        }
    };

    /* renamed from: a */
    public int f21438a;

    /* renamed from: b */
    public int f21439b;

    /* renamed from: c */
    public int f21440c;

    /* renamed from: d */
    public int f21441d;

    /* renamed from: e */
    public int f21442e;

    /* renamed from: f */
    public float f21443f = 1.0f;

    /* renamed from: g */
    public float f21444g = 0.0f;

    /* renamed from: h */
    public boolean f21445h;

    /* renamed from: i */
    public String f21446i;

    public MaskProperty(int i, int i2, int i3, int i4, int i5, float f, float f2, boolean z, String str) {
        this.f21438a = i;
        this.f21439b = i2;
        this.f21440c = i3;
        this.f21441d = i4;
        this.f21442e = i5;
        this.f21443f = f;
        this.f21444g = f2;
        this.f21445h = z;
        this.f21446i = str;
    }

    protected MaskProperty(Parcel parcel) {
        this.f21438a = parcel.readInt();
        this.f21439b = parcel.readInt();
        this.f21440c = parcel.readInt();
        this.f21441d = parcel.readInt();
        this.f21442e = parcel.readInt();
        this.f21443f = parcel.readFloat();
        this.f21444g = parcel.readFloat();
        this.f21445h = parcel.readByte() != 0;
        this.f21446i = parcel.readString();
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MaskProperty{x=");
        sb.append(this.f21438a);
        sb.append(", y=");
        sb.append(this.f21439b);
        sb.append(", shiftX=");
        sb.append(this.f21440c);
        sb.append(", shiftY=");
        sb.append(this.f21441d);
        sb.append(", alpha=");
        sb.append(this.f21442e);
        sb.append(", scale=");
        sb.append(this.f21443f);
        sb.append(", angle=");
        sb.append(this.f21444g);
        sb.append(", selected=");
        sb.append(this.f21445h);
        sb.append(", imageName='");
        sb.append(this.f21446i);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f21438a);
        parcel.writeInt(this.f21439b);
        parcel.writeInt(this.f21440c);
        parcel.writeInt(this.f21441d);
        parcel.writeInt(this.f21442e);
        parcel.writeFloat(this.f21443f);
        parcel.writeFloat(this.f21444g);
        parcel.writeByte(this.f21445h ? (byte) 1 : 0);
        parcel.writeString(this.f21446i);
    }
}
