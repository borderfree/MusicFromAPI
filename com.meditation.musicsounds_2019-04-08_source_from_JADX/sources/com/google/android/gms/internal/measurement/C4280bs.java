package com.google.android.gms.internal.measurement;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import com.google.android.gms.common.internal.C3266s;
import com.google.android.gms.internal.measurement.C4284bw;
import com.google.android.gms.p119b.C3008b;

/* renamed from: com.google.android.gms.internal.measurement.bs */
public final class C4280bs<T extends Context & C4284bw> {

    /* renamed from: c */
    private static Boolean f15830c;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Handler f15831a = new C4292cd();

    /* renamed from: b */
    private final T f15832b;

    public C4280bs(T t) {
        C3266s.m14913a(t);
        this.f15832b = t;
    }

    /* renamed from: a */
    private final void m21113a(Runnable runnable) {
        C4499u.m22345a((Context) this.f15832b).mo14849h().mo14795a((C4259ay) new C4283bv(this, runnable));
    }

    /* renamed from: a */
    public static boolean m21114a(Context context) {
        C3266s.m14913a(context);
        if (f15830c != null) {
            return f15830c.booleanValue();
        }
        boolean a = C4286by.m21135a(context, "com.google.android.gms.analytics.AnalyticsService");
        f15830c = Boolean.valueOf(a);
        return a;
    }

    /* renamed from: a */
    public final int mo14201a(Intent intent, int i, int i2) {
        try {
            synchronized (C4279br.f15827a) {
                C3008b bVar = C4279br.f15828b;
                if (bVar != null && bVar.mo10756b()) {
                    bVar.mo10753a();
                }
            }
        } catch (SecurityException unused) {
        }
        C4272bk e = C4499u.m22345a((Context) this.f15832b).mo14846e();
        if (intent == null) {
            e.mo14821e("AnalyticsService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        e.mo14809a("Local AnalyticsService called. startId, action", Integer.valueOf(i2), action);
        if ("com.google.android.gms.analytics.ANALYTICS_DISPATCH".equals(action)) {
            m21113a((Runnable) new C4281bt(this, i2, e));
        }
        return 2;
    }

    /* renamed from: a */
    public final void mo14202a() {
        C4499u.m22345a((Context) this.f15832b).mo14846e().mo14811b("Local AnalyticsService is starting up");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo14203a(int i, C4272bk bkVar) {
        if (((C4284bw) this.f15832b).mo10580a(i)) {
            bkVar.mo14811b("Local AnalyticsService processed last dispatch request");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo14204a(C4272bk bkVar, JobParameters jobParameters) {
        bkVar.mo14811b("AnalyticsJobService processed last dispatch request");
        ((C4284bw) this.f15832b).mo10579a(jobParameters, false);
    }

    @TargetApi(24)
    /* renamed from: a */
    public final boolean mo14205a(JobParameters jobParameters) {
        C4272bk e = C4499u.m22345a((Context) this.f15832b).mo14846e();
        String string = jobParameters.getExtras().getString("action");
        e.mo14808a("Local AnalyticsJobService called. action", string);
        if ("com.google.android.gms.analytics.ANALYTICS_DISPATCH".equals(string)) {
            m21113a((Runnable) new C4282bu(this, e, jobParameters));
        }
        return true;
    }

    /* renamed from: b */
    public final void mo14206b() {
        C4499u.m22345a((Context) this.f15832b).mo14846e().mo14811b("Local AnalyticsService is shutting down");
    }
}
