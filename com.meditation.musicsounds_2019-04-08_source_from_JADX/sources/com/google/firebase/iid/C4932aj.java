package com.google.firebase.iid;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.firebase.iid.aj */
final class C4932aj {

    /* renamed from: a */
    private static final Executor f17717a = C4934al.f17719a;

    /* renamed from: a */
    static final /* synthetic */ Thread m24559a(Runnable runnable) {
        return new Thread(runnable, "firebase-iid-executor");
    }

    /* renamed from: a */
    static Executor m24560a() {
        return f17717a;
    }

    /* renamed from: b */
    static Executor m24561b() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), C4933ak.f17718a);
        return threadPoolExecutor;
    }
}
