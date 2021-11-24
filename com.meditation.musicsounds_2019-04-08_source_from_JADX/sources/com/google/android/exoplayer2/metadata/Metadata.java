package com.google.android.exoplayer2.metadata;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Arrays;
import java.util.List;

public final class Metadata implements Parcelable {
    public static final Creator<Metadata> CREATOR = new Creator<Metadata>() {
        /* renamed from: a */
        public Metadata createFromParcel(Parcel parcel) {
            return new Metadata(parcel);
        }

        /* renamed from: a */
        public Metadata[] newArray(int i) {
            return new Metadata[0];
        }
    };

    /* renamed from: a */
    private final Entry[] f9174a;

    public interface Entry extends Parcelable {
    }

    Metadata(Parcel parcel) {
        this.f9174a = new Entry[parcel.readInt()];
        for (int i = 0; i < this.f9174a.length; i++) {
            this.f9174a[i] = (Entry) parcel.readParcelable(Entry.class.getClassLoader());
        }
    }

    public Metadata(List<? extends Entry> list) {
        if (list != null) {
            this.f9174a = new Entry[list.size()];
            list.toArray(this.f9174a);
            return;
        }
        this.f9174a = new Entry[0];
    }

    public Metadata(Entry... entryArr) {
        if (entryArr == null) {
            entryArr = new Entry[0];
        }
        this.f9174a = entryArr;
    }

    /* renamed from: a */
    public int mo9181a() {
        return this.f9174a.length;
    }

    /* renamed from: a */
    public Entry mo9182a(int i) {
        return this.f9174a[i];
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f9174a, ((Metadata) obj).f9174a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f9174a);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f9174a.length);
        for (Entry writeParcelable : this.f9174a) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }
}
