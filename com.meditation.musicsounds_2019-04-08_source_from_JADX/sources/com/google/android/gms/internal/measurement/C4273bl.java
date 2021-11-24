package com.google.android.gms.internal.measurement;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.common.internal.C3266s;

/* renamed from: com.google.android.gms.internal.measurement.bl */
class C4273bl extends BroadcastReceiver {

    /* renamed from: a */
    private static final String f15810a = "com.google.android.gms.internal.measurement.bl";

    /* renamed from: b */
    private final C4499u f15811b;

    /* renamed from: c */
    private boolean f15812c;

    /* renamed from: d */
    private boolean f15813d;

    C4273bl(C4499u uVar) {
        C3266s.m14913a(uVar);
        this.f15811b = uVar;
    }

    /* renamed from: e */
    private final void m21071e() {
        this.f15811b.mo14846e();
        this.f15811b.mo14849h();
    }

    /* renamed from: f */
    private final boolean m21072f() {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f15811b.mo14842a().getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                return true;
            }
        } catch (SecurityException unused) {
        }
        return false;
    }

    /* renamed from: a */
    public final void mo14181a() {
        m21071e();
        if (!this.f15812c) {
            Context a = this.f15811b.mo14842a();
            a.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            IntentFilter intentFilter = new IntentFilter("com.google.analytics.RADIO_POWERED");
            intentFilter.addCategory(a.getPackageName());
            a.registerReceiver(this, intentFilter);
            this.f15813d = m21072f();
            this.f15811b.mo14846e().mo14808a("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.f15813d));
            this.f15812c = true;
        }
    }

    /* renamed from: b */
    public final void mo14182b() {
        if (this.f15812c) {
            this.f15811b.mo14846e().mo14811b("Unregistering connectivity change receiver");
            this.f15812c = false;
            this.f15813d = false;
            try {
                this.f15811b.mo14842a().unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                this.f15811b.mo14846e().mo14822e("Failed to unregister the network broadcast receiver", e);
            }
        }
    }

    /* renamed from: c */
    public final void mo14183c() {
        Context a = this.f15811b.mo14842a();
        Intent intent = new Intent("com.google.analytics.RADIO_POWERED");
        intent.addCategory(a.getPackageName());
        intent.putExtra(f15810a, true);
        a.sendOrderedBroadcast(intent, null);
    }

    /* renamed from: d */
    public final boolean mo14184d() {
        if (!this.f15812c) {
            this.f15811b.mo14846e().mo14821e("Connectivity unknown. Receiver not registered");
        }
        return this.f15813d;
    }

    public void onReceive(Context context, Intent intent) {
        m21071e();
        String action = intent.getAction();
        this.f15811b.mo14846e().mo14808a("NetworkBroadcastReceiver received action", action);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            boolean f = m21072f();
            if (this.f15813d != f) {
                this.f15813d = f;
                C4490l h = this.f15811b.mo14849h();
                h.mo14808a("Network connectivity status changed", Boolean.valueOf(f));
                h.mo14829l().mo10647a((Runnable) new C4492n(h, f));
            }
        } else if ("com.google.analytics.RADIO_POWERED".equals(action)) {
            if (!intent.hasExtra(f15810a)) {
                C4490l h2 = this.f15811b.mo14849h();
                h2.mo14811b("Radio powered up");
                h2.mo14799c();
            }
        } else {
            this.f15811b.mo14846e().mo14819d("NetworkBroadcastReceiver received unknown action", action);
        }
    }
}
