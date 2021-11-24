package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.exoplayer2.p102c.C2511s;
import java.util.Arrays;

public final class ApicFrame extends Id3Frame {
    public static final Creator<ApicFrame> CREATOR = new Creator<ApicFrame>() {
        /* renamed from: a */
        public ApicFrame createFromParcel(Parcel parcel) {
            return new ApicFrame(parcel);
        }

        /* renamed from: a */
        public ApicFrame[] newArray(int i) {
            return new ApicFrame[i];
        }
    };

    /* renamed from: a */
    public final String f9194a;

    /* renamed from: b */
    public final String f9195b;

    /* renamed from: c */
    public final int f9196c;

    /* renamed from: d */
    public final byte[] f9197d;

    ApicFrame(Parcel parcel) {
        super("APIC");
        this.f9194a = parcel.readString();
        this.f9195b = parcel.readString();
        this.f9196c = parcel.readInt();
        this.f9197d = parcel.createByteArray();
    }

    public ApicFrame(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.f9194a = str;
        this.f9195b = str2;
        this.f9196c = i;
        this.f9197d = bArr;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ApicFrame apicFrame = (ApicFrame) obj;
        if (this.f9196c != apicFrame.f9196c || !C2511s.m11809a((Object) this.f9194a, (Object) apicFrame.f9194a) || !C2511s.m11809a((Object) this.f9195b, (Object) apicFrame.f9195b) || !Arrays.equals(this.f9197d, apicFrame.f9197d)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = (((527 + this.f9196c) * 31) + (this.f9194a != null ? this.f9194a.hashCode() : 0)) * 31;
        if (this.f9195b != null) {
            i = this.f9195b.hashCode();
        }
        return ((hashCode + i) * 31) + Arrays.hashCode(this.f9197d);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f9194a);
        parcel.writeString(this.f9195b);
        parcel.writeInt(this.f9196c);
        parcel.writeByteArray(this.f9197d);
    }
}
