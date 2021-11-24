package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C3044e.C3045a;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.common.api.internal.q */
final class C3154q implements C3045a {

    /* renamed from: a */
    private final /* synthetic */ BasePendingResult f10907a;

    /* renamed from: b */
    private final /* synthetic */ C3153p f10908b;

    C3154q(C3153p pVar, BasePendingResult basePendingResult) {
        this.f10908b = pVar;
        this.f10907a = basePendingResult;
    }

    /* renamed from: a */
    public final void mo10872a(Status status) {
        this.f10908b.f10905a.remove(this.f10907a);
    }
}
