package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.exoplayer2.p102c.C2511s;

public final class CommentFrame extends Id3Frame {
    public static final Creator<CommentFrame> CREATOR = new Creator<CommentFrame>() {
        /* renamed from: a */
        public CommentFrame createFromParcel(Parcel parcel) {
            return new CommentFrame(parcel);
        }

        /* renamed from: a */
        public CommentFrame[] newArray(int i) {
            return new CommentFrame[i];
        }
    };

    /* renamed from: a */
    public final String f9210a;

    /* renamed from: b */
    public final String f9211b;

    /* renamed from: c */
    public final String f9212c;

    CommentFrame(Parcel parcel) {
        super("COMM");
        this.f9210a = parcel.readString();
        this.f9211b = parcel.readString();
        this.f9212c = parcel.readString();
    }

    public CommentFrame(String str, String str2, String str3) {
        super("COMM");
        this.f9210a = str;
        this.f9211b = str2;
        this.f9212c = str3;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CommentFrame commentFrame = (CommentFrame) obj;
        if (!C2511s.m11809a((Object) this.f9211b, (Object) commentFrame.f9211b) || !C2511s.m11809a((Object) this.f9210a, (Object) commentFrame.f9210a) || !C2511s.m11809a((Object) this.f9212c, (Object) commentFrame.f9212c)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = (((527 + (this.f9210a != null ? this.f9210a.hashCode() : 0)) * 31) + (this.f9211b != null ? this.f9211b.hashCode() : 0)) * 31;
        if (this.f9212c != null) {
            i = this.f9212c.hashCode();
        }
        return hashCode + i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f9217f);
        parcel.writeString(this.f9210a);
        parcel.writeString(this.f9212c);
    }
}
