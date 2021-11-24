package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public class ShareHashtag implements ShareModel {
    public static final Creator<ShareHashtag> CREATOR = new Creator<ShareHashtag>() {
        /* renamed from: a */
        public ShareHashtag createFromParcel(Parcel parcel) {
            return new ShareHashtag(parcel);
        }

        /* renamed from: a */
        public ShareHashtag[] newArray(int i) {
            return new ShareHashtag[i];
        }
    };

    /* renamed from: a */
    private final String f7493a;

    /* renamed from: com.facebook.share.model.ShareHashtag$a */
    public static class C2359a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public String f7494a;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C2359a mo8205a(Parcel parcel) {
            return mo8206a((ShareHashtag) parcel.readParcelable(ShareHashtag.class.getClassLoader()));
        }

        /* renamed from: a */
        public C2359a mo8206a(ShareHashtag shareHashtag) {
            return shareHashtag == null ? this : mo8207a(shareHashtag.mo8198a());
        }

        /* renamed from: a */
        public C2359a mo8207a(String str) {
            this.f7494a = str;
            return this;
        }

        /* renamed from: a */
        public ShareHashtag mo8208a() {
            return new ShareHashtag(this);
        }
    }

    ShareHashtag(Parcel parcel) {
        this.f7493a = parcel.readString();
    }

    private ShareHashtag(C2359a aVar) {
        this.f7493a = aVar.f7494a;
    }

    /* renamed from: a */
    public String mo8198a() {
        return this.f7493a;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7493a);
    }
}
