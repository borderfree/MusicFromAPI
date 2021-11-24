package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;

final class asq implements arz {

    /* renamed from: a */
    private final /* synthetic */ View f13105a;

    /* renamed from: b */
    private final /* synthetic */ asp f13106b;

    asq(asp asp, View view) {
        this.f13106b = asp;
        this.f13105a = view;
    }

    /* renamed from: a */
    public final void mo12407a() {
        this.f13106b.onClick(this.f13105a);
    }

    /* renamed from: a */
    public final void mo12408a(MotionEvent motionEvent) {
        this.f13106b.onTouch(null, motionEvent);
    }
}
