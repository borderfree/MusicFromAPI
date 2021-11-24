package com.google.android.exoplayer2.upstream;

import com.google.android.exoplayer2.upstream.HttpDataSource.C2799a;
import com.google.android.exoplayer2.upstream.HttpDataSource.C2801c;

/* renamed from: com.google.android.exoplayer2.upstream.k */
public final class C2818k extends C2799a {

    /* renamed from: a */
    private final String f9771a;

    /* renamed from: b */
    private final C2819l<? super C2809d> f9772b;

    /* renamed from: c */
    private final int f9773c;

    /* renamed from: d */
    private final int f9774d;

    /* renamed from: e */
    private final boolean f9775e;

    public C2818k(String str, C2819l<? super C2809d> lVar) {
        this(str, lVar, 8000, 8000, false);
    }

    public C2818k(String str, C2819l<? super C2809d> lVar, int i, int i2, boolean z) {
        this.f9771a = str;
        this.f9772b = lVar;
        this.f9773c = i;
        this.f9774d = i2;
        this.f9775e = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C2817j mo9525b(C2801c cVar) {
        C2817j jVar = new C2817j(this.f9771a, null, this.f9772b, this.f9773c, this.f9774d, this.f9775e, cVar);
        return jVar;
    }
}
