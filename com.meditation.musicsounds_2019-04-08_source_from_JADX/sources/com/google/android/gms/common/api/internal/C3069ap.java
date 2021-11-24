package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.p128c.C4164e;

/* renamed from: com.google.android.gms.common.api.internal.ap */
final class C3069ap extends C4164e {

    /* renamed from: a */
    private final /* synthetic */ C3063aj f10687a;

    C3069ap(C3063aj ajVar, Looper looper) {
        this.f10687a = ajVar;
        super(looper);
    }

    public final void handleMessage(Message message) {
        switch (message.what) {
            case 1:
                this.f10687a.m14137q();
                return;
            case 2:
                this.f10687a.m14136p();
                return;
            default:
                int i = message.what;
                StringBuilder sb = new StringBuilder(31);
                sb.append("Unknown message id: ");
                sb.append(i);
                Log.w("GoogleApiClientImpl", sb.toString());
                return;
        }
    }
}
