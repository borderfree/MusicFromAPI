package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.webkit.JsPromptResult;

/* renamed from: com.google.android.gms.internal.ads.pu */
final class C3828pu implements OnCancelListener {

    /* renamed from: a */
    private final /* synthetic */ JsPromptResult f14674a;

    C3828pu(JsPromptResult jsPromptResult) {
        this.f14674a = jsPromptResult;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f14674a.cancel();
    }
}
