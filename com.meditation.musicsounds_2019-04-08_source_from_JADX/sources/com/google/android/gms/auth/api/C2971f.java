package com.google.android.gms.auth.api;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.C2987h;
import com.google.android.gms.common.api.C3020a.C3021a;
import com.google.android.gms.common.api.C3020a.C3031f;
import com.google.android.gms.common.api.C3040d.C3042b;
import com.google.android.gms.common.api.C3040d.C3043c;
import com.google.android.gms.common.internal.C3240e;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.auth.api.f */
final class C2971f extends C3021a<C2987h, GoogleSignInOptions> {
    C2971f() {
    }

    /* renamed from: a */
    public final /* synthetic */ C3031f mo10666a(Context context, Looper looper, C3240e eVar, Object obj, C3042b bVar, C3043c cVar) {
        C2987h hVar = new C2987h(context, looper, eVar, (GoogleSignInOptions) obj, bVar, cVar);
        return hVar;
    }

    /* renamed from: a */
    public final /* synthetic */ List mo10667a(Object obj) {
        GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
        return googleSignInOptions == null ? Collections.emptyList() : googleSignInOptions.mo10683a();
    }
}
