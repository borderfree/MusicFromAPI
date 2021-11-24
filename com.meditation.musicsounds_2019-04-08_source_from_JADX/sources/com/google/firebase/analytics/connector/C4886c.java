package com.google.firebase.analytics.connector;

import java.util.concurrent.Executor;

/* renamed from: com.google.firebase.analytics.connector.c */
final /* synthetic */ class C4886c implements Executor {

    /* renamed from: a */
    static final Executor f17584a = new C4886c();

    private C4886c() {
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
