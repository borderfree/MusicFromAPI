package com.google.android.gms.iid;

import android.content.Intent;

/* renamed from: com.google.android.gms.iid.o */
final class C3368o implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ Intent f11305a;

    /* renamed from: b */
    private final /* synthetic */ Intent f11306b;

    /* renamed from: c */
    private final /* synthetic */ C3367n f11307c;

    C3368o(C3367n nVar, Intent intent, Intent intent2) {
        this.f11307c = nVar;
        this.f11305a = intent;
        this.f11306b = intent2;
    }

    public final void run() {
        this.f11307c.mo11380a(this.f11305a);
        this.f11307c.m15239b(this.f11306b);
    }
}
