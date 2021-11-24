package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzn;

final class bdb implements zzn {

    /* renamed from: a */
    private final /* synthetic */ zzzv f13587a;

    bdb(zzzv zzzv) {
        this.f13587a = zzzv;
    }

    public final void onPause() {
        C3731me.m19172b("AdMobCustomTabsAdapter overlay is paused.");
    }

    public final void onResume() {
        C3731me.m19172b("AdMobCustomTabsAdapter overlay is resumed.");
    }

    public final void zzcb() {
        C3731me.m19172b("AdMobCustomTabsAdapter overlay is closed.");
        this.f13587a.f15539b.onAdClosed(this.f13587a);
    }

    public final void zzcc() {
        C3731me.m19172b("Opening AdMobCustomTabsAdapter overlay.");
        this.f13587a.f15539b.onAdOpened(this.f13587a);
    }
}
