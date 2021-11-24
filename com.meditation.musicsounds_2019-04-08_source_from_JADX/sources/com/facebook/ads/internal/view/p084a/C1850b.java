package com.facebook.ads.internal.view.p084a;

import android.content.Context;
import android.net.Uri;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.transition.ChangeBounds;
import android.transition.Explode;
import android.transition.Transition;
import android.transition.TransitionSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.facebook.ads.internal.p061c.C1678a;
import com.facebook.ads.internal.p061c.C1679b;
import com.facebook.ads.internal.p061c.C1679b.C1680a;
import com.facebook.ads.internal.p061c.C1681c;
import com.facebook.ads.internal.p072o.C1728c;
import com.facebook.ads.internal.p077s.p078a.C1808r;
import com.facebook.ads.internal.p077s.p079b.C1817b;
import com.facebook.ads.internal.p077s.p080c.C1830g;
import com.facebook.ads.internal.view.C1844a;
import com.facebook.ads.internal.view.C1844a.C1845a;
import com.facebook.ads.internal.view.p084a.C1846a.C1849a;

/* renamed from: com.facebook.ads.internal.view.a.b */
public class C1850b extends RelativeLayout {

    /* renamed from: a */
    private static final int f6090a = ((int) (C1808r.f5899b * 8.0f));

    /* renamed from: b */
    private final C1728c f6091b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C1844a f6092c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C1845a f6093d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final String f6094e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C1679b f6095f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public int f6096g = 0;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C1680a f6097h = C1680a.NONE;

    /* renamed from: i */
    private final C1856c f6098i = new C1856c() {
        /* renamed from: a */
        public void mo7131a() {
            C1850b.this.f6093d.mo6645a("com.facebook.ads.adreporting.FINISH_AD_REPORTING_FLOW");
        }

        /* renamed from: a */
        public void mo7132a(C1681c cVar) {
            C1850b.this.f6096g = C1850b.this.f6096g - 1;
            if (cVar.mo6827e() == null) {
                C1850b.this.m9091e();
            } else {
                C1850b.this.m9081a(cVar.mo6827e());
            }
        }

        /* renamed from: b */
        public void mo7133b() {
            if (!TextUtils.isEmpty(C1678a.m8420o(C1850b.this.getContext()))) {
                C1830g.m8990a(new C1830g(), C1850b.this.getContext(), Uri.parse(C1678a.m8420o(C1850b.this.getContext())), C1850b.this.f6094e);
            }
            C1850b.this.f6095f.mo6817c();
        }

        /* renamed from: b */
        public void mo7134b(C1681c cVar) {
            C1850b.this.f6096g = C1850b.this.f6096g + 1;
            C1850b.this.f6095f.mo6813a(cVar.mo6822a());
            if (cVar.mo6826d().isEmpty()) {
                C1850b.this.m9083b(cVar);
            } else {
                C1850b.this.m9081a(cVar);
            }
        }
    };

