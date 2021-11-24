package com.google.android.gms.analytics;

import com.google.android.gms.analytics.C2951o;
import com.google.android.gms.common.internal.C3266s;
import com.google.android.gms.common.util.C3300e;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.analytics.o */
public class C2951o<T extends C2951o> {

    /* renamed from: a */
    protected final C2948l f10401a;

    /* renamed from: b */
    private final C2952p f10402b;

    /* renamed from: c */
    private final List<C2949m> f10403c = new ArrayList();

    protected C2951o(C2952p pVar, C3300e eVar) {
        C3266s.m14913a(pVar);
        this.f10402b = pVar;
        C2948l lVar = new C2948l(this, eVar);
        lVar.mo10639j();
        this.f10401a = lVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo10617a(C2948l lVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo10642b(C2948l lVar) {
        for (C2949m a : this.f10403c) {
            a.mo10640a(this, lVar);
        }
    }

    /* renamed from: g */
    public C2948l mo10621g() {
        C2948l a = this.f10401a.mo10626a();
        mo10642b(a);
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final C2952p mo10643h() {
        return this.f10402b;
    }
}
