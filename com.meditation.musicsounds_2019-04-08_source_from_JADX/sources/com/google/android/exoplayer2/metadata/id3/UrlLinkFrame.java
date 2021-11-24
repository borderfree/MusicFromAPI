package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.exoplayer2.p102c.C2511s;

public final class UrlLinkFrame extends Id3Frame {
    public static final Creator<UrlLinkFrame> CREATOR = new Creator<UrlLinkFrame>() {
        /* renamed from: a */
        public UrlLinkFrame createFromParcel(Parcel parcel) {
            return new UrlLinkFrame(parcel);
        }

        /* renamed from: a */
        public UrlLinkFrame[] newArray(int i) {
            return new UrlLinkFrame[i];
        }
    };

    /* renamed from: a */
    public final String f9222a;

    /* renamed from: b */
    public final String f9223b;

    UrlLinkFrame(Parcel parcel) {
        super(parcel.readString());
        this.f9222a = parcel.readString();
        this.f9223b = parcel.readString();
    }

    public UrlLinkFrame(String str, String str2, String str3) {
        super(str);
        this.f9222a = str2;
        this.f9223b = str3;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UrlLinkFrame urlLinkFrame = (UrlLinkFrame) obj;
        if (!this.f9217f.equals(urlLinkFrame.f9217f) || !C2511s.m11809a((Object) this.f9222a, (Object) urlLinkFrame.f9222a) || !C2511s.m11809a((Object) this.f9223b, (Object) urlLinkFrame.f9223b)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = (((527 + this.f9217f.hashCode()) * 31) + (this.f9222a != null ? this.f9222a.hashCode() : 0)) * 31;
        if (this.f9223b != null) {
            i = this.f9223b.hashCode();
        }
        return hashCode + i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f9217f);
        parcel.writeString(this.f9222a);
        parcel.writeString(this.f9223b);
    }
}
