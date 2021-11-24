package android.support.p023v7.widget;

import android.content.Context;
import android.support.p009v4.view.C0626s;
import android.support.p009v4.view.C0647w;
import android.support.p023v7.p024a.C0726a.C0727a;
import android.support.p023v7.p024a.C0726a.C0732f;
import android.support.p023v7.p024a.C0726a.C0733g;
import android.support.p023v7.p024a.C0726a.C0736j;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;

/* renamed from: android.support.v7.widget.ActionBarContextView */
public class ActionBarContextView extends C0991a {

    /* renamed from: g */
    private CharSequence f2747g;

    /* renamed from: h */
    private CharSequence f2748h;

    /* renamed from: i */
    private View f2749i;

    /* renamed from: j */
    private View f2750j;

    /* renamed from: k */
    private LinearLayout f2751k;

    /* renamed from: l */
    private TextView f2752l;

    /* renamed from: m */
    private TextView f2753m;

    /* renamed from: n */
    private int f2754n;

    /* renamed from: o */
    private int f2755o;

    /* renamed from: p */
    private boolean f2756p;

    /* renamed from: q */
    private int f2757q;

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0727a.actionModeStyle);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C1078bk a = C1078bk.m5881a(context, attributeSet, C0736j.ActionMode, i, 0);
        C0626s.m2843a((View) this, a.mo5357a(C0736j.ActionMode_background));
        this.f2754n = a.mo5370g(C0736j.ActionMode_titleTextStyle, 0);
        this.f2755o = a.mo5370g(C0736j.ActionMode_subtitleTextStyle, 0);
        this.f3406e = a.mo5368f(C0736j.ActionMode_height, 0);
        this.f2757q = a.mo5370g(C0736j.ActionMode_closeItemLayout, C0733g.abc_action_mode_close_item_material);
        a.mo5358a();
    }

    /* renamed from: e */
    private void m4283e() {
        if (this.f2751k == null) {
            LayoutInflater.from(getContext()).inflate(C0733g.abc_action_bar_title_item, this);
            this.f2751k = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f2752l = (TextView) this.f2751k.findViewById(C0732f.action_bar_title);
            this.f2753m = (TextView) this.f2751k.findViewById(C0732f.action_bar_subtitle);
            if (this.f2754n != 0) {
                this.f2752l.setTextAppearance(getContext(), this.f2754n);
            }
            if (this.f2755o != 0) {
                this.f2753m.setTextAppearance(getContext(), this.f2755o);
            }
        }
        this.f2752l.setText(this.f2747g);
        this.f2753m.setText(this.f2748h);
        boolean z = !TextUtils.isEmpty(this.f2747g);
        boolean z2 = !TextUtils.isEmpty(this.f2748h);
        int i = 8;
        this.f2753m.setVisibility(z2 ? 0 : 8);
        LinearLayout linearLayout = this.f2751k;
        if (z || z2) {
            i = 0;
        }
        linearLayout.setVisibility(i);
        if (this.f2751k.getParent() == null) {
            addView(this.f2751k);
        }
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ C0647w mo3755a(int i, long j) {
        return super.mo3755a(i, j);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0021, code lost:
        if (r3.f2749i.getParent() == null) goto L_0x0015;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3756a(final android.support.p023v7.view.C0827b r4) {
        /*
            r3 = this;
            android.view.View r0 = r3.f2749i
            if (r0 != 0) goto L_0x001b
            android.content.Context r0 = r3.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = r3.f2757q
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r3, r2)
            r3.f2749i = r0
        L_0x0015:
            android.view.View r0 = r3.f2749i
            r3.addView(r0)
            goto L_0x0024
        L_0x001b:
            android.view.View r0 = r3.f2749i
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L_0x0024
            goto L_0x0015
        L_0x0024:
            android.view.View r0 = r3.f2749i
            int r1 = android.support.p023v7.p024a.C0726a.C0732f.action_mode_close_button
            android.view.View r0 = r0.findViewById(r1)
            android.support.v7.widget.ActionBarContextView$1 r1 = new android.support.v7.widget.ActionBarContextView$1
            r1.<init>(r4)
            r0.setOnClickListener(r1)
            android.view.Menu r4 = r4.mo3223b()
            android.support.v7.view.menu.h r4 = (android.support.p023v7.view.menu.C0855h) r4
            android.support.v7.widget.ActionMenuPresenter r0 = r3.f3405d
            if (r0 == 0) goto L_0x0043
            android.support.v7.widget.ActionMenuPresenter r0 = r3.f3405d
            r0.mo3835h()
        L_0x0043:
            android.support.v7.widget.ActionMenuPresenter r0 = new android.support.v7.widget.ActionMenuPresenter
            android.content.Context r1 = r3.getContext()
            r0.<init>(r1)
            r3.f3405d = r0
            android.support.v7.widget.ActionMenuPresenter r0 = r3.f3405d
            r1 = 1
            r0.mo3830c(r1)
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r1 = -2
            r2 = -1
            r0.<init>(r1, r2)
            android.support.v7.widget.ActionMenuPresenter r1 = r3.f3405d
            android.content.Context r2 = r3.f3403b
            r4.mo3487a(r1, r2)
            android.support.v7.widget.ActionMenuPresenter r4 = r3.f3405d
            android.support.v7.view.menu.p r4 = r4.mo3418a(r3)
            android.support.v7.widget.ActionMenuView r4 = (android.support.p023v7.widget.ActionMenuView) r4
            r3.f3404c = r4
            android.support.v7.widget.ActionMenuView r4 = r3.f3404c
            r1 = 0
            android.support.p009v4.view.C0626s.m2843a(r4, r1)
            android.support.v7.widget.ActionMenuView r4 = r3.f3404c
            r3.addView(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p023v7.widget.ActionBarContextView.mo3756a(android.support.v7.view.b):void");
    }

    /* renamed from: a */
    public boolean mo3757a() {
        if (this.f3405d != null) {
            return this.f3405d.mo3833f();
        }
        return false;
    }

    /* renamed from: b */
    public void mo3758b() {
        if (this.f2749i == null) {
            mo3759c();
        }
    }

    /* renamed from: c */
    public void mo3759c() {
        removeAllViews();
        this.f2750j = null;
        this.f3404c = null;
    }

    /* renamed from: d */
    public boolean mo3760d() {
        return this.f2756p;
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateDefaultLayoutParams() {
        return new MarginLayoutParams(-1, -2);
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new MarginLayoutParams(getContext(), attributeSet);
    }

    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f2748h;
    }

    public CharSequence getTitle() {
        return this.f2747g;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f3405d != null) {
            this.f3405d.mo3834g();
            this.f3405d.mo3836i();
        }
    }

    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            accessibilityEvent.setSource(this);
            accessibilityEvent.setClassName(getClass().getName());
            accessibilityEvent.setPackageName(getContext().getPackageName());
            accessibilityEvent.setContentDescription(this.f2747g);
            return;
        }
        super.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        boolean a = C1094bs.m6004a(this);
        int paddingRight = a ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        if (this.f2749i == null || this.f2749i.getVisibility() == 8) {
            i5 = paddingRight;
        } else {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f2749i.getLayoutParams();
            int i6 = a ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i7 = a ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int a2 = m5380a(paddingRight, i6, a);
            i5 = m5380a(a2 + mo4928a(this.f2749i, a2, paddingTop, paddingTop2, a), i7, a);
        }
        if (!(this.f2751k == null || this.f2750j != null || this.f2751k.getVisibility() == 8)) {
            i5 += mo4928a(this.f2751k, i5, paddingTop, paddingTop2, a);
        }
        int i8 = i5;
        if (this.f2750j != null) {
            mo4928a(this.f2750j, i8, paddingTop, paddingTop2, a);
        }
        int paddingLeft = a ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        if (this.f3404c != null) {
            mo4928a(this.f3404c, paddingLeft, paddingTop, paddingTop2, !a);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3 = 1073741824;
        if (MeasureSpec.getMode(i) != 1073741824) {
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getSimpleName());
            sb.append(" can only be used ");
            sb.append("with android:layout_width=\"match_parent\" (or fill_parent)");
            throw new IllegalStateException(sb.toString());
        } else if (MeasureSpec.getMode(i2) != 0) {
            int size = MeasureSpec.getSize(i);
            int size2 = this.f3406e > 0 ? this.f3406e : MeasureSpec.getSize(i2);
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i4 = size2 - paddingTop;
            int makeMeasureSpec = MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
            if (this.f2749i != null) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f2749i.getLayoutParams();
                paddingLeft = mo4927a(this.f2749i, paddingLeft, makeMeasureSpec, 0) - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            }
            if (this.f3404c != null && this.f3404c.getParent() == this) {
                paddingLeft = mo4927a(this.f3404c, paddingLeft, makeMeasureSpec, 0);
            }
            if (this.f2751k != null && this.f2750j == null) {
                if (this.f2756p) {
                    this.f2751k.measure(MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.f2751k.getMeasuredWidth();
                    boolean z = measuredWidth <= paddingLeft;
                    if (z) {
                        paddingLeft -= measuredWidth;
                    }
                    this.f2751k.setVisibility(z ? 0 : 8);
                } else {
                    paddingLeft = mo4927a(this.f2751k, paddingLeft, makeMeasureSpec, 0);
                }
            }
            if (this.f2750j != null) {
                LayoutParams layoutParams = this.f2750j.getLayoutParams();
                int i5 = layoutParams.width != -2 ? 1073741824 : Integer.MIN_VALUE;
                if (layoutParams.width >= 0) {
                    paddingLeft = Math.min(layoutParams.width, paddingLeft);
                }
                if (layoutParams.height == -2) {
                    i3 = Integer.MIN_VALUE;
                }
                if (layoutParams.height >= 0) {
                    i4 = Math.min(layoutParams.height, i4);
                }
                this.f2750j.measure(MeasureSpec.makeMeasureSpec(paddingLeft, i5), MeasureSpec.makeMeasureSpec(i4, i3));
            }
            if (this.f3406e <= 0) {
                int childCount = getChildCount();
                int i6 = 0;
                for (int i7 = 0; i7 < childCount; i7++) {
                    int measuredHeight = getChildAt(i7).getMeasuredHeight() + paddingTop;
                    if (measuredHeight > i6) {
                        i6 = measuredHeight;
                    }
                }
                setMeasuredDimension(size, i6);
                return;
            }
            setMeasuredDimension(size, size2);
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getClass().getSimpleName());
            sb2.append(" can only be used ");
            sb2.append("with android:layout_height=\"wrap_content\"");
            throw new IllegalStateException(sb2.toString());
        }
    }

    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public void setContentHeight(int i) {
        this.f3406e = i;
    }

    public void setCustomView(View view) {
        if (this.f2750j != null) {
            removeView(this.f2750j);
        }
        this.f2750j = view;
        if (!(view == null || this.f2751k == null)) {
            removeView(this.f2751k);
            this.f2751k = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f2748h = charSequence;
        m4283e();
    }

    public void setTitle(CharSequence charSequence) {
        this.f2747g = charSequence;
        m4283e();
    }

    public void setTitleOptional(boolean z) {
        if (z != this.f2756p) {
            requestLayout();
        }
        this.f2756p = z;
    }

    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
