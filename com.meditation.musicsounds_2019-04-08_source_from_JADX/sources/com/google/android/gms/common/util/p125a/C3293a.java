package com.google.android.gms.common.util.p125a;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.p129d.C4170e;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.common.util.a.a */
public class C3293a implements Executor {

    /* renamed from: a */
    private final Handler f11184a;

    public C3293a(Looper looper) {
        this.f11184a = new C4170e(looper);
    }

    public void execute(Runnable runnable) {
        this.f11184a.post(runnable);
    }
}
