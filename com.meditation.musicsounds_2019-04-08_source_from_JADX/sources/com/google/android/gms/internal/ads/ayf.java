package com.google.android.gms.internal.ads;

final class ayf implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f13317a;

    /* renamed from: b */
    private final /* synthetic */ axz f13318b;

    ayf(axz axz, String str) {
        this.f13318b = axz;
        this.f13317a = str;
    }

    public final void run() {
        this.f13318b.f13297a.loadData(this.f13317a, "text/html", "UTF-8");
    }
}
