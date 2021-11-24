package com.google.android.gms.common.util.p125a;

import com.google.android.gms.common.internal.C3266s;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.google.android.gms.common.util.a.b */
public class C3294b implements ThreadFactory {

    /* renamed from: a */
    private final String f11185a;

    /* renamed from: b */
    private final int f11186b;

    /* renamed from: c */
    private final ThreadFactory f11187c;

    public C3294b(String str) {
        this(str, 0);
    }

    private C3294b(String str, int i) {
        this.f11187c = Executors.defaultThreadFactory();
        this.f11185a = (String) C3266s.m14914a(str, (Object) "Name must not be null");
        this.f11186b = 0;
    }

    public Thread newThread(Runnable runnable) {
        Thread newThread = this.f11187c.newThread(new C3296d(runnable, 0));
        newThread.setName(this.f11185a);
        return newThread;
    }
}
