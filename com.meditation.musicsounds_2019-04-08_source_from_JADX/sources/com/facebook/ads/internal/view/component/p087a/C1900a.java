package com.facebook.ads.internal.view.component.p087a;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.facebook.ads.internal.adapters.p059a.C1647d;
import com.facebook.ads.internal.p077s.p078a.C1808r;

/* renamed from: com.facebook.ads.internal.view.component.a.a */
public class C1900a extends C1915b {
    public C1900a(C1917d dVar, C1647d dVar2, boolean z) {
        super(dVar, dVar2, true);
        RelativeLayout relativeLayout = new RelativeLayout(dVar.mo7296a());
        LayoutParams layoutParams = new LayoutParams(-1, -2);
        layoutParams.addRule(12);
        GradientDrawable gradientDrawable = new GradientDrawable(Orientation.BOTTOM_TOP, new int[]{-1778384896, 0});
        gradientDrawable.setCornerRadius(0.0f);
        gradientDrawable.setGradientType(0);
        C1808r.m8933a((View) relativeLayout, (Drawable) gradientDrawable);
        LinearLayout linearLayout = new LinearLayout(dVar.mo7296a());
        linearLayout.setOrientation(z ^ true ? 1 : 0);
        linearLayout.setGravity(80);
        C1808r.m8931a((View) linearLayout);
        LayoutParams layoutParams2 = new LayoutParams(-1, -2);
        layoutParams2.setMargins(f6300a, 0, f6300a, dVar.mo7303h() == null ? f6300a : f6300a / 2);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(z ? -2 : -1, -2);
        layoutParams3.setMargins(z ? f6300a : 0, z ? 0 : f6300a, 0, 0);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(z ? 0 : -1, -2);
        layoutParams4.setMargins(0, 0, 0, 0);
        layoutParams4.weight = 1.0f;
        linearLayout.addView(getTitleDescContainer(), layoutParams4);
        linearLayout.addView(getCtaButton(), layoutParams3);
        relativeLayout.addView(linearLayout, layoutParams2);
        if (dVar.mo7303h() != null) {
            LayoutParams layoutParams5 = new LayoutParams(-1, -2);
            layoutParams5.setMargins(0, 0, 0, 0);
            layoutParams5.addRule(3, linearLayout.getId());
            relativeLayout.addView(dVar.mo7303h(), layoutParams5);
        }
        addView(dVar.mo7299d(), new LayoutParams(-1, -1));
        addView(relativeLayout, layoutParams);
        if (dVar.mo7304i() != null) {
            LayoutParams layoutParams6 = new LayoutParams(f6301b, f6301b);
            layoutParams6.addRule(10);
            layoutParams6.addRule(11);
            layoutParams6.setMargins(f6300a, f6300a + dVar.mo7305j(), f6300a, f6300a);
            addView(dVar.mo7304i(), layoutParams6);
        }
    }

    /* renamed from: a */
    public boolean mo7256a() {
        return true;
    }
}
