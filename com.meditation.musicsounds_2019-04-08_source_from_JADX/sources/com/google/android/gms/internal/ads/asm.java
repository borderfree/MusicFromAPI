package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.zzv;
import java.util.Map;

final class asm implements zzv<Object> {

    /* renamed from: a */
    private final /* synthetic */ C3442bn f13088a;

    /* renamed from: b */
    private final /* synthetic */ asi f13089b;

    asm(asi asi, C3442bn bnVar) {
        this.f13089b = asi;
        this.f13088a = bnVar;
    }

    public final void zza(Object obj, Map<String, String> map) {
        C3832py pyVar = (C3832py) this.f13089b.f13079a.get();
        if (pyVar == null) {
            this.f13088a.mo12820b("/hideOverlay", this);
        } else {
            pyVar.getView().setVisibility(8);
        }
    }
}
