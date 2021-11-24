package com.facebook.ads.internal.adapters;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.AudienceNetworkActivity.C1619a;
import com.facebook.ads.internal.adapters.C1670h.C1671a;
import com.facebook.ads.internal.p077s.p078a.C1806p;
import com.facebook.ads.internal.p077s.p078a.C1808r;
import com.facebook.ads.internal.view.C1844a;
import com.facebook.ads.internal.view.C1844a.C1845a;
import com.facebook.ads.internal.view.p089d.C1930a;
import com.facebook.ads.internal.view.p093g.p094a.C2000a;
import com.facebook.ads.internal.view.p093g.p095b.C2035t;
import com.facebook.ads.internal.view.p093g.p096c.C2046a.C2047a;
import com.facebook.ads.internal.view.p093g.p096c.C2057d;
import com.facebook.ads.internal.view.p093g.p096c.C2057d.C2065a;
import com.facebook.ads.internal.view.p093g.p096c.C2079i;
import com.facebook.ads.internal.view.p093g.p096c.C2080j;
import com.facebook.ads.internal.view.p093g.p097d.C2101d;
import java.util.HashMap;

/* renamed from: com.facebook.ads.internal.adapters.d */
public class C1663d extends C1658c implements OnTouchListener, C1844a {

    /* renamed from: i */
    static final /* synthetic */ boolean f5431i = (!C1663d.class.desiredAssertionStatus());

    /* renamed from: j */
    private static final String f5432j = C1663d.class.getSimpleName();

    /* renamed from: A */
    private int f5433A = -10525069;

    /* renamed from: B */
    private int f5434B = -12286980;

    /* renamed from: C */
    private boolean f5435C = false;

    /* renamed from: D */
    private C2000a f5436D;

    /* renamed from: f */
    final int f5437f = 64;

    /* renamed from: g */
    final int f5438g = 64;

    /* renamed from: h */
    final int f5439h = 16;

    /* renamed from: k */
    private C1845a f5440k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public Activity f5441l;

    /* renamed from: m */
    private C1619a f5442m = new C1619a() {
        /* renamed from: a */
        public boolean mo6642a() {
            if (C1663d.this.f5454y == null) {
                return false;
            }
            if (!C1663d.this.f5454y.mo7537a()) {
                return true;
            }
            if (!(C1663d.this.f5454y.getSkipSeconds() == 0 || C1663d.this.f5414b == null)) {
                C1663d.this.f5414b.mo7428d();
            }
            if (C1663d.this.f5414b != null) {
                C1663d.this.f5414b.mo7429e();
            }
            return false;
        }
    };

