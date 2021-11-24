package com.seattleclouds.modules.podcast;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class PodcastListItem implements Parcelable {
    public static final Creator<PodcastListItem> CREATOR = new Creator<PodcastListItem>() {
        /* renamed from: a */
        public PodcastListItem createFromParcel(Parcel parcel) {
            return new PodcastListItem(parcel);
        }

        /* renamed from: a */
        public PodcastListItem[] newArray(int i) {
            return new PodcastListItem[i];
        }
    };

    /* renamed from: a */
    public PodcastItem f21536a;

    /* renamed from: b */
    public PodcastCategory f21537b;

    /* renamed from: c */
    public boolean f21538c;

    /* renamed from: d */
    public boolean f21539d;

    /* renamed from: e */
    public String f21540e;

    /* renamed from: f */
    public String f21541f;

    /* renamed from: g */
    public String f21542g;

    /* renamed from: h */
    public String f21543h;

    /* renamed from: i */
    public String f21544i;

    public PodcastListItem() {
    }

    protected PodcastListItem(Parcel parcel) {
        this.f21536a = (PodcastItem) parcel.readValue(PodcastItem.class.getClassLoader());
        this.f21537b = (PodcastCategory) parcel.readValue(PodcastCategory.class.getClassLoader());
        boolean z = false;
        this.f21538c = parcel.readByte() != 0;
        if (parcel.readByte() != 0) {
            z = true;
        }
        this.f21539d = z;
        this.f21540e = parcel.readString();
        this.f21541f = parcel.readString();
        this.f21542g = parcel.readString();
        this.f21543h = parcel.readString();
        this.f21544i = parcel.readString();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.f21536a);
        parcel.writeValue(this.f21537b);
        parcel.writeByte(this.f21538c ? (byte) 1 : 0);
        parcel.writeByte(this.f21539d ? (byte) 1 : 0);
        parcel.writeString(this.f21540e);
        parcel.writeString(this.f21541f);
        parcel.writeString(this.f21542g);
        parcel.writeString(this.f21543h);
        parcel.writeString(this.f21544i);
    }
}
