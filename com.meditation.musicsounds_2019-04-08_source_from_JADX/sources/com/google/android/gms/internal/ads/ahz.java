package com.google.android.gms.internal.ads;

import android.database.ContentObserver;
import android.os.Handler;

final class ahz extends ContentObserver {

    /* renamed from: a */
    private final /* synthetic */ ahw f12090a;

    public ahz(ahw ahw, Handler handler) {
        this.f12090a = ahw;
        super(handler);
    }

    public final void onChange(boolean z) {
        super.onChange(z);
        this.f12090a.mo11947a();
    }
}
