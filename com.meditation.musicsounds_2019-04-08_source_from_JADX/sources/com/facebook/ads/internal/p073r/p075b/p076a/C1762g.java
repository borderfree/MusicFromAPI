package com.facebook.ads.internal.p073r.p075b.p076a;

import java.io.File;

/* renamed from: com.facebook.ads.internal.r.b.a.g */
public class C1762g extends C1759e {

    /* renamed from: a */
    private final long f5762a;

    public C1762g(long j) {
        if (j > 0) {
            this.f5762a = j;
            return;
        }
        throw new IllegalArgumentException("Max size must be positive number!");
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo7020a(File file) {
        super.mo7020a(file);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo7024a(File file, long j, int i) {
        return j <= this.f5762a;
    }
}
