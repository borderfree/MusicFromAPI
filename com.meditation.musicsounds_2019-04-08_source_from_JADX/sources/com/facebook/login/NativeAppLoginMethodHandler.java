package com.facebook.login;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookException;
import com.facebook.internal.C2257w;
import com.facebook.internal.C2258x;
import com.facebook.login.LoginClient.Request;
import com.facebook.login.LoginClient.Result;

abstract class NativeAppLoginMethodHandler extends LoginMethodHandler {
    NativeAppLoginMethodHandler(Parcel parcel) {
        super(parcel);
    }

    NativeAppLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    /* renamed from: a */
    private Result m10641a(Request request, Intent intent) {
        Bundle extras = intent.getExtras();
        String a = m10642a(extras);
        String obj = extras.get("error_code") != null ? extras.get("error_code").toString() : null;
        String b = m10644b(extras);
        String string = extras.getString("e2e");
        if (!C2258x.m10392a(string)) {
            mo8056b(string);
        }
        if (a == null && obj == null && b == null) {
            try {
                return Result.m10619a(request, m10629a(request.mo8027a(), extras, AccessTokenSource.FACEBOOK_APPLICATION_WEB, request.mo8032d()));
            } catch (FacebookException e) {
                return Result.m10621a(request, null, e.getMessage());
            }
        } else if (C2257w.f7260a.contains(a)) {
            return null;
        } else {
            return C2257w.f7261b.contains(a) ? Result.m10620a(request, (String) null) : Result.m10622a(request, a, b, obj);
        }
    }

    /* renamed from: a */
    private String m10642a(Bundle bundle) {
        String string = bundle.getString("error");
        return string == null ? bundle.getString("error_type") : string;
    }

    /* renamed from: b */
    private Result m10643b(Request request, Intent intent) {
        Bundle extras = intent.getExtras();
        String a = m10642a(extras);
        String obj = extras.get("error_code") != null ? extras.get("error_code").toString() : null;
        return "CONNECTION_FAILURE".equals(obj) ? Result.m10622a(request, a, m10644b(extras), obj) : Result.m10620a(request, a);
    }

    /* renamed from: b */
    private String m10644b(Bundle bundle) {
        String string = bundle.getString("error_message");
        return string == null ? bundle.getString("error_description") : string;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo7935a(int i, int i2, Intent intent) {
        Request c = this.f7381b.mo8010c();
        Result result = intent == null ? Result.m10620a(c, "Operation canceled") : i2 == 0 ? m10643b(c, intent) : i2 != -1 ? Result.m10621a(c, "Unexpected resultCode from authorization.", null) : m10641a(c, intent);
        if (result != null) {
            this.f7381b.mo8003a(result);
        } else {
            this.f7381b.mo8018i();
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo8058a(Intent intent, int i) {
        if (intent == null) {
            return false;
        }
        try {
            this.f7381b.mo8000a().startActivityForResult(intent, i);
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract boolean mo7936a(Request request);
}
