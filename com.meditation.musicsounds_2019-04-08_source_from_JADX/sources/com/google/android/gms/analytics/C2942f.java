package com.google.android.gms.analytics;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C3266s;
import com.google.android.gms.internal.measurement.C4402g;
import com.google.android.gms.internal.measurement.C4489k;
import com.google.android.gms.internal.measurement.C4499u;
import java.util.ListIterator;

/* renamed from: com.google.android.gms.analytics.f */
public class C2942f extends C2951o<C2942f> {

    /* renamed from: b */
    private final C4499u f10381b;

    /* renamed from: c */
    private boolean f10382c;

    public C2942f(C4499u uVar) {
        super(uVar.mo14848g(), uVar.mo14844c());
        this.f10381b = uVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10617a(C2948l lVar) {
        C4402g gVar = (C4402g) lVar.mo10630b(C4402g.class);
        if (TextUtils.isEmpty(gVar.mo14538b())) {
            gVar.mo14539b(this.f10381b.mo14856o().mo14136b());
        }
        if (this.f10382c && TextUtils.isEmpty(gVar.mo14543d())) {
            C4489k n = this.f10381b.mo14855n();
            gVar.mo14544d(n.mo14792c());
            gVar.mo14537a(n.mo14791b());
        }
    }

    /* renamed from: b */
    public final void mo10618b(String str) {
        C3266s.m14915a(str);
        Uri a = C2943g.m13777a(str);
        ListIterator listIterator = this.f10401a.mo10632c().listIterator();
        while (listIterator.hasNext()) {
            if (a.equals(((C2959t) listIterator.next()).mo10622a())) {
                listIterator.remove();
            }
        }
        this.f10401a.mo10632c().add(new C2943g(this.f10381b, str));
    }

    /* renamed from: b */
    public final void mo10619b(boolean z) {
        this.f10382c = z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final C4499u mo10620f() {
        return this.f10381b;
    }

    /* renamed from: g */
    public final C2948l mo10621g() {
        C2948l a = this.f10401a.mo10626a();
        a.mo10629a((C2950n) this.f10381b.mo14857p().mo14121b());
        a.mo10629a((C2950n) this.f10381b.mo14858q().mo14157b());
        mo10642b(a);
        return a;
    }
}
