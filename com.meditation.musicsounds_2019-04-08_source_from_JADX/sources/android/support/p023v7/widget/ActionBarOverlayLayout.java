package android.support.p023v7.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.p009v4.view.C0619l;
import android.support.p009v4.view.C0621n;
import android.support.p009v4.view.C0626s;
import android.support.p023v7.p024a.C0726a.C0727a;
import android.support.p023v7.p024a.C0726a.C0732f;
import android.support.p023v7.view.menu.C0871o.C0872a;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewPropertyAnimator;
import android.view.Window.Callback;
import android.widget.OverScroller;

/* renamed from: android.support.v7.widget.ActionBarOverlayLayout */
public class ActionBarOverlayLayout extends ViewGroup implements C0619l, C0998ad {

    /* renamed from: e */
    static final int[] f2760e = {C0727a.actionBarSize, 16842841};

    /* renamed from: A */
    private final Runnable f2761A;

    /* renamed from: B */
    private final Runnable f2762B;

    /* renamed from: C */
    private final C0621n f2763C;

    /* renamed from: a */
    ActionBarContainer f2764a;

    /* renamed from: b */
    boolean f2765b;

    /* renamed from: c */
    ViewPropertyAnimator f2766c;

    /* renamed from: d */
    final AnimatorListenerAdapter f2767d;

    /* renamed from: f */
    private int f2768f;

    /* renamed from: g */
    private int f2769g;

    /* renamed from: h */
    private ContentFrameLayout f2770h;

    /* renamed from: i */
    private C0999ae f2771i;

    /* renamed from: j */
    private Drawable f2772j;

    /* renamed from: k */
    private boolean f2773k;

    /* renamed from: l */
    private boolean f2774l;

    /* renamed from: m */
    private boolean f2775m;

    /* renamed from: n */
    private boolean f2776n;

    /* renamed from: o */
    private int f2777o;

    /* renamed from: p */
    private int f2778p;

    /* renamed from: q */
    private final Rect f2779q;

    /* renamed from: r */
    private final Rect f2780r;

    /* renamed from: s */
    private final Rect f2781s;

    /* renamed from: t */
    private final Rect f2782t;

    /* renamed from: u */
    private final Rect f2783u;

    /* renamed from: v */
    private final Rect f2784v;

    /* renamed from: w */
    private final Rect f2785w;

    /* renamed from: x */
    private C0887a f2786x;

    /* renamed from: y */
    private final int f2787y;

    /* renamed from: z */
    private OverScroller f2788z;

    /* renamed from: android.support.v7.widget.ActionBarOverlayLayout$a */
    public interface C0887a {
        /* renamed from: c */
        void mo3205c(int i);

        /* renamed from: i */
        void mo3207i(boolean z);

        /* renamed from: m */
        void mo3213m();

        /* renamed from: n */
        void mo3214n();

        /* renamed from: o */
        void mo3215o();

        /* renamed from: p */
        void mo3216p();
    }

    /* renamed from: android.support.v7.widget.ActionBarOverlayLayout$b */
    public static class C0888b extends MarginLayoutParams {
        public C0888b(int i, int i2) {
            super(i, i2);
        }

