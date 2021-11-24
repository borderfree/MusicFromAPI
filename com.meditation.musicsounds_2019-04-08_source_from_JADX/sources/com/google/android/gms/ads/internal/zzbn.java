package com.google.android.gms.ads.internal;

import android.os.Handler;

public final class zzbn {

    /* renamed from: a */
    private final Handler f10203a;

    public zzbn(Handler handler) {
        this.f10203a = handler;
    }

    public final boolean postDelayed(Runnable runnable, long j) {
        return this.f10203a.postDelayed(runnable, j);
    }

    public final void removeCallbacks(Runnable runnable) {
        this.f10203a.removeCallbacks(runnable);
    }
}
