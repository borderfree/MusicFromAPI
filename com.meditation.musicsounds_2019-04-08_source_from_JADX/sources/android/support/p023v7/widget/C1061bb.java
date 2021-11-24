package android.support.p023v7.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.support.p023v7.app.C0751a.C0754c;
import android.support.p023v7.p024a.C0726a.C0727a;
import android.support.p023v7.view.C0826a;
import android.support.p023v7.widget.C1031an.C1032a;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.Spinner;
import android.widget.TextView;

/* renamed from: android.support.v7.widget.bb */
public class C1061bb extends HorizontalScrollView implements OnItemSelectedListener {

    /* renamed from: l */
    private static final Interpolator f3679l = new DecelerateInterpolator();

    /* renamed from: a */
    Runnable f3680a;

    /* renamed from: b */
    C1031an f3681b;

    /* renamed from: c */
    int f3682c;

    /* renamed from: d */
    int f3683d;

    /* renamed from: e */
    protected ViewPropertyAnimator f3684e;

    /* renamed from: f */
    protected final C1066d f3685f = new C1066d();

    /* renamed from: g */
    private C1064b f3686g;

    /* renamed from: h */
    private Spinner f3687h;

    /* renamed from: i */
    private boolean f3688i;

    /* renamed from: j */
    private int f3689j;

    /* renamed from: k */
    private int f3690k;

    /* renamed from: android.support.v7.widget.bb$a */
    private class C1063a extends BaseAdapter {
        C1063a() {
        }

        public int getCount() {
            return C1061bb.this.f3681b.getChildCount();
        }

