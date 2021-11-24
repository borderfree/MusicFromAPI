package android.support.p023v7.app;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p009v4.app.C0417w;
import android.support.p009v4.view.C0591aa;
import android.support.p009v4.view.C0605e;
import android.support.p009v4.view.C0622o;
import android.support.p009v4.view.C0626s;
import android.support.p009v4.view.C0647w;
import android.support.p009v4.view.C0651x;
import android.support.p009v4.view.C0652y;
import android.support.p023v7.p024a.C0726a.C0727a;
import android.support.p023v7.p024a.C0726a.C0729c;
import android.support.p023v7.p024a.C0726a.C0732f;
import android.support.p023v7.p024a.C0726a.C0733g;
import android.support.p023v7.p024a.C0726a.C0735i;
import android.support.p023v7.p024a.C0726a.C0736j;
import android.support.p023v7.p026c.p027a.C0817b;
import android.support.p023v7.view.C0827b;
import android.support.p023v7.view.C0827b.C0828a;
import android.support.p023v7.view.C0830d;
import android.support.p023v7.view.menu.C0852f;
import android.support.p023v7.view.menu.C0855h;
import android.support.p023v7.view.menu.C0855h.C0856a;
import android.support.p023v7.view.menu.C0871o;
import android.support.p023v7.view.menu.C0871o.C0872a;
import android.support.p023v7.view.menu.C0873p;
import android.support.p023v7.widget.ActionBarContextView;
import android.support.p023v7.widget.C0998ad;
import android.support.p023v7.widget.C1021aj;
import android.support.p023v7.widget.C1021aj.C1022a;
import android.support.p023v7.widget.C1087bp;
import android.support.p023v7.widget.C1094bs;
import android.support.p023v7.widget.C1111k;
import android.support.p023v7.widget.ContentFrameLayout;
import android.support.p023v7.widget.ContentFrameLayout.C0911a;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.LayoutInflater.Factory;
import android.view.LayoutInflater.Factory2;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.Window;
import android.view.Window.Callback;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: android.support.v7.app.l */
class C0782l extends C0770h implements C0856a, Factory2 {

    /* renamed from: t */
    private static final boolean f2272t = (VERSION.SDK_INT < 21);

    /* renamed from: A */
    private View f2273A;

    /* renamed from: B */
    private boolean f2274B;

    /* renamed from: C */
    private boolean f2275C;

    /* renamed from: D */
    private boolean f2276D;

    /* renamed from: E */
    private C0794d[] f2277E;

    /* renamed from: F */
    private C0794d f2278F;

    /* renamed from: G */
    private boolean f2279G;

    /* renamed from: H */
    private final Runnable f2280H = new Runnable() {
        public void run() {
            if ((C0782l.this.f2291s & 1) != 0) {
                C0782l.this.mo3163f(0);
            }
            if ((C0782l.this.f2291s & 4096) != 0) {
                C0782l.this.mo3163f(108);
            }
            C0782l.this.f2290r = false;
            C0782l.this.f2291s = 0;
        }
    };

    /* renamed from: I */
    private boolean f2281I;

    /* renamed from: J */
    private Rect f2282J;

    /* renamed from: K */
    private Rect f2283K;

    /* renamed from: L */
    private AppCompatViewInflater f2284L;

    /* renamed from: m */
    C0827b f2285m;

    /* renamed from: n */
    ActionBarContextView f2286n;

    /* renamed from: o */
    PopupWindow f2287o;

    /* renamed from: p */
    Runnable f2288p;

    /* renamed from: q */
    C0647w f2289q = null;

    /* renamed from: r */
    boolean f2290r;

    /* renamed from: s */
    int f2291s;

    /* renamed from: u */
    private C0998ad f2292u;

    /* renamed from: v */
    private C0790a f2293v;

    /* renamed from: w */
    private C0795e f2294w;

    /* renamed from: x */
    private boolean f2295x;

    /* renamed from: y */
    private ViewGroup f2296y;

    /* renamed from: z */
    private TextView f2297z;

    /* renamed from: android.support.v7.app.l$a */
    private final class C0790a implements C0872a {
        C0790a() {
        }

        /* renamed from: a */
        public void mo3176a(C0855h hVar, boolean z) {
            C0782l.this.mo3159b(hVar);
        }

        /* renamed from: a */
        public boolean mo3177a(C0855h hVar) {
            Callback r = C0782l.this.mo3132r();
            if (r != null) {
                r.onMenuOpened(108, hVar);
            }
            return true;
        }
    }

    /* renamed from: android.support.v7.app.l$b */
    class C0791b implements C0828a {

        /* renamed from: b */
        private C0828a f2307b;

        public C0791b(C0828a aVar) {
            this.f2307b = aVar;
        }

        /* renamed from: a */
        public void mo3178a(C0827b bVar) {
            this.f2307b.mo3178a(bVar);
            if (C0782l.this.f2287o != null) {
                C0782l.this.f2241b.getDecorView().removeCallbacks(C0782l.this.f2288p);
            }
            if (C0782l.this.f2286n != null) {
                C0782l.this.mo3168u();
                C0782l.this.f2289q = C0626s.m2868k(C0782l.this.f2286n).mo2553a(0.0f);
                C0782l.this.f2289q.mo2555a((C0651x) new C0652y() {
                    /* renamed from: b */
                    public void mo2567b(View view) {
                        C0782l.this.f2286n.setVisibility(8);
                        if (C0782l.this.f2287o != null) {
                            C0782l.this.f2287o.dismiss();
                        } else if (C0782l.this.f2286n.getParent() instanceof View) {
                            C0626s.m2872o((View) C0782l.this.f2286n.getParent());
                        }
                        C0782l.this.f2286n.removeAllViews();
                        C0782l.this.f2289q.mo2555a((C0651x) null);
                        C0782l.this.f2289q = null;
                    }
                });
            }
            if (C0782l.this.f2244e != null) {
                C0782l.this.f2244e.mo3077b(C0782l.this.f2285m);
            }
            C0782l.this.f2285m = null;
        }

        /* renamed from: a */
        public boolean mo3179a(C0827b bVar, Menu menu) {
            return this.f2307b.mo3179a(bVar, menu);
        }

        /* renamed from: a */
        public boolean mo3180a(C0827b bVar, MenuItem menuItem) {
            return this.f2307b.mo3180a(bVar, menuItem);
        }

        /* renamed from: b */
        public boolean mo3181b(C0827b bVar, Menu menu) {
            return this.f2307b.mo3181b(bVar, menu);
        }
    }

    /* renamed from: android.support.v7.app.l$c */
    private class C0793c extends ContentFrameLayout {
        public C0793c(Context context) {
            super(context);
        }

