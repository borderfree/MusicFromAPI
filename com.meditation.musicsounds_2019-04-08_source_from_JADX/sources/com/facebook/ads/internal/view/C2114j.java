package com.facebook.ads.internal.view;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.AudienceNetworkActivity.C1619a;
import com.facebook.ads.internal.adapters.p059a.C1647d;
import com.facebook.ads.internal.adapters.p059a.C1656k;
import com.facebook.ads.internal.p061c.C1678a;
import com.facebook.ads.internal.p069k.C1713a;
import com.facebook.ads.internal.p070l.C1718d;
import com.facebook.ads.internal.p070l.C1720f;
import com.facebook.ads.internal.p072o.C1728c;
import com.facebook.ads.internal.p077s.p078a.C1800k;
import com.facebook.ads.internal.p077s.p078a.C1806p;
import com.facebook.ads.internal.p077s.p078a.C1808r;
import com.facebook.ads.internal.p083t.C1838a;
import com.facebook.ads.internal.p083t.C1838a.C1839a;
import com.facebook.ads.internal.view.C1844a.C1845a;
import com.facebook.ads.internal.view.C1964f.C1973a;
import com.facebook.ads.internal.view.C1964f.C1974b;
import com.facebook.ads.internal.view.p086c.C1896d;
import com.facebook.ads.internal.view.p091e.C1955b;
import com.facebook.ads.internal.view.p092f.C1975a;
import com.facebook.ads.internal.view.p092f.C1976b;
import com.facebook.ads.internal.view.p092f.C1976b.C1981a;
import com.facebook.ads.internal.view.p093g.C1994a;
import com.facebook.ads.internal.view.p093g.C2003b;
import com.facebook.ads.internal.view.p093g.p094a.C2000a;
import com.facebook.ads.internal.view.p093g.p094a.C2001b;
import com.facebook.ads.internal.view.p093g.p095b.C2017b;
import com.facebook.ads.internal.view.p093g.p095b.C2018c;
import com.facebook.ads.internal.view.p093g.p095b.C2019d;
import com.facebook.ads.internal.view.p093g.p095b.C2020e;
import com.facebook.ads.internal.view.p093g.p095b.C2027l;
import com.facebook.ads.internal.view.p093g.p095b.C2028m;
import com.facebook.ads.internal.view.p093g.p095b.C2029n;
import com.facebook.ads.internal.view.p093g.p095b.C2030o;
import com.facebook.ads.internal.view.p093g.p095b.C2040z;
import com.facebook.ads.internal.view.p093g.p096c.C2054c;
import com.facebook.ads.internal.view.p093g.p096c.C2057d;
import com.facebook.ads.internal.view.p093g.p096c.C2057d.C2065a;
import com.facebook.ads.internal.view.p093g.p096c.C2069f;
import com.facebook.ads.internal.view.p093g.p096c.C2071g;
import com.facebook.ads.internal.view.p093g.p096c.C2080j;
import com.facebook.ads.internal.view.p093g.p096c.C2080j.C2084a;
import com.facebook.ads.internal.view.p093g.p096c.C2085k;
import com.facebook.ads.internal.view.p093g.p097d.C2101d;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.internal.view.j */
public class C2114j extends RelativeLayout implements C1844a {

    /* renamed from: a */
    static final /* synthetic */ boolean f6927a = (!C2114j.class.desiredAssertionStatus());

    /* renamed from: b */
    private static final int f6928b = ((int) (C1808r.f5899b * 12.0f));

    /* renamed from: c */
    private static final int f6929c = ((int) (C1808r.f5899b * 18.0f));

    /* renamed from: d */
    private static final int f6930d = ((int) (C1808r.f5899b * 16.0f));

    /* renamed from: e */
    private static final int f6931e = ((int) (C1808r.f5899b * 72.0f));

    /* renamed from: f */
    private static final int f6932f = ((int) (C1808r.f5899b * 56.0f));

    /* renamed from: g */
    private static final int f6933g = ((int) (C1808r.f5899b * 56.0f));

    /* renamed from: h */
    private static final int f6934h = ((int) (C1808r.f5899b * 28.0f));

    /* renamed from: i */
    private static final int f6935i = ((int) (C1808r.f5899b * 20.0f));

    /* renamed from: j */
    private static final LayoutParams f6936j = new LayoutParams(-1, -1);

    /* renamed from: A */
    private Context f6937A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public C1994a f6938B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public C1845a f6939C;

