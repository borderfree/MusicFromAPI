package com.facebook.ads.internal.view;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout.LayoutParams;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.AudienceNetworkActivity.C1619a;
import com.facebook.ads.internal.p072o.C1728c;
import com.facebook.ads.internal.p077s.p078a.C1808r;
import com.facebook.ads.internal.p077s.p080c.C1824b;
import com.facebook.ads.internal.view.C1844a.C1845a;
import com.facebook.ads.internal.view.p085b.C1867a;
import com.facebook.ads.internal.view.p085b.C1867a.C1871a;
import com.facebook.ads.internal.view.p085b.C1872b;
import com.facebook.ads.internal.view.p085b.C1873c.C1875a;
import com.facebook.ads.internal.view.p085b.C1878f;
import com.facebook.ads.internal.view.p085b.C1878f.C1879a;

@TargetApi(19)
/* renamed from: com.facebook.ads.internal.view.b */
public class C1863b implements C1844a {

    /* renamed from: a */
    private static final String f6127a = "b";

    /* renamed from: b */
    private final AudienceNetworkActivity f6128b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C1867a f6129c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C1878f f6130d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C1872b f6131e;

    /* renamed from: f */
    private final C1728c f6132f;

    /* renamed from: g */
    private final C1619a f6133g = new C1619a() {
        /* renamed from: a */
        public boolean mo6642a() {
            if (!C1863b.this.f6130d.canGoBack()) {
                return false;
            }
            C1863b.this.f6130d.goBack();
            return true;
        }
    };

    /* renamed from: h */
    private String f6134h;

    /* renamed from: i */
    private String f6135i;

    /* renamed from: j */
    private long f6136j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f6137k = true;

    /* renamed from: l */
    private long f6138l = -1;

    /* renamed from: m */
    private boolean f6139m = true;

    public C1863b(final AudienceNetworkActivity audienceNetworkActivity, C1728c cVar, C1845a aVar) {
        this.f6128b = audienceNetworkActivity;
        this.f6132f = cVar;
        int i = (int) (C1808r.f5899b * 2.0f);
        this.f6129c = new C1867a(audienceNetworkActivity);
        this.f6129c.setId(View.generateViewId());
        LayoutParams layoutParams = new LayoutParams(-1, -2);
        layoutParams.addRule(10);
        this.f6129c.setLayoutParams(layoutParams);
        this.f6129c.setListener(new C1871a() {
            /* renamed from: a */
            public void mo7145a() {
                audienceNetworkActivity.finish();
            }
        });
        aVar.mo6643a((View) this.f6129c);
        this.f6130d = new C1878f(audienceNetworkActivity);
        LayoutParams layoutParams2 = new LayoutParams(-1, -2);
        layoutParams2.addRule(3, this.f6129c.getId());
        layoutParams2.addRule(12);
        this.f6130d.setLayoutParams(layoutParams2);
        this.f6130d.setListener(new C1879a() {
            /* renamed from: a */
            public void mo7146a(int i) {
                if (C1863b.this.f6137k) {
                    C1863b.this.f6131e.setProgress(i);
                }
            }

            /* renamed from: a */
            public void mo7147a(String str) {
                C1863b.this.f6137k = true;
                C1863b.this.f6129c.setUrl(str);
            }

            /* renamed from: b */
            public void mo7148b(String str) {
                C1863b.this.f6129c.setTitle(str);
            }

            /* renamed from: c */
            public void mo7149c(String str) {
                C1863b.this.f6131e.setProgress(100);
                C1863b.this.f6137k = false;
            }
        });
        aVar.mo6643a((View) this.f6130d);
        this.f6131e = new C1872b(audienceNetworkActivity, null, 16842872);
        LayoutParams layoutParams3 = new LayoutParams(-1, i);
        layoutParams3.addRule(3, this.f6129c.getId());
        this.f6131e.setLayoutParams(layoutParams3);
        this.f6131e.setProgress(0);
        aVar.mo6643a((View) this.f6131e);
        audienceNetworkActivity.mo6631a(this.f6133g);
    }

    /* renamed from: a */
    public void mo6761a() {
        this.f6128b.mo6632b(this.f6133g);
        C1824b.m8969a(this.f6130d);
        this.f6130d.destroy();
    }

    /* renamed from: a */
    public void mo6770a(Intent intent, Bundle bundle, AudienceNetworkActivity audienceNetworkActivity) {
        long j;
        if (this.f6138l < 0) {
            this.f6138l = System.currentTimeMillis();
        }
        if (bundle == null) {
            this.f6134h = intent.getStringExtra("browserURL");
            this.f6135i = intent.getStringExtra("clientToken");
            j = intent.getLongExtra("handlerTime", -1);
        } else {
            this.f6134h = bundle.getString("browserURL");
            this.f6135i = bundle.getString("clientToken");
            j = bundle.getLong("handlerTime", -1);
        }
        this.f6136j = j;
        String str = this.f6134h != null ? this.f6134h : "about:blank";
        this.f6129c.setUrl(str);
        this.f6130d.loadUrl(str);
    }

    /* renamed from: a */
    public void mo6772a(Bundle bundle) {
        bundle.putString("browserURL", this.f6134h);
    }

    /* renamed from: a */
    public void mo6773a(boolean z) {
        this.f6130d.onPause();
        if (this.f6139m) {
            this.f6139m = false;
            this.f6132f.mo6944e(this.f6135i, new C1875a(this.f6130d.getFirstUrl()).mo7160a(this.f6136j).mo7162b(this.f6138l).mo7163c(this.f6130d.getResponseEndMs()).mo7164d(this.f6130d.getDomContentLoadedMs()).mo7165e(this.f6130d.getScrollReadyMs()).mo7166f(this.f6130d.getLoadFinishMs()).mo7167g(System.currentTimeMillis()).mo7161a().mo7159a());
        }
    }

    /* renamed from: b */
    public void mo6774b(boolean z) {
        this.f6130d.onResume();
    }

    public void setListener(C1845a aVar) {
    }
}
