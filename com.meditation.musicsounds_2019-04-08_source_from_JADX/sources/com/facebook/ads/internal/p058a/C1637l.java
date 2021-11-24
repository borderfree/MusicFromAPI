package com.facebook.ads.internal.p058a;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Build.VERSION;
import android.os.Bundle;
import com.facebook.ads.internal.p072o.C1728c;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* renamed from: com.facebook.ads.internal.a.l */
public class C1637l {

    /* renamed from: a */
    private final C1728c f5320a;

    /* renamed from: b */
    private Application f5321b;

    /* renamed from: c */
    private C1638a f5322c;

    /* renamed from: d */
    private long f5323d = 0;

    /* renamed from: e */
    private String f5324e = null;

    /* renamed from: f */
    private C1626a f5325f = null;

    @TargetApi(14)
    /* renamed from: com.facebook.ads.internal.a.l$a */
    private static class C1638a implements ActivityLifecycleCallbacks {

        /* renamed from: a */
        private final WeakReference<Activity> f5326a;

        /* renamed from: b */
        private C1637l f5327b;

        public C1638a(Activity activity, C1637l lVar) {
            this.f5326a = new WeakReference<>(activity);
            this.f5327b = lVar;
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
        }

        public void onActivityPaused(Activity activity) {
        }

        public void onActivityResumed(Activity activity) {
            if (this.f5327b != null) {
                Activity activity2 = (Activity) this.f5326a.get();
                if (activity2 == null || (activity2 != null && activity.equals(activity2))) {
                    this.f5327b.mo6664a();
                    this.f5327b = null;
                }
            }
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    private C1637l(C1728c cVar, Activity activity, int i) {
        this.f5320a = cVar;
        this.f5321b = activity.getApplication();
        this.f5322c = new C1638a(activity, this);
    }

    /* renamed from: a */
    public static C1637l m8203a(C1728c cVar, Activity activity) {
        return m8204a(cVar, activity, VERSION.SDK_INT);
    }

    /* renamed from: a */
    protected static C1637l m8204a(C1728c cVar, Activity activity, int i) {
        if (activity == null || i < 14) {
            return null;
        }
        return new C1637l(cVar, activity, i);
    }

    /* renamed from: a */
    private void m8205a(String str, long j, long j2, C1626a aVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("leave_time", Long.toString(j));
        hashMap.put("back_time", Long.toString(j2));
        if (aVar != null) {
            hashMap.put("outcome", aVar.name());
        }
        this.f5320a.mo6947h(str, hashMap);
    }

    @TargetApi(14)
    /* renamed from: a */
    public void mo6664a() {
        m8205a(this.f5324e, this.f5323d, System.currentTimeMillis(), this.f5325f);
        if (this.f5321b != null && this.f5322c != null) {
            this.f5321b.unregisterActivityLifecycleCallbacks(this.f5322c);
            this.f5322c = null;
            this.f5321b = null;
        }
    }

    /* renamed from: a */
    public void mo6665a(C1626a aVar) {
        this.f5325f = aVar;
    }

    @TargetApi(14)
    /* renamed from: a */
    public void mo6666a(String str) {
        this.f5324e = str;
        if (this.f5322c == null || this.f5321b == null) {
            m8205a(str, -1, -1, C1626a.CANNOT_TRACK);
            return;
        }
        this.f5323d = System.currentTimeMillis();
        this.f5321b.registerActivityLifecycleCallbacks(this.f5322c);
    }
}
