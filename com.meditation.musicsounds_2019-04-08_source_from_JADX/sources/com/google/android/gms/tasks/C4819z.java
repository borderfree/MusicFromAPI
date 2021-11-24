package com.google.android.gms.tasks;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.tasks.z */
final class C4819z implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C4818y f17365a;

    /* renamed from: b */
    private final /* synthetic */ Callable f17366b;

    public final void run() {
        try {
            this.f17365a.mo15948a(this.f17366b.call());
        } catch (Exception e) {
            this.f17365a.mo15947a(e);
        }
    }
}
