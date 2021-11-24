package android.support.p023v7.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.p009v4.app.C0367h;
import android.support.p009v4.app.C0396q;
import android.support.p009v4.view.C0626s;
import android.support.p009v4.view.C0647w;
import android.support.p009v4.view.C0651x;
import android.support.p009v4.view.C0652y;
import android.support.p009v4.view.C0653z;
import android.support.p023v7.app.C0751a.C0752a;
import android.support.p023v7.app.C0751a.C0753b;
import android.support.p023v7.app.C0751a.C0754c;
import android.support.p023v7.app.C0751a.C0755d;
import android.support.p023v7.p024a.C0726a.C0727a;
import android.support.p023v7.p024a.C0726a.C0732f;
import android.support.p023v7.p024a.C0726a.C0736j;
import android.support.p023v7.view.C0826a;
import android.support.p023v7.view.C0827b;
import android.support.p023v7.view.C0827b.C0828a;
import android.support.p023v7.view.C0834g;
import android.support.p023v7.view.C0837h;
import android.support.p023v7.view.menu.C0855h;
import android.support.p023v7.view.menu.C0855h.C0856a;
import android.support.p023v7.widget.ActionBarContainer;
import android.support.p023v7.widget.ActionBarContextView;
import android.support.p023v7.widget.ActionBarOverlayLayout;
import android.support.p023v7.widget.ActionBarOverlayLayout.C0887a;
import android.support.p023v7.widget.C0999ae;
import android.support.p023v7.widget.C1061bb;
import android.support.p023v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: android.support.v7.app.r */
public class C0804r extends C0751a implements C0887a {

    /* renamed from: s */
    static final /* synthetic */ boolean f2362s = (!C0804r.class.desiredAssertionStatus());

    /* renamed from: t */
    private static final Interpolator f2363t = new AccelerateInterpolator();

    /* renamed from: u */
    private static final Interpolator f2364u = new DecelerateInterpolator();

    /* renamed from: A */
    private int f2365A = -1;

    /* renamed from: B */
    private boolean f2366B;

    /* renamed from: C */
    private boolean f2367C;

    /* renamed from: D */
    private ArrayList<C0753b> f2368D = new ArrayList<>();

    /* renamed from: E */
    private boolean f2369E;

    /* renamed from: F */
    private int f2370F = 0;

    /* renamed from: G */
    private boolean f2371G;

    /* renamed from: H */
    private boolean f2372H = true;

    /* renamed from: I */
    private boolean f2373I;

    /* renamed from: a */
    Context f2374a;

    /* renamed from: b */
    ActionBarOverlayLayout f2375b;

    /* renamed from: c */
    ActionBarContainer f2376c;

    /* renamed from: d */
    C0999ae f2377d;

    /* renamed from: e */
    ActionBarContextView f2378e;

    /* renamed from: f */
    View f2379f;

    /* renamed from: g */
    C1061bb f2380g;

    /* renamed from: h */
    C0808a f2381h;

    /* renamed from: i */
    C0827b f2382i;

    /* renamed from: j */
    C0828a f2383j;

    /* renamed from: k */
    boolean f2384k = true;

    /* renamed from: l */
    boolean f2385l;

    /* renamed from: m */
    boolean f2386m;

    /* renamed from: n */
    C0837h f2387n;

    /* renamed from: o */
    boolean f2388o;

    /* renamed from: p */
    final C0651x f2389p = new C0652y() {
        /* renamed from: b */
        public void mo2567b(View view) {
            if (C0804r.this.f2384k && C0804r.this.f2379f != null) {
                C0804r.this.f2379f.setTranslationY(0.0f);
                C0804r.this.f2376c.setTranslationY(0.0f);
            }
            C0804r.this.f2376c.setVisibility(8);
            C0804r.this.f2376c.setTransitioning(false);
            C0804r.this.f2387n = null;
            C0804r.this.mo3209k();
            if (C0804r.this.f2375b != null) {
                C0626s.m2872o(C0804r.this.f2375b);
            }
        }
    };

