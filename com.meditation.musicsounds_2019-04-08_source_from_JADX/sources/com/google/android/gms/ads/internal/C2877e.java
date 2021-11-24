package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzjj;

/* renamed from: com.google.android.gms.ads.internal.e */
final class C2877e implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ zzjj f9973a;

    /* renamed from: b */
    private final /* synthetic */ int f9974b;

    /* renamed from: c */
    private final /* synthetic */ zzah f9975c;

    C2877e(zzah zzah, zzjj zzjj, int i) {
        this.f9975c = zzah;
        this.f9973a = zzjj;
        this.f9974b = i;
    }

    public final void run() {
        synchronized (this.f9975c.f10155s) {
            this.f9975c.m13623a(this.f9973a, this.f9974b);
        }
    }
}
