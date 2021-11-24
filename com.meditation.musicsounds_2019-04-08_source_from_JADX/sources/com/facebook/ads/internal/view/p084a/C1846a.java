package com.facebook.ads.internal.view.p084a;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.facebook.ads.internal.p061c.C1678a;
import com.facebook.ads.internal.p077s.p078a.C1808r;
import com.facebook.ads.internal.p077s.p079b.C1817b;
import com.facebook.ads.internal.p077s.p079b.C1818c;

/* renamed from: com.facebook.ads.internal.view.a.a */
public class C1846a extends RelativeLayout {

    /* renamed from: a */
    private static final int f6071a = ((int) (C1808r.f5899b * 16.0f));

    /* renamed from: b */
    private static final int f6072b = ((int) (C1808r.f5899b * 12.0f));

    /* renamed from: c */
    private static final int f6073c = ((int) (C1808r.f5899b * 8.0f));

    /* renamed from: d */
    private static final int f6074d = ((int) (C1808r.f5899b * 44.0f));

    /* renamed from: e */
    private static final int f6075e = ((int) (C1808r.f5899b * 10.0f));

    /* renamed from: f */
    private static final int f6076f = (f6071a - f6075e);

    /* renamed from: g */
    private static final int f6077g = ((int) (C1808r.f5899b * 75.0f));

    /* renamed from: h */
    private static final int f6078h = ((int) (C1808r.f5899b * 25.0f));

    /* renamed from: i */
    private static final int f6079i = ((int) (C1808r.f5899b * 16.0f));
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C1856c f6080j;

    /* renamed from: com.facebook.ads.internal.view.a.a$a */
    public static class C1849a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public Context f6083a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public C1856c f6084b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public String f6085c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public String f6086d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public String f6087e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public C1817b f6088f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public int f6089g;

        public C1849a(Context context, C1856c cVar) {
            this.f6083a = context;
            this.f6084b = cVar;
        }

        /* renamed from: a */
        public C1849a mo7123a(int i) {
            this.f6089g = i;
            return this;
        }

        /* renamed from: a */
        public C1849a mo7124a(C1817b bVar) {
            this.f6088f = bVar;
            return this;
        }

        /* renamed from: a */
        public C1849a mo7125a(String str) {
            this.f6085c = str;
            return this;
        }

        /* renamed from: a */
        public C1846a mo7126a() {
            return new C1846a(this);
        }

        /* renamed from: b */
        public C1849a mo7127b(String str) {
            this.f6086d = str;
            return this;
        }

        /* renamed from: c */
        public C1849a mo7128c(String str) {
            this.f6087e = str;
            return this;
        }
    }

    private C1846a(C1849a aVar) {
        super(aVar.f6083a);
        this.f6080j = aVar.f6084b;
        C1808r.m8932a((View) this, -1);
        setClickable(true);
        View headerView = getHeaderView();
        View a = m9063a(aVar);
        View footerView = getFooterView();
        C1808r.m8931a(headerView);
        C1808r.m8931a(a);
        C1808r.m8931a(footerView);
        LayoutParams layoutParams = new LayoutParams(-1, -2);
        layoutParams.addRule(10);
        LayoutParams layoutParams2 = new LayoutParams(-1, -1);
        layoutParams2.addRule(13);
        layoutParams2.addRule(3, headerView.getId());
        layoutParams2.addRule(2, footerView.getId());
        LayoutParams layoutParams3 = new LayoutParams(-1, -2);
        layoutParams3.addRule(12);
        layoutParams3.setMargins(f6071a, 0, f6071a, f6071a);
        addView(headerView, layoutParams);
        addView(a, layoutParams2);
        addView(footerView, layoutParams3);
    }

    /* renamed from: a */
    private View m9063a(C1849a aVar) {
        ImageView imageView = new ImageView(getContext());
        imageView.setPadding(f6078h, f6078h, f6078h, f6078h);
        imageView.setImageBitmap(C1818c.m8953a(aVar.f6088f));
        imageView.setColorFilter(-1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(f6077g, f6077g);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(aVar.f6089g);
        C1808r.m8933a((View) imageView, (Drawable) gradientDrawable);
        layoutParams.gravity = 17;
        layoutParams.setMargins(f6071a, 0, f6071a, f6071a);
        TextView textView = new TextView(getContext());
        C1808r.m8938a(textView, true, 20);
        textView.setTextColor(-14934495);
        textView.setText(aVar.f6085c);
        textView.setGravity(17);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(f6071a, 0, f6071a, f6071a);
        TextView textView2 = new TextView(getContext());
        C1808r.m8938a(textView2, false, 16);
        textView2.setTextColor(-10459280);
        textView2.setText(aVar.f6086d);
        textView2.setGravity(17);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.setMargins(f6071a, 0, f6071a, f6071a);
        ImageView imageView2 = new ImageView(getContext());
        imageView2.setImageBitmap(C1818c.m8953a(C1817b.CHECKMARK));
        imageView2.setColorFilter(-1);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(f6079i, f6079i);
        layoutParams4.gravity = 17;
        TextView textView3 = new TextView(getContext());
        textView3.setText(aVar.f6087e);
        textView3.setPadding(f6073c, 0, 0, 0);
        textView3.setTextColor(-1);
        C1808r.m8938a(textView3, false, 16);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.setPadding(f6071a, f6072b, f6071a, f6072b);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setColor(-13272859);
        gradientDrawable2.setCornerRadius(100.0f);
        C1808r.m8933a((View) linearLayout, (Drawable) gradientDrawable2);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams6.gravity = 17;
        layoutParams6.setMargins(f6071a, 0, f6071a, 0);
        linearLayout.addView(imageView2, layoutParams4);
        linearLayout.addView(textView3, layoutParams5);
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(17);
        linearLayout2.addView(imageView, layoutParams);
        linearLayout2.addView(textView, layoutParams2);
        linearLayout2.addView(textView2, layoutParams3);
        linearLayout2.addView(linearLayout, layoutParams5);
        return linearLayout2;
    }

    private View getFooterView() {
        ImageView imageView = new ImageView(getContext());
        imageView.setImageBitmap(C1818c.m8953a(C1817b.SETTINGS));
        imageView.setColorFilter(-13272859);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(f6079i, f6079i);
        layoutParams.gravity = 17;
        TextView textView = new TextView(getContext());
        C1808r.m8938a(textView, false, 16);
        textView.setTextColor(-13272859);
        textView.setPadding(f6073c, f6073c, f6073c, f6073c);
        textView.setText(C1678a.m8414i(getContext()));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        linearLayout.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                C1846a.this.f6080j.mo7133b();
            }
        });
        linearLayout.addView(imageView, layoutParams);
        linearLayout.addView(textView, layoutParams2);
        return linearLayout;
    }

    private View getHeaderView() {
        ImageView imageView = new ImageView(getContext());
        imageView.setPadding(f6075e, f6075e, f6075e, f6075e);
        imageView.setScaleType(ScaleType.FIT_CENTER);
        imageView.setImageBitmap(C1818c.m8953a(C1817b.INTERSTITIAL_CLOSE));
        imageView.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                C1846a.this.f6080j.mo7131a();
            }
        });
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(f6074d, f6074d);
        layoutParams.setMargins(f6076f, f6076f, f6076f, f6076f);
        linearLayout.addView(imageView, layoutParams);
        return linearLayout;
    }
}