    /* renamed from: q */
    final C0651x f2390q = new C0652y() {
        /* renamed from: b */
        public void mo2567b(View view) {
            C0804r.this.f2387n = null;
            C0804r.this.f2376c.requestLayout();
        }
    };

    /* renamed from: r */
    final C0653z f2391r = new C0653z() {
        /* renamed from: a */
        public void mo2569a(View view) {
            ((View) C0804r.this.f2376c.getParent()).invalidate();
        }
    };

    /* renamed from: v */
    private Context f2392v;

    /* renamed from: w */
    private Activity f2393w;

    /* renamed from: x */
    private Dialog f2394x;

    /* renamed from: y */
    private ArrayList<C0809b> f2395y = new ArrayList<>();

    /* renamed from: z */
    private C0809b f2396z;

    /* renamed from: android.support.v7.app.r$a */
    public class C0808a extends C0827b implements C0856a {

        /* renamed from: b */
        private final Context f2401b;

        /* renamed from: c */
        private final C0855h f2402c;

        /* renamed from: d */
        private C0828a f2403d;

        /* renamed from: e */
        private WeakReference<View> f2404e;

        public C0808a(Context context, C0828a aVar) {
            this.f2401b = context;
            this.f2403d = aVar;
            this.f2402c = new C0855h(context).mo3476a(1);
            this.f2402c.mo3484a((C0856a) this);
        }

        /* renamed from: a */
        public MenuInflater mo3218a() {
            return new C0834g(this.f2401b);
        }

        /* renamed from: a */
        public void mo3219a(int i) {
            mo3225b((CharSequence) C0804r.this.f2374a.getResources().getString(i));
        }

        /* renamed from: a */
        public void mo639a(C0855h hVar) {
            if (this.f2403d != null) {
                mo3227d();
                C0804r.this.f2378e.mo3757a();
            }
        }

        /* renamed from: a */
        public void mo3220a(View view) {
            C0804r.this.f2378e.setCustomView(view);
            this.f2404e = new WeakReference<>(view);
        }

        /* renamed from: a */
        public void mo3221a(CharSequence charSequence) {
            C0804r.this.f2378e.setSubtitle(charSequence);
        }

        /* renamed from: a */
        public void mo3222a(boolean z) {
            super.mo3222a(z);
            C0804r.this.f2378e.setTitleOptional(z);
        }

        /* renamed from: a */
        public boolean mo640a(C0855h hVar, MenuItem menuItem) {
            if (this.f2403d != null) {
                return this.f2403d.mo3180a((C0827b) this, menuItem);
            }
            return false;
        }

        /* renamed from: b */
        public Menu mo3223b() {
            return this.f2402c;
        }

        /* renamed from: b */
        public void mo3224b(int i) {
            mo3221a((CharSequence) C0804r.this.f2374a.getResources().getString(i));
        }

        /* renamed from: b */
        public void mo3225b(CharSequence charSequence) {
            C0804r.this.f2378e.setTitle(charSequence);
        }

        /* renamed from: c */
        public void mo3226c() {
            if (C0804r.this.f2381h == this) {
                if (!C0804r.m3795a(C0804r.this.f2385l, C0804r.this.f2386m, false)) {
                    C0804r.this.f2382i = this;
                    C0804r.this.f2383j = this.f2403d;
                } else {
                    this.f2403d.mo3178a(this);
                }
                this.f2403d = null;
                C0804r.this.mo3212l(false);
                C0804r.this.f2378e.mo3758b();
                C0804r.this.f2377d.mo4972a().sendAccessibilityEvent(32);
                C0804r.this.f2375b.setHideOnContentScrollEnabled(C0804r.this.f2388o);
                C0804r.this.f2381h = null;
            }
        }

        /* renamed from: d */
        public void mo3227d() {
            if (C0804r.this.f2381h == this) {
                this.f2402c.mo3523g();
                try {
                    this.f2403d.mo3181b(this, this.f2402c);
                } finally {
                    this.f2402c.mo3525h();
                }
            }
        }

        /* renamed from: e */
        public boolean mo3228e() {
            this.f2402c.mo3523g();
            try {
                return this.f2403d.mo3179a((C0827b) this, (Menu) this.f2402c);
            } finally {
                this.f2402c.mo3525h();
            }
        }

