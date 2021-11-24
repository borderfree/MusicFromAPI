package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.Map;
import java.util.Map.Entry;
import java.util.WeakHashMap;
import javax.annotation.concurrent.GuardedBy;

@C3464ci
/* renamed from: com.google.android.gms.internal.ads.lp */
public final class C3715lp {
    @GuardedBy("this")

    /* renamed from: a */
    private final BroadcastReceiver f14400a = new C3716lq(this);
    @GuardedBy("this")

    /* renamed from: b */
    private final Map<BroadcastReceiver, IntentFilter> f14401b = new WeakHashMap();

    /* renamed from: c */
    private boolean f14402c = false;

    /* renamed from: d */
    private boolean f14403d;

    /* renamed from: e */
    private Context f14404e;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final synchronized void m19092a(Context context, Intent intent) {
        for (Entry entry : this.f14401b.entrySet()) {
            if (((IntentFilter) entry.getValue()).hasAction(intent.getAction())) {
                ((BroadcastReceiver) entry.getKey()).onReceive(context, intent);
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo13224a(Context context) {
        if (!this.f14402c) {
            this.f14404e = context.getApplicationContext();
            if (this.f14404e == null) {
                this.f14404e = context;
            }
            aqm.m16920a(this.f14404e);
            this.f14403d = ((Boolean) ane.m16650f().mo12297a(aqm.f12774ch)).booleanValue();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            this.f14404e.registerReceiver(this.f14400a, intentFilter);
            this.f14402c = true;
        }
    }

    /* renamed from: a */
    public final synchronized void mo13225a(Context context, BroadcastReceiver broadcastReceiver) {
        if (this.f14403d) {
            this.f14401b.remove(broadcastReceiver);
        } else {
            context.unregisterReceiver(broadcastReceiver);
        }
    }

    /* renamed from: a */
    public final synchronized void mo13226a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (this.f14403d) {
            this.f14401b.put(broadcastReceiver, intentFilter);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter);
        }
    }
}
