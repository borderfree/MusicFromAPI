package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.zzv;
import java.lang.ref.WeakReference;

final class asi {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final WeakReference<C3832py> f13079a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public String f13080b;

    public asi(C3832py pyVar) {
        this.f13079a = new WeakReference<>(pyVar);
    }

    /* renamed from: a */
    public final void mo12470a(C3442bn bnVar) {
        bnVar.mo12817a("/loadHtml", (zzv<? super T>) new asj<Object>(this, bnVar));
        bnVar.mo12817a("/showOverlay", (zzv<? super T>) new asl<Object>(this, bnVar));
        bnVar.mo12817a("/hideOverlay", (zzv<? super T>) new asm<Object>(this, bnVar));
        C3832py pyVar = (C3832py) this.f13079a.get();
        if (pyVar != null) {
            pyVar.mo13488a("/sendMessageToSdk", (zzv<? super C3832py>) new asn<Object>(this, bnVar));
        }
    }
}
