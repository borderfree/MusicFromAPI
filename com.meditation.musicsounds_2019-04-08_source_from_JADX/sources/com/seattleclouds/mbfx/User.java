package com.seattleclouds.mbfx;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

public class User implements Parcelable {
    public static final Creator<User> CREATOR = new Creator<User>() {
        /* renamed from: a */
        public User createFromParcel(Parcel parcel) {
            return new User(parcel);
        }

        /* renamed from: a */
        public User[] newArray(int i) {
            return new User[i];
        }
    };

    /* renamed from: a */
    public String f19448a;

    /* renamed from: b */
    public boolean f19449b;

    /* renamed from: c */
    public String f19450c;

    /* renamed from: d */
    public String f19451d;

    /* renamed from: e */
    public String f19452e;

    /* renamed from: f */
    public String f19453f;

    /* renamed from: g */
    public String f19454g;

    /* renamed from: h */
    public String f19455h;

    /* renamed from: i */
    public String f19456i;

    /* renamed from: j */
    public String f19457j;

    /* renamed from: k */
    public String f19458k;

    /* renamed from: l */
    public String f19459l;

    public User() {
        this.f19448a = null;
        this.f19449b = false;
        this.f19450c = null;
        this.f19451d = null;
        this.f19452e = null;
        this.f19453f = null;
        this.f19454g = null;
        this.f19455h = null;
        this.f19456i = null;
        this.f19457j = null;
        this.f19458k = null;
        this.f19459l = null;
    }

    private User(Parcel parcel) {
        this.f19448a = null;
        boolean z = false;
        this.f19449b = false;
        this.f19450c = null;
        this.f19451d = null;
        this.f19452e = null;
        this.f19453f = null;
        this.f19454g = null;
        this.f19455h = null;
        this.f19456i = null;
        this.f19457j = null;
        this.f19458k = null;
        this.f19459l = null;
        this.f19448a = parcel.readString();
        if (parcel.readInt() != 0) {
            z = true;
        }
        this.f19449b = z;
        this.f19450c = parcel.readString();
        this.f19451d = parcel.readString();
        this.f19452e = parcel.readString();
        this.f19453f = parcel.readString();
        this.f19454g = parcel.readString();
        this.f19455h = parcel.readString();
        this.f19456i = parcel.readString();
        this.f19457j = parcel.readString();
        this.f19458k = parcel.readString();
        this.f19459l = parcel.readString();
    }

    /* renamed from: a */
    public JSONObject mo17770a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("username", this.f19448a == null ? "" : this.f19448a);
            jSONObject.put("firstName", this.f19450c == null ? "" : this.f19450c);
            jSONObject.put("lastName", this.f19451d == null ? "" : this.f19451d);
            jSONObject.put("userid", this.f19452e == null ? "" : this.f19452e);
        } catch (JSONException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("getJSONDictionary: ");
            sb.append(e);
            Log.e("User", sb.toString());
        }
        return jSONObject;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f19448a);
        parcel.writeInt(this.f19449b ? 1 : 0);
        parcel.writeString(this.f19450c);
        parcel.writeString(this.f19451d);
        parcel.writeString(this.f19452e);
        parcel.writeString(this.f19453f);
        parcel.writeString(this.f19454g);
        parcel.writeString(this.f19455h);
        parcel.writeString(this.f19456i);
        parcel.writeString(this.f19457j);
        parcel.writeString(this.f19458k);
        parcel.writeString(this.f19459l);
    }
}
