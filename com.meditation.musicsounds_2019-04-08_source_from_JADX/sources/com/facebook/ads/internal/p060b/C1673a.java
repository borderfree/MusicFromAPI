package com.facebook.ads.internal.p060b;

import android.os.Bundle;
import android.view.View;
import com.facebook.ads.internal.p083t.C1838a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.internal.b.a */
public final class C1673a {

    /* renamed from: a */
    private final View f5482a;

    /* renamed from: b */
    private final List<C1677d> f5483b;

    /* renamed from: c */
    private C1675c f5484c;

    public C1673a(View view, List<C1674b> list) {
        this.f5482a = view;
        this.f5483b = new ArrayList(list.size());
        for (C1674b dVar : list) {
            this.f5483b.add(new C1677d(dVar));
        }
        this.f5484c = new C1675c();
    }

    public C1673a(View view, List<C1674b> list, Bundle bundle) {
        this.f5482a = view;
        this.f5483b = new ArrayList(list.size());
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("TESTS");
        for (int i = 0; i < list.size(); i++) {
            this.f5483b.add(new C1677d((C1674b) list.get(i), (Bundle) parcelableArrayList.get(i)));
        }
        this.f5484c = (C1675c) bundle.getSerializable("STATISTICS");
    }

    /* renamed from: a */
    public void mo6790a() {
        this.f5484c.mo6795a();
    }

    /* renamed from: a */
    public void mo6791a(double d, double d2) {
        if (d2 >= 0.0d) {
            this.f5484c.mo6798b(d, d2);
        }
        double c = (double) C1838a.m9017a(this.f5482a, 0).mo7118c();
        this.f5484c.mo6796a(d, c);
        for (C1677d a : this.f5483b) {
            a.mo6811a(d, c);
        }
    }

    /* renamed from: b */
    public void mo6792b() {
        this.f5484c.mo6797b();
        for (C1677d a : this.f5483b) {
            a.mo6810a();
        }
    }

    /* renamed from: c */
    public C1675c mo6793c() {
        return this.f5484c;
    }
}
