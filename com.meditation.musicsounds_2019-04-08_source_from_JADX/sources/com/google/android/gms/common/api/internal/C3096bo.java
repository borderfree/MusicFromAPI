package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;

/* renamed from: com.google.android.gms.common.api.internal.bo */
final class C3096bo implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C3095bn f10739a;

    C3096bo(C3095bn bnVar) {
        this.f10739a = bnVar;
    }

    public final void run() {
        this.f10739a.f10738h.mo10968b(new ConnectionResult(4));
    }
}
