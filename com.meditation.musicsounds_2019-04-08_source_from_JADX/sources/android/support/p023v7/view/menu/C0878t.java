package android.support.p023v7.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.support.p023v7.p024a.C0726a.C0730d;
import android.support.p023v7.p024a.C0726a.C0733g;
import android.support.p023v7.view.menu.C0871o.C0872a;
import android.support.p023v7.widget.C1043ar;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnKeyListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;

/* renamed from: android.support.v7.view.menu.t */
final class C0878t extends C0868m implements C0871o, OnKeyListener, OnItemClickListener, OnDismissListener {

    /* renamed from: a */
    final C1043ar f2713a;

    /* renamed from: b */
    View f2714b;

    /* renamed from: c */
    private final Context f2715c;

    /* renamed from: d */
    private final C0855h f2716d;

    /* renamed from: e */
    private final C0854g f2717e;

    /* renamed from: f */
    private final boolean f2718f;

    /* renamed from: g */
    private final int f2719g;

    /* renamed from: h */
    private final int f2720h;

    /* renamed from: i */
    private final int f2721i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final OnGlobalLayoutListener f2722j = new OnGlobalLayoutListener() {
        public void onGlobalLayout() {
            if (C0878t.this.mo3442f() && !C0878t.this.f2713a.mo5144c()) {
                View view = C0878t.this.f2714b;
                if (view == null || !view.isShown()) {
                    C0878t.this.mo3441e();
                } else {
                    C0878t.this.f2713a.mo3440d();
                }
            }
        }
    };

