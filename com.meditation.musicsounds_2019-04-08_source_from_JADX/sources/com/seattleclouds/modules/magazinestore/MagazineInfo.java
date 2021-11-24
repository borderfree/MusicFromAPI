package com.seattleclouds.modules.magazinestore;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.text.DateFormat;
import java.util.Date;
import org.xml.sax.Attributes;

public class MagazineInfo implements Parcelable {
    public static final Creator<MagazineInfo> CREATOR = new Creator<MagazineInfo>() {
        /* renamed from: a */
        public MagazineInfo createFromParcel(Parcel parcel) {
            return new MagazineInfo(parcel);
        }

        /* renamed from: a */
        public MagazineInfo[] newArray(int i) {
            return new MagazineInfo[i];
        }
    };

    /* renamed from: i */
    private static DateFormat f20642i = DateFormat.getDateInstance(2);

    /* renamed from: a */
    public String f20643a;

    /* renamed from: b */
    public String f20644b;

    /* renamed from: c */
    public String f20645c;

    /* renamed from: d */
    public Date f20646d;

    /* renamed from: e */
    public String f20647e;

    /* renamed from: f */
    public String f20648f;

    /* renamed from: g */
    public boolean f20649g = false;

    /* renamed from: h */
    public String f20650h;

    public MagazineInfo() {
    }

    public MagazineInfo(Parcel parcel) {
        boolean z = false;
        this.f20643a = parcel.readString();
        this.f20644b = parcel.readString();
        this.f20645c = parcel.readString();
        this.f20646d = new Date(parcel.readLong());
        this.f20647e = parcel.readString();
        this.f20648f = parcel.readString();
        if (parcel.readInt() == 1) {
            z = true;
        }
        this.f20649g = z;
        this.f20650h = parcel.readString();
    }

    public MagazineInfo(Attributes attributes) {
        this.f20643a = attributes.getValue("title");
        this.f20644b = attributes.getValue("coverName");
        this.f20647e = attributes.getValue("pageToOpen");
        mo18559a(attributes.getValue("publishDate"));
        this.f20648f = attributes.getValue("productIdentifier");
        if (this.f20648f != null) {
            this.f20648f = this.f20648f.trim();
        }
    }

    /* renamed from: a */
    public void mo18559a(String str) {
        long j;
        try {
            j = Long.parseLong(str.trim()) * 1000;
        } catch (Exception unused) {
            j = 0;
        }
        this.f20646d = new Date(j);
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        String trim = this.f20645c != null ? this.f20645c.trim() : "";
        trim.replace("\n", "\\n");
        if (trim.length() > 21) {
            trim = trim.substring(0, 20);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("MagazineInfo [title=");
        sb.append(this.f20643a);
        sb.append(", coverName=");
        sb.append(this.f20644b);
        sb.append(", description=");
        sb.append(trim);
        sb.append(", publishDate=");
        sb.append(f20642i.format(this.f20646d));
        sb.append(", contentPage=");
        sb.append(this.f20647e);
        sb.append(", productIdentifier=");
        sb.append(this.f20648f);
        sb.append(", productPrice=");
        sb.append(this.f20650h);
        sb.append(", productOwned=");
        sb.append(this.f20649g);
        sb.append("]");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f20643a);
        parcel.writeString(this.f20644b);
        parcel.writeString(this.f20645c);
        parcel.writeLong(this.f20646d.getTime());
        parcel.writeString(this.f20647e);
        parcel.writeString(this.f20648f);
        parcel.writeInt(this.f20649g ? 1 : 0);
        parcel.writeString(this.f20650h);
    }
}
