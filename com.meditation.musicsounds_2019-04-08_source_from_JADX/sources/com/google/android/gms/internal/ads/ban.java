package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

final class ban implements Callable<baj> {

    /* renamed from: a */
    private final /* synthetic */ bag f13495a;

    /* renamed from: b */
    private final /* synthetic */ bam f13496b;

    ban(bam bam, bag bag) {
        this.f13496b = bam;
        this.f13495a = bag;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final baj call() {
        synchronized (this.f13496b.f13488i) {
            if (this.f13496b.f13489j) {
                return null;
            }
            return this.f13495a.mo12672a(this.f13496b.f13485f, this.f13496b.f13486g);
        }
    }
}
