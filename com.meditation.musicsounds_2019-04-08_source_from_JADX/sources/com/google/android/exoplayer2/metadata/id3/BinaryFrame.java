package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;

public final class BinaryFrame extends Id3Frame {
    public static final Creator<BinaryFrame> CREATOR = new Creator<BinaryFrame>() {
        /* renamed from: a */
        public BinaryFrame createFromParcel(Parcel parcel) {
            return new BinaryFrame(parcel);
        }

        /* renamed from: a */
        public BinaryFrame[] newArray(int i) {
            return new BinaryFrame[i];
        }
    };

    /* renamed from: a */
    public final byte[] f9198a;

    BinaryFrame(Parcel parcel) {
        super(parcel.readString());
        this.f9198a = parcel.createByteArray();
    }

    public BinaryFrame(String str, byte[] bArr) {
        super(str);
        this.f9198a = bArr;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BinaryFrame binaryFrame = (BinaryFrame) obj;
        if (!this.f9217f.equals(binaryFrame.f9217f) || !Arrays.equals(this.f9198a, binaryFrame.f9198a)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((527 + this.f9217f.hashCode()) * 31) + Arrays.hashCode(this.f9198a);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f9217f);
        parcel.writeByteArray(this.f9198a);
    }
}
