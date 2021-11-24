package com.google.android.gms.measurement.internal;

import android.os.Handler;
import com.google.android.gms.common.internal.C3266s;
import com.google.android.gms.internal.measurement.C4292cd;

/* renamed from: com.google.android.gms.measurement.internal.fa */
abstract class C4753fa {

    /* renamed from: b */
    private static volatile Handler f17105b;

    /* renamed from: a */
    private final C4663bt f17106a;

    /* renamed from: c */
    private final Runnable f17107c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public volatile long f17108d;

    C4753fa(C4663bt btVar) {
        C3266s.m14913a(btVar);
        this.f17106a = btVar;
        this.f17107c = new C4754fb(this, btVar);
    }

    /* renamed from: d */
    private final Handler m23778d() {
        Handler handler;
        if (f17105b != null) {
            return f17105b;
        }
        synchronized (C4753fa.class) {
            if (f17105b == null) {
                f17105b = new C4292cd(this.f17106a.mo15249n().getMainLooper());
            }
            handler = f17105b;
        }
        return handler;
    }

    /* renamed from: a */
    public abstract void mo15469a();

    /* renamed from: a */
    public final void mo15813a(long j) {
        mo15815c();
        if (j >= 0) {
            this.f17108d = this.f17106a.mo15248m().mo11326a();
            if (!m23778d().postDelayed(this.f17107c, j)) {
                this.f17106a.mo15253r().mo15852u_().mo15859a("Failed to schedule delayed post. time", Long.valueOf(j));
            }
        }
    }

    /* renamed from: b */
    public final boolean mo15814b() {
        return this.f17108d != 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo15815c() {
        this.f17108d = 0;
        m23778d().removeCallbacks(this.f17107c);
    }
}
