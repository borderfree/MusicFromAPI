package com.facebook.ads.internal.view;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout.LayoutParams;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.internal.adapters.C1657b;
import com.facebook.ads.internal.adapters.C1666e;
import com.facebook.ads.internal.adapters.C1667f;
import com.facebook.ads.internal.p058a.C1627b;
import com.facebook.ads.internal.p058a.C1628c;
import com.facebook.ads.internal.p070l.C1714a;
import com.facebook.ads.internal.p070l.C1714a.C1715a;
import com.facebook.ads.internal.p070l.C1716b;
import com.facebook.ads.internal.p072o.C1728c;
import com.facebook.ads.internal.p077s.p078a.C1800k;
import com.facebook.ads.internal.p077s.p080c.C1824b;
import com.facebook.ads.internal.view.C1844a.C1845a;
import com.facebook.ads.internal.view.p086c.C1883a;
import com.facebook.ads.internal.view.p086c.C1883a.C1886b;
import com.facebook.ads.internal.view.p086c.C1883a.C1887c;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.view.d */
public class C1927d implements C1844a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f6356a = "d";
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C1845a f6357b;

    /* renamed from: c */
    private final C1883a f6358c;

    /* renamed from: d */
    private final C1886b f6359d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C1667f f6360e;

    /* renamed from: f */
    private final C1728c f6361f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C1666e f6362g;

    /* renamed from: h */
    private long f6363h = System.currentTimeMillis();
    /* access modifiers changed from: private */

    /* renamed from: i */
    public long f6364i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C1715a f6365j;

    public C1927d(final AudienceNetworkActivity audienceNetworkActivity, final C1728c cVar, C1845a aVar) {
        this.f6357b = aVar;
        this.f6361f = cVar;
        this.f6359d = new C1887c() {

            /* renamed from: d */
            private long f6369d = 0;

            /* renamed from: a */
            public void mo7208a() {
                C1927d.this.f6360e.mo6787b();
            }

            /* renamed from: a */
            public void mo7211a(String str, Map<String, String> map) {
                Uri parse = Uri.parse(str);
                if (!"fbad".equals(parse.getScheme()) || !"close".equals(parse.getAuthority())) {
                    long j = this.f6369d;
                    this.f6369d = System.currentTimeMillis();
                    if (this.f6369d - j >= 1000) {
                        if ("fbad".equals(parse.getScheme()) && C1628c.m8176a(parse.getAuthority())) {
                            C1927d.this.f6357b.mo6645a("com.facebook.ads.interstitial.clicked");
                        }
                        C1627b a = C1628c.m8174a(audienceNetworkActivity, cVar, C1927d.this.f6362g.mo6784f(), parse, map);
                        if (a != null) {
                            try {
                                C1927d.this.f6365j = a.mo6654a();
                                C1927d.this.f6364i = System.currentTimeMillis();
                                a.mo6655b();
                            } catch (Exception e) {
                                Log.e(C1927d.f6356a, "Error executing action", e);
                            }
                        }
                        return;
                    }
                    return;
                }
                audienceNetworkActivity.finish();
            }

            /* renamed from: b */
            public void mo7212b() {
                C1927d.this.f6360e.mo6674a();
            }
        };
        this.f6358c = new C1883a(audienceNetworkActivity, new WeakReference(this.f6359d), 1);
        this.f6358c.setLayoutParams(new LayoutParams(-1, -1));
        AudienceNetworkActivity audienceNetworkActivity2 = audienceNetworkActivity;
        C1728c cVar2 = cVar;
        C1667f fVar = new C1667f(audienceNetworkActivity2, cVar2, this.f6358c, this.f6358c.getViewabilityChecker(), new C1657b() {
            /* renamed from: a */
            public void mo6759a() {
                C1927d.this.f6357b.mo6645a("com.facebook.ads.interstitial.impression.logged");
            }
        });
        this.f6360e = fVar;
        aVar.mo6643a((View) this.f6358c);
    }

    /* renamed from: a */
    public void mo6761a() {
        if (this.f6362g != null) {
            C1716b.m8601a(C1714a.m8599a(this.f6363h, C1715a.XOUT, this.f6362g.mo6781c()));
            if (!TextUtils.isEmpty(this.f6362g.mo6784f())) {
                HashMap hashMap = new HashMap();
                this.f6358c.getViewabilityChecker().mo7108a((Map<String, String>) hashMap);
                hashMap.put("touch", C1800k.m8915a(this.f6358c.getTouchData()));
                this.f6361f.mo6946g(this.f6362g.mo6784f(), hashMap);
            }
        }
        C1824b.m8969a(this.f6358c);
        this.f6358c.destroy();
    }

    /* renamed from: a */
    public void mo6770a(Intent intent, Bundle bundle, AudienceNetworkActivity audienceNetworkActivity) {
        if (bundle == null || !bundle.containsKey("dataModel")) {
            this.f6362g = C1666e.m8357a(intent);
            if (this.f6362g != null) {
                this.f6360e.mo6786a(this.f6362g);
                this.f6358c.loadDataWithBaseURL(C1824b.m8968a(), this.f6362g.mo6779a(), "text/html", "utf-8", null);
                this.f6358c.mo7191a(this.f6362g.mo6782d(), this.f6362g.mo6783e());
            }
            return;
        }
        this.f6362g = C1666e.m8358a(bundle.getBundle("dataModel"));
        if (this.f6362g != null) {
            this.f6358c.loadDataWithBaseURL(C1824b.m8968a(), this.f6362g.mo6779a(), "text/html", "utf-8", null);
            this.f6358c.mo7191a(this.f6362g.mo6782d(), this.f6362g.mo6783e());
        }
    }

    /* renamed from: a */
    public void mo6772a(Bundle bundle) {
        if (this.f6362g != null) {
            bundle.putBundle("dataModel", this.f6362g.mo6785g());
        }
    }

    /* renamed from: a */
    public void mo6773a(boolean z) {
        this.f6358c.onPause();
    }

    /* renamed from: b */
    public void mo6774b(boolean z) {
        if (!(this.f6364i <= 0 || this.f6365j == null || this.f6362g == null)) {
            C1716b.m8601a(C1714a.m8599a(this.f6364i, this.f6365j, this.f6362g.mo6781c()));
        }
        this.f6358c.onResume();
    }

    public void setListener(C1845a aVar) {
    }
}
