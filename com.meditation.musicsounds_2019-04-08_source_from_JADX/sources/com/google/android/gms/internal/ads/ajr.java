package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;

final class ajr implements ValueCallback<String> {

    /* renamed from: a */
    private final /* synthetic */ ajq f12229a;

    ajr(ajq ajq) {
        this.f12229a = ajq;
    }

    public final /* synthetic */ void onReceiveValue(Object obj) {
        this.f12229a.f12227d.mo12044a(this.f12229a.f12224a, this.f12229a.f12225b, (String) obj, this.f12229a.f12226c);
    }
}
