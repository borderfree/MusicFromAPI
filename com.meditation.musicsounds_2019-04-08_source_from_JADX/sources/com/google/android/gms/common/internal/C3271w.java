package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.Intent;

/* renamed from: com.google.android.gms.common.internal.w */
final class C3271w extends C3244g {

    /* renamed from: a */
    private final /* synthetic */ Intent f11121a;

    /* renamed from: b */
    private final /* synthetic */ Activity f11122b;

    /* renamed from: c */
    private final /* synthetic */ int f11123c;

    C3271w(Intent intent, Activity activity, int i) {
        this.f11121a = intent;
        this.f11122b = activity;
        this.f11123c = i;
    }

    /* renamed from: a */
    public final void mo11259a() {
        if (this.f11121a != null) {
            this.f11122b.startActivityForResult(this.f11121a, this.f11123c);
        }
    }
}
