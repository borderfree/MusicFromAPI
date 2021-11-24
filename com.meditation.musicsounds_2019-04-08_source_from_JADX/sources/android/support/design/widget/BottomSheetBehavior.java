package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.support.design.C0087a.C0098k;
import android.support.design.widget.CoordinatorLayout.C0131b;
import android.support.p009v4.p014c.C0430a;
import android.support.p009v4.view.AbsSavedState;
import android.support.p009v4.view.C0626s;
import android.support.p009v4.widget.C0721s;
import android.support.p009v4.widget.C0721s.C0724a;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

public class BottomSheetBehavior<V extends View> extends C0131b<V> {

    /* renamed from: a */
    int f281a;

    /* renamed from: b */
    int f282b;

    /* renamed from: c */
    boolean f283c;

    /* renamed from: d */
    int f284d = 4;

    /* renamed from: e */
    C0721s f285e;

    /* renamed from: f */
    int f286f;

    /* renamed from: g */
    WeakReference<V> f287g;

    /* renamed from: h */
    WeakReference<View> f288h;

    /* renamed from: i */
    int f289i;

    /* renamed from: j */
    boolean f290j;

    /* renamed from: k */
    private float f291k;

    /* renamed from: l */
    private int f292l;

    /* renamed from: m */
    private boolean f293m;

    /* renamed from: n */
    private int f294n;

    /* renamed from: o */
    private boolean f295o;

    /* renamed from: p */
    private boolean f296p;

    /* renamed from: q */
    private int f297q;

    /* renamed from: r */
    private boolean f298r;

    /* renamed from: s */
    private C0125a f299s;

    /* renamed from: t */
    private VelocityTracker f300t;

    /* renamed from: u */
    private int f301u;

