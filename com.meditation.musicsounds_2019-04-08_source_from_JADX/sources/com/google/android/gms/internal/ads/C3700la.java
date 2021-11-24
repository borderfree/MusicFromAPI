package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.la */
public final class C3700la extends auc<asc> {

    /* renamed from: a */
    private final C3763nj<asc> f14378a;

    /* renamed from: b */
    private final Map<String, String> f14379b;

    /* renamed from: c */
    private final C3723lx f14380c;

    public C3700la(String str, C3763nj<asc> njVar) {
        this(str, null, njVar);
    }

    private C3700la(String str, Map<String, String> map, C3763nj<asc> njVar) {
        super(0, str, new C3701lb(njVar));
        this.f14379b = null;
        this.f14378a = njVar;
        this.f14380c = new C3723lx();
        this.f14380c.mo13238a(str, "GET", null, null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bae<asc> mo12491a(asc asc) {
        return bae.m17737a(asc, C3781oa.m19263a(asc));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ void mo12495a(Object obj) {
        asc asc = (asc) obj;
        this.f14380c.mo13241a(asc.f13059c, asc.f13057a);
        C3723lx lxVar = this.f14380c;
        byte[] bArr = asc.f13058b;
        if (C3723lx.m19149c() && bArr != null) {
            lxVar.mo13242a(bArr);
        }
        this.f14378a.mo13296b(asc);
    }
}
