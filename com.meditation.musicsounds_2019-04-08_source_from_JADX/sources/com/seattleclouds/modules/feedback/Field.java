package com.seattleclouds.modules.feedback;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Field implements Parcelable {
    public static final Creator<Field> CREATOR = new Creator<Field>() {
        /* renamed from: a */
        public Field createFromParcel(Parcel parcel) {
            return new Field(parcel);
        }

        /* renamed from: a */
        public Field[] newArray(int i) {
            return new Field[i];
        }
    };

    /* renamed from: a */
    public String f19966a;

    /* renamed from: b */
    public String f19967b;

    /* renamed from: c */
    public String f19968c;

    /* renamed from: d */
    public String f19969d;

    /* renamed from: e */
    public String f19970e;

    /* renamed from: f */
    public List<String> f19971f;

    /* renamed from: g */
    public Map<String, List<String>> f19972g;

    /* renamed from: h */
    public String f19973h;

    /* renamed from: i */
    public String f19974i;

    /* renamed from: j */
    public String f19975j;

    /* renamed from: k */
    public String f19976k;

    /* renamed from: l */
    public String f19977l;

    /* renamed from: m */
    public String f19978m;

    /* renamed from: n */
    public int f19979n;

    private Field(Parcel parcel) {
        this.f19966a = parcel.readString();
        this.f19967b = parcel.readString();
        this.f19968c = parcel.readString();
        this.f19969d = parcel.readString();
        this.f19970e = parcel.readString();
        this.f19971f = new ArrayList();
        parcel.readStringList(this.f19971f);
        this.f19973h = parcel.readString();
        this.f19976k = parcel.readString();
        this.f19974i = parcel.readString();
        this.f19975j = parcel.readString();
        this.f19977l = parcel.readString();
        this.f19972g = new HashMap();
        parcel.readMap(this.f19972g, Field.class.getClassLoader());
        this.f19979n = parcel.readInt();
    }

    public Field(String str) {
        this.f19966a = str;
        this.f19971f = new ArrayList();
        this.f19972g = new HashMap();
        this.f19979n = 4;
    }

    /* renamed from: a */
    public String mo18160a() {
        return this.f19966a;
    }

    /* renamed from: a */
    public void mo18161a(int i) {
        this.f19979n = i;
    }

    /* renamed from: a */
    public void mo18162a(String str) {
        this.f19967b = str;
    }

    /* renamed from: b */
    public String mo18163b() {
        return this.f19967b;
    }

    /* renamed from: b */
    public void mo18164b(String str) {
        this.f19968c = str;
    }

    /* renamed from: c */
    public String mo18165c() {
        return this.f19968c;
    }

    /* renamed from: c */
    public void mo18166c(String str) {
        this.f19969d = str;
    }

    /* renamed from: d */
    public String mo18167d() {
        return this.f19969d;
    }

    /* renamed from: d */
    public void mo18168d(String str) {
        this.f19973h = str;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public List<String> mo18170e() {
        return this.f19971f;
    }

    /* renamed from: e */
    public void mo18171e(String str) {
        this.f19974i = str;
    }

    /* renamed from: f */
    public String mo18172f() {
        return this.f19975j;
    }

    /* renamed from: f */
    public void mo18173f(String str) {
        this.f19975j = str;
    }

    /* renamed from: g */
    public String mo18174g() {
        return this.f19976k;
    }

    /* renamed from: g */
    public void mo18175g(String str) {
        this.f19976k = str;
    }

    /* renamed from: h */
    public Map<String, List<String>> mo18176h() {
        return this.f19972g;
    }

    /* renamed from: h */
    public void mo18177h(String str) {
        this.f19977l = str;
    }

    /* renamed from: i */
    public int mo18178i() {
        return this.f19979n;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f19966a);
        parcel.writeString(this.f19967b);
        parcel.writeString(this.f19968c);
        parcel.writeString(this.f19969d);
        parcel.writeString(this.f19970e);
        parcel.writeStringList(this.f19971f);
        parcel.writeString(this.f19973h);
        parcel.writeString(this.f19976k);
        parcel.writeString(this.f19974i);
        parcel.writeString(this.f19975j);
        parcel.writeString(this.f19977l);
        parcel.writeMap(this.f19972g);
        parcel.writeInt(this.f19979n);
    }
}
