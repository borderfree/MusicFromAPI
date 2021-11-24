package android.support.p009v4.view;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;

/* renamed from: android.support.v4.view.AbsSavedState */
public abstract class AbsSavedState implements Parcelable {
    public static final Creator<AbsSavedState> CREATOR = new ClassLoaderCreator<AbsSavedState>() {
        /* renamed from: a */
        public AbsSavedState createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        /* renamed from: a */
        public AbsSavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return AbsSavedState.f1610d;
            }
            throw new IllegalStateException("superState must be null");
        }

        /* renamed from: a */
        public AbsSavedState[] newArray(int i) {
            return new AbsSavedState[i];
        }
    };

    /* renamed from: d */
    public static final AbsSavedState f1610d = new AbsSavedState() {
    };

    /* renamed from: a */
    private final Parcelable f1611a;

    private AbsSavedState() {
        this.f1611a = null;
    }

    protected AbsSavedState(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        if (readParcelable == null) {
            readParcelable = f1610d;
        }
        this.f1611a = readParcelable;
    }

    protected AbsSavedState(Parcelable parcelable) {
        if (parcelable != null) {
            if (parcelable == f1610d) {
                parcelable = null;
            }
            this.f1611a = parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    /* renamed from: a */
    public final Parcelable mo2234a() {
        return this.f1611a;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f1611a, i);
    }
}
