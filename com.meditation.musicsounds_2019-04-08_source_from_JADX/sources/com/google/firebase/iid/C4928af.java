package com.google.firebase.iid;

import android.content.Intent;
import android.util.Log;

/* renamed from: com.google.firebase.iid.af */
final /* synthetic */ class C4928af implements Runnable {

    /* renamed from: a */
    private final C4927ae f17706a;

    /* renamed from: b */
    private final Intent f17707b;

    C4928af(C4927ae aeVar, Intent intent) {
        this.f17706a = aeVar;
        this.f17707b = intent;
    }

    public final void run() {
        C4927ae aeVar = this.f17706a;
        String action = this.f17707b.getAction();
        StringBuilder sb = new StringBuilder(String.valueOf(action).length() + 61);
        sb.append("Service took too long to process intent: ");
        sb.append(action);
        sb.append(" App may get closed.");
        Log.w("EnhancedIntentService", sb.toString());
        aeVar.mo16187a();
    }
}