        public C0888b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0888b(LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2769g = 0;
        this.f2779q = new Rect();
        this.f2780r = new Rect();
        this.f2781s = new Rect();
        this.f2782t = new Rect();
        this.f2783u = new Rect();
        this.f2784v = new Rect();
        this.f2785w = new Rect();
        this.f2787y = 600;
        this.f2767d = new AnimatorListenerAdapter() {
            public void onAnimationCancel(Animator animator) {
                ActionBarOverlayLayout.this.f2766c = null;
                ActionBarOverlayLayout.this.f2765b = false;
            }

            public void onAnimationEnd(Animator animator) {
                ActionBarOverlayLayout.this.f2766c = null;
                ActionBarOverlayLayout.this.f2765b = false;
            }
        };
        this.f2761A = new Runnable() {
            public void run() {
                ActionBarOverlayLayout.this.mo3788d();
                ActionBarOverlayLayout.this.f2766c = ActionBarOverlayLayout.this.f2764a.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.f2767d);
            }
        };
        this.f2762B = new Runnable() {
            public void run() {
                ActionBarOverlayLayout.this.mo3788d();
                ActionBarOverlayLayout.this.f2766c = ActionBarOverlayLayout.this.f2764a.animate().translationY((float) (-ActionBarOverlayLayout.this.f2764a.getHeight())).setListener(ActionBarOverlayLayout.this.f2767d);
            }
        };
        m4291a(context);
        this.f2763C = new C0621n(this);
    }

