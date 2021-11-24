package com.seattleclouds.modules.peopledirectory;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.List;

public class Person implements Parcelable {
    public static final Creator<Person> CREATOR = new Creator<Person>() {
        /* renamed from: a */
        public Person createFromParcel(Parcel parcel) {
            return new Person(parcel);
        }

        /* renamed from: a */
        public Person[] newArray(int i) {
            return new Person[i];
        }
    };

    /* renamed from: a */
    String f21404a;

    /* renamed from: b */
    String f21405b;

    /* renamed from: c */
    String f21406c;

    /* renamed from: d */
    String f21407d;

    /* renamed from: e */
    String f21408e;

    /* renamed from: f */
    String f21409f;

    /* renamed from: g */
    String f21410g;

    /* renamed from: h */
    List<String> f21411h;

    /* renamed from: i */
    String f21412i;

    protected Person(Parcel parcel) {
        this.f21404a = parcel.readString();
        this.f21405b = parcel.readString();
        this.f21406c = parcel.readString();
        this.f21407d = parcel.readString();
        this.f21408e = parcel.readString();
        this.f21409f = parcel.readString();
        this.f21410g = parcel.readString();
        if (parcel.readByte() == 1) {
            this.f21411h = new ArrayList();
            parcel.readList(this.f21411h, String.class.getClassLoader());
        } else {
            this.f21411h = null;
        }
        this.f21412i = parcel.readString();
    }

    public Person(String str, String str2, String str3) {
        this.f21404a = str;
        this.f21405b = str2;
        this.f21406c = str3;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f21404a);
        parcel.writeString(this.f21405b);
        parcel.writeString(this.f21406c);
        parcel.writeString(this.f21407d);
        parcel.writeString(this.f21408e);
        parcel.writeString(this.f21409f);
        parcel.writeString(this.f21410g);
        if (this.f21411h == null) {
            parcel.writeByte(0);
        } else {
            parcel.writeByte(1);
            parcel.writeList(this.f21411h);
        }
        parcel.writeString(this.f21412i);
    }
}
