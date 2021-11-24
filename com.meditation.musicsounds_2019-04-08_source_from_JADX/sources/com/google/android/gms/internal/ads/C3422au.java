package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzbc;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@C3464ci
/* renamed from: com.google.android.gms.internal.ads.au */
public final class C3422au extends C3638it {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C3413an f13145a;

    /* renamed from: b */
    private final zzaej f13146b;

    /* renamed from: c */
    private final C3623ie f13147c;

    /* renamed from: d */
    private final C3424aw f13148d;

    /* renamed from: e */
    private final Object f13149e;

    /* renamed from: f */
    private Future<C3622id> f13150f;

    public C3422au(Context context, zzbc zzbc, C3623ie ieVar, afm afm, C3413an anVar, aqz aqz) {
        C3424aw awVar = new C3424aw(context, zzbc, new C3690kr(context), afm, ieVar, aqz);
        this(ieVar, anVar, awVar);
    }

    private C3422au(C3623ie ieVar, C3413an anVar, C3424aw awVar) {
        this.f13149e = new Object();
        this.f13147c = ieVar;
        this.f13146b = ieVar.f14161b;
        this.f13145a = anVar;
        this.f13148d = awVar;
    }

    /* renamed from: a */
    public final void mo10051a() {
        int i;
        C3622id idVar = null;
        try {
            synchronized (this.f13149e) {
                this.f13150f = C3651jf.m18856a((Callable<T>) this.f13148d);
            }
            idVar = (C3622id) this.f13150f.get(60000, TimeUnit.MILLISECONDS);
            i = -2;
        } catch (TimeoutException unused) {
            C3643iy.m19178e("Timed out waiting for native ad.");
            this.f13150f.cancel(true);
            i = 2;
        } catch (InterruptedException | CancellationException | ExecutionException unused2) {
            i = 0;
        }
        C3653jh.f14275a.post(new C3423av(this, idVar != null ? idVar : new C3622id(this.f13147c.f14160a.f15259c, null, null, i, null, null, this.f13146b.f15317k, this.f13146b.f15316j, this.f13147c.f14160a.f15265i, false, null, null, null, null, null, this.f13146b.f15314h, this.f13147c.f14163d, this.f13146b.f15312f, this.f13147c.f14165f, this.f13146b.f15319m, this.f13146b.f15320n, this.f13147c.f14167h, null, null, null, null, this.f13147c.f14161b.f15286D, this.f13147c.f14161b.f15287E, null, null, this.f13146b.f15294L, this.f13147c.f14168i, this.f13147c.f14161b.f15297O, false, this.f13147c.f14161b.f15299Q, null, this.f13147c.f14161b.f15301S, this.f13147c.f14161b.f15302T)));
    }

    /* renamed from: h_ */
    public final void mo10052h_() {
        synchronized (this.f13149e) {
            if (this.f13150f != null) {
                this.f13150f.cancel(true);
            }
        }
    }
}
