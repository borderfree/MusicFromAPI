package com.seattleclouds;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.ads.C5244a;
import com.seattleclouds.ads.C5260d;

/* renamed from: com.seattleclouds.w */
public class C6652w extends C6671x {

    /* renamed from: i */
    private C5244a f23392i;

    /* renamed from: J */
    public void mo1200J() {
        super.mo1200J();
        if (this.f23392i != null) {
            this.f23392i.mo17248a();
        }
    }

    /* renamed from: K */
    public void mo1201K() {
        if (this.f23392i != null) {
            this.f23392i.mo17250b();
        }
        super.mo1201K();
    }

    /* renamed from: a */
    public void mo1242a(View view, Bundle bundle) {
        super.mo1242a(view, bundle);
        mo20645a((LinearLayout) view.findViewById(C5458g.sc_ad_container));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo20645a(LinearLayout linearLayout) {
        if (linearLayout != null) {
            Bundle m = mo1307m();
            if (m != null) {
                mo20647a(linearLayout, m.getString("PAGE_ID"));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo20646a(LinearLayout linearLayout, C5230aa aaVar) {
        if (!C5260d.m26241a().mo17273c()) {
            this.f23392i = new C5244a();
            this.f23392i.mo17249a(mo1318s(), linearLayout, aaVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo20647a(LinearLayout linearLayout, String str) {
        mo20646a(linearLayout, (C5230aa) App.f18501c.mo16902D().get(str));
    }

    /* renamed from: g */
    public void mo1288g() {
        super.mo1288g();
        if (C5260d.m26241a().mo17273c() && this.f23392i != null) {
            this.f23392i.mo17251c();
            this.f23392i = null;
        }
    }

    /* renamed from: i */
    public void mo1296i() {
        if (this.f23392i != null) {
            this.f23392i.mo17251c();
            this.f23392i = null;
        }
        super.mo1296i();
    }
}
