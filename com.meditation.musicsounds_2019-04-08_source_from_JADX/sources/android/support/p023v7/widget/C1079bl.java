package android.support.p023v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p009v4.view.C0626s;
import android.support.p009v4.view.C0647w;
import android.support.p009v4.view.C0651x;
import android.support.p009v4.view.C0652y;
import android.support.p023v7.p024a.C0726a.C0727a;
import android.support.p023v7.p024a.C0726a.C0731e;
import android.support.p023v7.p024a.C0726a.C0732f;
import android.support.p023v7.p024a.C0726a.C0734h;
import android.support.p023v7.p024a.C0726a.C0736j;
import android.support.p023v7.p026c.p027a.C0817b;
import android.support.p023v7.view.menu.C0842a;
import android.support.p023v7.view.menu.C0855h;
import android.support.p023v7.view.menu.C0855h.C0856a;
import android.support.p023v7.view.menu.C0871o.C0872a;
import android.support.p023v7.widget.Toolbar.C0988b;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window.Callback;
import android.widget.Spinner;

/* renamed from: android.support.v7.widget.bl */
public class C1079bl implements C0999ae {

    /* renamed from: a */
    Toolbar f3753a;

    /* renamed from: b */
    CharSequence f3754b;

    /* renamed from: c */
    Callback f3755c;

    /* renamed from: d */
    boolean f3756d;

    /* renamed from: e */
    private int f3757e;

    /* renamed from: f */
    private View f3758f;

    /* renamed from: g */
    private Spinner f3759g;

    /* renamed from: h */
    private View f3760h;

    /* renamed from: i */
    private Drawable f3761i;

    /* renamed from: j */
    private Drawable f3762j;

    /* renamed from: k */
    private Drawable f3763k;

    /* renamed from: l */
    private boolean f3764l;

    /* renamed from: m */
    private CharSequence f3765m;

    /* renamed from: n */
    private CharSequence f3766n;

    /* renamed from: o */
    private ActionMenuPresenter f3767o;

    /* renamed from: p */
    private int f3768p;

    /* renamed from: q */
    private int f3769q;

    /* renamed from: r */
    private Drawable f3770r;

    public C1079bl(Toolbar toolbar, boolean z) {
        this(toolbar, z, C0734h.abc_action_bar_up_description, C0731e.abc_ic_ab_back_material);
    }

    public C1079bl(Toolbar toolbar, boolean z, int i, int i2) {
        this.f3768p = 0;
        this.f3769q = 0;
        this.f3753a = toolbar;
        this.f3754b = toolbar.getTitle();
        this.f3765m = toolbar.getSubtitle();
        this.f3764l = this.f3754b != null;
        this.f3763k = toolbar.getNavigationIcon();
        C1078bk a = C1078bk.m5881a(toolbar.getContext(), null, C0736j.ActionBar, C0727a.actionBarStyle, 0);
        this.f3770r = a.mo5357a(C0736j.ActionBar_homeAsUpIndicator);
        if (z) {
            CharSequence c = a.mo5363c(C0736j.ActionBar_title);
            if (!TextUtils.isEmpty(c)) {
                mo4985b(c);
            }
            CharSequence c2 = a.mo5363c(C0736j.ActionBar_subtitle);
            if (!TextUtils.isEmpty(c2)) {
                mo4989c(c2);
            }
            Drawable a2 = a.mo5357a(C0736j.ActionBar_logo);
            if (a2 != null) {
                mo5372d(a2);
            }
            Drawable a3 = a.mo5357a(C0736j.ActionBar_icon);
            if (a3 != null) {
                mo4974a(a3);
            }
            if (this.f3763k == null && this.f3770r != null) {
                mo4984b(this.f3770r);
            }
            mo4987c(a.mo5355a(C0736j.ActionBar_displayOptions, 0));
            int g = a.mo5370g(C0736j.ActionBar_customNavigationLayout, 0);
            if (g != 0) {
                mo4978a(LayoutInflater.from(this.f3753a.getContext()).inflate(g, this.f3753a, false));
                mo4987c(this.f3757e | 16);
            }
            int f = a.mo5368f(C0736j.ActionBar_height, 0);
            if (f > 0) {
                LayoutParams layoutParams = this.f3753a.getLayoutParams();
                layoutParams.height = f;
                this.f3753a.setLayoutParams(layoutParams);
            }
            int d = a.mo5364d(C0736j.ActionBar_contentInsetStart, -1);
            int d2 = a.mo5364d(C0736j.ActionBar_contentInsetEnd, -1);
            if (d >= 0 || d2 >= 0) {
                this.f3753a.mo4824a(Math.max(d, 0), Math.max(d2, 0));
            }
            int g2 = a.mo5370g(C0736j.ActionBar_titleTextStyle, 0);
            if (g2 != 0) {
                this.f3753a.mo4825a(this.f3753a.getContext(), g2);
            }
            int g3 = a.mo5370g(C0736j.ActionBar_subtitleTextStyle, 0);
            if (g3 != 0) {
                this.f3753a.mo4829b(this.f3753a.getContext(), g3);
            }
            int g4 = a.mo5370g(C0736j.ActionBar_popupTheme, 0);
            if (g4 != 0) {
                this.f3753a.setPopupTheme(g4);
            }
        } else {
            this.f3757e = m5901s();
        }
        a.mo5358a();
        mo5374h(i);
        this.f3766n = this.f3753a.getNavigationContentDescription();
        this.f3753a.setNavigationOnClickListener(new OnClickListener() {

            /* renamed from: a */
            final C0842a f3771a;

            {
                C0842a aVar = new C0842a(C1079bl.this.f3753a.getContext(), 0, 16908332, 0, 0, C1079bl.this.f3754b);
                this.f3771a = aVar;
            }

            public void onClick(View view) {
                if (C1079bl.this.f3755c != null && C1079bl.this.f3756d) {
                    C1079bl.this.f3755c.onMenuItemSelected(0, this.f3771a);
                }
            }
        });
    }

