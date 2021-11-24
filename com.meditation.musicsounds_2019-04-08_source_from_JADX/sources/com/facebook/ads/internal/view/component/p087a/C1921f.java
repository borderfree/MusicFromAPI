package com.facebook.ads.internal.view.component.p087a;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.facebook.ads.internal.p077s.p078a.C1808r;
import com.facebook.ads.internal.view.component.C1925e;
import com.facebook.ads.internal.view.component.C1926f;

/* renamed from: com.facebook.ads.internal.view.component.a.f */
final class C1921f extends RelativeLayout {

    /* renamed from: a */
    private final View f6331a;

    /* renamed from: b */
    private final C1925e f6332b;

    public C1921f(Context context, View view) {
        super(context);
        this.f6331a = view;
        this.f6332b = new C1925e(context);
        C1808r.m8931a((View) this.f6332b);
    }

    /* renamed from: a */
    public void mo7312a(int i) {
        this.f6331a.setLayoutParams(new LayoutParams(-1, i));
    }

    /* renamed from: a */
    public void mo7313a(View view, View view2, C1926f fVar, boolean z) {
        this.f6332b.addView(this.f6331a, new LayoutParams(-1, -2));
        if (view2 != null) {
            LayoutParams layoutParams = new LayoutParams(C1915b.f6301b, C1915b.f6301b);
            layoutParams.addRule(6, this.f6331a.getId());
            layoutParams.addRule(7, this.f6331a.getId());
            layoutParams.setMargins(C1915b.f6300a, C1915b.f6300a, C1915b.f6300a, C1915b.f6300a);
            this.f6332b.addView(view2, layoutParams);
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        LayoutParams layoutParams2 = new LayoutParams(-1, -2);
        layoutParams2.addRule(8, this.f6331a.getId());
        if (fVar != null) {
            if (z) {
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
                fVar.setAlignment(3);
                layoutParams3.setMargins(C1915b.f6300a / 2, C1915b.f6300a / 2, C1915b.f6300a / 2, C1915b.f6300a / 2);
                linearLayout.addView(fVar, layoutParams3);
                GradientDrawable gradientDrawable = new GradientDrawable(Orientation.BOTTOM_TOP, new int[]{-1778384896, 0});
                gradientDrawable.setCornerRadius(0.0f);
                gradientDrawable.setGradientType(0);
                C1808r.m8933a((View) linearLayout, (Drawable) gradientDrawable);
            } else {
                LayoutParams layoutParams4 = new LayoutParams(-1, -2);
                layoutParams4.addRule(3, this.f6332b.getId());
                layoutParams4.setMargins(0, C1915b.f6300a, 0, 0);
                fVar.setAlignment(17);
                addView(fVar, layoutParams4);
            }
        }
        if (view != null) {
            linearLayout.addView(view, new LayoutParams(-1, -2));
        }
        this.f6332b.addView(linearLayout, layoutParams2);
        addView(this.f6332b, new LayoutParams(-1, -2));
    }
}