    /* renamed from: D */
    private C1975a f6940D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public C2057d f6941E;

    /* renamed from: F */
    private C2071g f6942F;

    /* renamed from: G */
    private View f6943G;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public C2080j f6944H;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public C1964f f6945I;

    /* renamed from: J */
    private C2000a f6946J;

    /* renamed from: K */
    private Integer f6947K;
    /* access modifiers changed from: private */

    /* renamed from: L */
    public C1976b f6948L;
    /* access modifiers changed from: private */

    /* renamed from: M */
    public boolean f6949M = false;

    /* renamed from: N */
    private boolean f6950N = false;

    /* renamed from: O */
    private WeakReference<AudienceNetworkActivity> f6951O;

    /* renamed from: k */
    private final C1619a f6952k = new C1619a() {
        /* renamed from: a */
        public boolean mo6642a() {
            return !C2114j.this.f6949M;
        }
    };

    /* renamed from: l */
    private final C2018c f6953l = new C2018c() {
        /* renamed from: a */
        public void mo6765a(C2017b bVar) {
            if (C2114j.this.f6939C != null) {
                C2114j.this.f6948L.mo7406d();
                C2114j.this.m9885d();
                C2114j.this.f6939C.mo6646a(C2040z.REWARDED_VIDEO_COMPLETE.mo7487a(), (C1718d) bVar);
            }
        }
    };

    /* renamed from: m */
    private final C2020e f6954m = new C2020e() {
        /* renamed from: a */
        public void mo6765a(C2019d dVar) {
            if (C2114j.this.f6939C != null) {
                C2114j.this.f6939C.mo6645a(C2040z.REWARDED_VIDEO_ERROR.mo7487a());
            }
            C2114j.this.mo7651b();
        }
    };

    /* renamed from: n */
    private final C2028m f6955n = new C2028m() {
        /* renamed from: a */
        public void mo6765a(C2027l lVar) {
            if (C2114j.this.f6938B != null) {
                C2114j.this.f6938B.mo7422a(C2000a.USER_STARTED);
                C2114j.this.f6959r.mo7106a();
                C2114j.this.f6967z.set(C2114j.this.f6938B.mo7446i());
                C2114j.this.m9892g();
            }
        }
    };