    public C1850b(Context context, C1728c cVar, C1844a aVar, C1845a aVar2, String str) {
        super(context);
        this.f6091b = cVar;
        this.f6092c = aVar;
        this.f6093d = aVar2;
        this.f6094e = str;
        C1808r.m8932a((View) this, -1728053248);
        setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                C1850b.this.m9089d();
                C1850b.this.f6092c.mo6774b(true);
                C1850b.this.m9087c();
            }
        });
    }

    /* renamed from: a */
    private static LayoutParams m9079a(boolean z) {
        LayoutParams layoutParams = new LayoutParams(-1, z ? -1 : -2);
        layoutParams.addRule(12);
        return layoutParams;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m9081a(C1681c cVar) {
        this.f6095f.mo6815a(this.f6097h, this.f6096g);
        boolean z = this.f6097h == C1680a.REPORT;
        C1859f fVar = new C1859f(getContext(), cVar, this.f6098i, z ? C1678a.m8411f(getContext()) : C1678a.m8408c(getContext()), z ? C1817b.REPORT_AD : C1817b.HIDE_AD);
        fVar.setClickable(true);
        C1808r.m8932a((View) fVar, -1);
        fVar.setPadding(f6090a * 2, f6090a, f6090a * 2, f6090a);
        m9093f();
        removeAllViews();
        addView(fVar, m9079a(false));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m9083b(C1681c cVar) {
        if (this.f6097h != C1680a.NONE) {
            this.f6095f.mo6814a(this.f6097h);
            boolean z = this.f6097h == C1680a.REPORT;
            C1846a a = new C1849a(getContext(), this.f6098i).mo7125a(z ? C1678a.m8416k(getContext()) : C1678a.m8415j(getContext())).mo7127b(C1678a.m8417l(getContext())).mo7128c(cVar.mo6824b()).mo7124a(z ? C1817b.REPORT_AD : C1817b.HIDE_AD).mo7123a(z ? -552389 : -13272859).mo7126a();
            C1808r.m8934a((ViewGroup) this);
            removeAllViews();
            addView(a, m9079a(true));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m9087c() {
        if (this.f6095f.mo6819e()) {
            this.f6091b.mo6948i(this.f6094e, this.f6095f.mo6818d());
            this.f6095f.mo6820f();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m9089d() {
        C1808r.m8941c(this);
        removeAllViews();
        C1808r.m8940b(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m9091e() {
        this.f6095f.mo6812a();
        final C1681c e = C1678a.m8410e(getContext());
        C1858e eVar = new C1858e(getContext());
        eVar.mo7140a(C1817b.HIDE_AD, C1678a.m8408c(getContext()), C1678a.m8409d(getContext()));
        eVar.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                C1850b.this.f6097h = C1680a.HIDE;
                C1850b.this.f6096g = C1850b.this.f6096g + 1;
                C1850b.this.m9081a(e);
            }
        });
        final C1681c h = C1678a.m8413h(getContext());
        C1858e eVar2 = new C1858e(getContext());
        eVar2.mo7140a(C1817b.REPORT_AD, C1678a.m8411f(getContext()), C1678a.m8412g(getContext()));
        eVar2.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                C1850b.this.f6097h = C1680a.REPORT;
                C1850b.this.f6096g = C1850b.this.f6096g + 1;
                C1850b.this.m9081a(h);
            }
        });
        C1858e eVar3 = new C1858e(getContext());
        eVar3.mo7140a(C1817b.INTERSTITIAL_AD_CHOICES, C1678a.m8418m(getContext()), "");
        eVar3.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                C1850b.this.m9089d();
                C1850b.this.f6092c.mo6774b(true);
                if (!TextUtils.isEmpty(C1678a.m8419n(C1850b.this.getContext()))) {
                    C1830g.m8990a(new C1830g(), C1850b.this.getContext(), Uri.parse(C1678a.m8419n(C1850b.this.getContext())), C1850b.this.f6094e);
                }
                C1850b.this.f6095f.mo6816b();
                C1850b.this.m9087c();
            }
        });
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setClickable(true);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(f6090a * 2, f6090a, f6090a * 2, f6090a);
        C1808r.m8932a((View) linearLayout, -1);
        if (e.mo6826d().size() > 0) {
            linearLayout.addView(eVar, layoutParams);
        }
        if (h.mo6826d().size() > 0) {
            linearLayout.addView(eVar2, layoutParams);
        }
        linearLayout.addView(eVar3, layoutParams);
        m9093f();
        removeAllViews();
        addView(linearLayout, m9079a(false));
    }

    /* renamed from: f */
    private void m9093f() {
        if (VERSION.SDK_INT >= 21) {
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.setOrdering(0);
            transitionSet.addTransition(new ChangeBounds()).addTransition(new Explode());
            C1808r.m8936a((ViewGroup) this, (Transition) transitionSet);
            return;
        }
        C1808r.m8934a((ViewGroup) this);
    }

    /* renamed from: a */
    public void mo7129a() {
        this.f6095f = new C1679b();
        this.f6092c.mo6773a(true);
        m9091e();
    }

    /* renamed from: b */
    public void mo7130b() {
        m9087c();
    }
}
