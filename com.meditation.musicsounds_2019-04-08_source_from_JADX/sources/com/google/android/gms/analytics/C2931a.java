package com.google.android.gms.analytics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C3266s;
import com.google.android.gms.internal.measurement.C4253as;
import com.google.android.gms.internal.measurement.C4272bk;
import com.google.android.gms.internal.measurement.C4286by;
import com.google.android.gms.internal.measurement.C4499u;

/* renamed from: com.google.android.gms.analytics.a */
public class C2931a extends BroadcastReceiver {

    /* renamed from: a */
    private static Boolean f10359a;

    /* renamed from: a */
    public static boolean m13734a(Context context) {
        C3266s.m14913a(context);
        if (f10359a != null) {
            return f10359a.booleanValue();
        }
        boolean a = C4286by.m21136a(context, "com.google.android.gms.analytics.CampaignTrackingReceiver", true);
        f10359a = Boolean.valueOf(a);
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo10591a(Context context, String str) {
    }

    public void onReceive(Context context, Intent intent) {
        C4499u a = C4499u.m22345a(context);
        C4272bk e = a.mo14846e();
        if (intent == null) {
            e.mo14821e("CampaignTrackingReceiver received null intent");
            return;
        }
        String stringExtra = intent.getStringExtra("referrer");
        String action = intent.getAction();
        e.mo14808a("CampaignTrackingReceiver received", action);
        if (!"com.android.vending.INSTALL_REFERRER".equals(action) || TextUtils.isEmpty(stringExtra)) {
            e.mo14821e("CampaignTrackingReceiver received unexpected intent without referrer extra");
            return;
        }
        mo10591a(context, stringExtra);
        int c = C4253as.m20998c();
        if (stringExtra.length() > c) {
            e.mo14817c("Campaign data exceed the maximum supported size and will be clipped. size, limit", Integer.valueOf(stringExtra.length()), Integer.valueOf(c));
            stringExtra = stringExtra.substring(0, c);
        }
        a.mo14849h().mo14797a(stringExtra, new C2944h(this, goAsync()));
    }
}
