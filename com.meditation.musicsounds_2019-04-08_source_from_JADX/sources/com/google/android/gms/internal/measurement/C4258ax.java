package com.google.android.gms.internal.measurement;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobInfo.Builder;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import android.os.PersistableBundle;
import com.google.android.gms.common.internal.C3266s;

/* renamed from: com.google.android.gms.internal.measurement.ax */
public final class C4258ax extends C4497s {

    /* renamed from: a */
    private boolean f15736a;

    /* renamed from: b */
    private boolean f15737b;

    /* renamed from: c */
    private final AlarmManager f15738c = ((AlarmManager) mo14826i().getSystemService("alarm"));

    /* renamed from: d */
    private Integer f15739d;

    protected C4258ax(C4499u uVar) {
        super(uVar);
    }

    /* renamed from: f */
    private final PendingIntent m21024f() {
        Context i = mo14826i();
        return PendingIntent.getBroadcast(i, 0, new Intent("com.google.android.gms.analytics.ANALYTICS_DISPATCH").setComponent(new ComponentName(i, "com.google.android.gms.analytics.AnalyticsReceiver")), 0);
    }

    /* renamed from: z */
    private final int m21025z() {
        if (this.f15739d == null) {
            String str = "analytics";
            String valueOf = String.valueOf(mo14826i().getPackageName());
            this.f15739d = Integer.valueOf((valueOf.length() != 0 ? str.concat(valueOf) : new String(str)).hashCode());
        }
        return this.f15739d.intValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10611a() {
        try {
            mo14162e();
            if (C4253as.m21000e() > 0) {
                Context i = mo14826i();
                ActivityInfo receiverInfo = i.getPackageManager().getReceiverInfo(new ComponentName(i, "com.google.android.gms.analytics.AnalyticsReceiver"), 0);
                if (receiverInfo != null && receiverInfo.enabled) {
                    mo14811b("Receiver registered for local dispatch.");
                    this.f15736a = true;
                }
            }
        } catch (NameNotFoundException unused) {
        }
    }

    /* renamed from: b */
    public final boolean mo14159b() {
        return this.f15736a;
    }

    /* renamed from: c */
    public final boolean mo14160c() {
        return this.f15737b;
    }

    /* renamed from: d */
    public final void mo14161d() {
        mo14840x();
        C3266s.m14920a(this.f15736a, (Object) "Receiver not registered");
        long e = C4253as.m21000e();
        if (e > 0) {
            mo14162e();
            long b = mo14825h().mo11327b() + e;
            this.f15737b = true;
            ((Boolean) C4262ba.f15746F.mo14166a()).booleanValue();
            if (VERSION.SDK_INT >= 24) {
                mo14811b("Scheduling upload with JobScheduler");
                Context i = mo14826i();
                ComponentName componentName = new ComponentName(i, "com.google.android.gms.analytics.AnalyticsJobService");
                int z = m21025z();
                PersistableBundle persistableBundle = new PersistableBundle();
                persistableBundle.putString("action", "com.google.android.gms.analytics.ANALYTICS_DISPATCH");
                JobInfo build = new Builder(z, componentName).setMinimumLatency(e).setOverrideDeadline(e << 1).setExtras(persistableBundle).build();
                mo14808a("Scheduling job. JobID", Integer.valueOf(z));
                C4289ca.m21151a(i, build, "com.google.android.gms", "DispatchAlarm");
                return;
            }
            mo14811b("Scheduling upload with AlarmManager");
            this.f15738c.setInexactRepeating(2, b, e, m21024f());
        }
    }

    /* renamed from: e */
    public final void mo14162e() {
        this.f15737b = false;
        this.f15738c.cancel(m21024f());
        if (VERSION.SDK_INT >= 24) {
            JobScheduler jobScheduler = (JobScheduler) mo14826i().getSystemService("jobscheduler");
            int z = m21025z();
            mo14808a("Cancelling job. JobID", Integer.valueOf(z));
            jobScheduler.cancel(z);
        }
    }
}
