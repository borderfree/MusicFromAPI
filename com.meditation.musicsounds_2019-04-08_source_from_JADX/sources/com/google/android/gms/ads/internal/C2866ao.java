package com.google.android.gms.ads.internal;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: com.google.android.gms.ads.internal.ao */
final class C2866ao implements OnTouchListener {

    /* renamed from: a */
    private final /* synthetic */ zzx f9954a;

    /* renamed from: b */
    private final /* synthetic */ C2864am f9955b;

    C2866ao(C2864am amVar, zzx zzx) {
        this.f9955b = amVar;
        this.f9954a = zzx;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.f9954a.recordClick();
        if (this.f9955b.f9950b != null) {
            this.f9955b.f9950b.mo12984c();
        }
        return false;
    }
}
