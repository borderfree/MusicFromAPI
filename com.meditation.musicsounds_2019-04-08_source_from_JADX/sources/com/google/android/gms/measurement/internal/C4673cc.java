package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.cc */
final class C4673cc implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AtomicReference f16854a;

    /* renamed from: b */
    private final /* synthetic */ C4672cb f16855b;

    public final void run() {
        synchronized (this.f16854a) {
            try {
                this.f16854a.set(Boolean.valueOf(this.f16855b.mo15255t().mo15747h(this.f16855b.mo15242g().mo15825x())));
                this.f16854a.notify();
            } catch (Throwable th) {
                this.f16854a.notify();
                throw th;
            }
        }
    }
}
