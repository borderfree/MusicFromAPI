package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.share.model.ShareMedia.C2362a;
import com.facebook.share.model.ShareMedia.Type;

public final class ShareVideo extends ShareMedia {
    public static final Creator<ShareVideo> CREATOR = new Creator<ShareVideo>() {
        /* renamed from: a */
        public ShareVideo createFromParcel(Parcel parcel) {
            return new ShareVideo(parcel);
        }

        /* renamed from: a */
        public ShareVideo[] newArray(int i) {
            return new ShareVideo[i];
        }
    };

    /* renamed from: a */
    private final Uri f7545a;

    /* renamed from: com.facebook.share.model.ShareVideo$a */
    public static final class C2379a extends C2362a<ShareVideo, C2379a> {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public Uri f7546a;

        /* renamed from: a */
        public C2379a mo8337a(Uri uri) {
            this.f7546a = uri;
            return this;
        }

        /* renamed from: a */
        public C2379a mo8228a(ShareVideo shareVideo) {
            return shareVideo == null ? this : ((C2379a) super.mo8228a(shareVideo)).mo8337a(shareVideo.mo8332c());
        }

        /* renamed from: a */
        public ShareVideo mo8339a() {
            return new ShareVideo(this);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public C2379a mo8340b(Parcel parcel) {
            return mo8228a((ShareVideo) parcel.readParcelable(ShareVideo.class.getClassLoader()));
        }
    }

    ShareVideo(Parcel parcel) {
        super(parcel);
        this.f7545a = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
    }

    private ShareVideo(C2379a aVar) {
        super((C2362a) aVar);
        this.f7545a = aVar.f7546a;
    }

    /* renamed from: b */
    public Type mo8224b() {
        return Type.VIDEO;
    }

    /* renamed from: c */
    public Uri mo8332c() {
        return this.f7545a;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f7545a, 0);
    }
}
