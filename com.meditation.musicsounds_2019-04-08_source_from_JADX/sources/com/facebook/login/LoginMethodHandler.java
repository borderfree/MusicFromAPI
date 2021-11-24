package com.facebook.login;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Log;
import com.facebook.AccessToken;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookException;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.internal.C2258x;
import com.facebook.login.LoginClient.Request;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

abstract class LoginMethodHandler implements Parcelable {

    /* renamed from: a */
    Map<String, String> f7380a;

    /* renamed from: b */
    protected LoginClient f7381b;

    LoginMethodHandler(Parcel parcel) {
        this.f7380a = C2258x.m10375a(parcel);
    }

    LoginMethodHandler(LoginClient loginClient) {
        this.f7381b = loginClient;
    }

    /* renamed from: a */
    static AccessToken m10628a(Bundle bundle, AccessTokenSource accessTokenSource, String str) {
        Date a = C2258x.m10372a(bundle, "com.facebook.platform.extra.EXPIRES_SECONDS_SINCE_EPOCH", new Date(0));
        ArrayList stringArrayList = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
        String string = bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN");
        if (C2258x.m10392a(string)) {
            return null;
        }
        AccessToken accessToken = new AccessToken(string, str, bundle.getString("com.facebook.platform.extra.USER_ID"), stringArrayList, null, accessTokenSource, a, new Date());
        return accessToken;
    }

    /* renamed from: a */
    public static AccessToken m10629a(Collection<String> collection, Bundle bundle, AccessTokenSource accessTokenSource, String str) {
        Date a = C2258x.m10372a(bundle, "expires_in", new Date());
        String string = bundle.getString("access_token");
        String string2 = bundle.getString("granted_scopes");
        if (!C2258x.m10392a(string2)) {
            collection = new ArrayList<>(Arrays.asList(string2.split(",")));
        }
        Collection<String> collection2 = collection;
        String string3 = bundle.getString("denied_scopes");
        Collection arrayList = !C2258x.m10392a(string3) ? new ArrayList(Arrays.asList(string3.split(","))) : null;
        if (C2258x.m10392a(string)) {
            return null;
        }
        AccessToken accessToken = new AccessToken(string, str, m10630c(bundle.getString("signed_request")), collection2, arrayList, accessTokenSource, a, new Date());
        return accessToken;
    }

    /* renamed from: c */
    static String m10630c(String str) {
        if (str == null || str.isEmpty()) {
            throw new FacebookException("Authorization response does not contain the signed_request");
        }
        try {
            String[] split = str.split("\\.");
            if (split.length == 2) {
                return new JSONObject(new String(Base64.decode(split[1], 0), "UTF-8")).getString("user_id");
            }
        } catch (UnsupportedEncodingException | JSONException unused) {
        }
        throw new FacebookException("Failed to retrieve user_id from signed_request");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract String mo7933a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo8053a(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("0_auth_logger_id", str);
            jSONObject.put("3_method", mo7933a());
            mo7934a(jSONObject);
        } catch (JSONException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Error creating client state json: ");
            sb.append(e.getMessage());
            Log.w("LoginMethodHandler", sb.toString());
        }
        return jSONObject.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo8054a(LoginClient loginClient) {
        if (this.f7381b == null) {
            this.f7381b = loginClient;
            return;
        }
        throw new FacebookException("Can't set LoginClient if it is already set.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo8055a(String str, Object obj) {
        if (this.f7380a == null) {
            this.f7380a = new HashMap();
        }
        this.f7380a.put(str, obj == null ? null : obj.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo7934a(JSONObject jSONObject) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo7935a(int i, int i2, Intent intent) {
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract boolean mo7936a(Request request);

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo7980b() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo8056b(String str) {
        String d = this.f7381b.mo8010c().mo8032d();
        AppEventsLogger b = AppEventsLogger.m9948b(this.f7381b.mo8007b(), d);
        Bundle bundle = new Bundle();
        bundle.putString("fb_web_login_e2e", str);
        bundle.putLong("fb_web_login_switchback_time", System.currentTimeMillis());
        bundle.putString("app_id", d);
        b.mo7683a("fb_dialogs_web_login_dialog_complete", (Double) null, bundle);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public boolean mo8057d() {
        return false;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C2258x.m10379a(parcel, this.f7380a);
    }
}
