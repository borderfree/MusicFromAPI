package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C3020a;
import com.google.android.gms.common.internal.C3227d.C3230c;
import com.google.android.gms.common.internal.C3266s;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.common.api.internal.z */
final class C3163z implements C3230c {

    /* renamed from: a */
    private final WeakReference<C3161x> f10940a;

    /* renamed from: b */
    private final C3020a<?> f10941b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final boolean f10942c;

    public C3163z(C3161x xVar, C3020a<?> aVar, boolean z) {
        this.f10940a = new WeakReference<>(xVar);
        this.f10941b = aVar;
        this.f10942c = z;
    }

    /* renamed from: a */
    public final void mo11054a(ConnectionResult connectionResult) {
        C3161x xVar = (C3161x) this.f10940a.get();
        if (xVar != null) {
            C3266s.m14920a(Looper.myLooper() == xVar.f10918a.f10692d.mo10848c(), (Object) "onReportServiceBinding must be called on the GoogleApiClient handler thread");
            xVar.f10919b.lock();
            try {
                if (xVar.m14583b(0)) {
                    if (!connectionResult.mo10759b()) {
                        xVar.m14582b(connectionResult, this.f10941b, this.f10942c);
                    }
                    if (xVar.m14588d()) {
                        xVar.m14589e();
                    }
                }
            } finally {
                xVar.f10919b.unlock();
            }
        }
    }
}
