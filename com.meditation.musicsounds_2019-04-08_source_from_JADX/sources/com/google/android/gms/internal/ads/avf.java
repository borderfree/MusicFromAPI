package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.doubleclick.PublisherAdView;
import com.google.android.gms.ads.formats.OnPublisherAdViewLoadedListener;
import com.google.android.gms.dynamic.C3323b;
import com.google.android.gms.dynamic.C3327d;

public final class avf extends aum {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final OnPublisherAdViewLoadedListener f13180a;

    public avf(OnPublisherAdViewLoadedListener onPublisherAdViewLoadedListener) {
        this.f13180a = onPublisherAdViewLoadedListener;
    }

    /* renamed from: a */
    public final void mo12515a(anv anv, C3323b bVar) {
        if (anv != null && bVar != null) {
            PublisherAdView publisherAdView = new PublisherAdView((Context) C3327d.m15137a(bVar));
            AppEventListener appEventListener = null;
            try {
                if (anv.zzbx() instanceof amj) {
                    amj amj = (amj) anv.zzbx();
                    publisherAdView.setAdListener(amj != null ? amj.mo12097g() : null);
                }
            } catch (RemoteException e) {
                C3731me.m19173b("", e);
            }
            try {
                if (anv.zzbw() instanceof amr) {
                    amr amr = (amr) anv.zzbw();
                    if (amr != null) {
                        appEventListener = amr.mo12107a();
                    }
                    publisherAdView.setAppEventListener(appEventListener);
                }
            } catch (RemoteException e2) {
                C3731me.m19173b("", e2);
            }
            C3719lt.f14416a.post(new avg(this, publisherAdView, anv));
        }
    }
}
