package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.measurement.C4368ez;
import com.google.android.gms.internal.measurement.C4397fv;

/* renamed from: com.google.android.gms.measurement.internal.ak */
public final class C4627ak implements ServiceConnection {

    /* renamed from: a */
    final /* synthetic */ C4626aj f16686a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final String f16687b;

    C4627ak(C4626aj ajVar, String str) {
        this.f16686a = ajVar;
        this.f16687b = str;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            this.f16686a.f16685a.mo15253r().mo15849i().mo15858a("Install Referrer connection returned with null binder");
            return;
        }
        try {
            C4368ez a = C4397fv.m21619a(iBinder);
            if (a == null) {
                this.f16686a.f16685a.mo15253r().mo15849i().mo15858a("Install Referrer Service implementation was not found");
                return;
            }
            this.f16686a.f16685a.mo15253r().mo15853v().mo15858a("Install Referrer Service connected");
            this.f16686a.f16685a.mo15252q().mo15314a((Runnable) new C4628al(this, a, this));
        } catch (Exception e) {
            this.f16686a.f16685a.mo15253r().mo15849i().mo15859a("Exception occurred while calling Install Referrer API", e);
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f16686a.f16685a.mo15253r().mo15853v().mo15858a("Install Referrer Service disconnected");
    }
}
