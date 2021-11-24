package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class ShareMessengerGenericTemplateElement implements ShareModel {
    public static final Creator<ShareMessengerGenericTemplateElement> CREATOR = new Creator<ShareMessengerGenericTemplateElement>() {
        /* renamed from: a */
        public ShareMessengerGenericTemplateElement createFromParcel(Parcel parcel) {
            return new ShareMessengerGenericTemplateElement(parcel);
        }

        /* renamed from: a */
        public ShareMessengerGenericTemplateElement[] newArray(int i) {
            return new ShareMessengerGenericTemplateElement[i];
        }
    };

    /* renamed from: a */
    private final String f7513a;

    /* renamed from: b */
    private final String f7514b;

    /* renamed from: c */
    private final Uri f7515c;

    /* renamed from: d */
    private final ShareMessengerActionButton f7516d;

    /* renamed from: e */
    private final ShareMessengerActionButton f7517e;

    ShareMessengerGenericTemplateElement(Parcel parcel) {
        this.f7513a = parcel.readString();
        this.f7514b = parcel.readString();
        this.f7515c = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f7516d = (ShareMessengerActionButton) parcel.readParcelable(ShareMessengerActionButton.class.getClassLoader());
        this.f7517e = (ShareMessengerActionButton) parcel.readParcelable(ShareMessengerActionButton.class.getClassLoader());
    }

    /* renamed from: a */
    public String mo8244a() {
        return this.f7513a;
    }

    /* renamed from: b */
    public String mo8245b() {
        return this.f7514b;
    }

    /* renamed from: c */
    public Uri mo8246c() {
        return this.f7515c;
    }

    /* renamed from: d */
    public ShareMessengerActionButton mo8247d() {
        return this.f7516d;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public ShareMessengerActionButton mo8249e() {
        return this.f7517e;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7513a);
        parcel.writeString(this.f7514b);
        parcel.writeParcelable(this.f7515c, i);
        parcel.writeParcelable(this.f7516d, i);
        parcel.writeParcelable(this.f7517e, i);
    }
}
