package android.support.p009v4.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.p009v4.view.C0577a;
import android.support.p009v4.view.C0617j;
import android.support.p009v4.view.C0618k;
import android.support.p009v4.view.C0619l;
import android.support.p009v4.view.C0621n;
import android.support.p009v4.view.C0626s;
import android.support.p009v4.view.p021a.C0583b;
import android.support.p009v4.view.p021a.C0590d;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import java.util.ArrayList;

/* renamed from: android.support.v4.widget.NestedScrollView */
public class NestedScrollView extends FrameLayout implements C0617j, C0619l {

    /* renamed from: w */
    private static final C0663a f1872w = new C0663a();

    /* renamed from: x */
    private static final int[] f1873x = {16843130};

    /* renamed from: A */
    private float f1874A;

    /* renamed from: B */
    private C0664b f1875B;

    /* renamed from: a */
    private long f1876a;

    /* renamed from: b */
    private final Rect f1877b;

    /* renamed from: c */
    private OverScroller f1878c;

    /* renamed from: d */
    private EdgeEffect f1879d;

    /* renamed from: e */
    private EdgeEffect f1880e;

    /* renamed from: f */
    private int f1881f;

    /* renamed from: g */
    private boolean f1882g;

    /* renamed from: h */
    private boolean f1883h;

    /* renamed from: i */
    private View f1884i;

    /* renamed from: j */
    private boolean f1885j;

    /* renamed from: k */
    private VelocityTracker f1886k;

    /* renamed from: l */
    private boolean f1887l;

    /* renamed from: m */
    private boolean f1888m;

    /* renamed from: n */
    private int f1889n;

    /* renamed from: o */
    private int f1890o;

    /* renamed from: p */
    private int f1891p;

    /* renamed from: q */
    private int f1892q;

    /* renamed from: r */
    private final int[] f1893r;

    /* renamed from: s */
    private final int[] f1894s;

    /* renamed from: t */
    private int f1895t;

    /* renamed from: u */
    private int f1896u;

    /* renamed from: v */
    private SavedState f1897v;

    /* renamed from: y */
    private final C0621n f1898y;

    /* renamed from: z */
    private final C0618k f1899z;

    /* renamed from: android.support.v4.widget.NestedScrollView$SavedState */
    static class SavedState extends BaseSavedState {
        public static final Creator<SavedState> CREATOR = new Creator<SavedState>() {
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* renamed from: a */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };

        /* renamed from: a */
        public int f1900a;

        SavedState(Parcel parcel) {
            super(parcel);
            this.f1900a = parcel.readInt();
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("HorizontalScrollView.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" scrollPosition=");
            sb.append(this.f1900a);
            sb.append("}");
            return sb.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f1900a);
        }
    }

    /* renamed from: android.support.v4.widget.NestedScrollView$a */
    static class C0663a extends C0577a {
        C0663a() {
        }

        /* renamed from: a */
        public void mo285a(View view, C0583b bVar) {
            super.mo285a(view, bVar);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            bVar.mo2361b((CharSequence) ScrollView.class.getName());
            if (nestedScrollView.isEnabled()) {
                int scrollRange = nestedScrollView.getScrollRange();
                if (scrollRange > 0) {
                    bVar.mo2389k(true);
                    if (nestedScrollView.getScrollY() > 0) {
                        bVar.mo2351a(8192);
                    }
                    if (nestedScrollView.getScrollY() < scrollRange) {
                        bVar.mo2351a(4096);
                    }
                }
            }
        }

