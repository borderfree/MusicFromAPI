package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.bh */
final class C4651bh implements Callable<List<zzo>> {

    /* renamed from: a */
    private final /* synthetic */ String f16795a;

    /* renamed from: b */
    private final /* synthetic */ String f16796b;

    /* renamed from: c */
    private final /* synthetic */ String f16797c;

    /* renamed from: d */
    private final /* synthetic */ C4640ax f16798d;

    C4651bh(C4640ax axVar, String str, String str2, String str3) {
        this.f16798d = axVar;
        this.f16795a = str;
        this.f16796b = str2;
        this.f16797c = str3;
    }

    public final /* synthetic */ Object call() {
        this.f16798d.f16762a.mo15555l();
        return this.f16798d.f16762a.mo15546d().mo15789b(this.f16795a, this.f16796b, this.f16797c);
    }
}