    /* renamed from: n */
    private final OnTouchListener f5443n = new OnTouchListener() {
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() != 1) {
                return true;
            }
            if (C1663d.this.f5454y != null) {
                if (!C1663d.this.f5454y.mo7537a()) {
                    return true;
                }
                if (!(C1663d.this.f5454y.getSkipSeconds() == 0 || C1663d.this.f5414b == null)) {
                    C1663d.this.f5414b.mo7428d();
                }
                if (C1663d.this.f5414b != null) {
                    C1663d.this.f5414b.mo7429e();
                }
            }
            C1663d.this.f5441l.finish();
            return true;
        }
    };

    /* renamed from: o */
    private C1671a f5444o = C1671a.UNSPECIFIED;

    /* renamed from: p */
    private final C1806p f5445p = new C1806p();

    /* renamed from: q */
    private C1930a f5446q;

    /* renamed from: r */
    private TextView f5447r;

    /* renamed from: s */
    private TextView f5448s;

    /* renamed from: t */
    private ImageView f5449t;

    /* renamed from: u */
    private C2047a f5450u;

    /* renamed from: v */
    private C2079i f5451v;

    /* renamed from: w */
    private ViewGroup f5452w;

    /* renamed from: x */
    private C2057d f5453x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public C2080j f5454y;

    /* renamed from: z */
    private int f5455z = -1;

    /* renamed from: a */
    private void m8340a(int i) {
        View view;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        View view2;
        int i7 = i;
        float f = C1808r.f5899b;
        int i8 = (int) (56.0f * f);
        LayoutParams layoutParams = new LayoutParams(i8, i8);
        layoutParams.addRule(10);
        layoutParams.addRule(11);
        int i9 = (int) (16.0f * f);
        this.f5454y.setPadding(i9, i9, i9, i9);
        this.f5454y.setLayoutParams(layoutParams);
        C2065a aVar = mo6775d() ? C2065a.FADE_OUT_ON_PLAY : C2065a.VISIBLE;
        int id = this.f5414b.getId();
        if (i7 != 1 || (!m8345e() && !m8346f())) {
            if (i7 == 1) {
                LayoutParams layoutParams2 = new LayoutParams(-1, -2);
                layoutParams2.addRule(10);
                this.f5414b.setLayoutParams(layoutParams2);
                m8341a((View) this.f5414b);
                m8341a((View) this.f5454y);
                if (this.f5450u != null) {
                    m8341a((View) this.f5450u);
                }
                LinearLayout linearLayout = new LinearLayout(this.f5416d);
                this.f5452w = linearLayout;
                linearLayout.setGravity(112);
                linearLayout.setOrientation(1);
                LayoutParams layoutParams3 = new LayoutParams(-1, -1);
                int i10 = (int) (33.0f * f);
                layoutParams3.leftMargin = i10;
                layoutParams3.rightMargin = i10;
                layoutParams3.topMargin = (int) (8.0f * f);
                if (this.f5446q == null) {
                    layoutParams3.bottomMargin = i9;
                } else {
                    layoutParams3.bottomMargin = (int) (f * 80.0f);
                }
                layoutParams3.addRule(3, id);
                linearLayout.setLayoutParams(layoutParams3);
                m8341a((View) linearLayout);
                if (this.f5446q != null) {
                    LayoutParams layoutParams4 = new LayoutParams(-1, (int) (f * 64.0f));
                    layoutParams4.bottomMargin = i9;
                    layoutParams4.leftMargin = i10;
                    layoutParams4.rightMargin = i10;
                    layoutParams4.addRule(1);
                    layoutParams4.addRule(12);
                    this.f5446q.setLayoutParams(layoutParams4);
                    m8341a((View) this.f5446q);
                }
                if (this.f5447r != null) {
                    LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams5.weight = 2.0f;
                    layoutParams5.gravity = 17;
                    this.f5447r.setEllipsize(TruncateAt.END);
                    this.f5447r.setGravity(17);
                    this.f5447r.setLayoutParams(layoutParams5);
                    this.f5447r.setMaxLines(2);
                    this.f5447r.setPadding(0, 0, 0, 0);
                    this.f5447r.setTextColor(this.f5433A);
                    this.f5447r.setTextSize(24.0f);
                    m8342a(linearLayout, this.f5447r);
                }
                if (this.f5449t != null) {
                    int i11 = (int) (64.0f * f);
                    LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(i11, i11);
                    layoutParams6.weight = 0.0f;
                    layoutParams6.gravity = 17;
                    this.f5449t.setLayoutParams(layoutParams6);
                    m8342a(linearLayout, this.f5449t);
                }
                if (this.f5448s != null) {
                    LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-1, -2);
                    layoutParams7.weight = 2.0f;
                    layoutParams7.gravity = 16;
                    this.f5448s.setEllipsize(TruncateAt.END);
                    this.f5448s.setGravity(16);
                    this.f5448s.setLayoutParams(layoutParams7);
                    this.f5448s.setMaxLines(2);
                    this.f5448s.setPadding(0, 0, 0, 0);
                    this.f5448s.setTextColor(this.f5433A);
                    m8342a(linearLayout, this.f5448s);
                }
                if (this.f5451v != null) {
                    LayoutParams layoutParams8 = new LayoutParams(-1, (int) (f * 6.0f));
                    layoutParams8.addRule(3, id);
                    this.f5451v.setLayoutParams(layoutParams8);
                    view2 = this.f5451v;
                }
                view = (View) this.f5414b.getParent();
                i2 = this.f5455z;
            } else if (!m8347g() || m8346f()) {
                GradientDrawable gradientDrawable = new GradientDrawable(Orientation.TOP_BOTTOM, new int[]{0, -15658735});
                gradientDrawable.setCornerRadius(0.0f);
                this.f5414b.setLayoutParams(new LayoutParams(-1, -1));
                m8341a((View) this.f5414b);
                m8341a((View) this.f5454y);
                if (this.f5450u != null) {
                    m8341a((View) this.f5450u);
                }
                LayoutParams layoutParams9 = new LayoutParams(-1, (int) (124.0f * f));
                layoutParams9.addRule(12);
                RelativeLayout relativeLayout = new RelativeLayout(this.f5416d);
                C1808r.m8933a((View) relativeLayout, (Drawable) gradientDrawable);
                relativeLayout.setLayoutParams(layoutParams9);
                relativeLayout.setPadding(i9, 0, i9, i9);
                this.f5452w = relativeLayout;
                if (!this.f5435C) {
                    this.f5453x.mo7513a((View) relativeLayout, aVar);
                }
                m8341a((View) relativeLayout);
                if (this.f5446q != null) {
                    LayoutParams layoutParams10 = new LayoutParams((int) (110.0f * f), i8);
                    layoutParams10.rightMargin = i9;
                    layoutParams10.bottomMargin = i9;
                    layoutParams10.addRule(12);
                    layoutParams10.addRule(11);
                    this.f5446q.setLayoutParams(layoutParams10);
                    m8341a((View) this.f5446q);
                }
                if (this.f5449t != null) {
                    int i12 = (int) (64.0f * f);
                    LayoutParams layoutParams11 = new LayoutParams(i12, i12);
                    layoutParams11.addRule(12);
                    layoutParams11.addRule(9);
                    layoutParams11.bottomMargin = (int) (8.0f * f);
                    this.f5449t.setLayoutParams(layoutParams11);
                    m8342a(relativeLayout, this.f5449t);
                }
                if (this.f5447r != null) {
                    LayoutParams layoutParams12 = new LayoutParams(-1, -2);
                    layoutParams12.bottomMargin = (int) (48.0f * f);
                    layoutParams12.addRule(12);
                    layoutParams12.addRule(9);
                    this.f5447r.setEllipsize(TruncateAt.END);
                    this.f5447r.setGravity(8388611);
                    this.f5447r.setLayoutParams(layoutParams12);
                    this.f5447r.setMaxLines(1);
                    TextView textView = this.f5447r;
                    int i13 = (int) (f * 80.0f);
                    if (this.f5446q != null) {
                        i5 = (int) (126.0f * f);
                        i6 = 0;
                    } else {
                        i6 = 0;
                        i5 = 0;
                    }
                    textView.setPadding(i13, i6, i5, i6);
                    this.f5447r.setTextColor(-1);
                    this.f5447r.setTextSize(24.0f);
                    m8342a(relativeLayout, this.f5447r);
                }
                if (this.f5448s != null) {
                    LayoutParams layoutParams13 = new LayoutParams(-1, -2);
                    layoutParams13.addRule(12);
                    layoutParams13.addRule(9);
                    this.f5448s.setEllipsize(TruncateAt.END);
                    this.f5448s.setGravity(8388611);
                    this.f5448s.setLayoutParams(layoutParams13);
                    this.f5448s.setMaxLines(2);
                    this.f5448s.setTextColor(-1);
                    TextView textView2 = this.f5448s;
                    int i14 = (int) (f * 80.0f);
                    if (this.f5446q != null) {
                        i3 = (int) (126.0f * f);
                        i4 = 0;
                    } else {
                        i4 = 0;
                        i3 = 0;
                    }
                    textView2.setPadding(i14, i4, i3, i4);
                    m8342a(relativeLayout, this.f5448s);
                }
                if (this.f5451v != null) {
                    LayoutParams layoutParams14 = new LayoutParams(-1, (int) (f * 6.0f));
                    layoutParams14.addRule(12);
                    this.f5451v.setLayoutParams(layoutParams14);
                    m8341a((View) this.f5451v);
                }
                view = (View) this.f5414b.getParent();
                i2 = -16777216;
            } else {
                LayoutParams layoutParams15 = new LayoutParams(-2, -1);
                layoutParams15.addRule(9);
                this.f5414b.setLayoutParams(layoutParams15);
                m8341a((View) this.f5414b);
                m8341a((View) this.f5454y);
                if (this.f5450u != null) {
                    m8341a((View) this.f5450u);
                }
                LinearLayout linearLayout2 = new LinearLayout(this.f5416d);
                this.f5452w = linearLayout2;
                linearLayout2.setGravity(112);
                linearLayout2.setOrientation(1);
                LayoutParams layoutParams16 = new LayoutParams(-1, -1);
                layoutParams16.leftMargin = i9;
                layoutParams16.rightMargin = i9;
                layoutParams16.topMargin = (int) (8.0f * f);
                layoutParams16.bottomMargin = (int) (f * 80.0f);
                layoutParams16.addRule(1, id);
                linearLayout2.setLayoutParams(layoutParams16);
                m8341a((View) linearLayout2);
                if (this.f5451v != null) {
                    LayoutParams layoutParams17 = new LayoutParams(-1, (int) (f * 6.0f));
                    layoutParams17.addRule(5, id);
                    layoutParams17.addRule(7, id);
                    layoutParams17.addRule(3, id);
                    layoutParams17.topMargin = (int) (-6.0f * f);
                    this.f5451v.setLayoutParams(layoutParams17);
                    m8341a((View) this.f5451v);
                }
                if (this.f5447r != null) {
                    LinearLayout.LayoutParams layoutParams18 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams18.weight = 2.0f;
                    layoutParams18.gravity = 17;
                    this.f5447r.setEllipsize(TruncateAt.END);
                    this.f5447r.setGravity(17);
                    this.f5447r.setLayoutParams(layoutParams18);
                    this.f5447r.setMaxLines(10);
                    this.f5447r.setPadding(0, 0, 0, 0);
                    this.f5447r.setTextColor(this.f5433A);
                    this.f5447r.setTextSize(24.0f);
                    m8342a(linearLayout2, this.f5447r);
                }
                if (this.f5449t != null) {
                    int i15 = (int) (f * 64.0f);
                    LinearLayout.LayoutParams layoutParams19 = new LinearLayout.LayoutParams(i15, i15);
                    layoutParams19.weight = 0.0f;
                    layoutParams19.gravity = 17;
                    this.f5449t.setLayoutParams(layoutParams19);
                    m8342a(linearLayout2, this.f5449t);
                }
                if (this.f5448s != null) {
                    LinearLayout.LayoutParams layoutParams20 = new LinearLayout.LayoutParams(-1, -2);
                    layoutParams20.weight = 2.0f;
                    layoutParams20.gravity = 16;
                    this.f5448s.setEllipsize(TruncateAt.END);
                    this.f5448s.setGravity(17);
                    this.f5448s.setLayoutParams(layoutParams20);
                    this.f5448s.setMaxLines(10);
                    this.f5448s.setPadding(0, 0, 0, 0);
                    this.f5448s.setTextColor(this.f5433A);
                    m8342a(linearLayout2, this.f5448s);
                }
                if (this.f5446q != null) {
                    LayoutParams layoutParams21 = new LayoutParams(-1, (int) (f * 64.0f));
                    layoutParams21.bottomMargin = i9;
                    layoutParams21.leftMargin = i9;
                    layoutParams21.rightMargin = i9;
                    layoutParams21.addRule(1);
                    layoutParams21.addRule(12);
                    layoutParams21.addRule(1, id);
                    this.f5446q.setLayoutParams(layoutParams21);
                    view2 = this.f5446q;
                }
                view = (View) this.f5414b.getParent();
                i2 = this.f5455z;
            }
            m8341a(view2);
            view = (View) this.f5414b.getParent();
            i2 = this.f5455z;
        } else {
            GradientDrawable gradientDrawable2 = new GradientDrawable(Orientation.TOP_BOTTOM, new int[]{0, -15658735});
            gradientDrawable2.setCornerRadius(0.0f);
            LayoutParams layoutParams22 = new LayoutParams(-1, -2);
            layoutParams22.addRule(10);
            this.f5414b.setLayoutParams(layoutParams22);
            m8341a((View) this.f5414b);
            m8341a((View) this.f5454y);
            if (this.f5450u != null) {
                m8341a((View) this.f5450u);
            }
            LayoutParams layoutParams23 = new LayoutParams(-1, (int) (((float) ((this.f5446q != null ? 64 : 0) + 60 + 16 + 16 + 16)) * f));
            layoutParams23.addRule(12);
            RelativeLayout relativeLayout2 = new RelativeLayout(this.f5416d);
            C1808r.m8933a((View) relativeLayout2, (Drawable) gradientDrawable2);
            relativeLayout2.setLayoutParams(layoutParams23);
            relativeLayout2.setPadding(i9, 0, i9, (int) (((float) ((this.f5446q != null ? 64 : 0) + 16 + 16)) * f));
            this.f5452w = relativeLayout2;
            if (!this.f5435C) {
                this.f5453x.mo7513a((View) relativeLayout2, aVar);
            }
            m8341a((View) relativeLayout2);
            if (this.f5451v != null) {
                LayoutParams layoutParams24 = new LayoutParams(-1, (int) (6.0f * f));
                layoutParams24.addRule(12);
                layoutParams24.topMargin = (int) (-6.0f * f);
                this.f5451v.setLayoutParams(layoutParams24);
                m8341a((View) this.f5451v);
            }
            if (this.f5446q != null) {
                LayoutParams layoutParams25 = new LayoutParams(-1, (int) (64.0f * f));
                layoutParams25.bottomMargin = i9;
                layoutParams25.leftMargin = i9;
                layoutParams25.rightMargin = i9;
                layoutParams25.addRule(1);
                layoutParams25.addRule(12);
                this.f5446q.setLayoutParams(layoutParams25);
                m8341a((View) this.f5446q);
            }
            if (this.f5449t != null) {
                int i16 = (int) (60.0f * f);
                LayoutParams layoutParams26 = new LayoutParams(i16, i16);
                layoutParams26.addRule(12);
                layoutParams26.addRule(9);
                this.f5449t.setLayoutParams(layoutParams26);
                m8342a(relativeLayout2, this.f5449t);
            }
            if (this.f5447r != null) {
                LayoutParams layoutParams27 = new LayoutParams(-1, -2);
                layoutParams27.bottomMargin = (int) (36.0f * f);
                layoutParams27.addRule(12);
                layoutParams27.addRule(9);
                this.f5447r.setEllipsize(TruncateAt.END);
                this.f5447r.setGravity(8388611);
                this.f5447r.setLayoutParams(layoutParams27);
                this.f5447r.setMaxLines(1);
                this.f5447r.setPadding((int) (72.0f * f), 0, 0, 0);
                this.f5447r.setTextColor(-1);
                this.f5447r.setTextSize(18.0f);
                m8342a(relativeLayout2, this.f5447r);
            }
            if (this.f5448s != null) {
                LayoutParams layoutParams28 = new LayoutParams(-1, -2);
                layoutParams28.addRule(12);
                layoutParams28.addRule(9);
                layoutParams28.bottomMargin = (int) (4.0f * f);
                this.f5448s.setEllipsize(TruncateAt.END);
                this.f5448s.setGravity(8388611);
                this.f5448s.setLayoutParams(layoutParams28);
                this.f5448s.setMaxLines(1);
                this.f5448s.setPadding((int) (f * 72.0f), 0, 0, 0);
                this.f5448s.setTextColor(-1);
                m8342a(relativeLayout2, this.f5448s);
            }
            view = (View) this.f5414b.getParent();
            i2 = -16777216;
        }
        C1808r.m8932a(view, i2);
        View rootView = this.f5414b.getRootView();
        if (rootView != null) {
            rootView.setOnTouchListener(this);
        }
    }

    /* renamed from: a */
    private void m8341a(View view) {
        if (this.f5440k != null) {
            this.f5440k.mo6643a(view);
        }
    }

    /* renamed from: a */
    private void m8342a(ViewGroup viewGroup, View view) {
        if (viewGroup != null) {
            viewGroup.addView(view);
        }
    }

    /* renamed from: b */
    private void m8344b(View view) {
        if (view != null) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(view);
            }
        }
    }

    /* renamed from: e */
    private boolean m8345e() {
        return ((double) (this.f5414b.getVideoHeight() > 0 ? ((float) this.f5414b.getVideoWidth()) / ((float) this.f5414b.getVideoHeight()) : -1.0f)) <= 0.9d;
    }

    /* renamed from: f */
    private boolean m8346f() {
        boolean z = false;
        if (this.f5414b.getVideoHeight() <= 0) {
            return false;
        }
        Rect rect = new Rect();
        this.f5441l.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        if (rect.width() > rect.height()) {
            if (((float) (rect.width() - ((rect.height() * this.f5414b.getVideoWidth()) / this.f5414b.getVideoHeight()))) - (C1808r.f5899b * 192.0f) < 0.0f) {
                z = true;
            }
            return z;
        }
        if (((((float) (rect.height() - ((rect.width() * this.f5414b.getVideoHeight()) / this.f5414b.getVideoWidth()))) - (C1808r.f5899b * 64.0f)) - (C1808r.f5899b * 64.0f)) - (C1808r.f5899b * 40.0f) < 0.0f) {
            z = true;
        }
        return z;
    }

    /* renamed from: g */
    private boolean m8347g() {
        double videoWidth = (double) (this.f5414b.getVideoHeight() > 0 ? ((float) this.f5414b.getVideoWidth()) / ((float) this.f5414b.getVideoHeight()) : -1.0f);
        return videoWidth > 0.9d && videoWidth < 1.1d;
    }

    /* renamed from: h */
    private void m8348h() {
        m8344b((View) this.f5414b);
        m8344b((View) this.f5446q);
        m8344b((View) this.f5447r);
        m8344b((View) this.f5448s);
        m8344b((View) this.f5449t);
        m8344b((View) this.f5451v);
        m8344b((View) this.f5452w);
        m8344b((View) this.f5454y);
        if (this.f5450u != null) {
            m8344b((View) this.f5450u);
        }
    }

    /* renamed from: a */
    public void mo6761a() {
        if (!(this.f5415c == null || this.f5413a == null)) {
            String optString = this.f5415c.optString("ct");
            if (!TextUtils.isEmpty(optString)) {
                this.f5413a.mo6946g(optString, new HashMap());
            }
        }
        if (this.f5414b != null) {
            this.f5414b.mo7429e();
        }
        C1670h.m8373a((C1844a) this);
    }

    @TargetApi(17)
    /* renamed from: a */
    public void mo6770a(Intent intent, Bundle bundle, AudienceNetworkActivity audienceNetworkActivity) {
        this.f5441l = audienceNetworkActivity;
        if (f5431i || this.f5440k != null) {
            audienceNetworkActivity.mo6631a(this.f5442m);
            m8348h();
            m8340a(this.f5441l.getResources().getConfiguration().orientation);
            if (mo6775d()) {
                mo6762b();
            } else {
                mo6763c();
            }
        } else {
            throw new AssertionError();
        }
    }

    /* renamed from: a */
    public void mo6771a(Configuration configuration) {
        m8348h();
        m8340a(configuration.orientation);
    }

    /* renamed from: a */
    public void mo6772a(Bundle bundle) {
    }

    /* renamed from: a */
    public void mo6773a(boolean z) {
        if (this.f5414b != null && this.f5414b.getState() == C2101d.STARTED) {
            this.f5436D = this.f5414b.getVideoStartReason();
            this.f5414b.mo7425a(false);
        }
    }

    /* renamed from: b */
    public void mo6774b(boolean z) {
        if (this.f5414b != null && this.f5436D != null) {
            this.f5414b.mo7422a(this.f5436D);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo6775d() {
        if (f5431i || this.f5415c != null) {
            try {
                return this.f5415c.getJSONObject("video").getBoolean("autoplay");
            } catch (Exception e) {
                Log.w(String.valueOf(C1663d.class), "Invalid JSON", e);
                return true;
            }
        } else {
            throw new AssertionError();
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        this.f5445p.mo7069a(motionEvent, view.getRootView(), view);
        if (this.f5414b != null) {
            this.f5414b.getEventBus().mo6905a(new C2035t(view, motionEvent));
        }
        return true;
    }

    public void setListener(C1845a aVar) {
        this.f5440k = aVar;
    }
}
