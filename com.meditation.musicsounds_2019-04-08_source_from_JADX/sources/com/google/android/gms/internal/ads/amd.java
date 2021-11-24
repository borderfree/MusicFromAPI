package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

final class amd implements Executor {

    /* renamed from: a */
    private final /* synthetic */ Handler f12410a;

    amd(alc alc, Handler handler) {
        this.f12410a = handler;
    }

    public final void execute(Runnable runnable) {
        this.f12410a.post(runnable);
    }
}
