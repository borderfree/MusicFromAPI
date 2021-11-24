package android.support.p009v4.media;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: android.support.v4.media.RatingCompat */
public final class RatingCompat implements Parcelable {
    public static final Creator<RatingCompat> CREATOR = new Creator<RatingCompat>() {
        /* renamed from: a */
        public RatingCompat createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        /* renamed from: a */
        public RatingCompat[] newArray(int i) {
            return new RatingCompat[i];
        }
    };

    /* renamed from: a */
    private final int f1553a;

    /* renamed from: b */
    private final float f1554b;

    RatingCompat(int i, float f) {
        this.f1553a = i;
        this.f1554b = f;
    }

    public int describeContents() {
        return this.f1553a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Rating:style=");
        sb.append(this.f1553a);
        sb.append(" rating=");
        sb.append(this.f1554b < 0.0f ? "unrated" : String.valueOf(this.f1554b));
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f1553a);
        parcel.writeFloat(this.f1554b);
    }
}
