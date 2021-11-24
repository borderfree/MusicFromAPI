package com.facebook.ads.internal.view.component.p087a.p088a;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.view.View;
import android.widget.RelativeLayout.LayoutParams;
import com.facebook.ads.internal.adapters.p059a.C1647d;
import com.facebook.ads.internal.p077s.p078a.C1808r;
import com.facebook.ads.internal.view.component.C1926f;
import com.facebook.ads.internal.view.component.p087a.C1917d;
import com.facebook.ads.internal.view.p089d.p090a.C1931a;

/* renamed from: com.facebook.ads.internal.view.component.a.a.a */
public class C1901a extends C1902b {

    /* renamed from: c */
    private static final int f6271c = ((int) (C1808r.f5899b * 12.0f));

    C1901a(C1917d dVar, C1647d dVar2, String str, C1931a aVar) {
        super(dVar, dVar2, true, str, aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7257a(Context context) {
        C1926f titleDescContainer = getTitleDescContainer();
        titleDescContainer.setAlignment(3);
        LayoutParams layoutParams = new LayoutParams(-1, -2);
        layoutParams.addRule(8, getMediaContainer().getId());
        titleDescContainer.setLayoutParams(layoutParams);
        titleDescContainer.setPadding(f6271c, f6271c, f6271c, f6271c);
        GradientDrawable gradientDrawable = new GradientDrawable(Orientation.TOP_BOTTOM, new int[]{0, -15658735});
        gradientDrawable.setCornerRadius(0.0f);
        C1808r.m8933a((View) titleDescContainer, (Drawable) gradientDrawable);
        LayoutParams layoutParams2 = new LayoutParams(-1, -2);
        layoutParams2.addRule(3, getMediaContainer().getId());
        getCtaButton().setLayoutParams(layoutParams2);
        addView(getMediaContainer());
        addView(titleDescContainer);
        addView(getCtaButton());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo7258b() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo7259c() {
        return false;
    }
}
