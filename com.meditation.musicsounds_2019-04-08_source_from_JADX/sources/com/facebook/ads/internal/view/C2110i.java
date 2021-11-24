package com.facebook.ads.internal.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.RelativeLayout;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.AudienceNetworkActivity.C1619a;
import com.facebook.ads.internal.adapters.C1657b;
import com.facebook.ads.internal.adapters.C1672i;
import com.facebook.ads.internal.adapters.p059a.C1640a;
import com.facebook.ads.internal.adapters.p059a.C1655j;
import com.facebook.ads.internal.adapters.p059a.C1656k;
import com.facebook.ads.internal.p070l.C1718d;
import com.facebook.ads.internal.p072o.C1728c;
import com.facebook.ads.internal.p077s.p078a.C1800k;
import com.facebook.ads.internal.p077s.p078a.C1802m;
import com.facebook.ads.internal.p077s.p078a.C1806p;
import com.facebook.ads.internal.p077s.p080c.C1827e;
import com.facebook.ads.internal.p077s.p080c.C1827e.C1828a;
import com.facebook.ads.internal.p077s.p080c.C1829f;
import com.facebook.ads.internal.p083t.C1838a;
import com.facebook.ads.internal.view.C1844a.C1845a;
import com.facebook.ads.internal.view.component.C1898a;
import com.facebook.ads.internal.view.p086c.C1883a;
import com.facebook.ads.internal.view.p091e.C1955b;
import com.facebook.ads.internal.view.p091e.C1955b.C1962c;
import com.facebook.ads.internal.view.p093g.p095b.C2017b;
import com.facebook.ads.internal.view.p093g.p095b.C2040z;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

@TargetApi(16)
/* renamed from: com.facebook.ads.internal.view.i */
public class C2110i extends RelativeLayout implements C1844a, C1962c {

    /* renamed from: a */
    private final C1728c f6910a;

    /* renamed from: b */
    private final C1656k f6911b;

    /* renamed from: c */
    private final C1655j f6912c;

    /* renamed from: d */
    private final C1640a f6913d;

    /* renamed from: e */
    private int f6914e;

    /* renamed from: f */
    private Context f6915f;

    /* renamed from: g */
    private AudienceNetworkActivity f6916g;

    /* renamed from: h */
    private C1845a f6917h;

    /* renamed from: i */
    private Executor f6918i = C1802m.f5871a;

    /* renamed from: j */
    private final C1619a f6919j = new C1619a() {
        /* renamed from: a */
        public boolean mo6642a() {
            return !C2110i.this.f6922m;
        }
    };

    /* renamed from: k */
    private boolean f6920k;

    /* renamed from: l */
    private C1955b f6921l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public boolean f6922m;

    /* renamed from: n */
    private C1672i f6923n;

    /* renamed from: com.facebook.ads.internal.view.i$a */
    private static class C2113a implements C1828a {

        /* renamed from: a */
        final WeakReference<C1845a> f6926a;

        private C2113a(WeakReference<C1845a> weakReference) {
            this.f6926a = weakReference;
        }

        /* renamed from: a */
        public void mo7101a() {
            if (this.f6926a.get() != null) {
                ((C1845a) this.f6926a.get()).mo6645a(C2040z.REWARD_SERVER_FAILED.mo7487a());
            }
        }

        /* renamed from: a */
        public void mo7102a(C1829f fVar) {
            C1845a aVar;
            C2040z zVar;
            if (this.f6926a.get() != null) {
                if (fVar == null || !fVar.mo7103a()) {
                    aVar = (C1845a) this.f6926a.get();
                    zVar = C2040z.REWARD_SERVER_FAILED;
                } else {
                    aVar = (C1845a) this.f6926a.get();
                    zVar = C2040z.REWARD_SERVER_SUCCESS;
                }
                aVar.mo6645a(zVar.mo7487a());
            }
        }
    }

    public C2110i(Context context, C1728c cVar, C1845a aVar, C1656k kVar) {
        super(context);
        this.f6915f = context;
        this.f6917h = aVar;
        this.f6910a = cVar;
        this.f6911b = kVar;
        this.f6912c = kVar.mo6755e().mo6688j();
        this.f6913d = kVar.mo6754d();
    }

    /* renamed from: a */
    private C1898a m9857a(C1883a aVar) {
        C1898a aVar2 = new C1898a(this.f6915f, true, false, C2040z.REWARDED_VIDEO_AD_CLICK.mo7487a(), this.f6913d.mo6676a(), this.f6910a, this.f6917h, aVar.getViewabilityChecker(), aVar.getTouchDataRecorder());
        return aVar2;
    }

    /* renamed from: a */
    private void m9858a(AudienceNetworkActivity audienceNetworkActivity) {
        this.f6914e = audienceNetworkActivity.getRequestedOrientation();
        audienceNetworkActivity.setRequestedOrientation(1);
    }

