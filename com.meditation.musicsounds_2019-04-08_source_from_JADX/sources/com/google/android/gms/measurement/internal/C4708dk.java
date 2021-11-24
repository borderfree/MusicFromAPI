package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.common.internal.C3266s;
import com.google.android.gms.measurement.internal.C4713dp;

/* renamed from: com.google.android.gms.measurement.internal.dk */
public final class C4708dk<T extends Context & C4713dp> {

    /* renamed from: a */
    private final T f16972a;

    public C4708dk(T t) {
        C3266s.m14913a(t);
        this.f16972a = t;
    }

    /* renamed from: a */
    private final void m23322a(Runnable runnable) {
        C4726eb a = C4726eb.m23418a((Context) this.f16972a);
        a.mo15252q().mo15314a((Runnable) new C4712do(this, a, runnable));
    }

    /* renamed from: c */
    private final C4767r m23323c() {
        return C4638av.m23035a((Context) this.f16972a, (C4762m) null).mo15253r();
    }

    /* renamed from: a */
    public final int mo15492a(Intent intent, int i, int i2) {
        C4638av a = C4638av.m23035a((Context) this.f16972a, (C4762m) null);
        C4767r r = a.mo15253r();
        if (intent == null) {
            r.mo15849i().mo15858a("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        a.mo15256u();
        r.mo15855x().mo15860a("Local AppMeasurementService called. startId, action", Integer.valueOf(i2), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            m23322a((Runnable) new C4709dl(this, i2, r, intent));
        }
        return 2;
    }

    /* renamed from: a */
    public final IBinder mo15493a(Intent intent) {
        if (intent == null) {
            m23323c().mo15852u_().mo15858a("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new C4640ax(C4726eb.m23418a((Context) this.f16972a));
        }
        m23323c().mo15849i().mo15859a("onBind received unknown action", action);
        return null;
    }

    /* renamed from: a */
    public final void mo15494a() {
        C4638av a = C4638av.m23035a((Context) this.f16972a, (C4762m) null);
        C4767r r = a.mo15253r();
        a.mo15256u();
        r.mo15855x().mo15858a("Local AppMeasurementService is starting up");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo15495a(int i, C4767r rVar, Intent intent) {
        if (((C4713dp) this.f16972a).mo15219a(i)) {
            rVar.mo15855x().mo15859a("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i));
            m23323c().mo15855x().mo15858a("Completed wakeful intent.");
            ((C4713dp) this.f16972a).mo15218a(intent);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo15496a(C4767r rVar, JobParameters jobParameters) {
        rVar.mo15855x().mo15858a("AppMeasurementJobService processed last upload request.");
        ((C4713dp) this.f16972a).mo15217a(jobParameters, false);
    }

    @TargetApi(24)
    /* renamed from: a */
    public final boolean mo15497a(JobParameters jobParameters) {
        C4638av a = C4638av.m23035a((Context) this.f16972a, (C4762m) null);
        C4767r r = a.mo15253r();
        String string = jobParameters.getExtras().getString("action");
        a.mo15256u();
        r.mo15855x().mo15859a("Local AppMeasurementJobService called. action", string);
        if ("com.google.android.gms.measurement.UPLOAD".equals(string)) {
            m23322a((Runnable) new C4711dn(this, r, jobParameters));
        }
        return true;
    }

    /* renamed from: b */
    public final void mo15498b() {
        C4638av a = C4638av.m23035a((Context) this.f16972a, (C4762m) null);
        C4767r r = a.mo15253r();
        a.mo15256u();
        r.mo15855x().mo15858a("Local AppMeasurementService is shutting down");
    }

    /* renamed from: b */
    public final boolean mo15499b(Intent intent) {
        if (intent == null) {
            m23323c().mo15852u_().mo15858a("onUnbind called with null intent");
            return true;
        }
        m23323c().mo15855x().mo15859a("onUnbind called for intent. action", intent.getAction());
        return true;
    }

    /* renamed from: c */
    public final void mo15500c(Intent intent) {
        if (intent == null) {
            m23323c().mo15852u_().mo15858a("onRebind called with null intent");
            return;
        }
        m23323c().mo15855x().mo15859a("onRebind called. action", intent.getAction());
    }
}
