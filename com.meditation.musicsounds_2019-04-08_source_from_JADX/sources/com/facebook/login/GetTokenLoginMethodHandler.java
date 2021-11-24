package com.facebook.login;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookException;
import com.facebook.internal.C2253u.C2255a;
import com.facebook.internal.C2258x;
import com.facebook.internal.C2258x.C2261a;
import com.facebook.login.LoginClient.Request;
import com.facebook.login.LoginClient.Result;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

class GetTokenLoginMethodHandler extends LoginMethodHandler {
    public static final Creator<GetTokenLoginMethodHandler> CREATOR = new Creator() {
        /* renamed from: a */
        public GetTokenLoginMethodHandler createFromParcel(Parcel parcel) {
            return new GetTokenLoginMethodHandler(parcel);
        }

        /* renamed from: a */
        public GetTokenLoginMethodHandler[] newArray(int i) {
            return new GetTokenLoginMethodHandler[i];
        }
    };

    /* renamed from: c */
    private C2301a f7350c;

    GetTokenLoginMethodHandler(Parcel parcel) {
        super(parcel);
    }

    GetTokenLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public String mo7933a() {
        return "get_token";
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo7979a(Request request, Bundle bundle) {
        if (this.f7350c != null) {
            this.f7350c.mo7878a((C2255a) null);
        }
        this.f7350c = null;
        this.f7381b.mo8021l();
        if (bundle != null) {
            ArrayList stringArrayList = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
            Set<String> a = request.mo8027a();
            if (stringArrayList == null || (a != null && !stringArrayList.containsAll(a))) {
                HashSet hashSet = new HashSet();
                for (String str : a) {
                    if (!stringArrayList.contains(str)) {
                        hashSet.add(str);
                    }
                }
                if (!hashSet.isEmpty()) {
                    mo8055a("new_permissions", TextUtils.join(",", hashSet));
                }
                request.mo8028a((Set<String>) hashSet);
            } else {
                mo7982c(request, bundle);
                return;
            }
        }
        this.f7381b.mo8018i();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo7936a(final Request request) {
        this.f7350c = new C2301a(this.f7381b.mo8007b(), request.mo8032d());
        if (!this.f7350c.mo7879a()) {
            return false;
        }
        this.f7381b.mo8020k();
        this.f7350c.mo7878a((C2255a) new C2255a() {
            /* renamed from: a */
            public void mo7884a(Bundle bundle) {
                GetTokenLoginMethodHandler.this.mo7979a(request, bundle);
            }
        });
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo7980b() {
        if (this.f7350c != null) {
            this.f7350c.mo7880b();
            this.f7350c.mo7878a((C2255a) null);
            this.f7350c = null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo7981b(Request request, Bundle bundle) {
        this.f7381b.mo8003a(Result.m10619a(this.f7381b.mo8010c(), m10628a(bundle, AccessTokenSource.FACEBOOK_APPLICATION_SERVICE, request.mo8032d())));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo7982c(final Request request, final Bundle bundle) {
        String string = bundle.getString("com.facebook.platform.extra.USER_ID");
        if (string == null || string.isEmpty()) {
            this.f7381b.mo8020k();
            C2258x.m10382a(bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN"), (C2261a) new C2261a() {
                /* renamed from: a */
                public void mo6621a(FacebookException facebookException) {
                    GetTokenLoginMethodHandler.this.f7381b.mo8009b(Result.m10621a(GetTokenLoginMethodHandler.this.f7381b.mo8010c(), "Caught exception", facebookException.getMessage()));
                }

                /* renamed from: a */
                public void mo6622a(JSONObject jSONObject) {
                    try {
                        bundle.putString("com.facebook.platform.extra.USER_ID", jSONObject.getString("id"));
                        GetTokenLoginMethodHandler.this.mo7981b(request, bundle);
                    } catch (JSONException e) {
                        GetTokenLoginMethodHandler.this.f7381b.mo8009b(Result.m10621a(GetTokenLoginMethodHandler.this.f7381b.mo8010c(), "Caught exception", e.getMessage()));
                    }
                }
            });
            return;
        }
        mo7981b(request, bundle);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }
}
