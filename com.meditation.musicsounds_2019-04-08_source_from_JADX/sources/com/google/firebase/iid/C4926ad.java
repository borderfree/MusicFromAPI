package com.google.firebase.iid;

import android.content.Intent;

/* renamed from: com.google.firebase.iid.ad */
final class C4926ad implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ Intent f17699a;

    /* renamed from: b */
    private final /* synthetic */ Intent f17700b;

    /* renamed from: c */
    private final /* synthetic */ C4924ab f17701c;

    C4926ad(C4924ab abVar, Intent intent, Intent intent2) {
        this.f17701c = abVar;
        this.f17699a = intent;
        this.f17700b = intent2;
    }

    public final void run() {
        this.f17701c.mo16177b(this.f17699a);
        this.f17701c.m24544d(this.f17700b);
    }
}
