package android.support.p009v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: android.support.v4.app.FragmentManagerState */
final class FragmentManagerState implements Parcelable {
    public static final Creator<FragmentManagerState> CREATOR = new Creator<FragmentManagerState>() {
        /* renamed from: a */
        public FragmentManagerState createFromParcel(Parcel parcel) {
            return new FragmentManagerState(parcel);
        }

        /* renamed from: a */
        public FragmentManagerState[] newArray(int i) {
            return new FragmentManagerState[i];
        }
    };

    /* renamed from: a */
    FragmentState[] f975a;

    /* renamed from: b */
    int[] f976b;

    /* renamed from: c */
    BackStackState[] f977c;

    /* renamed from: d */
    int f978d = -1;

    /* renamed from: e */
    int f979e;

    public FragmentManagerState() {
    }

    public FragmentManagerState(Parcel parcel) {
        this.f975a = (FragmentState[]) parcel.createTypedArray(FragmentState.CREATOR);
        this.f976b = parcel.createIntArray();
        this.f977c = (BackStackState[]) parcel.createTypedArray(BackStackState.CREATOR);
        this.f978d = parcel.readInt();
        this.f979e = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedArray(this.f975a, i);
        parcel.writeIntArray(this.f976b);
        parcel.writeTypedArray(this.f977c, i);
        parcel.writeInt(this.f978d);
        parcel.writeInt(this.f979e);
    }
}
