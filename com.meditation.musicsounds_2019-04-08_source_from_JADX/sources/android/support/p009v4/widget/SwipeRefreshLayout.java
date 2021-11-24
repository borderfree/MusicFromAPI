package android.support.p009v4.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.support.p009v4.content.C0452b;
import android.support.p009v4.view.C0616i;
import android.support.p009v4.view.C0618k;
import android.support.p009v4.view.C0619l;
import android.support.p009v4.view.C0621n;
import android.support.p009v4.view.C0626s;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.AbsListView;
import android.widget.ListView;

/* renamed from: android.support.v4.widget.SwipeRefreshLayout */
public class SwipeRefreshLayout extends ViewGroup implements C0616i, C0619l {

    /* renamed from: D */
    private static final int[] f1901D = {16842766};

    /* renamed from: m */
    private static final String f1902m = "SwipeRefreshLayout";

    /* renamed from: A */
    private int f1903A;

    /* renamed from: B */
    private boolean f1904B;

    /* renamed from: C */
    private final DecelerateInterpolator f1905C;

    /* renamed from: E */
    private int f1906E;

    /* renamed from: F */
    private Animation f1907F;

    /* renamed from: G */
    private Animation f1908G;

    /* renamed from: H */
    private Animation f1909H;

    /* renamed from: I */
    private Animation f1910I;

    /* renamed from: J */
    private Animation f1911J;

    /* renamed from: K */
    private int f1912K;

    /* renamed from: L */
    private C0673a f1913L;

    /* renamed from: M */
    private AnimationListener f1914M;

    /* renamed from: N */
    private final Animation f1915N;

    /* renamed from: O */
    private final Animation f1916O;

    /* renamed from: a */
    C0674b f1917a;

    /* renamed from: b */
    boolean f1918b;

    /* renamed from: c */
    int f1919c;

    /* renamed from: d */
    boolean f1920d;

    /* renamed from: e */
    C0679c f1921e;

    /* renamed from: f */
    protected int f1922f;

    /* renamed from: g */
    float f1923g;

    /* renamed from: h */
    protected int f1924h;

    /* renamed from: i */
    int f1925i;

    /* renamed from: j */
    C0681d f1926j;

    /* renamed from: k */
    boolean f1927k;

    /* renamed from: l */
    boolean f1928l;

    /* renamed from: n */
    private View f1929n;

    /* renamed from: o */
    private int f1930o;

    /* renamed from: p */
    private float f1931p;

    /* renamed from: q */
    private float f1932q;

    /* renamed from: r */
    private final C0621n f1933r;

    /* renamed from: s */
    private final C0618k f1934s;

    /* renamed from: t */
    private final int[] f1935t;

    /* renamed from: u */
    private final int[] f1936u;

    /* renamed from: v */
    private boolean f1937v;

    /* renamed from: w */
    private int f1938w;

    /* renamed from: x */
    private float f1939x;

    /* renamed from: y */
    private float f1940y;

    /* renamed from: z */
    private boolean f1941z;

    /* renamed from: android.support.v4.widget.SwipeRefreshLayout$a */
    public interface C0673a {
        /* renamed from: a */
        boolean mo2773a(SwipeRefreshLayout swipeRefreshLayout, View view);
    }

    /* renamed from: android.support.v4.widget.SwipeRefreshLayout$b */
    public interface C0674b {
        /* renamed from: a */
        void mo2774a();
    }

