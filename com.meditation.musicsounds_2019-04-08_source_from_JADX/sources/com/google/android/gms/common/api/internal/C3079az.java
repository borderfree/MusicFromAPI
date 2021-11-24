package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.C3135d.C3136a;

/* renamed from: com.google.android.gms.common.api.internal.az */
final class C3079az implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ ConnectionResult f10710a;

    /* renamed from: b */
    private final /* synthetic */ C3136a f10711b;

    C3079az(C3136a aVar, ConnectionResult connectionResult) {
        this.f10711b = aVar;
        this.f10710a = connectionResult;
    }

    public final void run() {
        this.f10711b.mo10865a(this.f10710a);
    }
}
