package com.seattleclouds.modules.gcmtopics;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class GCMTopicListItem implements Parcelable {
    public static final Creator<GCMTopicListItem> CREATOR = new Creator<GCMTopicListItem>() {
        /* renamed from: a */
        public GCMTopicListItem createFromParcel(Parcel parcel) {
            return new GCMTopicListItem(parcel);
        }

        /* renamed from: a */
        public GCMTopicListItem[] newArray(int i) {
            return new GCMTopicListItem[i];
        }
    };

    /* renamed from: a */
    private int f20188a = 1;

    /* renamed from: b */
    private int f20189b = 0;

    /* renamed from: c */
    private Object f20190c;

    public GCMTopicListItem() {
    }

    protected GCMTopicListItem(Parcel parcel) {
        this.f20188a = parcel.readInt();
        this.f20189b = parcel.readInt();
        this.f20190c = parcel.readValue((this.f20188a == 0 ? String.class : GCMTopic.class).getClassLoader());
    }

    /* renamed from: a */
    public int mo18288a() {
        return this.f20188a;
    }

    /* renamed from: a */
    public GCMTopicListItem mo18289a(int i) {
        this.f20188a = i;
        return this;
    }

    /* renamed from: a */
    public GCMTopicListItem mo18290a(Object obj) {
        this.f20190c = obj;
        return this;
    }

    /* renamed from: b */
    public int mo18291b() {
        return this.f20189b;
    }

    /* renamed from: b */
    public GCMTopicListItem mo18292b(int i) {
        this.f20189b = i;
        return this;
    }

    /* renamed from: c */
    public GCMTopic mo18293c() {
        return (GCMTopic) this.f20190c;
    }

    /* renamed from: d */
    public String mo18294d() {
        return (String) this.f20190c;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public String mo18296e() {
        return mo18288a() == 0 ? mo18294d() : mo18293c().f20185b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f20188a);
        parcel.writeInt(this.f20189b);
        parcel.writeValue(this.f20190c);
    }
}
