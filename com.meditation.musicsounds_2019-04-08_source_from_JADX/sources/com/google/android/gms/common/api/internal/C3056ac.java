package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.C3227d.C3230c;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.common.api.internal.ac */
final class C3056ac extends C3073at {

    /* renamed from: a */
    private final /* synthetic */ C3230c f10643a;

    C3056ac(C3054aa aaVar, C3071ar arVar, C3230c cVar) {
        this.f10643a = cVar;
        super(arVar);
    }

    @GuardedBy("mLock")
    /* renamed from: a */
    public final void mo10894a() {
        this.f10643a.mo11054a(new ConnectionResult(16, null));
    }
}