    public SwipeRefreshLayout(Context context) {
        this(context, null);
    }

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1918b = false;
        this.f1931p = -1.0f;
        this.f1935t = new int[2];
        this.f1936u = new int[2];
        this.f1903A = -1;
        this.f1906E = -1;
        this.f1914M = new AnimationListener() {
            public void onAnimationEnd(Animation animation) {
                if (SwipeRefreshLayout.this.f1918b) {
                    SwipeRefreshLayout.this.f1926j.setAlpha(255);
                    SwipeRefreshLayout.this.f1926j.start();
                    if (SwipeRefreshLayout.this.f1927k && SwipeRefreshLayout.this.f1917a != null) {
                        SwipeRefreshLayout.this.f1917a.mo2774a();
                    }
                    SwipeRefreshLayout.this.f1919c = SwipeRefreshLayout.this.f1921e.getTop();
                    return;
                }
                SwipeRefreshLayout.this.mo2724a();
            }

            public void onAnimationRepeat(Animation animation) {
            }

            public void onAnimationStart(Animation animation) {
            }
        };
        this.f1915N = new Animation() {
            public void applyTransformation(float f, Transformation transformation) {
                SwipeRefreshLayout.this.setTargetOffsetTopAndBottom((SwipeRefreshLayout.this.f1922f + ((int) (((float) ((!SwipeRefreshLayout.this.f1928l ? SwipeRefreshLayout.this.f1925i - Math.abs(SwipeRefreshLayout.this.f1924h) : SwipeRefreshLayout.this.f1925i) - SwipeRefreshLayout.this.f1922f)) * f))) - SwipeRefreshLayout.this.f1921e.getTop());
                SwipeRefreshLayout.this.f1926j.mo2815b(1.0f - f);
            }
        };
        this.f1916O = new Animation() {
            public void applyTransformation(float f, Transformation transformation) {
                SwipeRefreshLayout.this.mo2725a(f);
            }
        };
        this.f1930o = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f1938w = getResources().getInteger(17694721);
        setWillNotDraw(false);
        this.f1905C = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f1912K = (int) (displayMetrics.density * 40.0f);
        m3159d();
        setChildrenDrawingOrderEnabled(true);
        this.f1925i = (int) (displayMetrics.density * 64.0f);
        this.f1931p = (float) this.f1925i;
        this.f1933r = new C0621n(this);
        this.f1934s = new C0618k(this);
        setNestedScrollingEnabled(true);
        int i = -this.f1912K;
        this.f1919c = i;
        this.f1924h = i;
        mo2725a(1.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1901D);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    private Animation m3149a(final int i, final int i2) {
        C06684 r0 = new Animation() {
            public void applyTransformation(float f, Transformation transformation) {
                SwipeRefreshLayout.this.f1926j.setAlpha((int) (((float) i) + (((float) (i2 - i)) * f)));
            }
        };
        r0.setDuration(300);
        this.f1921e.mo2803a(null);
        this.f1921e.clearAnimation();
        this.f1921e.startAnimation(r0);
        return r0;
    }

    /* renamed from: a */
    private void m3150a(int i, AnimationListener animationListener) {
        this.f1922f = i;
        this.f1915N.reset();
        this.f1915N.setDuration(200);
        this.f1915N.setInterpolator(this.f1905C);
        if (animationListener != null) {
            this.f1921e.mo2803a(animationListener);
        }
        this.f1921e.clearAnimation();
        this.f1921e.startAnimation(this.f1915N);
    }

