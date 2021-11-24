package com.google.android.gms.ads.internal;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: com.google.android.gms.ads.internal.ap */
final class C2867ap implements OnClickListener {

    /* renamed from: a */
    private final /* synthetic */ zzx f9956a;

    /* renamed from: b */
    private final /* synthetic */ C2864am f9957b;

    C2867ap(C2864am amVar, zzx zzx) {
        this.f9957b = amVar;
        this.f9956a = zzx;
    }

    public final void onClick(View view) {
        this.f9956a.recordClick();
        if (this.f9957b.f9950b != null) {
            this.f9957b.f9950b.mo12984c();
        }
    }
}
