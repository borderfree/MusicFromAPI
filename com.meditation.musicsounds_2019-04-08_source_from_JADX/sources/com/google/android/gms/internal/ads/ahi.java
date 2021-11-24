package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;
import android.view.View;

public final class ahi extends ahl {

    /* renamed from: d */
    private final View f12031d;

    public ahi(aga aga, String str, String str2, C4110yz yzVar, int i, int i2, View view) {
        super(aga, str, str2, yzVar, i, 57);
        this.f12031d = view;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11906a() {
        if (this.f12031d != null) {
            DisplayMetrics displayMetrics = this.f12041a.mo11866a().getResources().getDisplayMetrics();
            agj agj = new agj((String) this.f12043c.invoke(null, new Object[]{this.f12031d, displayMetrics}));
            aar aar = new aar();
            aar.f11368a = agj.f11979a;
            aar.f11369b = agj.f11980b;
            aar.f11370c = agj.f11981c;
            this.f12042b.f15104M = aar;
        }
    }
}
