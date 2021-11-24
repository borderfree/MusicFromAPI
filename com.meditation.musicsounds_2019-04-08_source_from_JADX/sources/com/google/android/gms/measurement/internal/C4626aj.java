package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import com.google.android.gms.common.p123d.C3180b;
import com.google.android.gms.common.p123d.C3181c;
import com.google.android.gms.common.stats.C3285a;
import com.google.android.gms.internal.measurement.C4368ez;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.aj */
public final class C4626aj {

    /* renamed from: a */
    final C4638av f16685a;

    C4626aj(C4638av avVar) {
        this.f16685a = avVar;
    }

    /* renamed from: a */
    private final boolean m22961a() {
        boolean z = false;
        try {
            C3180b a = C3181c.m14658a(this.f16685a.mo15249n());
            if (a == null) {
                this.f16685a.mo15253r().mo15853v().mo15858a("Failed to retrieve Package Manager to check Play Store compatibility");
                return false;
            }
            if (a.mo11129b("com.android.vending", 128).versionCode >= 80837300) {
                z = true;
            }
            return z;
        } catch (Exception e) {
            this.f16685a.mo15253r().mo15853v().mo15859a("Failed to retrieve Play Store version", e);
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Bundle mo15289a(String str, C4368ez ezVar) {
        this.f16685a.mo15252q().mo15239d();
        if (ezVar == null) {
            this.f16685a.mo15253r().mo15849i().mo15858a("Attempting to use Install Referrer Service while it is not initialized");
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("package_name", str);
        try {
            Bundle a = ezVar.mo14451a(bundle);
            if (a != null) {
                return a;
            }
            this.f16685a.mo15253r().mo15852u_().mo15858a("Install Referrer Service returned a null response");
            return null;
        } catch (Exception e) {
            this.f16685a.mo15253r().mo15852u_().mo15859a("Exception occurred while retrieving the Install Referrer", e.getMessage());
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo15290a(String str) {
        if (str == null || str.isEmpty()) {
            this.f16685a.mo15253r().mo15853v().mo15858a("Install Referrer Reporter was called with invalid app package name");
            return;
        }
        this.f16685a.mo15252q().mo15239d();
        if (!m22961a()) {
            this.f16685a.mo15253r().mo15853v().mo15858a("Install Referrer Reporter is not available");
            return;
        }
        this.f16685a.mo15253r().mo15853v().mo15858a("Install Referrer Reporter is initializing");
        C4627ak akVar = new C4627ak(this, str);
        this.f16685a.mo15252q().mo15239d();
        Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
        intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
        PackageManager packageManager = this.f16685a.mo15249n().getPackageManager();
        if (packageManager == null) {
            this.f16685a.mo15253r().mo15849i().mo15858a("Failed to obtain Package Manager to verify binding conditions");
            return;
        }
        List queryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
            this.f16685a.mo15253r().mo15853v().mo15858a("Play Service for fetching Install Referrer is unavailable on device");
            return;
        }
        ResolveInfo resolveInfo = (ResolveInfo) queryIntentServices.get(0);
        if (resolveInfo.serviceInfo != null) {
            String str2 = resolveInfo.serviceInfo.packageName;
            if (resolveInfo.serviceInfo.name == null || !"com.android.vending".equals(str2) || !m22961a()) {
                this.f16685a.mo15253r().mo15853v().mo15858a("Play Store missing or incompatible. Version 8.3.73 or later required");
            } else {
                try {
                    this.f16685a.mo15253r().mo15853v().mo15859a("Install Referrer Service is", C3285a.m15014a().mo11312a(this.f16685a.mo15249n(), new Intent(intent), akVar, 1) ? "available" : "not available");
                } catch (Exception e) {
                    this.f16685a.mo15253r().mo15852u_().mo15859a("Exception occurred while binding to Install Referrer Service", e.getMessage());
                }
            }
        }
    }
}
