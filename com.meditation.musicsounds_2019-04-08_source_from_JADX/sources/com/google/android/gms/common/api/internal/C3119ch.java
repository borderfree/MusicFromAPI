package com.google.android.gms.common.api.internal;

import android.app.Dialog;

/* renamed from: com.google.android.gms.common.api.internal.ch */
final class C3119ch extends C3087bf {

    /* renamed from: a */
    private final /* synthetic */ Dialog f10790a;

    /* renamed from: b */
    private final /* synthetic */ C3118cg f10791b;

    C3119ch(C3118cg cgVar, Dialog dialog) {
        this.f10791b = cgVar;
        this.f10790a = dialog;
    }

    /* renamed from: a */
    public final void mo10917a() {
        this.f10791b.f10788a.mo10996h();
        if (this.f10790a.isShowing()) {
            this.f10790a.dismiss();
        }
    }
}
