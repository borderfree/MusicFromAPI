package com.facebook.ads.internal.view;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.internal.adapters.p059a.C1640a;
import com.facebook.ads.internal.adapters.p059a.C1647d;
import com.facebook.ads.internal.adapters.p059a.C1650g;
import com.facebook.ads.internal.adapters.p059a.C1651h;
import com.facebook.ads.internal.p061c.C1678a;
import com.facebook.ads.internal.p072o.C1728c;
import com.facebook.ads.internal.p077s.p078a.C1808r;
import com.facebook.ads.internal.p077s.p078a.C1810t;
import com.facebook.ads.internal.p077s.p078a.C1810t.C1813a;
import com.facebook.ads.internal.view.C1844a.C1845a;
import com.facebook.ads.internal.view.C1964f.C1973a;
import com.facebook.ads.internal.view.C1964f.C1974b;

/* renamed from: com.facebook.ads.internal.view.h */
public abstract class C2104h extends RelativeLayout implements C1844a {

    /* renamed from: a */
    protected static final int f6890a = ((int) (C1808r.f5899b * 56.0f));
    /* access modifiers changed from: protected */

    /* renamed from: b */
    public final C1728c f6891b;

    /* renamed from: c */
    protected final C1964f f6892c = new C1964f(getContext(), getAudienceNetworkListener(), C1973a.CROSS);

    /* renamed from: d */
    protected C1640a f6893d;

    /* renamed from: e */
    private final C1845a f6894e;

    /* renamed from: f */
    private final C1810t f6895f = new C1810t(this);

    protected C2104h(Context context, C1728c cVar, C1845a aVar) {
        super(context.getApplicationContext());
        this.f6891b = cVar;
        this.f6894e = aVar;
    }

    /* renamed from: b */
    private void mo7352b() {
        removeAllViews();
        C1808r.m8940b(this);
    }

    /* renamed from: a */
    public void mo6761a() {
        this.f6895f.mo7073a();
        this.f6892c.setToolbarListener(null);
        mo7352b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7642a(View view, boolean z, int i) {
        int d;
        C1964f fVar;
        C1647d b;
        this.f6895f.mo7075a(C1813a.DEFAULT);
        mo7352b();
        LayoutParams layoutParams = new LayoutParams(-1, -1);
        layoutParams.setMargins(0, z ? 0 : f6890a, 0, 0);
        addView(view, layoutParams);
        LayoutParams layoutParams2 = new LayoutParams(-1, f6890a);
        layoutParams2.addRule(10);
        if (i == 1) {
            d = this.f6893d.mo6676a().mo6709d(z);
            fVar = this.f6892c;
            b = this.f6893d.mo6676a();
        } else {
            d = this.f6893d.mo6677b().mo6709d(z);
            fVar = this.f6892c;
            b = this.f6893d.mo6677b();
        }
        fVar.mo7377a(b, z);
        addView(this.f6892c, layoutParams2);
        C1808r.m8932a((View) this, d);
        if (this.f6894e != null) {
            this.f6894e.mo6644a((View) this, 0);
            if (z && VERSION.SDK_INT >= 19) {
                this.f6895f.mo7075a(C1813a.FULL_SCREEN);
            }
        }
    }

    /* renamed from: a */
    public void mo7643a(final AudienceNetworkActivity audienceNetworkActivity, C1650g gVar) {
        this.f6895f.mo7074a(audienceNetworkActivity.getWindow());
        this.f6893d = gVar.mo6722b();
        this.f6892c.mo7379a(gVar.mo6720a(), gVar.mo6723c(), ((C1651h) gVar.mo6724d().get(0)).mo6731c().mo6681c());
        this.f6892c.setToolbarListener(new C1974b() {
            /* renamed from: a */
            public void mo7367a() {
                audienceNetworkActivity.finish();
            }
        });
        if (C1678a.m8407b(getContext())) {
            this.f6892c.mo7378a(gVar.mo6720a(), gVar.mo6723c());
        }
    }

    /* access modifiers changed from: protected */
    public C1845a getAudienceNetworkListener() {
        return this.f6894e;
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        this.f6892c.mo7386d();
        super.onConfigurationChanged(configuration);
        final ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        viewTreeObserver.addOnGlobalLayoutListener(new OnGlobalLayoutListener() {
            public void onGlobalLayout() {
                C2104h.this.f6892c.mo7387e();
                if (VERSION.SDK_INT >= 14) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                }
            }
        });
    }

    public void setListener(C1845a aVar) {
    }
}