        public Object getItem(int i) {
            return ((C1065c) C1061bb.this.f3681b.getChildAt(i)).mo5314b();
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                return C1061bb.this.mo5293a((C0754c) getItem(i), true);
            }
            ((C1065c) view).mo5313a((C0754c) getItem(i));
            return view;
        }
    }

    /* renamed from: android.support.v7.widget.bb$b */
    private class C1064b implements OnClickListener {
        C1064b() {
        }

        public void onClick(View view) {
            ((C1065c) view).mo5314b().mo3022e();
            int childCount = C1061bb.this.f3681b.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = C1061bb.this.f3681b.getChildAt(i);
                childAt.setSelected(childAt == view);
            }
        }
    }

    /* renamed from: android.support.v7.widget.bb$c */
    private class C1065c extends LinearLayout {

        /* renamed from: b */
        private final int[] f3696b = {16842964};

        /* renamed from: c */
        private C0754c f3697c;

        /* renamed from: d */
        private TextView f3698d;

        /* renamed from: e */
        private ImageView f3699e;

        /* renamed from: f */
        private View f3700f;

        public C1065c(Context context, C0754c cVar, boolean z) {
            super(context, null, C0727a.actionBarTabStyle);
            this.f3697c = cVar;
            C1078bk a = C1078bk.m5881a(context, null, this.f3696b, C0727a.actionBarTabStyle, 0);
            if (a.mo5371g(0)) {
                setBackgroundDrawable(a.mo5357a(0));
            }
            a.mo5358a();
            if (z) {
                setGravity(8388627);
            }
            mo5312a();
        }

        /* renamed from: a */
        public void mo5312a() {
            C0754c cVar = this.f3697c;
            View d = cVar.mo3021d();
            CharSequence charSequence = null;
            if (d != null) {
                ViewParent parent = d.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(d);
                    }
                    addView(d);
                }
                this.f3700f = d;
                if (this.f3698d != null) {
                    this.f3698d.setVisibility(8);
                }
                if (this.f3699e != null) {
                    this.f3699e.setVisibility(8);
                    this.f3699e.setImageDrawable(null);
                    return;
                }
                return;
            }
            if (this.f3700f != null) {
                removeView(this.f3700f);
                this.f3700f = null;
            }
            Drawable b = cVar.mo3019b();
            CharSequence c = cVar.mo3020c();
            if (b != null) {
                if (this.f3699e == null) {
                    AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
                    LayoutParams layoutParams = new LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    appCompatImageView.setLayoutParams(layoutParams);
                    addView(appCompatImageView, 0);
                    this.f3699e = appCompatImageView;
                }
                this.f3699e.setImageDrawable(b);
                this.f3699e.setVisibility(0);
            } else if (this.f3699e != null) {
                this.f3699e.setVisibility(8);
                this.f3699e.setImageDrawable(null);
            }
            boolean z = !TextUtils.isEmpty(c);
            if (z) {
                if (this.f3698d == null) {
                    C1127v vVar = new C1127v(getContext(), null, C0727a.actionBarTabTextStyle);
                    vVar.setEllipsize(TruncateAt.END);
                    LayoutParams layoutParams2 = new LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    vVar.setLayoutParams(layoutParams2);
                    addView(vVar);
                    this.f3698d = vVar;
                }
                this.f3698d.setText(c);
                this.f3698d.setVisibility(0);
            } else if (this.f3698d != null) {
                this.f3698d.setVisibility(8);
                this.f3698d.setText(null);
            }
            if (this.f3699e != null) {
                this.f3699e.setContentDescription(cVar.mo3023f());
            }
            if (!z) {
                charSequence = cVar.mo3023f();
            }
            C1082bm.m5951a(this, charSequence);
        }

        /* renamed from: a */
        public void mo5313a(C0754c cVar) {
            this.f3697c = cVar;
            mo5312a();
        }

        /* renamed from: b */
        public C0754c mo5314b() {
            return this.f3697c;
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName(C0754c.class.getName());
        }

        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(C0754c.class.getName());
        }

        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (C1061bb.this.f3682c > 0 && getMeasuredWidth() > C1061bb.this.f3682c) {
                super.onMeasure(MeasureSpec.makeMeasureSpec(C1061bb.this.f3682c, 1073741824), i2);
            }
        }

        public void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z) {
                sendAccessibilityEvent(4);
            }
        }
    }

    /* renamed from: android.support.v7.widget.bb$d */
    protected class C1066d extends AnimatorListenerAdapter {

        /* renamed from: b */
        private boolean f3702b = false;

        /* renamed from: c */
        private int f3703c;

        protected C1066d() {
        }

        public void onAnimationCancel(Animator animator) {
            this.f3702b = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f3702b) {
                C1061bb.this.f3684e = null;
                C1061bb.this.setVisibility(this.f3703c);
            }
        }

        public void onAnimationStart(Animator animator) {
            C1061bb.this.setVisibility(0);
            this.f3702b = false;
        }
    }

    public C1061bb(Context context) {
        super(context);
        setHorizontalScrollBarEnabled(false);
        C0826a a = C0826a.m3900a(context);
        setContentHeight(a.mo3282e());
        this.f3683d = a.mo3284g();
        this.f3681b = m5797d();
        addView(this.f3681b, new ViewGroup.LayoutParams(-2, -1));
    }

    /* renamed from: a */
    private boolean m5794a() {
        return this.f3687h != null && this.f3687h.getParent() == this;
    }

    /* renamed from: b */
    private void m5795b() {
        if (!m5794a()) {
            if (this.f3687h == null) {
                this.f3687h = m5798e();
            }
            removeView(this.f3681b);
            addView(this.f3687h, new ViewGroup.LayoutParams(-2, -1));
            if (this.f3687h.getAdapter() == null) {
                this.f3687h.setAdapter(new C1063a());
            }
            if (this.f3680a != null) {
                removeCallbacks(this.f3680a);
                this.f3680a = null;
            }
            this.f3687h.setSelection(this.f3690k);
        }
    }

    /* renamed from: c */
    private boolean m5796c() {
        if (!m5794a()) {
            return false;
        }
        removeView(this.f3687h);
        addView(this.f3681b, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.f3687h.getSelectedItemPosition());
        return false;
    }

    /* renamed from: d */
    private C1031an m5797d() {
        C1031an anVar = new C1031an(getContext(), null, C0727a.actionBarTabBarStyle);
        anVar.setMeasureWithLargestChildEnabled(true);
        anVar.setGravity(17);
        anVar.setLayoutParams(new C1032a(-2, -1));
        return anVar;
    }

    /* renamed from: e */
    private Spinner m5798e() {
        AppCompatSpinner appCompatSpinner = new AppCompatSpinner(getContext(), null, C0727a.actionDropDownStyle);
        appCompatSpinner.setLayoutParams(new C1032a(-2, -1));
        appCompatSpinner.setOnItemSelectedListener(this);
        return appCompatSpinner;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C1065c mo5293a(C0754c cVar, boolean z) {
        C1065c cVar2 = new C1065c(getContext(), cVar, z);
        if (z) {
            cVar2.setBackgroundDrawable(null);
            cVar2.setLayoutParams(new AbsListView.LayoutParams(-1, this.f3689j));
        } else {
            cVar2.setFocusable(true);
            if (this.f3686g == null) {
                this.f3686g = new C1064b();
            }
            cVar2.setOnClickListener(this.f3686g);
        }
        return cVar2;
    }

    /* renamed from: a */
    public void mo5294a(int i) {
        final View childAt = this.f3681b.getChildAt(i);
        if (this.f3680a != null) {
            removeCallbacks(this.f3680a);
        }
        this.f3680a = new Runnable() {
            public void run() {
                C1061bb.this.smoothScrollTo(childAt.getLeft() - ((C1061bb.this.getWidth() - childAt.getWidth()) / 2), 0);
                C1061bb.this.f3680a = null;
            }
        };
        post(this.f3680a);
    }

    /* renamed from: b */
    public void mo5295b(int i) {
        ((C1065c) this.f3681b.getChildAt(i)).mo5312a();
        if (this.f3687h != null) {
            ((C1063a) this.f3687h.getAdapter()).notifyDataSetChanged();
        }
        if (this.f3688i) {
            requestLayout();
        }
    }

    /* renamed from: b */
    public void mo5296b(C0754c cVar, boolean z) {
        C1065c a = mo5293a(cVar, false);
        this.f3681b.addView(a, new C1032a(0, -1, 1.0f));
        if (this.f3687h != null) {
            ((C1063a) this.f3687h.getAdapter()).notifyDataSetChanged();
        }
        if (z) {
            a.setSelected(true);
        }
        if (this.f3688i) {
            requestLayout();
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f3680a != null) {
            post(this.f3680a);
        }
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0826a a = C0826a.m3900a(getContext());
        setContentHeight(a.mo3282e());
        this.f3683d = a.mo3284g();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f3680a != null) {
            removeCallbacks(this.f3680a);
        }
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        ((C1065c) view).mo5314b().mo3022e();
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int mode = MeasureSpec.getMode(i);
        boolean z = true;
        boolean z2 = mode == 1073741824;
        setFillViewport(z2);
        int childCount = this.f3681b.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            i3 = -1;
        } else {
            if (childCount > 2) {
                this.f3682c = (int) (((float) MeasureSpec.getSize(i)) * 0.4f);
            } else {
                this.f3682c = MeasureSpec.getSize(i) / 2;
            }
            i3 = Math.min(this.f3682c, this.f3683d);
        }
        this.f3682c = i3;
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(this.f3689j, 1073741824);
        if (z2 || !this.f3688i) {
            z = false;
        }
        if (z) {
            this.f3681b.measure(0, makeMeasureSpec);
            if (this.f3681b.getMeasuredWidth() > MeasureSpec.getSize(i)) {
                m5795b();
                int measuredWidth = getMeasuredWidth();
                super.onMeasure(i, makeMeasureSpec);
                int measuredWidth2 = getMeasuredWidth();
                if (z2 && measuredWidth != measuredWidth2) {
                    setTabSelected(this.f3690k);
                    return;
                }
            }
        }
        m5796c();
        int measuredWidth3 = getMeasuredWidth();
        super.onMeasure(i, makeMeasureSpec);
        int measuredWidth22 = getMeasuredWidth();
        if (z2) {
        }
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z) {
        this.f3688i = z;
    }

    public void setContentHeight(int i) {
        this.f3689j = i;
        requestLayout();
    }

    public void setTabSelected(int i) {
        this.f3690k = i;
        int childCount = this.f3681b.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = this.f3681b.getChildAt(i2);
            boolean z = i2 == i;
            childAt.setSelected(z);
            if (z) {
                mo5294a(i);
            }
            i2++;
        }
        if (this.f3687h != null && i >= 0) {
            this.f3687h.setSelection(i);
        }
    }
}
