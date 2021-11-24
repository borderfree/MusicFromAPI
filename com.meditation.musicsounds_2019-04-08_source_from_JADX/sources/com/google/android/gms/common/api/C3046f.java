package com.google.android.gms.common.api;

import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.internal.C3266s;

/* renamed from: com.google.android.gms.common.api.f */
public final class C3046f {

    /* renamed from: com.google.android.gms.common.api.f$a */
    private static final class C3047a<R extends C3049h> extends BasePendingResult<R> {

        /* renamed from: b */
        private final R f10620b;

        public C3047a(C3040d dVar, R r) {
            super(dVar);
            this.f10620b = r;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final R mo10740a(Status status) {
            return this.f10620b;
        }
    }

    /* renamed from: a */
    public static <R extends C3049h> C3044e<R> m14077a(R r, C3040d dVar) {
        C3266s.m14914a(r, (Object) "Result must not be null");
        C3266s.m14924b(!r.mo10791a().mo10795d(), "Status code must not be SUCCESS");
        C3047a aVar = new C3047a(dVar, r);
        aVar.mo10876b(r);
        return aVar;
    }
}
