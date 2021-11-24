package com.seattleclouds.modules.videolist;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import org.xml.sax.Attributes;

public class OpenPdfOptions implements Parcelable {
    public static final Creator<OpenPdfOptions> CREATOR = new Creator<OpenPdfOptions>() {
        /* renamed from: a */
        public OpenPdfOptions createFromParcel(Parcel parcel) {
            return new OpenPdfOptions(parcel);
        }

        /* renamed from: a */
        public OpenPdfOptions[] newArray(int i) {
            return new OpenPdfOptions[i];
        }
    };

    /* renamed from: a */
    private Boolean f22373a;

    /* renamed from: b */
    private Boolean f22374b;

    public OpenPdfOptions() {
        this.f22373a = Boolean.valueOf(false);
        this.f22374b = Boolean.valueOf(true);
    }

    public OpenPdfOptions(Parcel parcel) {
        boolean z = false;
        this.f22373a = Boolean.valueOf(parcel.readByte() == 1);
        if (parcel.readByte() == 1) {
            z = true;
        }
        this.f22374b = Boolean.valueOf(z);
    }

    public OpenPdfOptions(Attributes attributes) {
        boolean parseBoolean;
        if (attributes == null) {
            this.f22373a = Boolean.valueOf(false);
            parseBoolean = true;
        } else {
            this.f22373a = Boolean.valueOf(Boolean.parseBoolean(attributes.getValue("openPdfInApp")));
            parseBoolean = Boolean.parseBoolean(attributes.getValue("openPdfInExternalApp"));
        }
        this.f22374b = Boolean.valueOf(parseBoolean);
    }

    /* renamed from: a */
    public Boolean mo19684a() {
        return this.f22373a;
    }

    /* renamed from: b */
    public Boolean mo19685b() {
        return this.f22374b;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.f22373a.booleanValue() ? (byte) 1 : 0);
        parcel.writeByte(this.f22374b.booleanValue() ? (byte) 1 : 0);
    }
}
