package com.google.android.gms.internal.ads;

import android.view.View;

final class ajp implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ View f12222a;

    /* renamed from: b */
    private final /* synthetic */ ajo f12223b;

    ajp(ajo ajo, View view) {
        this.f12223b = ajo;
        this.f12222a = view;
    }

    public final void run() {
        this.f12223b.mo12043a(this.f12222a);
    }
}
