package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.C3135d.C3136a;
import java.util.Collections;

/* renamed from: com.google.android.gms.common.api.internal.bc */
final class C3084bc implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ ConnectionResult f10719a;

    /* renamed from: b */
    private final /* synthetic */ C3138c f10720b;

    C3084bc(C3138c cVar, ConnectionResult connectionResult) {
        this.f10720b = cVar;
        this.f10719a = connectionResult;
    }

    public final void run() {
        if (this.f10719a.mo10759b()) {
            this.f10720b.f10886f = true;
            if (this.f10720b.f10882b.mo10818j()) {
                this.f10720b.m14503a();
                return;
            }
            try {
                this.f10720b.f10882b.mo10813a(null, Collections.emptySet());
            } catch (SecurityException unused) {
                ((C3136a) C3135d.this.f10861m.get(this.f10720b.f10883c)).mo10865a(new ConnectionResult(10));
            }
        } else {
            ((C3136a) C3135d.this.f10861m.get(this.f10720b.f10883c)).mo10865a(this.f10719a);
        }
    }
}
