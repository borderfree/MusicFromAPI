package com.facebook.ads.internal.view.p092f;

import android.content.Context;
import android.net.Uri;
import android.support.p023v7.widget.LinearLayoutManager;
import android.support.p023v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.facebook.ads.internal.adapters.p059a.C1647d;
import com.facebook.ads.internal.adapters.p059a.C1655j;
import com.facebook.ads.internal.adapters.p059a.C1656k;
import com.facebook.ads.internal.p058a.C1627b;
import com.facebook.ads.internal.p058a.C1628c;
import com.facebook.ads.internal.p070l.C1717c;
import com.facebook.ads.internal.p072o.C1728c;
import com.facebook.ads.internal.p077s.p078a.C1802m;
import com.facebook.ads.internal.p077s.p078a.C1806p;
import com.facebook.ads.internal.p077s.p078a.C1808r;
import com.facebook.ads.internal.p077s.p080c.C1824b;
import com.facebook.ads.internal.p077s.p080c.C1827e;
import com.facebook.ads.internal.p077s.p080c.C1827e.C1828a;
import com.facebook.ads.internal.p077s.p080c.C1829f;
import com.facebook.ads.internal.p083t.C1838a;
import com.facebook.ads.internal.view.C1844a.C1845a;
import com.facebook.ads.internal.view.component.C1898a;
import com.facebook.ads.internal.view.component.C1924d;
import com.facebook.ads.internal.view.component.C1926f;
import com.facebook.ads.internal.view.p086c.C1883a;
import com.facebook.ads.internal.view.p086c.C1883a.C1886b;
import com.facebook.ads.internal.view.p086c.C1883a.C1887c;
import com.facebook.ads.internal.view.p086c.C1896d;
import com.facebook.ads.internal.view.p091e.C1955b;
import com.facebook.ads.internal.view.p091e.C1955b.C1962c;
import com.facebook.ads.internal.view.p093g.p095b.C2040z;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.ads.internal.view.f.b */
public class C1976b {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f6554a = "b";

    /* renamed from: b */
    private static final int f6555b = ((int) (C1808r.f5899b * 4.0f));

    /* renamed from: c */
    private static final int f6556c = ((int) (C1808r.f5899b * 72.0f));

    /* renamed from: d */
    private static final int f6557d = ((int) (C1808r.f5899b * 8.0f));

    /* renamed from: e */
    private C1898a f6558e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final Context f6559f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C1728c f6560g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C1656k f6561h;

    /* renamed from: i */
    private final String f6562i;

    /* renamed from: j */
    private final C1647d f6563j;

    /* renamed from: k */
    private final C1838a f6564k;

    /* renamed from: l */
    private final C1806p f6565l;

    /* renamed from: m */
    private Executor f6566m = C1802m.f5871a;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public C1845a f6567n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public C1883a f6568o;

    /* renamed from: p */
    private C1886b f6569p;

    /* renamed from: com.facebook.ads.internal.view.f.b$a */
    public enum C1981a {
        SCREENSHOTS,
        MARKUP,
        PLAYABLE,
        INFO
    }

    /* renamed from: com.facebook.ads.internal.view.f.b$b */
    private static class C1982b implements C1962c {

        /* renamed from: a */
        final WeakReference<C1976b> f6579a;

        private C1982b(C1976b bVar) {
            this.f6579a = new WeakReference<>(bVar);
        }

        /* renamed from: a */
        public void mo7371a(C1838a aVar, C1806p pVar) {
        }

        /* renamed from: b */
        public void mo7372b() {
        }

        /* renamed from: c */
        public void mo7373c() {
            if (this.f6579a.get() != null) {
                ((C1976b) this.f6579a.get()).m9493g();
            }
        }

        /* renamed from: c */
        public void mo7374c(boolean z) {
            if (this.f6579a.get() != null) {
                ((C1976b) this.f6579a.get()).m9495i().performClick();
            }
        }

        /* renamed from: d */
        public void mo7375d() {
            mo7373c();
        }
    }

    public C1976b(Context context, C1728c cVar, C1656k kVar, C1845a aVar, C1838a aVar2, C1806p pVar) {
        this.f6559f = context;
        this.f6560g = cVar;
        this.f6561h = kVar;
        this.f6567n = aVar;
        this.f6562i = C1717c.m8603a(this.f6561h.mo6756f().mo6717b());
        this.f6563j = this.f6561h.mo6754d().mo6676a();
        this.f6564k = aVar2;
        this.f6565l = pVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m9493g() {
        if (this.f6567n != null) {
            this.f6567n.mo6645a(C2040z.REWARDED_VIDEO_END_ACTIVITY.mo7487a());
        }
    }

    /* renamed from: h */
    private View m9494h() {
        C1926f fVar = new C1926f(this.f6559f, this.f6563j, true, false, false);
        fVar.mo7322a(this.f6561h.mo6751b().mo6699a(), this.f6561h.mo6751b().mo6701c(), false, true);
        fVar.setAlignment(17);
        C1898a i = m9495i();
        C1924d dVar = new C1924d(this.f6559f);
        C1808r.m8932a((View) dVar, 0);
        dVar.setRadius(50);
        new C1896d(dVar).mo7236a().mo7240a(this.f6561h.mo6748a().mo6733b());
        LinearLayout linearLayout = new LinearLayout(this.f6559f);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.addView(dVar, new LayoutParams(f6556c, f6556c));
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.setMargins(0, f6557d, 0, f6557d);
        linearLayout.addView(fVar, layoutParams);
        linearLayout.addView(i, layoutParams);
        return linearLayout;
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public C1898a m9495i() {
        if (this.f6558e != null) {
            return this.f6558e;
        }
        C1898a aVar = new C1898a(this.f6559f, true, false, C2040z.REWARDED_VIDEO_AD_CLICK.mo7487a(), this.f6563j, this.f6560g, this.f6567n, this.f6564k, this.f6565l);
        this.f6558e = aVar;
        this.f6558e.mo7252a(this.f6561h.mo6753c(), this.f6561h.mo6757g(), new HashMap());
        return this.f6558e;
    }

    /* renamed from: j */
    private View m9496j() {
        RecyclerView recyclerView = new RecyclerView(this.f6559f);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.f6559f, 0, false));
        recyclerView.setAdapter(new C1983c(this.f6561h.mo6756f().mo6719d(), f6555b));
        return recyclerView;
    }

