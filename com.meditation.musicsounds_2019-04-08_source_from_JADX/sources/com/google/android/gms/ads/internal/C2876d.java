package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzjj;

/* renamed from: com.google.android.gms.ads.internal.d */
final class C2876d implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ zzjj f9971a;

    /* renamed from: b */
    private final /* synthetic */ zzah f9972b;

    C2876d(zzah zzah, zzjj zzjj) {
        this.f9972b = zzah;
        this.f9971a = zzjj;
    }

    public final void run() {
        synchronized (this.f9972b.f10155s) {
            if (this.f9972b.m13625a()) {
                this.f9972b.m13622a(this.f9971a);
            } else {
                this.f9972b.m13623a(this.f9971a, 1);
            }
        }
    }
}
