package com.facebook.share.model;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.share.model.ShareMedia.C2362a;
import com.facebook.share.model.ShareMedia.Type;
import java.util.ArrayList;
import java.util.List;

public final class SharePhoto extends ShareMedia {
    public static final Creator<SharePhoto> CREATOR = new Creator<SharePhoto>() {
        /* renamed from: a */
        public SharePhoto createFromParcel(Parcel parcel) {
            return new SharePhoto(parcel);
        }

        /* renamed from: a */
        public SharePhoto[] newArray(int i) {
            return new SharePhoto[i];
        }
    };

    /* renamed from: a */
    private final Bitmap f7535a;

    /* renamed from: b */
    private final Uri f7536b;

    /* renamed from: c */
    private final boolean f7537c;

    /* renamed from: d */
    private final String f7538d;

    /* renamed from: com.facebook.share.model.SharePhoto$a */
    public static final class C2375a extends C2362a<SharePhoto, C2375a> {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public Bitmap f7539a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public Uri f7540b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public boolean f7541c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public String f7542d;

        /* renamed from: a */
        static void m11060a(Parcel parcel, int i, List<SharePhoto> list) {
            ShareMedia[] shareMediaArr = new ShareMedia[list.size()];
            for (int i2 = 0; i2 < list.size(); i2++) {
                shareMediaArr[i2] = (ShareMedia) list.get(i2);
            }
            parcel.writeParcelableArray(shareMediaArr, i);
        }

        /* renamed from: c */
        static List<SharePhoto> m11062c(Parcel parcel) {
            List<ShareMedia> a = m10995a(parcel);
            ArrayList arrayList = new ArrayList();
            for (ShareMedia shareMedia : a) {
                if (shareMedia instanceof SharePhoto) {
                    arrayList.add((SharePhoto) shareMedia);
                }
            }
            return arrayList;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public Uri mo8313a() {
            return this.f7540b;
        }

        /* renamed from: a */
        public C2375a mo8314a(Bitmap bitmap) {
            this.f7539a = bitmap;
            return this;
        }

        /* renamed from: a */
        public C2375a mo8315a(Uri uri) {
            this.f7540b = uri;
            return this;
        }

        /* renamed from: a */
        public C2375a mo8228a(SharePhoto sharePhoto) {
            return sharePhoto == null ? this : ((C2375a) super.mo8228a(sharePhoto)).mo8314a(sharePhoto.mo8305c()).mo8315a(sharePhoto.mo8306d()).mo8318a(sharePhoto.mo8307e()).mo8317a(sharePhoto.mo8308f());
        }

        /* renamed from: a */
        public C2375a mo8317a(String str) {
            this.f7542d = str;
            return this;
        }

        /* renamed from: a */
        public C2375a mo8318a(boolean z) {
            this.f7541c = z;
            return this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public Bitmap mo8319b() {
            return this.f7539a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public C2375a mo8320b(Parcel parcel) {
            return mo8228a((SharePhoto) parcel.readParcelable(SharePhoto.class.getClassLoader()));
        }

        /* renamed from: c */
        public SharePhoto mo8321c() {
            return new SharePhoto(this);
        }
    }

    SharePhoto(Parcel parcel) {
        super(parcel);
        this.f7535a = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
        this.f7536b = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f7537c = parcel.readByte() != 0;
        this.f7538d = parcel.readString();
    }

    private SharePhoto(C2375a aVar) {
        super((C2362a) aVar);
        this.f7535a = aVar.f7539a;
        this.f7536b = aVar.f7540b;
        this.f7537c = aVar.f7541c;
        this.f7538d = aVar.f7542d;
    }

    /* renamed from: b */
    public Type mo8224b() {
        return Type.PHOTO;
    }

    /* renamed from: c */
    public Bitmap mo8305c() {
        return this.f7535a;
    }

    /* renamed from: d */
    public Uri mo8306d() {
        return this.f7536b;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public boolean mo8307e() {
        return this.f7537c;
    }

    /* renamed from: f */
    public String mo8308f() {
        return this.f7538d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f7535a, 0);
        parcel.writeParcelable(this.f7536b, 0);
        parcel.writeByte(this.f7537c ? (byte) 1 : 0);
        parcel.writeString(this.f7538d);
    }
}
