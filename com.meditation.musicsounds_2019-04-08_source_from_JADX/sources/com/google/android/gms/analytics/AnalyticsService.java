package com.google.android.gms.analytics;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.internal.measurement.C4280bs;
import com.google.android.gms.internal.measurement.C4284bw;

public final class AnalyticsService extends Service implements C4284bw {

    /* renamed from: a */
    private C4280bs<AnalyticsService> f10358a;

    /* renamed from: a */
    private final C4280bs<AnalyticsService> m13731a() {
        if (this.f10358a == null) {
            this.f10358a = new C4280bs<>(this);
        }
        return this.f10358a;
    }

    /* renamed from: a */
    public final void mo10579a(JobParameters jobParameters, boolean z) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final boolean mo10580a(int i) {
        return stopSelfResult(i);
    }

    public final IBinder onBind(Intent intent) {
        m13731a();
        return null;
    }

    public final void onCreate() {
        super.onCreate();
        m13731a().mo14202a();
    }

    public final void onDestroy() {
        m13731a().mo14206b();
        super.onDestroy();
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        return m13731a().mo14201a(intent, i, i2);
    }
}
