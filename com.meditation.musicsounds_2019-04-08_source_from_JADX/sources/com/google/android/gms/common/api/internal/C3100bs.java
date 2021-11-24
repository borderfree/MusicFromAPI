package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C3040d;
import com.google.android.gms.common.api.C3049h;

/* renamed from: com.google.android.gms.common.api.internal.bs */
final class C3100bs implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C3049h f10751a;

    /* renamed from: b */
    private final /* synthetic */ C3099br f10752b;

    C3100bs(C3099br brVar, C3049h hVar) {
        this.f10752b = brVar;
        this.f10751a = hVar;
    }

    public final void run() {
        try {
            BasePendingResult.f10621a.set(Boolean.valueOf(true));
            this.f10752b.f10749h.sendMessage(this.f10752b.f10749h.obtainMessage(0, this.f10752b.f10742a.mo11087a(this.f10751a)));
            BasePendingResult.f10621a.set(Boolean.valueOf(false));
            C3099br.m14262b(this.f10751a);
            C3040d dVar = (C3040d) this.f10752b.f10748g.get();
            if (dVar != null) {
                dVar.mo10847b(this.f10752b);
            }
        } catch (RuntimeException e) {
            this.f10752b.f10749h.sendMessage(this.f10752b.f10749h.obtainMessage(1, e));
            BasePendingResult.f10621a.set(Boolean.valueOf(false));
            C3099br.m14262b(this.f10751a);
            C3040d dVar2 = (C3040d) this.f10752b.f10748g.get();
            if (dVar2 != null) {
                dVar2.mo10847b(this.f10752b);
            }
        } catch (Throwable th) {
            BasePendingResult.f10621a.set(Boolean.valueOf(false));
            C3099br.m14262b(this.f10751a);
            C3040d dVar3 = (C3040d) this.f10752b.f10748g.get();
            if (dVar3 != null) {
                dVar3.mo10847b(this.f10752b);
            }
            throw th;
        }
    }
}
