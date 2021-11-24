package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C3020a;
import com.google.android.gms.common.api.C3040d.C3042b;
import com.google.android.gms.common.api.C3040d.C3043c;
import com.google.android.gms.common.internal.C3266s;

/* renamed from: com.google.android.gms.common.api.internal.cj */
public final class C3121cj implements C3042b, C3043c {

    /* renamed from: a */
    public final C3020a<?> f10792a;

    /* renamed from: b */
    private final boolean f10793b;

    /* renamed from: c */
    private C3122ck f10794c;

    public C3121cj(C3020a<?> aVar, boolean z) {
        this.f10792a = aVar;
        this.f10793b = z;
    }

    /* renamed from: a */
    private final void m14330a() {
        C3266s.m14914a(this.f10794c, (Object) "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
    }

    /* renamed from: a */
    public final void mo10863a(int i) {
        m14330a();
        this.f10794c.mo10863a(i);
    }

    /* renamed from: a */
    public final void mo10864a(Bundle bundle) {
        m14330a();
        this.f10794c.mo10864a(bundle);
    }

    /* renamed from: a */
    public final void mo10865a(ConnectionResult connectionResult) {
        m14330a();
        this.f10794c.mo10921a(connectionResult, this.f10792a, this.f10793b);
    }

    /* renamed from: a */
    public final void mo11002a(C3122ck ckVar) {
        this.f10794c = ckVar;
    }
}
