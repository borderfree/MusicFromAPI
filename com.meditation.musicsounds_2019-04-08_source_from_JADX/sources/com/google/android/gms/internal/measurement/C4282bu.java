package com.google.android.gms.internal.measurement;

import android.app.job.JobParameters;

/* renamed from: com.google.android.gms.internal.measurement.bu */
final /* synthetic */ class C4282bu implements Runnable {

    /* renamed from: a */
    private final C4280bs f15836a;

    /* renamed from: b */
    private final C4272bk f15837b;

    /* renamed from: c */
    private final JobParameters f15838c;

    C4282bu(C4280bs bsVar, C4272bk bkVar, JobParameters jobParameters) {
        this.f15836a = bsVar;
        this.f15837b = bkVar;
        this.f15838c = jobParameters;
    }

    public final void run() {
        this.f15836a.mo14204a(this.f15837b, this.f15838c);
    }
}
