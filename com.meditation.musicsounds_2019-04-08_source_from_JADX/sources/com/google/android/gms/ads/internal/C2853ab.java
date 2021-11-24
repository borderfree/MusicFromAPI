package com.google.android.gms.ads.internal;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: com.google.android.gms.ads.internal.ab */
final class C2853ab implements OnTouchListener {

    /* renamed from: a */
    private final /* synthetic */ zzbp f9934a;

    C2853ab(zzbp zzbp) {
        this.f9934a = zzbp;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.f9934a.f10211h != null) {
            this.f9934a.f10211h.mo11852a(motionEvent);
        }
        return false;
    }
}