    /* renamed from: e */
    private void m5900e(CharSequence charSequence) {
        this.f3754b = charSequence;
        if ((this.f3757e & 8) != 0) {
            this.f3753a.setTitle(charSequence);
        }
    }

    /* renamed from: s */
    private int m5901s() {
        if (this.f3753a.getNavigationIcon() == null) {
            return 11;
        }
        this.f3770r = this.f3753a.getNavigationIcon();
        return 15;
    }

    /* renamed from: t */
    private void m5902t() {
        Drawable drawable = (this.f3757e & 2) != 0 ? ((this.f3757e & 1) == 0 || this.f3762j == null) ? this.f3761i : this.f3762j : null;
        this.f3753a.setLogo(drawable);
    }

    /* renamed from: u */
    private void m5903u() {
        if (this.f3759g == null) {
            this.f3759g = new AppCompatSpinner(mo4982b(), null, C0727a.actionDropDownStyle);
            this.f3759g.setLayoutParams(new C0988b(-2, -2, 8388627));
        }
    }

    /* renamed from: v */
    private void m5904v() {
        Drawable drawable;
        Toolbar toolbar;
        if ((this.f3757e & 4) != 0) {
            toolbar = this.f3753a;
            drawable = this.f3763k != null ? this.f3763k : this.f3770r;
        } else {
            toolbar = this.f3753a;
            drawable = null;
        }
        toolbar.setNavigationIcon(drawable);
    }

