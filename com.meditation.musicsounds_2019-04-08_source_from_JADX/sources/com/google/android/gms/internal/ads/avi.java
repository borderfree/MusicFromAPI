package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.UnifiedNativeAd.UnconfirmedClickListener;

public final class avi extends aus {

    /* renamed from: a */
    private final UnconfirmedClickListener f13185a;

    public avi(UnconfirmedClickListener unconfirmedClickListener) {
        this.f13185a = unconfirmedClickListener;
    }

    /* renamed from: a */
    public final void mo12517a() {
        this.f13185a.onUnconfirmedClickCancelled();
    }

    /* renamed from: a */
    public final void mo12518a(String str) {
        this.f13185a.onUnconfirmedClickReceived(str);
    }
}
