package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.doubleclick.AppEventListener;

@C3464ci
public final class amr extends aof {

    /* renamed from: a */
    private final AppEventListener f12443a;

    public amr(AppEventListener appEventListener) {
        this.f12443a = appEventListener;
    }

    /* renamed from: a */
    public final AppEventListener mo12107a() {
        return this.f12443a;
    }

    /* renamed from: a */
    public final void mo12108a(String str, String str2) {
        this.f12443a.onAppEvent(str, str2);
    }
}
