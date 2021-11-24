package com.google.firebase.iid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import javax.annotation.Nullable;

/* renamed from: com.google.firebase.iid.aa */
final class C4923aa extends BroadcastReceiver {
    @Nullable

    /* renamed from: a */
    private C4973z f17690a;

    public C4923aa(C4973z zVar) {
        this.f17690a = zVar;
    }

    /* renamed from: a */
    public final void mo16179a() {
        if (FirebaseInstanceId.m24505h()) {
            Log.d("FirebaseInstanceId", "Connectivity change received registered");
        }
        this.f17690a.mo16254a().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    public final void onReceive(Context context, Intent intent) {
        if (this.f17690a != null && this.f17690a.mo16255b()) {
            if (FirebaseInstanceId.m24505h()) {
                Log.d("FirebaseInstanceId", "Connectivity changed. Starting background sync.");
            }
            FirebaseInstanceId.m24500a((Runnable) this.f17690a, 0);
            this.f17690a.mo16254a().unregisterReceiver(this);
            this.f17690a = null;
        }
    }
}
