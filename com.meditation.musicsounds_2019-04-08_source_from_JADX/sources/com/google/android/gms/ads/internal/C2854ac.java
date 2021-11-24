package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.afl;
import com.google.android.gms.internal.ads.afm;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.ads.internal.ac */
final class C2854ac implements Callable<afm> {

    /* renamed from: a */
    private final /* synthetic */ zzbp f9935a;

    C2854ac(zzbp zzbp) {
        this.f9935a = zzbp;
    }

    public final /* synthetic */ Object call() {
        return new afm(afl.m16116a(this.f9935a.f10204a.f15360a, this.f9935a.f10207d, false));
    }
}
