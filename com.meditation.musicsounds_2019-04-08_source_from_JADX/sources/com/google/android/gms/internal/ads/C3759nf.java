package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.ads.internal.zzbv;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.nf */
final class C3759nf implements Executor {

    /* renamed from: a */
    private final Handler f14485a = new C3644iz(Looper.getMainLooper());

    C3759nf() {
    }

    public final void execute(Runnable runnable) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            try {
                runnable.run();
            } catch (Throwable th) {
                zzbv.zzek();
                C3653jh.m18877a(zzbv.zzeo().mo13061m(), th);
                throw th;
            }
        } else {
            this.f14485a.post(runnable);
        }
    }
}