        /* renamed from: a */
        private boolean m3731a(int i, int i2) {
            return i < -5 || i2 < -5 || i > getWidth() + 5 || i2 > getHeight() + 5;
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return C0782l.this.mo3123a(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !m3731a((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            C0782l.this.mo3162e(0);
            return true;
        }

        public void setBackgroundResource(int i) {
            setBackgroundDrawable(C0817b.m3884b(getContext(), i));
        }
    }

    /* renamed from: android.support.v7.app.l$d */
    protected static final class C0794d {

        /* renamed from: a */
        int f2310a;

        /* renamed from: b */
        int f2311b;

        /* renamed from: c */
        int f2312c;

        /* renamed from: d */
        int f2313d;

        /* renamed from: e */
        int f2314e;

        /* renamed from: f */
        int f2315f;

        /* renamed from: g */
        ViewGroup f2316g;

        /* renamed from: h */
        View f2317h;

        /* renamed from: i */
        View f2318i;

        /* renamed from: j */
        C0855h f2319j;

        /* renamed from: k */
        C0852f f2320k;

        /* renamed from: l */
        Context f2321l;

        /* renamed from: m */
        boolean f2322m;

        /* renamed from: n */
        boolean f2323n;

        /* renamed from: o */
        boolean f2324o;

        /* renamed from: p */
        public boolean f2325p;

        /* renamed from: q */
        boolean f2326q = false;

        /* renamed from: r */
        boolean f2327r;

        /* renamed from: s */
        Bundle f2328s;

        C0794d(int i) {
            this.f2310a = i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C0873p mo3185a(C0872a aVar) {
            if (this.f2319j == null) {
                return null;
            }
            if (this.f2320k == null) {
                this.f2320k = new C0852f(this.f2321l, C0733g.abc_list_menu_item_layout);
                this.f2320k.mo323a(aVar);
                this.f2319j.mo3486a((C0871o) this.f2320k);
            }
            return this.f2320k.mo3454a(this.f2316g);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo3186a(Context context) {
            TypedValue typedValue = new TypedValue();
            Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(C0727a.actionBarPopupTheme, typedValue, true);
            if (typedValue.resourceId != 0) {
                newTheme.applyStyle(typedValue.resourceId, true);
            }
            newTheme.resolveAttribute(C0727a.panelMenuListTheme, typedValue, true);
            newTheme.applyStyle(typedValue.resourceId != 0 ? typedValue.resourceId : C0735i.Theme_AppCompat_CompactMenu, true);
            C0830d dVar = new C0830d(context, 0);
            dVar.getTheme().setTo(newTheme);
            this.f2321l = dVar;
            TypedArray obtainStyledAttributes = dVar.obtainStyledAttributes(C0736j.AppCompatTheme);
            this.f2311b = obtainStyledAttributes.getResourceId(C0736j.AppCompatTheme_panelBackground, 0);
            this.f2315f = obtainStyledAttributes.getResourceId(C0736j.AppCompatTheme_android_windowAnimationStyle, 0);
            obtainStyledAttributes.recycle();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo3187a(C0855h hVar) {
            if (hVar != this.f2319j) {
                if (this.f2319j != null) {
                    this.f2319j.mo3504b((C0871o) this.f2320k);
                }
                this.f2319j = hVar;
                if (!(hVar == null || this.f2320k == null)) {
                    hVar.mo3486a((C0871o) this.f2320k);
                }
            }
        }

        /* renamed from: a */
        public boolean mo3188a() {
            boolean z = false;
            if (this.f2317h == null) {
                return false;
            }
            if (this.f2318i != null) {
                return true;
            }
            if (this.f2320k.mo3457d().getCount() > 0) {
                z = true;
            }
            return z;
        }
    }

    /* renamed from: android.support.v7.app.l$e */
    private final class C0795e implements C0872a {
        C0795e() {
        }

        /* renamed from: a */
        public void mo3176a(C0855h hVar, boolean z) {
            C0855h p = hVar.mo3535p();
            boolean z2 = p != hVar;
            C0782l lVar = C0782l.this;
            if (z2) {
                hVar = p;
            }
            C0794d a = lVar.mo3154a((Menu) hVar);
            if (a == null) {
                return;
            }
            if (z2) {
                C0782l.this.mo3155a(a.f2310a, a, p);
                C0782l.this.mo3156a(a, true);
                return;
            }
            C0782l.this.mo3156a(a, z);
        }

        /* renamed from: a */
        public boolean mo3177a(C0855h hVar) {
            if (hVar == null && C0782l.this.f2247h) {
                Callback r = C0782l.this.mo3132r();
                if (r != null && !C0782l.this.mo3131q()) {
                    r.onMenuOpened(108, hVar);
                }
            }
            return true;
        }
    }

    C0782l(Context context, Window window, C0768f fVar) {
        super(context, window, fVar);
    }

    /* renamed from: A */
    private void m3659A() {
        if (this.f2295x) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* renamed from: a */
    private void m3660a(C0794d dVar, KeyEvent keyEvent) {
        int i;
        if (!dVar.f2324o && !mo3131q()) {
            if (dVar.f2310a == 0) {
                if ((this.f2240a.getResources().getConfiguration().screenLayout & 15) == 4) {
                    return;
                }
            }
            Callback r = mo3132r();
            if (r == null || r.onMenuOpened(dVar.f2310a, dVar.f2319j)) {
                WindowManager windowManager = (WindowManager) this.f2240a.getSystemService("window");
                if (windowManager != null && m3666b(dVar, keyEvent)) {
                    if (dVar.f2316g == null || dVar.f2326q) {
                        if (dVar.f2316g == null) {
                            if (!m3662a(dVar) || dVar.f2316g == null) {
                                return;
                            }
                        } else if (dVar.f2326q && dVar.f2316g.getChildCount() > 0) {
                            dVar.f2316g.removeAllViews();
                        }
                        if (m3667c(dVar) && dVar.mo3188a()) {
                            LayoutParams layoutParams = dVar.f2317h.getLayoutParams();
                            if (layoutParams == null) {
                                layoutParams = new LayoutParams(-2, -2);
                            }
                            dVar.f2316g.setBackgroundResource(dVar.f2311b);
                            ViewParent parent = dVar.f2317h.getParent();
                            if (parent != null && (parent instanceof ViewGroup)) {
                                ((ViewGroup) parent).removeView(dVar.f2317h);
                            }
                            dVar.f2316g.addView(dVar.f2317h, layoutParams);
                            if (!dVar.f2317h.hasFocus()) {
                                dVar.f2317h.requestFocus();
                            }
                        }
                    } else if (dVar.f2318i != null) {
                        LayoutParams layoutParams2 = dVar.f2318i.getLayoutParams();
                        if (layoutParams2 != null && layoutParams2.width == -1) {
                            i = -1;
                            dVar.f2323n = false;
                            WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i, -2, dVar.f2313d, dVar.f2314e, 1002, 8519680, -3);
                            layoutParams3.gravity = dVar.f2312c;
                            layoutParams3.windowAnimations = dVar.f2315f;
                            windowManager.addView(dVar.f2316g, layoutParams3);
                            dVar.f2324o = true;
                        }
                    }
                    i = -2;
                    dVar.f2323n = false;
                    WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i, -2, dVar.f2313d, dVar.f2314e, 1002, 8519680, -3);
                    layoutParams32.gravity = dVar.f2312c;
                    layoutParams32.windowAnimations = dVar.f2315f;
                    windowManager.addView(dVar.f2316g, layoutParams32);
                    dVar.f2324o = true;
                }
            } else {
                mo3156a(dVar, true);
            }
        }
    }

    /* renamed from: a */
    private void m3661a(C0855h hVar, boolean z) {
        if (this.f2292u == null || !this.f2292u.mo3790e() || (ViewConfiguration.get(this.f2240a).hasPermanentMenuKey() && !this.f2292u.mo3793g())) {
            C0794d a = mo3153a(0, true);
            a.f2326q = true;
            mo3156a(a, false);
            m3660a(a, (KeyEvent) null);
            return;
        }
        Callback r = mo3132r();
        if (this.f2292u.mo3791f() && z) {
            this.f2292u.mo3801i();
            if (!mo3131q()) {
                r.onPanelClosed(108, mo3153a(0, true).f2319j);
            }
        } else if (r != null && !mo3131q()) {
            if (this.f2290r && (this.f2291s & 1) != 0) {
                this.f2241b.getDecorView().removeCallbacks(this.f2280H);
                this.f2280H.run();
            }
            C0794d a2 = mo3153a(0, true);
            if (a2.f2319j != null && !a2.f2327r && r.onPreparePanel(0, a2.f2318i, a2.f2319j)) {
                r.onMenuOpened(108, a2.f2319j);
                this.f2292u.mo3800h();
            }
        }
    }

    /* renamed from: a */
    private boolean m3662a(C0794d dVar) {
        dVar.mo3186a(mo3129o());
        dVar.f2316g = new C0793c(dVar.f2321l);
        dVar.f2312c = 81;
        return true;
    }

    /* renamed from: a */
    private boolean m3663a(C0794d dVar, int i, KeyEvent keyEvent, int i2) {
        boolean z = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((dVar.f2322m || m3666b(dVar, keyEvent)) && dVar.f2319j != null) {
            z = dVar.f2319j.performShortcut(i, keyEvent, i2);
        }
        if (z && (i2 & 1) == 0 && this.f2292u == null) {
            mo3156a(dVar, true);
        }
        return z;
    }

    /* renamed from: a */
    private boolean m3664a(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f2241b.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || C0626s.m2883z((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    /* renamed from: b */
    private boolean m3665b(C0794d dVar) {
        Context context = this.f2240a;
        if ((dVar.f2310a == 0 || dVar.f2310a == 108) && this.f2292u != null) {
            TypedValue typedValue = new TypedValue();
            Theme theme = context.getTheme();
            theme.resolveAttribute(C0727a.actionBarTheme, typedValue, true);
            Theme theme2 = null;
            if (typedValue.resourceId != 0) {
                theme2 = context.getResources().newTheme();
                theme2.setTo(theme);
                theme2.applyStyle(typedValue.resourceId, true);
                theme2.resolveAttribute(C0727a.actionBarWidgetTheme, typedValue, true);
            } else {
                theme.resolveAttribute(C0727a.actionBarWidgetTheme, typedValue, true);
            }
            if (typedValue.resourceId != 0) {
                if (theme2 == null) {
                    theme2 = context.getResources().newTheme();
                    theme2.setTo(theme);
                }
                theme2.applyStyle(typedValue.resourceId, true);
            }
            if (theme2 != null) {
                Context dVar2 = new C0830d(context, 0);
                dVar2.getTheme().setTo(theme2);
                context = dVar2;
            }
        }
        C0855h hVar = new C0855h(context);
        hVar.mo3484a((C0856a) this);
        dVar.mo3187a(hVar);
        return true;
    }

    /* renamed from: b */
    private boolean m3666b(C0794d dVar, KeyEvent keyEvent) {
        if (mo3131q()) {
            return false;
        }
        if (dVar.f2322m) {
            return true;
        }
        if (!(this.f2278F == null || this.f2278F == dVar)) {
            mo3156a(this.f2278F, false);
        }
        Callback r = mo3132r();
        if (r != null) {
            dVar.f2318i = r.onCreatePanelView(dVar.f2310a);
        }
        boolean z = dVar.f2310a == 0 || dVar.f2310a == 108;
        if (z && this.f2292u != null) {
            this.f2292u.mo3802j();
        }
        if (dVar.f2318i == null && (!z || !(mo3128n() instanceof C0798o))) {
            if (dVar.f2319j == null || dVar.f2327r) {
                if (dVar.f2319j == null && (!m3665b(dVar) || dVar.f2319j == null)) {
                    return false;
                }
                if (z && this.f2292u != null) {
                    if (this.f2293v == null) {
                        this.f2293v = new C0790a();
                    }
                    this.f2292u.mo3783a(dVar.f2319j, this.f2293v);
                }
                dVar.f2319j.mo3523g();
                if (!r.onCreatePanelMenu(dVar.f2310a, dVar.f2319j)) {
                    dVar.mo3187a((C0855h) null);
                    if (z && this.f2292u != null) {
                        this.f2292u.mo3783a(null, this.f2293v);
                    }
                    return false;
                }
                dVar.f2327r = false;
            }
            dVar.f2319j.mo3523g();
            if (dVar.f2328s != null) {
                dVar.f2319j.mo3517d(dVar.f2328s);
                dVar.f2328s = null;
            }
            if (!r.onPreparePanel(0, dVar.f2318i, dVar.f2319j)) {
                if (z && this.f2292u != null) {
                    this.f2292u.mo3783a(null, this.f2293v);
                }
                dVar.f2319j.mo3525h();
                return false;
            }
            dVar.f2325p = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            dVar.f2319j.setQwertyMode(dVar.f2325p);
            dVar.f2319j.mo3525h();
        }
        dVar.f2322m = true;
        dVar.f2323n = false;
        this.f2278F = dVar;
        return true;
    }

    /* renamed from: c */
    private boolean m3667c(C0794d dVar) {
        boolean z = true;
        if (dVar.f2318i != null) {
            dVar.f2317h = dVar.f2318i;
            return true;
        } else if (dVar.f2319j == null) {
            return false;
        } else {
            if (this.f2294w == null) {
                this.f2294w = new C0795e();
            }
            dVar.f2317h = (View) dVar.mo3185a((C0872a) this.f2294w);
            if (dVar.f2317h == null) {
                z = false;
            }
            return z;
        }
    }

    /* renamed from: d */
    private void mo3144d(int i) {
        this.f2291s = (1 << i) | this.f2291s;
        if (!this.f2290r) {
            C0626s.m2847a(this.f2241b.getDecorView(), this.f2280H);
            this.f2290r = true;
        }
    }

    /* renamed from: d */
    private boolean m3669d(int i, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() == 0) {
            C0794d a = mo3153a(i, true);
            if (!a.f2324o) {
                return m3666b(a, keyEvent);
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0070  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m3670e(int r4, android.view.KeyEvent r5) {
        /*
            r3 = this;
            android.support.v7.view.b r0 = r3.f2285m
            r1 = 0
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            r0 = 1
            android.support.v7.app.l$d r2 = r3.mo3153a(r4, r0)
            if (r4 != 0) goto L_0x0047
            android.support.v7.widget.ad r4 = r3.f2292u
            if (r4 == 0) goto L_0x0047
            android.support.v7.widget.ad r4 = r3.f2292u
            boolean r4 = r4.mo3790e()
            if (r4 == 0) goto L_0x0047
            android.content.Context r4 = r3.f2240a
            android.view.ViewConfiguration r4 = android.view.ViewConfiguration.get(r4)
            boolean r4 = r4.hasPermanentMenuKey()
            if (r4 != 0) goto L_0x0047
            android.support.v7.widget.ad r4 = r3.f2292u
            boolean r4 = r4.mo3791f()
            if (r4 != 0) goto L_0x0040
            boolean r4 = r3.mo3131q()
            if (r4 != 0) goto L_0x0067
            boolean r4 = r3.m3666b(r2, r5)
            if (r4 == 0) goto L_0x0067
            android.support.v7.widget.ad r4 = r3.f2292u
            boolean r4 = r4.mo3800h()
            goto L_0x006e
        L_0x0040:
            android.support.v7.widget.ad r4 = r3.f2292u
            boolean r4 = r4.mo3801i()
            goto L_0x006e
        L_0x0047:
            boolean r4 = r2.f2324o
            if (r4 != 0) goto L_0x0069
            boolean r4 = r2.f2323n
            if (r4 == 0) goto L_0x0050
            goto L_0x0069
        L_0x0050:
            boolean r4 = r2.f2322m
            if (r4 == 0) goto L_0x0067
            boolean r4 = r2.f2327r
            if (r4 == 0) goto L_0x005f
            r2.f2322m = r1
            boolean r4 = r3.m3666b(r2, r5)
            goto L_0x0060
        L_0x005f:
            r4 = 1
        L_0x0060:
            if (r4 == 0) goto L_0x0067
            r3.m3660a(r2, r5)
            r4 = 1
            goto L_0x006e
        L_0x0067:
            r4 = 0
            goto L_0x006e
        L_0x0069:
            boolean r4 = r2.f2324o
            r3.mo3156a(r2, r0)
        L_0x006e:
            if (r4 == 0) goto L_0x0087
            android.content.Context r5 = r3.f2240a
            java.lang.String r0 = "audio"
            java.lang.Object r5 = r5.getSystemService(r0)
            android.media.AudioManager r5 = (android.media.AudioManager) r5
            if (r5 == 0) goto L_0x0080
            r5.playSoundEffect(r1)
            goto L_0x0087
        L_0x0080:
            java.lang.String r5 = "AppCompatDelegate"
            java.lang.String r0 = "Couldn't get audio manager"
            android.util.Log.w(r5, r0)
        L_0x0087:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p023v7.app.C0782l.m3670e(int, android.view.KeyEvent):boolean");
    }

    /* renamed from: h */
    private int m3671h(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        }
        if (i == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i = 109;
        }
        return i;
    }

    /* renamed from: x */
    private void m3672x() {
        if (!this.f2295x) {
            this.f2296y = m3673y();
            CharSequence s = mo3133s();
            if (!TextUtils.isEmpty(s)) {
                mo3125b(s);
            }
            m3674z();
            mo3157a(this.f2296y);
            this.f2295x = true;
            C0794d a = mo3153a(0, false);
            if (mo3131q()) {
                return;
            }
            if (a == null || a.f2319j == null) {
                mo3144d(108);
            }
        }
    }

    /* renamed from: y */
    private ViewGroup m3673y() {
        ViewGroup viewGroup;
        TypedArray obtainStyledAttributes = this.f2240a.obtainStyledAttributes(C0736j.AppCompatTheme);
        if (obtainStyledAttributes.hasValue(C0736j.AppCompatTheme_windowActionBar)) {
            if (obtainStyledAttributes.getBoolean(C0736j.AppCompatTheme_windowNoTitle, false)) {
                mo3112c(1);
            } else if (obtainStyledAttributes.getBoolean(C0736j.AppCompatTheme_windowActionBar, false)) {
                mo3112c(108);
            }
            if (obtainStyledAttributes.getBoolean(C0736j.AppCompatTheme_windowActionBarOverlay, false)) {
                mo3112c(109);
            }
            if (obtainStyledAttributes.getBoolean(C0736j.AppCompatTheme_windowActionModeOverlay, false)) {
                mo3112c(10);
            }
            this.f2250k = obtainStyledAttributes.getBoolean(C0736j.AppCompatTheme_android_windowIsFloating, false);
            obtainStyledAttributes.recycle();
            this.f2241b.getDecorView();
            LayoutInflater from = LayoutInflater.from(this.f2240a);
            if (this.f2251l) {
                viewGroup = (ViewGroup) from.inflate(this.f2249j ? C0733g.abc_screen_simple_overlay_action_mode : C0733g.abc_screen_simple, null);
                if (VERSION.SDK_INT >= 21) {
                    C0626s.m2845a((View) viewGroup, (C0622o) new C0622o() {
                        /* renamed from: a */
                        public C0591aa mo364a(View view, C0591aa aaVar) {
                            int b = aaVar.mo2415b();
                            int g = C0782l.this.mo3164g(b);
                            if (b != g) {
                                aaVar = aaVar.mo2414a(aaVar.mo2413a(), g, aaVar.mo2416c(), aaVar.mo2417d());
                            }
                            return C0626s.m2836a(view, aaVar);
                        }
                    });
                } else {
                    ((C1021aj) viewGroup).setOnFitSystemWindowsListener(new C1022a() {
                        /* renamed from: a */
                        public void mo3172a(Rect rect) {
                            rect.top = C0782l.this.mo3164g(rect.top);
                        }
                    });
                }
            } else if (this.f2250k) {
                viewGroup = (ViewGroup) from.inflate(C0733g.abc_dialog_title_material, null);
                this.f2248i = false;
                this.f2247h = false;
            } else if (this.f2247h) {
                TypedValue typedValue = new TypedValue();
                this.f2240a.getTheme().resolveAttribute(C0727a.actionBarTheme, typedValue, true);
                viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new C0830d(this.f2240a, typedValue.resourceId) : this.f2240a).inflate(C0733g.abc_screen_toolbar, null);
                this.f2292u = (C0998ad) viewGroup.findViewById(C0732f.decor_content_parent);
                this.f2292u.setWindowCallback(mo3132r());
                if (this.f2248i) {
                    this.f2292u.mo3782a(109);
                }
                if (this.f2274B) {
                    this.f2292u.mo3782a(2);
                }
                if (this.f2275C) {
                    this.f2292u.mo3782a(5);
                }
            } else {
                viewGroup = null;
            }
            if (viewGroup != null) {
                if (this.f2292u == null) {
                    this.f2297z = (TextView) viewGroup.findViewById(C0732f.title);
                }
                C1094bs.m6005b(viewGroup);
                ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(C0732f.action_bar_activity_content);
                ViewGroup viewGroup2 = (ViewGroup) this.f2241b.findViewById(16908290);
                if (viewGroup2 != null) {
                    while (viewGroup2.getChildCount() > 0) {
                        View childAt = viewGroup2.getChildAt(0);
                        viewGroup2.removeViewAt(0);
                        contentFrameLayout.addView(childAt);
                    }
                    viewGroup2.setId(-1);
                    contentFrameLayout.setId(16908290);
                    if (viewGroup2 instanceof FrameLayout) {
                        ((FrameLayout) viewGroup2).setForeground(null);
                    }
                }
                this.f2241b.setContentView(viewGroup);
                contentFrameLayout.setAttachListener(new C0911a() {
                    /* renamed from: a */
                    public void mo3173a() {
                    }

                    /* renamed from: b */
                    public void mo3174b() {
                        C0782l.this.mo3170w();
                    }
                });
                return viewGroup;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("AppCompat does not support the current theme features: { windowActionBar: ");
            sb.append(this.f2247h);
            sb.append(", windowActionBarOverlay: ");
            sb.append(this.f2248i);
            sb.append(", android:windowIsFloating: ");
            sb.append(this.f2250k);
            sb.append(", windowActionModeOverlay: ");
            sb.append(this.f2249j);
            sb.append(", windowNoTitle: ");
            sb.append(this.f2251l);
            sb.append(" }");
            throw new IllegalArgumentException(sb.toString());
        }
        obtainStyledAttributes.recycle();
        throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
    }

    /* renamed from: z */
    private void m3674z() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.f2296y.findViewById(16908290);
        View decorView = this.f2241b.getDecorView();
        contentFrameLayout.mo4024a(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.f2240a.obtainStyledAttributes(C0736j.AppCompatTheme);
        obtainStyledAttributes.getValue(C0736j.AppCompatTheme_windowMinWidthMajor, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(C0736j.AppCompatTheme_windowMinWidthMinor, contentFrameLayout.getMinWidthMinor());
        if (obtainStyledAttributes.hasValue(C0736j.AppCompatTheme_windowFixedWidthMajor)) {
            obtainStyledAttributes.getValue(C0736j.AppCompatTheme_windowFixedWidthMajor, contentFrameLayout.getFixedWidthMajor());
        }
        if (obtainStyledAttributes.hasValue(C0736j.AppCompatTheme_windowFixedWidthMinor)) {
            obtainStyledAttributes.getValue(C0736j.AppCompatTheme_windowFixedWidthMinor, contentFrameLayout.getFixedWidthMinor());
        }
        if (obtainStyledAttributes.hasValue(C0736j.AppCompatTheme_windowFixedHeightMajor)) {
            obtainStyledAttributes.getValue(C0736j.AppCompatTheme_windowFixedHeightMajor, contentFrameLayout.getFixedHeightMajor());
        }
        if (obtainStyledAttributes.hasValue(C0736j.AppCompatTheme_windowFixedHeightMinor)) {
            obtainStyledAttributes.getValue(C0736j.AppCompatTheme_windowFixedHeightMinor, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0794d mo3153a(int i, boolean z) {
        C0794d[] dVarArr = this.f2277E;
        if (dVarArr == null || dVarArr.length <= i) {
            C0794d[] dVarArr2 = new C0794d[(i + 1)];
            if (dVarArr != null) {
                System.arraycopy(dVarArr, 0, dVarArr2, 0, dVarArr.length);
            }
            this.f2277E = dVarArr2;
            dVarArr = dVarArr2;
        }
        C0794d dVar = dVarArr[i];
        if (dVar != null) {
            return dVar;
        }
        C0794d dVar2 = new C0794d(i);
        dVarArr[i] = dVar2;
        return dVar2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C0794d mo3154a(Menu menu) {
        C0794d[] dVarArr = this.f2277E;
        int length = dVarArr != null ? dVarArr.length : 0;
        for (int i = 0; i < length; i++) {
            C0794d dVar = dVarArr[i];
            if (dVar != null && dVar.f2319j == menu) {
                return dVar;
            }
        }
        return null;
    }

    /* renamed from: a */
    public C0827b mo3099a(C0828a aVar) {
        if (aVar != null) {
            if (this.f2285m != null) {
                this.f2285m.mo3226c();
            }
            C0791b bVar = new C0791b(aVar);
            C0751a a = mo3098a();
            if (a != null) {
                this.f2285m = a.mo2984a((C0828a) bVar);
                if (!(this.f2285m == null || this.f2244e == null)) {
                    this.f2244e.mo3071a(this.f2285m);
                }
            }
            if (this.f2285m == null) {
                this.f2285m = mo3124b((C0828a) bVar);
            }
            return this.f2285m;
        }
        throw new IllegalArgumentException("ActionMode callback can not be null.");
    }

    /* renamed from: a */
    public <T extends View> T mo3100a(int i) {
        m3672x();
        return this.f2241b.findViewById(i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public View mo3143a(View view, String str, Context context, AttributeSet attributeSet) {
        if (this.f2242c instanceof Factory) {
            View onCreateView = ((Factory) this.f2242c).onCreateView(str, context, attributeSet);
            if (onCreateView != null) {
                return onCreateView;
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3155a(int i, C0794d dVar, Menu menu) {
        if (menu == null) {
            if (dVar == null && i >= 0 && i < this.f2277E.length) {
                dVar = this.f2277E[i];
            }
            if (dVar != null) {
                menu = dVar.f2319j;
            }
        }
        if ((dVar == null || dVar.f2324o) && !mo3131q()) {
            this.f2242c.onPanelClosed(i, menu);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3121a(int i, Menu menu) {
        if (i == 108) {
            C0751a a = mo3098a();
            if (a != null) {
                a.mo3011h(false);
            }
        } else if (i == 0) {
            C0794d a2 = mo3153a(i, true);
            if (a2.f2324o) {
                mo3156a(a2, false);
            }
        }
    }

    /* renamed from: a */
    public void mo3101a(Configuration configuration) {
        if (this.f2247h && this.f2295x) {
            C0751a a = mo3098a();
            if (a != null) {
                a.mo2987a(configuration);
            }
        }
        C1111k.m6081a().mo5493a(this.f2240a);
        mo3119j();
    }

    /* renamed from: a */
    public void mo3102a(Bundle bundle) {
        if ((this.f2242c instanceof Activity) && C0417w.m1925b((Activity) this.f2242c) != null) {
            C0751a n = mo3128n();
            if (n == null) {
                this.f2281I = true;
            } else {
                n.mo3007f(true);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3156a(C0794d dVar, boolean z) {
        if (!z || dVar.f2310a != 0 || this.f2292u == null || !this.f2292u.mo3791f()) {
            WindowManager windowManager = (WindowManager) this.f2240a.getSystemService("window");
            if (!(windowManager == null || !dVar.f2324o || dVar.f2316g == null)) {
                windowManager.removeView(dVar.f2316g);
                if (z) {
                    mo3155a(dVar.f2310a, dVar, null);
                }
            }
            dVar.f2322m = false;
            dVar.f2323n = false;
            dVar.f2324o = false;
            dVar.f2317h = null;
            dVar.f2326q = true;
            if (this.f2278F == dVar) {
                this.f2278F = null;
            }
            return;
        }
        mo3159b(dVar.f2319j);
    }

    /* renamed from: a */
    public void mo639a(C0855h hVar) {
        m3661a(hVar, true);
    }

    /* renamed from: a */
    public void mo3103a(View view) {
        m3672x();
        ViewGroup viewGroup = (ViewGroup) this.f2296y.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f2242c.onContentChanged();
    }

    /* renamed from: a */
    public void mo3104a(View view, LayoutParams layoutParams) {
        m3672x();
        ViewGroup viewGroup = (ViewGroup) this.f2296y.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f2242c.onContentChanged();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3157a(ViewGroup viewGroup) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo3122a(int i, KeyEvent keyEvent) {
        C0751a a = mo3098a();
        if (a != null && a.mo2993a(i, keyEvent)) {
            return true;
        }
        if (this.f2278F == null || !m3663a(this.f2278F, keyEvent.getKeyCode(), keyEvent, 1)) {
            if (this.f2278F == null) {
                C0794d a2 = mo3153a(0, true);
                m3666b(a2, keyEvent);
                boolean a3 = m3663a(a2, keyEvent.getKeyCode(), keyEvent, 1);
                a2.f2322m = false;
                if (a3) {
                    return true;
                }
            }
            return false;
        }
        if (this.f2278F != null) {
            this.f2278F.f2323n = true;
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo640a(C0855h hVar, MenuItem menuItem) {
        Callback r = mo3132r();
        if (r != null && !mo3131q()) {
            C0794d a = mo3154a((Menu) hVar.mo3535p());
            if (a != null) {
                return r.onMenuItemSelected(a.f2310a, menuItem);
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo3123a(KeyEvent keyEvent) {
        boolean z = true;
        if (keyEvent.getKeyCode() == 82 && this.f2242c.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() != 0) {
            z = false;
        }
        return z ? mo3161c(keyCode, keyEvent) : mo3160b(keyCode, keyEvent);
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002f  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.support.p023v7.view.C0827b mo3124b(android.support.p023v7.view.C0827b.C0828a r8) {
        /*
            r7 = this;
            r7.mo3168u()
            android.support.v7.view.b r0 = r7.f2285m
            if (r0 == 0) goto L_0x000c
            android.support.v7.view.b r0 = r7.f2285m
            r0.mo3226c()
        L_0x000c:
            boolean r0 = r8 instanceof android.support.p023v7.app.C0782l.C0791b
            if (r0 != 0) goto L_0x0016
            android.support.v7.app.l$b r0 = new android.support.v7.app.l$b
            r0.<init>(r8)
            r8 = r0
        L_0x0016:
            android.support.v7.app.f r0 = r7.f2244e
            r1 = 0
            if (r0 == 0) goto L_0x0028
            boolean r0 = r7.mo3131q()
            if (r0 != 0) goto L_0x0028
            android.support.v7.app.f r0 = r7.f2244e     // Catch:{ AbstractMethodError -> 0x0028 }
            android.support.v7.view.b r0 = r0.mo3069a(r8)     // Catch:{ AbstractMethodError -> 0x0028 }
            goto L_0x0029
        L_0x0028:
            r0 = r1
        L_0x0029:
            if (r0 == 0) goto L_0x002f
            r7.f2285m = r0
            goto L_0x016c
        L_0x002f:
            android.support.v7.widget.ActionBarContextView r0 = r7.f2286n
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L_0x00dc
            boolean r0 = r7.f2250k
            if (r0 == 0) goto L_0x00bd
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.Context r4 = r7.f2240a
            android.content.res.Resources$Theme r4 = r4.getTheme()
            int r5 = android.support.p023v7.p024a.C0726a.C0727a.actionBarTheme
            r4.resolveAttribute(r5, r0, r3)
            int r5 = r0.resourceId
            if (r5 == 0) goto L_0x006e
            android.content.Context r5 = r7.f2240a
            android.content.res.Resources r5 = r5.getResources()
            android.content.res.Resources$Theme r5 = r5.newTheme()
            r5.setTo(r4)
            int r4 = r0.resourceId
            r5.applyStyle(r4, r3)
            android.support.v7.view.d r4 = new android.support.v7.view.d
            android.content.Context r6 = r7.f2240a
            r4.<init>(r6, r2)
            android.content.res.Resources$Theme r6 = r4.getTheme()
            r6.setTo(r5)
            goto L_0x0070
        L_0x006e:
            android.content.Context r4 = r7.f2240a
        L_0x0070:
            android.support.v7.widget.ActionBarContextView r5 = new android.support.v7.widget.ActionBarContextView
            r5.<init>(r4)
            r7.f2286n = r5
            android.widget.PopupWindow r5 = new android.widget.PopupWindow
            int r6 = android.support.p023v7.p024a.C0726a.C0727a.actionModePopupWindowStyle
            r5.<init>(r4, r1, r6)
            r7.f2287o = r5
            android.widget.PopupWindow r5 = r7.f2287o
            r6 = 2
            android.support.p009v4.widget.C0704m.m3314a(r5, r6)
            android.widget.PopupWindow r5 = r7.f2287o
            android.support.v7.widget.ActionBarContextView r6 = r7.f2286n
            r5.setContentView(r6)
            android.widget.PopupWindow r5 = r7.f2287o
            r6 = -1
            r5.setWidth(r6)
            android.content.res.Resources$Theme r5 = r4.getTheme()
            int r6 = android.support.p023v7.p024a.C0726a.C0727a.actionBarSize
            r5.resolveAttribute(r6, r0, r3)
            int r0 = r0.data
            android.content.res.Resources r4 = r4.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            int r0 = android.util.TypedValue.complexToDimensionPixelSize(r0, r4)
            android.support.v7.widget.ActionBarContextView r4 = r7.f2286n
            r4.setContentHeight(r0)
            android.widget.PopupWindow r0 = r7.f2287o
            r4 = -2
            r0.setHeight(r4)
            android.support.v7.app.l$5 r0 = new android.support.v7.app.l$5
            r0.<init>()
            r7.f2288p = r0
            goto L_0x00dc
        L_0x00bd:
            android.view.ViewGroup r0 = r7.f2296y
            int r4 = android.support.p023v7.p024a.C0726a.C0732f.action_mode_bar_stub
            android.view.View r0 = r0.findViewById(r4)
            android.support.v7.widget.ViewStubCompat r0 = (android.support.p023v7.widget.ViewStubCompat) r0
            if (r0 == 0) goto L_0x00dc
            android.content.Context r4 = r7.mo3129o()
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            r0.setLayoutInflater(r4)
            android.view.View r0 = r0.mo4914a()
            android.support.v7.widget.ActionBarContextView r0 = (android.support.p023v7.widget.ActionBarContextView) r0
            r7.f2286n = r0
        L_0x00dc:
            android.support.v7.widget.ActionBarContextView r0 = r7.f2286n
            if (r0 == 0) goto L_0x016c
            r7.mo3168u()
            android.support.v7.widget.ActionBarContextView r0 = r7.f2286n
            r0.mo3759c()
            android.support.v7.view.e r0 = new android.support.v7.view.e
            android.support.v7.widget.ActionBarContextView r4 = r7.f2286n
            android.content.Context r4 = r4.getContext()
            android.support.v7.widget.ActionBarContextView r5 = r7.f2286n
            android.widget.PopupWindow r6 = r7.f2287o
            if (r6 != 0) goto L_0x00f7
            goto L_0x00f8
        L_0x00f7:
            r3 = 0
        L_0x00f8:
            r0.<init>(r4, r5, r8, r3)
            android.view.Menu r3 = r0.mo3223b()
            boolean r8 = r8.mo3179a(r0, r3)
            if (r8 == 0) goto L_0x016a
            r0.mo3227d()
            android.support.v7.widget.ActionBarContextView r8 = r7.f2286n
            r8.mo3756a(r0)
            r7.f2285m = r0
            boolean r8 = r7.mo3167t()
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r8 == 0) goto L_0x0134
            android.support.v7.widget.ActionBarContextView r8 = r7.f2286n
            r1 = 0
            r8.setAlpha(r1)
            android.support.v7.widget.ActionBarContextView r8 = r7.f2286n
            android.support.v4.view.w r8 = android.support.p009v4.view.C0626s.m2868k(r8)
            android.support.v4.view.w r8 = r8.mo2553a(r0)
            r7.f2289q = r8
            android.support.v4.view.w r8 = r7.f2289q
            android.support.v7.app.l$6 r0 = new android.support.v7.app.l$6
            r0.<init>()
            r8.mo2555a(r0)
            goto L_0x015a
        L_0x0134:
            android.support.v7.widget.ActionBarContextView r8 = r7.f2286n
            r8.setAlpha(r0)
            android.support.v7.widget.ActionBarContextView r8 = r7.f2286n
            r8.setVisibility(r2)
            android.support.v7.widget.ActionBarContextView r8 = r7.f2286n
            r0 = 32
            r8.sendAccessibilityEvent(r0)
            android.support.v7.widget.ActionBarContextView r8 = r7.f2286n
            android.view.ViewParent r8 = r8.getParent()
            boolean r8 = r8 instanceof android.view.View
            if (r8 == 0) goto L_0x015a
            android.support.v7.widget.ActionBarContextView r8 = r7.f2286n
            android.view.ViewParent r8 = r8.getParent()
            android.view.View r8 = (android.view.View) r8
            android.support.p009v4.view.C0626s.m2872o(r8)
        L_0x015a:
            android.widget.PopupWindow r8 = r7.f2287o
            if (r8 == 0) goto L_0x016c
            android.view.Window r8 = r7.f2241b
            android.view.View r8 = r8.getDecorView()
            java.lang.Runnable r0 = r7.f2288p
            r8.post(r0)
            goto L_0x016c
        L_0x016a:
            r7.f2285m = r1
        L_0x016c:
            android.support.v7.view.b r8 = r7.f2285m
            if (r8 == 0) goto L_0x017b
            android.support.v7.app.f r8 = r7.f2244e
            if (r8 == 0) goto L_0x017b
            android.support.v7.app.f r8 = r7.f2244e
            android.support.v7.view.b r0 = r7.f2285m
            r8.mo3071a(r0)
        L_0x017b:
            android.support.v7.view.b r8 = r7.f2285m
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p023v7.app.C0782l.mo3124b(android.support.v7.view.b$a):android.support.v7.view.b");
    }

    /* renamed from: b */
    public View mo3158b(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        AppCompatViewInflater appCompatViewInflater;
        boolean z2 = false;
        if (this.f2284L == null) {
            String string = this.f2240a.obtainStyledAttributes(C0736j.AppCompatTheme).getString(C0736j.AppCompatTheme_viewInflaterClass);
            if (string == null || AppCompatViewInflater.class.getName().equals(string)) {
                appCompatViewInflater = new AppCompatViewInflater();
            } else {
                try {
                    this.f2284L = (AppCompatViewInflater) Class.forName(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to instantiate custom view inflater ");
                    sb.append(string);
                    sb.append(". Falling back to default.");
                    Log.i("AppCompatDelegate", sb.toString(), th);
                    appCompatViewInflater = new AppCompatViewInflater();
                }
            }
            this.f2284L = appCompatViewInflater;
        }
        if (f2272t) {
            if (!(attributeSet instanceof XmlPullParser)) {
                z2 = m3664a((ViewParent) view);
            } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                z2 = true;
            }
            z = z2;
        } else {
            z = false;
        }
        return this.f2284L.mo2969a(view, str, context, attributeSet, z, f2272t, true, C1087bp.m5965a());
    }

    /* renamed from: b */
    public void mo3107b(int i) {
        m3672x();
        ViewGroup viewGroup = (ViewGroup) this.f2296y.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f2240a).inflate(i, viewGroup);
        this.f2242c.onContentChanged();
    }

    /* renamed from: b */
    public void mo3108b(Bundle bundle) {
        m3672x();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo3159b(C0855h hVar) {
        if (!this.f2276D) {
            this.f2276D = true;
            this.f2292u.mo3803k();
            Callback r = mo3132r();
            if (r != null && !mo3131q()) {
                r.onPanelClosed(108, hVar);
            }
            this.f2276D = false;
        }
    }

    /* renamed from: b */
    public void mo3109b(View view, LayoutParams layoutParams) {
        m3672x();
        ((ViewGroup) this.f2296y.findViewById(16908290)).addView(view, layoutParams);
        this.f2242c.onContentChanged();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo3125b(CharSequence charSequence) {
        if (this.f2292u != null) {
            this.f2292u.setWindowTitle(charSequence);
        } else if (mo3128n() != null) {
            mo3128n().mo3001c(charSequence);
        } else if (this.f2297z != null) {
            this.f2297z.setText(charSequence);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo3160b(int i, KeyEvent keyEvent) {
        if (i == 4) {
            boolean z = this.f2279G;
            this.f2279G = false;
            C0794d a = mo3153a(0, false);
            if (a != null && a.f2324o) {
                if (!z) {
                    mo3156a(a, true);
                }
                return true;
            } else if (mo3169v()) {
                return true;
            }
        } else if (i == 82) {
            m3670e(0, keyEvent);
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo3126b(int i, Menu menu) {
        if (i != 108) {
            return false;
        }
        C0751a a = mo3098a();
        if (a != null) {
            a.mo3011h(true);
        }
        return true;
    }

    /* renamed from: c */
    public boolean mo3112c(int i) {
        int h = m3671h(i);
        if (this.f2251l && h == 108) {
            return false;
        }
        if (this.f2247h && h == 1) {
            this.f2247h = false;
        }
        switch (h) {
            case 1:
                m3659A();
                this.f2251l = true;
                return true;
            case 2:
                m3659A();
                this.f2274B = true;
                return true;
            case 5:
                m3659A();
                this.f2275C = true;
                return true;
            case 10:
                m3659A();
                this.f2249j = true;
                return true;
            case 108:
                m3659A();
                this.f2247h = true;
                return true;
            case 109:
                m3659A();
                this.f2248i = true;
                return true;
            default:
                return this.f2241b.requestFeature(h);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo3161c(int i, KeyEvent keyEvent) {
        boolean z = true;
        if (i == 4) {
            if ((keyEvent.getFlags() & 128) == 0) {
                z = false;
            }
            this.f2279G = z;
        } else if (i == 82) {
            m3669d(0, keyEvent);
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public void mo3113d() {
        C0751a a = mo3098a();
        if (a != null) {
            a.mo3009g(false);
        }
    }

    /* renamed from: e */
    public void mo3114e() {
        C0751a a = mo3098a();
        if (a != null) {
            a.mo3009g(true);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo3162e(int i) {
        mo3156a(mo3153a(i, true), true);
    }

    /* renamed from: f */
    public void mo3115f() {
        C0751a a = mo3098a();
        if (a == null || !a.mo3012h()) {
            mo3144d(0);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo3163f(int i) {
        C0794d a = mo3153a(i, true);
        if (a.f2319j != null) {
            Bundle bundle = new Bundle();
            a.f2319j.mo3508c(bundle);
            if (bundle.size() > 0) {
                a.f2328s = bundle;
            }
            a.f2319j.mo3523g();
            a.f2319j.clear();
        }
        a.f2327r = true;
        a.f2326q = true;
        if ((i == 108 || i == 0) && this.f2292u != null) {
            C0794d a2 = mo3153a(0, false);
            if (a2 != null) {
                a2.f2322m = false;
                m3666b(a2, (KeyEvent) null);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public int mo3164g(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        int i2 = 0;
        if (this.f2286n == null || !(this.f2286n.getLayoutParams() instanceof MarginLayoutParams)) {
            z = false;
        } else {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f2286n.getLayoutParams();
            z = true;
            if (this.f2286n.isShown()) {
                if (this.f2282J == null) {
                    this.f2282J = new Rect();
                    this.f2283K = new Rect();
                }
                Rect rect = this.f2282J;
                Rect rect2 = this.f2283K;
                rect.set(0, i, 0, 0);
                C1094bs.m6003a(this.f2296y, rect, rect2);
                if (marginLayoutParams.topMargin != (rect2.top == 0 ? i : 0)) {
                    marginLayoutParams.topMargin = i;
                    if (this.f2273A == null) {
                        this.f2273A = new View(this.f2240a);
                        this.f2273A.setBackgroundColor(this.f2240a.getResources().getColor(C0729c.abc_input_method_navigation_guard));
                        this.f2296y.addView(this.f2273A, -1, new LayoutParams(-1, i));
                    } else {
                        LayoutParams layoutParams = this.f2273A.getLayoutParams();
                        if (layoutParams.height != i) {
                            layoutParams.height = i;
                            this.f2273A.setLayoutParams(layoutParams);
                        }
                    }
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (this.f2273A == null) {
                    z = false;
                }
                if (!this.f2249j && z) {
                    i = 0;
                }
            } else {
                if (marginLayoutParams.topMargin != 0) {
                    marginLayoutParams.topMargin = 0;
                    z3 = true;
                } else {
                    z3 = false;
                }
                z = false;
            }
            if (z2) {
                this.f2286n.setLayoutParams(marginLayoutParams);
            }
        }
        if (this.f2273A != null) {
            View view = this.f2273A;
            if (!z) {
                i2 = 8;
            }
            view.setVisibility(i2);
        }
        return i;
    }

    /* renamed from: g */
    public void mo3116g() {
        if (this.f2290r) {
            this.f2241b.getDecorView().removeCallbacks(this.f2280H);
        }
        super.mo3116g();
        if (this.f2245f != null) {
            this.f2245f.mo3014j();
        }
    }

    /* renamed from: i */
    public void mo3118i() {
        LayoutInflater from = LayoutInflater.from(this.f2240a);
        if (from.getFactory() == null) {
            C0605e.m2744b(from, this);
        } else if (!(from.getFactory2() instanceof C0782l)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3127m() {
        /*
            r3 = this;
            r3.m3672x()
            boolean r0 = r3.f2247h
            if (r0 == 0) goto L_0x003b
            android.support.v7.app.a r0 = r3.f2245f
            if (r0 == 0) goto L_0x000c
            goto L_0x003b
        L_0x000c:
            android.view.Window$Callback r0 = r3.f2242c
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L_0x0020
            android.support.v7.app.r r0 = new android.support.v7.app.r
            android.view.Window$Callback r1 = r3.f2242c
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r2 = r3.f2248i
            r0.<init>(r1, r2)
        L_0x001d:
            r3.f2245f = r0
            goto L_0x0030
        L_0x0020:
            android.view.Window$Callback r0 = r3.f2242c
            boolean r0 = r0 instanceof android.app.Dialog
            if (r0 == 0) goto L_0x0030
            android.support.v7.app.r r0 = new android.support.v7.app.r
            android.view.Window$Callback r1 = r3.f2242c
            android.app.Dialog r1 = (android.app.Dialog) r1
            r0.<init>(r1)
            goto L_0x001d
        L_0x0030:
            android.support.v7.app.a r0 = r3.f2245f
            if (r0 == 0) goto L_0x003b
            android.support.v7.app.a r0 = r3.f2245f
            boolean r1 = r3.f2281I
            r0.mo3007f(r1)
        L_0x003b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p023v7.app.C0782l.mo3127m():void");
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View a = mo3143a(view, str, context, attributeSet);
        return a != null ? a : mo3158b(view, str, context, attributeSet);
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: t */
    public final boolean mo3167t() {
        return this.f2295x && this.f2296y != null && C0626s.m2880w(this.f2296y);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: u */
    public void mo3168u() {
        if (this.f2289q != null) {
            this.f2289q.mo2560b();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: v */
    public boolean mo3169v() {
        if (this.f2285m != null) {
            this.f2285m.mo3226c();
            return true;
        }
        C0751a a = mo3098a();
        return a != null && a.mo3013i();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: w */
    public void mo3170w() {
        if (this.f2292u != null) {
            this.f2292u.mo3803k();
        }
        if (this.f2287o != null) {
            this.f2241b.getDecorView().removeCallbacks(this.f2288p);
            if (this.f2287o.isShowing()) {
                try {
                    this.f2287o.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f2287o = null;
        }
        mo3168u();
        C0794d a = mo3153a(0, false);
        if (a != null && a.f2319j != null) {
            a.f2319j.close();
        }
    }
}
