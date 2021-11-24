package android.support.design.widget;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.design.C0087a.C0091d;
import android.support.design.C0087a.C0095h;
import android.support.design.C0087a.C0097j;
import android.support.design.C0087a.C0098k;
import android.support.p009v4.p019g.C0505k.C0506a;
import android.support.p009v4.p019g.C0505k.C0507b;
import android.support.p009v4.p019g.C0505k.C0508c;
import android.support.p009v4.view.C0623p;
import android.support.p009v4.view.C0624q;
import android.support.p009v4.view.C0626s;
import android.support.p009v4.view.ViewPager;
import android.support.p009v4.view.ViewPager.C0568a;
import android.support.p009v4.view.ViewPager.C0572e;
import android.support.p009v4.view.ViewPager.C0573f;
import android.support.p009v4.widget.C0711p;
import android.support.p023v7.app.C0751a.C0754c;
import android.support.p023v7.p024a.C0726a.C0736j;
import android.support.p023v7.p026c.p027a.C0817b;
import android.support.p023v7.widget.C1082bm;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

@C0568a
public class TabLayout extends HorizontalScrollView {
    private static final int ANIMATION_DURATION = 300;
    static final int DEFAULT_GAP_TEXT_ICON = 8;
    private static final int DEFAULT_HEIGHT = 48;
    private static final int DEFAULT_HEIGHT_WITH_TEXT_ICON = 72;
    static final int FIXED_WRAP_GUTTER_MIN = 16;
    public static final int GRAVITY_CENTER = 1;
    public static final int GRAVITY_FILL = 0;
    private static final int INVALID_WIDTH = -1;
    public static final int MODE_FIXED = 1;
    public static final int MODE_SCROLLABLE = 0;
    static final int MOTION_NON_ADJACENT_OFFSET = 24;
    private static final int TAB_MIN_WIDTH_MARGIN = 56;
    private static final C0506a<C0152d> sTabPool = new C0508c(16);
    private C0149a mAdapterChangeListener;
    private int mContentInsetStart;
    private C0150b mCurrentVpSelectedListener;
    int mMode;
    private C0153e mPageChangeListener;
    private C0623p mPagerAdapter;
    private DataSetObserver mPagerAdapterObserver;
    private final int mRequestedTabMaxWidth;
    private final int mRequestedTabMinWidth;
    private ValueAnimator mScrollAnimator;
    private final int mScrollableTabMinWidth;
    private C0150b mSelectedListener;
    private final ArrayList<C0150b> mSelectedListeners;
    private C0152d mSelectedTab;
    private boolean mSetupViewPagerImplicitly;
    final int mTabBackgroundResId;
    int mTabGravity;
    int mTabMaxWidth;
    int mTabPaddingBottom;
    int mTabPaddingEnd;
    int mTabPaddingStart;
    int mTabPaddingTop;
    private final SlidingTabStrip mTabStrip;
    int mTabTextAppearance;
    ColorStateList mTabTextColors;
    float mTabTextMultiLineSize;
    float mTabTextSize;
    private final C0506a<C0154f> mTabViewPool;
    private final ArrayList<C0152d> mTabs;
    ViewPager mViewPager;

    private class SlidingTabStrip extends LinearLayout {
        private ValueAnimator mIndicatorAnimator;
        private int mIndicatorLeft = -1;
        private int mIndicatorRight = -1;
        private int mLayoutDirection = -1;
        private int mSelectedIndicatorHeight;
        private final Paint mSelectedIndicatorPaint;
        int mSelectedPosition = -1;
        float mSelectionOffset;

        SlidingTabStrip(Context context) {
            super(context);
            setWillNotDraw(false);
            this.mSelectedIndicatorPaint = new Paint();
        }

        private void updateIndicatorPosition() {
            int i;
            int i2;
            View childAt = getChildAt(this.mSelectedPosition);
            if (childAt == null || childAt.getWidth() <= 0) {
                i = -1;
                i2 = -1;
            } else {
                i = childAt.getLeft();
                i2 = childAt.getRight();
                if (this.mSelectionOffset > 0.0f && this.mSelectedPosition < getChildCount() - 1) {
                    View childAt2 = getChildAt(this.mSelectedPosition + 1);
                    i = (int) ((this.mSelectionOffset * ((float) childAt2.getLeft())) + ((1.0f - this.mSelectionOffset) * ((float) i)));
                    i2 = (int) ((this.mSelectionOffset * ((float) childAt2.getRight())) + ((1.0f - this.mSelectionOffset) * ((float) i2)));
                }
            }
            setIndicatorPosition(i, i2);
        }