    /* renamed from: k */
    private View m9497k() {
        this.f6569p = new C1887c() {
            /* renamed from: a */
            public void mo7208a() {
                if (C1976b.this.f6568o != null && !TextUtils.isEmpty(C1976b.this.f6561h.mo6756f().mo6718c())) {
                    C1976b.this.f6568o.post(new Runnable() {
                        public void run() {
                            if (C1976b.this.f6568o == null || C1976b.this.f6568o.mo7093c()) {
                                Log.w(C1976b.f6554a, "Webview already destroyed, cannot activate");
                                return;
                            }
                            C1883a f = C1976b.this.f6568o;
                            StringBuilder sb = new StringBuilder();
                            sb.append("javascript:");
                            sb.append(C1976b.this.f6561h.mo6756f().mo6718c());
                            f.loadUrl(sb.toString());
                        }
                    });
                }
            }

            /* renamed from: a */
            public void mo7211a(String str, Map<String, String> map) {
                Uri parse = Uri.parse(str);
                if (!"fbad".equals(parse.getScheme()) || !parse.getAuthority().equals("close")) {
                    if ("fbad".equals(parse.getScheme()) && C1628c.m8176a(parse.getAuthority()) && C1976b.this.f6567n != null) {
                        C1976b.this.f6567n.mo6645a(C2040z.REWARDED_VIDEO_AD_CLICK.mo7487a());
                    }
                    C1627b a = C1628c.m8174a(C1976b.this.f6559f, C1976b.this.f6560g, C1976b.this.f6561h.mo6757g(), parse, map);
                    if (a != null) {
                        try {
                            a.mo6655b();
                        } catch (Exception e) {
                            Log.e(C1976b.f6554a, "Error executing action", e);
                        }
                    }
                    return;
                }
                C1976b.this.m9493g();
            }
        };
        this.f6568o = new C1883a(this.f6559f, new WeakReference(this.f6569p), 1);
        this.f6568o.loadDataWithBaseURL(C1824b.m8968a(), this.f6562i, "text/html", "utf-8", null);
        return this.f6568o;
    }

    /* renamed from: l */
    private View m9498l() {
        C1955b bVar = new C1955b(this.f6559f, this.f6561h, this.f6560g, this.f6567n, new C1982b(), false);
        return bVar;
    }

    /* renamed from: a */
    public boolean mo7403a() {
        return mo7404b() == C1981a.MARKUP;
    }

    /* renamed from: b */
    public C1981a mo7404b() {
        C1655j j = this.f6561h.mo6755e().mo6688j();
        return (j == null || !j.mo6747g()) ? !this.f6561h.mo6756f().mo6719d().isEmpty() ? C1981a.SCREENSHOTS : !TextUtils.isEmpty(this.f6562i) ? C1981a.MARKUP : C1981a.INFO : C1981a.PLAYABLE;
    }

    /* renamed from: c */
    public Pair<C1981a, View> mo7405c() {
        C1981a b = mo7404b();
        switch (b) {
            case MARKUP:
                return new Pair<>(b, m9497k());
            case SCREENSHOTS:
                return new Pair<>(b, m9496j());
            case PLAYABLE:
                return new Pair<>(b, m9498l());
            default:
                return new Pair<>(b, m9494h());
        }
    }

    /* renamed from: d */
    public void mo7406d() {
        String a = this.f6561h.mo6756f().mo6715a();
        if (!TextUtils.isEmpty(a)) {
            C1827e eVar = new C1827e(this.f6559f, new HashMap());
            eVar.mo7096a((C1828a) new C1828a() {
                /* renamed from: a */
                public void mo7101a() {
                    if (C1976b.this.f6567n != null) {
                        C1976b.this.f6567n.mo6645a(C2040z.REWARD_SERVER_FAILED.mo7487a());
                    }
                }

                /* renamed from: a */
                public void mo7102a(C1829f fVar) {
                    C1845a aVar;
                    C2040z zVar;
                    if (C1976b.this.f6567n != null) {
                        if (fVar == null || !fVar.mo7103a()) {
                            aVar = C1976b.this.f6567n;
                            zVar = C2040z.REWARD_SERVER_FAILED;
                        } else {
                            aVar = C1976b.this.f6567n;
                            zVar = C2040z.REWARD_SERVER_SUCCESS;
                        }
                        aVar.mo6645a(zVar.mo7487a());
                    }
                }
            });
            eVar.executeOnExecutor(this.f6566m, new String[]{a});
        }
    }

    /* renamed from: e */
    public void mo7407e() {
        if (this.f6568o != null) {
            this.f6568o.destroy();
            this.f6568o = null;
            this.f6569p = null;
        }
    }
}
