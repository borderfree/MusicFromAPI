package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;

final class ast implements arz {

    /* renamed from: a */
    private final /* synthetic */ View f13120a;

    /* renamed from: b */
    private final /* synthetic */ asr f13121b;

    ast(asr asr, View view) {
        this.f13121b = asr;
        this.f13120a = view;
    }

    /* renamed from: a */
    public final void mo12407a() {
        if (this.f13121b.m17223a(asr.f13107a)) {
            this.f13121b.onClick(this.f13120a);
        }
    }

    /* renamed from: a */
    public final void mo12408a(MotionEvent motionEvent) {
        this.f13121b.onTouch(null, motionEvent);
    }
}
