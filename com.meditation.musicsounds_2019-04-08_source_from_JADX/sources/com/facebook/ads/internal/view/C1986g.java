package com.facebook.ads.internal.view;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.AudienceNetworkActivity.C1619a;
import com.facebook.ads.internal.adapters.p059a.C1650g;
import com.facebook.ads.internal.adapters.p059a.C1651h;
import com.facebook.ads.internal.p064f.C1684a;
import com.facebook.ads.internal.p070l.C1714a;
import com.facebook.ads.internal.p070l.C1714a.C1715a;
import com.facebook.ads.internal.p070l.C1716b;
import com.facebook.ads.internal.p070l.C1718d;
import com.facebook.ads.internal.p070l.C1720f;
import com.facebook.ads.internal.p072o.C1728c;
import com.facebook.ads.internal.p077s.p078a.C1800k;
import com.facebook.ads.internal.p077s.p078a.C1806p;
import com.facebook.ads.internal.p077s.p078a.C1808r;
import com.facebook.ads.internal.p083t.C1838a;
import com.facebook.ads.internal.p083t.C1838a.C1839a;
import com.facebook.ads.internal.view.C1844a.C1845a;
import com.facebook.ads.internal.view.component.p087a.C1915b;
import com.facebook.ads.internal.view.component.p087a.C1916c;
import com.facebook.ads.internal.view.component.p087a.C1917d.C1919a;
import com.facebook.ads.internal.view.p093g.C1994a;
import com.facebook.ads.internal.view.p093g.C2003b;
import com.facebook.ads.internal.view.p093g.C2041c;
import com.facebook.ads.internal.view.p093g.p094a.C2000a;
import com.facebook.ads.internal.view.p093g.p094a.C2001b;
import com.facebook.ads.internal.view.p093g.p095b.C2017b;
import com.facebook.ads.internal.view.p093g.p095b.C2018c;
import com.facebook.ads.internal.view.p093g.p095b.C2019d;
import com.facebook.ads.internal.view.p093g.p095b.C2020e;
import com.facebook.ads.internal.view.p093g.p095b.C2023h;
import com.facebook.ads.internal.view.p093g.p095b.C2024i;
import com.facebook.ads.internal.view.p093g.p095b.C2025j;
import com.facebook.ads.internal.view.p093g.p095b.C2026k;
import com.facebook.ads.internal.view.p093g.p095b.C2027l;
import com.facebook.ads.internal.view.p093g.p095b.C2028m;
import com.facebook.ads.internal.view.p093g.p096c.C2054c;
import com.facebook.ads.internal.view.p093g.p096c.C2057d;
import com.facebook.ads.internal.view.p093g.p096c.C2057d.C2065a;
import com.facebook.ads.internal.view.p093g.p096c.C2066e;
import com.facebook.ads.internal.view.p093g.p096c.C2069f;
import com.facebook.ads.internal.view.p093g.p096c.C2071g;
import com.facebook.ads.internal.view.p093g.p096c.C2085k;
import com.facebook.ads.internal.view.p093g.p097d.C2101d;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.internal.view.g */
public class C1986g extends C2104h {

    /* renamed from: A */
    private boolean f6584A = false;

    /* renamed from: e */
    private final C1619a f6585e = new C1619a() {
        /* renamed from: a */
        public boolean mo6642a() {
            return !C1986g.this.f6892c.mo7382a();
        }
    };

    /* renamed from: f */
    private final C2020e f6586f = new C2020e() {
        /* renamed from: a */
        public void mo6765a(C2019d dVar) {
            if (C1986g.this.getAudienceNetworkListener() != null) {
                C1986g.this.getAudienceNetworkListener().mo6646a("videoInterstitalEvent", (C1718d) dVar);
            }
            if (!C1986g.this.f6606z) {
                C1986g.this.f6591k.mo7429e();
                C1986g.this.f6591k.mo7447j();
                C1986g.this.f6606z = true;
            }
            if (C1986g.this.f6603w != null) {
                C1986g.this.f6603w.finish();
            }
        }
    };

    /* renamed from: g */
    private final C2026k f6587g = new C2026k() {
        /* renamed from: a */
        public void mo6765a(C2025j jVar) {
            if (C1986g.this.getAudienceNetworkListener() != null) {
                C1986g.this.getAudienceNetworkListener().mo6646a("videoInterstitalEvent", (C1718d) jVar);
            }
        }
    };

