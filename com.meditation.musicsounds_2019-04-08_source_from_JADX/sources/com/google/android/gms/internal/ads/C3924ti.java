package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.ti */
public final class C3924ti {

    /* renamed from: a */
    private C4035wq f14943a;

    private C3924ti(C4035wq wqVar) {
        this.f14943a = wqVar;
    }

    /* renamed from: a */
    static final C3924ti m19882a(C4035wq wqVar) {
        if (wqVar != null && wqVar.mo13789c() > 0) {
            return new C3924ti(wqVar);
        }
        throw new GeneralSecurityException("empty keyset");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C4035wq mo13695a() {
        return this.f14943a;
    }

    public final String toString() {
        return C3932tq.m19906a(this.f14943a).toString();
    }
}
