package com.google.android.gms.internal.ads;

import android.content.Context;

final class apg implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ Context f12577a;

    /* renamed from: b */
    private final /* synthetic */ apf f12578b;

    apg(apf apf, Context context) {
        this.f12578b = apf;
        this.f12577a = context;
    }

    public final void run() {
        this.f12578b.mo12235a(this.f12577a);
    }
}