        /* renamed from: f */
        public CharSequence mo3229f() {
            return C0804r.this.f2378e.getTitle();
        }

        /* renamed from: g */
        public CharSequence mo3230g() {
            return C0804r.this.f2378e.getSubtitle();
        }

        /* renamed from: h */
        public boolean mo3231h() {
            return C0804r.this.f2378e.mo3760d();
        }

        /* renamed from: i */
        public View mo3232i() {
            if (this.f2404e != null) {
                return (View) this.f2404e.get();
            }
            return null;
        }
    }

    /* renamed from: android.support.v7.app.r$b */
    public class C0809b extends C0754c {

        /* renamed from: b */
        private C0755d f2406b;

        /* renamed from: c */
        private Drawable f2407c;

        /* renamed from: d */
        private CharSequence f2408d;

        /* renamed from: e */
        private CharSequence f2409e;

        /* renamed from: f */
        private int f2410f = -1;

        /* renamed from: g */
        private View f2411g;

        public C0809b() {
        }

        /* renamed from: a */
        public int mo3016a() {
            return this.f2410f;
        }

        /* renamed from: a */
        public C0754c mo3017a(C0755d dVar) {
            this.f2406b = dVar;
            return this;
        }

        /* renamed from: a */
        public C0754c mo3018a(CharSequence charSequence) {
            this.f2408d = charSequence;
            if (this.f2410f >= 0) {
                C0804r.this.f2380g.mo5295b(this.f2410f);
            }
            return this;
        }

        /* renamed from: a */
        public void mo3233a(int i) {
            this.f2410f = i;
        }

        /* renamed from: b */
        public Drawable mo3019b() {
            return this.f2407c;
        }

        /* renamed from: c */
        public CharSequence mo3020c() {
            return this.f2408d;
        }

        /* renamed from: d */
        public View mo3021d() {
            return this.f2411g;
        }

        /* renamed from: e */
        public void mo3022e() {
            C0804r.this.mo3204b((C0754c) this);
        }

        /* renamed from: f */
        public CharSequence mo3023f() {
            return this.f2409e;
        }

        /* renamed from: g */
        public C0755d mo3234g() {
            return this.f2406b;
        }
    }

    public C0804r(Activity activity, boolean z) {
        this.f2393w = activity;
        View decorView = activity.getWindow().getDecorView();
        m3794a(decorView);
        if (!z) {
            this.f2379f = decorView.findViewById(16908290);
        }
    }

    public C0804r(Dialog dialog) {
        this.f2394x = dialog;
        m3794a(dialog.getWindow().getDecorView());
    }

    /* renamed from: a */
    private void m3793a(C0754c cVar, int i) {
        C0809b bVar = (C0809b) cVar;
        if (bVar.mo3234g() != null) {
            bVar.mo3233a(i);
            this.f2395y.add(i, bVar);
            int size = this.f2395y.size();
            while (true) {
                i++;
                if (i < size) {
                    ((C0809b) this.f2395y.get(i)).mo3233a(i);
                } else {
                    return;
                }
            }
        } else {
            throw new IllegalStateException("Action Bar Tab must have a Callback");
        }
    }

