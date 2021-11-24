package com.facebook.ads.internal.view.component;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.support.p009v4.p010a.C0310a;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.facebook.ads.internal.adapters.p059a.C1647d;
import com.facebook.ads.internal.p077s.p078a.C1808r;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.internal.view.component.c */
public class C1923c extends LinearLayout {

    /* renamed from: a */
    private final int f6338a;

    /* renamed from: b */
    private final int f6339b;

    /* renamed from: c */
    private final int f6340c;

    /* renamed from: d */
    private int f6341d = -1;

    /* renamed from: e */
    private List<GradientDrawable> f6342e;

    public C1923c(Context context, C1647d dVar, int i) {
        super(context);
        setOrientation(0);
        setGravity(17);
        float f = C1808r.f5899b;
        int i2 = (int) (8.0f * f);
        int i3 = (int) (6.0f * f);
        this.f6340c = (int) (f * 1.0f);
        this.f6338a = dVar.mo6706a(false);
        this.f6339b = C0310a.m1169b(this.f6338a, 128);
        this.f6342e = new ArrayList();
        for (int i4 = 0; i4 < i; i4++) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(1);
            gradientDrawable.setSize(i2, i2);
            gradientDrawable.setStroke(this.f6340c, 0);
            ImageView imageView = new ImageView(context);
            LayoutParams layoutParams = new LayoutParams(-2, -2);
            layoutParams.setMargins(0, 0, i3, 0);
            layoutParams.gravity = 17;
            imageView.setLayoutParams(layoutParams);
            imageView.setImageDrawable(gradientDrawable);
            this.f6342e.add(gradientDrawable);
            addView(imageView);
        }
        mo7317a(0);
    }

    /* renamed from: a */
    public void mo7317a(int i) {
        int i2;
        int i3;
        if (this.f6341d != i) {
            this.f6341d = i;
            for (int i4 = 0; i4 < this.f6342e.size(); i4++) {
                if (i4 == i) {
                    i3 = this.f6338a;
                    i2 = this.f6338a;
                } else {
                    i3 = this.f6339b;
                    i2 = 0;
                }
                ((GradientDrawable) this.f6342e.get(i4)).setStroke(this.f6340c, i2);
                ((GradientDrawable) this.f6342e.get(i4)).setColor(i3);
                ((GradientDrawable) this.f6342e.get(i4)).invalidateSelf();
            }
        }
    }
}
