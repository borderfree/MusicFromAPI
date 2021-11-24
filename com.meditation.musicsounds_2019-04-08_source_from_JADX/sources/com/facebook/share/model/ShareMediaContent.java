package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;
import java.util.List;

public final class ShareMediaContent extends ShareContent<ShareMediaContent, Object> {
    public static final Creator<ShareMediaContent> CREATOR = new Creator<ShareMediaContent>() {
        /* renamed from: a */
        public ShareMediaContent createFromParcel(Parcel parcel) {
            return new ShareMediaContent(parcel);
        }

        /* renamed from: a */
        public ShareMediaContent[] newArray(int i) {
            return new ShareMediaContent[i];
        }
    };

    /* renamed from: a */
    private final List<ShareMedia> f7507a;

    ShareMediaContent(Parcel parcel) {
        super(parcel);
        this.f7507a = Arrays.asList((ShareMedia[]) parcel.readParcelableArray(ShareMedia.class.getClassLoader()));
    }

    /* renamed from: a */
    public List<ShareMedia> mo8229a() {
        return this.f7507a;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelableArray((ShareMedia[]) this.f7507a.toArray(), i);
    }
}