    /* renamed from: a */
    private void m3794a(View view) {
        this.f2375b = (ActionBarOverlayLayout) view.findViewById(C0732f.decor_content_parent);
        if (this.f2375b != null) {
            this.f2375b.setActionBarVisibilityCallback(this);
        }
        this.f2377d = m3796b(view.findViewById(C0732f.action_bar));
        this.f2378e = (ActionBarContextView) view.findViewById(C0732f.action_context_bar);
        this.f2376c = (ActionBarContainer) view.findViewById(C0732f.action_bar_container);
        if (this.f2377d == null || this.f2378e == null || this.f2376c == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getSimpleName());
            sb.append(" can only be used ");
            sb.append("with a compatible window decor layout");
            throw new IllegalStateException(sb.toString());
        }
        this.f2374a = this.f2377d.mo4982b();
        boolean z = (this.f2377d.mo5006o() & 4) != 0;
        if (z) {
            this.f2366B = true;
        }
        C0826a a = C0826a.m3900a(this.f2374a);
        mo3004d(a.mo3283f() || z);
        m3797m(a.mo3281d());
        TypedArray obtainStyledAttributes = this.f2374a.obtainStyledAttributes(null, C0736j.ActionBar, C0727a.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(C0736j.ActionBar_hideOnContentScroll, false)) {
            mo3006e(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C0736j.ActionBar_elevation, 0);
        if (dimensionPixelSize != 0) {
            mo2985a((float) dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    static boolean m3795a(boolean z, boolean z2, boolean z3) {
        if (z3) {
            return true;
        }
        return !z && !z2;
    }

    /* renamed from: b */
    private C0999ae m3796b(View view) {
        if (view instanceof C0999ae) {
            return (C0999ae) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view);
        throw new IllegalStateException(sb.toString() != null ? view.getClass().getSimpleName() : "null");
    }

    /* renamed from: m */
    private void m3797m(boolean z) {
        this.f2369E = z;
        if (!this.f2369E) {
            this.f2377d.mo4976a((C1061bb) null);
            this.f2376c.setTabContainer(this.f2380g);
        } else {
            this.f2376c.setTabContainer(null);
            this.f2377d.mo4976a(this.f2380g);
        }
        boolean z2 = true;
        boolean z3 = mo3211l() == 2;
        if (this.f2380g != null) {
            if (z3) {
                this.f2380g.setVisibility(0);
                if (this.f2375b != null) {
                    C0626s.m2872o(this.f2375b);
                }
            } else {
                this.f2380g.setVisibility(8);
            }
        }
        this.f2377d.mo4981a(!this.f2369E && z3);
        ActionBarOverlayLayout actionBarOverlayLayout = this.f2375b;
        if (this.f2369E || !z3) {
            z2 = false;
        }
        actionBarOverlayLayout.setHasNonEmbeddedTabs(z2);
    }

    /* renamed from: n */
    private void m3798n(boolean z) {
        if (m3795a(this.f2385l, this.f2386m, this.f2371G)) {
            if (!this.f2372H) {
                this.f2372H = true;
                mo3208j(z);
            }
        } else if (this.f2372H) {
            this.f2372H = false;
            mo3210k(z);
        }
    }

    /* renamed from: r */
    private void m3799r() {
        if (this.f2380g == null) {
            C1061bb bbVar = new C1061bb(this.f2374a);
            if (this.f2369E) {
                bbVar.setVisibility(0);
                this.f2377d.mo4976a(bbVar);
            } else {
                if (mo3211l() == 2) {
                    bbVar.setVisibility(0);
                    if (this.f2375b != null) {
                        C0626s.m2872o(this.f2375b);
                    }
                } else {
                    bbVar.setVisibility(8);
                }
                this.f2376c.setTabContainer(bbVar);
            }
            this.f2380g = bbVar;
        }
    }

    /* renamed from: s */
    private void m3800s() {
        if (!this.f2371G) {
            this.f2371G = true;
            if (this.f2375b != null) {
                this.f2375b.setShowingForActionMode(true);
            }
            m3798n(false);
        }
    }

    /* renamed from: t */
    private void m3801t() {
        if (this.f2371G) {
            this.f2371G = false;
            if (this.f2375b != null) {
                this.f2375b.setShowingForActionMode(false);
            }
            m3798n(false);
        }
    }

    /* renamed from: u */
    private boolean m3802u() {
        return C0626s.m2880w(this.f2376c);
    }

    /* renamed from: a */
    public int mo2983a() {
        return this.f2377d.mo5006o();
    }

    /* renamed from: a */
    public C0827b mo2984a(C0828a aVar) {
        if (this.f2381h != null) {
            this.f2381h.mo3226c();
        }
        this.f2375b.setHideOnContentScrollEnabled(false);
        this.f2378e.mo3759c();
        C0808a aVar2 = new C0808a(this.f2378e.getContext(), aVar);
        if (!aVar2.mo3228e()) {
            return null;
        }
        this.f2381h = aVar2;
        aVar2.mo3227d();
        this.f2378e.mo3756a(aVar2);
        mo3212l(true);
        this.f2378e.sendAccessibilityEvent(32);
        return aVar2;
    }

    /* renamed from: a */
    public void mo2985a(float f) {
        C0626s.m2837a((View) this.f2376c, f);
    }

    /* renamed from: a */
    public void mo2986a(int i) {
        int p = this.f2377d.mo5007p();
        if (p == 2) {
            this.f2365A = mo3217q();
            mo3204b((C0754c) null);
            this.f2380g.setVisibility(8);
        }
        if (!(p == i || this.f2369E || this.f2375b == null)) {
            C0626s.m2872o(this.f2375b);
        }
        this.f2377d.mo4992d(i);
        boolean z = false;
        if (i == 2) {
            m3799r();
            this.f2380g.setVisibility(0);
            if (this.f2365A != -1) {
                mo3206d(this.f2365A);
                this.f2365A = -1;
            }
        }
        this.f2377d.mo4981a(i == 2 && !this.f2369E);
        ActionBarOverlayLayout actionBarOverlayLayout = this.f2375b;
        if (i == 2 && !this.f2369E) {
            z = true;
        }
        actionBarOverlayLayout.setHasNonEmbeddedTabs(z);
    }

    /* renamed from: a */
    public void mo3202a(int i, int i2) {
        int o = this.f2377d.mo5006o();
        if ((i2 & 4) != 0) {
            this.f2366B = true;
        }
        this.f2377d.mo4987c((i & i2) | ((i2 ^ -1) & o));
    }

    /* renamed from: a */
    public void mo2987a(Configuration configuration) {
        m3797m(C0826a.m3900a(this.f2374a).mo3281d());
    }

    /* renamed from: a */
    public void mo2988a(Drawable drawable) {
        this.f2376c.setPrimaryBackground(drawable);
    }

    /* renamed from: a */
    public void mo2989a(C0754c cVar) {
        mo3203a(cVar, this.f2395y.isEmpty());
    }

    /* renamed from: a */
    public void mo3203a(C0754c cVar, boolean z) {
        m3799r();
        this.f2380g.mo5296b(cVar, z);
        m3793a(cVar, this.f2395y.size());
        if (z) {
            mo3204b(cVar);
        }
    }

    /* renamed from: a */
    public void mo2990a(View view, C0752a aVar) {
        view.setLayoutParams(aVar);
        this.f2377d.mo4978a(view);
    }

    /* renamed from: a */
    public void mo2991a(CharSequence charSequence) {
        this.f2377d.mo4985b(charSequence);
    }

    /* renamed from: a */
    public void mo2992a(boolean z) {
        mo3202a(z ? 4 : 0, 4);
    }

    /* renamed from: a */
    public boolean mo2993a(int i, KeyEvent keyEvent) {
        if (this.f2381h == null) {
            return false;
        }
        Menu b = this.f2381h.mo3223b();
        if (b == null) {
            return false;
        }
        boolean z = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z = false;
        }
        b.setQwertyMode(z);
        return b.performShortcut(i, keyEvent, 0);
    }

    /* renamed from: b */
    public C0754c mo2995b() {
        return new C0809b();
    }

    /* renamed from: b */
    public void mo2996b(int i) {
        this.f2377d.mo4996f(i);
    }

    /* renamed from: b */
    public void mo2997b(Drawable drawable) {
        this.f2377d.mo4984b(drawable);
    }

    /* renamed from: b */
    public void mo3204b(C0754c cVar) {
        int i = -1;
        if (mo3211l() != 2) {
            if (cVar != null) {
                i = cVar.mo3016a();
            }
            this.f2365A = i;
            return;
        }
        C0396q a = (!(this.f2393w instanceof C0367h) || this.f2377d.mo4972a().isInEditMode()) ? null : ((C0367h) this.f2393w).mo1469g().mo1536a().mo1406a();
        if (this.f2396z != cVar) {
            C1061bb bbVar = this.f2380g;
            if (cVar != null) {
                i = cVar.mo3016a();
            }
            bbVar.setTabSelected(i);
            if (this.f2396z != null) {
                this.f2396z.mo3234g().mo3025b(this.f2396z, a);
            }
            this.f2396z = (C0809b) cVar;
            if (this.f2396z != null) {
                this.f2396z.mo3234g().mo3024a(this.f2396z, a);
            }
        } else if (this.f2396z != null) {
            this.f2396z.mo3234g().mo3026c(this.f2396z, a);
            this.f2380g.mo5294a(cVar.mo3016a());
        }
        if (a != null && !a.mo1438i()) {
            a.mo1428c();
        }
    }

    /* renamed from: b */
    public void mo2998b(CharSequence charSequence) {
        this.f2377d.mo4989c(charSequence);
    }

    /* renamed from: b */
    public void mo2999b(boolean z) {
        mo3202a(z ? 8 : 0, 8);
    }

    /* renamed from: c */
    public void mo3000c() {
        if (this.f2385l) {
            this.f2385l = false;
            m3798n(false);
        }
    }

    /* renamed from: c */
    public void mo3205c(int i) {
        this.f2370F = i;
    }

    /* renamed from: c */
    public void mo3001c(CharSequence charSequence) {
        this.f2377d.mo4980a(charSequence);
    }

    /* renamed from: c */
    public void mo3002c(boolean z) {
        mo3202a(z ? 16 : 0, 16);
    }

    /* renamed from: d */
    public void mo3003d() {
        if (!this.f2385l) {
            this.f2385l = true;
            m3798n(false);
        }
    }

    /* renamed from: d */
    public void mo3206d(int i) {
        switch (this.f2377d.mo5007p()) {
            case 1:
                this.f2377d.mo4994e(i);
                return;
            case 2:
                mo3204b((C0754c) this.f2395y.get(i));
                return;
            default:
                throw new IllegalStateException("setSelectedNavigationIndex not valid for current navigation mode");
        }
    }

    /* renamed from: d */
    public void mo3004d(boolean z) {
        this.f2377d.mo4986b(z);
    }

    /* renamed from: e */
    public Context mo3005e() {
        if (this.f2392v == null) {
            TypedValue typedValue = new TypedValue();
            this.f2374a.getTheme().resolveAttribute(C0727a.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f2392v = new ContextThemeWrapper(this.f2374a, i);
            } else {
                this.f2392v = this.f2374a;
            }
        }
        return this.f2392v;
    }

    /* renamed from: e */
    public void mo3006e(boolean z) {
        if (!z || this.f2375b.mo3784a()) {
            this.f2388o = z;
            this.f2375b.setHideOnContentScrollEnabled(z);
            return;
        }
        throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
    }

    /* renamed from: f */
    public void mo3007f(boolean z) {
        if (!this.f2366B) {
            mo2992a(z);
        }
    }

    /* renamed from: g */
    public void mo3009g(boolean z) {
        this.f2373I = z;
        if (!z && this.f2387n != null) {
            this.f2387n.mo3332c();
        }
    }

    /* renamed from: h */
    public void mo3011h(boolean z) {
        if (z != this.f2367C) {
            this.f2367C = z;
            int size = this.f2368D.size();
            for (int i = 0; i < size; i++) {
                ((C0753b) this.f2368D.get(i)).mo3015a(z);
            }
        }
    }

    /* renamed from: i */
    public void mo3207i(boolean z) {
        this.f2384k = z;
    }

    /* renamed from: i */
    public boolean mo3013i() {
        if (this.f2377d == null || !this.f2377d.mo4990c()) {
            return false;
        }
        this.f2377d.mo4991d();
        return true;
    }

    /* renamed from: j */
    public void mo3208j(boolean z) {
        if (this.f2387n != null) {
            this.f2387n.mo3332c();
        }
        this.f2376c.setVisibility(0);
        if (this.f2370F != 0 || (!this.f2373I && !z)) {
            this.f2376c.setAlpha(1.0f);
            this.f2376c.setTranslationY(0.0f);
            if (this.f2384k && this.f2379f != null) {
                this.f2379f.setTranslationY(0.0f);
            }
            this.f2390q.mo2567b(null);
        } else {
            this.f2376c.setTranslationY(0.0f);
            float f = (float) (-this.f2376c.getHeight());
            if (z) {
                int[] iArr = {0, 0};
                this.f2376c.getLocationInWindow(iArr);
                f -= (float) iArr[1];
            }
            this.f2376c.setTranslationY(f);
            C0837h hVar = new C0837h();
            C0647w b = C0626s.m2868k(this.f2376c).mo2558b(0.0f);
            b.mo2556a(this.f2391r);
            hVar.mo3326a(b);
            if (this.f2384k && this.f2379f != null) {
                this.f2379f.setTranslationY(f);
                hVar.mo3326a(C0626s.m2868k(this.f2379f).mo2558b(0.0f));
            }
            hVar.mo3329a(f2364u);
            hVar.mo3325a(250);
            hVar.mo3328a(this.f2390q);
            this.f2387n = hVar;
            hVar.mo3330a();
        }
        if (this.f2375b != null) {
            C0626s.m2872o(this.f2375b);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public void mo3209k() {
        if (this.f2383j != null) {
            this.f2383j.mo3178a(this.f2382i);
            this.f2382i = null;
            this.f2383j = null;
        }
    }

    /* renamed from: k */
    public void mo3210k(boolean z) {
        if (this.f2387n != null) {
            this.f2387n.mo3332c();
        }
        if (this.f2370F != 0 || (!this.f2373I && !z)) {
            this.f2389p.mo2567b(null);
            return;
        }
        this.f2376c.setAlpha(1.0f);
        this.f2376c.setTransitioning(true);
        C0837h hVar = new C0837h();
        float f = (float) (-this.f2376c.getHeight());
        if (z) {
            int[] iArr = {0, 0};
            this.f2376c.getLocationInWindow(iArr);
            f -= (float) iArr[1];
        }
        C0647w b = C0626s.m2868k(this.f2376c).mo2558b(f);
        b.mo2556a(this.f2391r);
        hVar.mo3326a(b);
        if (this.f2384k && this.f2379f != null) {
            hVar.mo3326a(C0626s.m2868k(this.f2379f).mo2558b(f));
        }
        hVar.mo3329a(f2363t);
        hVar.mo3325a(250);
        hVar.mo3328a(this.f2389p);
        this.f2387n = hVar;
        hVar.mo3330a();
    }

    /* renamed from: l */
    public int mo3211l() {
        return this.f2377d.mo5007p();
    }

    /* renamed from: l */
    public void mo3212l(boolean z) {
        C0647w wVar;
        C0647w wVar2;
        if (z) {
            m3800s();
        } else {
            m3801t();
        }
        if (m3802u()) {
            if (z) {
                wVar = this.f2377d.mo4971a(4, 100);
                wVar2 = this.f2378e.mo3755a(0, 200);
            } else {
                wVar2 = this.f2377d.mo4971a(0, 200);
                wVar = this.f2378e.mo3755a(8, 100);
            }
            C0837h hVar = new C0837h();
            hVar.mo3327a(wVar, wVar2);
            hVar.mo3330a();
        } else if (z) {
            this.f2377d.mo4998g(4);
            this.f2378e.setVisibility(0);
        } else {
            this.f2377d.mo4998g(0);
            this.f2378e.setVisibility(8);
        }
    }

    /* renamed from: m */
    public void mo3213m() {
        if (this.f2386m) {
            this.f2386m = false;
            m3798n(true);
        }
    }

    /* renamed from: n */
    public void mo3214n() {
        if (!this.f2386m) {
            this.f2386m = true;
            m3798n(true);
        }
    }

    /* renamed from: o */
    public void mo3215o() {
        if (this.f2387n != null) {
            this.f2387n.mo3332c();
            this.f2387n = null;
        }
    }

    /* renamed from: p */
    public void mo3216p() {
    }

    /* renamed from: q */
    public int mo3217q() {
        int i = -1;
        switch (this.f2377d.mo5007p()) {
            case 1:
                return this.f2377d.mo5008q();
            case 2:
                if (this.f2396z != null) {
                    i = this.f2396z.mo3016a();
                }
                return i;
            default:
                return -1;
        }
    }
}
