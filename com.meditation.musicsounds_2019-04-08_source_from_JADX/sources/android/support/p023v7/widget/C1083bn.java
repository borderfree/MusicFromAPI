package android.support.p023v7.widget;

import android.support.p009v4.view.C0626s;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnHoverListener;
import android.view.View.OnLongClickListener;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;

/* renamed from: android.support.v7.widget.bn */
class C1083bn implements OnAttachStateChangeListener, OnHoverListener, OnLongClickListener {

    /* renamed from: i */
    private static C1083bn f3776i;

    /* renamed from: j */
    private static C1083bn f3777j;

    /* renamed from: a */
    private final View f3778a;

    /* renamed from: b */
    private final CharSequence f3779b;

    /* renamed from: c */
    private final Runnable f3780c = new Runnable() {
        public void run() {
            C1083bn.this.m5956a(false);
        }
    };

    /* renamed from: d */
    private final Runnable f3781d = new Runnable() {
        public void run() {
            C1083bn.this.m5952a();
        }
    };

    /* renamed from: e */
    private int f3782e;

    /* renamed from: f */
    private int f3783f;

    /* renamed from: g */
    private C1086bo f3784g;

    /* renamed from: h */
    private boolean f3785h;

    private C1083bn(View view, CharSequence charSequence) {
        this.f3778a = view;
        this.f3779b = charSequence;
        this.f3778a.setOnLongClickListener(this);
        this.f3778a.setOnHoverListener(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m5952a() {
        if (f3777j == this) {
            f3777j = null;
            if (this.f3784g != null) {
                this.f3784g.mo5382a();
                this.f3784g = null;
                this.f3778a.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f3776i == this) {
            m5958b(null);
        }
        this.f3778a.removeCallbacks(this.f3781d);
    }

    /* renamed from: a */
    public static void m5955a(View view, CharSequence charSequence) {
        if (f3776i != null && f3776i.f3778a == view) {
            m5958b(null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            if (f3777j != null && f3777j.f3778a == view) {
                f3777j.m5952a();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new C1083bn(view, charSequence);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m5956a(boolean z) {
        long j;
        if (C0626s.m2883z(this.f3778a)) {
            m5958b(null);
            if (f3777j != null) {
                f3777j.m5952a();
            }
            f3777j = this;
            this.f3785h = z;
            this.f3784g = new C1086bo(this.f3778a.getContext());
            this.f3784g.mo5383a(this.f3778a, this.f3782e, this.f3783f, this.f3785h, this.f3779b);
            this.f3778a.addOnAttachStateChangeListener(this);
            if (this.f3785h) {
                j = 2500;
            } else {
                j = ((C0626s.m2871n(this.f3778a) & 1) == 1 ? 3000 : 15000) - ((long) ViewConfiguration.getLongPressTimeout());
            }
            this.f3778a.removeCallbacks(this.f3781d);
            this.f3778a.postDelayed(this.f3781d, j);
        }
    }

    /* renamed from: b */
    private void m5957b() {
        this.f3778a.postDelayed(this.f3780c, (long) ViewConfiguration.getLongPressTimeout());
    }

    /* renamed from: b */
    private static void m5958b(C1083bn bnVar) {
        if (f3776i != null) {
            f3776i.m5959c();
        }
        f3776i = bnVar;
        if (f3776i != null) {
            f3776i.m5957b();
        }
    }

    /* renamed from: c */
    private void m5959c() {
        this.f3778a.removeCallbacks(this.f3780c);
    }

    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f3784g != null && this.f3785h) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f3778a.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                m5952a();
            }
        } else if (this.f3778a.isEnabled() && this.f3784g == null) {
            this.f3782e = (int) motionEvent.getX();
            this.f3783f = (int) motionEvent.getY();
            m5958b(this);
        }
        return false;
    }

    public boolean onLongClick(View view) {
        this.f3782e = view.getWidth() / 2;
        this.f3783f = view.getHeight() / 2;
        m5956a(true);
        return true;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        m5952a();
    }
}
