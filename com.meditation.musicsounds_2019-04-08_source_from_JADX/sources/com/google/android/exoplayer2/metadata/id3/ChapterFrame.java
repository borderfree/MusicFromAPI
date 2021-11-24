package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.exoplayer2.p102c.C2511s;
import java.util.Arrays;

public final class ChapterFrame extends Id3Frame {
    public static final Creator<ChapterFrame> CREATOR = new Creator<ChapterFrame>() {
        /* renamed from: a */
        public ChapterFrame createFromParcel(Parcel parcel) {
            return new ChapterFrame(parcel);
        }

        /* renamed from: a */
        public ChapterFrame[] newArray(int i) {
            return new ChapterFrame[i];
        }
    };

    /* renamed from: a */
    public final String f9199a;

    /* renamed from: b */
    public final int f9200b;

    /* renamed from: c */
    public final int f9201c;

    /* renamed from: d */
    public final long f9202d;

    /* renamed from: e */
    public final long f9203e;

    /* renamed from: g */
    private final Id3Frame[] f9204g;

    ChapterFrame(Parcel parcel) {
        super("CHAP");
        this.f9199a = parcel.readString();
        this.f9200b = parcel.readInt();
        this.f9201c = parcel.readInt();
        this.f9202d = parcel.readLong();
        this.f9203e = parcel.readLong();
        int readInt = parcel.readInt();
        this.f9204g = new Id3Frame[readInt];
        for (int i = 0; i < readInt; i++) {
            this.f9204g[i] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }

    public ChapterFrame(String str, int i, int i2, long j, long j2, Id3Frame[] id3FrameArr) {
        super("CHAP");
        this.f9199a = str;
        this.f9200b = i;
        this.f9201c = i2;
        this.f9202d = j;
        this.f9203e = j2;
        this.f9204g = id3FrameArr;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ChapterFrame chapterFrame = (ChapterFrame) obj;
        if (!(this.f9200b == chapterFrame.f9200b && this.f9201c == chapterFrame.f9201c && this.f9202d == chapterFrame.f9202d && this.f9203e == chapterFrame.f9203e && C2511s.m11809a((Object) this.f9199a, (Object) chapterFrame.f9199a) && Arrays.equals(this.f9204g, chapterFrame.f9204g))) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((((((((527 + this.f9200b) * 31) + this.f9201c) * 31) + ((int) this.f9202d)) * 31) + ((int) this.f9203e)) * 31) + (this.f9199a != null ? this.f9199a.hashCode() : 0);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f9199a);
        parcel.writeInt(this.f9200b);
        parcel.writeInt(this.f9201c);
        parcel.writeLong(this.f9202d);
        parcel.writeLong(this.f9203e);
        parcel.writeInt(this.f9204g.length);
        for (Id3Frame writeParcelable : this.f9204g) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }
}
