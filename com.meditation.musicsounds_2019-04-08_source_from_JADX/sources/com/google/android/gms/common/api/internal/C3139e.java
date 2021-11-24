package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.common.C3185h.C3186a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C3222at;
import com.google.android.gms.common.internal.C3266s;
import com.google.android.gms.common.internal.C3269u;
import javax.annotation.concurrent.GuardedBy;

@Deprecated
/* renamed from: com.google.android.gms.common.api.internal.e */
public final class C3139e {

    /* renamed from: a */
    private static final Object f10887a = new Object();
    @GuardedBy("sLock")

    /* renamed from: b */
    private static C3139e f10888b;

    /* renamed from: c */
    private final String f10889c;

    /* renamed from: d */
    private final Status f10890d;

    /* renamed from: e */
    private final boolean f10891e;

    /* renamed from: f */
    private final boolean f10892f;

    C3139e(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("google_app_measurement_enable", "integer", resources.getResourcePackageName(C3186a.common_google_play_services_unknown_issue));
        boolean z = true;
        if (identifier != 0) {
            if (resources.getInteger(identifier) == 0) {
                z = false;
            }
            this.f10892f = !z;
        } else {
            this.f10892f = false;
        }
        this.f10891e = z;
        String a = C3222at.m14746a(context);
        if (a == null) {
            a = new C3269u(context).mo11291a("google_app_id");
        }
        if (TextUtils.isEmpty(a)) {
            this.f10890d = new Status(10, "Missing google app id value from from string resources with name google_app_id.");
            this.f10889c = null;
            return;
        }
        this.f10889c = a;
        this.f10890d = Status.f10570a;
    }

    /* renamed from: a */
    public static Status m14510a(Context context) {
        Status status;
        C3266s.m14914a(context, (Object) "Context must not be null.");
        synchronized (f10887a) {
            if (f10888b == null) {
                f10888b = new C3139e(context);
            }
            status = f10888b.f10890d;
        }
        return status;
    }

    /* renamed from: a */
    private static C3139e m14511a(String str) {
        C3139e eVar;
        synchronized (f10887a) {
            if (f10888b != null) {
                eVar = f10888b;
            } else {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34);
                sb.append("Initialize must be called before ");
                sb.append(str);
                sb.append(".");
                throw new IllegalStateException(sb.toString());
            }
        }
        return eVar;
    }

    /* renamed from: a */
    public static String m14512a() {
        return m14511a("getGoogleAppId").f10889c;
    }

    /* renamed from: b */
    public static boolean m14513b() {
        return m14511a("isMeasurementExplicitlyDisabled").f10892f;
    }
}