    /* renamed from: a */
    private void m3151a(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f1903A) {
            this.f1903A = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
        }
    }

    /* renamed from: a */
    private void m3152a(boolean z, boolean z2) {
        if (this.f1918b != z) {
            this.f1927k = z2;
            m3163g();
            this.f1918b = z;
            if (this.f1918b) {
                m3150a(this.f1919c, this.f1914M);
            } else {
                mo2726a(this.f1914M);
            }
        }
    }

    /* renamed from: a */
    private boolean m3153a(Animation animation) {
        return animation != null && animation.hasStarted() && !animation.hasEnded();
    }

    /* renamed from: b */
    private void m3154b(float f) {
        this.f1926j.mo2813a(true);
        float min = Math.min(1.0f, Math.abs(f / this.f1931p));
        double d = (double) min;
        Double.isNaN(d);
        float max = (((float) Math.max(d - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float f2 = (float) (this.f1928l ? this.f1925i - this.f1924h : this.f1925i);
        double max2 = (double) (Math.max(0.0f, Math.min(Math.abs(f) - this.f1931p, f2 * 2.0f) / f2) / 4.0f);
        double pow = Math.pow(max2, 2.0d);
        Double.isNaN(max2);
        float f3 = ((float) (max2 - pow)) * 2.0f;
        int i = this.f1924h + ((int) ((f2 * min) + (f2 * f3 * 2.0f)));
        if (this.f1921e.getVisibility() != 0) {
            this.f1921e.setVisibility(0);
        }
        if (!this.f1920d) {
            this.f1921e.setScaleX(1.0f);
            this.f1921e.setScaleY(1.0f);
        }
        if (this.f1920d) {
            setAnimationProgress(Math.min(1.0f, f / this.f1931p));
        }
        if (f < this.f1931p) {
            if (this.f1926j.getAlpha() > 76 && !m3153a(this.f1909H)) {
                m3161e();
            }
        } else if (this.f1926j.getAlpha() < 255 && !m3153a(this.f1910I)) {
            m3162f();
        }
        this.f1926j.mo2811a(0.0f, Math.min(0.8f, max * 0.8f));
        this.f1926j.mo2815b(Math.min(1.0f, max));
        this.f1926j.mo2816c((((max * 0.4f) - 16.0f) + (f3 * 2.0f)) * 0.5f);
        setTargetOffsetTopAndBottom(i - this.f1919c);
    }

    /* renamed from: b */
    private void m3155b(int i, AnimationListener animationListener) {
        if (this.f1920d) {
            m3158c(i, animationListener);
            return;
        }
        this.f1922f = i;
        this.f1916O.reset();
        this.f1916O.setDuration(200);
        this.f1916O.setInterpolator(this.f1905C);
        if (animationListener != null) {
            this.f1921e.mo2803a(animationListener);
        }
        this.f1921e.clearAnimation();
        this.f1921e.startAnimation(this.f1916O);
    }

    /* renamed from: b */
    private void m3156b(AnimationListener animationListener) {
        this.f1921e.setVisibility(0);
        this.f1926j.setAlpha(255);
        this.f1907F = new Animation() {
            public void applyTransformation(float f, Transformation transformation) {
                SwipeRefreshLayout.this.setAnimationProgress(f);
            }
        };
        this.f1907F.setDuration((long) this.f1938w);
        if (animationListener != null) {
            this.f1921e.mo2803a(animationListener);
        }
        this.f1921e.clearAnimation();
        this.f1921e.startAnimation(this.f1907F);
    }

    /* renamed from: c */
    private void m3157c(float f) {
        if (f > this.f1931p) {
            m3152a(true, true);
            return;
        }
        this.f1918b = false;
        this.f1926j.mo2811a(0.0f, 0.0f);
        C06695 r0 = null;
        if (!this.f1920d) {
            r0 = new AnimationListener() {
                public void onAnimationEnd(Animation animation) {
                    if (!SwipeRefreshLayout.this.f1920d) {
                        SwipeRefreshLayout.this.mo2726a((AnimationListener) null);
                    }
                }

                public void onAnimationRepeat(Animation animation) {
                }

                public void onAnimationStart(Animation animation) {
                }
            };
        }
        m3155b(this.f1919c, r0);
        this.f1926j.mo2813a(false);
    }

    /* renamed from: c */
    private void m3158c(int i, AnimationListener animationListener) {
        this.f1922f = i;
        this.f1923g = this.f1921e.getScaleX();
        this.f1911J = new Animation() {
            public void applyTransformation(float f, Transformation transformation) {
                SwipeRefreshLayout.this.setAnimationProgress(SwipeRefreshLayout.this.f1923g + ((-SwipeRefreshLayout.this.f1923g) * f));
                SwipeRefreshLayout.this.mo2725a(f);
            }
        };
        this.f1911J.setDuration(150);
        if (animationListener != null) {
            this.f1921e.mo2803a(animationListener);
        }
        this.f1921e.clearAnimation();
        this.f1921e.startAnimation(this.f1911J);
    }

    /* renamed from: d */
    private void m3159d() {
        this.f1921e = new C0679c(getContext(), -328966);
        this.f1926j = new C0681d(getContext());
        this.f1926j.mo2812a(1);
        this.f1921e.setImageDrawable(this.f1926j);
        this.f1921e.setVisibility(8);
        addView(this.f1921e);
    }

    /* renamed from: d */
    private void m3160d(float f) {
        if (f - this.f1940y > ((float) this.f1930o) && !this.f1941z) {
            this.f1939x = this.f1940y + ((float) this.f1930o);
            this.f1941z = true;
            this.f1926j.setAlpha(76);
        }
    }

    /* renamed from: e */
    private void m3161e() {
        this.f1909H = m3149a(this.f1926j.getAlpha(), 76);
    }

    /* renamed from: f */
    private void m3162f() {
        this.f1910I = m3149a(this.f1926j.getAlpha(), 255);
    }

    /* renamed from: g */
    private void m3163g() {
        if (this.f1929n == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (!childAt.equals(this.f1921e)) {
                    this.f1929n = childAt;
                    return;
                }
            }
        }
    }

    private void setColorViewAlpha(int i) {
        this.f1921e.getBackground().setAlpha(i);
        this.f1926j.setAlpha(i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2724a() {
        this.f1921e.clearAnimation();
        this.f1926j.stop();
        this.f1921e.setVisibility(8);
        setColorViewAlpha(255);
        if (this.f1920d) {
            setAnimationProgress(0.0f);
        } else {
            setTargetOffsetTopAndBottom(this.f1924h - this.f1919c);
        }
        this.f1919c = this.f1921e.getTop();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2725a(float f) {
        setTargetOffsetTopAndBottom((this.f1922f + ((int) (((float) (this.f1924h - this.f1922f)) * f))) - this.f1921e.getTop());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2726a(AnimationListener animationListener) {
        this.f1908G = new Animation() {
            public void applyTransformation(float f, Transformation transformation) {
                SwipeRefreshLayout.this.setAnimationProgress(1.0f - f);
            }
        };
        this.f1908G.setDuration(150);
        this.f1921e.mo2803a(animationListener);
        this.f1921e.clearAnimation();
        this.f1921e.startAnimation(this.f1908G);
    }

    /* renamed from: b */
    public boolean mo2727b() {
        return this.f1918b;
    }

    /* renamed from: c */
    public boolean mo2728c() {
        return this.f1913L != null ? this.f1913L.mo2773a(this, this.f1929n) : this.f1929n instanceof ListView ? C0703l.m3313b((ListView) this.f1929n, -1) : this.f1929n.canScrollVertically(-1);
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f1934s.mo2459a(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f1934s.mo2458a(f, f2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f1934s.mo2464a(i, i2, iArr, iArr2);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f1934s.mo2462a(i, i2, i3, i4, iArr);
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i, int i2) {
        if (this.f1906E < 0) {
            return i2;
        }
        if (i2 == i - 1) {
            return this.f1906E;
        }
        if (i2 >= this.f1906E) {
            i2++;
        }
        return i2;
    }

    public int getNestedScrollAxes() {
        return this.f1933r.mo2470a();
    }

    public int getProgressCircleDiameter() {
        return this.f1912K;
    }

    public int getProgressViewEndOffset() {
        return this.f1925i;
    }

    public int getProgressViewStartOffset() {
        return this.f1924h;
    }

    public boolean hasNestedScrollingParent() {
        return this.f1934s.mo2466b();
    }

    public boolean isNestedScrollingEnabled() {
        return this.f1934s.mo2457a();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo2724a();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        m3163g();
        int actionMasked = motionEvent.getActionMasked();
        if (this.f1904B && actionMasked == 0) {
            this.f1904B = false;
        }
        if (!isEnabled() || this.f1904B || mo2728c() || this.f1918b || this.f1937v) {
            return false;
        }
        if (actionMasked != 6) {
            switch (actionMasked) {
                case 0:
                    setTargetOffsetTopAndBottom(this.f1924h - this.f1921e.getTop());
                    this.f1903A = motionEvent.getPointerId(0);
                    this.f1941z = false;
                    int findPointerIndex = motionEvent.findPointerIndex(this.f1903A);
                    if (findPointerIndex >= 0) {
                        this.f1940y = motionEvent.getY(findPointerIndex);
                        break;
                    } else {
                        return false;
                    }
                case 1:
                case 3:
                    this.f1941z = false;
                    this.f1903A = -1;
                    break;
                case 2:
                    if (this.f1903A != -1) {
                        int findPointerIndex2 = motionEvent.findPointerIndex(this.f1903A);
                        if (findPointerIndex2 >= 0) {
                            m3160d(motionEvent.getY(findPointerIndex2));
                            break;
                        } else {
                            return false;
                        }
                    } else {
                        Log.e(f1902m, "Got ACTION_MOVE event but don't have an active pointer id.");
                        return false;
                    }
            }
        } else {
            m3151a(motionEvent);
        }
        return this.f1941z;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() != 0) {
            if (this.f1929n == null) {
                m3163g();
            }
            if (this.f1929n != null) {
                View view = this.f1929n;
                int paddingLeft = getPaddingLeft();
                int paddingTop = getPaddingTop();
                view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
                int measuredWidth2 = this.f1921e.getMeasuredWidth();
                int i5 = measuredWidth / 2;
                int i6 = measuredWidth2 / 2;
                this.f1921e.layout(i5 - i6, this.f1919c, i5 + i6, this.f1919c + this.f1921e.getMeasuredHeight());
            }
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f1929n == null) {
            m3163g();
        }
        if (this.f1929n != null) {
            this.f1929n.measure(MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
            this.f1921e.measure(MeasureSpec.makeMeasureSpec(this.f1912K, 1073741824), MeasureSpec.makeMeasureSpec(this.f1912K, 1073741824));
            this.f1906E = -1;
            int i3 = 0;
            while (true) {
                if (i3 >= getChildCount()) {
                    break;
                } else if (getChildAt(i3) == this.f1921e) {
                    this.f1906E = i3;
                    break;
                } else {
                    i3++;
                }
            }
        }
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        return dispatchNestedFling(f, f2, z);
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (i2 > 0 && this.f1932q > 0.0f) {
            float f = (float) i2;
            if (f > this.f1932q) {
                iArr[1] = i2 - ((int) this.f1932q);
                this.f1932q = 0.0f;
            } else {
                this.f1932q -= f;
                iArr[1] = i2;
            }
            m3154b(this.f1932q);
        }
        if (this.f1928l && i2 > 0 && this.f1932q == 0.0f && Math.abs(i2 - iArr[1]) > 0) {
            this.f1921e.setVisibility(8);
        }
        int[] iArr2 = this.f1935t;
        if (dispatchNestedPreScroll(i - iArr[0], i2 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        dispatchNestedScroll(i, i2, i3, i4, this.f1936u);
        int i5 = i4 + this.f1936u[1];
        if (i5 < 0 && !mo2728c()) {
            this.f1932q += (float) Math.abs(i5);
            m3154b(this.f1932q);
        }
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f1933r.mo2473a(view, view2, i);
        startNestedScroll(i & 2);
        this.f1932q = 0.0f;
        this.f1937v = true;
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return isEnabled() && !this.f1904B && !this.f1918b && (i & 2) != 0;
    }

    public void onStopNestedScroll(View view) {
        this.f1933r.mo2471a(view);
        this.f1937v = false;
        if (this.f1932q > 0.0f) {
            m3157c(this.f1932q);
            this.f1932q = 0.0f;
        }
        stopNestedScroll();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (this.f1904B && actionMasked == 0) {
            this.f1904B = false;
        }
        if (!isEnabled() || this.f1904B || mo2728c() || this.f1918b || this.f1937v) {
            return false;
        }
        switch (actionMasked) {
            case 0:
                this.f1903A = motionEvent.getPointerId(0);
                this.f1941z = false;
                break;
            case 1:
                int findPointerIndex = motionEvent.findPointerIndex(this.f1903A);
                if (findPointerIndex < 0) {
                    Log.e(f1902m, "Got ACTION_UP event but don't have an active pointer id.");
                    return false;
                }
                if (this.f1941z) {
                    float y = (motionEvent.getY(findPointerIndex) - this.f1939x) * 0.5f;
                    this.f1941z = false;
                    m3157c(y);
                }
                this.f1903A = -1;
                return false;
            case 2:
                int findPointerIndex2 = motionEvent.findPointerIndex(this.f1903A);
                if (findPointerIndex2 < 0) {
                    Log.e(f1902m, "Got ACTION_MOVE event but have an invalid active pointer id.");
                    return false;
                }
                float y2 = motionEvent.getY(findPointerIndex2);
                m3160d(y2);
                if (this.f1941z) {
                    float f = (y2 - this.f1939x) * 0.5f;
                    if (f > 0.0f) {
                        m3154b(f);
                        break;
                    } else {
                        return false;
                    }
                }
                break;
            case 3:
                return false;
            case 5:
                int actionIndex = motionEvent.getActionIndex();
                if (actionIndex >= 0) {
                    this.f1903A = motionEvent.getPointerId(actionIndex);
                    break;
                } else {
                    Log.e(f1902m, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                    return false;
                }
            case 6:
                m3151a(motionEvent);
                break;
        }
        return true;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (VERSION.SDK_INT < 21 && (this.f1929n instanceof AbsListView)) {
            return;
        }
        if (this.f1929n == null || C0626s.m2878u(this.f1929n)) {
            super.requestDisallowInterceptTouchEvent(z);
        }
    }

    /* access modifiers changed from: 0000 */
    public void setAnimationProgress(float f) {
        this.f1921e.setScaleX(f);
        this.f1921e.setScaleY(f);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        m3163g();
        this.f1926j.mo2814a(iArr);
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = C0452b.m2068c(context, iArr[i]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i) {
        this.f1931p = (float) i;
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!z) {
            mo2724a();
        }
    }

    public void setNestedScrollingEnabled(boolean z) {
        this.f1934s.mo2456a(z);
    }

    public void setOnChildScrollUpCallback(C0673a aVar) {
        this.f1913L = aVar;
    }

    public void setOnRefreshListener(C0674b bVar) {
        this.f1917a = bVar;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i) {
        setProgressBackgroundColorSchemeResource(i);
    }

    public void setProgressBackgroundColorSchemeColor(int i) {
        this.f1921e.setBackgroundColor(i);
    }

    public void setProgressBackgroundColorSchemeResource(int i) {
        setProgressBackgroundColorSchemeColor(C0452b.m2068c(getContext(), i));
    }

    public void setRefreshing(boolean z) {
        if (!z || this.f1918b == z) {
            m3152a(z, false);
            return;
        }
        this.f1918b = z;
        setTargetOffsetTopAndBottom((!this.f1928l ? this.f1925i + this.f1924h : this.f1925i) - this.f1919c);
        this.f1927k = false;
        m3156b(this.f1914M);
    }

    public void setSize(int i) {
        if (i == 0 || i == 1) {
            this.f1912K = (int) (getResources().getDisplayMetrics().density * (i == 0 ? 56.0f : 40.0f));
            this.f1921e.setImageDrawable(null);
            this.f1926j.mo2812a(i);
            this.f1921e.setImageDrawable(this.f1926j);
        }
    }

    /* access modifiers changed from: 0000 */
    public void setTargetOffsetTopAndBottom(int i) {
        this.f1921e.bringToFront();
        C0626s.m2860d(this.f1921e, i);
        this.f1919c = this.f1921e.getTop();
    }

    public boolean startNestedScroll(int i) {
        return this.f1934s.mo2467b(i);
    }

    public void stopNestedScroll() {
        this.f1934s.mo2468c();
    }
}
