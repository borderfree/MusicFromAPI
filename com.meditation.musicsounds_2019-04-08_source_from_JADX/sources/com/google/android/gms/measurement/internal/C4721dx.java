package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobInfo.Builder;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.PersistableBundle;
import com.google.android.gms.common.util.C3300e;
import com.google.android.gms.internal.measurement.C4289ca;

/* renamed from: com.google.android.gms.measurement.internal.dx */
public final class C4721dx extends C4725ea {

    /* renamed from: b */
    private final AlarmManager f16998b = ((AlarmManager) mo15249n().getSystemService("alarm"));

    /* renamed from: c */
    private final C4753fa f16999c;

    /* renamed from: d */
    private Integer f17000d;

    protected C4721dx(C4726eb ebVar) {
        super(ebVar);
        this.f16999c = new C4722dy(this, ebVar.mo15557p(), ebVar);
    }

    @TargetApi(24)
    /* renamed from: w */
    private final void m23383w() {
        JobScheduler jobScheduler = (JobScheduler) mo15249n().getSystemService("jobscheduler");
        int x = m23384x();
        mo15253r().mo15855x().mo15859a("Cancelling job. JobID", Integer.valueOf(x));
        jobScheduler.cancel(x);
    }

    /* renamed from: x */
    private final int m23384x() {
        if (this.f17000d == null) {
            String str = "measurement";
            String valueOf = String.valueOf(mo15249n().getPackageName());
            this.f17000d = Integer.valueOf((valueOf.length() != 0 ? str.concat(valueOf) : new String(str)).hashCode());
        }
        return this.f17000d.intValue();
    }

    /* renamed from: y */
    private final PendingIntent m23385y() {
        Context n = mo15249n();
        return PendingIntent.getBroadcast(n, 0, new Intent().setClassName(n, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), 0);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo15233a() {
        super.mo15233a();
    }

    /* renamed from: a */
    public final void mo15519a(long j) {
        mo15525k();
        mo15256u();
        Context n = mo15249n();
        if (!C4629am.m22965a(n)) {
            mo15253r().mo15854w().mo15858a("Receiver not registered/enabled");
        }
        if (!C4736ek.m23529a(n, false)) {
            mo15253r().mo15854w().mo15858a("Service not registered/enabled");
        }
        mo15520f();
        long b = mo15248m().mo11327b() + j;
        if (j < Math.max(0, ((Long) C4756h.f17116F.mo15821b()).longValue()) && !this.f16999c.mo15814b()) {
            mo15253r().mo15855x().mo15858a("Scheduling upload with DelayedRunnable");
            this.f16999c.mo15813a(j);
        }
        mo15256u();
        if (VERSION.SDK_INT >= 24) {
            mo15253r().mo15855x().mo15858a("Scheduling upload with JobScheduler");
            Context n2 = mo15249n();
            ComponentName componentName = new ComponentName(n2, "com.google.android.gms.measurement.AppMeasurementJobService");
            int x = m23384x();
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
            JobInfo build = new Builder(x, componentName).setMinimumLatency(j).setOverrideDeadline(j << 1).setExtras(persistableBundle).build();
            mo15253r().mo15855x().mo15859a("Scheduling job. JobID", Integer.valueOf(x));
            C4289ca.m21151a(n2, build, "com.google.android.gms", "UploadAlarm");
            return;
        }
        mo15253r().mo15855x().mo15858a("Scheduling upload with AlarmManager");
        this.f16998b.setInexactRepeating(2, b, Math.max(((Long) C4756h.f17111A.mo15821b()).longValue(), j), m23385y());
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo15236b() {
        super.mo15236b();
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo15238c() {
        super.mo15238c();
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo15239d() {
        super.mo15239d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final boolean mo15307e() {
        this.f16998b.cancel(m23385y());
        if (VERSION.SDK_INT >= 24) {
            m23383w();
        }
        return false;
    }

    /* renamed from: f */
    public final void mo15520f() {
        mo15525k();
        this.f16998b.cancel(m23385y());
        this.f16999c.mo15815c();
        if (VERSION.SDK_INT >= 24) {
            m23383w();
        }
    }

    /* renamed from: g */
    public final /* bridge */ /* synthetic */ C4733eh mo15309g() {
        return super.mo15309g();
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ C4741ep mo15311h() {
        return super.mo15311h();
    }

    /* renamed from: i */
    public final /* bridge */ /* synthetic */ C4747ev mo15312i() {
        return super.mo15312i();
    }

    /* renamed from: l */
    public final /* bridge */ /* synthetic */ C4643b mo15247l() {
        return super.mo15247l();
    }

    /* renamed from: m */
    public final /* bridge */ /* synthetic */ C3300e mo15248m() {
        return super.mo15248m();
    }

    /* renamed from: n */
    public final /* bridge */ /* synthetic */ Context mo15249n() {
        return super.mo15249n();
    }

    /* renamed from: o */
    public final /* bridge */ /* synthetic */ C4765p mo15250o() {
        return super.mo15250o();
    }

    /* renamed from: p */
    public final /* bridge */ /* synthetic */ C4736ek mo15251p() {
        return super.mo15251p();
    }

    /* renamed from: q */
    public final /* bridge */ /* synthetic */ C4634ar mo15252q() {
        return super.mo15252q();
    }

    /* renamed from: r */
    public final /* bridge */ /* synthetic */ C4767r mo15253r() {
        return super.mo15253r();
    }

    /* renamed from: s */
    public final /* bridge */ /* synthetic */ C4620ad mo15254s() {
        return super.mo15254s();
    }

    /* renamed from: t */
    public final /* bridge */ /* synthetic */ C4744es mo15255t() {
        return super.mo15255t();
    }

    /* renamed from: u */
    public final /* bridge */ /* synthetic */ C4742eq mo15256u() {
        return super.mo15256u();
    }
}
