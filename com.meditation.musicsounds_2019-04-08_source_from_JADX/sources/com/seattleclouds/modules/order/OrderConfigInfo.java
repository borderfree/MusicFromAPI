package com.seattleclouds.modules.order;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import org.xml.sax.Attributes;

public class OrderConfigInfo implements Parcelable {
    public static final Creator<OrderConfigInfo> CREATOR = new Creator<OrderConfigInfo>() {
        /* renamed from: a */
        public OrderConfigInfo createFromParcel(Parcel parcel) {
            return new OrderConfigInfo(parcel);
        }

        /* renamed from: a */
        public OrderConfigInfo[] newArray(int i) {
            return new OrderConfigInfo[i];
        }
    };

    /* renamed from: a */
    private double f21036a;

    /* renamed from: b */
    private double f21037b;

    /* renamed from: c */
    private double f21038c;

    /* renamed from: d */
    private String f21039d;

    /* renamed from: e */
    private String f21040e;

    /* renamed from: f */
    private String f21041f;

    /* renamed from: g */
    private int f21042g;

    /* renamed from: h */
    private String f21043h;

    /* renamed from: i */
    private boolean f21044i;

    /* renamed from: j */
    private boolean f21045j;

    /* renamed from: k */
    private boolean f21046k;

    /* renamed from: l */
    private String f21047l;

    /* renamed from: m */
    private String f21048m;

    /* renamed from: n */
    private String f21049n;

    /* renamed from: o */
    private String f21050o;

    /* renamed from: p */
    private String f21051p;

    /* renamed from: q */
    private String f21052q;

    public OrderConfigInfo() {
        this.f21036a = 0.0d;
        this.f21039d = "The order will be ready in 30 min";
        this.f21040e = "The order will be delivered in 30 min";
        this.f21042g = 0;
        this.f21041f = "";
        this.f21037b = 0.0d;
        this.f21038c = 0.0d;
        this.f21043h = "USD";
        this.f21044i = true;
        this.f21045j = true;
        this.f21049n = "Mobile order";
        this.f21050o = "";
        this.f21051p = "Mobile order";
        this.f21052q = "";
    }

    public OrderConfigInfo(Parcel parcel) {
        this.f21036a = parcel.readDouble();
        this.f21037b = parcel.readDouble();
        this.f21038c = parcel.readDouble();
        this.f21039d = parcel.readString();
        this.f21040e = parcel.readString();
        this.f21041f = parcel.readString();
        this.f21042g = parcel.readInt();
        this.f21043h = parcel.readString();
        boolean z = false;
        this.f21044i = parcel.readByte() == 1;
        this.f21045j = parcel.readByte() == 1;
        this.f21050o = parcel.readString();
        this.f21052q = parcel.readString();
        this.f21051p = parcel.readString();
        if (parcel.readByte() == 1) {
            z = true;
        }
        this.f21046k = z;
        this.f21047l = parcel.readString();
        this.f21048m = parcel.readString();
        this.f21049n = parcel.readString();
    }

    /* renamed from: a */
    public double mo18803a() {
        return this.f21036a;
    }

    /* renamed from: a */
    public void mo18804a(String str) {
        this.f21041f = str;
    }

