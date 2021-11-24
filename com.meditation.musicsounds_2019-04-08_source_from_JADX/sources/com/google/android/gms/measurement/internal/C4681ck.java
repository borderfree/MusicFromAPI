package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;

@TargetApi(14)
/* renamed from: com.google.android.gms.measurement.internal.ck */
final class C4681ck implements ActivityLifecycleCallbacks {

    /* renamed from: a */
    private final /* synthetic */ C4672cb f16887a;

    private C4681ck(C4672cb cbVar) {
        this.f16887a = cbVar;
    }

    /* synthetic */ C4681ck(C4672cb cbVar, C4673cc ccVar) {
        this(cbVar);
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        try {
            this.f16887a.mo15253r().mo15855x().mo15858a("onActivityCreated");
            Intent intent = activity.getIntent();
            if (intent != null) {
                Uri data = intent.getData();
                if (data != null && data.isHierarchical()) {
                    if (bundle == null) {
                        Bundle a = this.f16887a.mo15251p().mo15579a(data);
                        this.f16887a.mo15251p();
                        String str = C4736ek.m23530a(intent) ? "gs" : "auto";
                        if (a != null) {
                            this.f16887a.mo15413a(str, "_cmp", a);
                        }
                    }
                    String queryParameter = data.getQueryParameter("referrer");
                    if (!TextUtils.isEmpty(queryParameter)) {
                        if (!(queryParameter.contains("gclid") && (queryParameter.contains("utm_campaign") || queryParameter.contains("utm_source") || queryParameter.contains("utm_medium") || queryParameter.contains("utm_term") || queryParameter.contains("utm_content")))) {
                            this.f16887a.mo15253r().mo15854w().mo15858a("Activity created with data 'referrer' param without gclid and at least one utm field");
                            return;
                        }
                        this.f16887a.mo15253r().mo15854w().mo15859a("Activity created with referrer", queryParameter);
                        if (!TextUtils.isEmpty(queryParameter)) {
                            this.f16887a.mo15416a("auto", "_ldl", (Object) queryParameter, true);
                        }
                    } else {
                        return;
                    }
                }
            }
        } catch (Exception e) {
            this.f16887a.mo15253r().mo15852u_().mo15859a("Throwable caught in onActivityCreated", e);
        }
        this.f16887a.mo15244i().mo15444a(activity, bundle);
    }

    public final void onActivityDestroyed(Activity activity) {
        this.f16887a.mo15244i().mo15449c(activity);
    }

    public final void onActivityPaused(Activity activity) {
        this.f16887a.mo15244i().mo15447b(activity);
        C4714dq k = this.f16887a.mo15246k();
        k.mo15252q().mo15314a((Runnable) new C4719dv(k, k.mo15248m().mo11327b()));
    }

    public final void onActivityResumed(Activity activity) {
        this.f16887a.mo15244i().mo15443a(activity);
        C4714dq k = this.f16887a.mo15246k();
        k.mo15252q().mo15314a((Runnable) new C4718du(k, k.mo15248m().mo11327b()));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.f16887a.mo15244i().mo15448b(activity, bundle);
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }
}
