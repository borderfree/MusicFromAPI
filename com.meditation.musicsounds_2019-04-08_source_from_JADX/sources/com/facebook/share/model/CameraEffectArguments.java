package com.facebook.share.model;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Set;

public class CameraEffectArguments implements ShareModel {
    public static final Creator<CameraEffectArguments> CREATOR = new Creator<CameraEffectArguments>() {
        /* renamed from: a */
        public CameraEffectArguments createFromParcel(Parcel parcel) {
            return new CameraEffectArguments(parcel);
        }

        /* renamed from: a */
        public CameraEffectArguments[] newArray(int i) {
            return new CameraEffectArguments[i];
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Bundle f7474a;

    /* renamed from: com.facebook.share.model.CameraEffectArguments$a */
    public static class C2353a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public Bundle f7475a = new Bundle();

        /* renamed from: a */
        public C2353a mo8164a(Parcel parcel) {
            return mo8165a((CameraEffectArguments) parcel.readParcelable(CameraEffectArguments.class.getClassLoader()));
        }

        /* renamed from: a */
        public C2353a mo8165a(CameraEffectArguments cameraEffectArguments) {
            if (cameraEffectArguments != null) {
                this.f7475a.putAll(cameraEffectArguments.f7474a);
            }
            return this;
        }

        /* renamed from: a */
        public CameraEffectArguments mo8166a() {
            return new CameraEffectArguments(this);
        }
    }

    CameraEffectArguments(Parcel parcel) {
        this.f7474a = parcel.readBundle(getClass().getClassLoader());
    }

    private CameraEffectArguments(C2353a aVar) {
        this.f7474a = aVar.f7475a;
    }

    /* renamed from: a */
    public Object mo8156a(String str) {
        return this.f7474a.get(str);
    }

    /* renamed from: a */
    public Set<String> mo8157a() {
        return this.f7474a.keySet();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f7474a);
    }
}