    /* renamed from: h */
    private final C2024i f6588h = new C2024i() {
        /* renamed from: a */
        public void mo6765a(C2023h hVar) {
            if (C1986g.this.getAudienceNetworkListener() != null) {
                C1986g.this.getAudienceNetworkListener().mo6646a("videoInterstitalEvent", (C1718d) hVar);
            }
        }
    };

    /* renamed from: i */
    private final C2018c f6589i = new C2018c() {
        /* renamed from: a */
        public void mo6765a(C2017b bVar) {
            C1986g.this.f6600t.set(true);
            if (C1986g.this.getAudienceNetworkListener() != null) {
                C1986g.this.getAudienceNetworkListener().mo6646a("videoInterstitalEvent", (C1718d) bVar);
            }
        }
    };

    /* renamed from: j */
    private final C2028m f6590j = new C2028m() {
        /* renamed from: a */
        public void mo6765a(C2027l lVar) {
            if (!C1986g.this.f6606z) {
                C1986g.this.f6601u.set(C1986g.this.f6591k.mo7446i());
                C1986g.this.m9524b();
            }
            if (C1986g.this.getAudienceNetworkListener() != null) {
                C1986g.this.getAudienceNetworkListener().mo6646a("videoInterstitalEvent", (C1718d) lVar);
            }
            C1986g.this.f6596p.mo7106a();
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final C1994a f6591k = new C1994a(getContext());

    /* renamed from: l */
    private final C2085k f6592l;

    /* renamed from: m */
    private final C2054c f6593m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final C1650g f6594n;

    /* renamed from: o */
    private final C1651h f6595o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final C1838a f6596p;

    /* renamed from: q */
    private final C1839a f6597q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public final C1806p f6598r = new C1806p();

    /* renamed from: s */
    private final C1684a f6599s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public final AtomicBoolean f6600t = new AtomicBoolean(false);
    /* access modifiers changed from: private */

    /* renamed from: u */
    public final AtomicBoolean f6601u = new AtomicBoolean(false);

    /* renamed from: v */
    private final C2041c f6602v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public AudienceNetworkActivity f6603w;

    /* renamed from: x */
    private C2000a f6604x;

    /* renamed from: y */
    private long f6605y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public boolean f6606z = false;

    public C1986g(Context context, C1728c cVar, C1650g gVar, C1684a aVar, C1845a aVar2) {
        super(context, cVar, aVar2);
        this.f6591k.setVideoProgressReportIntervalMs(gVar.mo6728h());
        C1808r.m8931a((View) this.f6591k);
        C1808r.m8932a((View) this.f6591k, 0);
        this.f6594n = gVar;
        this.f6595o = (C1651h) this.f6594n.mo6724d().get(0);
        this.f6599s = aVar;
        this.f6592l = new C2085k(getContext());
        this.f6593m = new C2054c(context);
        this.f6591k.getEventBus().mo6906a((T[]) new C1720f[]{this.f6587g, this.f6588h, this.f6589i, this.f6586f, this.f6590j});
        setupPlugins(this.f6595o);
        this.f6597q = new C1839a() {
            /* renamed from: a */
            public void mo7113a() {
                if (!C1986g.this.f6598r.mo7070b()) {
                    C1986g.this.f6598r.mo7068a();
                    HashMap hashMap = new HashMap();
                    if (!TextUtils.isEmpty(C1986g.this.f6594n.mo6723c())) {
                        C1986g.this.f6596p.mo7108a((Map<String, String>) hashMap);
                        hashMap.put("touch", C1800k.m8915a(C1986g.this.f6598r.mo7071c()));
                        C1986g.this.f6891b.mo6939a(C1986g.this.f6594n.mo6723c(), hashMap);
                        if (C1986g.this.getAudienceNetworkListener() != null) {
                            C1986g.this.getAudienceNetworkListener().mo6645a("com.facebook.ads.interstitial.impression.logged");
                        }
                    }
                }
            }
        };
        this.f6596p = new C1838a(this, 1, this.f6597q);
        this.f6596p.mo7107a(gVar.mo6726f());
        this.f6596p.mo7109b(gVar.mo6727g());
        this.f6602v = new C2003b(getContext(), this.f6891b, this.f6591k, this.f6594n.mo6723c());
        this.f6591k.setVideoURI(m9520a(this.f6595o.mo6731c().mo6678a()));
    }

    /* renamed from: a */
    private String m9520a(String str) {
        String str2 = "";
        if (!(this.f6599s == null || str == null)) {
            str2 = this.f6599s.mo6828a(str);
        }
        return TextUtils.isEmpty(str2) ? str : str2;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m9524b() {
        this.f6593m.setVisibility(this.f6601u.get() ? 0 : 8);
    }

    private void setUpContent(int i) {
        C1919a aVar = new C1919a(getContext(), this.f6891b, getAudienceNetworkListener(), this.f6594n, this.f6591k, this.f6596p, this.f6598r);
        C1915b a = C1916c.m9271a(aVar.mo7307a(f6890a).mo7311b(i).mo7309a(this.f6592l).mo7308a((View) this.f6593m).mo7310a());
        m9524b();
        mo7642a(a, a.mo7256a(), i);
    }

    private void setupPlugins(C1651h hVar) {
        this.f6591k.mo7426b();
        this.f6591k.mo7423a((C2001b) this.f6592l);
        this.f6591k.mo7423a((C2001b) this.f6593m);
        if (!TextUtils.isEmpty(hVar.mo6731c().mo6685g())) {
            C2066e eVar = new C2066e(getContext());
            this.f6591k.mo7423a((C2001b) eVar);
            eVar.setImage(hVar.mo6731c().mo6685g());
        }
        C2071g gVar = new C2071g(getContext(), true);
        this.f6591k.mo7423a((C2001b) gVar);
        this.f6591k.mo7423a((C2001b) new C2057d(gVar, hVar.mo6731c().mo6683e() ? C2065a.FADE_OUT_ON_PLAY : C2065a.VISIBLE, true));
        this.f6591k.mo7423a((C2001b) new C2069f(getContext()));
        this.f6591k.mo7423a((C2001b) this.f6892c);
    }

    /* renamed from: a */
    public void mo6761a() {
        if (!this.f6606z) {
            if (!this.f6600t.get()) {
                this.f6591k.mo7428d();
            }
            if (this.f6594n != null) {
                C1716b.m8601a(C1714a.m8599a(this.f6605y, C1715a.XOUT, this.f6594n.mo6725e()));
                if (!TextUtils.isEmpty(this.f6594n.mo6723c())) {
                    HashMap hashMap = new HashMap();
                    this.f6596p.mo7108a((Map<String, String>) hashMap);
                    hashMap.put("touch", C1800k.m8915a(this.f6598r.mo7071c()));
                    this.f6891b.mo6946g(this.f6594n.mo6723c(), hashMap);
                }
            }
            this.f6591k.mo7429e();
            this.f6591k.mo7447j();
            this.f6606z = true;
        }
        this.f6596p.mo7111c();
        this.f6603w = null;
        super.mo6761a();
    }

    /* renamed from: a */
    public void mo6770a(Intent intent, Bundle bundle, AudienceNetworkActivity audienceNetworkActivity) {
        super.mo7643a(audienceNetworkActivity, this.f6594n);
        this.f6603w = audienceNetworkActivity;
        setUpContent(audienceNetworkActivity.getResources().getConfiguration().orientation);
        this.f6603w.mo6631a(this.f6585e);
        C1651h hVar = (C1651h) this.f6594n.mo6724d().get(0);
        if (hVar.mo6731c().mo6683e()) {
            this.f6591k.setVolume(hVar.mo6731c().mo6684f() ? 1.0f : 0.0f);
            this.f6591k.mo7422a(C2000a.AUTO_STARTED);
        }
        this.f6605y = System.currentTimeMillis();
    }

    /* renamed from: a */
    public void mo6772a(Bundle bundle) {
    }

    /* renamed from: a */
    public void mo6773a(boolean z) {
        if (!this.f6606z && !this.f6591k.mo7448k()) {
            this.f6604x = this.f6591k.getVideoStartReason();
            this.f6584A = z;
            this.f6591k.mo7425a(false);
        }
    }

    /* renamed from: b */
    public void mo6774b(boolean z) {
        if (!this.f6606z && !this.f6591k.mo7449l()) {
            if ((this.f6591k.getState() != C2101d.PREPARED || this.f6591k.getVideoStartReason() != C2000a.NOT_STARTED) && this.f6591k.getState() != C2101d.PLAYBACK_COMPLETED && this.f6604x != null) {
                if (!this.f6584A || z) {
                    this.f6591k.mo7422a(this.f6604x);
                }
            }
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        removeAllViews();
        C1808r.m8940b(this.f6591k);
        C1808r.m8940b(this.f6592l);
        C1808r.m8940b(this.f6593m);
        setUpContent(configuration.orientation);
        super.onConfigurationChanged(configuration);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f6598r.mo7069a(motionEvent, this, this);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
