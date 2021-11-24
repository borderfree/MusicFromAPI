package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.zzv;
import java.util.Map;

final class asl implements zzv<Object> {

    /* renamed from: a */
    private final /* synthetic */ C3442bn f13086a;

    /* renamed from: b */
    private final /* synthetic */ asi f13087b;

    asl(asi asi, C3442bn bnVar) {
        this.f13087b = asi;
        this.f13086a = bnVar;
    }

    public final void zza(Object obj, Map<String, String> map) {
        C3832py pyVar = (C3832py) this.f13087b.f13079a.get();
        if (pyVar == null) {
            this.f13086a.mo12820b("/showOverlay", this);
        } else {
            pyVar.getView().setVisibility(0);
        }
    }
}
