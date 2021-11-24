package com.google.android.gms.common.p122c;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.common.c.a */
public class C3174a {

    /* renamed from: a */
    private static C3175a f10953a;

    /* renamed from: com.google.android.gms.common.c.a$a */
    public interface C3175a {
        /* renamed from: a */
        ScheduledExecutorService mo11105a();
    }

    /* renamed from: a */
    public static synchronized C3175a m14624a() {
        C3175a aVar;
        synchronized (C3174a.class) {
            if (f10953a == null) {
                f10953a = new C3176b();
            }
            aVar = f10953a;
        }
        return aVar;
    }
}
