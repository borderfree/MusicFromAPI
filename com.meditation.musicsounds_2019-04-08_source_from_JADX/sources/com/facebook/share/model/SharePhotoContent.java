package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.share.model.ShareContent.C2357a;
import com.facebook.share.model.SharePhoto.C2375a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class SharePhotoContent extends ShareContent<SharePhotoContent, C2377a> {
    public static final Creator<SharePhotoContent> CREATOR = new Creator<SharePhotoContent>() {
        /* renamed from: a */
        public SharePhotoContent createFromParcel(Parcel parcel) {
            return new SharePhotoContent(parcel);
        }

        /* renamed from: a */
        public SharePhotoContent[] newArray(int i) {
            return new SharePhotoContent[i];
        }
    };

    /* renamed from: a */
    private final List<SharePhoto> f7543a;

    /* renamed from: com.facebook.share.model.SharePhotoContent$a */
    public static class C2377a extends C2357a<SharePhotoContent, C2377a> {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final List<SharePhoto> f7544a = new ArrayList();

        /* renamed from: a */
        public C2377a mo8327a(SharePhoto sharePhoto) {
            if (sharePhoto != null) {
                this.f7544a.add(new C2375a().mo8228a(sharePhoto).mo8321c());
            }
            return this;
        }

        /* renamed from: a */
        public C2377a mo8193a(SharePhotoContent sharePhotoContent) {
            return sharePhotoContent == null ? this : ((C2377a) super.mo8193a(sharePhotoContent)).mo8330b(sharePhotoContent.mo8322a());
        }

        /* renamed from: a */
        public SharePhotoContent mo8329a() {
            return new SharePhotoContent(this);
        }

        /* renamed from: b */
        public C2377a mo8330b(List<SharePhoto> list) {
            if (list != null) {
                for (SharePhoto a : list) {
                    mo8327a(a);
                }
            }
            return this;
        }

        /* renamed from: c */
        public C2377a mo8331c(List<SharePhoto> list) {
            this.f7544a.clear();
            mo8330b(list);
            return this;
        }
    }

    SharePhotoContent(Parcel parcel) {
        super(parcel);
        this.f7543a = Collections.unmodifiableList(C2375a.m11062c(parcel));
    }

    private SharePhotoContent(C2377a aVar) {
        super((C2357a) aVar);
        this.f7543a = Collections.unmodifiableList(aVar.f7544a);
    }

    /* renamed from: a */
    public List<SharePhoto> mo8322a() {
        return this.f7543a;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        C2375a.m11060a(parcel, i, this.f7543a);
    }
}
