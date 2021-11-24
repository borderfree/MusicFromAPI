package com.seattleclouds;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import com.seattleclouds.ads.C5244a;
import com.seattleclouds.ads.C5247b;
import com.seattleclouds.ads.C5260d;
import com.seattleclouds.p154a.C5228a;
import com.seattleclouds.util.C6574ac;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.seattleclouds.o */
public class C6350o {

    /* renamed from: a */
    private static int f22554a = 0;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static boolean f22555b = false;

    /* renamed from: c */
    private static boolean f22556c = true;

    /* renamed from: f */
    private void m30842f(Activity activity) {
        if (f22554a < 1) {
            m30846j(activity);
        }
        f22554a++;
    }

    /* renamed from: g */
    private void m30843g(Activity activity) {
        f22554a = f22554a < 0 ? 0 : f22554a - 1;
        if (f22554a == 0) {
            m30844h(activity);
        }
    }

    /* renamed from: h */
    private void m30844h(final Activity activity) {
        f22555b = false;
        new Timer().schedule(new TimerTask() {
            public void run() {
                if (!C6350o.f22555b) {
                    C6350o.this.m30845i(activity);
                }
            }
        }, 5000);
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public void m30845i(Activity activity) {
        f22556c = true;
        C6574ac.m31815a(activity).mo20547b("lastBackgroundEnterDate", System.currentTimeMillis()).mo20548b();
    }

    /* renamed from: j */
    private void m30846j(Activity activity) {
        f22555b = true;
        if (f22556c) {
            f22556c = false;
            m30847k(activity);
        }
    }

    /* renamed from: k */
    private void m30847k(Activity activity) {
        if (!App.f18510l) {
            C5228a.m25878a((Context) activity).mo16992a(2);
        }
        boolean booleanExtra = activity.getIntent().getBooleanExtra("ARG_STARTED_FROM_NOTIFICATION", false);
        if (!App.f18510l && App.f18474G && !activity.getClass().equals(AppStarterActivity.class) && !booleanExtra) {
            long currentTimeMillis = System.currentTimeMillis();
            long a = C6574ac.m31815a(activity).mo20545a("lastSyncDate", 0);
            long a2 = C6574ac.m31815a(activity).mo20545a("lastBackgroundEnterDate", currentTimeMillis);
            if (currentTimeMillis - a > 86400000 && currentTimeMillis - a2 > 3600000) {
                AppStarterActivity.m25709d(activity);
            }
        }
    }

    /* renamed from: a */
    public void mo19780a(int i, int i2, Intent intent) {
    }

    /* renamed from: a */
    public void mo19781a(Activity activity) {
        m30842f(activity);
    }

    /* renamed from: a */
    public void mo19782a(Activity activity, Configuration configuration) {
        if (!C5260d.m26241a().mo17273c()) {
            C5244a.m26178a(activity);
        }
    }

    /* renamed from: a */
    public void mo19783a(Activity activity, Bundle bundle) {
        f22555b = true;
        if (!App.f18480M && activity.getRequestedOrientation() == -1) {
            activity.setRequestedOrientation(7);
        }
        if (bundle == null) {
            C5247b.m26192a(activity);
        }
    }

    /* renamed from: b */
    public void mo19784b(Activity activity) {
        C5244a.m26178a(activity);
    }

    /* renamed from: b */
    public void mo19785b(Activity activity, Bundle bundle) {
    }

    /* renamed from: c */
    public void mo19786c(Activity activity) {
    }

    /* renamed from: d */
    public void mo19787d(Activity activity) {
        m30843g(activity);
    }

    /* renamed from: e */
    public void mo19788e(Activity activity) {
    }
}
