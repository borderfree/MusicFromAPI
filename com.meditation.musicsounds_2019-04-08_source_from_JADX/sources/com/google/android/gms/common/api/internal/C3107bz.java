package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C3020a.C3022b;
import com.google.android.gms.common.api.C3049h;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C3108c.C3109a;
import com.google.android.gms.common.api.internal.C3135d.C3136a;

/* renamed from: com.google.android.gms.common.api.internal.bz */
public final class C3107bz<A extends C3109a<? extends C3049h, C3022b>> extends C3067an {

    /* renamed from: a */
    private final A f10764a;

    public C3107bz(int i, A a) {
        super(i);
        this.f10764a = a;
    }

    /* renamed from: a */
    public final void mo10912a(Status status) {
        this.f10764a.mo10981b(status);
    }

    /* renamed from: a */
    public final void mo10913a(C3136a<?> aVar) {
        try {
            this.f10764a.mo10982b(aVar.mo11038b());
        } catch (RuntimeException e) {
            mo10915a(e);
        }
    }

    /* renamed from: a */
    public final void mo10914a(C3153p pVar, boolean z) {
        pVar.mo11075a((BasePendingResult<? extends C3049h>) this.f10764a, z);
    }

    /* renamed from: a */
    public final void mo10915a(RuntimeException runtimeException) {
        String simpleName = runtimeException.getClass().getSimpleName();
        String localizedMessage = runtimeException.getLocalizedMessage();
        StringBuilder sb = new StringBuilder(String.valueOf(simpleName).length() + 2 + String.valueOf(localizedMessage).length());
        sb.append(simpleName);
        sb.append(": ");
        sb.append(localizedMessage);
        this.f10764a.mo10981b(new Status(10, sb.toString()));
    }
}
