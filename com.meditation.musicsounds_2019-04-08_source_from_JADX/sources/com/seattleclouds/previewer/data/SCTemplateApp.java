package com.seattleclouds.previewer.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import org.json.JSONObject;

public class SCTemplateApp implements Parcelable {
    public static final Creator<SCTemplateApp> CREATOR = new Creator<SCTemplateApp>() {
        /* renamed from: a */
        public SCTemplateApp createFromParcel(Parcel parcel) {
            return new SCTemplateApp(parcel);
        }

        /* renamed from: a */
        public SCTemplateApp[] newArray(int i) {
            return new SCTemplateApp[i];
        }
    };

    /* renamed from: a */
    private JSONObject f22994a;

    /* renamed from: b */
    private String f22995b;

    /* renamed from: c */
    private String f22996c;

    /* renamed from: d */
    private String f22997d;

    /* renamed from: e */
    private String f22998e;

    /* renamed from: f */
    private String f22999f;

    /* renamed from: g */
    private String f23000g;

    /* renamed from: h */
    private int f23001h;

    private SCTemplateApp() {
        mo20136a("unknown");
        mo20146f("");
        mo20138b("");
        mo20142d("");
        mo20145e("");
        mo20135a(0);
    }

    protected SCTemplateApp(Parcel parcel) {
        this.f22995b = parcel.readString();
        this.f22997d = parcel.readString();
        this.f22996c = parcel.readString();
        this.f22998e = parcel.readString();
        this.f22999f = parcel.readString();
        this.f23000g = parcel.readString();
        this.f23001h = parcel.readInt();
    }

    public SCTemplateApp(JSONObject jSONObject) {
        this();
        mo20136a(jSONObject.getString("id"));
        mo20146f(jSONObject.getString("title"));
        mo20138b(jSONObject.getString("publisherId"));
        mo20142d(jSONObject.getString("description"));
        mo20145e(jSONObject.getString("languageKey"));
        mo20135a(jSONObject.getInt("gravity"));
        mo20140c(jSONObject.getString("iconUrl"));
        this.f22994a = jSONObject;
    }

    /* renamed from: a */
    public String mo20134a() {
        return this.f22995b;
    }

    /* renamed from: a */
    public void mo20135a(int i) {
        this.f23001h = i;
    }

    /* renamed from: a */
    public void mo20136a(String str) {
        this.f22995b = str;
    }

    /* renamed from: b */
    public String mo20137b() {
        return this.f22998e;
    }

    /* renamed from: b */
    public void mo20138b(String str) {
        this.f22996c = str;
    }

    /* renamed from: c */
    public String mo20139c() {
        return this.f22999f;
    }

    /* renamed from: c */
    public void mo20140c(String str) {
        this.f22998e = str;
    }

    /* renamed from: d */
    public String mo20141d() {
        return this.f23000g;
    }

    /* renamed from: d */
    public void mo20142d(String str) {
        this.f22999f = str;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public String mo20144e() {
        return this.f22997d;
    }

    /* renamed from: e */
    public void mo20145e(String str) {
        this.f23000g = str;
    }

    /* renamed from: f */
    public void mo20146f(String str) {
        this.f22997d = str;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f22995b);
        parcel.writeString(this.f22997d);
        parcel.writeString(this.f22996c);
        parcel.writeString(this.f22998e);
        parcel.writeString(this.f22999f);
        parcel.writeString(this.f23000g);
        parcel.writeInt(this.f23001h);
    }
}
