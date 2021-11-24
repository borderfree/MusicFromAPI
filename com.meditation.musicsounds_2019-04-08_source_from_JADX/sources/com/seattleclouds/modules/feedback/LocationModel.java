package com.seattleclouds.modules.feedback;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class LocationModel implements Parcelable, Comparable<LocationModel> {
    public static final Creator<LocationModel> CREATOR = new Creator<LocationModel>() {
        /* renamed from: a */
        public LocationModel createFromParcel(Parcel parcel) {
            return new LocationModel(parcel);
        }

        /* renamed from: a */
        public LocationModel[] newArray(int i) {
            return new LocationModel[i];
        }
    };

    /* renamed from: a */
    public String f19980a;

    /* renamed from: b */
    public double f19981b;

    /* renamed from: c */
    public double f19982c;

    /* renamed from: d */
    public String f19983d;

    /* renamed from: e */
    public String f19984e;

    /* renamed from: f */
    public String f19985f;

    /* renamed from: g */
    public String f19986g;

    /* renamed from: h */
    public String f19987h;

    /* renamed from: i */
    public String f19988i;

    /* renamed from: j */
    public String f19989j;

    /* renamed from: k */
    public String f19990k;

    /* renamed from: l */
    public String f19991l;

    /* renamed from: m */
    public String f19992m;

    /* renamed from: n */
    public String f19993n;

    /* renamed from: o */
    public double f19994o;

    public LocationModel() {
        this.f19980a = "";
        this.f19981b = 0.0d;
        this.f19982c = 0.0d;
        this.f19983d = "";
        this.f19984e = "";
        this.f19985f = "";
        this.f19986g = "";
        this.f19987h = "";
        this.f19988i = "";
        this.f19989j = "";
        this.f19990k = "";
        this.f19991l = "";
        this.f19992m = "";
        this.f19993n = "";
    }

    private LocationModel(Parcel parcel) {
        this.f19980a = parcel.readString();
        this.f19981b = parcel.readDouble();
        this.f19982c = parcel.readDouble();
        this.f19983d = parcel.readString();
        this.f19984e = parcel.readString();
        this.f19985f = parcel.readString();
        this.f19986g = parcel.readString();
        this.f19987h = parcel.readString();
        this.f19988i = parcel.readString();
        this.f19989j = parcel.readString();
        this.f19990k = parcel.readString();
        this.f19991l = parcel.readString();
        this.f19994o = parcel.readDouble();
        this.f19992m = parcel.readString();
        this.f19993n = parcel.readString();
    }

    public LocationModel(String str, double d, double d2, String str2, String str3, String str4, String str5) {
        this.f19980a = str;
        this.f19981b = d;
        this.f19982c = d2;
        this.f19988i = str2;
        this.f19989j = str3;
        this.f19990k = str4;
        this.f19991l = str5;
    }

    /* renamed from: a */
    public int compareTo(LocationModel locationModel) {
        if (this.f19994o < locationModel.f19994o) {
            return -1;
        }
        return this.f19994o == locationModel.f19994o ? 0 : 1;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f19980a);
        parcel.writeDouble(this.f19981b);
        parcel.writeDouble(this.f19982c);
        parcel.writeString(this.f19983d);
        parcel.writeString(this.f19984e);
        parcel.writeString(this.f19985f);
        parcel.writeString(this.f19986g);
        parcel.writeString(this.f19987h);
        parcel.writeString(this.f19988i);
        parcel.writeString(this.f19989j);
        parcel.writeString(this.f19990k);
        parcel.writeString(this.f19991l);
        parcel.writeDouble(this.f19994o);
        parcel.writeString(this.f19992m);
        parcel.writeString(this.f19993n);
    }
}
