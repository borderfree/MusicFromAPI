package com.seattleclouds.modules.esignature.utility;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Date;

public class Transaction implements Parcelable {
    public static final Creator<Transaction> CREATOR = new Creator<Transaction>() {
        /* renamed from: a */
        public Transaction createFromParcel(Parcel parcel) {
            return new Transaction(parcel);
        }

        /* renamed from: a */
        public Transaction[] newArray(int i) {
            return new Transaction[i];
        }
    };

    /* renamed from: a */
    private String f19934a;

    /* renamed from: b */
    private String f19935b;

    /* renamed from: c */
    private String f19936c;

    /* renamed from: d */
    private String f19937d;

    /* renamed from: e */
    private String f19938e;

    /* renamed from: f */
    private Date f19939f;

    /* renamed from: g */
    private Date f19940g;

    /* renamed from: h */
    private int f19941h;

    /* renamed from: i */
    private String f19942i;

    /* renamed from: j */
    private String f19943j;

    public Transaction() {
        this.f19939f = new Date();
        this.f19940g = new Date();
    }

    private Transaction(Parcel parcel) {
        this.f19939f = new Date();
        this.f19940g = new Date();
        this.f19934a = parcel.readString();
        this.f19935b = parcel.readString();
        this.f19936c = parcel.readString();
        this.f19937d = parcel.readString();
        this.f19938e = parcel.readString();
        this.f19939f = new Date(parcel.readLong());
        this.f19940g = new Date(parcel.readLong());
        this.f19941h = parcel.readInt();
        this.f19942i = parcel.readString();
        this.f19943j = parcel.readString();
    }

    /* renamed from: a */
    public String mo18112a() {
        return this.f19934a;
    }

    /* renamed from: a */
    public void mo18113a(int i) {
        this.f19941h = i;
    }

    /* renamed from: a */
    public void mo18114a(String str) {
        this.f19934a = str;
    }

    /* renamed from: a */
    public void mo18115a(Date date) {
        this.f19939f = date;
    }

    /* renamed from: b */
    public String mo18116b() {
        return this.f19937d;
    }

    /* renamed from: b */
    public void mo18117b(String str) {
        this.f19935b = str;
    }

    /* renamed from: b */
    public void mo18118b(Date date) {
        this.f19940g = date;
    }

    /* renamed from: c */
    public String mo18119c() {
        return this.f19938e;
    }

    /* renamed from: c */
    public void mo18120c(String str) {
        this.f19936c = str;
    }

    /* renamed from: d */
    public Date mo18121d() {
        return this.f19940g;
    }

    /* renamed from: d */
    public void mo18122d(String str) {
        this.f19937d = str;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public int mo18124e() {
        return this.f19941h;
    }

    /* renamed from: e */
    public void mo18125e(String str) {
        this.f19938e = str;
    }

    /* renamed from: f */
    public String mo18126f() {
        return this.f19942i;
    }

    /* renamed from: f */
    public void mo18127f(String str) {
        this.f19942i = str;
    }

    /* renamed from: g */
    public void mo18128g(String str) {
        this.f19943j = str;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f19934a);
        parcel.writeString(this.f19935b);
        parcel.writeString(this.f19936c);
        parcel.writeString(this.f19937d);
        parcel.writeString(this.f19938e);
        parcel.writeLong(this.f19939f.getTime());
        parcel.writeLong(this.f19940g.getTime());
        parcel.writeInt(this.f19941h);
        parcel.writeString(this.f19942i);
        parcel.writeString(this.f19943j);
    }
}
