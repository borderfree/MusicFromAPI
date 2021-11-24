package com.google.android.gms.common.util.p125a;

import com.google.android.gms.common.internal.C3266s;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.common.util.a.c */
public class C3295c implements ThreadFactory {

    /* renamed from: a */
    private final String f11188a;

    /* renamed from: b */
    private final int f11189b;

    /* renamed from: c */
    private final AtomicInteger f11190c;

    /* renamed from: d */
    private final ThreadFactory f11191d;

    public C3295c(String str) {
        this(str, 0);
    }

    private C3295c(String str, int i) {
        this.f11190c = new AtomicInteger();
        this.f11191d = Executors.defaultThreadFactory();
        this.f11188a = (String) C3266s.m14914a(str, (Object) "Name must not be null");
        this.f11189b = 0;
    }

    public Thread newThread(Runnable runnable) {
        Thread newThread = this.f11191d.newThread(new C3296d(runnable, 0));
        String str = this.f11188a;
        int andIncrement = this.f11190c.getAndIncrement();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 13);
        sb.append(str);
        sb.append("[");
        sb.append(andIncrement);
        sb.append("]");
        newThread.setName(sb.toString());
        return newThread;
    }
}
