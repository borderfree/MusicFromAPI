package com.google.android.vending.expansion.downloader;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class DownloadProgressInfo implements Parcelable {
    public static final Creator<DownloadProgressInfo> CREATOR = new Creator<DownloadProgressInfo>() {
        /* renamed from: a */
        public DownloadProgressInfo createFromParcel(Parcel parcel) {
            return new DownloadProgressInfo(parcel);
        }

        /* renamed from: a */
        public DownloadProgressInfo[] newArray(int i) {
            return new DownloadProgressInfo[i];
        }
    };

    /* renamed from: a */
    public long f17367a;

    /* renamed from: b */
    public long f17368b;

    /* renamed from: c */
    public long f17369c;

    /* renamed from: d */
    public float f17370d;

    public DownloadProgressInfo(long j, long j2, long j3, float f) {
        this.f17367a = j;
        this.f17368b = j2;
        this.f17369c = j3;
        this.f17370d = f;
    }

    public DownloadProgressInfo(Parcel parcel) {
        this.f17367a = parcel.readLong();
        this.f17368b = parcel.readLong();
        this.f17369c = parcel.readLong();
        this.f17370d = parcel.readFloat();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f17367a);
        parcel.writeLong(this.f17368b);
        parcel.writeLong(this.f17369c);
        parcel.writeFloat(this.f17370d);
    }
}
