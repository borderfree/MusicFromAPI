package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.C3040d;
import com.google.android.gms.common.api.C3040d.C3042b;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.common.api.internal.al */
final class C3065al implements C3042b {

    /* renamed from: a */
    private final /* synthetic */ AtomicReference f10678a;

    /* renamed from: b */
    private final /* synthetic */ C3150m f10679b;

    /* renamed from: c */
    private final /* synthetic */ C3063aj f10680c;

    C3065al(C3063aj ajVar, AtomicReference atomicReference, C3150m mVar) {
        this.f10680c = ajVar;
        this.f10678a = atomicReference;
        this.f10679b = mVar;
    }

    /* renamed from: a */
    public final void mo10863a(int i) {
    }

    /* renamed from: a */
    public final void mo10864a(Bundle bundle) {
        this.f10680c.m14128a((C3040d) this.f10678a.get(), this.f10679b, true);
    }
}
