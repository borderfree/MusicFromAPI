package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.measurement.internal.C4708dk;
import com.google.android.gms.measurement.internal.C4713dp;

public final class AppMeasurementService extends Service implements C4713dp {

    /* renamed from: a */
    private C4708dk<AppMeasurementService> f16629a;

    /* renamed from: a */
    private final C4708dk<AppMeasurementService> m22891a() {
        if (this.f16629a == null) {
            this.f16629a = new C4708dk<>(this);
        }
        return this.f16629a;
    }

    /* renamed from: a */
    public final void mo15217a(JobParameters jobParameters, boolean z) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final void mo15218a(Intent intent) {
        AppMeasurementReceiver.m2105a(intent);
    }

    /* renamed from: a */
    public final boolean mo15219a(int i) {
        return stopSelfResult(i);
    }

    public final IBinder onBind(Intent intent) {
        return m22891a().mo15493a(intent);
    }

    public final void onCreate() {
        super.onCreate();
        m22891a().mo15494a();
    }

    public final void onDestroy() {
        m22891a().mo15498b();
        super.onDestroy();
    }

    public final void onRebind(Intent intent) {
        m22891a().mo15500c(intent);
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        return m22891a().mo15492a(intent, i, i2);
    }

    public final boolean onUnbind(Intent intent) {
        return m22891a().mo15499b(intent);
    }
}
