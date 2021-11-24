package com.google.android.gms.measurement.internal;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.common.stats.C3285a;
import com.google.android.gms.internal.measurement.C4368ez;

/* renamed from: com.google.android.gms.measurement.internal.al */
final class C4628al implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C4368ez f16688a;

    /* renamed from: b */
    private final /* synthetic */ ServiceConnection f16689b;

    /* renamed from: c */
    private final /* synthetic */ C4627ak f16690c;

    C4628al(C4627ak akVar, C4368ez ezVar, ServiceConnection serviceConnection) {
        this.f16690c = akVar;
        this.f16688a = ezVar;
        this.f16689b = serviceConnection;
    }

    public final void run() {
        C4769t u_;
        String str;
        C4626aj ajVar = this.f16690c.f16686a;
        String a = this.f16690c.f16687b;
        C4368ez ezVar = this.f16688a;
        ServiceConnection serviceConnection = this.f16689b;
        Bundle a2 = ajVar.mo15289a(a, ezVar);
        ajVar.f16685a.mo15252q().mo15239d();
        if (a2 != null) {
            long j = a2.getLong("install_begin_timestamp_seconds", 0) * 1000;
            if (j == 0) {
                u_ = ajVar.f16685a.mo15253r().mo15852u_();
                str = "Service response is missing Install Referrer install timestamp";
            } else {
                String string = a2.getString("install_referrer");
                if (string == null || string.isEmpty()) {
                    u_ = ajVar.f16685a.mo15253r().mo15852u_();
                    str = "No referrer defined in install referrer response";
                } else {
                    ajVar.f16685a.mo15253r().mo15855x().mo15859a("InstallReferrer API result", string);
                    C4736ek j2 = ajVar.f16685a.mo15343j();
                    String str2 = "?";
                    String valueOf = String.valueOf(string);
                    Bundle a3 = j2.mo15579a(Uri.parse(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2)));
                    if (a3 == null) {
                        u_ = ajVar.f16685a.mo15253r().mo15852u_();
                        str = "No campaign params defined in install referrer result";
                    } else {
                        String string2 = a3.getString("medium");
                        if (string2 != null && !"(not set)".equalsIgnoreCase(string2) && !"organic".equalsIgnoreCase(string2)) {
                            long j3 = a2.getLong("referrer_click_timestamp_seconds", 0) * 1000;
                            if (j3 == 0) {
                                u_ = ajVar.f16685a.mo15253r().mo15852u_();
                                str = "Install Referrer is missing click timestamp for ad campaign";
                            } else {
                                a3.putLong("click_timestamp", j3);
                            }
                        }
                        if (j == ajVar.f16685a.mo15336c().f16653i.mo15283a()) {
                            ajVar.f16685a.mo15256u();
                            u_ = ajVar.f16685a.mo15253r().mo15855x();
                            str = "Campaign has already been logged";
                        } else {
                            ajVar.f16685a.mo15336c().f16653i.mo15284a(j);
                            ajVar.f16685a.mo15256u();
                            ajVar.f16685a.mo15253r().mo15855x().mo15859a("Logging Install Referrer campaign from sdk with ", "referrer API");
                            a3.putString("_cis", "referrer API");
                            ajVar.f16685a.mo15341h().mo15413a("auto", "_cmp", a3);
                        }
                    }
                }
            }
            u_.mo15858a(str);
        }
        if (serviceConnection != null) {
            C3285a.m15014a().mo11311a(ajVar.f16685a.mo15249n(), serviceConnection);
        }
    }
}
