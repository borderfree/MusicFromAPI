package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import com.google.android.gms.ads.internal.zzbv;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.annotation.concurrent.GuardedBy;

@TargetApi(14)
final class ajl implements ActivityLifecycleCallbacks {

    /* renamed from: a */
    private Activity f12195a;

    /* renamed from: b */
    private Context f12196b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Object f12197c = new Object();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f12198d = true;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f12199e = false;
    /* access modifiers changed from: private */
    @GuardedBy("mLock")

    /* renamed from: f */
    public final List<ajn> f12200f = new ArrayList();
    @GuardedBy("mLock")

    /* renamed from: g */
    private final List<aka> f12201g = new ArrayList();

    /* renamed from: h */
    private Runnable f12202h;

    /* renamed from: i */
    private boolean f12203i = false;

    /* renamed from: j */
    private long f12204j;

    ajl() {
    }

    /* renamed from: a */
    private final void m16387a(Activity activity) {
        synchronized (this.f12197c) {
            if (!activity.getClass().getName().startsWith("com.google.android.gms.ads")) {
                this.f12195a = activity;
            }
        }
    }

    /* renamed from: a */
    public final Activity mo12029a() {
        return this.f12195a;
    }

    /* renamed from: a */
    public final void mo12030a(Application application, Context context) {
        if (!this.f12203i) {
            application.registerActivityLifecycleCallbacks(this);
            if (context instanceof Activity) {
                m16387a((Activity) context);
            }
            this.f12196b = application;
            this.f12204j = ((Long) ane.m16650f().mo12297a(aqm.f12642aH)).longValue();
            this.f12203i = true;
        }
    }

    /* renamed from: a */
    public final void mo12031a(ajn ajn) {
        synchronized (this.f12197c) {
            this.f12200f.add(ajn);
        }
    }

    /* renamed from: b */
    public final Context mo12032b() {
        return this.f12196b;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
        synchronized (this.f12197c) {
            if (this.f12195a != null) {
                if (this.f12195a.equals(activity)) {
                    this.f12195a = null;
                }
                Iterator it = this.f12201g.iterator();
                while (it.hasNext()) {
                    try {
                        if (((aka) it.next()).mo12066c(activity)) {
                            it.remove();
                        }
                    } catch (Exception e) {
                        zzbv.zzeo().mo13047a((Throwable) e, "AppActivityTracker.ActivityListener.onActivityDestroyed");
                        C3731me.m19173b("", e);
                    }
                }
            }
        }
    }

    public final void onActivityPaused(Activity activity) {
        m16387a(activity);
        synchronized (this.f12197c) {
            for (aka b : this.f12201g) {
                try {
                    b.mo12065b(activity);
                } catch (Exception e) {
                    zzbv.zzeo().mo13047a((Throwable) e, "AppActivityTracker.ActivityListener.onActivityPaused");
                    C3731me.m19173b("", e);
                }
            }
        }
        this.f12199e = true;
        if (this.f12202h != null) {
            C3653jh.f14275a.removeCallbacks(this.f12202h);
        }
        Handler handler = C3653jh.f14275a;
        ajm ajm = new ajm(this);
        this.f12202h = ajm;
        handler.postDelayed(ajm, this.f12204j);
    }

    public final void onActivityResumed(Activity activity) {
        m16387a(activity);
        this.f12199e = false;
        boolean z = !this.f12198d;
        this.f12198d = true;
        if (this.f12202h != null) {
            C3653jh.f14275a.removeCallbacks(this.f12202h);
        }
        synchronized (this.f12197c) {
            for (aka a : this.f12201g) {
                try {
                    a.mo12064a(activity);
                } catch (Exception e) {
                    zzbv.zzeo().mo13047a((Throwable) e, "AppActivityTracker.ActivityListener.onActivityResumed");
                    C3731me.m19173b("", e);
                }
            }
            if (z) {
                for (ajn a2 : this.f12200f) {
                    try {
                        a2.mo12041a(true);
                    } catch (Exception e2) {
                        C3731me.m19173b("", e2);
                    }
                }
            } else {
                C3643iy.m19172b("App is still foreground.");
            }
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
        m16387a(activity);
    }

    public final void onActivityStopped(Activity activity) {
    }
}
