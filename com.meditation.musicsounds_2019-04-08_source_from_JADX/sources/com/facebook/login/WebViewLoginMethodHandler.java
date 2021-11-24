package com.facebook.login;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.p009v4.app.C0367h;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookException;
import com.facebook.internal.C2222i;
import com.facebook.internal.C2265z;
import com.facebook.internal.C2265z.C2270a;
import com.facebook.internal.C2265z.C2272c;
import com.facebook.login.LoginClient.Request;

class WebViewLoginMethodHandler extends WebLoginMethodHandler {
    public static final Creator<WebViewLoginMethodHandler> CREATOR = new Creator() {
        /* renamed from: a */
        public WebViewLoginMethodHandler createFromParcel(Parcel parcel) {
            return new WebViewLoginMethodHandler(parcel);
        }

        /* renamed from: a */
        public WebViewLoginMethodHandler[] newArray(int i) {
            return new WebViewLoginMethodHandler[i];
        }
    };

    /* renamed from: c */
    private C2265z f7383c;

    /* renamed from: d */
    private String f7384d;

    /* renamed from: com.facebook.login.WebViewLoginMethodHandler$a */
    static class C2300a extends C2270a {

        /* renamed from: a */
        private String f7387a;

        /* renamed from: b */
        private boolean f7388b;

        public C2300a(Context context, String str, Bundle bundle) {
            super(context, str, "oauth", bundle);
        }

        /* renamed from: a */
        public C2265z mo7910a() {
            Bundle e = mo7914e();
            e.putString("redirect_uri", "fbconnect://success");
            e.putString("client_id", mo7911b());
            e.putString("e2e", this.f7387a);
            e.putString("response_type", "token,signed_request");
            e.putString("return_scopes", "true");
            e.putString("auth_type", "rerequest");
            return C2265z.m10435a(mo7912c(), "oauth", e, mo7913d(), mo7915f());
        }

        /* renamed from: a */
        public C2300a mo8068a(String str) {
            this.f7387a = str;
            return this;
        }

        /* renamed from: a */
        public C2300a mo8069a(boolean z) {
            this.f7388b = z;
            return this;
        }
    }

    WebViewLoginMethodHandler(Parcel parcel) {
        super(parcel);
        this.f7384d = parcel.readString();
    }

    WebViewLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public String mo7933a() {
        return "web_view";
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo7936a(final Request request) {
        Bundle b = mo8061b(request);
        C22981 r1 = new C2272c() {
            /* renamed from: a */
            public void mo7841a(Bundle bundle, FacebookException facebookException) {
                WebViewLoginMethodHandler.this.mo8062b(request, bundle, facebookException);
            }
        };
        this.f7384d = LoginClient.m10580m();
        mo8055a("e2e", this.f7384d);
        C0367h b2 = this.f7381b.mo8007b();
        this.f7383c = new C2300a(b2, request.mo8032d(), b).mo8068a(this.f7384d).mo8069a(request.mo8035f()).mo7909a(r1).mo7910a();
        C2222i iVar = new C2222i();
        iVar.mo1280d(true);
        iVar.mo7840a((Dialog) this.f7383c);
        iVar.mo1448a(b2.mo1469g(), "FacebookDialogFragment");
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo7980b() {
        if (this.f7383c != null) {
            this.f7383c.cancel();
            this.f7383c = null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo8062b(Request request, Bundle bundle, FacebookException facebookException) {
        super.mo8060a(request, bundle, facebookException);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public boolean mo8057d() {
        return true;
    }

    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e_ */
    public AccessTokenSource mo7939e_() {
        return AccessTokenSource.WEB_VIEW;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f7384d);
    }
}
