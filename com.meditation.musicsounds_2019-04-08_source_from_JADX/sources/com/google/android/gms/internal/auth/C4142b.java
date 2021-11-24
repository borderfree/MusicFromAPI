package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.auth.api.C2966b;
import com.google.android.gms.auth.api.C2968c;
import com.google.android.gms.common.C3183f;
import com.google.android.gms.common.api.C3040d.C3042b;
import com.google.android.gms.common.api.C3040d.C3043c;
import com.google.android.gms.common.internal.C3240e;
import com.google.android.gms.common.internal.C3245h;

/* renamed from: com.google.android.gms.internal.auth.b */
public final class C4142b extends C3245h<C4143c> {

    /* renamed from: e */
    private final Bundle f15543e;

    public C4142b(Context context, Looper looper, C3240e eVar, C2968c cVar, C3042b bVar, C3043c cVar2) {
        super(context, looper, 16, eVar, bVar, cVar2);
        if (cVar == null) {
            this.f15543e = new Bundle();
            return;
        }
        throw new NoSuchMethodError();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ IInterface mo10733a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
        return queryLocalInterface instanceof C4143c ? (C4143c) queryLocalInterface : new C4144d(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo10734b() {
        return "com.google.android.gms.auth.api.internal.IAuthService";
    }

    /* renamed from: f */
    public final int mo10738f() {
        return C3183f.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i_ */
    public final String mo10739i_() {
        return "com.google.android.gms.auth.service.START";
    }

    /* renamed from: j */
    public final boolean mo11214j() {
        C3240e z = mo11262z();
        return !TextUtils.isEmpty(z.mo11242a()) && !z.mo11243a(C2966b.f10447a).isEmpty();
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final Bundle mo11225u() {
        return this.f15543e;
    }
}
