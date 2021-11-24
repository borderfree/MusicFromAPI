package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver.PendingResult;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.common.internal.C3266s;

/* renamed from: com.google.android.gms.measurement.internal.am */
public final class C4629am {

    /* renamed from: a */
    private final C4632ap f16691a;

    public C4629am(C4632ap apVar) {
        C3266s.m14913a(apVar);
        this.f16691a = apVar;
    }

    /* renamed from: a */
    public static boolean m22965a(Context context) {
        C3266s.m14913a(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            ActivityInfo receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0);
            if (receiverInfo != null && receiverInfo.enabled) {
                return true;
            }
            return false;
        } catch (NameNotFoundException unused) {
        }
    }

    /* renamed from: a */
    public final void mo15294a(Context context, Intent intent) {
        C4638av a = C4638av.m23035a(context, (C4762m) null);
        C4767r r = a.mo15253r();
        if (intent == null) {
            r.mo15849i().mo15858a("Receiver called with null intent");
            return;
        }
        a.mo15256u();
        String action = intent.getAction();
        r.mo15855x().mo15859a("Local receiver got", action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            r.mo15855x().mo15858a("Starting wakeful intent.");
            this.f16691a.mo15215a(context, className);
            return;
        }
        if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
            try {
                a.mo15252q().mo15314a((Runnable) new C4630an(this, a, r));
            } catch (Exception e) {
                r.mo15849i().mo15859a("Install Referrer Reporter encountered a problem", e);
            }
            PendingResult a2 = this.f16691a.mo15214a();
            String stringExtra = intent.getStringExtra("referrer");
            if (stringExtra == null) {
                r.mo15855x().mo15858a("Install referrer extras are null");
                if (a2 != null) {
                    a2.finish();
                }
                return;
            }
            r.mo15853v().mo15859a("Install referrer extras are", stringExtra);
            if (!stringExtra.contains("?")) {
                String str = "?";
                String valueOf = String.valueOf(stringExtra);
                stringExtra = valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
            }
            Bundle a3 = a.mo15343j().mo15579a(Uri.parse(stringExtra));
            if (a3 == null) {
                r.mo15855x().mo15858a("No campaign defined in install referrer broadcast");
                if (a2 != null) {
                    a2.finish();
                }
            } else {
                long longExtra = intent.getLongExtra("referrer_timestamp_seconds", 0) * 1000;
                if (longExtra == 0) {
                    r.mo15849i().mo15858a("Install referrer is missing timestamp");
                }
                C4634ar q = a.mo15252q();
                C4631ao aoVar = new C4631ao(this, a, longExtra, a3, context, r, a2);
                q.mo15314a((Runnable) aoVar);
            }
        }
    }
}
