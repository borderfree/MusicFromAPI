package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C3266s;
import com.google.android.gms.common.util.C3300e;

/* renamed from: com.google.android.gms.measurement.internal.dw */
final class C4720dw {

    /* renamed from: a */
    private final C3300e f16996a;

    /* renamed from: b */
    private long f16997b;

    public C4720dw(C3300e eVar) {
        C3266s.m14913a(eVar);
        this.f16996a = eVar;
    }

    /* renamed from: a */
    public final void mo15516a() {
        this.f16997b = this.f16996a.mo11327b();
    }

    /* renamed from: a */
    public final boolean mo15517a(long j) {
        return this.f16997b == 0 || this.f16996a.mo11327b() - this.f16997b >= 3600000;
    }

    /* renamed from: b */
    public final void mo15518b() {
        this.f16997b = 0;
    }
}
