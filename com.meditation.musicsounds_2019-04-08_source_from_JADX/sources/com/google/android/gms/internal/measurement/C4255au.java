package com.google.android.gms.internal.measurement;

import android.os.Handler;
import com.google.android.gms.common.internal.C3266s;

/* renamed from: com.google.android.gms.internal.measurement.au */
abstract class C4255au {

    /* renamed from: b */
    private static volatile Handler f15731b;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C4499u f15732a;

    /* renamed from: c */
    private final Runnable f15733c = new C4256av(this);
    /* access modifiers changed from: private */

    /* renamed from: d */
    public volatile long f15734d;

    C4255au(C4499u uVar) {
        C3266s.m14913a(uVar);
        this.f15732a = uVar;
    }

    /* renamed from: e */
    private final Handler m21014e() {
        Handler handler;
        if (f15731b != null) {
            return f15731b;
        }
        synchronized (C4255au.class) {
            if (f15731b == null) {
                f15731b = new C4292cd(this.f15732a.mo14842a().getMainLooper());
            }
            handler = f15731b;
        }
        return handler;
    }

    /* renamed from: a */
    public abstract void mo14133a();

    /* renamed from: a */
    public final void mo14151a(long j) {
        mo14155d();
        if (j >= 0) {
            this.f15734d = this.f15732a.mo14844c().mo11326a();
            if (!m21014e().postDelayed(this.f15733c, j)) {
                this.f15732a.mo14846e().mo14822e("Failed to schedule delayed post. time", Long.valueOf(j));
            }
        }
    }

    /* renamed from: b */
    public final long mo14152b() {
        if (this.f15734d == 0) {
            return 0;
        }
        return Math.abs(this.f15732a.mo14844c().mo11326a() - this.f15734d);
    }

    /* renamed from: b */
    public final void mo14153b(long j) {
        if (mo14154c()) {
            if (j < 0) {
                mo14155d();
                return;
            }
            long abs = j - Math.abs(this.f15732a.mo14844c().mo11326a() - this.f15734d);
            if (abs < 0) {
                abs = 0;
            }
            m21014e().removeCallbacks(this.f15733c);
            if (!m21014e().postDelayed(this.f15733c, abs)) {
                this.f15732a.mo14846e().mo14822e("Failed to adjust delayed post. time", Long.valueOf(abs));
            }
        }
    }

    /* renamed from: c */
    public final boolean mo14154c() {
        return this.f15734d != 0;
    }

    /* renamed from: d */
    public final void mo14155d() {
        this.f15734d = 0;
        m21014e().removeCallbacks(this.f15733c);
    }
}
