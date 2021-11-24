package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.doubleclick.CustomRenderedAd;
import com.google.android.gms.dynamic.C3327d;

@C3464ci
public final class arb implements CustomRenderedAd {

    /* renamed from: a */
    private final arc f12952a;

    public arb(arc arc) {
        this.f12952a = arc;
    }

    public final String getBaseUrl() {
        try {
            return this.f12952a.mo12328a();
        } catch (RemoteException e) {
            C3731me.m19177d("#007 Could not call remote method.", e);
            return null;
        }
    }

    public final String getContent() {
        try {
            return this.f12952a.mo12330b();
        } catch (RemoteException e) {
            C3731me.m19177d("#007 Could not call remote method.", e);
            return null;
        }
    }

    public final void onAdRendered(View view) {
        try {
            this.f12952a.mo12329a(view != null ? C3327d.m15136a(view) : null);
        } catch (RemoteException e) {
            C3731me.m19177d("#007 Could not call remote method.", e);
        }
    }

    public final void recordClick() {
        try {
            this.f12952a.mo12331c();
        } catch (RemoteException e) {
            C3731me.m19177d("#007 Could not call remote method.", e);
        }
    }

    public final void recordImpression() {
        try {
            this.f12952a.mo12332d();
        } catch (RemoteException e) {
            C3731me.m19177d("#007 Could not call remote method.", e);
        }
    }
}