    /* renamed from: o */
    private final C2030o f6956o = new C2030o() {
        /* renamed from: a */
        public void mo6765a(C2029n nVar) {
            if (C2114j.this.f6938B != null && C2114j.this.f6941E != null && C2114j.this.f6938B.getDuration() - C2114j.this.f6938B.getCurrentPositionInMillis() <= 3000 && C2114j.this.f6941E.mo7514a()) {
                C2114j.this.f6941E.mo7515b();
            }
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final C1656k f6957p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public final C1728c f6958q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public final C1838a f6959r;

    /* renamed from: s */
    private final C1839a f6960s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public final C1806p f6961t = new C1806p();

    /* renamed from: u */
    private final C2085k f6962u;

    /* renamed from: v */
    private final C2003b f6963v;

    /* renamed from: w */
    private final RelativeLayout f6964w;

    /* renamed from: x */
    private final C2054c f6965x;

    /* renamed from: y */
    private final C1647d f6966y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public final AtomicBoolean f6967z = new AtomicBoolean(false);

    public C2114j(Context context, C1728c cVar, C1994a aVar, C1845a aVar2, C1656k kVar) {
        super(context);
        this.f6937A = context;
        this.f6939C = aVar2;
        this.f6938B = aVar;
        this.f6958q = cVar;
        this.f6957p = kVar;
        this.f6966y = this.f6957p.mo6754d().mo6676a();
        this.f6964w = new RelativeLayout(context);
        this.f6962u = new C2085k(this.f6937A);
        this.f6965x = new C2054c(this.f6937A);
        new C1896d(this.f6964w, f6935i).mo7236a().mo7239a(C1713a.m8575f(this.f6937A)).mo7240a(this.f6957p.mo6755e().mo6685g());
        this.f6960s = new C1839a() {
            /* renamed from: a */
            public void mo7113a() {
                if (!C2114j.this.f6961t.mo7070b()) {
                    C2114j.this.f6961t.mo7068a();
                    HashMap hashMap = new HashMap();
                    if (!TextUtils.isEmpty(C2114j.this.f6957p.mo6757g())) {
                        C2114j.this.f6959r.mo7108a((Map<String, String>) hashMap);
                        hashMap.put("touch", C1800k.m8915a(C2114j.this.f6961t.mo7071c()));
                        C2114j.this.f6958q.mo6939a(C2114j.this.f6957p.mo6757g(), hashMap);
                    }
                    if (C2114j.this.f6939C != null) {
                        C2114j.this.f6939C.mo6645a(C2040z.REWARDED_VIDEO_IMPRESSION.mo7487a());
                    }
                }
            }
        };
        this.f6959r = new C1838a(this, 1, this.f6960s);
        this.f6959r.mo7107a(250);
        this.f6963v = new C2003b(this.f6937A, this.f6958q, this.f6938B, this.f6957p.mo6757g());
        C1976b bVar = new C1976b(this.f6937A, this.f6958q, this.f6957p, this.f6939C, this.f6959r, this.f6961t);
        this.f6948L = bVar;
        if (f6927a || this.f6938B != null) {
            this.f6938B.setVideoProgressReportIntervalMs(kVar.mo6758h());
            C1808r.m8932a((View) this.f6938B, -16777216);
            this.f6938B.getEventBus().mo6906a((T[]) new C1720f[]{this.f6953l, this.f6954m, this.f6955n, this.f6956o});
            return;
        }
        throw new AssertionError();
    }

    /* renamed from: c */
    private void m9884c() {
        C1994a aVar;
        C2001b bVar;
        if (this.f6938B != null) {
            this.f6938B.mo7426b();
            this.f6938B.mo7423a((C2001b) new C2069f(this.f6937A));
            this.f6938B.mo7423a((C2001b) this.f6965x);
            this.f6938B.mo7423a((C2001b) this.f6962u);
            this.f6942F = new C2071g(this.f6937A, true);
            this.f6943G = new View(this.f6937A);
            this.f6943G.setLayoutParams(f6936j);
            C1808r.m8932a(this.f6943G, -1509949440);
            C2057d dVar = new C2057d(this.f6943G, C2065a.FADE_OUT_ON_PLAY, true);
            this.f6938B.addView(this.f6943G);
            this.f6938B.mo7423a((C2001b) dVar);
            C2057d dVar2 = new C2057d(this.f6942F, C2065a.FADE_OUT_ON_PLAY, true);
            this.f6938B.mo7423a((C2001b) this.f6942F);
            this.f6938B.mo7423a((C2001b) dVar2);
            C1975a aVar2 = new C1975a(this.f6937A, f6931e, this.f6966y, this.f6958q, this.f6939C, this.f6948L.mo7404b() == C1981a.INFO, this.f6948L.mo7404b() == C1981a.INFO, this.f6959r, this.f6961t);
            this.f6940D = aVar2;
            this.f6940D.setInfo(this.f6957p);
            this.f6941E = new C2057d(this.f6940D, C2065a.FADE_OUT_ON_PLAY, true);
            this.f6938B.mo7423a((C2001b) this.f6941E);
            if (!this.f6948L.mo7403a() || this.f6957p.mo6755e().mo6681c() <= 0) {
                if (!this.f6948L.mo7403a()) {
                    this.f6945I = new C1964f(this.f6937A, this.f6939C, C1713a.m8588s(this.f6937A) ? C1973a.ARROWS : C1973a.CROSS);
                    this.f6945I.mo7379a(this.f6957p.mo6748a(), this.f6957p.mo6757g(), this.f6957p.mo6755e().mo6681c());
                    if (this.f6957p.mo6755e().mo6681c() <= 0) {
                        this.f6945I.mo7383b();
                    }
                    if (this.f6948L.mo7404b() != C1981a.INFO) {
                        this.f6945I.mo7385c();
                    }
                    this.f6945I.setToolbarListener(new C1974b() {
                        /* renamed from: a */
                        public void mo7367a() {
                            if (!C2114j.this.f6949M && C2114j.this.f6938B != null) {
                                C2114j.this.f6949M = true;
                                C2114j.this.f6938B.mo7428d();
                            } else if (C2114j.this.f6949M && C2114j.this.f6939C != null) {
                                C2114j.this.f6939C.mo6645a(C2040z.REWARDED_VIDEO_END_ACTIVITY.mo7487a());
                            }
                        }
                    });
                    aVar = this.f6938B;
                    bVar = this.f6945I;
                }
            }
            this.f6944H = new C2080j(this.f6937A, this.f6957p.mo6755e().mo6681c(), -12286980);
            this.f6944H.setButtonMode(C2084a.SKIP_BUTTON_MODE);
            this.f6944H.setOnClickListener(new OnClickListener() {
                public void onClick(View view) {
                    if (C2114j.this.f6944H != null && C2114j.this.f6944H.mo7537a() && C2114j.this.f6944H.getSkipSeconds() != 0 && C2114j.this.f6938B != null) {
                        C2114j.this.f6938B.mo7428d();
                    }
                }
            });
            aVar = this.f6938B;
            bVar = this.f6944H;
            aVar.mo7423a(bVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m9885d() {
        LayoutParams layoutParams;
        this.f6949M = true;
        m9890f();
        C1808r.m8934a((ViewGroup) this.f6964w);
        if (this.f6938B != null) {
            this.f6938B.mo7426b();
            this.f6938B.setVisibility(4);
        }
        if (this.f6945I != null) {
            if (this.f6945I.mo7382a()) {
                this.f6945I.mo7383b();
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                    public void run() {
                        if (C2114j.this.f6945I != null) {
                            C2114j.this.f6945I.setCloseButtonStyle(C1973a.CROSS);
                            C2114j.this.f6945I.mo7381a(true);
                        }
                    }
                }, 1000);
            } else {
                this.f6945I.mo7381a(true);
                this.f6945I.setCloseButtonStyle(C1973a.CROSS);
            }
            this.f6945I.mo7385c();
        }
        C1808r.m8939a(this.f6938B, this.f6944H, this.f6965x, this.f6962u);
        Pair c = this.f6948L.mo7405c();
        switch ((C1981a) c.first) {
            case MARKUP:
                C1808r.m8939a(this.f6940D);
                this.f6964w.addView((View) c.second, f6936j);
                return;
            case SCREENSHOTS:
                if (this.f6940D != null) {
                    this.f6940D.setVisibility(0);
                    this.f6940D.mo7400a();
                }
                layoutParams = new LayoutParams(-1, -1);
                layoutParams.setMargins(0, f6933g, 0, 0);
                layoutParams.addRule(2, this.f6940D.getId());
                break;
            case INFO:
                C1808r.m8939a(this.f6940D);
                layoutParams = new LayoutParams(-1, -2);
                layoutParams.addRule(15);
                layoutParams.setMargins(f6930d, f6930d, f6930d, f6930d);
                break;
            case PLAYABLE:
                m9888e();
                this.f6964w.removeAllViews();
                C1808r.m8940b(this.f6945I);
                this.f6964w.addView((View) c.second, f6936j);
                ((C1955b) c.second).mo7362c();
                return;
            default:
                return;
        }
        this.f6964w.addView((View) c.second, layoutParams);
        this.f6961t.mo7068a();
    }

    /* renamed from: e */
    private void m9888e() {
        AudienceNetworkActivity audienceNetworkActivity = (AudienceNetworkActivity) this.f6951O.get();
        if (audienceNetworkActivity != null) {
            this.f6947K = Integer.valueOf(audienceNetworkActivity.getRequestedOrientation());
            audienceNetworkActivity.setRequestedOrientation(1);
        }
    }

    /* renamed from: f */
    private void m9890f() {
        if (this.f6937A != null) {
            FrameLayout frameLayout = new FrameLayout(this.f6937A);
            frameLayout.setLayoutParams(f6936j);
            C1808r.m8932a((View) frameLayout, -1509949440);
            this.f6964w.addView(frameLayout, 0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m9892g() {
        this.f6965x.setVisibility(this.f6967z.get() ? 0 : 8);
    }

    private void setUpContentLayoutForVideo(int i) {
        this.f6964w.removeAllViews();
        this.f6964w.addView(this.f6938B, f6936j);
        if (this.f6940D != null) {
            C1808r.m8931a((View) this.f6940D);
            this.f6940D.mo7401a(i);
            LayoutParams layoutParams = new LayoutParams(-1, -2);
            layoutParams.addRule(12);
            this.f6940D.setPadding(f6930d, f6930d, f6930d, f6930d);
            this.f6964w.addView(this.f6940D, layoutParams);
        }
        if (this.f6944H != null) {
            LayoutParams layoutParams2 = new LayoutParams(f6932f, f6932f);
            layoutParams2.addRule(10);
            layoutParams2.addRule(11);
            this.f6944H.setPadding(f6930d, f6930d, f6930d, f6930d);
            this.f6964w.addView(this.f6944H, layoutParams2);
        }
        LayoutParams layoutParams3 = new LayoutParams(f6934h, f6934h);
        layoutParams3.addRule(10);
        layoutParams3.addRule(11);
        layoutParams3.setMargins(f6928b, f6928b + f6933g, f6928b, f6929c);
        this.f6964w.addView(this.f6965x, layoutParams3);
        m9892g();
        LayoutParams layoutParams4 = new LayoutParams(-1, -2);
        layoutParams4.addRule(12);
        this.f6964w.addView(this.f6962u, layoutParams4);
    }

    /* renamed from: a */
    public void mo6761a() {
        mo7651b();
        if (this.f6938B != null) {
            this.f6938B.getEventBus().mo6908b((T[]) new C1720f[]{this.f6953l, this.f6954m, this.f6955n, this.f6956o});
        }
        if (!TextUtils.isEmpty(this.f6957p.mo6757g())) {
            HashMap hashMap = new HashMap();
            this.f6959r.mo7108a((Map<String, String>) hashMap);
            hashMap.put("touch", C1800k.m8915a(this.f6961t.mo7071c()));
            this.f6958q.mo6946g(this.f6957p.mo6757g(), hashMap);
        }
        if (this.f6945I != null) {
            this.f6945I.setToolbarListener(null);
        }
        if (!(this.f6947K == null || this.f6951O.get() == null)) {
            ((AudienceNetworkActivity) this.f6951O.get()).setRequestedOrientation(this.f6947K.intValue());
        }
        this.f6963v.mo7468a();
        this.f6938B = null;
        this.f6948L.mo7407e();
        this.f6944H = null;
        this.f6940D = null;
        this.f6941E = null;
        this.f6939C = null;
        this.f6937A = null;
        this.f6962u.mo7544a();
    }

    /* renamed from: a */
    public void mo6770a(Intent intent, Bundle bundle, AudienceNetworkActivity audienceNetworkActivity) {
        if (this.f6938B != null && this.f6939C != null) {
            this.f6951O = new WeakReference<>(audienceNetworkActivity);
            m9884c();
            audienceNetworkActivity.mo6631a(this.f6952k);
            this.f6938B.setVideoURI(!TextUtils.isEmpty(this.f6957p.mo6755e().mo6680b()) ? this.f6957p.mo6755e().mo6680b() : this.f6957p.mo6755e().mo6678a());
            setUpContentLayoutForVideo(audienceNetworkActivity.getResources().getConfiguration().orientation);
            addView(this.f6964w, f6936j);
            if (this.f6945I != null) {
                C1808r.m8931a((View) this.f6945I);
                this.f6945I.mo7377a(this.f6966y, true);
                if (C1678a.m8407b(getContext())) {
                    this.f6945I.mo7378a(this.f6957p.mo6748a(), this.f6957p.mo6757g());
                }
                addView(this.f6945I, new LayoutParams(-1, f6933g));
            }
            setLayoutParams(f6936j);
            this.f6939C.mo6643a((View) this);
        }
    }

    /* renamed from: a */
    public void mo6772a(Bundle bundle) {
    }

    /* renamed from: a */
    public void mo6773a(boolean z) {
        if (this.f6938B != null && !this.f6938B.mo7448k()) {
            this.f6946J = this.f6938B.getVideoStartReason();
            this.f6950N = z;
            this.f6938B.mo7425a(false);
        }
    }

    /* renamed from: b */
    public void mo7651b() {
        if (this.f6938B != null) {
            this.f6938B.mo7429e();
            this.f6938B.mo7447j();
        }
        if (this.f6959r != null) {
            this.f6959r.mo7111c();
        }
    }

    /* renamed from: b */
    public void mo6774b(boolean z) {
        if (this.f6938B != null && !this.f6938B.mo7449l() && this.f6938B.getState() != C2101d.PLAYBACK_COMPLETED && this.f6946J != null) {
            if (!this.f6950N || z) {
                this.f6938B.mo7422a(this.f6946J);
            }
        }
    }

    public int getCurrentPosition() {
        if (this.f6938B != null) {
            return this.f6938B.getCurrentPositionInMillis();
        }
        return 0;
    }

    public void onConfigurationChanged(Configuration configuration) {
        if (this.f6940D != null) {
            this.f6940D.mo7401a(configuration.orientation);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f6961t.mo7069a(motionEvent, this, this);
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* access modifiers changed from: 0000 */
    public void setEndCardController(C1976b bVar) {
        this.f6948L = bVar;
    }

    public void setListener(C1845a aVar) {
    }
}
