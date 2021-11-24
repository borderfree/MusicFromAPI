package com.google.android.gms.iid;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: com.google.android.gms.iid.h */
final class C3361h extends Handler {

    /* renamed from: a */
    private final /* synthetic */ C3360g f11293a;

    C3361h(C3360g gVar, Looper looper) {
        this.f11293a = gVar;
        super(looper);
    }

    public final void handleMessage(Message message) {
        this.f11293a.mo11385a(message);
    }
}
