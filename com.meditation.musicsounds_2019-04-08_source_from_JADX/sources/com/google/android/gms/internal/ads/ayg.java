package com.google.android.gms.internal.ads;

final class ayg implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f13319a;

    /* renamed from: b */
    private final /* synthetic */ axz f13320b;

    ayg(axz axz, String str) {
        this.f13320b = axz;
        this.f13319a = str;
    }

    public final void run() {
        this.f13320b.f13297a.loadUrl(this.f13319a);
    }
}
