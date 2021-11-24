package com.facebook.login;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.internal.C2244t;
import com.facebook.login.LoginClient.Request;

class KatanaProxyLoginMethodHandler extends NativeAppLoginMethodHandler {
    public static final Creator<KatanaProxyLoginMethodHandler> CREATOR = new Creator() {
        /* renamed from: a */
        public KatanaProxyLoginMethodHandler createFromParcel(Parcel parcel) {
            return new KatanaProxyLoginMethodHandler(parcel);
        }

        /* renamed from: a */
        public KatanaProxyLoginMethodHandler[] newArray(int i) {
            return new KatanaProxyLoginMethodHandler[i];
        }
    };

    KatanaProxyLoginMethodHandler(Parcel parcel) {
        super(parcel);
    }

    KatanaProxyLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public String mo7933a() {
        return "katana_proxy_auth";
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo7936a(Request request) {
        String m = LoginClient.m10580m();
        Intent b = C2244t.m10306b(this.f7381b.mo8007b(), request.mo8032d(), request.mo8027a(), m, request.mo8035f(), request.mo8037h(), request.mo8031c(), mo8053a(request.mo8034e()));
        mo8055a("e2e", m);
        return mo8058a(b, LoginClient.m10578d());
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }
}
