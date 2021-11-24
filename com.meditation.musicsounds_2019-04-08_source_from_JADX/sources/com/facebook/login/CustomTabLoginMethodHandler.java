package com.facebook.login;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.p009v4.app.C0367h;
import com.facebook.AccessTokenSource;
import com.facebook.C2189f;
import com.facebook.CustomTabMainActivity;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.internal.C2230m;
import com.facebook.internal.C2232n;
import com.facebook.internal.C2258x;
import com.facebook.internal.C2264y;
import com.facebook.login.LoginClient.Request;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class CustomTabLoginMethodHandler extends WebLoginMethodHandler {
    public static final Creator<CustomTabLoginMethodHandler> CREATOR = new Creator() {
        /* renamed from: a */
        public CustomTabLoginMethodHandler createFromParcel(Parcel parcel) {
            return new CustomTabLoginMethodHandler(parcel);
        }

        /* renamed from: a */
        public CustomTabLoginMethodHandler[] newArray(int i) {
            return new CustomTabLoginMethodHandler[i];
        }
    };

    /* renamed from: c */
    private static final String[] f7317c = {"com.android.chrome", "com.chrome.beta", "com.chrome.dev"};

    /* renamed from: d */
    private String f7318d;

    /* renamed from: e */
    private String f7319e;

    CustomTabLoginMethodHandler(Parcel parcel) {
        super(parcel);
        this.f7319e = parcel.readString();
    }

    CustomTabLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
        this.f7319e = C2258x.m10362a(20);
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a3  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m10488a(java.lang.String r7, com.facebook.login.LoginClient.Request r8) {
        /*
            r6 = this;
            if (r7 == 0) goto L_0x00ae
            java.lang.String r0 = com.facebook.CustomTabMainActivity.m8006a()
            boolean r0 = r7.startsWith(r0)
            if (r0 == 0) goto L_0x00ae
            android.net.Uri r7 = android.net.Uri.parse(r7)
            java.lang.String r0 = r7.getQuery()
            android.os.Bundle r0 = com.facebook.internal.C2258x.m10394b(r0)
            java.lang.String r7 = r7.getFragment()
            android.os.Bundle r7 = com.facebook.internal.C2258x.m10394b(r7)
            r0.putAll(r7)
            boolean r7 = r6.m10489a(r0)
            r1 = 0
            if (r7 != 0) goto L_0x0035
            com.facebook.FacebookException r7 = new com.facebook.FacebookException
            java.lang.String r0 = "Invalid state parameter"
            r7.<init>(r0)
            super.mo8060a(r8, r1, r7)
            return
        L_0x0035:
            java.lang.String r7 = "error"
            java.lang.String r7 = r0.getString(r7)
            if (r7 != 0) goto L_0x0043
            java.lang.String r7 = "error_type"
            java.lang.String r7 = r0.getString(r7)
        L_0x0043:
            java.lang.String r2 = "error_msg"
            java.lang.String r2 = r0.getString(r2)
            if (r2 != 0) goto L_0x0051
            java.lang.String r2 = "error_message"
            java.lang.String r2 = r0.getString(r2)
        L_0x0051:
            if (r2 != 0) goto L_0x0059
            java.lang.String r2 = "error_description"
            java.lang.String r2 = r0.getString(r2)
        L_0x0059:
            java.lang.String r3 = "error_code"
            java.lang.String r3 = r0.getString(r3)
            boolean r4 = com.facebook.internal.C2258x.m10392a(r3)
            r5 = -1
            if (r4 != 0) goto L_0x006b
            int r3 = java.lang.Integer.parseInt(r3)     // Catch:{ NumberFormatException -> 0x006b }
            goto L_0x006c
        L_0x006b:
            r3 = -1
        L_0x006c:
            boolean r4 = com.facebook.internal.C2258x.m10392a(r7)
            if (r4 == 0) goto L_0x007e
            boolean r4 = com.facebook.internal.C2258x.m10392a(r2)
            if (r4 == 0) goto L_0x007e
            if (r3 != r5) goto L_0x007e
            super.mo8060a(r8, r0, r1)
            goto L_0x00ae
        L_0x007e:
            if (r7 == 0) goto L_0x0099
            java.lang.String r0 = "access_denied"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x0090
            java.lang.String r0 = "OAuthAccessDeniedException"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0099
        L_0x0090:
            com.facebook.FacebookOperationCanceledException r7 = new com.facebook.FacebookOperationCanceledException
            r7.<init>()
        L_0x0095:
            super.mo8060a(r8, r1, r7)
            goto L_0x00ae
        L_0x0099:
            r0 = 4201(0x1069, float:5.887E-42)
            if (r3 != r0) goto L_0x00a3
            com.facebook.FacebookOperationCanceledException r7 = new com.facebook.FacebookOperationCanceledException
            r7.<init>()
            goto L_0x0095
        L_0x00a3:
            com.facebook.FacebookRequestError r0 = new com.facebook.FacebookRequestError
            r0.<init>(r3, r7, r2)
            com.facebook.FacebookServiceException r7 = new com.facebook.FacebookServiceException
            r7.<init>(r0, r2)
            goto L_0x0095
        L_0x00ae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.CustomTabLoginMethodHandler.m10488a(java.lang.String, com.facebook.login.LoginClient$Request):void");
    }

    /* renamed from: a */
    private boolean m10489a(Bundle bundle) {
        try {
            String string = bundle.getString("state");
            if (string == null) {
                return false;
            }
            return new JSONObject(string).getString("7_challenge").equals(this.f7319e);
        } catch (JSONException unused) {
            return false;
        }
    }

    /* renamed from: e */
    private boolean m10490e() {
        return m10491f() && m10492g() != null && m10493h() && C2264y.m10431c(C2189f.m10092f());
    }

    /* renamed from: f */
    private boolean m10491f() {
        C2230m a = C2232n.m10235a(C2258x.m10363a((Context) this.f7381b.mo8007b()));
        return a != null && a.mo7848b();
    }

    /* renamed from: g */
    private String m10492g() {
        if (this.f7318d != null) {
            return this.f7318d;
        }
        C0367h b = this.f7381b.mo8007b();
        List<ResolveInfo> queryIntentServices = b.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
        if (queryIntentServices != null) {
            HashSet hashSet = new HashSet(Arrays.asList(f7317c));
            for (ResolveInfo resolveInfo : queryIntentServices) {
                ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                if (serviceInfo != null && hashSet.contains(serviceInfo.packageName)) {
                    this.f7318d = serviceInfo.packageName;
                    return this.f7318d;
                }
            }
        }
        return null;
    }

    /* renamed from: h */
    private boolean m10493h() {
        return !C2258x.m10410e((Context) this.f7381b.mo8007b());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public String mo7933a() {
        return "custom_tab";
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7934a(JSONObject jSONObject) {
        jSONObject.put("7_challenge", this.f7319e);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo7935a(int i, int i2, Intent intent) {
        if (i != 1) {
            return super.mo7935a(i, i2, intent);
        }
        Request c = this.f7381b.mo8010c();
        if (i2 == -1) {
            m10488a(intent.getStringExtra(CustomTabMainActivity.f5190c), c);
            return true;
        }
        super.mo8060a(c, null, new FacebookOperationCanceledException());
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo7936a(Request request) {
        if (!m10490e()) {
            return false;
        }
        Bundle a = mo8059a(mo8061b(request), request);
        Intent intent = new Intent(this.f7381b.mo8007b(), CustomTabMainActivity.class);
        intent.putExtra(CustomTabMainActivity.f5188a, a);
        intent.putExtra(CustomTabMainActivity.f5189b, m10492g());
        this.f7381b.mo8000a().startActivityForResult(intent, 1);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo7937c() {
        return "chrome_custom_tab";
    }

    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e_ */
    public AccessTokenSource mo7939e_() {
        return AccessTokenSource.CHROME_CUSTOM_TAB;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f7319e);
    }
}
