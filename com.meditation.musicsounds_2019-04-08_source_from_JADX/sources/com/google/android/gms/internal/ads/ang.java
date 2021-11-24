package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdListener;

@C3464ci
public class ang extends AdListener {

    /* renamed from: a */
    private final Object f12503a = new Object();

    /* renamed from: b */
    private AdListener f12504b;

    /* renamed from: a */
    public final void mo12122a(AdListener adListener) {
        synchronized (this.f12503a) {
            this.f12504b = adListener;
        }
    }

    public void onAdClosed() {
        synchronized (this.f12503a) {
            if (this.f12504b != null) {
                this.f12504b.onAdClosed();
            }
        }
    }

    public void onAdFailedToLoad(int i) {
        synchronized (this.f12503a) {
            if (this.f12504b != null) {
                this.f12504b.onAdFailedToLoad(i);
            }
        }
    }

    public void onAdLeftApplication() {
        synchronized (this.f12503a) {
            if (this.f12504b != null) {
                this.f12504b.onAdLeftApplication();
            }
        }
    }

    public void onAdLoaded() {
        synchronized (this.f12503a) {
            if (this.f12504b != null) {
                this.f12504b.onAdLoaded();
            }
        }
    }

    public void onAdOpened() {
        synchronized (this.f12503a) {
            if (this.f12504b != null) {
                this.f12504b.onAdOpened();
            }
        }
    }
}
