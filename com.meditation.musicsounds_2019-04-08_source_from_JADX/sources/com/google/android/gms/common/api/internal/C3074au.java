package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.p128c.C4164e;

/* renamed from: com.google.android.gms.common.api.internal.au */
final class C3074au extends C4164e {

    /* renamed from: a */
    private final /* synthetic */ C3072as f10705a;

    C3074au(C3072as asVar, Looper looper) {
        this.f10705a = asVar;
        super(looper);
    }

    public final void handleMessage(Message message) {
        switch (message.what) {
            case 1:
                ((C3073at) message.obj).mo10934a(this.f10705a);
                return;
            case 2:
                throw ((RuntimeException) message.obj);
            default:
                int i = message.what;
                StringBuilder sb = new StringBuilder(31);
                sb.append("Unknown message id: ");
                sb.append(i);
                Log.w("GACStateManager", sb.toString());
                return;
        }
    }
}
