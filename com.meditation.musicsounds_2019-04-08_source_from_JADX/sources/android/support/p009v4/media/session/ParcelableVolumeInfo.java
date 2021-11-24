package android.support.p009v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: android.support.v4.media.session.ParcelableVolumeInfo */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Creator<ParcelableVolumeInfo> CREATOR = new Creator<ParcelableVolumeInfo>() {
        /* renamed from: a */
        public ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        /* renamed from: a */
        public ParcelableVolumeInfo[] newArray(int i) {
            return new ParcelableVolumeInfo[i];
        }
    };

    /* renamed from: a */
    public int f1577a;

    /* renamed from: b */
    public int f1578b;

    /* renamed from: c */
    public int f1579c;

    /* renamed from: d */
    public int f1580d;

    /* renamed from: e */
    public int f1581e;

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f1577a = parcel.readInt();
        this.f1579c = parcel.readInt();
        this.f1580d = parcel.readInt();
        this.f1581e = parcel.readInt();
        this.f1578b = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f1577a);
        parcel.writeInt(this.f1579c);
        parcel.writeInt(this.f1580d);
        parcel.writeInt(this.f1581e);
        parcel.writeInt(this.f1578b);
    }
}
