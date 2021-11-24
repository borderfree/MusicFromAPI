package com.facebook.ads.internal.view.component.p087a;

import android.content.res.Resources;
import android.widget.FrameLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.facebook.ads.internal.adapters.p059a.C1647d;
import com.facebook.ads.internal.adapters.p059a.C1651h;

/* renamed from: com.facebook.ads.internal.view.component.a.e */
public class C1920e extends C1915b {

    /* renamed from: c */
    private static final int f6329c = Resources.getSystem().getDisplayMetrics().widthPixels;

    /* renamed from: d */
    private final C1921f f6330d;

    public C1920e(C1917d dVar, boolean z, C1647d dVar2) {
        super(dVar, dVar2, z);
        this.f6330d = new C1921f(dVar.mo7296a(), dVar.mo7299d());
        this.f6330d.mo7313a(dVar.mo7303h(), dVar.mo7304i(), getTitleDescContainer(), z);
        LayoutParams layoutParams = new LayoutParams(-1, -2);
        layoutParams.addRule(12);
        layoutParams.setMargins(f6300a, f6300a, f6300a, f6300a);
        getCtaButton().setLayoutParams(layoutParams);
        FrameLayout frameLayout = new FrameLayout(dVar.mo7296a());
        LayoutParams layoutParams2 = new LayoutParams(-1, -1);
        layoutParams2.addRule(2, getCtaButton().getId());
        frameLayout.setLayoutParams(layoutParams2);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams3.gravity = 17;
        layoutParams3.setMargins(f6300a, 0, f6300a, 0);
        frameLayout.addView(this.f6330d, layoutParams3);
        addView(frameLayout);
        addView(getCtaButton());
    }

    /* renamed from: a */
    public void mo7291a(C1651h hVar, String str, double d) {
        super.mo7291a(hVar, str, d);
        if (d > 0.0d) {
            double d2 = (double) (f6329c - (f6300a * 2));
            Double.isNaN(d2);
            this.f6330d.mo7312a((int) (d2 / d));
        }
    }

    /* renamed from: a */
    public boolean mo7256a() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo7259c() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public boolean mo7295j() {
        return false;
    }
}
