package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.google.android.gms.internal.ads.C3464ci;
import com.google.android.gms.internal.ads.C3674kb;

@C3464ci
/* renamed from: com.google.android.gms.ads.internal.overlay.c */
final class C2911c extends RelativeLayout {

    /* renamed from: a */
    boolean f10048a;

    /* renamed from: b */
    private C3674kb f10049b;

    public C2911c(Context context, String str, String str2) {
        super(context);
        this.f10049b = new C3674kb(context, str);
        this.f10049b.mo13181b(str2);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f10048a) {
            this.f10049b.mo13177a(motionEvent);
        }
        return false;
    }
}
