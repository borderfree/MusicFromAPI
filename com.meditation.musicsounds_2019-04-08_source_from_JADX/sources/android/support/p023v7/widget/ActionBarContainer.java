package android.support.p023v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.p009v4.view.C0626s;
import android.support.p023v7.p024a.C0726a.C0732f;
import android.support.p023v7.p024a.C0726a.C0736j;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;

/* renamed from: android.support.v7.widget.ActionBarContainer */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: a */
    Drawable f2737a;

    /* renamed from: b */
    Drawable f2738b;

    /* renamed from: c */
    Drawable f2739c;

    /* renamed from: d */
    boolean f2740d;

    /* renamed from: e */
    boolean f2741e;

    /* renamed from: f */
    private boolean f2742f;

    /* renamed from: g */
    private View f2743g;

    /* renamed from: h */
    private View f2744h;

    /* renamed from: i */
    private View f2745i;

    /* renamed from: j */
    private int f2746j;

    public ActionBarContainer(Context context) {
        this(context, null);
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0626s.m2843a((View) this, VERSION.SDK_INT >= 21 ? new C1096c(this) : new C1059b(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0736j.ActionBar);
        this.f2737a = obtainStyledAttributes.getDrawable(C0736j.ActionBar_background);
        this.f2738b = obtainStyledAttributes.getDrawable(C0736j.ActionBar_backgroundStacked);
        this.f2746j = obtainStyledAttributes.getDimensionPixelSize(C0736j.ActionBar_height, -1);
        if (getId() == C0732f.split_action_bar) {
            this.f2740d = true;
            this.f2739c = obtainStyledAttributes.getDrawable(C0736j.ActionBar_backgroundSplit);
        }
        obtainStyledAttributes.recycle();
        boolean z = false;
        if (!this.f2740d ? this.f2737a == null && this.f2738b == null : this.f2739c == null) {
            z = true;
        }
        setWillNotDraw(z);
    }

    /* renamed from: a */
    private boolean m4281a(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    /* renamed from: b */
    private int m4282b(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f2737a != null && this.f2737a.isStateful()) {
            this.f2737a.setState(getDrawableState());
        }
        if (this.f2738b != null && this.f2738b.isStateful()) {
            this.f2738b.setState(getDrawableState());
        }
        if (this.f2739c != null && this.f2739c.isStateful()) {
            this.f2739c.setState(getDrawableState());
        }
    }

    public View getTabContainer() {
        return this.f2743g;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        if (this.f2737a != null) {
            this.f2737a.jumpToCurrentState();
        }
        if (this.f2738b != null) {
            this.f2738b.jumpToCurrentState();
        }
        if (this.f2739c != null) {
            this.f2739c.jumpToCurrentState();
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f2744h = findViewById(C0732f.action_bar);
        this.f2745i = findViewById(C0732f.action_context_bar);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f2742f || super.onInterceptTouchEvent(motionEvent);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Drawable drawable;
        int left;
        int top;
        int right;
        View view;
        super.onLayout(z, i, i2, i3, i4);
        View view2 = this.f2743g;
        boolean z2 = true;
        boolean z3 = false;
        boolean z4 = (view2 == null || view2.getVisibility() == 8) ? false : true;
        if (!(view2 == null || view2.getVisibility() == 8)) {
            int measuredHeight = getMeasuredHeight();
            LayoutParams layoutParams = (LayoutParams) view2.getLayoutParams();
            view2.layout(i, (measuredHeight - view2.getMeasuredHeight()) - layoutParams.bottomMargin, i3, measuredHeight - layoutParams.bottomMargin);
        }
        if (!this.f2740d) {
            if (this.f2737a != null) {
                if (this.f2744h.getVisibility() == 0) {
                    drawable = this.f2737a;
                    left = this.f2744h.getLeft();
                    top = this.f2744h.getTop();
                    right = this.f2744h.getRight();
                    view = this.f2744h;
                } else if (this.f2745i == null || this.f2745i.getVisibility() != 0) {
                    this.f2737a.setBounds(0, 0, 0, 0);
                    z3 = true;
                } else {
                    drawable = this.f2737a;
                    left = this.f2745i.getLeft();
                    top = this.f2745i.getTop();
                    right = this.f2745i.getRight();
                    view = this.f2745i;
                }
                drawable.setBounds(left, top, right, view.getBottom());
                z3 = true;
            }
            this.f2741e = z4;
            if (!z4 || this.f2738b == null) {
                z2 = z3;
            } else {
                this.f2738b.setBounds(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            }
        } else if (this.f2739c != null) {
            this.f2739c.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
        } else {
            z2 = false;
        }
        if (z2) {
            invalidate();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            android.view.View r0 = r3.f2744h
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != 0) goto L_0x001e
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            if (r0 != r1) goto L_0x001e
            int r0 = r3.f2746j
            if (r0 < 0) goto L_0x001e
            int r0 = r3.f2746j
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            int r5 = java.lang.Math.min(r0, r5)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r1)
        L_0x001e:
            super.onMeasure(r4, r5)
            android.view.View r4 = r3.f2744h
            if (r4 != 0) goto L_0x0026
            return
        L_0x0026:
            int r4 = android.view.View.MeasureSpec.getMode(r5)
            android.view.View r0 = r3.f2743g
            if (r0 == 0) goto L_0x0073
            android.view.View r0 = r3.f2743g
            int r0 = r0.getVisibility()
            r2 = 8
            if (r0 == r2) goto L_0x0073
            r0 = 1073741824(0x40000000, float:2.0)
            if (r4 == r0) goto L_0x0073
            android.view.View r0 = r3.f2744h
            boolean r0 = r3.m4281a(r0)
            if (r0 != 0) goto L_0x004b
            android.view.View r0 = r3.f2744h
        L_0x0046:
            int r0 = r3.m4282b(r0)
            goto L_0x0057
        L_0x004b:
            android.view.View r0 = r3.f2745i
            boolean r0 = r3.m4281a(r0)
            if (r0 != 0) goto L_0x0056
            android.view.View r0 = r3.f2745i
            goto L_0x0046
        L_0x0056:
            r0 = 0
        L_0x0057:
            if (r4 != r1) goto L_0x005e
            int r4 = android.view.View.MeasureSpec.getSize(r5)
            goto L_0x0061
        L_0x005e:
            r4 = 2147483647(0x7fffffff, float:NaN)
        L_0x0061:
            int r5 = r3.getMeasuredWidth()
            android.view.View r1 = r3.f2743g
            int r1 = r3.m4282b(r1)
            int r0 = r0 + r1
            int r4 = java.lang.Math.min(r0, r4)
            r3.setMeasuredDimension(r5, r4)
        L_0x0073:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p023v7.widget.ActionBarContainer.onMeasure(int, int):void");
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        if (this.f2737a != null) {
            this.f2737a.setCallback(null);
            unscheduleDrawable(this.f2737a);
        }
        this.f2737a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f2744h != null) {
                this.f2737a.setBounds(this.f2744h.getLeft(), this.f2744h.getTop(), this.f2744h.getRight(), this.f2744h.getBottom());
            }
        }
        boolean z = false;
        if (!this.f2740d ? this.f2737a == null && this.f2738b == null : this.f2739c == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setSplitBackground(Drawable drawable) {
        if (this.f2739c != null) {
            this.f2739c.setCallback(null);
            unscheduleDrawable(this.f2739c);
        }
        this.f2739c = drawable;
        boolean z = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f2740d && this.f2739c != null) {
                this.f2739c.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f2740d ? this.f2737a == null && this.f2738b == null : this.f2739c == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setStackedBackground(Drawable drawable) {
        if (this.f2738b != null) {
            this.f2738b.setCallback(null);
            unscheduleDrawable(this.f2738b);
        }
        this.f2738b = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f2741e && this.f2738b != null) {
                this.f2738b.setBounds(this.f2743g.getLeft(), this.f2743g.getTop(), this.f2743g.getRight(), this.f2743g.getBottom());
            }
        }
        boolean z = false;
        if (!this.f2740d ? this.f2737a == null && this.f2738b == null : this.f2739c == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setTabContainer(C1061bb bbVar) {
        if (this.f2743g != null) {
            removeView(this.f2743g);
        }
        this.f2743g = bbVar;
        if (bbVar != null) {
            addView(bbVar);
            ViewGroup.LayoutParams layoutParams = bbVar.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            bbVar.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z) {
        this.f2742f = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        if (this.f2737a != null) {
            this.f2737a.setVisible(z, false);
        }
        if (this.f2738b != null) {
            this.f2738b.setVisible(z, false);
        }
        if (this.f2739c != null) {
            this.f2739c.setVisible(z, false);
        }
    }

    public ActionMode startActionModeForChild(View view, Callback callback) {
        return null;
    }

    public ActionMode startActionModeForChild(View view, Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f2737a && !this.f2740d) || (drawable == this.f2738b && this.f2741e) || ((drawable == this.f2739c && this.f2740d) || super.verifyDrawable(drawable));
    }
}
