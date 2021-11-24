package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.common.api.internal.aq */
final class C3070aq extends C3087bf {

    /* renamed from: a */
    private WeakReference<C3063aj> f10688a;

    C3070aq(C3063aj ajVar) {
        this.f10688a = new WeakReference<>(ajVar);
    }

    /* renamed from: a */
    public final void mo10917a() {
        C3063aj ajVar = (C3063aj) this.f10688a.get();
        if (ajVar != null) {
            ajVar.m14136p();
        }
    }
}
