package com.google.android.gms.common.api.internal;

import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.C3044e;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p128c.C4164e;

/* renamed from: com.google.android.gms.common.api.internal.bt */
final class C3101bt extends C4164e {

    /* renamed from: a */
    private final /* synthetic */ C3099br f10753a;

    public final void handleMessage(Message message) {
        switch (message.what) {
            case 0:
                C3044e eVar = (C3044e) message.obj;
                synchronized (this.f10753a.f10746e) {
                    if (eVar == null) {
                        try {
                            this.f10753a.f10743b.m14256a(new Status(13, "Transform returned null"));
                        } catch (Throwable th) {
                            throw th;
                        }
                    } else if (eVar instanceof C3094bm) {
                        this.f10753a.f10743b.m14256a(((C3094bm) eVar).mo10961d());
                    } else {
                        this.f10753a.f10743b.mo10970a(eVar);
                    }
                }
                return;
            case 1:
                RuntimeException runtimeException = (RuntimeException) message.obj;
                String str = "Runtime exception on the transformation worker thread: ";
                String valueOf = String.valueOf(runtimeException.getMessage());
                Log.e("TransformedResultImpl", valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                throw runtimeException;
            default:
                int i = message.what;
                StringBuilder sb = new StringBuilder(70);
                sb.append("TransformationResultHandler received unknown message type: ");
                sb.append(i);
                Log.e("TransformedResultImpl", sb.toString());
                return;
        }
    }
}
