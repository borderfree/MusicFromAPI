package com.seattleclouds.previewer;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.support.p009v4.app.C0367h;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.RelativeLayout;
import com.keymob.KeyMobManager.OnKeyMobBannerLoadedListener;
import com.keymob.KeyMobManager.OnKeyMobInitListener;
import com.seattleclouds.C5332e;
import com.seattleclouds.C5376g;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.ads.p156b.C5248a;

/* renamed from: com.seattleclouds.previewer.f */
public class C6483f extends C5376g {

    /* renamed from: d */
    private View f23014d;

    /* renamed from: e */
    private FrameLayout f23015e;

    /* renamed from: f */
    private OnKeyMobInitListener f23016f;

    /* renamed from: g */
    private OnKeyMobBannerLoadedListener f23017g;

    /* renamed from: h */
    private C6488a f23018h;

    /* renamed from: i */
    private boolean f23019i = true;

    /* renamed from: com.seattleclouds.previewer.f$a */
    private static abstract class C6488a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public int f23024a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public Handler f23025b = new Handler();
        /* access modifiers changed from: private */

        /* renamed from: c */
        public Runnable f23026c = new Runnable() {
            public void run() {
                if (C6488a.this.f23028e) {
                    C6488a.this.mo20167a();
                    if (C6488a.this.f23028e) {
                        C6488a.this.f23025b.postDelayed(C6488a.this.f23026c, (long) C6488a.this.f23024a);
                    }
                }
            }
        };

        /* renamed from: d */
        private Runnable f23027d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public boolean f23028e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public boolean f23029f;

        public C6488a(int i) {
            this.f23024a = i;
        }

        /* renamed from: a */
        public abstract void mo20167a();

        /* renamed from: a */
        public void mo20168a(int i) {
            if (this.f23027d == null) {
                this.f23027d = new Runnable() {
                    public void run() {
                        C6488a.this.f23029f = false;
                        C6488a.this.mo20170c();
                    }
                };
            }
            if (this.f23029f) {
                this.f23025b.removeCallbacks(this.f23027d);
            }
            this.f23025b.postDelayed(this.f23027d, (long) i);
            this.f23029f = true;
        }

        /* renamed from: b */
        public void mo20169b() {
            if (!this.f23028e) {
                this.f23028e = true;
                this.f23025b.postDelayed(this.f23026c, (long) this.f23024a);
            }
            if (this.f23029f) {
                this.f23029f = false;
                this.f23025b.removeCallbacks(this.f23027d);
            }
        }

        /* renamed from: c */
        public void mo20170c() {
            if (this.f23028e) {
                this.f23028e = false;
                this.f23025b.removeCallbacks(this.f23026c);
            }
            if (this.f23029f) {
                this.f23029f = false;
                this.f23025b.removeCallbacks(this.f23027d);
            }
        }

