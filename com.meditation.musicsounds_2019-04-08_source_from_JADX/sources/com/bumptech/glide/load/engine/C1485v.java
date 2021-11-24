package com.bumptech.glide.load.engine;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import com.bumptech.glide.p040g.C1258j;

/* renamed from: com.bumptech.glide.load.engine.v */
class C1485v {

    /* renamed from: a */
    private boolean f4927a;

    /* renamed from: b */
    private final Handler f4928b = new Handler(Looper.getMainLooper(), new C1486a());

    /* renamed from: com.bumptech.glide.load.engine.v$a */
    private static final class C1486a implements Callback {
        C1486a() {
        }

        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((C1482s) message.obj).mo6274f();
            return true;
        }
    }

    C1485v() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6287a(C1482s<?> sVar) {
        C1258j.m6707a();
        if (this.f4927a) {
            this.f4928b.obtainMessage(1, sVar).sendToTarget();
            return;
        }
        this.f4927a = true;
        sVar.mo6274f();
        this.f4927a = false;
    }
}
