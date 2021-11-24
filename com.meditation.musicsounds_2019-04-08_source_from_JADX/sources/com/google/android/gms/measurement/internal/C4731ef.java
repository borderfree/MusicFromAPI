package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.ef */
final class C4731ef implements Callable<String> {

    /* renamed from: a */
    private final /* synthetic */ zzk f17042a;

    /* renamed from: b */
    private final /* synthetic */ C4726eb f17043b;

    C4731ef(C4726eb ebVar, zzk zzk) {
        this.f17043b = ebVar;
        this.f17042a = zzk;
    }

    public final /* synthetic */ Object call() {
        C4738em a = this.f17043b.mo15539b().mo15750j(this.f17042a.f17264a) ? this.f17043b.m23434e(this.f17042a) : this.f17043b.mo15546d().mo15788b(this.f17042a.f17264a);
        if (a != null) {
            return a.mo15622c();
        }
        this.f17043b.mo15253r().mo15849i().mo15858a("App info was null when attempting to get app instance id");
        return null;
    }
}