    /* renamed from: w */
    private void m5905w() {
        if ((this.f3757e & 4) == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.f3766n)) {
            this.f3753a.setNavigationContentDescription(this.f3769q);
        } else {
            this.f3753a.setNavigationContentDescription(this.f3766n);
        }
    }

    /* renamed from: a */
    public C0647w mo4971a(final int i, long j) {
        return C0626s.m2868k(this.f3753a).mo2553a(i == 0 ? 1.0f : 0.0f).mo2554a(j).mo2555a((C0651x) new C0652y() {

            /* renamed from: c */
            private boolean f3775c = false;

            /* renamed from: a */
            public void mo2566a(View view) {
                C1079bl.this.f3753a.setVisibility(0);
            }

            /* renamed from: b */
            public void mo2567b(View view) {
                if (!this.f3775c) {
                    C1079bl.this.f3753a.setVisibility(i);
                }
            }

            /* renamed from: c */
            public void mo2568c(View view) {
                this.f3775c = true;
            }
        });
    }

    /* renamed from: a */
    public ViewGroup mo4972a() {
        return this.f3753a;
    }

    /* renamed from: a */
    public void mo4973a(int i) {
        mo4974a(i != 0 ? C0817b.m3884b(mo4982b(), i) : null);
    }

    /* renamed from: a */
    public void mo4974a(Drawable drawable) {
        this.f3761i = drawable;
        m5902t();
    }

    /* renamed from: a */
    public void mo4975a(C0872a aVar, C0856a aVar2) {
        this.f3753a.mo4827a(aVar, aVar2);
    }

    /* renamed from: a */
    public void mo4976a(C1061bb bbVar) {
        if (this.f3758f != null && this.f3758f.getParent() == this.f3753a) {
            this.f3753a.removeView(this.f3758f);
        }
        this.f3758f = bbVar;
        if (bbVar != null && this.f3768p == 2) {
            this.f3753a.addView(this.f3758f, 0);
            C0988b bVar = (C0988b) this.f3758f.getLayoutParams();
            bVar.width = -2;
            bVar.height = -2;
            bVar.f2207a = 8388691;
            bbVar.setAllowCollapse(true);
        }
    }

    /* renamed from: a */
    public void mo4977a(Menu menu, C0872a aVar) {
        if (this.f3767o == null) {
            this.f3767o = new ActionMenuPresenter(this.f3753a.getContext());
            this.f3767o.mo3420a(C0732f.action_menu_presenter);
        }
        this.f3767o.mo323a(aVar);
        this.f3753a.mo4826a((C0855h) menu, this.f3767o);
    }

    /* renamed from: a */
    public void mo4978a(View view) {
        if (!(this.f3760h == null || (this.f3757e & 16) == 0)) {
            this.f3753a.removeView(this.f3760h);
        }
        this.f3760h = view;
        if (view != null && (this.f3757e & 16) != 0) {
            this.f3753a.addView(this.f3760h);
        }
    }

    /* renamed from: a */
    public void mo4979a(Callback callback) {
        this.f3755c = callback;
    }

    /* renamed from: a */
    public void mo4980a(CharSequence charSequence) {
        if (!this.f3764l) {
            m5900e(charSequence);
        }
    }

    /* renamed from: a */
    public void mo4981a(boolean z) {
        this.f3753a.setCollapsible(z);
    }

    /* renamed from: b */
    public Context mo4982b() {
        return this.f3753a.getContext();
    }

    /* renamed from: b */
    public void mo4983b(int i) {
        mo5372d(i != 0 ? C0817b.m3884b(mo4982b(), i) : null);
    }

    /* renamed from: b */
    public void mo4984b(Drawable drawable) {
        this.f3763k = drawable;
        m5904v();
    }

    /* renamed from: b */
    public void mo4985b(CharSequence charSequence) {
        this.f3764l = true;
        m5900e(charSequence);
    }

    /* renamed from: b */
    public void mo4986b(boolean z) {
    }

    /* renamed from: c */
    public void mo4987c(int i) {
        CharSequence charSequence;
        Toolbar toolbar;
        int i2 = this.f3757e ^ i;
        this.f3757e = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    m5905w();
                }
                m5904v();
            }
            if ((i2 & 3) != 0) {
                m5902t();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.f3753a.setTitle(this.f3754b);
                    toolbar = this.f3753a;
                    charSequence = this.f3765m;
                } else {
                    charSequence = null;
                    this.f3753a.setTitle((CharSequence) null);
                    toolbar = this.f3753a;
                }
                toolbar.setSubtitle(charSequence);
            }
            if ((i2 & 16) != 0 && this.f3760h != null) {
                if ((i & 16) != 0) {
                    this.f3753a.addView(this.f3760h);
                } else {
                    this.f3753a.removeView(this.f3760h);
                }
            }
        }
    }

    /* renamed from: c */
    public void mo4988c(Drawable drawable) {
        C0626s.m2843a((View) this.f3753a, drawable);
    }

    /* renamed from: c */
    public void mo4989c(CharSequence charSequence) {
        this.f3765m = charSequence;
        if ((this.f3757e & 8) != 0) {
            this.f3753a.setSubtitle(charSequence);
        }
    }

    /* renamed from: c */
    public boolean mo4990c() {
        return this.f3753a.mo4836g();
    }

    /* renamed from: d */
    public void mo4991d() {
        this.f3753a.mo4866h();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        r0.removeView(r1);
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo4992d(int r4) {
        /*
            r3 = this;
            int r0 = r3.f3768p
            if (r4 == r0) goto L_0x0075
            switch(r0) {
                case 1: goto L_0x001b;
                case 2: goto L_0x0008;
                default: goto L_0x0007;
            }
        L_0x0007:
            goto L_0x0030
        L_0x0008:
            android.view.View r0 = r3.f3758f
            if (r0 == 0) goto L_0x0030
            android.view.View r0 = r3.f3758f
            android.view.ViewParent r0 = r0.getParent()
            android.support.v7.widget.Toolbar r1 = r3.f3753a
            if (r0 != r1) goto L_0x0030
            android.support.v7.widget.Toolbar r0 = r3.f3753a
            android.view.View r1 = r3.f3758f
            goto L_0x002d
        L_0x001b:
            android.widget.Spinner r0 = r3.f3759g
            if (r0 == 0) goto L_0x0030
            android.widget.Spinner r0 = r3.f3759g
            android.view.ViewParent r0 = r0.getParent()
            android.support.v7.widget.Toolbar r1 = r3.f3753a
            if (r0 != r1) goto L_0x0030
            android.support.v7.widget.Toolbar r0 = r3.f3753a
            android.widget.Spinner r1 = r3.f3759g
        L_0x002d:
            r0.removeView(r1)
        L_0x0030:
            r3.f3768p = r4
            r0 = 0
            switch(r4) {
                case 0: goto L_0x0075;
                case 1: goto L_0x006b;
                case 2: goto L_0x004d;
                default: goto L_0x0036;
            }
        L_0x0036:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid navigation mode "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L_0x004d:
            android.view.View r4 = r3.f3758f
            if (r4 == 0) goto L_0x0075
            android.support.v7.widget.Toolbar r4 = r3.f3753a
            android.view.View r1 = r3.f3758f
            r4.addView(r1, r0)
            android.view.View r4 = r3.f3758f
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            android.support.v7.widget.Toolbar$b r4 = (android.support.p023v7.widget.Toolbar.C0988b) r4
            r0 = -2
            r4.width = r0
            r4.height = r0
            r0 = 8388691(0x800053, float:1.175506E-38)
            r4.f2207a = r0
            goto L_0x0075
        L_0x006b:
            r3.m5903u()
            android.support.v7.widget.Toolbar r4 = r3.f3753a
            android.widget.Spinner r1 = r3.f3759g
            r4.addView(r1, r0)
        L_0x0075:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p023v7.widget.C1079bl.mo4992d(int):void");
    }

    /* renamed from: d */
    public void mo5372d(Drawable drawable) {
        this.f3762j = drawable;
        m5902t();
    }

    /* renamed from: d */
    public void mo5373d(CharSequence charSequence) {
        this.f3766n = charSequence;
        m5905w();
    }

    /* renamed from: e */
    public CharSequence mo4993e() {
        return this.f3753a.getTitle();
    }

    /* renamed from: e */
    public void mo4994e(int i) {
        if (this.f3759g != null) {
            this.f3759g.setSelection(i);
            return;
        }
        throw new IllegalStateException("Can't set dropdown selected position without an adapter");
    }

    /* renamed from: f */
    public void mo4995f() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    /* renamed from: f */
    public void mo4996f(int i) {
        mo5373d((CharSequence) i == 0 ? null : mo4982b().getString(i));
    }

    /* renamed from: g */
    public void mo4997g() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    /* renamed from: g */
    public void mo4998g(int i) {
        this.f3753a.setVisibility(i);
    }

    /* renamed from: h */
    public void mo5374h(int i) {
        if (i != this.f3769q) {
            this.f3769q = i;
            if (TextUtils.isEmpty(this.f3753a.getNavigationContentDescription())) {
                mo4996f(this.f3769q);
            }
        }
    }

    /* renamed from: h */
    public boolean mo4999h() {
        return this.f3753a.mo4828a();
    }

    /* renamed from: i */
    public boolean mo5000i() {
        return this.f3753a.mo4830b();
    }

    /* renamed from: j */
    public boolean mo5001j() {
        return this.f3753a.mo4831c();
    }

    /* renamed from: k */
    public boolean mo5002k() {
        return this.f3753a.mo4833d();
    }

    /* renamed from: l */
    public boolean mo5003l() {
        return this.f3753a.mo4834e();
    }

    /* renamed from: m */
    public void mo5004m() {
        this.f3756d = true;
    }

    /* renamed from: n */
    public void mo5005n() {
        this.f3753a.mo4835f();
    }

    /* renamed from: o */
    public int mo5006o() {
        return this.f3757e;
    }

    /* renamed from: p */
    public int mo5007p() {
        return this.f3768p;
    }

    /* renamed from: q */
    public int mo5008q() {
        if (this.f3759g != null) {
            return this.f3759g.getSelectedItemPosition();
        }
        return 0;
    }

    /* renamed from: r */
    public Menu mo5009r() {
        return this.f3753a.getMenu();
    }
}
