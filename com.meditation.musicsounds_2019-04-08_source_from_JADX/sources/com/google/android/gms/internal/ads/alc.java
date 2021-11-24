package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

public final class alc implements C3387a {

    /* renamed from: a */
    private final Executor f12287a;

    public alc(Handler handler) {
        this.f12287a = new amd(this, handler);
    }

    /* renamed from: a */
    public final void mo11427a(auc<?> auc, bae<?> bae) {
        mo11428a(auc, bae, null);
    }

    /* renamed from: a */
    public final void mo11428a(auc<?> auc, bae<?> bae, Runnable runnable) {
        auc.mo12509k();
        auc.mo12498b("post-response");
        this.f12287a.execute(new anc(this, auc, bae, runnable));
    }

    /* renamed from: a */
    public final void mo11429a(auc<?> auc, zzae zzae) {
        auc.mo12498b("post-error");
        this.f12287a.execute(new anc(this, auc, bae.m17736a(zzae), null));
    }
}
