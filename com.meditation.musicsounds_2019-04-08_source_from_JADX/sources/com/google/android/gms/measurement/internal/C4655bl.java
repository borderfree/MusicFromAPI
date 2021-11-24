package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.bl */
final class C4655bl implements Callable<byte[]> {

    /* renamed from: a */
    private final /* synthetic */ zzag f16807a;

    /* renamed from: b */
    private final /* synthetic */ String f16808b;

    /* renamed from: c */
    private final /* synthetic */ C4640ax f16809c;

    C4655bl(C4640ax axVar, zzag zzag, String str) {
        this.f16809c = axVar;
        this.f16807a = zzag;
        this.f16808b = str;
    }

    public final /* synthetic */ Object call() {
        this.f16809c.f16762a.mo15555l();
        return this.f16809c.f16762a.mo15549f().mo15442a(this.f16807a, this.f16808b);
    }
}
