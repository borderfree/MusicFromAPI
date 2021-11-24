package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.share.model.SharePhoto.C2375a;
import com.facebook.share.model.ShareVideo.C2379a;

public final class ShareVideoContent extends ShareContent<ShareVideoContent, Object> implements ShareModel {
    public static final Creator<ShareVideoContent> CREATOR = new Creator<ShareVideoContent>() {
        /* renamed from: a */
        public ShareVideoContent createFromParcel(Parcel parcel) {
            return new ShareVideoContent(parcel);
        }

        /* renamed from: a */
        public ShareVideoContent[] newArray(int i) {
            return new ShareVideoContent[i];
        }
    };

    /* renamed from: a */
    private final String f7547a;

    /* renamed from: b */
    private final String f7548b;

    /* renamed from: c */
    private final SharePhoto f7549c;

    /* renamed from: d */
    private final ShareVideo f7550d;

    ShareVideoContent(Parcel parcel) {
        super(parcel);
        this.f7547a = parcel.readString();
        this.f7548b = parcel.readString();
        C2375a b = new C2375a().mo8320b(parcel);
        this.f7549c = (b.mo8313a() == null && b.mo8319b() == null) ? null : b.mo8321c();
        this.f7550d = new C2379a().mo8340b(parcel).mo8339a();
    }

    /* renamed from: a */
    public String mo8341a() {
        return this.f7547a;
    }

    /* renamed from: b */
    public String mo8342b() {
        return this.f7548b;
    }

    /* renamed from: c */
    public SharePhoto mo8343c() {
        return this.f7549c;
    }

    /* renamed from: d */
    public ShareVideo mo8344d() {
        return this.f7550d;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f7547a);
        parcel.writeString(this.f7548b);
        parcel.writeParcelable(this.f7549c, 0);
        parcel.writeParcelable(this.f7550d, 0);
    }
}
