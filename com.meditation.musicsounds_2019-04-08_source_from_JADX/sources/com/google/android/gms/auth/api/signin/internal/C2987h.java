package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions.C2972a;
import com.google.android.gms.common.C3183f;
import com.google.android.gms.common.api.C3040d.C3042b;
import com.google.android.gms.common.api.C3040d.C3043c;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C3240e;
import com.google.android.gms.common.internal.C3245h;

/* renamed from: com.google.android.gms.auth.api.signin.internal.h */
public final class C2987h extends C3245h<C2997r> {

    /* renamed from: e */
    private final GoogleSignInOptions f10518e;

    public C2987h(Context context, Looper looper, C3240e eVar, GoogleSignInOptions googleSignInOptions, C3042b bVar, C3043c cVar) {
        super(context, looper, 91, eVar, bVar, cVar);
        if (googleSignInOptions == null) {
            googleSignInOptions = new C2972a().mo10697c();
        }
        if (!eVar.mo11248e().isEmpty()) {
            C2972a aVar = new C2972a(googleSignInOptions);
            for (Scope a : eVar.mo11248e()) {
                aVar.mo10695a(a, new Scope[0]);
            }
            googleSignInOptions = aVar.mo10697c();
        }
        this.f10518e = googleSignInOptions;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ IInterface mo10733a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        return queryLocalInterface instanceof C2997r ? (C2997r) queryLocalInterface : new C2998s(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo10734b() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    /* renamed from: c */
    public final boolean mo10735c() {
        return true;
    }

    /* renamed from: d */
    public final Intent mo10736d() {
        return C2988i.m13931a(mo11222r(), this.f10518e);
    }

    /* renamed from: e */
    public final GoogleSignInOptions mo10737e() {
        return this.f10518e;
    }

    /* renamed from: f */
    public final int mo10738f() {
        return C3183f.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i_ */
    public final String mo10739i_() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }
}
