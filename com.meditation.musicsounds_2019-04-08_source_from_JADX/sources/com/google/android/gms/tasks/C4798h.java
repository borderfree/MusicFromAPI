package com.google.android.gms.tasks;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.tasks.h */
public final class C4798h {

    /* renamed from: a */
    public static final Executor f17323a = new C4799a();

    /* renamed from: b */
    static final Executor f17324b = new C4817x();

    /* renamed from: com.google.android.gms.tasks.h$a */
    private static final class C4799a implements Executor {

        /* renamed from: a */
        private final Handler f17325a = new Handler(Looper.getMainLooper());

        public final void execute(Runnable runnable) {
            this.f17325a.post(runnable);
        }
    }
}
