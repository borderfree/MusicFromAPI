package com.google.firebase.iid;

import java.util.concurrent.ThreadFactory;

/* renamed from: com.google.firebase.iid.ak */
final /* synthetic */ class C4933ak implements ThreadFactory {

    /* renamed from: a */
    static final ThreadFactory f17718a = new C4933ak();

    private C4933ak() {
    }

    public final Thread newThread(Runnable runnable) {
        return C4932aj.m24559a(runnable);
    }
}
