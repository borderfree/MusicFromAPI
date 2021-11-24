package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.internal.C3266s;

@C3464ci
/* renamed from: com.google.android.gms.internal.ads.lf */
public final class C3705lf {

    /* renamed from: a */
    private HandlerThread f14383a = null;

    /* renamed from: b */
    private Handler f14384b = null;

    /* renamed from: c */
    private int f14385c = 0;

    /* renamed from: d */
    private final Object f14386d = new Object();

    /* renamed from: a */
    public final Looper mo13214a() {
        Looper looper;
        synchronized (this.f14386d) {
            if (this.f14385c != 0) {
                C3266s.m14914a(this.f14383a, (Object) "Invalid state: mHandlerThread should already been initialized.");
            } else if (this.f14383a == null) {
                C3643iy.m18780a("Starting the looper thread.");
                this.f14383a = new HandlerThread("LooperProvider");
                this.f14383a.start();
                this.f14384b = new Handler(this.f14383a.getLooper());
                C3643iy.m18780a("Looper thread started.");
            } else {
                C3643iy.m18780a("Resuming the looper thread");
                this.f14386d.notifyAll();
            }
            this.f14385c++;
            looper = this.f14383a.getLooper();
        }
        return looper;
    }

    /* renamed from: b */
    public final Handler mo13215b() {
        return this.f14384b;
    }
}
