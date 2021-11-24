package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.ads.internal.zzbv;

@C3464ci
/* renamed from: com.google.android.gms.internal.ads.iz */
public final class C3644iz extends Handler {
    public C3644iz(Looper looper) {
        super(looper);
    }

    public final void dispatchMessage(Message message) {
        try {
            super.dispatchMessage(message);
        } catch (Throwable th) {
            zzbv.zzek();
            C3653jh.m18877a(zzbv.zzeo().mo13061m(), th);
            throw th;
        }
    }

    public final void handleMessage(Message message) {
        try {
            super.handleMessage(message);
        } catch (Exception e) {
            zzbv.zzeo().mo13047a((Throwable) e, "AdMobHandler.handleMessage");
        }
    }
}
