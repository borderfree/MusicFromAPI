package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C3135d.C3136a;
import com.google.android.gms.common.api.internal.C3142h.C3143a;
import com.google.android.gms.tasks.C4797g;

/* renamed from: com.google.android.gms.common.api.internal.ca */
public final class C3111ca extends C3106by<Boolean> {

    /* renamed from: b */
    private final C3143a<?> f10767b;

    public C3111ca(C3143a<?> aVar, C4797g<Boolean> gVar) {
        super(4, gVar);
        this.f10767b = aVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo10912a(Status status) {
        super.mo10912a(status);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo10914a(C3153p pVar, boolean z) {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo10915a(RuntimeException runtimeException) {
        super.mo10915a(runtimeException);
    }

    /* renamed from: b */
    public final Feature[] mo10959b(C3136a<?> aVar) {
        C3091bj bjVar = (C3091bj) aVar.mo11040c().get(this.f10767b);
        if (bjVar == null) {
            return null;
        }
        return bjVar.f10727a.mo11071b();
    }

    /* renamed from: c */
    public final boolean mo10960c(C3136a<?> aVar) {
        C3091bj bjVar = (C3091bj) aVar.mo11040c().get(this.f10767b);
        return bjVar != null && bjVar.f10727a.mo11072c();
    }

    /* renamed from: d */
    public final void mo10978d(C3136a<?> aVar) {
        C3091bj bjVar = (C3091bj) aVar.mo11040c().remove(this.f10767b);
        if (bjVar != null) {
            bjVar.f10728b.mo11073a(aVar.mo11038b(), this.f10763a);
            bjVar.f10727a.mo11069a();
            return;
        }
        this.f10763a.mo15933b(Boolean.valueOf(false));
    }
}
