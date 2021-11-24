package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.bg */
final class C4650bg implements Callable<List<zzo>> {

    /* renamed from: a */
    private final /* synthetic */ zzk f16791a;

    /* renamed from: b */
    private final /* synthetic */ String f16792b;

    /* renamed from: c */
    private final /* synthetic */ String f16793c;

    /* renamed from: d */
    private final /* synthetic */ C4640ax f16794d;

    C4650bg(C4640ax axVar, zzk zzk, String str, String str2) {
        this.f16794d = axVar;
        this.f16791a = zzk;
        this.f16792b = str;
        this.f16793c = str2;
    }

    public final /* synthetic */ Object call() {
        this.f16794d.f16762a.mo15555l();
        return this.f16794d.f16762a.mo15546d().mo15789b(this.f16791a.f17264a, this.f16792b, this.f16793c);
    }
}
