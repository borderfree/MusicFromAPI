package com.seattleclouds.modules.gcmtopics;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class GCMTopic implements Parcelable {
    public static final Creator<GCMTopic> CREATOR = new Creator<GCMTopic>() {
        /* renamed from: a */
        public GCMTopic createFromParcel(Parcel parcel) {
            return new GCMTopic(parcel);
        }

        /* renamed from: a */
        public GCMTopic[] newArray(int i) {
            return new GCMTopic[i];
        }
    };

    /* renamed from: a */
    public String f20184a;

    /* renamed from: b */
    public String f20185b;

    /* renamed from: c */
    public String f20186c;

    /* renamed from: d */
    public boolean f20187d;

    protected GCMTopic(Parcel parcel) {
        boolean z = false;
        this.f20187d = false;
        this.f20184a = parcel.readString();
        this.f20185b = parcel.readString();
        this.f20186c = parcel.readString();
        if (parcel.readByte() != 0) {
            z = true;
        }
        this.f20187d = z;
    }

    public GCMTopic(String str, String str2) {
        this(str, str, str2);
    }

    public GCMTopic(String str, String str2, String str3) {
        this.f20187d = false;
        this.f20184a = str;
        this.f20185b = str2;
        this.f20186c = str3;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f20184a);
        parcel.writeString(this.f20185b);
        parcel.writeString(this.f20186c);
        parcel.writeByte(this.f20187d ? (byte) 1 : 0);
    }
}