    /* renamed from: b */
    private void m9860b(C1838a aVar, C1806p pVar) {
        m9862c(aVar, pVar).mo6674a();
    }

    /* renamed from: c */
    private C1672i m9862c(C1838a aVar, C1806p pVar) {
        if (this.f6923n != null) {
            return this.f6923n;
        }
        C1672i iVar = new C1672i(getContext(), this.f6910a, aVar, pVar, new C1657b() {
            /* renamed from: a */
            public void mo6759a() {
                C2110i.this.m9863e();
            }
        });
        this.f6923n = iVar;
        this.f6923n.mo6789a(this.f6911b);
        return this.f6923n;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m9863e() {
        if (this.f6917h != null) {
            this.f6917h.mo6645a(C2040z.REWARDED_VIDEO_IMPRESSION.mo7487a());
        }
    }

    /* renamed from: f */
    private void m9864f() {
        String a = this.f6911b.mo6756f().mo6715a();
        if (this.f6915f != null || !TextUtils.isEmpty(a)) {
            C1827e eVar = new C1827e(this.f6915f, new HashMap());
            eVar.mo7096a((C1828a) new C2113a(new WeakReference(this.f6917h)));
            eVar.executeOnExecutor(this.f6918i, new String[]{a});
        }
    }

    /* renamed from: g */
    private void m9865g() {
        if (this.f6917h != null) {
            this.f6917h.mo6646a(C2040z.REWARDED_VIDEO_COMPLETE.mo7487a(), (C1718d) new C2017b(0, 0));
        }
    }

    /* renamed from: a */
    public void mo6761a() {
        if (this.f6916g != null) {
            this.f6916g.mo6632b(this.f6919j);
            this.f6916g.setRequestedOrientation(this.f6914e);
        }
        C1883a adWebView = this.f6921l.getAdWebView();
        if (adWebView != null && !TextUtils.isEmpty(this.f6911b.mo6757g())) {
            HashMap hashMap = new HashMap();
            adWebView.getViewabilityChecker().mo7108a((Map<String, String>) hashMap);
            hashMap.put("touch", C1800k.m8915a(adWebView.getTouchDataRecorder().mo7071c()));
            this.f6910a.mo6946g(this.f6911b.mo6757g(), hashMap);
        }
        this.f6921l.mo7365f();
        this.f6917h = null;
        this.f6916g = null;
        this.f6915f = null;
    }

    /* renamed from: a */
    public void mo6770a(Intent intent, Bundle bundle, AudienceNetworkActivity audienceNetworkActivity) {
        if (this.f6917h != null && this.f6915f != null) {
            this.f6916g = audienceNetworkActivity;
            this.f6916g.mo6631a(this.f6919j);
            m9858a(audienceNetworkActivity);
            C1955b bVar = new C1955b(this.f6915f, this.f6911b, this.f6910a, this.f6917h, this, true);
            this.f6921l = bVar;
            addView(bVar);
            this.f6917h.mo6643a((View) this);
            bVar.mo7362c();
        }
    }

    /* renamed from: a */
    public void mo6772a(Bundle bundle) {
    }

    /* renamed from: a */
    public void mo7371a(C1838a aVar, C1806p pVar) {
        m9860b(aVar, pVar);
    }

    /* renamed from: a */
    public void mo6773a(boolean z) {
        this.f6921l.mo7364e();
    }

    /* renamed from: b */
    public void mo7372b() {
        this.f6922m = true;
        m9864f();
        m9865g();
        C1883a adWebView = this.f6921l.getAdWebView();
        if (this.f6920k && adWebView != null) {
            m9857a(adWebView).mo7254b(this.f6911b.mo6753c(), this.f6911b.mo6757g(), new HashMap());
        }
    }

    /* renamed from: b */
    public void mo6774b(boolean z) {
        this.f6921l.mo7363d();
    }

    /* renamed from: c */
    public void mo7373c() {
        if (this.f6917h != null) {
            this.f6917h.mo6645a(C2040z.REWARDED_VIDEO_END_ACTIVITY.mo7487a());
        }
    }

    /* renamed from: c */
    public void mo7374c(boolean z) {
        this.f6920k = true;
        C1883a adWebView = this.f6921l.getAdWebView();
        if (adWebView != null) {
            C1898a a = m9857a(adWebView);
            a.mo7253a(this.f6911b.mo6753c(), this.f6911b.mo6757g(), (Map<String, String>) new HashMap<String,String>(), z);
            a.performClick();
        }
    }

    /* renamed from: d */
    public void mo7375d() {
        if (this.f6917h != null) {
            this.f6917h.mo6645a(C2040z.REWARDED_VIDEO_ERROR.mo7487a());
        }
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (this.f6921l.getAdWebView() != null) {
            if (z) {
                mo6774b(false);
            } else {
                mo6773a(false);
            }
        }
    }

    public void setListener(C1845a aVar) {
        this.f6917h = aVar;
    }
}
