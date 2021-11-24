package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.webkit.JsResult;

/* renamed from: com.google.android.gms.internal.ads.ps */
final class C3826ps implements OnClickListener {

    /* renamed from: a */
    private final /* synthetic */ JsResult f14672a;

    C3826ps(JsResult jsResult) {
        this.f14672a = jsResult;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f14672a.cancel();
    }
}
