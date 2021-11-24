package com.google.android.gms.common.api.internal;

/* renamed from: com.google.android.gms.common.api.internal.cm */
final class C3124cm implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C3123cl f10809a;

    C3124cm(C3123cl clVar) {
        this.f10809a = clVar;
    }

    public final void run() {
        this.f10809a.f10807m.lock();
        try {
            this.f10809a.m14352e();
        } finally {
            this.f10809a.f10807m.unlock();
        }
    }
}
