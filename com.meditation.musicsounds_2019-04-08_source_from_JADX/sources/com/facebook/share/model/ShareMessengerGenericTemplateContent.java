package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class ShareMessengerGenericTemplateContent extends ShareContent<ShareMessengerGenericTemplateContent, Object> {
    public static final Creator<ShareMessengerGenericTemplateContent> CREATOR = new Creator<ShareMessengerGenericTemplateContent>() {
        /* renamed from: a */
        public ShareMessengerGenericTemplateContent createFromParcel(Parcel parcel) {
            return new ShareMessengerGenericTemplateContent(parcel);
        }

        /* renamed from: a */
        public ShareMessengerGenericTemplateContent[] newArray(int i) {
            return new ShareMessengerGenericTemplateContent[i];
        }
    };

    /* renamed from: a */
    private final boolean f7509a;

    /* renamed from: b */
    private final ImageAspectRatio f7510b;

    /* renamed from: c */
    private final ShareMessengerGenericTemplateElement f7511c;

    public enum ImageAspectRatio {
        HORIZONTAL,
        SQUARE
    }

    ShareMessengerGenericTemplateContent(Parcel parcel) {
        super(parcel);
        this.f7509a = parcel.readByte() != 0;
        this.f7510b = (ImageAspectRatio) parcel.readSerializable();
        this.f7511c = (ShareMessengerGenericTemplateElement) parcel.readParcelable(ShareMessengerGenericTemplateElement.class.getClassLoader());
    }

    /* renamed from: a */
    public boolean mo8237a() {
        return this.f7509a;
    }

    /* renamed from: b */
    public ImageAspectRatio mo8238b() {
        return this.f7510b;
    }

    /* renamed from: c */
    public ShareMessengerGenericTemplateElement mo8239c() {
        return this.f7511c;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.f7509a ? (byte) 1 : 0);
        parcel.writeSerializable(this.f7510b);
        parcel.writeParcelable(this.f7511c, i);
    }
}
