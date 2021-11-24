package android.support.design.widget;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.support.design.C0087a.C0089b;
import android.support.design.C0087a.C0098k;
import android.support.design.widget.CoordinatorLayout.C0131b;
import android.support.design.widget.CoordinatorLayout.C0132c;
import android.support.design.widget.CoordinatorLayout.C0134e;
import android.support.p009v4.p014c.C0430a;
import android.support.p009v4.view.AbsSavedState;
import android.support.p009v4.view.C0591aa;
import android.support.p009v4.view.C0626s;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import java.lang.ref.WeakReference;
import java.util.List;

@C0132c(mo557a = Behavior.class)
public class AppBarLayout extends LinearLayout {

    /* renamed from: a */
    private int f256a;

    /* renamed from: b */
    private int f257b;

    /* renamed from: c */
    private int f258c;

    /* renamed from: d */
    private boolean f259d;

    /* renamed from: e */
    private int f260e;

    /* renamed from: f */
    private C0591aa f261f;

    /* renamed from: g */
    private List<C0122b> f262g;

    /* renamed from: h */
    private boolean f263h;

    /* renamed from: i */
    private boolean f264i;

    /* renamed from: j */
    private int[] f265j;

    public static class Behavior extends C0197i<AppBarLayout> {
        /* access modifiers changed from: private */

        /* renamed from: b */
        public int f266b;

        /* renamed from: c */
        private ValueAnimator f267c;

        /* renamed from: d */
        private int f268d = -1;

        /* renamed from: e */
        private boolean f269e;

        /* renamed from: f */
        private float f270f;

        /* renamed from: g */
        private WeakReference<View> f271g;

        /* renamed from: h */
        private C0120a f272h;

        protected static class SavedState extends AbsSavedState {
            public static final Creator<SavedState> CREATOR = new ClassLoaderCreator<SavedState>() {
                /* renamed from: a */
                public SavedState createFromParcel(Parcel parcel) {
                    return new SavedState(parcel, null);
                }

                /* renamed from: a */
                public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new SavedState(parcel, classLoader);
                }

                /* renamed from: a */
                public SavedState[] newArray(int i) {
                    return new SavedState[i];
                }
            };

            /* renamed from: a */
            int f276a;

            /* renamed from: b */
            float f277b;

            /* renamed from: c */
            boolean f278c;

            public SavedState(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f276a = parcel.readInt();
                this.f277b = parcel.readFloat();
                this.f278c = parcel.readByte() != 0;
            }

            public SavedState(Parcelable parcelable) {
                super(parcelable);
            }

            public void writeToParcel(Parcel parcel, int i) {
                super.writeToParcel(parcel, i);
                parcel.writeInt(this.f276a);
                parcel.writeFloat(this.f277b);
                parcel.writeByte(this.f278c ? (byte) 1 : 0);
            }
        }

