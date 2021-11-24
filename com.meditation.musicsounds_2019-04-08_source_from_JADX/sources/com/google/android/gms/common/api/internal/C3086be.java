package com.google.android.gms.common.api.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* renamed from: com.google.android.gms.common.api.internal.be */
public final class C3086be extends BroadcastReceiver {

    /* renamed from: a */
    private Context f10722a;

    /* renamed from: b */
    private final C3087bf f10723b;

    public C3086be(C3087bf bfVar) {
        this.f10723b = bfVar;
    }

    /* renamed from: a */
    public final synchronized void mo10956a() {
        if (this.f10722a != null) {
            this.f10722a.unregisterReceiver(this);
        }
        this.f10722a = null;
    }

    /* renamed from: a */
    public final void mo10957a(Context context) {
        this.f10722a = context;
    }

    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.f10723b.mo10917a();
            mo10956a();
        }
    }
}
