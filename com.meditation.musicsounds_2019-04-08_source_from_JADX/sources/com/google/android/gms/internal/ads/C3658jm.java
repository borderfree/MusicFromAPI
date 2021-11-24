package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: com.google.android.gms.internal.ads.jm */
final class C3658jm extends BroadcastReceiver {

    /* renamed from: a */
    private final /* synthetic */ C3653jh f14290a;

    private C3658jm(C3653jh jhVar) {
        this.f14290a = jhVar;
    }

    /* synthetic */ C3658jm(C3653jh jhVar, C3654ji jiVar) {
        this(jhVar);
    }

    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            this.f14290a.f14277c = true;
            return;
        }
        if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            this.f14290a.f14277c = false;
        }
    }
}
