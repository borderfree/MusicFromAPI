package com.seattleclouds.modules.photoeffect;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;

public class State implements Parcelable {
    public static final Creator<State> CREATOR = new Creator<State>() {
        /* renamed from: a */
        public State createFromParcel(Parcel parcel) {
            return new State(parcel);
        }

        /* renamed from: a */
        public State[] newArray(int i) {
            return new State[i];
        }
    };

    /* renamed from: a */
    public String f21447a;

    /* renamed from: b */
    public int f21448b = -1;

    /* renamed from: c */
    public ArrayList<MaskProperty> f21449c = new ArrayList<>();

    public State() {
    }

    protected State(Parcel parcel) {
        this.f21447a = parcel.readString();
        this.f21448b = parcel.readInt();
        if (parcel.readByte() == 1) {
            this.f21449c = new ArrayList<>();
            parcel.readList(this.f21449c, MaskProperty.class.getClassLoader());
            return;
        }
        this.f21449c = null;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f21447a);
        parcel.writeInt(this.f21448b);
        if (this.f21449c == null) {
            parcel.writeByte(0);
            return;
        }
        parcel.writeByte(1);
        parcel.writeList(this.f21449c);
    }
}
