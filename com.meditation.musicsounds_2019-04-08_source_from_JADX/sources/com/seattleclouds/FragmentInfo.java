package com.seattleclouds;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class FragmentInfo implements Parcelable {
    public static final Creator<FragmentInfo> CREATOR = new Creator<FragmentInfo>() {
        /* renamed from: a */
        public FragmentInfo createFromParcel(Parcel parcel) {
            return new FragmentInfo(parcel);
        }

        /* renamed from: a */
        public FragmentInfo[] newArray(int i) {
            return new FragmentInfo[i];
        }
    };

    /* renamed from: a */
    String f18566a;

    /* renamed from: b */
    Bundle f18567b;

    public FragmentInfo(Parcel parcel) {
        this.f18566a = parcel.readString();
        this.f18567b = parcel.readBundle();
    }

    public FragmentInfo(String str) {
        this(str, new Bundle());
    }

    public FragmentInfo(String str, Bundle bundle) {
        this.f18566a = str;
        this.f18567b = bundle;
    }

    /* renamed from: a */
    public String mo16867a() {
        return this.f18566a;
    }

    /* renamed from: a */
    public void mo16868a(String str) {
        this.f18566a = str;
    }

    /* renamed from: b */
    public Bundle mo16869b() {
        if (this.f18567b != null) {
            return new Bundle(this.f18567b);
        }
        return null;
    }

    /* renamed from: c */
    public Bundle mo16870c() {
        return this.f18567b;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f18566a);
        parcel.writeBundle(this.f18567b);
    }
}
