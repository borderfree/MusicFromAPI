package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.common.api.internal.ab */
final class C3055ab extends C3073at {

    /* renamed from: a */
    private final /* synthetic */ ConnectionResult f10641a;

    /* renamed from: b */
    private final /* synthetic */ C3054aa f10642b;

    C3055ab(C3054aa aaVar, C3071ar arVar, ConnectionResult connectionResult) {
        this.f10642b = aaVar;
        this.f10641a = connectionResult;
        super(arVar);
    }

    @GuardedBy("mLock")
    /* renamed from: a */
    public final void mo10894a() {
        this.f10642b.f10639a.m14581b(this.f10641a);
    }
}
