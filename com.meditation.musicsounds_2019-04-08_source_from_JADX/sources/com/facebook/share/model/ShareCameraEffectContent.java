package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.share.model.CameraEffectArguments.C2353a;
import com.facebook.share.model.CameraEffectTextures.C2355a;

public class ShareCameraEffectContent extends ShareContent<ShareCameraEffectContent, Object> {
    public static final Creator<ShareCameraEffectContent> CREATOR = new Creator<ShareCameraEffectContent>() {
        /* renamed from: a */
        public ShareCameraEffectContent createFromParcel(Parcel parcel) {
            return new ShareCameraEffectContent(parcel);
        }

        /* renamed from: a */
        public ShareCameraEffectContent[] newArray(int i) {
            return new ShareCameraEffectContent[i];
        }
    };

    /* renamed from: a */
    private String f7478a;

    /* renamed from: b */
    private CameraEffectArguments f7479b;

    /* renamed from: c */
    private CameraEffectTextures f7480c;

    ShareCameraEffectContent(Parcel parcel) {
        super(parcel);
        this.f7478a = parcel.readString();
        this.f7479b = new C2353a().mo8164a(parcel).mo8166a();
        this.f7480c = new C2355a().mo8176a(parcel).mo8178a();
    }

    /* renamed from: a */
    public String mo8179a() {
        return this.f7478a;
    }

    /* renamed from: b */
    public CameraEffectArguments mo8180b() {
        return this.f7479b;
    }

    /* renamed from: c */
    public CameraEffectTextures mo8181c() {
        return this.f7480c;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f7478a);
        parcel.writeParcelable(this.f7479b, 0);
        parcel.writeParcelable(this.f7480c, 0);
    }
}
