package com.google.android.gms.ads.internal.overlay;

import android.graphics.drawable.Drawable;

/* renamed from: com.google.android.gms.ads.internal.overlay.e */
final class C2913e implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ Drawable f10051a;

    /* renamed from: b */
    private final /* synthetic */ C2912d f10052b;

    C2913e(C2912d dVar, Drawable drawable) {
        this.f10052b = dVar;
        this.f10051a = drawable;
    }

    public final void run() {
        this.f10052b.f10050a.f10061a.getWindow().setBackgroundDrawable(this.f10051a);
    }
}
