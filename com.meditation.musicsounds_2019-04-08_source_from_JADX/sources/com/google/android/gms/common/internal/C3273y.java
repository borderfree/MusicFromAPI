package com.google.android.gms.common.internal;

import android.content.Intent;
import com.google.android.gms.common.api.internal.C3141g;

/* renamed from: com.google.android.gms.common.internal.y */
final class C3273y extends C3244g {

    /* renamed from: a */
    private final /* synthetic */ Intent f11127a;

    /* renamed from: b */
    private final /* synthetic */ C3141g f11128b;

    /* renamed from: c */
    private final /* synthetic */ int f11129c;

    C3273y(Intent intent, C3141g gVar, int i) {
        this.f11127a = intent;
        this.f11128b = gVar;
        this.f11129c = i;
    }

    /* renamed from: a */
    public final void mo11259a() {
        if (this.f11127a != null) {
            this.f11128b.startActivityForResult(this.f11127a, this.f11129c);
        }
    }
}
