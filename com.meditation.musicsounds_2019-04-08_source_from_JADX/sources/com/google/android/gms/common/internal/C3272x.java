package com.google.android.gms.common.internal;

import android.content.Intent;
import android.support.p009v4.app.Fragment;

/* renamed from: com.google.android.gms.common.internal.x */
final class C3272x extends C3244g {

    /* renamed from: a */
    private final /* synthetic */ Intent f11124a;

    /* renamed from: b */
    private final /* synthetic */ Fragment f11125b;

    /* renamed from: c */
    private final /* synthetic */ int f11126c;

    C3272x(Intent intent, Fragment fragment, int i) {
        this.f11124a = intent;
        this.f11125b = fragment;
        this.f11126c = i;
    }

    /* renamed from: a */
    public final void mo11259a() {
        if (this.f11124a != null) {
            this.f11125b.startActivityForResult(this.f11124a, this.f11126c);
        }
    }
}