    /* renamed from: k */
    private final OnAttachStateChangeListener f2723k = new OnAttachStateChangeListener() {
        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            if (C0878t.this.f2727o != null) {
                if (!C0878t.this.f2727o.isAlive()) {
                    C0878t.this.f2727o = view.getViewTreeObserver();
                }
                C0878t.this.f2727o.removeGlobalOnLayoutListener(C0878t.this.f2722j);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    };

    /* renamed from: l */
    private OnDismissListener f2724l;

    /* renamed from: m */
    private View f2725m;

    /* renamed from: n */
    private C0872a f2726n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public ViewTreeObserver f2727o;

    /* renamed from: p */
    private boolean f2728p;

    /* renamed from: q */
    private boolean f2729q;

    /* renamed from: r */
    private int f2730r;

    /* renamed from: s */
    private int f2731s = 0;

    /* renamed from: t */
    private boolean f2732t;

    public C0878t(Context context, C0855h hVar, View view, int i, int i2, boolean z) {
        this.f2715c = context;
        this.f2716d = hVar;
        this.f2718f = z;
        this.f2717e = new C0854g(hVar, LayoutInflater.from(context), this.f2718f);
        this.f2720h = i;
        this.f2721i = i2;
        Resources resources = context.getResources();
        this.f2719g = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C0730d.abc_config_prefDialogWidth));
        this.f2725m = view;
        this.f2713a = new C1043ar(this.f2715c, null, this.f2720h, this.f2721i);
        hVar.mo3487a((C0871o) this, context);
    }

    /* renamed from: j */
    private boolean m4251j() {
        if (mo3442f()) {
            return true;
        }
        if (this.f2728p || this.f2725m == null) {
            return false;
        }
        this.f2714b = this.f2725m;
        this.f2713a.mo5138a((OnDismissListener) this);
        this.f2713a.mo5137a((OnItemClickListener) this);
        this.f2713a.mo5139a(true);
        View view = this.f2714b;
        boolean z = this.f2727o == null;
        this.f2727o = view.getViewTreeObserver();
        if (z) {
            this.f2727o.addOnGlobalLayoutListener(this.f2722j);
        }
        view.addOnAttachStateChangeListener(this.f2723k);
        this.f2713a.mo5141b(view);
        this.f2713a.mo5146e(this.f2731s);
        if (!this.f2729q) {
            this.f2730r = m4193a(this.f2717e, null, this.f2715c, this.f2719g);
            this.f2729q = true;
        }
        this.f2713a.mo5148g(this.f2730r);
        this.f2713a.mo5150h(2);
        this.f2713a.mo5135a(mo3674i());
        this.f2713a.mo3440d();
        ListView g = this.f2713a.mo3443g();
        g.setOnKeyListener(this);
        if (this.f2732t && this.f2716d.mo3532m() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f2715c).inflate(C0733g.abc_popup_menu_header_item_layout, g, false);
            TextView textView = (TextView) frameLayout.findViewById(16908310);
            if (textView != null) {
                textView.setText(this.f2716d.mo3532m());
            }
            frameLayout.setEnabled(false);
            g.addHeaderView(frameLayout, null, false);
        }
        this.f2713a.mo3985a((ListAdapter) this.f2717e);
        this.f2713a.mo3440d();
        return true;
    }

    /* renamed from: a */
    public void mo3432a(int i) {
        this.f2731s = i;
    }

    /* renamed from: a */
    public void mo319a(Parcelable parcelable) {
    }

    /* renamed from: a */
    public void mo3433a(C0855h hVar) {
    }

    /* renamed from: a */
    public void mo321a(C0855h hVar, boolean z) {
        if (hVar == this.f2716d) {
            mo3441e();
            if (this.f2726n != null) {
                this.f2726n.mo3176a(hVar, z);
            }
        }
    }

    /* renamed from: a */
    public void mo323a(C0872a aVar) {
        this.f2726n = aVar;
    }

    /* renamed from: a */
    public void mo3434a(View view) {
        this.f2725m = view;
    }

    /* renamed from: a */
    public void mo3435a(OnDismissListener onDismissListener) {
        this.f2724l = onDismissListener;
    }

    /* renamed from: a */
    public void mo325a(boolean z) {
        this.f2729q = false;
        if (this.f2717e != null) {
            this.f2717e.notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public boolean mo326a() {
        return false;
    }

    /* renamed from: a */
    public boolean mo328a(C0881u uVar) {
        if (uVar.hasVisibleItems()) {
            C0869n nVar = new C0869n(this.f2715c, uVar, this.f2714b, this.f2718f, this.f2720h, this.f2721i);
            nVar.mo3678a(this.f2726n);
            nVar.mo3681a(C0868m.m4195b((C0855h) uVar));
            nVar.mo3677a(this.f2731s);
            nVar.mo3680a(this.f2724l);
            this.f2724l = null;
            this.f2716d.mo3505b(false);
            if (nVar.mo3682a(this.f2713a.mo5153j(), this.f2713a.mo5154k())) {
                if (this.f2726n != null) {
                    this.f2726n.mo3177a(uVar);
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public void mo3436b(int i) {
        this.f2713a.mo5143c(i);
    }

    /* renamed from: b */
    public void mo3437b(boolean z) {
        this.f2717e.mo3468a(z);
    }

    /* renamed from: c */
    public Parcelable mo334c() {
        return null;
    }

    /* renamed from: c */
    public void mo3438c(int i) {
        this.f2713a.mo5145d(i);
    }

    /* renamed from: c */
    public void mo3439c(boolean z) {
        this.f2732t = z;
    }

    /* renamed from: d */
    public void mo3440d() {
        if (!m4251j()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    /* renamed from: e */
    public void mo3441e() {
        if (mo3442f()) {
            this.f2713a.mo3441e();
        }
    }

    /* renamed from: f */
    public boolean mo3442f() {
        return !this.f2728p && this.f2713a.mo3442f();
    }

    /* renamed from: g */
    public ListView mo3443g() {
        return this.f2713a.mo3443g();
    }

    public void onDismiss() {
        this.f2728p = true;
        this.f2716d.close();
        if (this.f2727o != null) {
            if (!this.f2727o.isAlive()) {
                this.f2727o = this.f2714b.getViewTreeObserver();
            }
            this.f2727o.removeGlobalOnLayoutListener(this.f2722j);
            this.f2727o = null;
        }
        this.f2714b.removeOnAttachStateChangeListener(this.f2723k);
        if (this.f2724l != null) {
            this.f2724l.onDismiss();
        }
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        mo3441e();
        return true;
    }
}
