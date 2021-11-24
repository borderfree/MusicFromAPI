package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.auth.api.C2962a;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.api.C3040d;
import com.google.android.gms.common.api.C3040d.C3041a;

/* renamed from: com.google.android.gms.auth.api.signin.internal.t */
public final class C2999t extends C2994o {

    /* renamed from: a */
    private final Context f10525a;

    public C2999t(Context context) {
        this.f10525a = context;
    }

    /* renamed from: c */
    private final void m13950c() {
        if (!GooglePlayServicesUtil.isGooglePlayServicesUid(this.f10525a, Binder.getCallingUid())) {
            int callingUid = Binder.getCallingUid();
            StringBuilder sb = new StringBuilder(52);
            sb.append("Calling UID ");
            sb.append(callingUid);
            sb.append(" is not Google Play services.");
            throw new SecurityException(sb.toString());
        }
    }

    /* renamed from: a */
    public final void mo10744a() {
        m13950c();
        C2981b a = C2981b.m13903a(this.f10525a);
        GoogleSignInAccount a2 = a.mo10720a();
        GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.f10470f;
        if (a2 != null) {
            googleSignInOptions = a.mo10722b();
        }
        C3040d b = new C3041a(this.f10525a).mo10858a(C2962a.f10437e, googleSignInOptions).mo10862b();
        try {
            if (b.mo10851f().mo10759b()) {
                if (a2 != null) {
                    C2962a.f10440h.mo10701a(b);
                } else {
                    b.mo10854i();
                }
            }
        } finally {
            b.mo10852g();
        }
    }

    /* renamed from: b */
    public final void mo10745b() {
        m13950c();
        C2992m.m13937a(this.f10525a).mo10742a();
    }
}
