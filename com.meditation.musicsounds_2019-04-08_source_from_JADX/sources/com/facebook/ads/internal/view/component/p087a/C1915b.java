package com.facebook.ads.internal.view.component.p087a;

import android.view.View;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.adapters.p059a.C1647d;
import com.facebook.ads.internal.adapters.p059a.C1651h;
import com.facebook.ads.internal.p072o.C1728c;
import com.facebook.ads.internal.p077s.p078a.C1808r;
import com.facebook.ads.internal.view.component.C1898a;
import com.facebook.ads.internal.view.component.C1926f;
import java.util.HashMap;

/* renamed from: com.facebook.ads.internal.view.component.a.b */
public abstract class C1915b extends RelativeLayout {

    /* renamed from: a */
    static final int f6300a = ((int) (C1808r.f5899b * 16.0f));

    /* renamed from: b */
    static final int f6301b = ((int) (C1808r.f5899b * 28.0f));

    /* renamed from: c */
    private final C1926f f6302c;

    /* renamed from: d */
    private final C1898a f6303d;

    /* renamed from: e */
    private final C1728c f6304e;

    protected C1915b(C1917d dVar, C1647d dVar2, boolean z) {
        super(dVar.mo7296a());
        this.f6304e = dVar.mo7297b();
        C1898a aVar = new C1898a(dVar.mo7296a(), mo7258b(), mo7259c(), "com.facebook.ads.interstitial.clicked", dVar2, dVar.mo7297b(), dVar.mo7298c(), dVar.mo7300e(), dVar.mo7301f());
        this.f6303d = aVar;
        C1808r.m8931a((View) this.f6303d);
        C1926f fVar = new C1926f(getContext(), dVar2, z, mo7290i(), mo7295j());
        this.f6302c = fVar;
        C1808r.m8931a((View) this.f6302c);
    }

    /* renamed from: a */
    public void mo7291a(C1651h hVar, String str, double d) {
        this.f6302c.mo7322a(hVar.mo6729a().mo6700b(), hVar.mo6729a().mo6701c(), false, !mo7256a() && d > 0.0d && d < 1.0d);
        this.f6303d.mo7252a(hVar.mo6730b(), str, new HashMap());
    }

    /* renamed from: a */
    public abstract boolean mo7256a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo7258b() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo7259c() {
        return true;
    }

    public C1728c getAdEventManager() {
        return this.f6304e;
    }

    /* access modifiers changed from: protected */
    public C1898a getCtaButton() {
        return this.f6303d;
    }

    /* access modifiers changed from: protected */
    public C1926f getTitleDescContainer() {
        return this.f6302c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public boolean mo7290i() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public boolean mo7295j() {
        return true;
    }
}
