package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.exoplayer2.p102c.C2511s;
import java.util.Arrays;

public final class ChapterTocFrame extends Id3Frame {
    public static final Creator<ChapterTocFrame> CREATOR = new Creator<ChapterTocFrame>() {
        /* renamed from: a */
        public ChapterTocFrame createFromParcel(Parcel parcel) {
            return new ChapterTocFrame(parcel);
        }

        /* renamed from: a */
        public ChapterTocFrame[] newArray(int i) {
            return new ChapterTocFrame[i];
        }
    };

    /* renamed from: a */
    public final String f9205a;

    /* renamed from: b */
    public final boolean f9206b;

    /* renamed from: c */
    public final boolean f9207c;

    /* renamed from: d */
    public final String[] f9208d;

    /* renamed from: e */
    private final Id3Frame[] f9209e;

    ChapterTocFrame(Parcel parcel) {
        super("CTOC");
        this.f9205a = parcel.readString();
        boolean z = true;
        this.f9206b = parcel.readByte() != 0;
        if (parcel.readByte() == 0) {
            z = false;
        }
        this.f9207c = z;
        this.f9208d = parcel.createStringArray();
        int readInt = parcel.readInt();
        this.f9209e = new Id3Frame[readInt];
        for (int i = 0; i < readInt; i++) {
            this.f9209e[i] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }

    public ChapterTocFrame(String str, boolean z, boolean z2, String[] strArr, Id3Frame[] id3FrameArr) {
        super("CTOC");
        this.f9205a = str;
        this.f9206b = z;
        this.f9207c = z2;
        this.f9208d = strArr;
        this.f9209e = id3FrameArr;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ChapterTocFrame chapterTocFrame = (ChapterTocFrame) obj;
        if (this.f9206b != chapterTocFrame.f9206b || this.f9207c != chapterTocFrame.f9207c || !C2511s.m11809a((Object) this.f9205a, (Object) chapterTocFrame.f9205a) || !Arrays.equals(this.f9208d, chapterTocFrame.f9208d) || !Arrays.equals(this.f9209e, chapterTocFrame.f9209e)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((((true + (this.f9206b ? 1 : 0)) * 31) + (this.f9207c ? 1 : 0)) * 31) + (this.f9205a != null ? this.f9205a.hashCode() : 0);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f9205a);
        parcel.writeByte(this.f9206b ? (byte) 1 : 0);
        parcel.writeByte(this.f9207c ? (byte) 1 : 0);
        parcel.writeStringArray(this.f9208d);
        parcel.writeInt(this.f9209e.length);
        for (Id3Frame writeParcelable : this.f9209e) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }
}
