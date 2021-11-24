package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.exoplayer2.p102c.C2511s;
import java.util.Arrays;

public final class GeobFrame extends Id3Frame {
    public static final Creator<GeobFrame> CREATOR = new Creator<GeobFrame>() {
        /* renamed from: a */
        public GeobFrame createFromParcel(Parcel parcel) {
            return new GeobFrame(parcel);
        }

        /* renamed from: a */
        public GeobFrame[] newArray(int i) {
            return new GeobFrame[i];
        }
    };

    /* renamed from: a */
    public final String f9213a;

    /* renamed from: b */
    public final String f9214b;

    /* renamed from: c */
    public final String f9215c;

    /* renamed from: d */
    public final byte[] f9216d;

    GeobFrame(Parcel parcel) {
        super("GEOB");
        this.f9213a = parcel.readString();
        this.f9214b = parcel.readString();
        this.f9215c = parcel.readString();
        this.f9216d = parcel.createByteArray();
    }

    public GeobFrame(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f9213a = str;
        this.f9214b = str2;
        this.f9215c = str3;
        this.f9216d = bArr;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GeobFrame geobFrame = (GeobFrame) obj;
        if (!C2511s.m11809a((Object) this.f9213a, (Object) geobFrame.f9213a) || !C2511s.m11809a((Object) this.f9214b, (Object) geobFrame.f9214b) || !C2511s.m11809a((Object) this.f9215c, (Object) geobFrame.f9215c) || !Arrays.equals(this.f9216d, geobFrame.f9216d)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = (((527 + (this.f9213a != null ? this.f9213a.hashCode() : 0)) * 31) + (this.f9214b != null ? this.f9214b.hashCode() : 0)) * 31;
        if (this.f9215c != null) {
            i = this.f9215c.hashCode();
        }
        return ((hashCode + i) * 31) + Arrays.hashCode(this.f9216d);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f9213a);
        parcel.writeString(this.f9214b);
        parcel.writeString(this.f9215c);
        parcel.writeByteArray(this.f9216d);
    }
}
