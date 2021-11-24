package com.seattleclouds.modules.peopledirectory;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class ListItem implements Parcelable {
    public static final Creator<ListItem> CREATOR = new Creator<ListItem>() {
        /* renamed from: a */
        public ListItem createFromParcel(Parcel parcel) {
            return new ListItem(parcel);
        }

        /* renamed from: a */
        public ListItem[] newArray(int i) {
            return new ListItem[i];
        }
    };

    /* renamed from: a */
    public int f21401a = 1;

    /* renamed from: b */
    public Person f21402b;

    /* renamed from: c */
    public String f21403c;

    public ListItem(int i, Person person, String str) {
        this.f21401a = i;
        this.f21402b = person;
        this.f21403c = str;
    }

    protected ListItem(Parcel parcel) {
        this.f21401a = parcel.readInt();
        this.f21402b = (Person) parcel.readValue(Person.class.getClassLoader());
        this.f21403c = parcel.readString();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f21401a);
        parcel.writeValue(this.f21402b);
        parcel.writeString(this.f21403c);
    }
}
