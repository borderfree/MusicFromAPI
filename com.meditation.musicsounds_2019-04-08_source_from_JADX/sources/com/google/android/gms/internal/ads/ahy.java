package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.ref.WeakReference;

public final class ahy implements ajh {

    /* renamed from: a */
    private WeakReference<asb> f12089a;

    public ahy(asb asb) {
        this.f12089a = new WeakReference<>(asb);
    }

    /* renamed from: a */
    public final View mo11964a() {
        asb asb = (asb) this.f12089a.get();
        if (asb != null) {
            return asb.mo12459l();
        }
        return null;
    }

    /* renamed from: b */
    public final boolean mo11965b() {
        return this.f12089a.get() == null;
    }

    /* renamed from: c */
    public final ajh mo11966c() {
        return new aia((asb) this.f12089a.get());
    }
}
