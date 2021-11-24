package com.facebook.ads.internal.view.p092f;

import android.support.p023v7.widget.RecyclerView.C0926a;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import java.util.List;

/* renamed from: com.facebook.ads.internal.view.f.c */
public class C1983c extends C0926a<C1985e> {

    /* renamed from: a */
    private final List<String> f6580a;

    /* renamed from: b */
    private final int f6581b;

    C1983c(List<String> list, int i) {
        this.f6580a = list;
        this.f6581b = i;
    }

    /* renamed from: a */
    public int mo342a() {
        return this.f6580a.size();
    }

    /* renamed from: a */
    public C1985e mo353b(ViewGroup viewGroup, int i) {
        return new C1985e(new C1984d(viewGroup.getContext()));
    }

    /* renamed from: a */
    public void mo350a(C1985e eVar, int i) {
        String str = (String) this.f6580a.get(i);
        MarginLayoutParams marginLayoutParams = new MarginLayoutParams(-2, -1);
        marginLayoutParams.setMargins(i == 0 ? this.f6581b * 4 : this.f6581b, 0, i >= mo342a() + -1 ? this.f6581b * 4 : this.f6581b, 0);
        eVar.mo7412y().setLayoutParams(marginLayoutParams);
        eVar.mo7412y().mo7411a(str);
    }
}
