package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import com.google.android.gms.measurement.internal.C4708dk;
import com.google.android.gms.measurement.internal.C4713dp;

@TargetApi(24)
public final class AppMeasurementJobService extends JobService implements C4713dp {

    /* renamed from: a */
    private C4708dk<AppMeasurementJobService> f16627a;

    /* renamed from: a */
    private final C4708dk<AppMeasurementJobService> m22885a() {
        if (this.f16627a == null) {
            this.f16627a = new C4708dk<>(this);
        }
        return this.f16627a;
    }

    @TargetApi(24)
    /* renamed from: a */
    public final void mo15217a(JobParameters jobParameters, boolean z) {
        jobFinished(jobParameters, false);
    }

    /* renamed from: a */
    public final void mo15218a(Intent intent) {
    }

    /* renamed from: a */
    public final boolean mo15219a(int i) {
        throw new UnsupportedOperationException();
    }

    public final void onCreate() {
        super.onCreate();
        m22885a().mo15494a();
    }

    public final void onDestroy() {
        m22885a().mo15498b();
        super.onDestroy();
    }

    public final void onRebind(Intent intent) {
        m22885a().mo15500c(intent);
    }

    public final boolean onStartJob(JobParameters jobParameters) {
        return m22885a().mo15497a(jobParameters);
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    public final boolean onUnbind(Intent intent) {
        return m22885a().mo15499b(intent);
    }
}