        /* renamed from: a */
        public void mo474a(View view, AccessibilityEvent accessibilityEvent) {
            super.mo474a(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            C0590d.m2703a(accessibilityEvent, nestedScrollView.getScrollX());
            C0590d.m2704b(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        /* renamed from: a */
        public boolean mo2319a(View view, int i, Bundle bundle) {
            if (super.mo2319a(view, i, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            if (i == 4096) {
                int min = Math.min(nestedScrollView.getScrollY() + ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
                if (min == nestedScrollView.getScrollY()) {
                    return false;
                }
                nestedScrollView.mo2668c(0, min);
                return true;
            } else if (i != 8192) {
                return false;
            } else {
                int max = Math.max(nestedScrollView.getScrollY() - ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                if (max == nestedScrollView.getScrollY()) {
                    return false;
                }
                nestedScrollView.mo2668c(0, max);
                return true;
            }
        }
    }

    /* renamed from: android.support.v4.widget.NestedScrollView$b */
    public interface C0664b {
        /* renamed from: a */
        void mo2723a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4);
    }

    public NestedScrollView(Context context) {
        this(context, null);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1877b = new Rect();
        this.f1882g = true;
        this.f1883h = false;
        this.f1884i = null;
        this.f1885j = false;
        this.f1888m = true;
        this.f1892q = -1;
        this.f1893r = new int[2];
        this.f1894s = new int[2];
        m3111a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1873x, i, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f1898y = new C0621n(this);
        this.f1899z = new C0618k(this);
        setNestedScrollingEnabled(true);
        C0626s.m2844a((View) this, (C0577a) f1872w);
    }

    /* renamed from: a */
    private View m3110a(boolean z, int i, int i2) {
        ArrayList focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z2 = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view2 = (View) focusables.get(i3);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i < bottom && top < i2) {
                boolean z3 = i < top && bottom < i2;
                if (view == null) {
                    view = view2;
                    z2 = z3;
                } else {
                    boolean z4 = (z && top < view.getTop()) || (!z && bottom > view.getBottom());
                    if (z2) {
                        if (z3) {
                            if (!z4) {
                            }
                        }
                    } else if (z3) {
                        view = view2;
                        z2 = true;
                    } else if (!z4) {
                    }
                    view = view2;
                }
            }
        }
        return view;
    }

    /* renamed from: a */
    private void m3111a() {
        this.f1878c = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f1889n = viewConfiguration.getScaledTouchSlop();
        this.f1890o = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1891p = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    /* renamed from: a */
    private void m3112a(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f1892q) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f1881f = (int) motionEvent.getY(i);
            this.f1892q = motionEvent.getPointerId(i);
            if (this.f1886k != null) {
                this.f1886k.clear();
            }
        }
    }

    /* renamed from: a */
    private boolean m3113a(int i, int i2, int i3) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = height + scrollY;
        boolean z = false;
        boolean z2 = i == 33;
        View a = m3110a(z2, i2, i3);
        if (a == null) {
            a = this;
        }
        if (i2 < scrollY || i3 > i4) {
            m3127g(z2 ? i2 - scrollY : i3 - i4);
            z = true;
        }
        if (a != findFocus()) {
            a.requestFocus(i);
        }
        return z;
    }

    /* renamed from: a */
    private boolean m3114a(Rect rect, boolean z) {
        int a = mo2655a(rect);
        boolean z2 = a != 0;
        if (z2) {
            if (z) {
                scrollBy(0, a);
            } else {
                mo2666b(0, a);
            }
        }
        return z2;
    }

    /* renamed from: a */
    private boolean m3115a(View view) {
        return !m3116a(view, 0, getHeight());
    }

    /* renamed from: a */
    private boolean m3116a(View view, int i, int i2) {
        view.getDrawingRect(this.f1877b);
        offsetDescendantRectToMyCoords(view, this.f1877b);
        return this.f1877b.bottom + i >= getScrollY() && this.f1877b.top - i <= getScrollY() + i2;
    }

    /* renamed from: a */
    private static boolean m3117a(View view, View view2) {
        boolean z = true;
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        if (!(parent instanceof ViewGroup) || !m3117a((View) parent, view2)) {
            z = false;
        }
        return z;
    }

    /* renamed from: b */
    private static int m3118b(int i, int i2, int i3) {
        if (i2 >= i3 || i < 0) {
            return 0;
        }
        return i2 + i > i3 ? i3 - i2 : i;
    }

    /* renamed from: b */
    private void m3119b(View view) {
        view.getDrawingRect(this.f1877b);
        offsetDescendantRectToMyCoords(view, this.f1877b);
        int a = mo2655a(this.f1877b);
        if (a != 0) {
            scrollBy(0, a);
        }
    }

    /* renamed from: b */
    private boolean m3120b() {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return false;
        }
        return getHeight() < (childAt.getHeight() + getPaddingTop()) + getPaddingBottom();
    }

    /* renamed from: c */
    private void m3121c() {
        if (this.f1886k == null) {
            this.f1886k = VelocityTracker.obtain();
        } else {
            this.f1886k.clear();
        }
    }

    /* renamed from: d */
    private void m3122d() {
        if (this.f1886k == null) {
            this.f1886k = VelocityTracker.obtain();
        }
    }

    /* renamed from: d */
    private boolean m3123d(int i, int i2) {
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollY = getScrollY();
        View childAt = getChildAt(0);
        return i2 >= childAt.getTop() - scrollY && i2 < childAt.getBottom() - scrollY && i >= childAt.getLeft() && i < childAt.getRight();
    }

    /* renamed from: e */
    private void m3124e() {
        if (this.f1886k != null) {
            this.f1886k.recycle();
            this.f1886k = null;
        }
    }

    /* renamed from: f */
    private void m3125f() {
        this.f1885j = false;
        m3124e();
        mo2656a(0);
        if (this.f1879d != null) {
            this.f1879d.onRelease();
            this.f1880e.onRelease();
        }
    }

    /* renamed from: g */
    private void m3126g() {
        if (getOverScrollMode() == 2) {
            this.f1879d = null;
            this.f1880e = null;
        } else if (this.f1879d == null) {
            Context context = getContext();
            this.f1879d = new EdgeEffect(context);
            this.f1880e = new EdgeEffect(context);
        }
    }

    /* renamed from: g */
    private void m3127g(int i) {
        if (i == 0) {
            return;
        }
        if (this.f1888m) {
            mo2666b(0, i);
        } else {
            scrollBy(0, i);
        }
    }

