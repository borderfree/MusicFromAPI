package com.google.android.gms.analytics;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import com.google.android.gms.internal.measurement.C4280bs;
import com.google.android.gms.internal.measurement.C4284bw;

@TargetApi(24)
public final class AnalyticsJobService extends JobService implements C4284bw {

    /* renamed from: a */
    private C4280bs<AnalyticsJobService> f10356a;

    /* renamed from: a */
    private final C4280bs<AnalyticsJobService> m13728a() {
        if (this.f10356a == null) {
            this.f10356a = new C4280bs<>(this);
        }
        return this.f10356a;
    }

    @TargetApi(24)
    /* renamed from: a */
    public final void mo10579a(JobParameters jobParameters, boolean z) {
        jobFinished(jobParameters, false);
    }

    /* renamed from: a */
    public final boolean mo10580a(int i) {
        return stopSelfResult(i);
    }

    public final void onCreate() {
        super.onCreate();
        m13728a().mo14202a();
    }

    public final void onDestroy() {
        m13728a().mo14206b();
        super.onDestroy();
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        return m13728a().mo14201a(intent, i, i2);
    }

    public final boolean onStartJob(JobParameters jobParameters) {
        return m13728a().mo14205a(jobParameters);
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }
}
