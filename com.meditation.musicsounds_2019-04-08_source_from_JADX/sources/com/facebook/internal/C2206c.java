package com.facebook.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.p009v4.content.C0456d;
import com.facebook.appevents.AppEventsLogger;

/* renamed from: com.facebook.internal.c */
public class C2206c extends BroadcastReceiver {

    /* renamed from: a */
    private static C2206c f7165a;

    /* renamed from: b */
    private Context f7166b;

    private C2206c(Context context) {
        this.f7166b = context.getApplicationContext();
    }

    /* renamed from: a */
    public static C2206c m10163a(Context context) {
        if (f7165a != null) {
            return f7165a;
        }
        f7165a = new C2206c(context);
        f7165a.m10164a();
        return f7165a;
    }

    /* renamed from: a */
    private void m10164a() {
        C0456d.m2097a(this.f7166b).mo1844a(this, new IntentFilter("com.parse.bolts.measurement_event"));
    }

    /* renamed from: b */
    private void m10165b() {
        C0456d.m2097a(this.f7166b).mo1843a((BroadcastReceiver) this);
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        try {
            m10165b();
        } finally {
            super.finalize();
        }
    }

    public void onReceive(Context context, Intent intent) {
        AppEventsLogger a = AppEventsLogger.m9940a(context);
        StringBuilder sb = new StringBuilder();
        sb.append("bf_");
        sb.append(intent.getStringExtra("event_name"));
        String sb2 = sb.toString();
        Bundle bundleExtra = intent.getBundleExtra("event_args");
        Bundle bundle = new Bundle();
        for (String str : bundleExtra.keySet()) {
            bundle.putString(str.replaceAll("[^0-9a-zA-Z _-]", "-").replaceAll("^[ -]*", "").replaceAll("[ -]*$", ""), (String) bundleExtra.get(str));
        }
        a.mo7682a(sb2, bundle);
    }
}
