package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.webkit.CookieSyncManager;
import com.facebook.AccessToken;
import com.facebook.AccessTokenSource;
import com.facebook.C2189f;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookServiceException;
import com.facebook.internal.C2258x;
import com.facebook.login.LoginClient.Request;
import com.facebook.login.LoginClient.Result;
import java.util.Collection;
import java.util.Locale;

abstract class WebLoginMethodHandler extends LoginMethodHandler {

    /* renamed from: c */
    private String f7382c;

    WebLoginMethodHandler(Parcel parcel) {
        super(parcel);
    }

    WebLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    /* renamed from: d */
    private void m10648d(String str) {
        this.f7381b.mo8007b().getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).edit().putString("TOKEN", str).apply();
    }

    /* renamed from: e */
    private static final String m10649e() {
        StringBuilder sb = new StringBuilder();
        sb.append("fb");
        sb.append(C2189f.m10096j());
        sb.append("://authorize");
        return sb.toString();
    }

    /* renamed from: f */
    private String m10650f() {
        return this.f7381b.mo8007b().getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).getString("TOKEN", "");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Bundle mo8059a(Bundle bundle, Request request) {
        bundle.putString("redirect_uri", m10649e());
        bundle.putString("client_id", request.mo8032d());
        LoginClient loginClient = this.f7381b;
        bundle.putString("e2e", LoginClient.m10580m());
        bundle.putString("response_type", "token,signed_request");
        bundle.putString("return_scopes", "true");
        bundle.putString("auth_type", "rerequest");
        if (mo7937c() != null) {
            bundle.putString("sso", mo7937c());
        }
        return bundle;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo8060a(Request request, Bundle bundle, FacebookException facebookException) {
        Result result;
        String str;
        this.f7382c = null;
        if (bundle != null) {
            if (bundle.containsKey("e2e")) {
                this.f7382c = bundle.getString("e2e");
            }
            try {
                AccessToken a = m10629a(request.mo8027a(), bundle, mo7939e_(), request.mo8032d());
                result = Result.m10619a(this.f7381b.mo8010c(), a);
                CookieSyncManager.createInstance(this.f7381b.mo8007b()).sync();
                m10648d(a.mo6518b());
            } catch (FacebookException e) {
                result = Result.m10621a(this.f7381b.mo8010c(), null, e.getMessage());
            }
        } else if (facebookException instanceof FacebookOperationCanceledException) {
            result = Result.m10620a(this.f7381b.mo8010c(), "User canceled log in.");
        } else {
            this.f7382c = null;
            String message = facebookException.getMessage();
            if (facebookException instanceof FacebookServiceException) {
                FacebookRequestError requestError = ((FacebookServiceException) facebookException).getRequestError();
                str = String.format(Locale.ROOT, "%d", new Object[]{Integer.valueOf(requestError.mo6555c())});
                message = requestError.toString();
            } else {
                str = null;
            }
            result = Result.m10622a(this.f7381b.mo8010c(), null, message, str);
        }
        if (!C2258x.m10392a(this.f7382c)) {
            mo8056b(this.f7382c);
        }
        this.f7381b.mo8003a(result);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Bundle mo8061b(Request request) {
        String str;
        String str2;
        Bundle bundle = new Bundle();
        if (!C2258x.m10393a((Collection<T>) request.mo8027a())) {
            String join = TextUtils.join(",", request.mo8027a());
            bundle.putString("scope", join);
            mo8055a("scope", join);
        }
        bundle.putString("default_audience", request.mo8031c().getNativeProtocolAudience());
        bundle.putString("state", mo8053a(request.mo8034e()));
        AccessToken a = AccessToken.m7985a();
        String b = a != null ? a.mo6518b() : null;
        if (b == null || !b.equals(m10650f())) {
            C2258x.m10398b((Context) this.f7381b.mo8007b());
            str = "access_token";
            str2 = "0";
        } else {
            bundle.putString("access_token", b);
            str = "access_token";
            str2 = "1";
        }
        mo8055a(str, str2);
        return bundle;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo7937c() {
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e_ */
    public abstract AccessTokenSource mo7939e_();
}
