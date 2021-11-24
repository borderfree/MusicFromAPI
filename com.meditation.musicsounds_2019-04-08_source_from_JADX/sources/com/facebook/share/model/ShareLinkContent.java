package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Log;
import com.facebook.share.model.ShareContent.C2357a;

public final class ShareLinkContent extends ShareContent<ShareLinkContent, C2361a> {
    public static final Creator<ShareLinkContent> CREATOR = new Creator<ShareLinkContent>() {
        /* renamed from: a */
        public ShareLinkContent createFromParcel(Parcel parcel) {
            return new ShareLinkContent(parcel);
        }

        /* renamed from: a */
        public ShareLinkContent[] newArray(int i) {
            return new ShareLinkContent[i];
        }
    };
    @Deprecated

    /* renamed from: a */
    private final String f7495a;
    @Deprecated

    /* renamed from: b */
    private final String f7496b;
    @Deprecated

    /* renamed from: c */
    private final Uri f7497c;

    /* renamed from: d */
    private final String f7498d;

    /* renamed from: com.facebook.share.model.ShareLinkContent$a */
    public static final class C2361a extends C2357a<ShareLinkContent, C2361a> {

        /* renamed from: a */
        static final String f7499a = "ShareLinkContent$a";
        /* access modifiers changed from: private */
        @Deprecated

        /* renamed from: b */
        public String f7500b;
        /* access modifiers changed from: private */
        @Deprecated

        /* renamed from: c */
        public String f7501c;
        /* access modifiers changed from: private */
        @Deprecated

        /* renamed from: d */
        public Uri f7502d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public String f7503e;

        /* renamed from: a */
        public C2361a mo8193a(ShareLinkContent shareLinkContent) {
            return shareLinkContent == null ? this : ((C2361a) super.mo8193a(shareLinkContent)).mo8220d(shareLinkContent.mo8209a()).mo8219b(shareLinkContent.mo8211c()).mo8221e(shareLinkContent.mo8210b()).mo8222f(shareLinkContent.mo8212d());
        }

        /* renamed from: a */
        public ShareLinkContent mo8218a() {
            return new ShareLinkContent(this);
        }

        @Deprecated
        /* renamed from: b */
        public C2361a mo8219b(Uri uri) {
            Log.w(f7499a, "This method does nothing. ImageUrl is deprecated in Graph API 2.9.");
            return this;
        }

        @Deprecated
        /* renamed from: d */
        public C2361a mo8220d(String str) {
            Log.w(f7499a, "This method does nothing. ContentDescription is deprecated in Graph API 2.9.");
            return this;
        }

        @Deprecated
        /* renamed from: e */
        public C2361a mo8221e(String str) {
            Log.w(f7499a, "This method does nothing. ContentTitle is deprecated in Graph API 2.9.");
            return this;
        }

        /* renamed from: f */
        public C2361a mo8222f(String str) {
            this.f7503e = str;
            return this;
        }
    }

    ShareLinkContent(Parcel parcel) {
        super(parcel);
        this.f7495a = parcel.readString();
        this.f7496b = parcel.readString();
        this.f7497c = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f7498d = parcel.readString();
    }

    private ShareLinkContent(C2361a aVar) {
        super((C2357a) aVar);
        this.f7495a = aVar.f7500b;
        this.f7496b = aVar.f7501c;
        this.f7497c = aVar.f7502d;
        this.f7498d = aVar.f7503e;
    }

    @Deprecated
    /* renamed from: a */
    public String mo8209a() {
        return this.f7495a;
    }

    @Deprecated
    /* renamed from: b */
    public String mo8210b() {
        return this.f7496b;
    }

    @Deprecated
    /* renamed from: c */
    public Uri mo8211c() {
        return this.f7497c;
    }

    /* renamed from: d */
    public String mo8212d() {
        return this.f7498d;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f7495a);
        parcel.writeString(this.f7496b);
        parcel.writeParcelable(this.f7497c, 0);
        parcel.writeString(this.f7498d);
    }
}
