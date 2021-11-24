package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.webkit.JsPromptResult;

/* renamed from: com.google.android.gms.internal.ads.pv */
final class C3829pv implements OnClickListener {

    /* renamed from: a */
    private final /* synthetic */ JsPromptResult f14675a;

    C3829pv(JsPromptResult jsPromptResult) {
        this.f14675a = jsPromptResult;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f14675a.cancel();
    }
}
