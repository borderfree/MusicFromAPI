package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.Keep;
import com.google.android.gms.common.internal.C3266s;
import com.google.android.gms.measurement.internal.C4638av;
import com.google.android.gms.measurement.internal.C4742eq;
import com.google.android.gms.measurement.internal.C4762m;
import com.google.firebase.iid.FirebaseInstanceId;

public final class FirebaseAnalytics {

    /* renamed from: a */
    private static volatile FirebaseAnalytics f17578a;

    /* renamed from: b */
    private final C4638av f17579b;

    /* renamed from: c */
    private final Object f17580c = new Object();

    private FirebaseAnalytics(C4638av avVar) {
        C3266s.m14913a(avVar);
        this.f17579b = avVar;
    }

    @Keep
    public static FirebaseAnalytics getInstance(Context context) {
        if (f17578a == null) {
            synchronized (FirebaseAnalytics.class) {
                if (f17578a == null) {
                    f17578a = new FirebaseAnalytics(C4638av.m23035a(context, (C4762m) null));
                }
            }
        }
        return f17578a;
    }

    @Keep
    public final String getFirebaseInstanceId() {
        return FirebaseInstanceId.m24498a().mo16161c();
    }

    @Keep
    public final void setCurrentScreen(Activity activity, String str, String str2) {
        if (!C4742eq.m23658a()) {
            this.f17579b.mo15253r().mo15849i().mo15858a("setCurrentScreen must be called from the main thread");
        } else {
            this.f17579b.mo15351w().mo15445a(activity, str, str2);
        }
    }
}
