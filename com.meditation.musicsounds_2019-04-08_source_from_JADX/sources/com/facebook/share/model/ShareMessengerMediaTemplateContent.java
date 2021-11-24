package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class ShareMessengerMediaTemplateContent extends ShareContent<ShareMessengerMediaTemplateContent, Object> {
    public static final Creator<ShareMessengerMediaTemplateContent> CREATOR = new Creator<ShareMessengerMediaTemplateContent>() {
        /* renamed from: a */
        public ShareMessengerMediaTemplateContent createFromParcel(Parcel parcel) {
            return new ShareMessengerMediaTemplateContent(parcel);
        }

        /* renamed from: a */
        public ShareMessengerMediaTemplateContent[] newArray(int i) {
            return new ShareMessengerMediaTemplateContent[i];
        }
    };

    /* renamed from: a */
    private final MediaType f7518a;

    /* renamed from: b */
    private final String f7519b;

    /* renamed from: c */
    private final Uri f7520c;

    /* renamed from: d */
    private final ShareMessengerActionButton f7521d;

    public enum MediaType {
        IMAGE,
        VIDEO
    }

    ShareMessengerMediaTemplateContent(Parcel parcel) {
        super(parcel);
        this.f7518a = (MediaType) parcel.readSerializable();
        this.f7519b = parcel.readString();
        this.f7520c = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f7521d = (ShareMessengerActionButton) parcel.readParcelable(ShareMessengerActionButton.class.getClassLoader());
    }

    /* renamed from: a */
    public MediaType mo8255a() {
        return this.f7518a;
    }

    /* renamed from: b */
    public String mo8256b() {
        return this.f7519b;
    }

    /* renamed from: c */
    public Uri mo8257c() {
        return this.f7520c;
    }

    /* renamed from: d */
    public ShareMessengerActionButton mo8258d() {
        return this.f7521d;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.f7518a);
        parcel.writeString(this.f7519b);
        parcel.writeParcelable(this.f7520c, i);
        parcel.writeParcelable(this.f7521d, i);
    }
}