        /* renamed from: android.support.design.widget.AppBarLayout$Behavior$a */
        public static abstract class C0120a {
            /* renamed from: a */
            public abstract boolean mo429a(AppBarLayout appBarLayout);
        }

        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: a */
        private int m332a(AppBarLayout appBarLayout, int i) {
            int childCount = appBarLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = appBarLayout.getChildAt(i2);
                int i3 = -i;
                if (childAt.getTop() <= i3 && childAt.getBottom() >= i3) {
                    return i2;
                }
            }
            return -1;
        }

        /* renamed from: a */
        private void m333a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, float f) {
            int abs = Math.abs(mo392a() - i);
            float abs2 = Math.abs(f);
            m334a(coordinatorLayout, appBarLayout, i, abs2 > 0.0f ? Math.round((((float) abs) / abs2) * 1000.0f) * 3 : (int) (((((float) abs) / ((float) appBarLayout.getHeight())) + 1.0f) * 150.0f));
        }

        /* renamed from: a */
        private void m334a(final CoordinatorLayout coordinatorLayout, final AppBarLayout appBarLayout, int i, int i2) {
            int a = mo392a();
            if (a == i) {
                if (this.f267c != null && this.f267c.isRunning()) {
                    this.f267c.cancel();
                }
                return;
            }
            if (this.f267c == null) {
                this.f267c = new ValueAnimator();
                this.f267c.setInterpolator(C0163a.f486e);
                this.f267c.addUpdateListener(new AnimatorUpdateListener() {
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        Behavior.this.mo913a_(coordinatorLayout, appBarLayout, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                    }
                });
            } else {
                this.f267c.cancel();
            }
            this.f267c.setDuration((long) Math.min(i2, 600));
            this.f267c.setIntValues(new int[]{a, i});
            this.f267c.start();
        }

        /* renamed from: a */
        private void m335a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, boolean z) {
            View c = m338c(appBarLayout, i);
            if (c != null) {
                int a = ((C0121a) c.getLayoutParams()).mo437a();
                boolean z2 = false;
                if ((a & 1) != 0) {
                    int j = C0626s.m2867j(c);
                    if (i2 <= 0 || (a & 12) == 0 ? !((a & 2) == 0 || (-i) < (c.getBottom() - j) - appBarLayout.getTopInset()) : (-i) >= (c.getBottom() - j) - appBarLayout.getTopInset()) {
                        z2 = true;
                    }
                }
                boolean a2 = appBarLayout.mo370a(z2);
                if (VERSION.SDK_INT < 11) {
                    return;
                }
                if (z || (a2 && m340d(coordinatorLayout, appBarLayout))) {
                    appBarLayout.jumpDrawablesToCurrentState();
                }
            }
        }

        /* renamed from: a */
        private static boolean m336a(int i, int i2) {
            return (i & i2) == i2;
        }

        /* renamed from: b */
        private int m337b(AppBarLayout appBarLayout, int i) {
            int abs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    break;
                }
                View childAt = appBarLayout.getChildAt(i3);
                C0121a aVar = (C0121a) childAt.getLayoutParams();
                Interpolator b = aVar.mo438b();
                if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                    i3++;
                } else if (b != null) {
                    int a = aVar.mo437a();
                    if ((a & 1) != 0) {
                        i2 = 0 + childAt.getHeight() + aVar.topMargin + aVar.bottomMargin;
                        if ((a & 2) != 0) {
                            i2 -= C0626s.m2867j(childAt);
                        }
                    }
                    if (C0626s.m2873p(childAt)) {
                        i2 -= appBarLayout.getTopInset();
                    }
                    if (i2 > 0) {
                        float f = (float) i2;
                        return Integer.signum(i) * (childAt.getTop() + Math.round(f * b.getInterpolation(((float) (abs - childAt.getTop())) / f)));
                    }
                }
            }
            return i;
        }

        /* renamed from: c */
        private static View m338c(AppBarLayout appBarLayout, int i) {
            int abs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = appBarLayout.getChildAt(i2);
                if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        /* renamed from: c */
        private void m339c(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            int a = mo392a();
            int a2 = m332a(appBarLayout, a);
            if (a2 >= 0) {
                View childAt = appBarLayout.getChildAt(a2);
                int a3 = ((C0121a) childAt.getLayoutParams()).mo437a();
                if ((a3 & 17) == 17) {
                    int i = -childAt.getTop();
                    int i2 = -childAt.getBottom();
                    if (a2 == appBarLayout.getChildCount() - 1) {
                        i2 += appBarLayout.getTopInset();
                    }
                    if (m336a(a3, 2)) {
                        i2 += C0626s.m2867j(childAt);
                    } else if (m336a(a3, 5)) {
                        int j = C0626s.m2867j(childAt) + i2;
                        if (a < j) {
                            i = j;
                        } else {
                            i2 = j;
                        }
                    }
                    if (a < (i2 + i) / 2) {
                        i = i2;
                    }
                    m333a(coordinatorLayout, appBarLayout, C0430a.m1985a(i, -appBarLayout.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        /* renamed from: d */
        private boolean m340d(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            List d = coordinatorLayout.mo501d((View) appBarLayout);
            int size = d.size();
            boolean z = false;
            for (int i = 0; i < size; i++) {
                C0131b b = ((C0134e) ((View) d.get(i)).getLayoutParams()).mo568b();
                if (b instanceof ScrollingViewBehavior) {
                    if (((ScrollingViewBehavior) b).mo920d() != 0) {
                        z = true;
                    }
                    return z;
                }
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo392a() {
            return mo414b() + this.f266b;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo394a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, int i3) {
            int a = mo392a();
            int i4 = 0;
            if (i2 == 0 || a < i2 || a > i3) {
                this.f266b = 0;
            } else {
                int a2 = C0430a.m1985a(i, i2, i3);
                if (a != a2) {
                    int b = appBarLayout.mo371b() ? m337b(appBarLayout, a2) : a2;
                    boolean a3 = mo406a(b);
                    i4 = a - a2;
                    this.f266b = a2 - b;
                    if (!a3 && appBarLayout.mo371b()) {
                        coordinatorLayout.mo491b((View) appBarLayout);
                    }
                    appBarLayout.mo368a(mo414b());
                    m335a(coordinatorLayout, appBarLayout, a2, a2 < a ? -1 : 1, false);
                }
            }
            return i4;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo401a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            m339c(coordinatorLayout, appBarLayout);
        }

        /* renamed from: a */
        public void mo402a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            if (parcelable instanceof SavedState) {
                SavedState savedState = (SavedState) parcelable;
                super.mo402a(coordinatorLayout, appBarLayout, savedState.mo2234a());
                this.f268d = savedState.f276a;
                this.f270f = savedState.f277b;
                this.f269e = savedState.f278c;
                return;
            }
            super.mo402a(coordinatorLayout, appBarLayout, parcelable);
            this.f268d = -1;
        }

        /* renamed from: a */
        public void mo403a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
            if (i == 0) {
                m339c(coordinatorLayout, appBarLayout);
            }
            this.f271g = new WeakReference<>(view);
        }

        /* renamed from: a */
        public void mo404a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int i3, int i4, int i5) {
            if (i4 < 0) {
                mo914b(coordinatorLayout, appBarLayout, i4, -appBarLayout.getDownNestedScrollRange(), 0);
            }
        }

        /* renamed from: a */
        public void mo405a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int[] iArr, int i3) {
            int i4;
            int i5;
            if (i2 != 0) {
                if (i2 < 0) {
                    int i6 = -appBarLayout.getTotalScrollRange();
                    i5 = i6;
                    i4 = appBarLayout.getDownNestedPreScrollRange() + i6;
                } else {
                    i5 = -appBarLayout.getUpNestedPreScrollRange();
                    i4 = 0;
                }
                if (i5 != i4) {
                    iArr[1] = mo914b(coordinatorLayout, appBarLayout, i2, i5, i4);
                }
            }
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ boolean mo406a(int i) {
            return super.mo406a(i);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo420c(AppBarLayout appBarLayout) {
            if (this.f272h != null) {
                return this.f272h.mo429a(appBarLayout);
            }
            boolean z = true;
            if (this.f271g != null) {
                View view = (View) this.f271g.get();
                if (view == null || !view.isShown() || view.canScrollVertically(-1)) {
                    z = false;
                }
            }
            return z;
        }

        /* renamed from: a */
        public boolean mo411a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            boolean a = super.mo411a(coordinatorLayout, appBarLayout, i);
            int pendingAction = appBarLayout.getPendingAction();
            if (this.f268d >= 0 && (pendingAction & 8) == 0) {
                View childAt = appBarLayout.getChildAt(this.f268d);
                mo913a_(coordinatorLayout, appBarLayout, (-childAt.getBottom()) + (this.f269e ? C0626s.m2867j(childAt) + appBarLayout.getTopInset() : Math.round(((float) childAt.getHeight()) * this.f270f)));
            } else if (pendingAction != 0) {
                boolean z = (pendingAction & 4) != 0;
                if ((pendingAction & 2) != 0) {
                    int i2 = -appBarLayout.getUpNestedPreScrollRange();
                    if (z) {
                        m333a(coordinatorLayout, appBarLayout, i2, 0.0f);
                    } else {
                        mo913a_(coordinatorLayout, appBarLayout, i2);
                    }
                } else if ((pendingAction & 1) != 0) {
                    if (z) {
                        m333a(coordinatorLayout, appBarLayout, 0, 0.0f);
                    } else {
                        mo913a_(coordinatorLayout, appBarLayout, 0);
                    }
                }
            }
            appBarLayout.mo374d();
            this.f268d = -1;
            mo406a(C0430a.m1985a(mo414b(), -appBarLayout.getTotalScrollRange(), 0));
            m335a(coordinatorLayout, appBarLayout, mo414b(), 0, true);
            appBarLayout.mo368a(mo414b());
            return a;
        }

        /* renamed from: a */
        public boolean mo412a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, int i3, int i4) {
            if (((C0134e) appBarLayout.getLayoutParams()).height != -2) {
                return super.mo412a(coordinatorLayout, appBarLayout, i, i2, i3, i4);
            }
            coordinatorLayout.mo482a((View) appBarLayout, i, i2, MeasureSpec.makeMeasureSpec(0, 0), i4);
            return true;
        }

        /* renamed from: a */
        public boolean mo413a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i, int i2) {
            boolean z = (i & 2) != 0 && appBarLayout.mo372c() && coordinatorLayout.getHeight() - view.getHeight() <= appBarLayout.getHeight();
            if (z && this.f267c != null) {
                this.f267c.cancel();
            }
            this.f271g = null;
            return z;
        }

        /* renamed from: b */
        public /* bridge */ /* synthetic */ int mo414b() {
            return super.mo414b();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public int mo416b(AppBarLayout appBarLayout) {
            return -appBarLayout.getDownNestedScrollRange();
        }

        /* renamed from: b */
        public Parcelable mo418b(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            Parcelable b = super.mo418b(coordinatorLayout, appBarLayout);
            int b2 = mo414b();
            int childCount = appBarLayout.getChildCount();
            boolean z = false;
            int i = 0;
            while (i < childCount) {
                View childAt = appBarLayout.getChildAt(i);
                int bottom = childAt.getBottom() + b2;
                if (childAt.getTop() + b2 > 0 || bottom < 0) {
                    i++;
                } else {
                    SavedState savedState = new SavedState(b);
                    savedState.f276a = i;
                    if (bottom == C0626s.m2867j(childAt) + appBarLayout.getTopInset()) {
                        z = true;
                    }
                    savedState.f278c = z;
                    savedState.f277b = ((float) bottom) / ((float) childAt.getHeight());
                    return savedState;
                }
            }
            return b;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public int mo395a(AppBarLayout appBarLayout) {
            return appBarLayout.getTotalScrollRange();
        }
    }

    public static class ScrollingViewBehavior extends C0199j {
        public ScrollingViewBehavior() {
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0098k.ScrollingViewBehavior_Layout);
            mo917b(obtainStyledAttributes.getDimensionPixelSize(C0098k.ScrollingViewBehavior_Layout_behavior_overlapTop, 0));
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        private static int m374a(AppBarLayout appBarLayout) {
            C0131b b = ((C0134e) appBarLayout.getLayoutParams()).mo568b();
            if (b instanceof Behavior) {
                return ((Behavior) b).mo392a();
            }
            return 0;
        }

        /* renamed from: e */
        private void m375e(CoordinatorLayout coordinatorLayout, View view, View view2) {
            C0131b b = ((C0134e) view2.getLayoutParams()).mo568b();
            if (b instanceof Behavior) {
                C0626s.m2860d(view, (((view2.getBottom() - view.getTop()) + ((Behavior) b).f266b) + mo916a()) - mo919c(view2));
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public float mo430a(View view) {
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int a = m374a(appBarLayout);
                if (downNestedPreScrollRange != 0 && totalScrollRange + a <= downNestedPreScrollRange) {
                    return 0.0f;
                }
                int i = totalScrollRange - downNestedPreScrollRange;
                if (i != 0) {
                    return (((float) a) / ((float) i)) + 1.0f;
                }
            }
            return 0.0f;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public AppBarLayout mo435b(List<View> list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = (View) list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ boolean mo406a(int i) {
            return super.mo406a(i);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ boolean mo411a(CoordinatorLayout coordinatorLayout, View view, int i) {
            return super.mo411a(coordinatorLayout, view, i);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ boolean mo412a(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
            return super.mo412a(coordinatorLayout, view, i, i2, i3, i4);
        }

        /* renamed from: a */
        public boolean mo432a(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout a = mo435b(coordinatorLayout.mo495c(view));
            if (a != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.f618a;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    a.mo369a(false, !z);
                    return true;
                }
            }
            return false;
        }

        /* renamed from: a */
        public boolean mo433a(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        /* renamed from: b */
        public /* bridge */ /* synthetic */ int mo414b() {
            return super.mo414b();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public int mo434b(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).getTotalScrollRange() : super.mo434b(view);
        }

        /* renamed from: b */
        public boolean mo436b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            m375e(coordinatorLayout, view, view2);
            return false;
        }
    }

    /* renamed from: android.support.design.widget.AppBarLayout$a */
    public static class C0121a extends LayoutParams {

        /* renamed from: a */
        int f279a = 1;

        /* renamed from: b */
        Interpolator f280b;

        public C0121a(int i, int i2) {
            super(i, i2);
        }

        public C0121a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0098k.AppBarLayout_Layout);
            this.f279a = obtainStyledAttributes.getInt(C0098k.AppBarLayout_Layout_layout_scrollFlags, 0);
            if (obtainStyledAttributes.hasValue(C0098k.AppBarLayout_Layout_layout_scrollInterpolator)) {
                this.f280b = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(C0098k.AppBarLayout_Layout_layout_scrollInterpolator, 0));
            }
            obtainStyledAttributes.recycle();
        }

        public C0121a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0121a(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C0121a(LayoutParams layoutParams) {
            super(layoutParams);
        }

        /* renamed from: a */
        public int mo437a() {
            return this.f279a;
        }

        /* renamed from: b */
        public Interpolator mo438b() {
            return this.f280b;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public boolean mo439c() {
            return (this.f279a & 1) == 1 && (this.f279a & 10) != 0;
        }
    }

    /* renamed from: android.support.design.widget.AppBarLayout$b */
    public interface C0122b {
        /* renamed from: a */
        void mo440a(AppBarLayout appBarLayout, int i);
    }

    /* renamed from: a */
    private void m318a(boolean z, boolean z2, boolean z3) {
        int i = 0;
        int i2 = (z ? 1 : 2) | (z2 ? 4 : 0);
        if (z3) {
            i = 8;
        }
        this.f260e = i2 | i;
        requestLayout();
    }

    /* renamed from: b */
    private boolean m319b(boolean z) {
        if (this.f263h == z) {
            return false;
        }
        this.f263h = z;
        refreshDrawableState();
        return true;
    }

    /* renamed from: e */
    private void m320e() {
        int childCount = getChildCount();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            } else if (((C0121a) getChildAt(i).getLayoutParams()).mo439c()) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        m319b(z);
    }

    /* renamed from: f */
    private void m321f() {
        this.f256a = -1;
        this.f257b = -1;
        this.f258c = -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0121a generateDefaultLayoutParams() {
        return new C0121a(-1, -2);
    }

    /* renamed from: a */
    public C0121a generateLayoutParams(AttributeSet attributeSet) {
        return new C0121a(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0121a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (VERSION.SDK_INT < 19 || !(layoutParams instanceof LayoutParams)) ? layoutParams instanceof MarginLayoutParams ? new C0121a((MarginLayoutParams) layoutParams) : new C0121a(layoutParams) : new C0121a((LayoutParams) layoutParams);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo368a(int i) {
        if (this.f262g != null) {
            int size = this.f262g.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0122b bVar = (C0122b) this.f262g.get(i2);
                if (bVar != null) {
                    bVar.mo440a(this, i);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo369a(boolean z, boolean z2) {
        m318a(z, z2, true);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo370a(boolean z) {
        if (this.f264i == z) {
            return false;
        }
        this.f264i = z;
        refreshDrawableState();
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo371b() {
        return this.f259d;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo372c() {
        return getTotalScrollRange() != 0;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0121a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo374d() {
        this.f260e = 0;
    }

    /* access modifiers changed from: 0000 */
    public int getDownNestedPreScrollRange() {
        if (this.f257b != -1) {
            return this.f257b;
        }
        int i = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            C0121a aVar = (C0121a) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i2 = aVar.f279a;
            if ((i2 & 5) == 5) {
                int i3 = i + aVar.topMargin + aVar.bottomMargin;
                if ((i2 & 8) != 0) {
                    i = i3 + C0626s.m2867j(childAt);
                } else {
                    i = i3 + (measuredHeight - ((i2 & 2) != 0 ? C0626s.m2867j(childAt) : getTopInset()));
                }
            } else if (i > 0) {
                break;
            }
        }
        int max = Math.max(0, i);
        this.f257b = max;
        return max;
    }

    /* access modifiers changed from: 0000 */
    public int getDownNestedScrollRange() {
        if (this.f258c != -1) {
            return this.f258c;
        }
        int childCount = getChildCount();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= childCount) {
                break;
            }
            View childAt = getChildAt(i);
            C0121a aVar = (C0121a) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + aVar.topMargin + aVar.bottomMargin;
            int i3 = aVar.f279a;
            if ((i3 & 1) == 0) {
                break;
            }
            i2 += measuredHeight;
            if ((i3 & 2) != 0) {
                i2 -= C0626s.m2867j(childAt) + getTopInset();
                break;
            }
            i++;
        }
        int max = Math.max(0, i2);
        this.f258c = max;
        return max;
    }

    /* access modifiers changed from: 0000 */
    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int j = C0626s.m2867j(this);
        if (j == 0) {
            int childCount = getChildCount();
            j = childCount >= 1 ? C0626s.m2867j(getChildAt(childCount - 1)) : 0;
            if (j == 0) {
                return getHeight() / 3;
            }
        }
        return (j * 2) + topInset;
    }

    /* access modifiers changed from: 0000 */
    public int getPendingAction() {
        return this.f260e;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    /* access modifiers changed from: 0000 */
    public final int getTopInset() {
        if (this.f261f != null) {
            return this.f261f.mo2415b();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        if (this.f256a != -1) {
            return this.f256a;
        }
        int childCount = getChildCount();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= childCount) {
                break;
            }
            View childAt = getChildAt(i);
            C0121a aVar = (C0121a) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i3 = aVar.f279a;
            if ((i3 & 1) == 0) {
                break;
            }
            i2 += measuredHeight + aVar.topMargin + aVar.bottomMargin;
            if ((i3 & 2) != 0) {
                i2 -= C0626s.m2867j(childAt);
                break;
            }
            i++;
        }
        int max = Math.max(0, i2 - getTopInset());
        this.f256a = max;
        return max;
    }

    /* access modifiers changed from: 0000 */
    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        if (this.f265j == null) {
            this.f265j = new int[2];
        }
        int[] iArr = this.f265j;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        iArr[0] = this.f263h ? C0089b.state_collapsible : -C0089b.state_collapsible;
        iArr[1] = (!this.f263h || !this.f264i) ? -C0089b.state_collapsed : C0089b.state_collapsed;
        return mergeDrawableStates(onCreateDrawableState, iArr);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m321f();
        int i5 = 0;
        this.f259d = false;
        int childCount = getChildCount();
        while (true) {
            if (i5 >= childCount) {
                break;
            } else if (((C0121a) getChildAt(i5).getLayoutParams()).mo438b() != null) {
                this.f259d = true;
                break;
            } else {
                i5++;
            }
        }
        m320e();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        m321f();
    }

    public void setExpanded(boolean z) {
        mo369a(z, C0626s.m2880w(this));
    }

    public void setOrientation(int i) {
        if (i == 1) {
            super.setOrientation(i);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    @Deprecated
    public void setTargetElevation(float f) {
        if (VERSION.SDK_INT >= 21) {
            C0215u.m842a(this, f);
        }
    }
}
