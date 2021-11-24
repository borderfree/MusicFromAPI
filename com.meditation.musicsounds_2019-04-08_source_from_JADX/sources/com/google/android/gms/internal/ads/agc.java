package com.google.android.gms.internal.ads;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

final class agc implements ThreadFactory {

    /* renamed from: a */
    private final ThreadFactory f11960a = Executors.defaultThreadFactory();

    agc() {
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f11960a.newThread(runnable);
        newThread.setName(String.valueOf(newThread.getName()).concat(":"));
        return newThread;
    }
}
