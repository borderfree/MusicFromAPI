package com.facebook.login;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.internal.C2244t;
import com.facebook.login.LoginClient.Request;
import java.util.Collection;

class FacebookLiteLoginMethodHandler extends NativeAppLoginMethodHandler {
    public static final Creator<FacebookLiteLoginMethodHandler> CREATOR = new Creator() {
        /* renamed from: a */
        public FacebookLiteLoginMethodHandler createFromParcel(Parcel parcel) {
            return new FacebookLiteLoginMethodHandler(parcel);
        }

        /* renamed from: a */
        public FacebookLiteLoginMethodHandler[] newArray(int i) {
            return new FacebookLiteLoginMethodHandler[i];
        }
    };

    FacebookLiteLoginMethodHandler(Parcel parcel) {
        super(parcel);
    }

    FacebookLiteLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public String mo7933a() {
        return "fb_lite_login";
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo7936a(Request request) {
        String m = LoginClient.m10580m();
        Intent a = C2244t.m10294a((Context) this.f7381b.mo8007b(), request.mo8032d(), (Collection<String>) request.mo8027a(), m, request.mo8035f(), request.mo8037h(), request.mo8031c(), mo8053a(request.mo8034e()));
        mo8055a("e2e", m);
        return mo8058a(a, LoginClient.m10578d());
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }
}
