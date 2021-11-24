package com.facebook.ads.internal.view.p084a;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.TextView;
import com.facebook.ads.internal.p077s.p078a.C1808r;

/* renamed from: com.facebook.ads.internal.view.a.d */
public class C1857d extends TextView {

    /* renamed from: a */
    private static final int f6106a = ((int) (C1808r.f5899b * 16.0f));

    /* renamed from: b */
    private static final int f6107b = ((int) (C1808r.f5899b * 12.0f));

    /* renamed from: c */
    private boolean f6108c = false;

    public C1857d(Context context) {
        super(context);
        m9107b();
        setPadding(f6106a, f6107b, f6106a, f6107b);
    }

    /* renamed from: b */
    private void m9107b() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(this.f6108c ? -13272859 : -1315344);
        gradientDrawable.setCornerRadius(50.0f);
        C1808r.m8933a((View) this, (Drawable) gradientDrawable);
        setTextColor(this.f6108c ? -1 : -10459280);
    }

    /* renamed from: a */
    public void mo7139a() {
        this.f6108c = !this.f6108c;
        m9107b();
    }
}
