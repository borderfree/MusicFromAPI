package com.facebook.share.model;

import android.os.Bundle;
import android.os.Parcel;
import com.facebook.share.model.ShareOpenGraphValueContainer;
import com.facebook.share.model.ShareOpenGraphValueContainer.C2373a;
import java.util.Set;

public abstract class ShareOpenGraphValueContainer<P extends ShareOpenGraphValueContainer, E extends C2373a> implements ShareModel {

    /* renamed from: a */
    private final Bundle f7533a;

    /* renamed from: com.facebook.share.model.ShareOpenGraphValueContainer$a */
    public static abstract class C2373a<P extends ShareOpenGraphValueContainer, E extends C2373a> {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public Bundle f7534a = new Bundle();

        /* renamed from: a */
        public E mo8287a(P p) {
            if (p != null) {
                this.f7534a.putAll(p.mo8299b());
            }
            return this;
        }

        /* renamed from: a */
        public E mo8304a(String str, String str2) {
            this.f7534a.putString(str, str2);
            return this;
        }
    }

    ShareOpenGraphValueContainer(Parcel parcel) {
        this.f7533a = parcel.readBundle(C2373a.class.getClassLoader());
    }

    protected ShareOpenGraphValueContainer(C2373a<P, E> aVar) {
        this.f7533a = (Bundle) aVar.f7534a.clone();
    }

    /* renamed from: a */
    public Object mo8298a(String str) {
        return this.f7533a.get(str);
    }

    /* renamed from: b */
    public Bundle mo8299b() {
        return (Bundle) this.f7533a.clone();
    }

    /* renamed from: b */
    public String mo8300b(String str) {
        return this.f7533a.getString(str);
    }

    /* renamed from: c */
    public Set<String> mo8301c() {
        return this.f7533a.keySet();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f7533a);
    }
}
