package com.google.android.gms.measurement.internal;

import android.app.job.JobParameters;

/* renamed from: com.google.android.gms.measurement.internal.dn */
final /* synthetic */ class C4711dn implements Runnable {

    /* renamed from: a */
    private final C4708dk f16978a;

    /* renamed from: b */
    private final C4767r f16979b;

    /* renamed from: c */
    private final JobParameters f16980c;

    C4711dn(C4708dk dkVar, C4767r rVar, JobParameters jobParameters) {
        this.f16978a = dkVar;
        this.f16979b = rVar;
        this.f16980c = jobParameters;
    }

    public final void run() {
        this.f16978a.mo15496a(this.f16979b, this.f16980c);
    }
}
