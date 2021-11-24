package com.facebook.ads.internal.p077s.p078a;

import android.os.Build.VERSION;
import android.view.View;

/* renamed from: com.facebook.ads.internal.s.a.j */
public enum C1799j {
    INTERNAL_NO_TAG(0),
    INTERNAL_NO_CLICK(1),
    INTERNAL_API_TOO_LOW(2),
    INTERNAL_WRONG_TAG_CLASS(3),
    INTERNAL_NULL_VIEW(4),
    INTERNAL_AD_ICON(5),
    INTERNAL_AD_TITLE(6),
    INTERNAL_AD_COVER_IMAGE(7),
    INTERNAL_AD_SUBTITLE(8),
    INTERNAL_AD_BODY(9),
    INTERNAL_AD_CALL_TO_ACTION(10),
    INTERNAL_AD_SOCIAL_CONTEXT(11),
    INTERNAL_AD_CHOICES_ICON(12),
    INTERNAL_AD_MEDIA(13);
    

    /* renamed from: o */
    public static int f5864o;

    /* renamed from: p */
    private final int f5866p;

    static {
        f5864o = -1593835521;
    }

    private C1799j(int i) {
        this.f5866p = i;
    }

    /* renamed from: a */
    public static void m8913a(View view, C1799j jVar) {
        if (view != null && jVar != null && VERSION.SDK_INT > 4) {
            view.setTag(f5864o, jVar);
        }
    }

    /* renamed from: a */
    public int mo7065a() {
        return this.f5866p;
    }
}
