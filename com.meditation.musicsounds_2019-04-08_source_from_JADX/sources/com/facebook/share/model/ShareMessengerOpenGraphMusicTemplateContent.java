package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class ShareMessengerOpenGraphMusicTemplateContent extends ShareContent<ShareMessengerOpenGraphMusicTemplateContent, Object> {
    public static final Creator<ShareMessengerOpenGraphMusicTemplateContent> CREATOR = new Creator<ShareMessengerOpenGraphMusicTemplateContent>() {
        /* renamed from: a */
        public ShareMessengerOpenGraphMusicTemplateContent createFromParcel(Parcel parcel) {
            return new ShareMessengerOpenGraphMusicTemplateContent(parcel);
        }

        /* renamed from: a */
        public ShareMessengerOpenGraphMusicTemplateContent[] newArray(int i) {
            return new ShareMessengerOpenGraphMusicTemplateContent[i];
        }
    };

    /* renamed from: a */
    private final Uri f7523a;

    /* renamed from: b */
    private final ShareMessengerActionButton f7524b;

    ShareMessengerOpenGraphMusicTemplateContent(Parcel parcel) {
        super(parcel);
        this.f7523a = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f7524b = (ShareMessengerActionButton) parcel.readParcelable(ShareMessengerActionButton.class.getClassLoader());
    }

    /* renamed from: a */
    public Uri mo8263a() {
        return this.f7523a;
    }

    /* renamed from: b */
    public ShareMessengerActionButton mo8264b() {
        return this.f7524b;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f7523a, i);
        parcel.writeParcelable(this.f7524b, i);
    }
}
