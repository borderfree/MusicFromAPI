package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.util.p125a.C3295c;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: com.google.android.gms.common.api.internal.av */
public final class C3075av {

    /* renamed from: a */
    private static final ExecutorService f10706a = Executors.newFixedThreadPool(2, new C3295c("GAC_Executor"));

    /* renamed from: a */
    public static ExecutorService m14203a() {
        return f10706a;
    }
}
