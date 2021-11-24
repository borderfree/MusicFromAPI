package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.exoplayer2.p102c.C2511s;

public final class TextInformationFrame extends Id3Frame {
    public static final Creator<TextInformationFrame> CREATOR = new Creator<TextInformationFrame>() {
        /* renamed from: a */
        public TextInformationFrame createFromParcel(Parcel parcel) {
            return new TextInformationFrame(parcel);
        }

        /* renamed from: a */
        public TextInformationFrame[] newArray(int i) {
            return new TextInformationFrame[i];
        }
    };

    /* renamed from: a */
    public final String f9220a;

    /* renamed from: b */
    public final String f9221b;

    TextInformationFrame(Parcel parcel) {
        super(parcel.readString());
        this.f9220a = parcel.readString();
        this.f9221b = parcel.readString();
    }

    public TextInformationFrame(String str, String str2, String str3) {
        super(str);
        this.f9220a = str2;
        this.f9221b = str3;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TextInformationFrame textInformationFrame = (TextInformationFrame) obj;
        if (!this.f9217f.equals(textInformationFrame.f9217f) || !C2511s.m11809a((Object) this.f9220a, (Object) textInformationFrame.f9220a) || !C2511s.m11809a((Object) this.f9221b, (Object) textInformationFrame.f9221b)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = (((527 + this.f9217f.hashCode()) * 31) + (this.f9220a != null ? this.f9220a.hashCode() : 0)) * 31;
        if (this.f9221b != null) {
            i = this.f9221b.hashCode();
        }
        return hashCode + i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f9217f);
        parcel.writeString(this.f9220a);
        parcel.writeString(this.f9221b);
    }
}