        /* renamed from: d */
        public boolean mo20171d() {
            return this.f23029f;
        }
    }

    public C6483f(C5332e eVar) {
        super(eVar);
    }

    /* renamed from: a */
    private void m31391a(View view) {
        if (this.f23015e != null) {
            m31393b(view);
            this.f23015e.addView(view);
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            layoutParams.gravity = 1;
            view.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: b */
    private void m31393b(View view) {
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(view);
        }
    }

    /* renamed from: j */
    private boolean m31394j() {
        return C6515a.m31520a(this.f19220b);
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public void m31395k() {
        boolean j = m31394j();
        int i = 0;
        if ((this.f23015e.getVisibility() != 8) != j) {
            FrameLayout frameLayout = this.f23015e;
            if (!j) {
                i = 8;
            }
            frameLayout.setVisibility(i);
        }
        if (!j) {
            m31402r();
        } else if (!C5248a.m26206f()) {
            m31397m();
        } else if (this.f19219a.mo1453c()) {
            m31396l();
        }
    }

    /* renamed from: l */
    private void m31396l() {
        View n = m31398n();
        View o = m31399o();
        if (n == null || o != null) {
            if (o != null) {
                if (n != null) {
                    m31393b(n);
                }
                m31391a(o);
                this.f23019i = true;
                m31401q();
            } else if (this.f23019i) {
                C5248a.m26200a(true, mo17610a());
                this.f23019i = false;
                View o2 = m31399o();
                if (o2 != null) {
                    m31391a(o2);
                    this.f23019i = true;
                } else {
                    m31400p();
                }
            }
        }
    }

    /* renamed from: m */
    private void m31397m() {
        if (m31394j() && !C5248a.m26206f()) {
            if (this.f23016f == null) {
                this.f23016f = new OnKeyMobInitListener() {
                    public void onKeyMobInitSuccess() {
                        C6483f.this.m31395k();
                    }
                };
            }
            C5248a.m26199a(this.f23016f);
            if (!C5248a.m26205e()) {
                C5248a.m26197a((Activity) mo17610a());
            }
        }
    }

    /* renamed from: n */
    private View m31398n() {
        if (this.f23015e == null || this.f23015e.getChildCount() <= 0) {
            return null;
        }
        return this.f23015e.getChildAt(0);
    }

    /* renamed from: o */
    private View m31399o() {
        C0367h a = mo17610a();
        if (a == null) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) a.findViewById(16908290);
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        if (childCount < 2) {
            return null;
        }
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt != this.f23014d && (childAt instanceof RelativeLayout)) {
                RelativeLayout relativeLayout = (RelativeLayout) childAt;
                if (relativeLayout.getChildCount() > 0) {
                    return relativeLayout.getChildAt(0);
                }
            }
        }
        return null;
    }

    /* renamed from: p */
    private void m31400p() {
        if (this.f23017g == null) {
            this.f23017g = new OnKeyMobBannerLoadedListener() {
                public void onKeyMobBannerLoaded() {
                    C6483f.this.m31395k();
                }
            };
        }
        C5248a.m26198a(this.f23017g);
        if (this.f23018h == null) {
            this.f23018h = new C6488a(100) {
                /* renamed from: a */
                public void mo20167a() {
                    C6483f.this.m31395k();
                }
            };
        }
        this.f23018h.mo20169b();
    }

    /* renamed from: q */
    private void m31401q() {
        if (this.f23018h != null && !this.f23018h.mo20171d()) {
            this.f23018h.mo20168a(1000);
        }
    }

    /* renamed from: r */
    private void m31402r() {
        View n = m31398n();
        if (n != null) {
            m31393b(n);
        }
        C5248a.m26207g();
    }

    /* renamed from: s */
    private void m31403s() {
        C6514i.m31517a(this.f19220b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo17615a(Menu menu) {
        MenuItem findItem = menu.findItem(C5458g.previewer_settings);
        if (findItem != null && !findItem.isVisible() && C5248a.m26201a()) {
            findItem.setVisible(true);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo17617a(View view, Bundle bundle) {
        if (view != null) {
            this.f23014d = view;
            this.f23015e = (FrameLayout) view.findViewById(C5458g.previewer_banner_container);
            if (this.f23015e != null) {
                this.f23015e.removeAllViews();
                this.f23015e.setVisibility(m31394j() ? 0 : 8);
            }
            C6515a.m31518a((C6517a) new C6517a() {
                /* renamed from: a */
                public void mo20166a() {
                    C6483f.this.m31395k();
                }
            });
        }
    }

    /* renamed from: a */
    public boolean mo17619a(MenuItem menuItem) {
        if (menuItem.getItemId() != C5458g.previewer_settings) {
            return false;
        }
        m31403s();
        return true;
    }

    /* renamed from: b */
    public int mo17620b() {
        if (this.f19219a instanceof C6452c) {
            return C5460i.fragment_previewer_apps_with_ad;
        }
        if (this.f19219a instanceof C6448b) {
            return C5460i.fragment_previewer_app_view_with_ad;
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo17624c() {
        m31395k();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo17628f() {
        m31401q();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo17630h() {
        C5248a.m26199a((OnKeyMobInitListener) null);
        C5248a.m26198a((OnKeyMobBannerLoadedListener) null);
        C6515a.m31518a((C6517a) null);
        if (this.f23018h != null) {
            this.f23018h.mo20170c();
        }
    }
}
