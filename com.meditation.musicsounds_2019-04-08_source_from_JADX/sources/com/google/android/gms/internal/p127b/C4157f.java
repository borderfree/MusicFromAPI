package com.google.android.gms.internal.p127b;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.C2962a.C2963a;
import com.google.android.gms.common.api.C3040d.C3042b;
import com.google.android.gms.common.api.C3040d.C3043c;
import com.google.android.gms.common.internal.C3240e;
import com.google.android.gms.common.internal.C3245h;

/* renamed from: com.google.android.gms.internal.b.f */
public final class C4157f extends C3245h<C4158g> {

    /* renamed from: e */
    private final C2963a f15600e;

    public C4157f(Context context, Looper looper, C3240e eVar, C2963a aVar, C3042b bVar, C3043c cVar) {
        super(context, looper, 68, eVar, bVar, cVar);
        this.f15600e = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ IInterface mo10733a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        return queryLocalInterface instanceof C4158g ? (C4158g) queryLocalInterface : new C4159h(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo10734b() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    /* renamed from: f */
    public final int mo10738f() {
        return 12800000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i_ */
    public final String mo10739i_() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final Bundle mo11225u() {
        return this.f15600e == null ? new Bundle() : this.f15600e.mo10664a();
    }
}
