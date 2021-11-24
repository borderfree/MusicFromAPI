package com.facebook.ads.internal.view.p091e;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.WebResourceError;
import android.webkit.WebSettings;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import android.widget.Toast;
import com.facebook.ads.internal.adapters.p059a.C1640a;
import com.facebook.ads.internal.adapters.p059a.C1655j;
import com.facebook.ads.internal.adapters.p059a.C1656k;
import com.facebook.ads.internal.p072o.C1728c;
import com.facebook.ads.internal.p077s.p078a.C1792f;
import com.facebook.ads.internal.p077s.p078a.C1792f.C1794a;
import com.facebook.ads.internal.p077s.p078a.C1800k;
import com.facebook.ads.internal.p077s.p078a.C1806p;
import com.facebook.ads.internal.p077s.p078a.C1808r;
import com.facebook.ads.internal.p083t.C1838a;
import com.facebook.ads.internal.view.C1844a.C1845a;
import com.facebook.ads.internal.view.C1964f;
import com.facebook.ads.internal.view.C1964f.C1973a;
import com.facebook.ads.internal.view.C1964f.C1974b;
import com.facebook.ads.internal.view.component.C1922b;
import com.facebook.ads.internal.view.component.C1926f;
import com.facebook.ads.internal.view.p086c.C1883a;
import com.facebook.ads.internal.view.p086c.C1883a.C1886b;
import com.facebook.ads.internal.view.p086c.C1883a.C1887c;
import com.facebook.ads.internal.view.p086c.C1883a.C1888d;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.internal.view.e.b */
public class C1955b extends RelativeLayout implements C1794a, C1888d {

    /* renamed from: a */
    private static final int f6477a = ((int) (C1808r.f5899b * 64.0f));

    /* renamed from: b */
    private static final LayoutParams f6478b = new LayoutParams(-1, -1);

    /* renamed from: c */
    private static final int f6479c = ((int) (C1808r.f5899b * 16.0f));

    /* renamed from: d */
    private static final int f6480d = ((int) (C1808r.f5899b * 12.0f));

    /* renamed from: e */
    private static final int f6481e = ((int) (C1808r.f5899b * 10.0f));

    /* renamed from: f */
    private static final float f6482f = ((float) ((int) (C1808r.f5899b * 4.0f)));

    /* renamed from: g */
    private final C1656k f6483g;

    /* renamed from: h */
    private final C1655j f6484h;

    /* renamed from: i */
    private final C1640a f6485i;

    /* renamed from: j */
    private final C1728c f6486j;

    /* renamed from: k */
    private final C1964f f6487k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final AtomicBoolean f6488l = new AtomicBoolean();
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final C1792f f6489m;

    /* renamed from: n */
    private final C1792f f6490n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public WeakReference<C1883a> f6491o;

    /* renamed from: p */
    private C1886b f6492p;

    /* renamed from: q */
    private C1922b f6493q;

    /* renamed from: r */
    private C1952a f6494r;

    /* renamed from: s */
    private RelativeLayout f6495s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public boolean f6496t;

    /* renamed from: u */
    private Toast f6497u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public C1962c f6498v;

    /* renamed from: com.facebook.ads.internal.view.e.b$a */
    private static class C1960a implements OnClickListener {

        /* renamed from: a */
        final WeakReference<C1955b> f6503a;

        C1960a(C1955b bVar) {
            this.f6503a = new WeakReference<>(bVar);
        }

        public void onClick(View view) {
            if (this.f6503a.get() != null) {
                ((C1955b) this.f6503a.get()).m9438m();
            }
        }
    }

    /* renamed from: com.facebook.ads.internal.view.e.b$b */
    private static class C1961b implements OnTouchListener {

        /* renamed from: a */
        final WeakReference<C1883a> f6504a;

        /* renamed from: b */
        final C1728c f6505b;

        /* renamed from: c */
        final C1656k f6506c;

