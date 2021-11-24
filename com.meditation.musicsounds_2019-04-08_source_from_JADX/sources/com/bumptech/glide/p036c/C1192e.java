package com.bumptech.glide.p036c;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import com.bumptech.glide.p036c.C1189c.C1190a;
import com.bumptech.glide.p040g.C1257i;

/* renamed from: com.bumptech.glide.c.e */
final class C1192e implements C1189c {

    /* renamed from: a */
    final C1190a f4335a;

    /* renamed from: b */
    boolean f4336b;

    /* renamed from: c */
    private final Context f4337c;

    /* renamed from: d */
    private boolean f4338d;

    /* renamed from: e */
    private final BroadcastReceiver f4339e = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            boolean z = C1192e.this.f4336b;
            C1192e.this.f4336b = C1192e.this.mo5757a(context);
            if (z != C1192e.this.f4336b) {
                if (Log.isLoggable("ConnectivityMonitor", 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("connectivity changed, isConnected: ");
                    sb.append(C1192e.this.f4336b);
                    Log.d("ConnectivityMonitor", sb.toString());
                }
                C1192e.this.f4335a.mo5755a(C1192e.this.f4336b);
            }
        }
    };

    C1192e(Context context, C1190a aVar) {
        this.f4337c = context.getApplicationContext();
        this.f4335a = aVar;
    }

    /* renamed from: a */
    private void m6481a() {
        if (!this.f4338d) {
            this.f4336b = mo5757a(this.f4337c);
            try {
                this.f4337c.registerReceiver(this.f4339e, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                this.f4338d = true;
            } catch (SecurityException e) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to register", e);
                }
            }
        }
    }

    /* renamed from: b */
    private void m6482b() {
        if (this.f4338d) {
            this.f4337c.unregisterReceiver(this.f4339e);
            this.f4338d = false;
        }
    }

    /* access modifiers changed from: 0000 */
    @SuppressLint({"MissingPermission"})
    /* renamed from: a */
    public boolean mo5757a(Context context) {
        boolean z = true;
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) C1257i.m6691a((ConnectivityManager) context.getSystemService("connectivity"))).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                z = false;
            }
            return z;
        } catch (RuntimeException e) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to determine connectivity status when connectivity changed", e);
            }
            return true;
        }
    }

    /* renamed from: c */
    public void mo5758c() {
        m6481a();
    }

    /* renamed from: d */
    public void mo5759d() {
        m6482b();
    }

    /* renamed from: e */
    public void mo5760e() {
    }
}
