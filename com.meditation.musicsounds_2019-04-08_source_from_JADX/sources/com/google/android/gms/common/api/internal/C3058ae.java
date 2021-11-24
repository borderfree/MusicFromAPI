package com.google.android.gms.common.api.internal;

import com.google.android.gms.signin.internal.C4784c;
import com.google.android.gms.signin.internal.zaj;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.common.api.internal.ae */
final class C3058ae extends C4784c {

    /* renamed from: a */
    private final WeakReference<C3161x> f10646a;

    C3058ae(C3161x xVar) {
        this.f10646a = new WeakReference<>(xVar);
    }

    /* renamed from: a */
    public final void mo10895a(zaj zaj) {
        C3161x xVar = (C3161x) this.f10646a.get();
        if (xVar != null) {
            xVar.f10918a.mo10922a((C3073at) new C3059af(this, xVar, xVar, zaj));
        }
    }
}
