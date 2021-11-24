package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.doubleclick.PublisherAdView;

final class avg implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ PublisherAdView f13181a;

    /* renamed from: b */
    private final /* synthetic */ anv f13182b;

    /* renamed from: c */
    private final /* synthetic */ avf f13183c;

    avg(avf avf, PublisherAdView publisherAdView, anv anv) {
        this.f13183c = avf;
        this.f13181a = publisherAdView;
        this.f13182b = anv;
    }

    public final void run() {
        if (this.f13181a.zza(this.f13182b)) {
            this.f13183c.f13180a.onPublisherAdViewLoaded(this.f13181a);
        } else {
            C3731me.m19178e("Could not bind.");
        }
    }
}
