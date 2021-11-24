package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

@C3464ci
/* renamed from: com.google.android.gms.internal.ads.ey */
public final class C3535ey {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public WeakHashMap<Context, C3538fa> f13965a = new WeakHashMap<>();

    /* renamed from: a */
    public final Future<C3533ew> mo12896a(Context context) {
        return C3651jf.m18856a((Callable<T>) new C3536ez<T>(this, context));
    }
}
