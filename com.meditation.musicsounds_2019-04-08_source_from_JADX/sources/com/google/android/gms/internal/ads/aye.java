package com.google.android.gms.internal.ads;

final class aye implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f13315a;

    /* renamed from: b */
    private final /* synthetic */ axz f13316b;

    aye(axz axz, String str) {
        this.f13316b = axz;
        this.f13315a = str;
    }

    public final void run() {
        this.f13316b.f13297a.loadData(this.f13315a, "text/html", "UTF-8");
    }
}
