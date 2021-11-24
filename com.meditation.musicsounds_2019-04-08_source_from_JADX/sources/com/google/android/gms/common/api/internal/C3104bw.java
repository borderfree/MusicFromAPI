package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import com.google.android.gms.common.api.C3168n;
import java.lang.ref.WeakReference;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.common.api.internal.bw */
final class C3104bw implements DeathRecipient, C3105bx {

    /* renamed from: a */
    private final WeakReference<BasePendingResult<?>> f10760a;

    /* renamed from: b */
    private final WeakReference<C3168n> f10761b;

    /* renamed from: c */
    private final WeakReference<IBinder> f10762c;

    private C3104bw(BasePendingResult<?> basePendingResult, C3168n nVar, IBinder iBinder) {
        this.f10761b = new WeakReference<>(nVar);
        this.f10760a = new WeakReference<>(basePendingResult);
        this.f10762c = new WeakReference<>(iBinder);
    }

    /* synthetic */ C3104bw(BasePendingResult basePendingResult, C3168n nVar, IBinder iBinder, C3103bv bvVar) {
        this(basePendingResult, null, iBinder);
    }

    /* renamed from: a */
    private final void m14274a() {
        BasePendingResult basePendingResult = (BasePendingResult) this.f10760a.get();
        C3168n nVar = (C3168n) this.f10761b.get();
        if (!(nVar == null || basePendingResult == null)) {
            nVar.mo11088a(basePendingResult.mo10871c().intValue());
        }
        IBinder iBinder = (IBinder) this.f10762c.get();
        if (iBinder != null) {
            try {
                iBinder.unlinkToDeath(this, 0);
            } catch (NoSuchElementException unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo10976a(BasePendingResult<?> basePendingResult) {
        m14274a();
    }

    public final void binderDied() {
        m14274a();
    }
}
