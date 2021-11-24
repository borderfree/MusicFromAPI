package com.google.android.gms.common.api;

import java.util.Map;
import java.util.WeakHashMap;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.common.api.n */
public abstract class C3168n {
    @GuardedBy("sLock")

    /* renamed from: a */
    private static final Map<Object, C3168n> f10943a = new WeakHashMap();

    /* renamed from: b */
    private static final Object f10944b = new Object();

    /* renamed from: a */
    public abstract void mo11088a(int i);
}
