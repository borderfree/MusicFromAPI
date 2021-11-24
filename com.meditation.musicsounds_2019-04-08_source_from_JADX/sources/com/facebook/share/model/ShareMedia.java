package com.facebook.share.model;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

public abstract class ShareMedia implements ShareModel {

    /* renamed from: a */
    private final Bundle f7504a;

    public enum Type {
        PHOTO,
        VIDEO
    }

    /* renamed from: com.facebook.share.model.ShareMedia$a */
    public static abstract class C2362a<M extends ShareMedia, B extends C2362a> {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public Bundle f7506a = new Bundle();

        /* renamed from: a */
        static List<ShareMedia> m10995a(Parcel parcel) {
            Parcelable[] readParcelableArray = parcel.readParcelableArray(ShareMedia.class.getClassLoader());
            ArrayList arrayList = new ArrayList(readParcelableArray.length);
            for (Parcelable parcelable : readParcelableArray) {
                arrayList.add((ShareMedia) parcelable);
            }
            return arrayList;
        }

        @Deprecated
        /* renamed from: a */
        public B mo8227a(Bundle bundle) {
            this.f7506a.putAll(bundle);
            return this;
        }

        /* renamed from: a */
        public B mo8228a(M m) {
            return m == null ? this : mo8227a(m.mo8223a());
        }
    }

    ShareMedia(Parcel parcel) {
        this.f7504a = parcel.readBundle();
    }

    protected ShareMedia(C2362a aVar) {
        this.f7504a = new Bundle(aVar.f7506a);
    }

    @Deprecated
    /* renamed from: a */
    public Bundle mo8223a() {
        return new Bundle(this.f7504a);
    }

    /* renamed from: b */
    public abstract Type mo8224b();

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f7504a);
    }
}
