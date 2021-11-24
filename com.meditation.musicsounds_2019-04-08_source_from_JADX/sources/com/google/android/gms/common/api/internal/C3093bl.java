package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.util.p125a.C3295c;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.common.api.internal.bl */
public final class C3093bl {

    /* renamed from: a */
    private static final ExecutorService f10729a;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 4, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C3295c("GAC_Transform"));
        f10729a = threadPoolExecutor;
    }

    /* renamed from: a */
    public static ExecutorService m14235a() {
        return f10729a;
    }
}