        /* access modifiers changed from: 0000 */
        public void animateIndicatorToPosition(final int i, int i2) {
            final int i3;
            final int i4;
            if (this.mIndicatorAnimator != null && this.mIndicatorAnimator.isRunning()) {
                this.mIndicatorAnimator.cancel();
            }
            boolean z = C0626s.m2861e(this) == 1;
            View childAt = getChildAt(i);
            if (childAt == null) {
                updateIndicatorPosition();
                return;
            }
            final int left = childAt.getLeft();
            final int right = childAt.getRight();
            if (Math.abs(i - this.mSelectedPosition) <= 1) {
                i4 = this.mIndicatorLeft;
                i3 = this.mIndicatorRight;
            } else {
                int dpToPx = TabLayout.this.dpToPx(24);
                i4 = (i >= this.mSelectedPosition ? !z : z) ? left - dpToPx : dpToPx + right;
                i3 = i4;
            }
            if (!(i4 == left && i3 == right)) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.mIndicatorAnimator = valueAnimator;
                valueAnimator.setInterpolator(C0163a.f483b);
                valueAnimator.setDuration((long) i2);
                valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
                C01471 r3 = new AnimatorUpdateListener() {
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        float animatedFraction = valueAnimator.getAnimatedFraction();
                        SlidingTabStrip.this.setIndicatorPosition(C0163a.m649a(i4, left, animatedFraction), C0163a.m649a(i3, right, animatedFraction));
                    }
                };
                valueAnimator.addUpdateListener(r3);
                valueAnimator.addListener(new AnimatorListenerAdapter() {
                    public void onAnimationEnd(Animator animator) {
                        SlidingTabStrip.this.mSelectedPosition = i;
                        SlidingTabStrip.this.mSelectionOffset = 0.0f;
                    }
                });
                valueAnimator.start();
            }
        }

        /* access modifiers changed from: 0000 */
        public boolean childrenNeedLayout() {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (getChildAt(i).getWidth() <= 0) {
                    return true;
                }
            }
            return false;
        }

        public void draw(Canvas canvas) {
            super.draw(canvas);
            if (this.mIndicatorLeft >= 0 && this.mIndicatorRight > this.mIndicatorLeft) {
                canvas.drawRect((float) this.mIndicatorLeft, (float) (getHeight() - this.mSelectedIndicatorHeight), (float) this.mIndicatorRight, (float) getHeight(), this.mSelectedIndicatorPaint);
            }
        }

        /* access modifiers changed from: 0000 */
        public float getIndicatorPosition() {
            return ((float) this.mSelectedPosition) + this.mSelectionOffset;
        }

        /* access modifiers changed from: protected */
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            if (this.mIndicatorAnimator == null || !this.mIndicatorAnimator.isRunning()) {
                updateIndicatorPosition();
                return;
            }
            this.mIndicatorAnimator.cancel();
            animateIndicatorToPosition(this.mSelectedPosition, Math.round((1.0f - this.mIndicatorAnimator.getAnimatedFraction()) * ((float) this.mIndicatorAnimator.getDuration())));
        }

        /* access modifiers changed from: protected */
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (MeasureSpec.getMode(i) == 1073741824) {
                boolean z = true;
                if (TabLayout.this.mMode == 1 && TabLayout.this.mTabGravity == 1) {
                    int childCount = getChildCount();
                    int i3 = 0;
                    for (int i4 = 0; i4 < childCount; i4++) {
                        View childAt = getChildAt(i4);
                        if (childAt.getVisibility() == 0) {
                            i3 = Math.max(i3, childAt.getMeasuredWidth());
                        }
                    }
                    if (i3 > 0) {
                        if (i3 * childCount <= getMeasuredWidth() - (TabLayout.this.dpToPx(16) * 2)) {
                            boolean z2 = false;
                            for (int i5 = 0; i5 < childCount; i5++) {
                                LayoutParams layoutParams = (LayoutParams) getChildAt(i5).getLayoutParams();
                                if (layoutParams.width != i3 || layoutParams.weight != 0.0f) {
                                    layoutParams.width = i3;
                                    layoutParams.weight = 0.0f;
                                    z2 = true;
                                }
                            }
                            z = z2;
                        } else {
                            TabLayout.this.mTabGravity = 0;
                            TabLayout.this.updateTabViews(false);
                        }
                        if (z) {
                            super.onMeasure(i, i2);
                        }
                    }
                }
            }
        }

        public void onRtlPropertiesChanged(int i) {
            super.onRtlPropertiesChanged(i);
            if (VERSION.SDK_INT < 23 && this.mLayoutDirection != i) {
                requestLayout();
                this.mLayoutDirection = i;
            }
        }

        /* access modifiers changed from: 0000 */
        public void setIndicatorPosition(int i, int i2) {
            if (i != this.mIndicatorLeft || i2 != this.mIndicatorRight) {
                this.mIndicatorLeft = i;
                this.mIndicatorRight = i2;
                C0626s.m2857c(this);
            }
        }

        /* access modifiers changed from: 0000 */
        public void setIndicatorPositionFromTabPosition(int i, float f) {
            if (this.mIndicatorAnimator != null && this.mIndicatorAnimator.isRunning()) {
                this.mIndicatorAnimator.cancel();
            }
            this.mSelectedPosition = i;
            this.mSelectionOffset = f;
            updateIndicatorPosition();
        }

        /* access modifiers changed from: 0000 */
        public void setSelectedIndicatorColor(int i) {
            if (this.mSelectedIndicatorPaint.getColor() != i) {
                this.mSelectedIndicatorPaint.setColor(i);
                C0626s.m2857c(this);
            }
        }

        /* access modifiers changed from: 0000 */
        public void setSelectedIndicatorHeight(int i) {
            if (this.mSelectedIndicatorHeight != i) {
                this.mSelectedIndicatorHeight = i;
                C0626s.m2857c(this);
            }
        }
    }

    /* renamed from: android.support.design.widget.TabLayout$a */
    private class C0149a implements C0572e {

        /* renamed from: b */
        private boolean f410b;

        C0149a() {
        }

        /* renamed from: a */
        public void mo719a(ViewPager viewPager, C0623p pVar, C0623p pVar2) {
            if (TabLayout.this.mViewPager == viewPager) {
                TabLayout.this.setPagerAdapter(pVar2, this.f410b);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo720a(boolean z) {
            this.f410b = z;
        }
    }

    /* renamed from: android.support.design.widget.TabLayout$b */
    public interface C0150b {
        /* renamed from: a */
        void mo721a(C0152d dVar);

        /* renamed from: b */
        void mo722b(C0152d dVar);

        /* renamed from: c */
        void mo723c(C0152d dVar);
    }

    /* renamed from: android.support.design.widget.TabLayout$c */
    private class C0151c extends DataSetObserver {
        C0151c() {
        }

        public void onChanged() {
            TabLayout.this.populateFromPagerAdapter();
        }

        public void onInvalidated() {
            TabLayout.this.populateFromPagerAdapter();
        }
    }

    /* renamed from: android.support.design.widget.TabLayout$d */
    public static final class C0152d {

        /* renamed from: a */
        TabLayout f412a;

        /* renamed from: b */
        C0154f f413b;

        /* renamed from: c */
        private Object f414c;

        /* renamed from: d */
        private Drawable f415d;

        /* renamed from: e */
        private CharSequence f416e;

        /* renamed from: f */
        private CharSequence f417f;

        /* renamed from: g */
        private int f418g = -1;

        /* renamed from: h */
        private View f419h;

        C0152d() {
        }

        /* renamed from: a */
        public C0152d mo726a(int i) {
            return mo728a(LayoutInflater.from(this.f413b.getContext()).inflate(i, this.f413b, false));
        }

        /* renamed from: a */
        public C0152d mo727a(Drawable drawable) {
            this.f415d = drawable;
            mo739h();
            return this;
        }

        /* renamed from: a */
        public C0152d mo728a(View view) {
            this.f419h = view;
            mo739h();
            return this;
        }

        /* renamed from: a */
        public C0152d mo729a(CharSequence charSequence) {
            this.f416e = charSequence;
            mo739h();
            return this;
        }

        /* renamed from: a */
        public View mo730a() {
            return this.f419h;
        }

        /* renamed from: b */
        public Drawable mo731b() {
            return this.f415d;
        }

        /* renamed from: b */
        public C0152d mo732b(CharSequence charSequence) {
            this.f417f = charSequence;
            mo739h();
            return this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo733b(int i) {
            this.f418g = i;
        }

        /* renamed from: c */
        public int mo734c() {
            return this.f418g;
        }

        /* renamed from: d */
        public CharSequence mo735d() {
            return this.f416e;
        }

        /* renamed from: e */
        public void mo736e() {
            if (this.f412a != null) {
                this.f412a.selectTab(this);
                return;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        /* renamed from: f */
        public boolean mo737f() {
            if (this.f412a != null) {
                return this.f412a.getSelectedTabPosition() == this.f418g;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        /* renamed from: g */
        public CharSequence mo738g() {
            return this.f417f;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: h */
        public void mo739h() {
            if (this.f413b != null) {
                this.f413b.mo747b();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: i */
        public void mo740i() {
            this.f412a = null;
            this.f413b = null;
            this.f414c = null;
            this.f415d = null;
            this.f416e = null;
            this.f417f = null;
            this.f418g = -1;
            this.f419h = null;
        }
    }

    /* renamed from: android.support.design.widget.TabLayout$e */
    public static class C0153e implements C0573f {

        /* renamed from: a */
        private final WeakReference<TabLayout> f420a;

        /* renamed from: b */
        private int f421b;

        /* renamed from: c */
        private int f422c;

        public C0153e(TabLayout tabLayout) {
            this.f420a = new WeakReference<>(tabLayout);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo741a() {
            this.f422c = 0;
            this.f421b = 0;
        }

        /* renamed from: a */
        public void mo742a(int i) {
            this.f421b = this.f422c;
            this.f422c = i;
        }

        /* renamed from: a */
        public void mo743a(int i, float f, int i2) {
            TabLayout tabLayout = (TabLayout) this.f420a.get();
            if (tabLayout != null) {
                boolean z = false;
                boolean z2 = this.f422c != 2 || this.f421b == 1;
                if (!(this.f422c == 2 && this.f421b == 0)) {
                    z = true;
                }
                tabLayout.setScrollPosition(i, f, z2, z);
            }
        }

        /* renamed from: b */
        public void mo744b(int i) {
            TabLayout tabLayout = (TabLayout) this.f420a.get();
            if (tabLayout != null && tabLayout.getSelectedTabPosition() != i && i < tabLayout.getTabCount()) {
                tabLayout.selectTab(tabLayout.getTabAt(i), this.f422c == 0 || (this.f422c == 2 && this.f421b == 0));
            }
        }
    }

    /* renamed from: android.support.design.widget.TabLayout$f */
    class C0154f extends LinearLayout {

        /* renamed from: b */
        private C0152d f424b;

        /* renamed from: c */
        private TextView f425c;

        /* renamed from: d */
        private ImageView f426d;

        /* renamed from: e */
        private View f427e;

        /* renamed from: f */
        private TextView f428f;

        /* renamed from: g */
        private ImageView f429g;

        /* renamed from: h */
        private int f430h = 2;

        public C0154f(Context context) {
            super(context);
            if (TabLayout.this.mTabBackgroundResId != 0) {
                C0626s.m2843a((View) this, C0817b.m3884b(context, TabLayout.this.mTabBackgroundResId));
            }
            C0626s.m2839a(this, TabLayout.this.mTabPaddingStart, TabLayout.this.mTabPaddingTop, TabLayout.this.mTabPaddingEnd, TabLayout.this.mTabPaddingBottom);
            setGravity(17);
            setOrientation(1);
            setClickable(true);
            C0626s.m2846a((View) this, C0624q.m2832a(getContext(), 1002));
        }

        /* renamed from: a */
        private float m612a(Layout layout, int i, float f) {
            return layout.getLineWidth(i) * (f / layout.getPaint().getTextSize());
        }

        /* renamed from: a */
        private void m613a(TextView textView, ImageView imageView) {
            CharSequence charSequence = null;
            Drawable b = this.f424b != null ? this.f424b.mo731b() : null;
            CharSequence d = this.f424b != null ? this.f424b.mo735d() : null;
            CharSequence g = this.f424b != null ? this.f424b.mo738g() : null;
            int i = 0;
            if (imageView != null) {
                if (b != null) {
                    imageView.setImageDrawable(b);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable(null);
                }
                imageView.setContentDescription(g);
            }
            boolean z = !TextUtils.isEmpty(d);
            if (textView != null) {
                if (z) {
                    textView.setText(d);
                    textView.setVisibility(0);
                    setVisibility(0);
                } else {
                    textView.setVisibility(8);
                    textView.setText(null);
                }
                textView.setContentDescription(g);
            }
            if (imageView != null) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) imageView.getLayoutParams();
                if (z && imageView.getVisibility() == 0) {
                    i = TabLayout.this.dpToPx(8);
                }
                if (i != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = i;
                    imageView.requestLayout();
                }
            }
            if (!z) {
                charSequence = g;
            }
            C1082bm.m5951a(this, charSequence);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo745a() {
            mo746a(null);
            setSelected(false);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo746a(C0152d dVar) {
            if (dVar != this.f424b) {
                this.f424b = dVar;
                mo747b();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo747b() {
            ImageView imageView;
            TextView textView;
            C0152d dVar = this.f424b;
            ImageView imageView2 = null;
            View a = dVar != null ? dVar.mo730a() : null;
            if (a != null) {
                ViewParent parent = a.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(a);
                    }
                    addView(a);
                }
                this.f427e = a;
                if (this.f425c != null) {
                    this.f425c.setVisibility(8);
                }
                if (this.f426d != null) {
                    this.f426d.setVisibility(8);
                    this.f426d.setImageDrawable(null);
                }
                this.f428f = (TextView) a.findViewById(16908308);
                if (this.f428f != null) {
                    this.f430h = C0711p.m3327a(this.f428f);
                }
                imageView2 = (ImageView) a.findViewById(16908294);
            } else {
                if (this.f427e != null) {
                    removeView(this.f427e);
                    this.f427e = null;
                }
                this.f428f = null;
            }
            this.f429g = imageView2;
            boolean z = false;
            if (this.f427e == null) {
                if (this.f426d == null) {
                    ImageView imageView3 = (ImageView) LayoutInflater.from(getContext()).inflate(C0095h.design_layout_tab_icon, this, false);
                    addView(imageView3, 0);
                    this.f426d = imageView3;
                }
                if (this.f425c == null) {
                    TextView textView2 = (TextView) LayoutInflater.from(getContext()).inflate(C0095h.design_layout_tab_text, this, false);
                    addView(textView2);
                    this.f425c = textView2;
                    this.f430h = C0711p.m3327a(this.f425c);
                }
                C0711p.m3328a(this.f425c, TabLayout.this.mTabTextAppearance);
                if (TabLayout.this.mTabTextColors != null) {
                    this.f425c.setTextColor(TabLayout.this.mTabTextColors);
                }
                textView = this.f425c;
                imageView = this.f426d;
            } else {
                if (!(this.f428f == null && this.f429g == null)) {
                    textView = this.f428f;
                    imageView = this.f429g;
                }
                if (dVar != null && dVar.mo737f()) {
                    z = true;
                }
                setSelected(z);
            }
            m613a(textView, imageView);
            z = true;
            setSelected(z);
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
            int size = MeasureSpec.getSize(i);
            int mode = MeasureSpec.getMode(i);
            int tabMaxWidth = TabLayout.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i = MeasureSpec.makeMeasureSpec(TabLayout.this.mTabMaxWidth, Integer.MIN_VALUE);
            }
            super.onMeasure(i, i2);
            if (this.f425c != null) {
                getResources();
                float f = TabLayout.this.mTabTextSize;
                int i3 = this.f430h;
                boolean z = true;
                if (this.f426d != null && this.f426d.getVisibility() == 0) {
                    i3 = 1;
                } else if (this.f425c != null && this.f425c.getLineCount() > 1) {
                    f = TabLayout.this.mTabTextMultiLineSize;
                }
                float textSize = this.f425c.getTextSize();
                int lineCount = this.f425c.getLineCount();
                int a = C0711p.m3327a(this.f425c);
                if (f != textSize || (a >= 0 && i3 != a)) {
                    if (TabLayout.this.mMode == 1 && f > textSize && lineCount == 1) {
                        Layout layout = this.f425c.getLayout();
                        if (layout == null || m612a(layout, 0, f) > ((float) ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()))) {
                            z = false;
                        }
                    }
                    if (z) {
                        this.f425c.setTextSize(0, f);
                        this.f425c.setMaxLines(i3);
                        super.onMeasure(i, i2);
                    }
                }
            }
        }

        public boolean performClick() {
            boolean performClick = super.performClick();
            if (this.f424b == null) {
                return performClick;
            }
            if (!performClick) {
                playSoundEffect(0);
            }
            this.f424b.mo736e();
            return true;
        }

        public void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z && VERSION.SDK_INT < 16) {
                sendAccessibilityEvent(4);
            }
            if (this.f425c != null) {
                this.f425c.setSelected(z);
            }
            if (this.f426d != null) {
                this.f426d.setSelected(z);
            }
            if (this.f427e != null) {
                this.f427e.setSelected(z);
            }
        }
    }

    /* renamed from: android.support.design.widget.TabLayout$g */
    public static class C0155g implements C0150b {

        /* renamed from: a */
        private final ViewPager f431a;

        public C0155g(ViewPager viewPager) {
            this.f431a = viewPager;
        }

        /* renamed from: a */
        public void mo721a(C0152d dVar) {
            this.f431a.setCurrentItem(dVar.mo734c());
        }

        /* renamed from: b */
        public void mo722b(C0152d dVar) {
        }

        /* renamed from: c */
        public void mo723c(C0152d dVar) {
        }
    }

    public TabLayout(Context context) {
        this(context, null);
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: finally extract failed */
    public TabLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mTabs = new ArrayList<>();
        this.mTabMaxWidth = Integer.MAX_VALUE;
        this.mSelectedListeners = new ArrayList<>();
        this.mTabViewPool = new C0507b(12);
        C0211q.m831a(context);
        setHorizontalScrollBarEnabled(false);
        this.mTabStrip = new SlidingTabStrip(context);
        super.addView(this.mTabStrip, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0098k.TabLayout, i, C0097j.Widget_Design_TabLayout);
        this.mTabStrip.setSelectedIndicatorHeight(obtainStyledAttributes.getDimensionPixelSize(C0098k.TabLayout_tabIndicatorHeight, 0));
        this.mTabStrip.setSelectedIndicatorColor(obtainStyledAttributes.getColor(C0098k.TabLayout_tabIndicatorColor, 0));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C0098k.TabLayout_tabPadding, 0);
        this.mTabPaddingBottom = dimensionPixelSize;
        this.mTabPaddingEnd = dimensionPixelSize;
        this.mTabPaddingTop = dimensionPixelSize;
        this.mTabPaddingStart = dimensionPixelSize;
        this.mTabPaddingStart = obtainStyledAttributes.getDimensionPixelSize(C0098k.TabLayout_tabPaddingStart, this.mTabPaddingStart);
        this.mTabPaddingTop = obtainStyledAttributes.getDimensionPixelSize(C0098k.TabLayout_tabPaddingTop, this.mTabPaddingTop);
        this.mTabPaddingEnd = obtainStyledAttributes.getDimensionPixelSize(C0098k.TabLayout_tabPaddingEnd, this.mTabPaddingEnd);
        this.mTabPaddingBottom = obtainStyledAttributes.getDimensionPixelSize(C0098k.TabLayout_tabPaddingBottom, this.mTabPaddingBottom);
        this.mTabTextAppearance = obtainStyledAttributes.getResourceId(C0098k.TabLayout_tabTextAppearance, C0097j.TextAppearance_Design_Tab);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(this.mTabTextAppearance, C0736j.TextAppearance);
        try {
            this.mTabTextSize = (float) obtainStyledAttributes2.getDimensionPixelSize(C0736j.TextAppearance_android_textSize, 0);
            this.mTabTextColors = obtainStyledAttributes2.getColorStateList(C0736j.TextAppearance_android_textColor);
            obtainStyledAttributes2.recycle();
            if (obtainStyledAttributes.hasValue(C0098k.TabLayout_tabTextColor)) {
                this.mTabTextColors = obtainStyledAttributes.getColorStateList(C0098k.TabLayout_tabTextColor);
            }
            if (obtainStyledAttributes.hasValue(C0098k.TabLayout_tabSelectedTextColor)) {
                this.mTabTextColors = createColorStateList(this.mTabTextColors.getDefaultColor(), obtainStyledAttributes.getColor(C0098k.TabLayout_tabSelectedTextColor, 0));
            }
            this.mRequestedTabMinWidth = obtainStyledAttributes.getDimensionPixelSize(C0098k.TabLayout_tabMinWidth, -1);
            this.mRequestedTabMaxWidth = obtainStyledAttributes.getDimensionPixelSize(C0098k.TabLayout_tabMaxWidth, -1);
            this.mTabBackgroundResId = obtainStyledAttributes.getResourceId(C0098k.TabLayout_tabBackground, 0);
            this.mContentInsetStart = obtainStyledAttributes.getDimensionPixelSize(C0098k.TabLayout_tabContentStart, 0);
            this.mMode = obtainStyledAttributes.getInt(C0098k.TabLayout_tabMode, 1);
            this.mTabGravity = obtainStyledAttributes.getInt(C0098k.TabLayout_tabGravity, 0);
            obtainStyledAttributes.recycle();
            Resources resources = getResources();
            this.mTabTextMultiLineSize = (float) resources.getDimensionPixelSize(C0091d.design_tab_text_size_2line);
            this.mScrollableTabMinWidth = resources.getDimensionPixelSize(C0091d.design_tab_scrollable_min_width);
            applyModeAndGravity();
        } catch (Throwable th) {
            obtainStyledAttributes2.recycle();
            throw th;
        }
    }

    private void addTabFromItemView(C0209o oVar) {
        C0152d newTab = newTab();
        if (oVar.f655a != null) {
            newTab.mo729a(oVar.f655a);
        }
        if (oVar.f656b != null) {
            newTab.mo727a(oVar.f656b);
        }
        if (oVar.f657c != 0) {
            newTab.mo726a(oVar.f657c);
        }
        if (!TextUtils.isEmpty(oVar.getContentDescription())) {
            newTab.mo732b(oVar.getContentDescription());
        }
        addTab(newTab);
    }

    private void addTabView(C0152d dVar) {
        this.mTabStrip.addView(dVar.f413b, dVar.mo734c(), createLayoutParamsForTabs());
    }

    private void addViewInternal(View view) {
        if (view instanceof C0209o) {
            addTabFromItemView((C0209o) view);
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    private void animateToTab(int i) {
        if (i != -1) {
            if (getWindowToken() == null || !C0626s.m2880w(this) || this.mTabStrip.childrenNeedLayout()) {
                setScrollPosition(i, 0.0f, true);
                return;
            }
            int scrollX = getScrollX();
            int calculateScrollXForTab = calculateScrollXForTab(i, 0.0f);
            if (scrollX != calculateScrollXForTab) {
                ensureScrollAnimator();
                this.mScrollAnimator.setIntValues(new int[]{scrollX, calculateScrollXForTab});
                this.mScrollAnimator.start();
            }
            this.mTabStrip.animateIndicatorToPosition(i, ANIMATION_DURATION);
        }
    }

    private void applyModeAndGravity() {
        C0626s.m2839a(this.mTabStrip, this.mMode == 0 ? Math.max(0, this.mContentInsetStart - this.mTabPaddingStart) : 0, 0, 0, 0);
        switch (this.mMode) {
            case 0:
                this.mTabStrip.setGravity(8388611);
                break;
            case 1:
                this.mTabStrip.setGravity(1);
                break;
        }
        updateTabViews(true);
    }

    private int calculateScrollXForTab(int i, float f) {
        int i2 = 0;
        if (this.mMode != 0) {
            return 0;
        }
        View childAt = this.mTabStrip.getChildAt(i);
        int i3 = i + 1;
        View childAt2 = i3 < this.mTabStrip.getChildCount() ? this.mTabStrip.getChildAt(i3) : null;
        int width = childAt != null ? childAt.getWidth() : 0;
        if (childAt2 != null) {
            i2 = childAt2.getWidth();
        }
        int left = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
        int i4 = (int) (((float) (width + i2)) * 0.5f * f);
        return C0626s.m2861e(this) == 0 ? left + i4 : left - i4;
    }

    private void configureTab(C0152d dVar, int i) {
        dVar.mo733b(i);
        this.mTabs.add(i, dVar);
        int size = this.mTabs.size();
        while (true) {
            i++;
            if (i < size) {
                ((C0152d) this.mTabs.get(i)).mo733b(i);
            } else {
                return;
            }
        }
    }

    private static ColorStateList createColorStateList(int i, int i2) {
        return new ColorStateList(new int[][]{SELECTED_STATE_SET, EMPTY_STATE_SET}, new int[]{i2, i});
    }

    private LayoutParams createLayoutParamsForTabs() {
        LayoutParams layoutParams = new LayoutParams(-2, -1);
        updateTabViewLayoutParams(layoutParams);
        return layoutParams;
    }

    private C0154f createTabView(C0152d dVar) {
        C0154f fVar = this.mTabViewPool != null ? (C0154f) this.mTabViewPool.mo2001a() : null;
        if (fVar == null) {
            fVar = new C0154f(getContext());
        }
        fVar.mo746a(dVar);
        fVar.setFocusable(true);
        fVar.setMinimumWidth(getTabMinWidth());
        return fVar;
    }

    private void dispatchTabReselected(C0152d dVar) {
        for (int size = this.mSelectedListeners.size() - 1; size >= 0; size--) {
            ((C0150b) this.mSelectedListeners.get(size)).mo723c(dVar);
        }
    }

    private void dispatchTabSelected(C0152d dVar) {
        for (int size = this.mSelectedListeners.size() - 1; size >= 0; size--) {
            ((C0150b) this.mSelectedListeners.get(size)).mo721a(dVar);
        }
    }

    private void dispatchTabUnselected(C0152d dVar) {
        for (int size = this.mSelectedListeners.size() - 1; size >= 0; size--) {
            ((C0150b) this.mSelectedListeners.get(size)).mo722b(dVar);
        }
    }

    private void ensureScrollAnimator() {
        if (this.mScrollAnimator == null) {
            this.mScrollAnimator = new ValueAnimator();
            this.mScrollAnimator.setInterpolator(C0163a.f483b);
            this.mScrollAnimator.setDuration(300);
            this.mScrollAnimator.addUpdateListener(new AnimatorUpdateListener() {
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    TabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
                }
            });
        }
    }

    private int getDefaultHeight() {
        int size = this.mTabs.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            C0152d dVar = (C0152d) this.mTabs.get(i);
            if (dVar != null && dVar.mo731b() != null && !TextUtils.isEmpty(dVar.mo735d())) {
                z = true;
                break;
            }
            i++;
        }
        return z ? 72 : 48;
    }

    private float getScrollPosition() {
        return this.mTabStrip.getIndicatorPosition();
    }

    private int getTabMinWidth() {
        if (this.mRequestedTabMinWidth != -1) {
            return this.mRequestedTabMinWidth;
        }
        return this.mMode == 0 ? this.mScrollableTabMinWidth : 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.mTabStrip.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void removeTabViewAt(int i) {
        C0154f fVar = (C0154f) this.mTabStrip.getChildAt(i);
        this.mTabStrip.removeViewAt(i);
        if (fVar != null) {
            fVar.mo745a();
            this.mTabViewPool.mo2002a(fVar);
        }
        requestLayout();
    }

    private void setSelectedTabView(int i) {
        int childCount = this.mTabStrip.getChildCount();
        if (i < childCount) {
            int i2 = 0;
            while (i2 < childCount) {
                this.mTabStrip.getChildAt(i2).setSelected(i2 == i);
                i2++;
            }
        }
    }

    private void setupWithViewPager(ViewPager viewPager, boolean z, boolean z2) {
        if (this.mViewPager != null) {
            if (this.mPageChangeListener != null) {
                this.mViewPager.mo2264b((C0573f) this.mPageChangeListener);
            }
            if (this.mAdapterChangeListener != null) {
                this.mViewPager.mo2263b((C0572e) this.mAdapterChangeListener);
            }
        }
        if (this.mCurrentVpSelectedListener != null) {
            removeOnTabSelectedListener(this.mCurrentVpSelectedListener);
            this.mCurrentVpSelectedListener = null;
        }
        if (viewPager != null) {
            this.mViewPager = viewPager;
            if (this.mPageChangeListener == null) {
                this.mPageChangeListener = new C0153e(this);
            }
            this.mPageChangeListener.mo741a();
            viewPager.mo2253a((C0573f) this.mPageChangeListener);
            this.mCurrentVpSelectedListener = new C0155g(viewPager);
            addOnTabSelectedListener(this.mCurrentVpSelectedListener);
            C0623p adapter = viewPager.getAdapter();
            if (adapter != null) {
                setPagerAdapter(adapter, z);
            }
            if (this.mAdapterChangeListener == null) {
                this.mAdapterChangeListener = new C0149a();
            }
            this.mAdapterChangeListener.mo720a(z);
            viewPager.mo2252a((C0572e) this.mAdapterChangeListener);
            setScrollPosition(viewPager.getCurrentItem(), 0.0f, true);
        } else {
            this.mViewPager = null;
            setPagerAdapter(null, false);
        }
        this.mSetupViewPagerImplicitly = z2;
    }

    private void updateAllTabs() {
        int size = this.mTabs.size();
        for (int i = 0; i < size; i++) {
            ((C0152d) this.mTabs.get(i)).mo739h();
        }
    }

    private void updateTabViewLayoutParams(LayoutParams layoutParams) {
        float f;
        if (this.mMode == 1 && this.mTabGravity == 0) {
            layoutParams.width = 0;
            f = 1.0f;
        } else {
            layoutParams.width = -2;
            f = 0.0f;
        }
        layoutParams.weight = f;
    }

    public void addOnTabSelectedListener(C0150b bVar) {
        if (!this.mSelectedListeners.contains(bVar)) {
            this.mSelectedListeners.add(bVar);
        }
    }

    public void addTab(C0152d dVar) {
        addTab(dVar, this.mTabs.isEmpty());
    }

    public void addTab(C0152d dVar, int i) {
        addTab(dVar, i, this.mTabs.isEmpty());
    }

    public void addTab(C0152d dVar, int i, boolean z) {
        if (dVar.f412a == this) {
            configureTab(dVar, i);
            addTabView(dVar);
            if (z) {
                dVar.mo736e();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    public void addTab(C0152d dVar, boolean z) {
        addTab(dVar, this.mTabs.size(), z);
    }

    public void addView(View view) {
        addViewInternal(view);
    }

    public void addView(View view, int i) {
        addViewInternal(view);
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        addViewInternal(view);
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addViewInternal(view);
    }

    public void clearOnTabSelectedListeners() {
        this.mSelectedListeners.clear();
    }

    /* access modifiers changed from: 0000 */
    public int dpToPx(int i) {
        return Math.round(getResources().getDisplayMetrics().density * ((float) i));
    }

    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public int getSelectedTabPosition() {
        if (this.mSelectedTab != null) {
            return this.mSelectedTab.mo734c();
        }
        return -1;
    }

    public C0152d getTabAt(int i) {
        if (i < 0 || i >= getTabCount()) {
            return null;
        }
        return (C0152d) this.mTabs.get(i);
    }

    public int getTabCount() {
        return this.mTabs.size();
    }

    public int getTabGravity() {
        return this.mTabGravity;
    }

    /* access modifiers changed from: 0000 */
    public int getTabMaxWidth() {
        return this.mTabMaxWidth;
    }

    public int getTabMode() {
        return this.mMode;
    }

    public ColorStateList getTabTextColors() {
        return this.mTabTextColors;
    }

    public C0152d newTab() {
        C0152d dVar = (C0152d) sTabPool.mo2001a();
        if (dVar == null) {
            dVar = new C0152d();
        }
        dVar.f412a = this;
        dVar.f413b = createTabView(dVar);
        return dVar;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.mViewPager == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                setupWithViewPager((ViewPager) parent, true, true);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.mSetupViewPagerImplicitly) {
            setupWithViewPager(null);
            this.mSetupViewPagerImplicitly = false;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0067, code lost:
        if (r1.getMeasuredWidth() != getMeasuredWidth()) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0069, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0073, code lost:
        if (r1.getMeasuredWidth() < getMeasuredWidth()) goto L_0x0069;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r6, int r7) {
        /*
            r5 = this;
            int r0 = r5.getDefaultHeight()
            int r0 = r5.dpToPx(r0)
            int r1 = r5.getPaddingTop()
            int r0 = r0 + r1
            int r1 = r5.getPaddingBottom()
            int r0 = r0 + r1
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            if (r1 == r2) goto L_0x0024
            if (r1 == 0) goto L_0x001f
            goto L_0x0030
        L_0x001f:
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            goto L_0x0030
        L_0x0024:
            int r7 = android.view.View.MeasureSpec.getSize(r7)
            int r7 = java.lang.Math.min(r0, r7)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r3)
        L_0x0030:
            int r0 = android.view.View.MeasureSpec.getSize(r6)
            int r1 = android.view.View.MeasureSpec.getMode(r6)
            if (r1 == 0) goto L_0x004a
            int r1 = r5.mRequestedTabMaxWidth
            if (r1 <= 0) goto L_0x0041
            int r0 = r5.mRequestedTabMaxWidth
            goto L_0x0048
        L_0x0041:
            r1 = 56
            int r1 = r5.dpToPx(r1)
            int r0 = r0 - r1
        L_0x0048:
            r5.mTabMaxWidth = r0
        L_0x004a:
            super.onMeasure(r6, r7)
            int r6 = r5.getChildCount()
            r0 = 1
            if (r6 != r0) goto L_0x0096
            r6 = 0
            android.view.View r1 = r5.getChildAt(r6)
            int r2 = r5.mMode
            switch(r2) {
                case 0: goto L_0x006b;
                case 1: goto L_0x005f;
                default: goto L_0x005e;
            }
        L_0x005e:
            goto L_0x0076
        L_0x005f:
            int r2 = r1.getMeasuredWidth()
            int r4 = r5.getMeasuredWidth()
            if (r2 == r4) goto L_0x0076
        L_0x0069:
            r6 = 1
            goto L_0x0076
        L_0x006b:
            int r2 = r1.getMeasuredWidth()
            int r4 = r5.getMeasuredWidth()
            if (r2 >= r4) goto L_0x0076
            goto L_0x0069
        L_0x0076:
            if (r6 == 0) goto L_0x0096
            int r6 = r5.getPaddingTop()
            int r0 = r5.getPaddingBottom()
            int r6 = r6 + r0
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            int r0 = r0.height
            int r6 = getChildMeasureSpec(r7, r6, r0)
            int r7 = r5.getMeasuredWidth()
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r3)
            r1.measure(r7, r6)
        L_0x0096:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.TabLayout.onMeasure(int, int):void");
    }

    /* access modifiers changed from: 0000 */
    public void populateFromPagerAdapter() {
        removeAllTabs();
        if (this.mPagerAdapter != null) {
            int b = this.mPagerAdapter.mo2480b();
            for (int i = 0; i < b; i++) {
                addTab(newTab().mo729a(this.mPagerAdapter.mo2484c(i)), false);
            }
            if (this.mViewPager != null && b > 0) {
                int currentItem = this.mViewPager.getCurrentItem();
                if (currentItem != getSelectedTabPosition() && currentItem < getTabCount()) {
                    selectTab(getTabAt(currentItem));
                }
            }
        }
    }

    public void removeAllTabs() {
        for (int childCount = this.mTabStrip.getChildCount() - 1; childCount >= 0; childCount--) {
            removeTabViewAt(childCount);
        }
        Iterator it = this.mTabs.iterator();
        while (it.hasNext()) {
            C0152d dVar = (C0152d) it.next();
            it.remove();
            dVar.mo740i();
            sTabPool.mo2002a(dVar);
        }
        this.mSelectedTab = null;
    }

    public void removeOnTabSelectedListener(C0150b bVar) {
        this.mSelectedListeners.remove(bVar);
    }

    public void removeTab(C0152d dVar) {
        if (dVar.f412a == this) {
            removeTabAt(dVar.mo734c());
            return;
        }
        throw new IllegalArgumentException("Tab does not belong to this TabLayout.");
    }

    public void removeTabAt(int i) {
        int c = this.mSelectedTab != null ? this.mSelectedTab.mo734c() : 0;
        removeTabViewAt(i);
        C0152d dVar = (C0152d) this.mTabs.remove(i);
        if (dVar != null) {
            dVar.mo740i();
            sTabPool.mo2002a(dVar);
        }
        int size = this.mTabs.size();
        for (int i2 = i; i2 < size; i2++) {
            ((C0152d) this.mTabs.get(i2)).mo733b(i2);
        }
        if (c == i) {
            selectTab(this.mTabs.isEmpty() ? null : (C0152d) this.mTabs.get(Math.max(0, i - 1)));
        }
    }

    /* access modifiers changed from: 0000 */
    public void selectTab(C0152d dVar) {
        selectTab(dVar, true);
    }

    /* access modifiers changed from: 0000 */
    public void selectTab(C0152d dVar, boolean z) {
        C0152d dVar2 = this.mSelectedTab;
        if (dVar2 != dVar) {
            int c = dVar != null ? dVar.mo734c() : -1;
            if (z) {
                if ((dVar2 == null || dVar2.mo734c() == -1) && c != -1) {
                    setScrollPosition(c, 0.0f, true);
                } else {
                    animateToTab(c);
                }
                if (c != -1) {
                    setSelectedTabView(c);
                }
            }
            if (dVar2 != null) {
                dispatchTabUnselected(dVar2);
            }
            this.mSelectedTab = dVar;
            if (dVar != null) {
                dispatchTabSelected(dVar);
            }
        } else if (dVar2 != null) {
            dispatchTabReselected(dVar);
            animateToTab(dVar.mo734c());
        }
    }

    @Deprecated
    public void setOnTabSelectedListener(C0150b bVar) {
        if (this.mSelectedListener != null) {
            removeOnTabSelectedListener(this.mSelectedListener);
        }
        this.mSelectedListener = bVar;
        if (bVar != null) {
            addOnTabSelectedListener(bVar);
        }
    }

    /* access modifiers changed from: 0000 */
    public void setPagerAdapter(C0623p pVar, boolean z) {
        if (!(this.mPagerAdapter == null || this.mPagerAdapterObserver == null)) {
            this.mPagerAdapter.mo2481b(this.mPagerAdapterObserver);
        }
        this.mPagerAdapter = pVar;
        if (z && pVar != null) {
            if (this.mPagerAdapterObserver == null) {
                this.mPagerAdapterObserver = new C0151c();
            }
            pVar.mo2477a(this.mPagerAdapterObserver);
        }
        populateFromPagerAdapter();
    }

    /* access modifiers changed from: 0000 */
    public void setScrollAnimatorListener(AnimatorListener animatorListener) {
        ensureScrollAnimator();
        this.mScrollAnimator.addListener(animatorListener);
    }

    public void setScrollPosition(int i, float f, boolean z) {
        setScrollPosition(i, f, z, true);
    }

    /* access modifiers changed from: 0000 */
    public void setScrollPosition(int i, float f, boolean z, boolean z2) {
        int round = Math.round(((float) i) + f);
        if (round >= 0 && round < this.mTabStrip.getChildCount()) {
            if (z2) {
                this.mTabStrip.setIndicatorPositionFromTabPosition(i, f);
            }
            if (this.mScrollAnimator != null && this.mScrollAnimator.isRunning()) {
                this.mScrollAnimator.cancel();
            }
            scrollTo(calculateScrollXForTab(i, f), 0);
            if (z) {
                setSelectedTabView(round);
            }
        }
    }

    public void setSelectedTabIndicatorColor(int i) {
        this.mTabStrip.setSelectedIndicatorColor(i);
    }

    public void setSelectedTabIndicatorHeight(int i) {
        this.mTabStrip.setSelectedIndicatorHeight(i);
    }

    public void setTabGravity(int i) {
        if (this.mTabGravity != i) {
            this.mTabGravity = i;
            applyModeAndGravity();
        }
    }

    public void setTabMode(int i) {
        if (i != this.mMode) {
            this.mMode = i;
            applyModeAndGravity();
        }
    }

    public void setTabTextColors(int i, int i2) {
        setTabTextColors(createColorStateList(i, i2));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.mTabTextColors != colorStateList) {
            this.mTabTextColors = colorStateList;
            updateAllTabs();
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(C0623p pVar) {
        setPagerAdapter(pVar, false);
    }

    public void setupWithViewPager(ViewPager viewPager) {
        setupWithViewPager(viewPager, true);
    }

    public void setupWithViewPager(ViewPager viewPager, boolean z) {
        setupWithViewPager(viewPager, z, false);
    }

    public boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    /* access modifiers changed from: 0000 */
    public void updateTabViews(boolean z) {
        for (int i = 0; i < this.mTabStrip.getChildCount(); i++) {
            View childAt = this.mTabStrip.getChildAt(i);
            childAt.setMinimumWidth(getTabMinWidth());
            updateTabViewLayoutParams((LayoutParams) childAt.getLayoutParams());
            if (z) {
                childAt.requestLayout();
            }
        }
    }
}
