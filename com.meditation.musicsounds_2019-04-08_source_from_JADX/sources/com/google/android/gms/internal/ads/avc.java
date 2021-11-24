package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomClickListener;

@C3464ci
public final class avc extends aug {

    /* renamed from: a */
    private final OnCustomClickListener f13175a;

    public avc(OnCustomClickListener onCustomClickListener) {
        this.f13175a = onCustomClickListener;
    }

    /* renamed from: a */
    public final void mo12513a(atu atu, String str) {
        this.f13175a.onCustomClick(atx.m17360a(atu), str);
    }
}
