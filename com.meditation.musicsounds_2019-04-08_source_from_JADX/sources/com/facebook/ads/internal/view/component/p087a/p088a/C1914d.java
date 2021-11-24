package com.facebook.ads.internal.view.component.p087a.p088a;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.facebook.ads.internal.adapters.p059a.C1647d;
import com.facebook.ads.internal.p077s.p078a.C1808r;
import com.facebook.ads.internal.view.component.C1926f;
import com.facebook.ads.internal.view.component.p087a.C1917d;
import com.facebook.ads.internal.view.p089d.p090a.C1931a;

/* renamed from: com.facebook.ads.internal.view.component.a.a.d */
public class C1914d extends C1902b {

    /* renamed from: c */
    private static final int f6298c = ((int) (C1808r.f5899b * 20.0f));

    /* renamed from: d */
    private static final int f6299d = ((int) (C1808r.f5899b * 16.0f));

    C1914d(C1917d dVar, C1647d dVar2, String str, C1931a aVar) {
        super(dVar, dVar2, false, str, aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7257a(Context context) {
        C1926f titleDescContainer = getTitleDescContainer();
        titleDescContainer.setAlignment(3);
        titleDescContainer.setLayoutParams(new LayoutParams(-1, -2));
        titleDescContainer.setPadding(0, 0, 0, f6298c);
        getCtaButton().setLayoutParams(new LayoutParams(-1, -2));
        LinearLayout linearLayout = new LinearLayout(context);
        C1808r.m8933a((View) linearLayout, (Drawable) new ColorDrawable(-1));
        LayoutParams layoutParams = new LayoutParams(-1, -2);
        layoutParams.addRule(3, getMediaContainer().getId());
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(f6299d, f6299d, f6299d, f6299d);
        linearLayout.addView(titleDescContainer);
        linearLayout.addView(getCtaButton());
        addView(getMediaContainer());
        addView(linearLayout);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public boolean mo7290i() {
        return false;
    }
}
