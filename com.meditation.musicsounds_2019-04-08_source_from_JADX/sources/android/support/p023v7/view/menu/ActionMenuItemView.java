package android.support.p023v7.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.p023v7.p024a.C0726a.C0736j;
import android.support.p023v7.view.menu.C0855h.C0857b;
import android.support.p023v7.view.menu.C0873p.C0874a;
import android.support.p023v7.widget.ActionMenuView.C0897a;
import android.support.p023v7.widget.C1023ak;
import android.support.p023v7.widget.C1082bm;
import android.support.p023v7.widget.C1127v;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;

/* renamed from: android.support.v7.view.menu.ActionMenuItemView */
public class ActionMenuItemView extends C1127v implements C0874a, C0897a, OnClickListener {

    /* renamed from: b */
    C0859j f2505b;

    /* renamed from: c */
    C0857b f2506c;

    /* renamed from: d */
    C0841b f2507d;

    /* renamed from: e */
    private CharSequence f2508e;

    /* renamed from: f */
    private Drawable f2509f;

    /* renamed from: g */
    private C1023ak f2510g;

    /* renamed from: h */
    private boolean f2511h;

    /* renamed from: i */
    private boolean f2512i;

    /* renamed from: j */
    private int f2513j;

    /* renamed from: k */
    private int f2514k;

    /* renamed from: l */
    private int f2515l;

    /* renamed from: android.support.v7.view.menu.ActionMenuItemView$a */
    private class C0840a extends C1023ak {
        public C0840a() {
            super(ActionMenuItemView.this);
        }

        /* renamed from: a */
        public C0877s mo3365a() {
            if (ActionMenuItemView.this.f2507d != null) {
                return ActionMenuItemView.this.f2507d.mo3367a();
            }
            return null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public boolean mo3366b() {
            if (ActionMenuItemView.this.f2506c == null || !ActionMenuItemView.this.f2506c.mo3368a(ActionMenuItemView.this.f2505b)) {
                return false;
            }
            C0877s a = mo3365a();
            return a != null && a.mo3442f();
        }
    }

    /* renamed from: android.support.v7.view.menu.ActionMenuItemView$b */
    public static abstract class C0841b {
        /* renamed from: a */
        public abstract C0877s mo3367a();
    }

    public ActionMenuItemView(Context context) {
        this(context, null);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.f2511h = m3980e();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0736j.ActionMenuItemView, i, 0);
        this.f2513j = obtainStyledAttributes.getDimensionPixelSize(C0736j.ActionMenuItemView_android_minWidth, 0);
        obtainStyledAttributes.recycle();
        this.f2515l = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f2514k = -1;
        setSaveEnabled(false);
    }

    /* renamed from: e */
    private boolean m3980e() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        return i >= 480 || (i >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    /* renamed from: f */
    private void m3981f() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f2508e);
        if (this.f2509f != null && (!this.f2505b.mo3591m() || (!this.f2511h && !this.f2512i))) {
            z = false;
        }
        boolean z3 = z2 & z;
        CharSequence charSequence = null;
        setText(z3 ? this.f2508e : null);
        CharSequence contentDescription = this.f2505b.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            contentDescription = z3 ? null : this.f2505b.getTitle();
        }
        setContentDescription(contentDescription);
        CharSequence tooltipText = this.f2505b.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            if (!z3) {
                charSequence = this.f2505b.getTitle();
            }
            C1082bm.m5951a(this, charSequence);
            return;
        }
        C1082bm.m5951a(this, tooltipText);
    }

    /* renamed from: a */
    public void mo273a(C0859j jVar, int i) {
        this.f2505b = jVar;
        setIcon(jVar.getIcon());
        setTitle(jVar.mo3554a((C0874a) this));
        setId(jVar.getItemId());
        setVisibility(jVar.isVisible() ? 0 : 8);
        setEnabled(jVar.isEnabled());
        if (jVar.hasSubMenu() && this.f2510g == null) {
            this.f2510g = new C0840a();
        }
    }

    /* renamed from: a */
    public boolean mo3349a() {
        return !TextUtils.isEmpty(getText());
    }

    /* renamed from: b */
    public boolean mo274b() {
        return true;
    }

    /* renamed from: c */
    public boolean mo3350c() {
        return mo3349a() && this.f2505b.getIcon() == null;
    }

    /* renamed from: d */
    public boolean mo3351d() {
        return mo3349a();
    }

    public C0859j getItemData() {
        return this.f2505b;
    }

    public void onClick(View view) {
        if (this.f2506c != null) {
            this.f2506c.mo3368a(this.f2505b);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f2511h = m3980e();
        m3981f();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        boolean a = mo3349a();
        if (a && this.f2514k >= 0) {
            super.setPadding(this.f2514k, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int min = mode == Integer.MIN_VALUE ? Math.min(size, this.f2513j) : this.f2513j;
        if (mode != 1073741824 && this.f2513j > 0 && measuredWidth < min) {
            super.onMeasure(MeasureSpec.makeMeasureSpec(min, 1073741824), i2);
        }
        if (!a && this.f2509f != null) {
            super.setPadding((getMeasuredWidth() - this.f2509f.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f2505b.hasSubMenu() || this.f2510g == null || !this.f2510g.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.f2512i != z) {
            this.f2512i = z;
            if (this.f2505b != null) {
                this.f2505b.mo3581h();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f2509f = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > this.f2515l) {
                float f = ((float) this.f2515l) / ((float) intrinsicWidth);
                intrinsicWidth = this.f2515l;
                intrinsicHeight = (int) (((float) intrinsicHeight) * f);
            }
            if (intrinsicHeight > this.f2515l) {
                float f2 = ((float) this.f2515l) / ((float) intrinsicHeight);
                intrinsicHeight = this.f2515l;
                intrinsicWidth = (int) (((float) intrinsicWidth) * f2);
            }
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        }
        setCompoundDrawables(drawable, null, null, null);
        m3981f();
    }

    public void setItemInvoker(C0857b bVar) {
        this.f2506c = bVar;
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        this.f2514k = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(C0841b bVar) {
        this.f2507d = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f2508e = charSequence;
        m3981f();
    }
}