    /* renamed from: v */
    private final C0724a f302v = new C0724a() {
        /* renamed from: a */
        public int mo454a(View view) {
            return (BottomSheetBehavior.this.f283c ? BottomSheetBehavior.this.f286f : BottomSheetBehavior.this.f282b) - BottomSheetBehavior.this.f281a;
        }

        /* renamed from: a */
        public int mo455a(View view, int i, int i2) {
            return C0430a.m1985a(i, BottomSheetBehavior.this.f281a, BottomSheetBehavior.this.f283c ? BottomSheetBehavior.this.f286f : BottomSheetBehavior.this.f282b);
        }

        /* renamed from: a */
        public void mo456a(int i) {
            if (i == 1) {
                BottomSheetBehavior.this.mo449b(1);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x003c, code lost:
            if (java.lang.Math.abs(r6 - r3.f303a.f281a) < java.lang.Math.abs(r6 - r3.f303a.f282b)) goto L_0x0007;
         */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0053  */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x0064  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo457a(android.view.View r4, float r5, float r6) {
            /*
                r3 = this;
                r5 = 4
                r0 = 3
                r1 = 0
                int r2 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
                if (r2 >= 0) goto L_0x000c
            L_0x0007:
                android.support.design.widget.BottomSheetBehavior r5 = android.support.design.widget.BottomSheetBehavior.this
                int r5 = r5.f281a
                goto L_0x0045
            L_0x000c:
                android.support.design.widget.BottomSheetBehavior r2 = android.support.design.widget.BottomSheetBehavior.this
                boolean r2 = r2.f283c
                if (r2 == 0) goto L_0x0021
                android.support.design.widget.BottomSheetBehavior r2 = android.support.design.widget.BottomSheetBehavior.this
                boolean r2 = r2.mo448a(r4, r6)
                if (r2 == 0) goto L_0x0021
                android.support.design.widget.BottomSheetBehavior r5 = android.support.design.widget.BottomSheetBehavior.this
                int r5 = r5.f286f
                r6 = 5
                r0 = 5
                goto L_0x0045
            L_0x0021:
                int r6 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
                if (r6 != 0) goto L_0x003f
                int r6 = r4.getTop()
                android.support.design.widget.BottomSheetBehavior r1 = android.support.design.widget.BottomSheetBehavior.this
                int r1 = r1.f281a
                int r1 = r6 - r1
                int r1 = java.lang.Math.abs(r1)
                android.support.design.widget.BottomSheetBehavior r2 = android.support.design.widget.BottomSheetBehavior.this
                int r2 = r2.f282b
                int r6 = r6 - r2
                int r6 = java.lang.Math.abs(r6)
                if (r1 >= r6) goto L_0x003f
                goto L_0x0007
            L_0x003f:
                android.support.design.widget.BottomSheetBehavior r6 = android.support.design.widget.BottomSheetBehavior.this
                int r6 = r6.f282b
                r5 = r6
                r0 = 4
            L_0x0045:
                android.support.design.widget.BottomSheetBehavior r6 = android.support.design.widget.BottomSheetBehavior.this
                android.support.v4.widget.s r6 = r6.f285e
                int r1 = r4.getLeft()
                boolean r5 = r6.mo2917a(r1, r5)
                if (r5 == 0) goto L_0x0064
                android.support.design.widget.BottomSheetBehavior r5 = android.support.design.widget.BottomSheetBehavior.this
                r6 = 2
                r5.mo449b(r6)
                android.support.design.widget.BottomSheetBehavior$b r5 = new android.support.design.widget.BottomSheetBehavior$b
                android.support.design.widget.BottomSheetBehavior r6 = android.support.design.widget.BottomSheetBehavior.this
                r5.<init>(r4, r0)
                android.support.p009v4.view.C0626s.m2847a(r4, r5)
                goto L_0x0069
            L_0x0064:
                android.support.design.widget.BottomSheetBehavior r4 = android.support.design.widget.BottomSheetBehavior.this
                r4.mo449b(r0)
            L_0x0069:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.BottomSheetBehavior.C01231.mo457a(android.view.View, float, float):void");
        }

        /* renamed from: a */
        public void mo458a(View view, int i, int i2, int i3, int i4) {
            BottomSheetBehavior.this.mo452c(i2);
        }

        /* renamed from: a */
        public boolean mo459a(View view, int i) {
            boolean z = true;
            if (BottomSheetBehavior.this.f284d == 1 || BottomSheetBehavior.this.f290j) {
                return false;
            }
            if (BottomSheetBehavior.this.f284d == 3 && BottomSheetBehavior.this.f289i == i) {
                View view2 = (View) BottomSheetBehavior.this.f288h.get();
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            if (BottomSheetBehavior.this.f287g == null || BottomSheetBehavior.this.f287g.get() != view) {
                z = false;
            }
            return z;
        }

        /* renamed from: b */
        public int mo460b(View view, int i, int i2) {
            return view.getLeft();
        }
    };

    protected static class SavedState extends AbsSavedState {
        public static final Creator<SavedState> CREATOR = new ClassLoaderCreator<SavedState>() {
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
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
        final int f304a;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f304a = parcel.readInt();
        }

        public SavedState(Parcelable parcelable, int i) {
            super(parcelable);
            this.f304a = i;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f304a);
        }
    }

    /* renamed from: android.support.design.widget.BottomSheetBehavior$a */
    public static abstract class C0125a {
        /* renamed from: a */
        public abstract void mo467a(View view, float f);

        /* renamed from: a */
        public abstract void mo468a(View view, int i);
    }

    /* renamed from: android.support.design.widget.BottomSheetBehavior$b */
    private class C0126b implements Runnable {

        /* renamed from: b */
        private final View f306b;

        /* renamed from: c */
        private final int f307c;

        C0126b(View view, int i) {
            this.f306b = view;
            this.f307c = i;
        }

        public void run() {
            if (BottomSheetBehavior.this.f285e == null || !BottomSheetBehavior.this.f285e.mo2920a(true)) {
                BottomSheetBehavior.this.mo449b(this.f307c);
            } else {
                C0626s.m2847a(this.f306b, (Runnable) this);
            }
        }
    }

    public BottomSheetBehavior() {
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0098k.BottomSheetBehavior_Layout);
        TypedValue peekValue = obtainStyledAttributes.peekValue(C0098k.BottomSheetBehavior_Layout_behavior_peekHeight);
        mo442a((peekValue == null || peekValue.data != -1) ? obtainStyledAttributes.getDimensionPixelSize(C0098k.BottomSheetBehavior_Layout_behavior_peekHeight, -1) : peekValue.data);
        mo444a(obtainStyledAttributes.getBoolean(C0098k.BottomSheetBehavior_Layout_behavior_hideable, false));
        mo450b(obtainStyledAttributes.getBoolean(C0098k.BottomSheetBehavior_Layout_behavior_skipCollapsed, false));
        obtainStyledAttributes.recycle();
        this.f291k = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    /* renamed from: a */
    private void m391a() {
        this.f289i = -1;
        if (this.f300t != null) {
            this.f300t.recycle();
            this.f300t = null;
        }
    }

    /* renamed from: b */
    private float m392b() {
        this.f300t.computeCurrentVelocity(1000, this.f291k);
        return this.f300t.getYVelocity(this.f289i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public View mo441a(View view) {
        if (C0626s.m2878u(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View a = mo441a(viewGroup.getChildAt(i));
                if (a != null) {
                    return a;
                }
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo442a(int r4) {
        /*
            r3 = this;
            r0 = 1
            r1 = 0
            r2 = -1
            if (r4 != r2) goto L_0x000c
            boolean r4 = r3.f293m
            if (r4 != 0) goto L_0x0015
            r3.f293m = r0
            goto L_0x0024
        L_0x000c:
            boolean r2 = r3.f293m
            if (r2 != 0) goto L_0x0017
            int r2 = r3.f292l
            if (r2 == r4) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            r0 = 0
            goto L_0x0024
        L_0x0017:
            r3.f293m = r1
            int r1 = java.lang.Math.max(r1, r4)
            r3.f292l = r1
            int r1 = r3.f286f
            int r1 = r1 - r4
            r3.f282b = r1
        L_0x0024:
            if (r0 == 0) goto L_0x003c
            int r4 = r3.f284d
            r0 = 4
            if (r4 != r0) goto L_0x003c
            java.lang.ref.WeakReference<V> r4 = r3.f287g
            if (r4 == 0) goto L_0x003c
            java.lang.ref.WeakReference<V> r4 = r3.f287g
            java.lang.Object r4 = r4.get()
            android.view.View r4 = (android.view.View) r4
            if (r4 == 0) goto L_0x003c
            r4.requestLayout()
        L_0x003c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.BottomSheetBehavior.mo442a(int):void");
    }

    /* renamed from: a */
    public void mo402a(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.mo402a(coordinatorLayout, v, savedState.mo2234a());
        this.f284d = (savedState.f304a == 1 || savedState.f304a == 2) ? 4 : savedState.f304a;
    }

    /* renamed from: a */
    public void mo443a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr) {
        int i3;
        if (view == ((View) this.f288h.get())) {
            int top = v.getTop();
            int i4 = top - i2;
            if (i2 <= 0) {
                if (i2 < 0 && !view.canScrollVertically(-1)) {
                    if (i4 <= this.f282b || this.f283c) {
                        iArr[1] = i2;
                        C0626s.m2860d(v, -i2);
                        mo449b(1);
                    } else {
                        iArr[1] = top - this.f282b;
                        C0626s.m2860d(v, -iArr[1]);
                        i3 = 4;
                    }
                }
                mo452c(v.getTop());
                this.f297q = i2;
                this.f298r = true;
            } else if (i4 < this.f281a) {
                iArr[1] = top - this.f281a;
                C0626s.m2860d(v, -iArr[1]);
                i3 = 3;
            } else {
                iArr[1] = i2;
                C0626s.m2860d(v, -i2);
                mo449b(1);
                mo452c(v.getTop());
                this.f297q = i2;
                this.f298r = true;
            }
            mo449b(i3);
            mo452c(v.getTop());
            this.f297q = i2;
            this.f298r = true;
        }
    }

    /* renamed from: a */
    public void mo444a(boolean z) {
        this.f283c = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0092  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo411a(android.support.design.widget.CoordinatorLayout r6, V r7, int r8) {
        /*
            r5 = this;
            boolean r0 = android.support.p009v4.view.C0626s.m2873p(r6)
            r1 = 1
            if (r0 == 0) goto L_0x0010
            boolean r0 = android.support.p009v4.view.C0626s.m2873p(r7)
            if (r0 != 0) goto L_0x0010
            android.support.p009v4.view.C0626s.m2855b(r7, r1)
        L_0x0010:
            int r0 = r7.getTop()
            r6.mo481a(r7, r8)
            int r8 = r6.getHeight()
            r5.f286f = r8
            boolean r8 = r5.f293m
            if (r8 == 0) goto L_0x0043
            int r8 = r5.f294n
            if (r8 != 0) goto L_0x0031
            android.content.res.Resources r8 = r6.getResources()
            int r2 = android.support.design.C0087a.C0091d.design_bottom_sheet_peek_height_min
            int r8 = r8.getDimensionPixelSize(r2)
            r5.f294n = r8
        L_0x0031:
            int r8 = r5.f294n
            int r2 = r5.f286f
            int r3 = r6.getWidth()
            int r3 = r3 * 9
            int r3 = r3 / 16
            int r2 = r2 - r3
            int r8 = java.lang.Math.max(r8, r2)
            goto L_0x0045
        L_0x0043:
            int r8 = r5.f292l
        L_0x0045:
            r2 = 0
            int r3 = r5.f286f
            int r4 = r7.getHeight()
            int r3 = r3 - r4
            int r2 = java.lang.Math.max(r2, r3)
            r5.f281a = r2
            int r2 = r5.f286f
            int r2 = r2 - r8
            int r8 = r5.f281a
            int r8 = java.lang.Math.max(r2, r8)
            r5.f282b = r8
            int r8 = r5.f284d
            r2 = 3
            if (r8 != r2) goto L_0x0069
            int r8 = r5.f281a
        L_0x0065:
            android.support.p009v4.view.C0626s.m2860d(r7, r8)
            goto L_0x008e
        L_0x0069:
            boolean r8 = r5.f283c
            if (r8 == 0) goto L_0x0075
            int r8 = r5.f284d
            r2 = 5
            if (r8 != r2) goto L_0x0075
            int r8 = r5.f286f
            goto L_0x0065
        L_0x0075:
            int r8 = r5.f284d
            r2 = 4
            if (r8 != r2) goto L_0x007d
            int r8 = r5.f282b
            goto L_0x0065
        L_0x007d:
            int r8 = r5.f284d
            if (r8 == r1) goto L_0x0086
            int r8 = r5.f284d
            r2 = 2
            if (r8 != r2) goto L_0x008e
        L_0x0086:
            int r8 = r7.getTop()
            int r0 = r0 - r8
            android.support.p009v4.view.C0626s.m2860d(r7, r0)
        L_0x008e:
            android.support.v4.widget.s r8 = r5.f285e
            if (r8 != 0) goto L_0x009a
            android.support.v4.widget.s$a r8 = r5.f302v
            android.support.v4.widget.s r6 = android.support.p009v4.widget.C0721s.m3351a(r6, r8)
            r5.f285e = r6
        L_0x009a:
            java.lang.ref.WeakReference r6 = new java.lang.ref.WeakReference
            r6.<init>(r7)
            r5.f287g = r6
            java.lang.ref.WeakReference r6 = new java.lang.ref.WeakReference
            android.view.View r7 = r5.mo441a(r7)
            r6.<init>(r7)
            r5.f288h = r6
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.BottomSheetBehavior.mo411a(android.support.design.widget.CoordinatorLayout, android.view.View, int):boolean");
    }

    /* renamed from: a */
    public boolean mo445a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z = false;
        if (!v.isShown()) {
            this.f296p = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m391a();
        }
        if (this.f300t == null) {
            this.f300t = VelocityTracker.obtain();
        }
        this.f300t.addMovement(motionEvent);
        if (actionMasked != 3) {
            switch (actionMasked) {
                case 0:
                    int x = (int) motionEvent.getX();
                    this.f301u = (int) motionEvent.getY();
                    View view = this.f288h != null ? (View) this.f288h.get() : null;
                    if (view != null && coordinatorLayout.mo488a(view, x, this.f301u)) {
                        this.f289i = motionEvent.getPointerId(motionEvent.getActionIndex());
                        this.f290j = true;
                    }
                    this.f296p = this.f289i == -1 && !coordinatorLayout.mo488a((View) v, x, this.f301u);
                    break;
                case 1:
                    break;
            }
        }
        this.f290j = false;
        this.f289i = -1;
        if (this.f296p) {
            this.f296p = false;
            return false;
        }
        if (!this.f296p && this.f285e.mo2918a(motionEvent)) {
            return true;
        }
        View view2 = (View) this.f288h.get();
        if (actionMasked == 2 && view2 != null && !this.f296p && this.f284d != 1 && !coordinatorLayout.mo488a(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) && Math.abs(((float) this.f301u) - motionEvent.getY()) > ((float) this.f285e.mo2930d())) {
            z = true;
        }
        return z;
    }

    /* renamed from: a */
    public boolean mo446a(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
        return view == this.f288h.get() && (this.f284d != 3 || super.mo446a(coordinatorLayout, v, view, f, f2));
    }

    /* renamed from: a */
    public boolean mo447a(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
        this.f297q = 0;
        this.f298r = false;
        return (i & 2) != 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo448a(View view, float f) {
        boolean z = true;
        if (this.f295o) {
            return true;
        }
        if (view.getTop() < this.f282b) {
            return false;
        }
        if (Math.abs((((float) view.getTop()) + (f * 0.1f)) - ((float) this.f282b)) / ((float) this.f292l) <= 0.5f) {
            z = false;
        }
        return z;
    }

    /* renamed from: b */
    public Parcelable mo418b(CoordinatorLayout coordinatorLayout, V v) {
        return new SavedState(super.mo418b(coordinatorLayout, v), this.f284d);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo449b(int i) {
        if (this.f284d != i) {
            this.f284d = i;
            View view = (View) this.f287g.get();
            if (!(view == null || this.f299s == null)) {
                this.f299s.mo468a(view, i);
            }
        }
    }

    /* renamed from: b */
    public void mo450b(boolean z) {
        this.f295o = z;
    }

    /* renamed from: b */
    public boolean mo451b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f284d == 1 && actionMasked == 0) {
            return true;
        }
        if (this.f285e != null) {
            this.f285e.mo2922b(motionEvent);
        }
        if (actionMasked == 0) {
            m391a();
        }
        if (this.f300t == null) {
            this.f300t = VelocityTracker.obtain();
        }
        this.f300t.addMovement(motionEvent);
        if (actionMasked == 2 && !this.f296p && Math.abs(((float) this.f301u) - motionEvent.getY()) > ((float) this.f285e.mo2930d())) {
            this.f285e.mo2916a((View) v, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f296p;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo452c(int i) {
        C0125a aVar;
        float f;
        int i2;
        int i3;
        View view = (View) this.f287g.get();
        if (view != null && this.f299s != null) {
            if (i > this.f282b) {
                aVar = this.f299s;
                f = (float) (this.f282b - i);
                i2 = this.f286f;
                i3 = this.f282b;
            } else {
                aVar = this.f299s;
                f = (float) (this.f282b - i);
                i2 = this.f282b;
                i3 = this.f281a;
            }
            aVar.mo467a(view, f / ((float) (i2 - i3)));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004f, code lost:
        if (java.lang.Math.abs(r4 - r3.f281a) < java.lang.Math.abs(r4 - r3.f282b)) goto L_0x0023;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006e  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo453c(android.support.design.widget.CoordinatorLayout r4, V r5, android.view.View r6) {
        /*
            r3 = this;
            int r4 = r5.getTop()
            int r0 = r3.f281a
            r1 = 3
            if (r4 != r0) goto L_0x000d
            r3.mo449b(r1)
            return
        L_0x000d:
            java.lang.ref.WeakReference<android.view.View> r4 = r3.f288h
            if (r4 == 0) goto L_0x0074
            java.lang.ref.WeakReference<android.view.View> r4 = r3.f288h
            java.lang.Object r4 = r4.get()
            if (r6 != r4) goto L_0x0074
            boolean r4 = r3.f298r
            if (r4 != 0) goto L_0x001e
            goto L_0x0074
        L_0x001e:
            int r4 = r3.f297q
            r6 = 4
            if (r4 <= 0) goto L_0x0026
        L_0x0023:
            int r4 = r3.f281a
            goto L_0x0055
        L_0x0026:
            boolean r4 = r3.f283c
            if (r4 == 0) goto L_0x0038
            float r4 = r3.m392b()
            boolean r4 = r3.mo448a(r5, r4)
            if (r4 == 0) goto L_0x0038
            int r4 = r3.f286f
            r1 = 5
            goto L_0x0055
        L_0x0038:
            int r4 = r3.f297q
            if (r4 != 0) goto L_0x0052
            int r4 = r5.getTop()
            int r0 = r3.f281a
            int r0 = r4 - r0
            int r0 = java.lang.Math.abs(r0)
            int r2 = r3.f282b
            int r4 = r4 - r2
            int r4 = java.lang.Math.abs(r4)
            if (r0 >= r4) goto L_0x0052
            goto L_0x0023
        L_0x0052:
            int r4 = r3.f282b
            r1 = 4
        L_0x0055:
            android.support.v4.widget.s r6 = r3.f285e
            int r0 = r5.getLeft()
            boolean r4 = r6.mo2919a(r5, r0, r4)
            if (r4 == 0) goto L_0x006e
            r4 = 2
            r3.mo449b(r4)
            android.support.design.widget.BottomSheetBehavior$b r4 = new android.support.design.widget.BottomSheetBehavior$b
            r4.<init>(r5, r1)
            android.support.p009v4.view.C0626s.m2847a(r5, r4)
            goto L_0x0071
        L_0x006e:
            r3.mo449b(r1)
        L_0x0071:
            r4 = 0
            r3.f298r = r4
        L_0x0074:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.BottomSheetBehavior.mo453c(android.support.design.widget.CoordinatorLayout, android.view.View, android.view.View):void");
    }
}
