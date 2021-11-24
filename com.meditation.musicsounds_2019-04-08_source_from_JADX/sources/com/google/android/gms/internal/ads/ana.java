package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.dynamic.C3327d;
import java.util.HashMap;

final class ana extends C3412a<ath> {

    /* renamed from: a */
    private final /* synthetic */ View f12480a;

    /* renamed from: b */
    private final /* synthetic */ HashMap f12481b;

    /* renamed from: c */
    private final /* synthetic */ HashMap f12482c;

    /* renamed from: d */
    private final /* synthetic */ amt f12483d;

    ana(amt amt, View view, HashMap hashMap, HashMap hashMap2) {
        this.f12483d = amt;
        this.f12480a = view;
        this.f12481b = hashMap;
        this.f12482c = hashMap2;
        super();
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo12115a() {
        ath a = this.f12483d.f12454i.mo12520a(this.f12480a, this.f12481b, this.f12482c);
        if (a != null) {
            return a;
        }
        amt.m16609a(this.f12480a.getContext(), "native_ad_view_holder_delegate");
        return new apr();
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo12116a(aoh aoh) {
        return aoh.createNativeAdViewHolderDelegate(C3327d.m15136a(this.f12480a), C3327d.m15136a(this.f12481b), C3327d.m15136a(this.f12482c));
    }
}