    /* renamed from: a */
    private C0999ae m4290a(View view) {
        if (view instanceof C0999ae) {
            return (C0999ae) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view.getClass().getSimpleName());
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: a */
    private void m4291a(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f2760e);
        boolean z = false;
        this.f2768f = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f2772j = obtainStyledAttributes.getDrawable(1);
        setWillNotDraw(this.f2772j == null);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z = true;
        }
        this.f2773k = z;
        this.f2788z = new OverScroller(context);
    }

    /* renamed from: a */
    private boolean m4292a(float f, float f2) {
        this.f2788z.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return this.f2788z.getFinalY() > this.f2764a.getHeight();
    }

    /* renamed from: a */
    private boolean m4293a(View view, Rect rect, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        C0888b bVar = (C0888b) view.getLayoutParams();
        if (!z || bVar.leftMargin == rect.left) {
            z5 = false;
        } else {
            bVar.leftMargin = rect.left;
            z5 = true;
        }
        if (z2 && bVar.topMargin != rect.top) {
            bVar.topMargin = rect.top;
            z5 = true;
        }
        if (z4 && bVar.rightMargin != rect.right) {
            bVar.rightMargin = rect.right;
            z5 = true;
        }
        if (!z3 || bVar.bottomMargin == rect.bottom) {
            return z5;
        }
        bVar.bottomMargin = rect.bottom;
        return true;
    }

    /* renamed from: l */
    private void m4294l() {
        mo3788d();
        postDelayed(this.f2761A, 600);
    }

    /* renamed from: m */
    private void m4295m() {
        mo3788d();
        postDelayed(this.f2762B, 600);
    }

    /* renamed from: n */
    private void m4296n() {
        mo3788d();
        this.f2761A.run();
    }

    /* renamed from: o */
    private void m4297o() {
        mo3788d();
        this.f2762B.run();
    }

    /* renamed from: a */
    public C0888b generateLayoutParams(AttributeSet attributeSet) {
        return new C0888b(getContext(), attributeSet);
    }

    /* renamed from: a */
    public void mo3782a(int i) {
        mo3786c();
        if (i == 2) {
            this.f2771i.mo4995f();
        } else if (i == 5) {
            this.f2771i.mo4997g();
        } else if (i == 109) {
            setOverlayMode(true);
        }
    }

    /* renamed from: a */
    public void mo3783a(Menu menu, C0872a aVar) {
        mo3786c();
        this.f2771i.mo4977a(menu, aVar);
    }

    /* renamed from: a */
    public boolean mo3784a() {
        return this.f2774l;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C0888b generateDefaultLayoutParams() {
        return new C0888b(-1, -1);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo3786c() {
        if (this.f2770h == null) {
            this.f2770h = (ContentFrameLayout) findViewById(C0732f.action_bar_activity_content);
            this.f2764a = (ActionBarContainer) findViewById(C0732f.action_bar_container);
            this.f2771i = m4290a(findViewById(C0732f.action_bar));
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(LayoutParams layoutParams) {
        return layoutParams instanceof C0888b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo3788d() {
        removeCallbacks(this.f2761A);
        removeCallbacks(this.f2762B);
        if (this.f2766c != null) {
            this.f2766c.cancel();
        }
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f2772j != null && !this.f2773k) {
            int bottom = this.f2764a.getVisibility() == 0 ? (int) (((float) this.f2764a.getBottom()) + this.f2764a.getTranslationY() + 0.5f) : 0;
            this.f2772j.setBounds(0, bottom, getWidth(), this.f2772j.getIntrinsicHeight() + bottom);
            this.f2772j.draw(canvas);
        }
    }

    /* renamed from: e */
    public boolean mo3790e() {
        mo3786c();
        return this.f2771i.mo4999h();
    }

    /* renamed from: f */
    public boolean mo3791f() {
        mo3786c();
        return this.f2771i.mo5000i();
    }

    /* access modifiers changed from: protected */
    public boolean fitSystemWindows(Rect rect) {
        mo3786c();
        int n = C0626s.m2871n(this) & 256;
        boolean a = m4293a(this.f2764a, rect, true, true, false, true);
        this.f2782t.set(rect);
        C1094bs.m6003a(this, this.f2782t, this.f2779q);
        if (!this.f2783u.equals(this.f2782t)) {
            this.f2783u.set(this.f2782t);
            a = true;
        }
        if (!this.f2780r.equals(this.f2779q)) {
            this.f2780r.set(this.f2779q);
            a = true;
        }
        if (a) {
            requestLayout();
        }
        return true;
    }

    /* renamed from: g */
    public boolean mo3793g() {
        mo3786c();
        return this.f2771i.mo5001j();
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return new C0888b(layoutParams);
    }

    public int getActionBarHideOffset() {
        if (this.f2764a != null) {
            return -((int) this.f2764a.getTranslationY());
        }
        return 0;
    }

    public int getNestedScrollAxes() {
        return this.f2763C.mo2470a();
    }

    public CharSequence getTitle() {
        mo3786c();
        return this.f2771i.mo4993e();
    }

    /* renamed from: h */
    public boolean mo3800h() {
        mo3786c();
        return this.f2771i.mo5002k();
    }

    /* renamed from: i */
    public boolean mo3801i() {
        mo3786c();
        return this.f2771i.mo5003l();
    }

    /* renamed from: j */
    public void mo3802j() {
        mo3786c();
        this.f2771i.mo5004m();
    }

    /* renamed from: k */
    public void mo3803k() {
        mo3786c();
        this.f2771i.mo5005n();
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m4291a(getContext());
        C0626s.m2872o(this);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo3788d();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        getPaddingRight();
        int paddingTop = getPaddingTop();
        getPaddingBottom();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C0888b bVar = (C0888b) childAt.getLayoutParams();
                int i6 = bVar.leftMargin + paddingLeft;
                int i7 = bVar.topMargin + paddingTop;
                childAt.layout(i6, i7, childAt.getMeasuredWidth() + i6, childAt.getMeasuredHeight() + i7);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        Rect rect;
        mo3786c();
        measureChildWithMargins(this.f2764a, i, 0, i2, 0);
        C0888b bVar = (C0888b) this.f2764a.getLayoutParams();
        int max = Math.max(0, this.f2764a.getMeasuredWidth() + bVar.leftMargin + bVar.rightMargin);
        int max2 = Math.max(0, this.f2764a.getMeasuredHeight() + bVar.topMargin + bVar.bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f2764a.getMeasuredState());
        boolean z = (C0626s.m2871n(this) & 256) != 0;
        if (z) {
            i3 = this.f2768f;
            if (this.f2775m && this.f2764a.getTabContainer() != null) {
                i3 += this.f2768f;
            }
        } else {
            i3 = this.f2764a.getVisibility() != 8 ? this.f2764a.getMeasuredHeight() : 0;
        }
        this.f2781s.set(this.f2779q);
        this.f2784v.set(this.f2782t);
        if (this.f2774l || z) {
            this.f2784v.top += i3;
            rect = this.f2784v;
        } else {
            this.f2781s.top += i3;
            rect = this.f2781s;
        }
        rect.bottom += 0;
        m4293a(this.f2770h, this.f2781s, true, true, true, true);
        if (!this.f2785w.equals(this.f2784v)) {
            this.f2785w.set(this.f2784v);
            this.f2770h.mo4025a(this.f2784v);
        }
        measureChildWithMargins(this.f2770h, i, 0, i2, 0);
        C0888b bVar2 = (C0888b) this.f2770h.getLayoutParams();
        int max3 = Math.max(max, this.f2770h.getMeasuredWidth() + bVar2.leftMargin + bVar2.rightMargin);
        int max4 = Math.max(max2, this.f2770h.getMeasuredHeight() + bVar2.topMargin + bVar2.bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f2770h.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.f2776n || !z) {
            return false;
        }
        if (m4292a(f, f2)) {
            m4297o();
        } else {
            m4296n();
        }
        this.f2765b = true;
        return true;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        this.f2777o += i2;
        setActionBarHideOffset(this.f2777o);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f2763C.mo2473a(view, view2, i);
        this.f2777o = getActionBarHideOffset();
        mo3788d();
        if (this.f2786x != null) {
            this.f2786x.mo3215o();
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f2764a.getVisibility() != 0) {
            return false;
        }
        return this.f2776n;
    }

    public void onStopNestedScroll(View view) {
        if (this.f2776n && !this.f2765b) {
            if (this.f2777o <= this.f2764a.getHeight()) {
                m4294l();
            } else {
                m4295m();
            }
        }
        if (this.f2786x != null) {
            this.f2786x.mo3216p();
        }
    }

    public void onWindowSystemUiVisibilityChanged(int i) {
        if (VERSION.SDK_INT >= 16) {
            super.onWindowSystemUiVisibilityChanged(i);
        }
        mo3786c();
        int i2 = this.f2778p ^ i;
        this.f2778p = i;
        boolean z = false;
        boolean z2 = (i & 4) == 0;
        if ((i & 256) != 0) {
            z = true;
        }
        if (this.f2786x != null) {
            this.f2786x.mo3207i(!z);
            if (z2 || !z) {
                this.f2786x.mo3213m();
            } else {
                this.f2786x.mo3214n();
            }
        }
        if ((i2 & 256) != 0 && this.f2786x != null) {
            C0626s.m2872o(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f2769g = i;
        if (this.f2786x != null) {
            this.f2786x.mo3205c(i);
        }
    }

    public void setActionBarHideOffset(int i) {
        mo3788d();
        this.f2764a.setTranslationY((float) (-Math.max(0, Math.min(i, this.f2764a.getHeight()))));
    }

    public void setActionBarVisibilityCallback(C0887a aVar) {
        this.f2786x = aVar;
        if (getWindowToken() != null) {
            this.f2786x.mo3205c(this.f2769g);
            if (this.f2778p != 0) {
                onWindowSystemUiVisibilityChanged(this.f2778p);
                C0626s.m2872o(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.f2775m = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.f2776n) {
            this.f2776n = z;
            if (!z) {
                mo3788d();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i) {
        mo3786c();
        this.f2771i.mo4973a(i);
    }

    public void setIcon(Drawable drawable) {
        mo3786c();
        this.f2771i.mo4974a(drawable);
    }

    public void setLogo(int i) {
        mo3786c();
        this.f2771i.mo4983b(i);
    }

    public void setOverlayMode(boolean z) {
        this.f2774l = z;
        this.f2773k = z && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    public void setWindowCallback(Callback callback) {
        mo3786c();
        this.f2771i.mo4979a(callback);
    }

    public void setWindowTitle(CharSequence charSequence) {
        mo3786c();
        this.f2771i.mo4980a(charSequence);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
