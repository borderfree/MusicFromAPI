package com.facebook.appevents.internal;

import android.content.Context;
import android.os.Bundle;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.appevents.AppEventsLogger.FlushBehavior;
import com.facebook.internal.C2240r;
import java.util.Locale;

/* renamed from: com.facebook.appevents.internal.h */
class C2167h {

    /* renamed from: a */
    private static final String f7072a = C2167h.class.getCanonicalName();

    /* renamed from: b */
    private static final long[] f7073b = {300000, 900000, 1800000, 3600000, 21600000, 43200000, 86400000, 172800000, 259200000, 604800000, 1209600000, 1814400000, 2419200000L, 5184000000L, 7776000000L, 10368000000L, 12960000000L, 15552000000L, 31536000000L};

    C2167h() {
    }

    /* renamed from: a */
    private static int m10041a(long j) {
        int i = 0;
        while (i < f7073b.length && f7073b[i] < j) {
            i++;
        }
        return i;
    }

    /* renamed from: a */
    private static void m10042a() {
        C2240r.m10258a(LoggingBehavior.APP_EVENTS, f7072a, "Clock skew detected");
    }

    /* renamed from: a */
    public static void m10043a(Context context, String str, C2166g gVar, String str2) {
        Long valueOf = Long.valueOf(gVar.mo7727f() - gVar.mo7724c().longValue());
        if (valueOf.longValue() < 0) {
            valueOf = Long.valueOf(0);
            m10042a();
        }
        Long valueOf2 = Long.valueOf(gVar.mo7729h());
        if (valueOf2.longValue() < 0) {
            m10042a();
            valueOf2 = Long.valueOf(0);
        }
        Bundle bundle = new Bundle();
        bundle.putInt("fb_mobile_app_interruptions", gVar.mo7725d());
        bundle.putString("fb_mobile_time_between_sessions", String.format(Locale.ROOT, "session_quanta_%d", new Object[]{Integer.valueOf(m10041a(valueOf.longValue()))}));
        C2168i i = gVar.mo7730i();
        bundle.putString("fb_mobile_launch_source", i != null ? i.toString() : "Unclassified");
        bundle.putLong("_logTime", gVar.mo7724c().longValue() / 1000);
        new C2165f(str, str2, null).mo7681a("fb_mobile_deactivate_app", (double) (valueOf2.longValue() / 1000), bundle);
    }

    /* renamed from: a */
    public static void m10044a(Context context, String str, C2168i iVar, String str2) {
        String iVar2 = iVar != null ? iVar.toString() : "Unclassified";
        Bundle bundle = new Bundle();
        bundle.putString("fb_mobile_launch_source", iVar2);
        C2165f fVar = new C2165f(str, str2, null);
        fVar.mo7682a("fb_mobile_activate_app", bundle);
        if (AppEventsLogger.m9939a() != FlushBehavior.EXPLICIT_ONLY) {
            fVar.mo7685b();
        }
    }
}
