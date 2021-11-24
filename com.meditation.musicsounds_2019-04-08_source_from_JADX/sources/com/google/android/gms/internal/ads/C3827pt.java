package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.webkit.JsResult;

/* renamed from: com.google.android.gms.internal.ads.pt */
final class C3827pt implements OnClickListener {

    /* renamed from: a */
    private final /* synthetic */ JsResult f14673a;

    C3827pt(JsResult jsResult) {
        this.f14673a = jsResult;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f14673a.confirm();
    }
}