    private float getVerticalScrollFactorCompat() {
        if (this.f1874A == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                this.f1874A = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.f1874A;
    }

    /* renamed from: h */
    private void m3128h(int i) {
        int scrollY = getScrollY();
        boolean z = (scrollY > 0 || i > 0) && (scrollY < getScrollRange() || i < 0);
        float f = (float) i;
        if (!dispatchNestedPreFling(0.0f, f)) {
            dispatchNestedFling(0.0f, f, z);
            mo2685f(i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo2655a(Rect rect) {
        int i = 0;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i2 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        if (rect.bottom < getChildAt(0).getHeight()) {
            i2 -= verticalFadingEdgeLength;
        }
        if (rect.bottom > i2 && rect.top > scrollY) {
            i = Math.min((rect.height() > height ? rect.top - scrollY : rect.bottom - i2) + 0, getChildAt(0).getBottom() - i2);
        } else if (rect.top < scrollY && rect.bottom < i2) {
            i = Math.max(rect.height() > height ? 0 - (i2 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
        }
        return i;
    }

    /* renamed from: a */
    public void mo2656a(int i) {
        this.f1899z.mo2469c(i);
    }

    /* renamed from: a */
    public boolean mo2657a(int i, int i2) {
        return this.f1899z.mo2461a(i, i2);
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0083 A[ADDED_TO_REGION] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo2658a(int r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20, boolean r21) {
        /*
            r12 = this;
            r0 = r12
            int r1 = r12.getOverScrollMode()
            int r2 = r12.computeHorizontalScrollRange()
            int r3 = r12.computeHorizontalScrollExtent()
            r4 = 0
            r5 = 1
            if (r2 <= r3) goto L_0x0013
            r2 = 1
            goto L_0x0014
        L_0x0013:
            r2 = 0
        L_0x0014:
            int r3 = r12.computeVerticalScrollRange()
            int r6 = r12.computeVerticalScrollExtent()
            if (r3 <= r6) goto L_0x0020
            r3 = 1
            goto L_0x0021
        L_0x0020:
            r3 = 0
        L_0x0021:
            if (r1 == 0) goto L_0x002a
            if (r1 != r5) goto L_0x0028
            if (r2 == 0) goto L_0x0028
            goto L_0x002a
        L_0x0028:
            r2 = 0
            goto L_0x002b
        L_0x002a:
            r2 = 1
        L_0x002b:
            if (r1 == 0) goto L_0x0034
            if (r1 != r5) goto L_0x0032
            if (r3 == 0) goto L_0x0032
            goto L_0x0034
        L_0x0032:
            r6 = 0
            goto L_0x0035
        L_0x0034:
            r6 = 1
        L_0x0035:
            int r1 = r15 + r13
            if (r2 != 0) goto L_0x003b
            r7 = 0
            goto L_0x003d
        L_0x003b:
            r7 = r19
        L_0x003d:
            int r2 = r16 + r14
            if (r6 != 0) goto L_0x0043
            r3 = 0
            goto L_0x0045
        L_0x0043:
            r3 = r20
        L_0x0045:
            int r6 = -r7
            int r7 = r7 + r17
            int r8 = -r3
            int r3 = r3 + r18
            if (r1 <= r7) goto L_0x0050
            r6 = r7
        L_0x004e:
            r1 = 1
            goto L_0x0055
        L_0x0050:
            if (r1 >= r6) goto L_0x0053
            goto L_0x004e
        L_0x0053:
            r6 = r1
            r1 = 0
        L_0x0055:
            if (r2 <= r3) goto L_0x005a
            r8 = r3
        L_0x0058:
            r2 = 1
            goto L_0x005f
        L_0x005a:
            if (r2 >= r8) goto L_0x005d
            goto L_0x0058
        L_0x005d:
            r8 = r2
            r2 = 0
        L_0x005f:
            if (r2 == 0) goto L_0x007e
            boolean r3 = r12.mo2667b(r5)
            if (r3 != 0) goto L_0x007e
            android.widget.OverScroller r3 = r0.f1878c
            r7 = 0
            r9 = 0
            r10 = 0
            int r11 = r12.getScrollRange()
            r13 = r3
            r14 = r6
            r15 = r8
            r16 = r7
            r17 = r9
            r18 = r10
            r19 = r11
            r13.springBack(r14, r15, r16, r17, r18, r19)
        L_0x007e:
            r12.onOverScrolled(r6, r8, r1, r2)
            if (r1 != 0) goto L_0x0085
            if (r2 == 0) goto L_0x0086
        L_0x0085:
            r4 = 1
        L_0x0086:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p009v4.widget.NestedScrollView.mo2658a(int, int, int, int, int, int, int, int, boolean):boolean");
    }

    /* renamed from: a */
    public boolean mo2659a(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return this.f1899z.mo2463a(i, i2, i3, i4, iArr, i5);
    }

    /* renamed from: a */
    public boolean mo2660a(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return this.f1899z.mo2465a(i, i2, iArr, iArr2, i3);
    }

    /* renamed from: a */
    public boolean mo2661a(KeyEvent keyEvent) {
        this.f1877b.setEmpty();
        boolean z = false;
        int i = 130;
        if (!m3120b()) {
            if (isFocused() && keyEvent.getKeyCode() != 4) {
                View findFocus = findFocus();
                if (findFocus == this) {
                    findFocus = null;
                }
                View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
                if (!(findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(130))) {
                    z = true;
                }
            }
            return z;
        }
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 62) {
                switch (keyCode) {
                    case 19:
                        if (keyEvent.isAltPressed()) {
                            z = mo2677d(33);
                            break;
                        } else {
                            z = mo2684e(33);
                            break;
                        }
                    case 20:
                        if (keyEvent.isAltPressed()) {
                            z = mo2677d(130);
                            break;
                        } else {
                            z = mo2684e(130);
                            break;
                        }
                }
            } else {
                if (keyEvent.isShiftPressed()) {
                    i = 33;
                }
                mo2669c(i);
            }
        }
        return z;
    }

    public void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, int i, LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    /* renamed from: b */
    public final void mo2666b(int i, int i2) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.f1876a > 250) {
                int max = Math.max(0, getChildAt(0).getHeight() - ((getHeight() - getPaddingBottom()) - getPaddingTop()));
                int scrollY = getScrollY();
                this.f1878c.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i2 + scrollY, max)) - scrollY);
                C0626s.m2857c(this);
            } else {
                if (!this.f1878c.isFinished()) {
                    this.f1878c.abortAnimation();
                }
                scrollBy(i, i2);
            }
            this.f1876a = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    /* renamed from: b */
    public boolean mo2667b(int i) {
        return this.f1899z.mo2460a(i);
    }

    /* renamed from: c */
    public final void mo2668c(int i, int i2) {
        mo2666b(i - getScrollX(), i2 - getScrollY());
    }

    /* renamed from: c */
    public boolean mo2669c(int i) {
        Rect rect;
        int i2 = 0;
        boolean z = i == 130;
        int height = getHeight();
        if (z) {
            this.f1877b.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                if (this.f1877b.top + height > childAt.getBottom()) {
                    rect = this.f1877b;
                    i2 = childAt.getBottom() - height;
                }
            }
            this.f1877b.bottom = this.f1877b.top + height;
            return m3113a(i, this.f1877b.top, this.f1877b.bottom);
        }
        this.f1877b.top = getScrollY() - height;
        if (this.f1877b.top < 0) {
            rect = this.f1877b;
        }
        this.f1877b.bottom = this.f1877b.top + height;
        return m3113a(i, this.f1877b.top, this.f1877b.bottom);
        rect.top = i2;
        this.f1877b.bottom = this.f1877b.top + height;
        return m3113a(i, this.f1877b.top, this.f1877b.bottom);
    }

    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    public void computeScroll() {
        EdgeEffect edgeEffect;
        if (this.f1878c.computeScrollOffset()) {
            this.f1878c.getCurrX();
            int currY = this.f1878c.getCurrY();
            int i = currY - this.f1896u;
            if (mo2660a(0, i, this.f1894s, null, 1)) {
                i -= this.f1894s[1];
            }
            int i2 = i;
            if (i2 != 0) {
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                int i3 = scrollY;
                mo2658a(0, i2, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
                int scrollY2 = getScrollY() - i3;
                if (!mo2659a(0, scrollY2, 0, i2 - scrollY2, null, 1)) {
                    int overScrollMode = getOverScrollMode();
                    if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                        m3126g();
                        if (currY <= 0 && i3 > 0) {
                            edgeEffect = this.f1879d;
                        } else if (currY >= scrollRange && i3 < scrollRange) {
                            edgeEffect = this.f1880e;
                        }
                        edgeEffect.onAbsorb((int) this.f1878c.getCurrVelocity());
                    }
                }
            }
            this.f1896u = currY;
            C0626s.m2857c(this);
            return;
        }
        if (mo2667b(1)) {
            mo2656a(1);
        }
        this.f1896u = 0;
    }

    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    public int computeVerticalScrollRange() {
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (getChildCount() == 0) {
            return height;
        }
        int bottom = getChildAt(0).getBottom();
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        if (scrollY < 0) {
            bottom -= scrollY;
        } else if (scrollY > max) {
            bottom += scrollY - max;
        }
        return bottom;
    }

    /* renamed from: d */
    public boolean mo2677d(int i) {
        boolean z = i == 130;
        int height = getHeight();
        this.f1877b.top = 0;
        this.f1877b.bottom = height;
        if (z) {
            int childCount = getChildCount();
            if (childCount > 0) {
                this.f1877b.bottom = getChildAt(childCount - 1).getBottom() + getPaddingBottom();
                this.f1877b.top = this.f1877b.bottom - height;
            }
        }
        return m3113a(i, this.f1877b.top, this.f1877b.bottom);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || mo2661a(keyEvent);
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f1899z.mo2459a(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f1899z.mo2458a(f, f2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f1899z.mo2464a(i, i2, iArr, iArr2);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f1899z.mo2462a(i, i2, i3, i4, iArr);
    }

    public void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.f1879d != null) {
            int scrollY = getScrollY();
            int i2 = 0;
            if (!this.f1879d.isFinished()) {
                int save = canvas.save();
                int width = getWidth();
                int height = getHeight();
                int min = Math.min(0, scrollY);
                if (VERSION.SDK_INT < 21 || getClipToPadding()) {
                    width -= getPaddingLeft() + getPaddingRight();
                    i = getPaddingLeft() + 0;
                } else {
                    i = 0;
                }
                if (VERSION.SDK_INT >= 21 && getClipToPadding()) {
                    height -= getPaddingTop() + getPaddingBottom();
                    min += getPaddingTop();
                }
                canvas.translate((float) i, (float) min);
                this.f1879d.setSize(width, height);
                if (this.f1879d.draw(canvas)) {
                    C0626s.m2857c(this);
                }
                canvas.restoreToCount(save);
            }
            if (!this.f1880e.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = getHeight();
                int max = Math.max(getScrollRange(), scrollY) + height2;
                if (VERSION.SDK_INT < 21 || getClipToPadding()) {
                    width2 -= getPaddingLeft() + getPaddingRight();
                    i2 = 0 + getPaddingLeft();
                }
                if (VERSION.SDK_INT >= 21 && getClipToPadding()) {
                    height2 -= getPaddingTop() + getPaddingBottom();
                    max -= getPaddingBottom();
                }
                canvas.translate((float) (i2 - width2), (float) max);
                canvas.rotate(180.0f, (float) width2, 0.0f);
                this.f1880e.setSize(width2, height2);
                if (this.f1880e.draw(canvas)) {
                    C0626s.m2857c(this);
                }
                canvas.restoreToCount(save2);
            }
        }
    }

    /* renamed from: e */
    public boolean mo2684e(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !m3116a(findNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                int bottom = getChildAt(0).getBottom() - ((getScrollY() + getHeight()) - getPaddingBottom());
                if (bottom < maxScrollAmount) {
                    maxScrollAmount = bottom;
                }
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            m3127g(maxScrollAmount);
        } else {
            findNextFocus.getDrawingRect(this.f1877b);
            offsetDescendantRectToMyCoords(findNextFocus, this.f1877b);
            m3127g(mo2655a(this.f1877b));
            findNextFocus.requestFocus(i);
        }
        if (findFocus != null && findFocus.isFocused() && m3115a(findFocus)) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    /* renamed from: f */
    public void mo2685f(int i) {
        if (getChildCount() > 0) {
            mo2657a(2, 1);
            this.f1878c.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            this.f1896u = getScrollY();
            C0626s.m2857c(this);
        }
    }

    /* access modifiers changed from: protected */
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = (getChildAt(0).getBottom() - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return ((float) bottom) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (((float) getHeight()) * 0.5f);
    }

    public int getNestedScrollAxes() {
        return this.f1898y.mo2470a();
    }

    /* access modifiers changed from: 0000 */
    public int getScrollRange() {
        if (getChildCount() > 0) {
            return Math.max(0, getChildAt(0).getHeight() - ((getHeight() - getPaddingBottom()) - getPaddingTop()));
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return ((float) scrollY) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public boolean hasNestedScrollingParent() {
        return this.f1899z.mo2466b();
    }

    public boolean isNestedScrollingEnabled() {
        return this.f1899z.mo2457a();
    }

    /* access modifiers changed from: protected */
    public void measureChild(View view, int i, int i2) {
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), MeasureSpec.makeMeasureSpec(0, 0));
    }

    /* access modifiers changed from: protected */
    public void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1883h = false;
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() == 8 && !this.f1885j) {
            float axisValue = motionEvent.getAxisValue(9);
            if (axisValue != 0.0f) {
                int verticalScrollFactorCompat = (int) (axisValue * getVerticalScrollFactorCompat());
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                int i = scrollY - verticalScrollFactorCompat;
                if (i < 0) {
                    i = 0;
                } else if (i > scrollRange) {
                    i = scrollRange;
                }
                if (i != scrollY) {
                    super.scrollTo(getScrollX(), i);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 2 && this.f1885j) {
            return true;
        }
        int i = action & 255;
        if (i != 6) {
            switch (i) {
                case 0:
                    int y = (int) motionEvent.getY();
                    if (m3123d((int) motionEvent.getX(), y)) {
                        this.f1881f = y;
                        this.f1892q = motionEvent.getPointerId(0);
                        m3121c();
                        this.f1886k.addMovement(motionEvent);
                        this.f1878c.computeScrollOffset();
                        this.f1885j = !this.f1878c.isFinished();
                        mo2657a(2, 0);
                        break;
                    } else {
                        this.f1885j = false;
                        m3124e();
                        break;
                    }
                case 1:
                case 3:
                    this.f1885j = false;
                    this.f1892q = -1;
                    m3124e();
                    if (this.f1878c.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                        C0626s.m2857c(this);
                    }
                    mo2656a(0);
                    break;
                case 2:
                    int i2 = this.f1892q;
                    if (i2 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i2);
                        if (findPointerIndex != -1) {
                            int y2 = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y2 - this.f1881f) > this.f1889n && (2 & getNestedScrollAxes()) == 0) {
                                this.f1885j = true;
                                this.f1881f = y2;
                                m3122d();
                                this.f1886k.addMovement(motionEvent);
                                this.f1895t = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                    break;
                                }
                            }
                        } else {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Invalid pointerId=");
                            sb.append(i2);
                            sb.append(" in onInterceptTouchEvent");
                            Log.e("NestedScrollView", sb.toString());
                            break;
                        }
                    }
                    break;
            }
        } else {
            m3112a(motionEvent);
        }
        return this.f1885j;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f1882g = false;
        if (this.f1884i != null && m3117a(this.f1884i, (View) this)) {
            m3119b(this.f1884i);
        }
        this.f1884i = null;
        if (!this.f1883h) {
            if (this.f1897v != null) {
                scrollTo(getScrollX(), this.f1897v.f1900a);
                this.f1897v = null;
            }
            int max = Math.max(0, (getChildCount() > 0 ? getChildAt(0).getMeasuredHeight() : 0) - (((i4 - i2) - getPaddingBottom()) - getPaddingTop()));
            if (getScrollY() > max) {
                scrollTo(getScrollX(), max);
            } else if (getScrollY() < 0) {
                scrollTo(getScrollX(), 0);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f1883h = true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f1887l && MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            int measuredHeight = getMeasuredHeight();
            if (childAt.getMeasuredHeight() < measuredHeight) {
                childAt.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), ((FrameLayout.LayoutParams) childAt.getLayoutParams()).width), MeasureSpec.makeMeasureSpec((measuredHeight - getPaddingTop()) - getPaddingBottom(), 1073741824));
            }
        }
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        m3128h((int) f2);
        return true;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        dispatchNestedPreScroll(i, i2, iArr, null);
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int scrollY = getScrollY();
        scrollBy(0, i4);
        int scrollY2 = getScrollY() - scrollY;
        dispatchNestedScroll(0, scrollY2, 0, i4 - scrollY2, null);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f1898y.mo2473a(view, view2, i);
        startNestedScroll(2);
    }

    /* access modifiers changed from: protected */
    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        View findNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        if (findNextFocus != null && !m3115a(findNextFocus)) {
            return findNextFocus.requestFocus(i, rect);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f1897v = savedState;
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f1900a = getScrollY();
        return savedState;
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if (this.f1875B != null) {
            this.f1875B.mo2723a(this, i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && m3116a(findFocus, 0, i4)) {
            findFocus.getDrawingRect(this.f1877b);
            offsetDescendantRectToMyCoords(findFocus, this.f1877b);
            m3127g(mo2655a(this.f1877b));
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return (i & 2) != 0;
    }

    public void onStopNestedScroll(View view) {
        this.f1898y.mo2471a(view);
        stopNestedScroll();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0066, code lost:
        if (r10.f1878c.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()) != false) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0068, code lost:
        android.support.p009v4.view.C0626s.m2857c(r23);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x020f, code lost:
        if (r10.f1878c.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()) != false) goto L_0x0068;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r24) {
        /*
            r23 = this;
            r10 = r23
            r11 = r24
            r23.m3122d()
            android.view.MotionEvent r12 = android.view.MotionEvent.obtain(r24)
            int r0 = r24.getActionMasked()
            r13 = 0
            if (r0 != 0) goto L_0x0014
            r10.f1895t = r13
        L_0x0014:
            int r1 = r10.f1895t
            float r1 = (float) r1
            r14 = 0
            r12.offsetLocation(r14, r1)
            r1 = -1
            r15 = 1
            switch(r0) {
                case 0: goto L_0x0213;
                case 1: goto L_0x01db;
                case 2: goto L_0x0072;
                case 3: goto L_0x0047;
                case 4: goto L_0x0020;
                case 5: goto L_0x0034;
                case 6: goto L_0x0022;
                default: goto L_0x0020;
            }
        L_0x0020:
            goto L_0x024c
        L_0x0022:
            r23.m3112a(r24)
            int r0 = r10.f1892q
            int r0 = r11.findPointerIndex(r0)
            float r0 = r11.getY(r0)
            int r0 = (int) r0
            r10.f1881f = r0
            goto L_0x024c
        L_0x0034:
            int r0 = r24.getActionIndex()
            float r1 = r11.getY(r0)
            int r1 = (int) r1
            r10.f1881f = r1
            int r0 = r11.getPointerId(r0)
            r10.f1892q = r0
            goto L_0x024c
        L_0x0047:
            boolean r0 = r10.f1885j
            if (r0 == 0) goto L_0x006b
            int r0 = r23.getChildCount()
            if (r0 <= 0) goto L_0x006b
            android.widget.OverScroller r2 = r10.f1878c
            int r3 = r23.getScrollX()
            int r4 = r23.getScrollY()
            r5 = 0
            r6 = 0
            r7 = 0
            int r8 = r23.getScrollRange()
            boolean r0 = r2.springBack(r3, r4, r5, r6, r7, r8)
            if (r0 == 0) goto L_0x006b
        L_0x0068:
            android.support.p009v4.view.C0626s.m2857c(r23)
        L_0x006b:
            r10.f1892q = r1
            r23.m3125f()
            goto L_0x024c
        L_0x0072:
            int r0 = r10.f1892q
            int r9 = r11.findPointerIndex(r0)
            if (r9 != r1) goto L_0x0099
            java.lang.String r0 = "NestedScrollView"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid pointerId="
            r1.append(r2)
            int r2 = r10.f1892q
            r1.append(r2)
            java.lang.String r2 = " in onTouchEvent"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r0, r1)
            goto L_0x024c
        L_0x0099:
            float r0 = r11.getY(r9)
            int r6 = (int) r0
            int r0 = r10.f1881f
            int r7 = r0 - r6
            r1 = 0
            int[] r3 = r10.f1894s
            int[] r4 = r10.f1893r
            r5 = 0
            r0 = r23
            r2 = r7
            boolean r0 = r0.mo2660a(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x00c7
            int[] r0 = r10.f1894s
            r0 = r0[r15]
            int r7 = r7 - r0
            int[] r0 = r10.f1893r
            r0 = r0[r15]
            float r0 = (float) r0
            r12.offsetLocation(r14, r0)
            int r0 = r10.f1895t
            int[] r1 = r10.f1893r
            r1 = r1[r15]
            int r0 = r0 + r1
            r10.f1895t = r0
        L_0x00c7:
            boolean r0 = r10.f1885j
            if (r0 != 0) goto L_0x00e7
            int r0 = java.lang.Math.abs(r7)
            int r1 = r10.f1889n
            if (r0 <= r1) goto L_0x00e7
            android.view.ViewParent r0 = r23.getParent()
            if (r0 == 0) goto L_0x00dc
            r0.requestDisallowInterceptTouchEvent(r15)
        L_0x00dc:
            r10.f1885j = r15
            if (r7 <= 0) goto L_0x00e4
            int r0 = r10.f1889n
            int r7 = r7 - r0
            goto L_0x00e7
        L_0x00e4:
            int r0 = r10.f1889n
            int r7 = r7 + r0
        L_0x00e7:
            r8 = r7
            boolean r0 = r10.f1885j
            if (r0 == 0) goto L_0x024c
            int[] r0 = r10.f1893r
            r0 = r0[r15]
            int r6 = r6 - r0
            r10.f1881f = r6
            int r16 = r23.getScrollY()
            int r7 = r23.getScrollRange()
            int r0 = r23.getOverScrollMode()
            if (r0 == 0) goto L_0x0109
            if (r0 != r15) goto L_0x0106
            if (r7 <= 0) goto L_0x0106
            goto L_0x0109
        L_0x0106:
            r17 = 0
            goto L_0x010b
        L_0x0109:
            r17 = 1
        L_0x010b:
            r1 = 0
            r3 = 0
            int r4 = r23.getScrollY()
            r5 = 0
            r18 = 0
            r19 = 0
            r20 = 1
            r0 = r23
            r2 = r8
            r6 = r7
            r21 = r7
            r7 = r18
            r14 = r8
            r8 = r19
            r22 = r9
            r9 = r20
            boolean r0 = r0.mo2658a(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            if (r0 == 0) goto L_0x0138
            boolean r0 = r10.mo2667b(r13)
            if (r0 != 0) goto L_0x0138
            android.view.VelocityTracker r0 = r10.f1886k
            r0.clear()
        L_0x0138:
            int r0 = r23.getScrollY()
            int r2 = r0 - r16
            int r4 = r14 - r2
            r1 = 0
            r3 = 0
            int[] r5 = r10.f1893r
            r6 = 0
            r0 = r23
            boolean r0 = r0.mo2659a(r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x016a
            int r0 = r10.f1881f
            int[] r1 = r10.f1893r
            r1 = r1[r15]
            int r0 = r0 - r1
            r10.f1881f = r0
            int[] r0 = r10.f1893r
            r0 = r0[r15]
            float r0 = (float) r0
            r1 = 0
            r12.offsetLocation(r1, r0)
            int r0 = r10.f1895t
            int[] r1 = r10.f1893r
            r1 = r1[r15]
            int r0 = r0 + r1
            r10.f1895t = r0
            goto L_0x024c
        L_0x016a:
            if (r17 == 0) goto L_0x024c
            r23.m3126g()
            int r0 = r16 + r14
            if (r0 >= 0) goto L_0x0199
            android.widget.EdgeEffect r0 = r10.f1879d
            float r1 = (float) r14
            int r2 = r23.getHeight()
            float r2 = (float) r2
            float r1 = r1 / r2
            r2 = r22
            float r2 = r11.getX(r2)
            int r3 = r23.getWidth()
            float r3 = (float) r3
            float r2 = r2 / r3
            android.support.p009v4.widget.C0695i.m3290a(r0, r1, r2)
            android.widget.EdgeEffect r0 = r10.f1880e
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x01c3
            android.widget.EdgeEffect r0 = r10.f1880e
        L_0x0195:
            r0.onRelease()
            goto L_0x01c3
        L_0x0199:
            r1 = r21
            r2 = r22
            if (r0 <= r1) goto L_0x01c3
            android.widget.EdgeEffect r0 = r10.f1880e
            float r1 = (float) r14
            int r3 = r23.getHeight()
            float r3 = (float) r3
            float r1 = r1 / r3
            r3 = 1065353216(0x3f800000, float:1.0)
            float r2 = r11.getX(r2)
            int r4 = r23.getWidth()
            float r4 = (float) r4
            float r2 = r2 / r4
            float r3 = r3 - r2
            android.support.p009v4.widget.C0695i.m3290a(r0, r1, r3)
            android.widget.EdgeEffect r0 = r10.f1879d
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x01c3
            android.widget.EdgeEffect r0 = r10.f1879d
            goto L_0x0195
        L_0x01c3:
            android.widget.EdgeEffect r0 = r10.f1879d
            if (r0 == 0) goto L_0x024c
            android.widget.EdgeEffect r0 = r10.f1879d
            boolean r0 = r0.isFinished()
            if (r0 == 0) goto L_0x01d7
            android.widget.EdgeEffect r0 = r10.f1880e
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x024c
        L_0x01d7:
            android.support.p009v4.view.C0626s.m2857c(r23)
            goto L_0x024c
        L_0x01db:
            android.view.VelocityTracker r0 = r10.f1886k
            r2 = 1000(0x3e8, float:1.401E-42)
            int r3 = r10.f1891p
            float r3 = (float) r3
            r0.computeCurrentVelocity(r2, r3)
            int r2 = r10.f1892q
            float r0 = r0.getYVelocity(r2)
            int r0 = (int) r0
            int r2 = java.lang.Math.abs(r0)
            int r3 = r10.f1890o
            if (r2 <= r3) goto L_0x01fa
            int r0 = -r0
            r10.m3128h(r0)
            goto L_0x006b
        L_0x01fa:
            android.widget.OverScroller r2 = r10.f1878c
            int r3 = r23.getScrollX()
            int r4 = r23.getScrollY()
            r5 = 0
            r6 = 0
            r7 = 0
            int r8 = r23.getScrollRange()
            boolean r0 = r2.springBack(r3, r4, r5, r6, r7, r8)
            if (r0 == 0) goto L_0x006b
            goto L_0x0068
        L_0x0213:
            int r0 = r23.getChildCount()
            if (r0 != 0) goto L_0x021a
            return r13
        L_0x021a:
            android.widget.OverScroller r0 = r10.f1878c
            boolean r0 = r0.isFinished()
            r0 = r0 ^ r15
            r10.f1885j = r0
            if (r0 == 0) goto L_0x022e
            android.view.ViewParent r0 = r23.getParent()
            if (r0 == 0) goto L_0x022e
            r0.requestDisallowInterceptTouchEvent(r15)
        L_0x022e:
            android.widget.OverScroller r0 = r10.f1878c
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x023b
            android.widget.OverScroller r0 = r10.f1878c
            r0.abortAnimation()
        L_0x023b:
            float r0 = r24.getY()
            int r0 = (int) r0
            r10.f1881f = r0
            int r0 = r11.getPointerId(r13)
            r10.f1892q = r0
            r0 = 2
            r10.mo2657a(r0, r13)
        L_0x024c:
            android.view.VelocityTracker r0 = r10.f1886k
            if (r0 == 0) goto L_0x0255
            android.view.VelocityTracker r0 = r10.f1886k
            r0.addMovement(r12)
        L_0x0255:
            r12.recycle()
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p009v4.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.f1882g) {
            m3119b(view2);
        } else {
            this.f1884i = view2;
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return m3114a(rect, z);
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            m3124e();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void requestLayout() {
        this.f1882g = true;
        super.requestLayout();
    }

    public void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            int b = m3118b(i, (getWidth() - getPaddingRight()) - getPaddingLeft(), childAt.getWidth());
            int b2 = m3118b(i2, (getHeight() - getPaddingBottom()) - getPaddingTop(), childAt.getHeight());
            if (b != getScrollX() || b2 != getScrollY()) {
                super.scrollTo(b, b2);
            }
        }
    }

    public void setFillViewport(boolean z) {
        if (z != this.f1887l) {
            this.f1887l = z;
            requestLayout();
        }
    }

    public void setNestedScrollingEnabled(boolean z) {
        this.f1899z.mo2456a(z);
    }

    public void setOnScrollChangeListener(C0664b bVar) {
        this.f1875B = bVar;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.f1888m = z;
    }

    public boolean shouldDelayChildPressedState() {
        return true;
    }

    public boolean startNestedScroll(int i) {
        return this.f1899z.mo2467b(i);
    }

    public void stopNestedScroll() {
        this.f1899z.mo2468c();
    }
}
