package com.facebook.share.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.share.model.ShareContent;

public class ShareFeedContent extends ShareContent<ShareFeedContent, Object> {
    public static final Creator<ShareFeedContent> CREATOR = new Creator<ShareFeedContent>() {
        /* renamed from: a */
        public ShareFeedContent createFromParcel(Parcel parcel) {
            return new ShareFeedContent(parcel);
        }

        /* renamed from: a */
        public ShareFeedContent[] newArray(int i) {
            return new ShareFeedContent[i];
        }
    };

    /* renamed from: a */
    private final String f7451a;

    /* renamed from: b */
    private final String f7452b;

    /* renamed from: c */
    private final String f7453c;

    /* renamed from: d */
    private final String f7454d;

    /* renamed from: e */
    private final String f7455e;

    /* renamed from: f */
    private final String f7456f;

    /* renamed from: g */
    private final String f7457g;

    ShareFeedContent(Parcel parcel) {
        super(parcel);
        this.f7451a = parcel.readString();
        this.f7452b = parcel.readString();
        this.f7453c = parcel.readString();
        this.f7454d = parcel.readString();
        this.f7455e = parcel.readString();
        this.f7456f = parcel.readString();
        this.f7457g = parcel.readString();
    }

    /* renamed from: a */
    public String mo8118a() {
        return this.f7451a;
    }

    /* renamed from: b */
    public String mo8119b() {
        return this.f7452b;
    }

    /* renamed from: c */
    public String mo8120c() {
        return this.f7453c;
    }

    /* renamed from: d */
    public String mo8121d() {
        return this.f7454d;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public String mo8123e() {
        return this.f7455e;
    }

    /* renamed from: f */
    public String mo8124f() {
        return this.f7456f;
    }

    /* renamed from: g */
    public String mo8125g() {
        return this.f7457g;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f7451a);
        parcel.writeString(this.f7452b);
        parcel.writeString(this.f7453c);
        parcel.writeString(this.f7454d);
        parcel.writeString(this.f7455e);
        parcel.writeString(this.f7456f);
        parcel.writeString(this.f7457g);
    }
}
