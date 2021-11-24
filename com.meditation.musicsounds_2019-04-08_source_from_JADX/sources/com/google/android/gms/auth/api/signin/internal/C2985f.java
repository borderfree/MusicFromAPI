package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.support.p009v4.content.C0440a;
import android.util.Log;
import com.google.android.gms.common.api.C3040d;
import com.google.android.gms.common.api.internal.C3148k;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.auth.api.signin.internal.f */
public final class C2985f extends C0440a<Void> implements C3148k {

    /* renamed from: o */
    private Semaphore f10516o = new Semaphore(0);

    /* renamed from: p */
    private Set<C3040d> f10517p;

    public C2985f(Context context, Set<C3040d> set) {
        super(context);
        this.f10517p = set;
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public final Void mo1800d() {
        int i = 0;
        for (C3040d a : this.f10517p) {
            if (a.mo10844a((C3148k) this)) {
                i++;
            }
        }
        try {
            this.f10516o.tryAcquire(i, 5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e);
            Thread.currentThread().interrupt();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final void mo1828l() {
        this.f10516o.drainPermits();
        mo1830n();
    }

    /* renamed from: y */
    public final void mo10732y() {
        this.f10516o.release();
    }
}