    /* renamed from: a */
    public void mo18805a(Attributes attributes) {
        String[] split;
        if (attributes != null) {
            try {
                String value = attributes.getValue("orderTaxPercent");
                if (!(value == null || value.length() == 0)) {
                    this.f21036a = Double.parseDouble(value);
                }
            } catch (NumberFormatException unused) {
                this.f21036a = 0.0d;
            }
            try {
                String value2 = attributes.getValue("deliveryPrice");
                if (!(value2 == null || value2.length() == 0)) {
                    this.f21037b = Double.parseDouble(value2);
                }
            } catch (NumberFormatException unused2) {
                this.f21037b = 0.0d;
            }
            try {
                String value3 = attributes.getValue("freeDelivery");
                if (!(value3 == null || value3.length() == 0)) {
                    this.f21038c = Double.parseDouble(value3);
                }
            } catch (NumberFormatException unused3) {
                this.f21038c = 0.0d;
            }
            String value4 = attributes.getValue("deliveryMethodPickupMessage");
            if (!(value4 == null || value4.length() == 0)) {
                this.f21039d = value4;
            }
            String value5 = attributes.getValue("deliveryMethodDeliverMessage");
            if (!(value5 == null || value5.length() == 0)) {
                this.f21040e = value5;
            }
            String value6 = attributes.getValue("paymentMethods");
            if (!(value6 == null || value6.length() == 0)) {
                for (String str : value6.split(",")) {
                    if (str.equalsIgnoreCase("cash")) {
                        this.f21042g |= 1;
                    }
                    if (str.equalsIgnoreCase("pod")) {
                        this.f21042g |= 32;
                    }
                    if (str.equalsIgnoreCase("authorizeNet")) {
                        this.f21042g |= 2;
                    }
                    if (str.equalsIgnoreCase("payPal")) {
                        this.f21042g |= 4;
                    }
                    if (str.equalsIgnoreCase("payPalSDK")) {
                        this.f21042g |= 16;
                    }
                    if (str.equalsIgnoreCase("indiaPay")) {
                        this.f21042g |= 64;
                    }
                }
            }
            if (this.f21042g == 0) {
                this.f21042g = 1;
            }
            String value7 = attributes.getValue("currencyCode");
            if (!(value7 == null || value7.length() == 0)) {
                this.f21043h = value7;
            }
            String value8 = attributes.getValue("deliveryEnabled");
            if (!(value8 == null || value8.length() == 0)) {
                this.f21044i = Boolean.parseBoolean(value8);
            }
            String value9 = attributes.getValue("pickUpEnabled");
            if (!(value9 == null || value9.length() == 0)) {
                this.f21045j = Boolean.parseBoolean(value9);
            }
            String value10 = attributes.getValue("indiaPayMerchantId");
            if (!(value10 == null || value10.length() == 0)) {
                this.f21050o = value10;
            }
            String value11 = attributes.getValue("indiaPayTransactionDescription");
            if (!(value11 == null || value11.length() == 0)) {
                this.f21051p = value11;
            }
            String value12 = attributes.getValue("indiaPayExpiryTxn");
            if (!(value12 == null || value12.length() == 0)) {
                this.f21052q = value12;
            }
            String value13 = attributes.getValue("payPalSandboxModeEnabled");
            if (!(value13 == null || value13.length() == 0)) {
                this.f21046k = Boolean.parseBoolean(value13);
            }
            String value14 = attributes.getValue("payPalSDKClientId");
            if (!(value14 == null || value14.length() == 0)) {
                this.f21047l = value14;
            }
            String value15 = attributes.getValue("payPalSDKClientIdSandbox");
            if (!(value15 == null || value15.length() == 0)) {
                this.f21048m = value15;
            }
            String value16 = attributes.getValue("payPalSDKTransactionDescription");
            if (value16 != null && value16.length() != 0) {
                this.f21049n = value16;
            }
        }
    }

    /* renamed from: b */
    public String mo18806b() {
        return this.f21039d;
    }

    /* renamed from: c */
    public String mo18807c() {
        return this.f21040e;
    }

    /* renamed from: d */
    public int mo18808d() {
        return this.f21042g;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public double mo18810e() {
        return this.f21037b;
    }

    /* renamed from: f */
    public double mo18811f() {
        return this.f21038c;
    }

    /* renamed from: g */
    public String mo18812g() {
        return this.f21043h;
    }

    /* renamed from: h */
    public String mo18813h() {
        return this.f21050o;
    }

    /* renamed from: i */
    public String mo18814i() {
        return this.f21052q;
    }

    /* renamed from: j */
    public String mo18815j() {
        return this.f21051p;
    }

    /* renamed from: k */
    public boolean mo18816k() {
        return this.f21044i;
    }

    /* renamed from: l */
    public boolean mo18817l() {
        return this.f21045j;
    }

    /* renamed from: m */
    public boolean mo18818m() {
        return this.f21046k;
    }

    /* renamed from: n */
    public String mo18819n() {
        return this.f21046k ? this.f21048m : this.f21047l;
    }

    /* renamed from: o */
    public String mo18820o() {
        return this.f21049n;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.f21036a);
        parcel.writeDouble(this.f21037b);
        parcel.writeDouble(this.f21038c);
        parcel.writeString(this.f21039d);
        parcel.writeString(this.f21040e);
        parcel.writeString(this.f21041f);
        parcel.writeInt(this.f21042g);
        parcel.writeString(this.f21043h);
        parcel.writeByte(this.f21044i ? (byte) 1 : 0);
        parcel.writeByte(this.f21045j ? (byte) 1 : 0);
        parcel.writeString(this.f21050o);
        parcel.writeString(this.f21052q);
        parcel.writeString(this.f21051p);
        parcel.writeByte(this.f21046k ? (byte) 1 : 0);
        parcel.writeString(this.f21047l);
        parcel.writeString(this.f21048m);
        parcel.writeString(this.f21049n);
    }
}
