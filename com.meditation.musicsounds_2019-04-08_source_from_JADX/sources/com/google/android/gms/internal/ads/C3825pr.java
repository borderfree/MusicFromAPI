package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.webkit.JsResult;

/* renamed from: com.google.android.gms.internal.ads.pr */
final class C3825pr implements OnCancelListener {

    /* renamed from: a */
    private final /* synthetic */ JsResult f14671a;

    C3825pr(JsResult jsResult) {
        this.f14671a = jsResult;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f14671a.cancel();
    }
}
