package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.share.model.ShareOpenGraphValueContainer.C2373a;

public final class ShareOpenGraphAction extends ShareOpenGraphValueContainer<ShareOpenGraphAction, C2370a> {
    public static final Creator<ShareOpenGraphAction> CREATOR = new Creator<ShareOpenGraphAction>() {
        /* renamed from: a */
        public ShareOpenGraphAction createFromParcel(Parcel parcel) {
            return new ShareOpenGraphAction(parcel);
        }

        /* renamed from: a */
        public ShareOpenGraphAction[] newArray(int i) {
            return new ShareOpenGraphAction[i];
        }
    };

    /* renamed from: com.facebook.share.model.ShareOpenGraphAction$a */
    public static final class C2370a extends C2373a<ShareOpenGraphAction, C2370a> {
        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C2370a mo8283a(Parcel parcel) {
            return mo8287a((ShareOpenGraphAction) parcel.readParcelable(ShareOpenGraphAction.class.getClassLoader()));
        }

        /* renamed from: a */
        public C2370a mo8287a(ShareOpenGraphAction shareOpenGraphAction) {
            return shareOpenGraphAction == null ? this : ((C2370a) super.mo8287a(shareOpenGraphAction)).mo8285a(shareOpenGraphAction.mo8278a());
        }

        /* renamed from: a */
        public C2370a mo8285a(String str) {
            mo8304a("og:type", str);
            return this;
        }

        /* renamed from: a */
        public ShareOpenGraphAction mo8286a() {
            return new ShareOpenGraphAction(this);
        }
    }

    ShareOpenGraphAction(Parcel parcel) {
        super(parcel);
    }

    private ShareOpenGraphAction(C2370a aVar) {
        super((C2373a<P, E>) aVar);
    }

    /* renamed from: a */
    public String mo8278a() {
        return mo8300b("og:type");
    }
}
