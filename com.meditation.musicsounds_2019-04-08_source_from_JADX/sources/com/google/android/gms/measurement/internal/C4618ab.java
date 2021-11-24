package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.common.internal.C3266s;

/* renamed from: com.google.android.gms.measurement.internal.ab */
class C4618ab extends BroadcastReceiver {

    /* renamed from: a */
    private static final String f16639a = "com.google.android.gms.measurement.internal.ab";
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C4726eb f16640b;

    /* renamed from: c */
    private boolean f16641c;

    /* renamed from: d */
    private boolean f16642d;

    C4618ab(C4726eb ebVar) {
        C3266s.m14913a(ebVar);
        this.f16640b = ebVar;
    }

    /* renamed from: a */
    public final void mo15258a() {
        this.f16640b.mo15553j();
        this.f16640b.mo15252q().mo15239d();
        if (!this.f16641c) {
            this.f16640b.mo15249n().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.f16642d = this.f16640b.mo15544c().mo15863f();
            this.f16640b.mo15253r().mo15855x().mo15859a("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.f16642d));
            this.f16641c = true;
        }
    }

    /* renamed from: b */
    public final void mo15259b() {
        this.f16640b.mo15553j();
        this.f16640b.mo15252q().mo15239d();
        this.f16640b.mo15252q().mo15239d();
        if (this.f16641c) {
            this.f16640b.mo15253r().mo15855x().mo15858a("Unregistering connectivity change receiver");
            this.f16641c = false;
            this.f16642d = false;
            try {
                this.f16640b.mo15249n().unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                this.f16640b.mo15253r().mo15852u_().mo15859a("Failed to unregister the network broadcast receiver", e);
            }
        }
    }

    public void onReceive(Context context, Intent intent) {
        this.f16640b.mo15553j();
        String action = intent.getAction();
        this.f16640b.mo15253r().mo15855x().mo15859a("NetworkBroadcastReceiver received action", action);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            boolean f = this.f16640b.mo15544c().mo15863f();
            if (this.f16642d != f) {
                this.f16642d = f;
                this.f16640b.mo15252q().mo15314a((Runnable) new C4619ac(this, f));
            }
            return;
        }
        this.f16640b.mo15253r().mo15849i().mo15859a("NetworkBroadcastReceiver received unknown action", action);
    }
}
