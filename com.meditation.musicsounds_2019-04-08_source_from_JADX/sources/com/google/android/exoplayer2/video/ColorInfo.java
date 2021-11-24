package com.google.android.exoplayer2.video;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Arrays;

public final class ColorInfo implements Parcelable {
    public static final Creator<ColorInfo> CREATOR = new Creator<ColorInfo>() {
        /* renamed from: a */
        public ColorInfo createFromParcel(Parcel parcel) {
            return new ColorInfo(parcel);
        }

        /* renamed from: a */
        public ColorInfo[] newArray(int i) {
            return new ColorInfo[0];
        }
    };

    /* renamed from: a */
    public final int f9776a;

    /* renamed from: b */
    public final int f9777b;

    /* renamed from: c */
    public final int f9778c;

    /* renamed from: d */
    public final byte[] f9779d;

    /* renamed from: e */
    private int f9780e;

    public ColorInfo(int i, int i2, int i3, byte[] bArr) {
        this.f9776a = i;
        this.f9777b = i2;
        this.f9778c = i3;
        this.f9779d = bArr;
    }

    ColorInfo(Parcel parcel) {
        this.f9776a = parcel.readInt();
        this.f9777b = parcel.readInt();
        this.f9778c = parcel.readInt();
        this.f9779d = parcel.readInt() != 0 ? parcel.createByteArray() : null;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ColorInfo colorInfo = (ColorInfo) obj;
            return this.f9776a == colorInfo.f9776a && this.f9777b == colorInfo.f9777b && this.f9778c == colorInfo.f9778c && Arrays.equals(this.f9779d, colorInfo.f9779d);
        }
    }

    public int hashCode() {
        if (this.f9780e == 0) {
            this.f9780e = ((((((527 + this.f9776a) * 31) + this.f9777b) * 31) + this.f9778c) * 31) + Arrays.hashCode(this.f9779d);
        }
        return this.f9780e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ColorInfo(");
        sb.append(this.f9776a);
        sb.append(", ");
        sb.append(this.f9777b);
        sb.append(", ");
        sb.append(this.f9778c);
        sb.append(", ");
        sb.append(this.f9779d != null);
        sb.append(")");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f9776a);
        parcel.writeInt(this.f9777b);
        parcel.writeInt(this.f9778c);
        parcel.writeInt(this.f9779d != null ? 1 : 0);
        if (this.f9779d != null) {
            parcel.writeByteArray(this.f9779d);
        }
    }
}
