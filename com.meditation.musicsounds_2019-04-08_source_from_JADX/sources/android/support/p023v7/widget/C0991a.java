package android.support.p023v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.support.p009v4.view.C0626s;
import android.support.p009v4.view.C0647w;
import android.support.p009v4.view.C0651x;
import android.support.p023v7.p024a.C0726a.C0727a;
import android.support.p023v7.p024a.C0726a.C0736j;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;

/* renamed from: android.support.v7.widget.a */
abstract class C0991a extends ViewGroup {

    /* renamed from: a */
    protected final C0992a f3402a;

    /* renamed from: b */
    protected final Context f3403b;

    /* renamed from: c */
    protected ActionMenuView f3404c;

    /* renamed from: d */
    protected ActionMenuPresenter f3405d;

    /* renamed from: e */
    protected int f3406e;

    /* renamed from: f */
    protected C0647w f3407f;

    /* renamed from: g */
    private boolean f3408g;

    /* renamed from: h */
    private boolean f3409h;

    /* renamed from: android.support.v7.widget.a$a */
    protected class C0992a implements C0651x {

        /* renamed from: a */
        int f3410a;

        /* renamed from: c */
        private boolean f3412c = false;

        protected C0992a() {
        }

        /* renamed from: a */
        public C0992a mo4930a(C0647w wVar, int i) {
            C0991a.this.f3407f = wVar;
            this.f3410a = i;
            return this;
        }

        /* renamed from: a */
        public void mo2566a(View view) {
            C0991a.super.setVisibility(0);
            this.f3412c = false;
        }

        /* renamed from: b */
        public void mo2567b(View view) {
            if (!this.f3412c) {
                C0991a.this.f3407f = null;
                C0991a.super.setVisibility(this.f3410a);
            }
        }

        /* renamed from: c */
        public void mo2568c(View view) {
            this.f3412c = true;
        }
    }

    C0991a(Context context) {
        this(context, null);
    }

    C0991a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    C0991a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3402a = new C0992a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(C0727a.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f3403b = context;
        } else {
            this.f3403b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    /* renamed from: a */
    protected static int m5380a(int i, int i2, boolean z) {
        return z ? i - i2 : i + i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo4927a(View view, int i, int i2, int i3) {
        view.measure(MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, (i - view.getMeasuredWidth()) - i3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo4928a(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i2 + ((i3 - measuredHeight) / 2);
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    /* renamed from: a */
    public C0647w mo3755a(int i, long j) {
        C0647w a;
        if (this.f3407f != null) {
            this.f3407f.mo2560b();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            a = C0626s.m2868k(this).mo2553a(1.0f);
        } else {
            a = C0626s.m2868k(this).mo2553a(0.0f);
        }
        a.mo2554a(j);
        a.mo2555a((C0651x) this.f3402a.mo4930a(a, i));
        return a;
    }

    /* renamed from: a */
    public boolean mo3757a() {
        if (this.f3405d != null) {
            return this.f3405d.mo3833f();
        }
        return false;
    }

    public int getAnimatedVisibility() {
        return this.f3407f != null ? this.f3402a.f3410a : getVisibility();
    }

    public int getContentHeight() {
        return this.f3406e;
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, C0736j.ActionBar, C0727a.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(C0736j.ActionBar_height, 0));
        obtainStyledAttributes.recycle();
        if (this.f3405d != null) {
            this.f3405d.mo3827a(configuration);
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f3409h = false;
        }
        if (!this.f3409h) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f3409h = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f3409h = false;
        }
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f3408g = false;
        }
        if (!this.f3408g) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f3408g = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f3408g = false;
        }
        return true;
    }

    public void setContentHeight(int i) {
        this.f3406e = i;
        requestLayout();
    }

    public void setVisibility(int i) {
        if (i != getVisibility()) {
            if (this.f3407f != null) {
                this.f3407f.mo2560b();
            }
            super.setVisibility(i);
        }
    }
}
