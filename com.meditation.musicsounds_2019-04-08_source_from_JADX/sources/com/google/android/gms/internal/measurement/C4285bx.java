package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.C3266s;
import com.google.android.gms.common.util.C3300e;

/* renamed from: com.google.android.gms.internal.measurement.bx */
final class C4285bx {

    /* renamed from: a */
    private final C3300e f15841a;

    /* renamed from: b */
    private long f15842b;

    public C4285bx(C3300e eVar) {
        C3266s.m14913a(eVar);
        this.f15841a = eVar;
    }

    public C4285bx(C3300e eVar, long j) {
        C3266s.m14913a(eVar);
        this.f15841a = eVar;
        this.f15842b = j;
    }

    /* renamed from: a */
    public final void mo14209a() {
        this.f15842b = this.f15841a.mo11327b();
    }

    /* renamed from: a */
    public final boolean mo14210a(long j) {
        return this.f15842b == 0 || this.f15841a.mo11327b() - this.f15842b > j;
    }

    /* renamed from: b */
    public final void mo14211b() {
        this.f15842b = 0;
    }
}
