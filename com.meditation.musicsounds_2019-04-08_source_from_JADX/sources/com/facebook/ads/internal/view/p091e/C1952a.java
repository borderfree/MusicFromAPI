package com.facebook.ads.internal.view.p091e;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.facebook.ads.internal.adapters.p059a.C1655j;
import com.facebook.ads.internal.adapters.p059a.C1656k;
import com.facebook.ads.internal.p077s.p078a.C1808r;
import com.facebook.ads.internal.view.component.C1924d;
import com.facebook.ads.internal.view.component.C1926f;
import com.facebook.ads.internal.view.p086c.C1896d;
import com.facebook.ads.internal.view.p086c.C1897e;
import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.internal.view.e.a */
public class C1952a extends RelativeLayout {

    /* renamed from: a */
    private static final int f6468a = ((int) (C1808r.f5899b * 72.0f));

    /* renamed from: b */
    private static final int f6469b = ((int) (C1808r.f5899b * 16.0f));

    /* renamed from: c */
    private static final int f6470c = ((int) (C1808r.f5899b * 16.0f));

    /* renamed from: d */
    private static final LayoutParams f6471d = new LayoutParams(-1, -1);

    /* renamed from: e */
    private final C1656k f6472e;

    /* renamed from: f */
    private C1924d f6473f;

    /* renamed from: g */
    private C1926f f6474g;

    /* renamed from: h */
    private LinearLayout f6475h;

    /* renamed from: com.facebook.ads.internal.view.e.a$a */
    private static class C1954a implements C1897e {

        /* renamed from: a */
        final WeakReference<ImageView> f6476a;

        private C1954a(ImageView imageView) {
            this.f6476a = new WeakReference<>(imageView);
        }

        /* renamed from: a */
        public void mo7245a(boolean z) {
            if (!z && this.f6476a.get() != null) {
                ((ImageView) this.f6476a.get()).setVisibility(8);
            }
        }
    }

    public C1952a(Context context, C1656k kVar) {
        super(context);
        this.f6472e = kVar;
        m9417a();
        m9419b();
    }

    /* renamed from: a */
    private void m9417a() {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setGravity(17);
        linearLayout.setOrientation(1);
        this.f6473f = new C1924d(getContext());
        C1808r.m8932a((View) this.f6473f, 0);
        this.f6473f.setRadius(50);
        new C1896d(this.f6473f).mo7236a().mo7240a(this.f6472e.mo6748a().mo6733b());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(f6468a, f6468a);
        C1926f fVar = new C1926f(getContext(), this.f6472e.mo6754d().mo6676a(), true, false, true);
        this.f6474g = fVar;
        this.f6474g.mo7322a(this.f6472e.mo6751b().mo6699a(), this.f6472e.mo6751b().mo6700b(), false, true);
        this.f6474g.getDescriptionTextView().setAlpha(0.8f);
        this.f6474g.setAlignment(17);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.setMargins(0, f6470c, 0, f6470c / 2);
        this.f6475h = new LinearLayout(getContext());
        this.f6475h.setGravity(17);
        this.f6475h.setPadding(f6470c, f6470c / 2, f6470c, f6470c / 2);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.setMargins(0, f6470c / 2, 0, 0);
        C1655j j = this.f6472e.mo6755e().mo6688j();
        TextView textView = new TextView(getContext());
        textView.setTextColor(-1);
        C1808r.m8938a(textView, false, 16);
        textView.setText(j.mo6744d());
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        ImageView imageView = new ImageView(getContext());
        new C1896d(imageView).mo7236a().mo7238a((C1897e) new C1954a(imageView)).mo7240a(j.mo6742b());
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(f6469b, f6469b);
        layoutParams5.setMargins(0, 0, f6470c / 2, 0);
        this.f6475h.addView(imageView, layoutParams5);
        this.f6475h.addView(textView, layoutParams4);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(100.0f);
        gradientDrawable.setColor(469762047);
        C1808r.m8933a((View) this.f6475h, (Drawable) gradientDrawable);
        linearLayout.addView(this.f6473f, layoutParams);
        linearLayout.addView(this.f6474g, layoutParams2);
        linearLayout.addView(this.f6475h, layoutParams3);
        C1808r.m8932a((View) this, -14473425);
        addView(linearLayout, f6471d);
    }

    /* renamed from: a */
    private void m9418a(View view, int i) {
        view.setTranslationY((float) i);
        view.setScaleY(0.75f);
        view.setScaleX(0.75f);
        view.animate().translationYBy((float) (-i)).scaleX(1.0f).scaleY(1.0f).setDuration(200).setInterpolator(new DecelerateInterpolator(2.0f));
    }

    /* renamed from: b */
    private void m9419b() {
        m9418a(this.f6473f, 150);
        m9418a(this.f6474g, 170);
        m9418a(this.f6475h, 190);
    }
}
