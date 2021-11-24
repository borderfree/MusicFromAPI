package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.zzv;
import org.json.JSONObject;

@C3464ci
public final class aif implements ais {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final ahw f12099a;

    /* renamed from: b */
    private final C3832py f12100b;

    /* renamed from: c */
    private final zzv<C3832py> f12101c = new aig(this);

    /* renamed from: d */
    private final zzv<C3832py> f12102d = new aih(this);

    /* renamed from: e */
    private final zzv<C3832py> f12103e = new aii(this);

    public aif(ahw ahw, C3832py pyVar) {
        this.f12099a = ahw;
        this.f12100b = pyVar;
        C3832py pyVar2 = this.f12100b;
        pyVar2.mo13488a("/updateActiveView", this.f12101c);
        pyVar2.mo13488a("/untrackActiveViewUnit", this.f12102d);
        pyVar2.mo13488a("/visibilityChanged", this.f12103e);
        String str = "Custom JS tracking ad unit: ";
        String valueOf = String.valueOf(this.f12099a.f12064a.mo11935d());
        C3643iy.m19172b(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }

    /* renamed from: a */
    public final void mo11971a(JSONObject jSONObject, boolean z) {
        if (!z) {
            this.f12100b.mo12596b("AFMA_updateActiveView", jSONObject);
        } else {
            this.f12099a.mo11954b((ais) this);
        }
    }

    /* renamed from: a */
    public final boolean mo11972a() {
        return true;
    }

    /* renamed from: b */
    public final void mo11973b() {
        C3832py pyVar = this.f12100b;
        pyVar.mo13492b("/visibilityChanged", this.f12103e);
        pyVar.mo13492b("/untrackActiveViewUnit", this.f12102d);
        pyVar.mo13492b("/updateActiveView", this.f12101c);
    }
}