        private C1961b(C1883a aVar, C1728c cVar, C1656k kVar) {
            this.f6504a = new WeakReference<>(aVar);
            this.f6505b = cVar;
            this.f6506c = kVar;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (this.f6504a.get() != null && motionEvent.getAction() == 1) {
                HashMap hashMap = new HashMap();
                ((C1883a) this.f6504a.get()).getViewabilityChecker().mo7108a((Map<String, String>) hashMap);
                hashMap.put("touch", C1800k.m8915a(((C1883a) this.f6504a.get()).getTouchDataRecorder().mo7071c()));
                this.f6505b.mo6942c(this.f6506c.mo6757g(), hashMap);
            }
            return false;
        }
    }

    /* renamed from: com.facebook.ads.internal.view.e.b$c */
    public interface C1962c {
        /* renamed from: a */
        void mo7371a(C1838a aVar, C1806p pVar);

        /* renamed from: b */
        void mo7372b();

        /* renamed from: c */
        void mo7373c();

        /* renamed from: c */
        void mo7374c(boolean z);

        /* renamed from: d */
        void mo7375d();
    }

    /* renamed from: com.facebook.ads.internal.view.e.b$d */
    private class C1963d {
        private C1963d() {
        }

        @JavascriptInterface
        public void onCTAClick() {
            C1955b.this.m9438m();
        }
    }

    public C1955b(Context context, C1656k kVar, C1728c cVar, C1845a aVar, C1962c cVar2, boolean z) {
        super(context);
        int i = 0;
        this.f6496t = false;
        this.f6483g = kVar;
        this.f6484h = kVar.mo6755e().mo6688j();
        this.f6485i = kVar.mo6754d();
        this.f6486j = cVar;
        this.f6498v = cVar2;
        this.f6487k = new C1964f(context, aVar, C1973a.CROSS);
        this.f6489m = new C1792f(z ? this.f6484h.mo6743c() : 0, this);
        if (this.f6484h.mo6746f()) {
            i = 3;
        }
        this.f6490n = new C1792f(i, new C1794a() {
            /* renamed from: a */
            public void mo7063a() {
                C1955b.this.m9433h();
            }

            /* renamed from: a */
            public void mo7064a(int i) {
            }
        });
        m9431g();
    }

