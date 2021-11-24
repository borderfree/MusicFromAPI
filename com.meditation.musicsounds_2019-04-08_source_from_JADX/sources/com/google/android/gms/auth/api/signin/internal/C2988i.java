package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.C3040d;
import com.google.android.gms.common.api.C3044e;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C3135d;
import com.google.android.gms.common.p121b.C3172a;

/* renamed from: com.google.android.gms.auth.api.signin.internal.i */
public final class C2988i {

    /* renamed from: a */
    private static C3172a f10519a = new C3172a("GoogleSignInCommon", new String[0]);

    /* renamed from: a */
    public static Intent m13931a(Context context, GoogleSignInOptions googleSignInOptions) {
        f10519a.mo11097a("getSignInIntent()", new Object[0]);
        SignInConfiguration signInConfiguration = new SignInConfiguration(context.getPackageName(), googleSignInOptions);
        Intent intent = new Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
        intent.setPackage(context.getPackageName());
        intent.setClass(context, SignInHubActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("config", signInConfiguration);
        intent.putExtra("config", bundle);
        return intent;
    }

    /* renamed from: a */
    public static C3044e<Status> m13932a(C3040d dVar, Context context, boolean z) {
        f10519a.mo11097a("Revoking access", new Object[0]);
        String c = C2981b.m13903a(context).mo10723c();
        m13933a(context);
        return z ? C2984e.m13918a(c) : dVar.mo10839a(new C2989j(dVar));
    }

    /* renamed from: a */
    private static void m13933a(Context context) {
        C2992m.m13937a(context).mo10742a();
        for (C3040d d : C3040d.m14041a()) {
            d.mo10849d();
        }
        C3135d.m14437b();
    }
}
