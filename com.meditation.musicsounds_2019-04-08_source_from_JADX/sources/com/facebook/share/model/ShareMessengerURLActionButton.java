package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class ShareMessengerURLActionButton extends ShareMessengerActionButton {
    public static final Creator<ShareMessengerURLActionButton> CREATOR = new Creator<ShareMessengerURLActionButton>() {
        /* renamed from: a */
        public ShareMessengerURLActionButton createFromParcel(Parcel parcel) {
            return new ShareMessengerURLActionButton(parcel);
        }

        /* renamed from: a */
        public ShareMessengerURLActionButton[] newArray(int i) {
            return new ShareMessengerURLActionButton[i];
        }
    };

    /* renamed from: a */
    private final Uri f7525a;

    /* renamed from: b */
    private final Uri f7526b;

    /* renamed from: c */
    private final boolean f7527c;

    /* renamed from: d */
    private final boolean f7528d;

    /* renamed from: e */
    private final WebviewHeightRatio f7529e;

    public enum WebviewHeightRatio {
        WebviewHeightRatioFull,
        WebviewHeightRatioTall,
        WebviewHeightRatioCompact
    }

    ShareMessengerURLActionButton(Parcel parcel) {
        super(parcel);
        this.f7525a = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        boolean z = false;
        this.f7527c = parcel.readByte() != 0;
        this.f7526b = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f7529e = (WebviewHeightRatio) parcel.readSerializable();
        if (parcel.readByte() != 0) {
            z = true;
        }
        this.f7528d = z;
    }

    /* renamed from: b */
    public Uri mo8269b() {
        return this.f7525a;
    }

    /* renamed from: c */
    public boolean mo8270c() {
        return this.f7527c;
    }

    /* renamed from: d */
    public Uri mo8271d() {
        return this.f7526b;
    }

    /* renamed from: e */
    public WebviewHeightRatio mo8272e() {
        return this.f7529e;
    }

    /* renamed from: f */
    public boolean mo8273f() {
        return this.f7528d;
    }
}
