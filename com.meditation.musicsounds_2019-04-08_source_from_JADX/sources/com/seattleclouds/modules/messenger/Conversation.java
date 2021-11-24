package com.seattleclouds.modules.messenger;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

class Conversation implements Parcelable {
    public static final Creator<Conversation> CREATOR = new Creator<Conversation>() {
        /* renamed from: a */
        public Conversation createFromParcel(Parcel parcel) {
            return new Conversation(parcel);
        }

        /* renamed from: a */
        public Conversation[] newArray(int i) {
            return new Conversation[i];
        }
    };

    /* renamed from: a */
    public String f20681a;

    /* renamed from: b */
    public String f20682b;

    protected Conversation() {
        this.f20681a = "";
        this.f20682b = "";
    }

    protected Conversation(Parcel parcel) {
        this.f20681a = parcel.readString();
        this.f20682b = parcel.readString();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f20681a);
        parcel.writeString(this.f20682b);
    }
}
