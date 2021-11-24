package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.kw */
final class C3695kw extends C3944ub {

    /* renamed from: a */
    private final /* synthetic */ byte[] f14358a;

    /* renamed from: b */
    private final /* synthetic */ Map f14359b;

    /* renamed from: c */
    private final /* synthetic */ C3723lx f14360c;

    C3695kw(C3690kr krVar, int i, String str, bcg bcg, bbf bbf, byte[] bArr, Map map, C3723lx lxVar) {
        this.f14358a = bArr;
        this.f14359b = map;
        this.f14360c = lxVar;
        super(i, str, bcg, bbf);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ void mo12495a(Object obj) {
        mo12495a((String) obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo13209a(String str) {
        this.f14360c.mo13237a(str);
        super.mo12495a(str);
    }

    /* renamed from: a */
    public final byte[] mo12496a() {
        return this.f14358a == null ? super.mo12496a() : this.f14358a;
    }

    /* renamed from: b */
    public final Map<String, String> mo12497b() {
        return this.f14359b == null ? super.mo12497b() : this.f14359b;
    }
}
