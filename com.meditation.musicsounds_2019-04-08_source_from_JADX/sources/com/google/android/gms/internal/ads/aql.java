package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

final class aql implements Callable<T> {

    /* renamed from: a */
    private final /* synthetic */ aqc f12606a;

    /* renamed from: b */
    private final /* synthetic */ aqk f12607b;

    aql(aqk aqk, aqc aqc) {
        this.f12607b = aqk;
        this.f12606a = aqc;
    }

    public final T call() {
        return this.f12606a.mo12285a(this.f12607b.f12604d);
    }
}
