package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.share.model.ShareOpenGraphAction.C2370a;

public final class ShareOpenGraphContent extends ShareContent<ShareOpenGraphContent, Object> {
    public static final Creator<ShareOpenGraphContent> CREATOR = new Creator<ShareOpenGraphContent>() {
        /* renamed from: a */
        public ShareOpenGraphContent createFromParcel(Parcel parcel) {
            return new ShareOpenGraphContent(parcel);
        }

        /* renamed from: a */
        public ShareOpenGraphContent[] newArray(int i) {
            return new ShareOpenGraphContent[i];
        }
    };

    /* renamed from: a */
    private final ShareOpenGraphAction f7531a;

    /* renamed from: b */
    private final String f7532b;

    ShareOpenGraphContent(Parcel parcel) {
        super(parcel);
        this.f7531a = new C2370a().mo8283a(parcel).mo8286a();
        this.f7532b = parcel.readString();
    }

    /* renamed from: a */
    public ShareOpenGraphAction mo8288a() {
        return this.f7531a;
    }

    /* renamed from: b */
    public String mo8289b() {
        return this.f7532b;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f7531a, 0);
        parcel.writeString(this.f7532b);
    }
}