    /* renamed from: a */
    private static TextView m9421a(ViewGroup viewGroup) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof TextView) {
                return (TextView) childAt;
            }
            if (childAt instanceof ViewGroup) {
                m9421a((ViewGroup) childAt);
            }
        }
        return null;
    }

    /* renamed from: a */
    private C1926f m9422a(C1922b bVar) {
        C1926f fVar = new C1926f(getContext(), this.f6483g.mo6754d().mo6676a(), true, 16, 14, 0);
        C1808r.m8931a((View) fVar);
        fVar.mo7322a(this.f6483g.mo6751b().mo6699a(), this.f6483g.mo6751b().mo6700b(), false, true);
        fVar.getDescriptionTextView().setAlpha(0.8f);
        LayoutParams layoutParams = new LayoutParams(-1, -2);
        layoutParams.addRule(0, bVar.getId());
        layoutParams.setMargins(0, 0, f6479c, 0);
        fVar.setLayoutParams(layoutParams);
        return fVar;
    }

    /* renamed from: b */
    private void m9426b(int i) {
        if (this.f6497u != null) {
            this.f6497u.setGravity(49, 0, f6477a);
            String valueOf = String.valueOf(i);
            TextView a = m9421a((ViewGroup) this.f6497u.getView());
            if (a != null) {
                a.setText(this.f6484h.mo6745e().replace("[secs]", valueOf));
                a.setGravity(17);
            }
        }
    }

    /* renamed from: g */
    private void m9431g() {
        this.f6487k.mo7377a(this.f6485i.mo6676a(), true);
        this.f6487k.setShowPageDetails(false);
        this.f6487k.mo7379a(this.f6483g.mo6748a(), this.f6483g.mo6757g(), this.f6484h.mo6743c());
        this.f6487k.setToolbarListener(new C1974b() {
            /* renamed from: a */
            public void mo7367a() {
                if (C1955b.this.f6498v != null) {
                    C1955b.this.f6498v.mo7373c();
                }
            }
        });
        C1808r.m8931a((View) this.f6487k);
        LayoutParams layoutParams = new LayoutParams(-1, -2);
        layoutParams.addRule(10);
        this.f6487k.setLayoutParams(layoutParams);
        this.f6494r = new C1952a(getContext(), this.f6483g);
        setLayoutParams(f6478b);
        C1808r.m8932a((View) this, this.f6485i.mo6676a().mo6709d(true));
        addView(this.f6494r, f6478b);
        C1808r.m8932a((View) this, -14473425);
        setLayoutParams(f6478b);
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m9433h() {
        this.f6495s = new RelativeLayout(getContext());
        C1808r.m8931a((View) this.f6495s);
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.setMargins(f6479c, f6480d, f6479c, f6480d);
        layoutParams.addRule(12);
        this.f6495s.setLayoutParams(layoutParams);
        this.f6493q = m9434i();
        C1926f a = m9422a(this.f6493q);
        LayoutParams layoutParams2 = (LayoutParams) this.f6493q.getLayoutParams();
        layoutParams2.addRule(6, a.getId());
        layoutParams2.addRule(8, a.getId());
        C1883a j = m9435j();
        j.loadUrl(this.f6484h.mo6741a());
        j.setOnTouchListener(new C1961b(j, this.f6486j, this.f6483g));
        j.addJavascriptInterface(new C1963d(), "FbPlayableAd");
        j.setCornerRadius(f6482f);
        C1808r.m8932a((View) this, -14473425);
        LayoutParams layoutParams3 = new LayoutParams(-1, -1);
        layoutParams3.setMargins(f6479c, 0, f6479c, 0);
        layoutParams3.addRule(3, this.f6487k.getId());
        layoutParams3.addRule(2, this.f6495s.getId());
        j.setLayoutParams(layoutParams3);
        j.setVisibility(4);
        j.setOnAssetsLoadedListener(this);
        this.f6495s.addView(a);
        this.f6495s.addView(this.f6493q);
        addView(this.f6487k);
        addView(j);
        addView(this.f6495s);
        this.f6487k.setVisibility(4);
        j.setVisibility(4);
        j.setTranslationY(50.0f);
        this.f6495s.setVisibility(4);
        this.f6495s.setTranslationY(200.0f);
    }

    /* renamed from: i */
    private C1922b m9434i() {
        C1922b bVar = new C1922b(getContext(), true, false, this.f6485i.mo6676a());
        bVar.setButtonColor(452984831);
        bVar.setText(this.f6483g.mo6753c().mo6714b());
        bVar.getBackground().setAlpha(0);
        C1808r.m8931a((View) bVar);
        bVar.setOnClickListener(new C1960a(this));
        bVar.setTextSize(14.0f);
        bVar.setIncludeFontPadding(false);
        bVar.setPadding(f6481e, f6481e, f6481e, f6481e);
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.addRule(11);
        bVar.setLayoutParams(layoutParams);
        bVar.setVisibility(4);
        return bVar;
    }

    /* renamed from: j */
    private C1883a m9435j() {
        this.f6492p = new C1887c() {
            /* renamed from: a */
            public void mo7210a(WebResourceError webResourceError) {
                C1955b.this.f6496t = true;
                if (C1955b.this.f6491o.get() != null) {
                    ((C1883a) C1955b.this.f6491o.get()).setVisibility(4);
                }
                if (C1955b.this.f6498v != null) {
                    C1955b.this.f6498v.mo7375d();
                }
            }

            /* renamed from: b */
            public void mo7212b() {
                if (C1955b.this.f6488l.compareAndSet(false, true) && C1955b.this.f6491o.get() != null && C1955b.this.f6498v != null) {
                    C1883a aVar = (C1883a) C1955b.this.f6491o.get();
                    C1955b.this.f6498v.mo7371a(aVar.getViewabilityChecker(), aVar.getTouchDataRecorder());
                    C1955b.this.f6489m.mo7057a();
                }
            }
        };
        C1883a aVar = new C1883a(getContext(), new WeakReference(this.f6492p), 10);
        aVar.setLogMultipleImpressions(false);
        aVar.setWaitForAssetsToLoad(true);
        aVar.setCheckAssetsByJavascriptBridge(false);
        WebSettings settings = aVar.getSettings();
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        this.f6491o = new WeakReference<>(aVar);
        return aVar;
    }

    /* renamed from: k */
    private void m9436k() {
        C1883a adWebView = getAdWebView();
        if (adWebView != null) {
            C1808r.m8934a((ViewGroup) this);
            adWebView.setVisibility(0);
            C1808r.m8940b(this.f6494r);
            this.f6487k.setVisibility(0);
            this.f6495s.setVisibility(0);
            adWebView.animate().setStartDelay(100).setDuration(300).translationYBy(-50.0f);
            this.f6495s.animate().setStartDelay(100).setDuration(300).translationYBy(-200.0f);
        }
    }

    /* renamed from: l */
    private void m9437l() {
        C1808r.m8935a((ViewGroup) this, 500);
        this.f6493q.setVisibility(0);
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public void m9438m() {
        if (this.f6498v != null) {
            this.f6498v.mo7374c(!this.f6489m.mo7060d());
        }
        if (!this.f6489m.mo7060d()) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public void run() {
                    C1955b.this.m9439n();
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public void m9439n() {
        if (this.f6497u == null || this.f6497u.getView().getWindowVisibility() != 0) {
            this.f6497u = Toast.makeText(getContext(), this.f6484h.mo6745e(), 1);
            m9426b(this.f6489m.mo7061e());
            this.f6497u.show();
        }
    }

    /* renamed from: a */
    public void mo7063a() {
        if (this.f6498v != null) {
            this.f6498v.mo7372b();
        }
        this.f6487k.mo7381a(true);
        m9437l();
    }

    /* renamed from: a */
    public void mo7064a(int i) {
        this.f6487k.setProgress((1.0f - (((float) i) / ((float) this.f6484h.mo6743c()))) * 100.0f);
        m9426b(i);
    }

    /* renamed from: b */
    public void mo7213b() {
        if (!this.f6496t && this.f6491o.get() != null) {
            m9436k();
        }
    }

    /* renamed from: c */
    public void mo7362c() {
        if (this.f6484h.mo6746f()) {
            this.f6490n.mo7057a();
            return;
        }
        removeAllViews();
        m9433h();
    }

    /* renamed from: d */
    public void mo7363d() {
        C1792f fVar;
        if (!this.f6490n.mo7060d()) {
            fVar = this.f6490n;
        } else if (!this.f6489m.mo7059c()) {
            fVar = this.f6489m;
        } else {
            return;
        }
        fVar.mo7057a();
    }

    /* renamed from: e */
    public void mo7364e() {
        this.f6490n.mo7058b();
        this.f6489m.mo7058b();
    }

    /* renamed from: f */
    public void mo7365f() {
        this.f6490n.mo7058b();
        this.f6489m.mo7058b();
        this.f6487k.setToolbarListener(null);
        C1883a aVar = this.f6491o != null ? (C1883a) this.f6491o.get() : null;
        if (aVar != null) {
            aVar.removeJavascriptInterface("FbPlayableAd");
        }
        this.f6498v = null;
        this.f6497u = null;
    }

    public C1883a getAdWebView() {
        if (this.f6491o != null) {
            return (C1883a) this.f6491o.get();
        }
        return null;
    }
}
