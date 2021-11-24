package com.facebook.share.model;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Set;

public class CameraEffectTextures implements ShareModel {
    public static final Creator<CameraEffectTextures> CREATOR = new Creator<CameraEffectTextures>() {
        /* renamed from: a */
        public CameraEffectTextures createFromParcel(Parcel parcel) {
            return new CameraEffectTextures(parcel);
        }

        /* renamed from: a */
        public CameraEffectTextures[] newArray(int i) {
            return new CameraEffectTextures[i];
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Bundle f7476a;

    /* renamed from: com.facebook.share.model.CameraEffectTextures$a */
    public static class C2355a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public Bundle f7477a = new Bundle();

        /* renamed from: a */
        public C2355a mo8176a(Parcel parcel) {
            return mo8177a((CameraEffectTextures) parcel.readParcelable(CameraEffectTextures.class.getClassLoader()));
        }

        /* renamed from: a */
        public C2355a mo8177a(CameraEffectTextures cameraEffectTextures) {
            if (cameraEffectTextures != null) {
                this.f7477a.putAll(cameraEffectTextures.f7476a);
            }
            return this;
        }

        /* renamed from: a */
        public CameraEffectTextures mo8178a() {
            return new CameraEffectTextures(this);
        }
    }

    CameraEffectTextures(Parcel parcel) {
        this.f7476a = parcel.readBundle(getClass().getClassLoader());
    }

    private CameraEffectTextures(C2355a aVar) {
        this.f7476a = aVar.f7477a;
    }

    /* renamed from: a */
    public Bitmap mo8167a(String str) {
        Object obj = this.f7476a.get(str);
        if (obj instanceof Bitmap) {
            return (Bitmap) obj;
        }
        return null;
    }

    /* renamed from: a */
    public Set<String> mo8168a() {
        return this.f7476a.keySet();
    }

    /* renamed from: b */
    public Uri mo8169b(String str) {
        Object obj = this.f7476a.get(str);
        if (obj instanceof Uri) {
            return (Uri) obj;
        }
        return null;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f7476a);
    }
}
