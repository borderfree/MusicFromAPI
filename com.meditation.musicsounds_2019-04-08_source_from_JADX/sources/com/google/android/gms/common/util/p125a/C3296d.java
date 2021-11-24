package com.google.android.gms.common.util.p125a;

import android.os.Process;

/* renamed from: com.google.android.gms.common.util.a.d */
final class C3296d implements Runnable {

    /* renamed from: a */
    private final Runnable f11192a;

    /* renamed from: b */
    private final int f11193b;

    public C3296d(Runnable runnable, int i) {
        this.f11192a = runnable;
        this.f11193b = i;
    }

    public final void run() {
        Process.setThreadPriority(this.f11193b);
        this.f11192a.run();
    }
}
