package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.ref.WeakReference;

public final class aic implements ajh {

    /* renamed from: a */
    private final WeakReference<View> f12095a;

    /* renamed from: b */
    private final WeakReference<C3622id> f12096b;

    public aic(View view, C3622id idVar) {
        this.f12095a = new WeakReference<>(view);
        this.f12096b = new WeakReference<>(idVar);
    }

    /* renamed from: a */
    public final View mo11964a() {
        return (View) this.f12095a.get();
    }

    /* renamed from: b */
    public final boolean mo11965b() {
        return this.f12095a.get() == null || this.f12096b.get() == null;
    }

    /* renamed from: c */
    public final ajh mo11966c() {
        return new aib((View) this.f12095a.get(), (C3622id) this.f12096b.get());
    }
}
