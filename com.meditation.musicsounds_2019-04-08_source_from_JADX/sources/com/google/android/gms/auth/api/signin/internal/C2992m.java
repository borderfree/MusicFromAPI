package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* renamed from: com.google.android.gms.auth.api.signin.internal.m */
public final class C2992m {

    /* renamed from: a */
    private static C2992m f10521a;

    /* renamed from: b */
    private C2981b f10522b;

    /* renamed from: c */
    private GoogleSignInAccount f10523c = this.f10522b.mo10720a();

    /* renamed from: d */
    private GoogleSignInOptions f10524d = this.f10522b.mo10722b();

    private C2992m(Context context) {
        this.f10522b = C2981b.m13903a(context);
    }

    /* renamed from: a */
    public static synchronized C2992m m13937a(Context context) {
        C2992m b;
        synchronized (C2992m.class) {
            b = m13938b(context.getApplicationContext());
        }
        return b;
    }

    /* renamed from: b */
    private static synchronized C2992m m13938b(Context context) {
        C2992m mVar;
        synchronized (C2992m.class) {
            if (f10521a == null) {
                f10521a = new C2992m(context);
            }
            mVar = f10521a;
        }
        return mVar;
    }

    /* renamed from: a */
    public final synchronized void mo10742a() {
        this.f10522b.mo10725e();
        this.f10523c = null;
        this.f10524d = null;
    }

    /* renamed from: a */
    public final synchronized void mo10743a(GoogleSignInOptions googleSignInOptions, GoogleSignInAccount googleSignInAccount) {
        this.f10522b.mo10721a(googleSignInAccount, googleSignInOptions);
        this.f10523c = googleSignInAccount;
        this.f10524d = googleSignInOptions;
    }
}
