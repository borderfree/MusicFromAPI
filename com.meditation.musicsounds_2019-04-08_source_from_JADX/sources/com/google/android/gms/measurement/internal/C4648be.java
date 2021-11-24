package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.be */
final class C4648be implements Callable<List<C4735ej>> {

    /* renamed from: a */
    private final /* synthetic */ zzk f16783a;

    /* renamed from: b */
    private final /* synthetic */ String f16784b;

    /* renamed from: c */
    private final /* synthetic */ String f16785c;

    /* renamed from: d */
    private final /* synthetic */ C4640ax f16786d;

    C4648be(C4640ax axVar, zzk zzk, String str, String str2) {
        this.f16786d = axVar;
        this.f16783a = zzk;
        this.f16784b = str;
        this.f16785c = str2;
    }

    public final /* synthetic */ Object call() {
        this.f16786d.f16762a.mo15555l();
        return this.f16786d.f16762a.mo15546d().mo15777a(this.f16783a.f17264a, this.f16784b, this.f16785c);
    }
}
