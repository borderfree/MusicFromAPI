package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.exoplayer2.p102c.C2511s;
import java.util.Arrays;

public final class PrivFrame extends Id3Frame {
    public static final Creator<PrivFrame> CREATOR = new Creator<PrivFrame>() {
        /* renamed from: a */
        public PrivFrame createFromParcel(Parcel parcel) {
            return new PrivFrame(parcel);
        }

        /* renamed from: a */
        public PrivFrame[] newArray(int i) {
            return new PrivFrame[i];
        }
    };

    /* renamed from: a */
    public final String f9218a;

    /* renamed from: b */
    public final byte[] f9219b;

    PrivFrame(Parcel parcel) {
        super("PRIV");
        this.f9218a = parcel.readString();
        this.f9219b = parcel.createByteArray();
    }

    public PrivFrame(String str, byte[] bArr) {
        super("PRIV");
        this.f9218a = str;
        this.f9219b = bArr;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PrivFrame privFrame = (PrivFrame) obj;
        if (!C2511s.m11809a((Object) this.f9218a, (Object) privFrame.f9218a) || !Arrays.equals(this.f9219b, privFrame.f9219b)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((527 + (this.f9218a != null ? this.f9218a.hashCode() : 0)) * 31) + Arrays.hashCode(this.f9219b);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f9218a);
        parcel.writeByteArray(this.f9219b);
    }
}
