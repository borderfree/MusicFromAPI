package android.support.design.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.design.C0087a.C0091d;
import android.support.design.C0087a.C0097j;
import android.support.design.C0087a.C0098k;
import android.support.design.widget.CoordinatorLayout.C0131b;
import android.support.design.widget.CoordinatorLayout.C0132c;
import android.support.design.widget.CoordinatorLayout.C0134e;
import android.support.p009v4.view.C0626s;
import android.support.p009v4.widget.C0725t;
import android.support.p023v7.widget.C1118n;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import java.util.List;

@C0132c(mo557a = Behavior.class)
public class FloatingActionButton extends C0216v {

    /* renamed from: a */
    int f357a;

    /* renamed from: b */
    boolean f358b;

    /* renamed from: c */
    final Rect f359c;

    /* renamed from: d */
    private ColorStateList f360d;

    /* renamed from: e */
    private Mode f361e;

    /* renamed from: f */
    private int f362f;

    /* renamed from: g */
    private int f363g;

    /* renamed from: h */
    private int f364h;

    /* renamed from: i */
    private int f365i;

    /* renamed from: j */
    private int f366j;

    /* renamed from: k */
    private final Rect f367k;

    /* renamed from: l */
    private C1118n f368l;

    /* renamed from: m */
    private C0186g f369m;

    public static class Behavior extends C0131b<FloatingActionButton> {

        /* renamed from: a */
        private Rect f372a;

        /* renamed from: b */
        private C0138a f373b;

        /* renamed from: c */
        private boolean f374c;

        public Behavior() {
            this.f374c = true;
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0098k.FloatingActionButton_Behavior_Layout);
            this.f374c = obtainStyledAttributes.getBoolean(C0098k.FloatingActionButton_Behavior_Layout_behavior_autoHide, true);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        private void m537a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton) {
            Rect rect = floatingActionButton.f359c;
            if (rect != null && rect.centerX() > 0 && rect.centerY() > 0) {
                C0134e eVar = (C0134e) floatingActionButton.getLayoutParams();
                int i = 0;
                int i2 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - eVar.rightMargin ? rect.right : floatingActionButton.getLeft() <= eVar.leftMargin ? -rect.left : 0;
                if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - eVar.bottomMargin) {
                    i = rect.bottom;
                } else if (floatingActionButton.getTop() <= eVar.topMargin) {
                    i = -rect.top;
                }
                if (i != 0) {
                    C0626s.m2860d(floatingActionButton, i);
                }
                if (i2 != 0) {
                    C0626s.m2862e(floatingActionButton, i2);
                }
            }
        }

        /* renamed from: a */
        private boolean m538a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!m540a((View) appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f372a == null) {
                this.f372a = new Rect();
            }
            Rect rect = this.f372a;
            C0725t.m3404b(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.mo582b(this.f373b, false);
            } else {
                floatingActionButton.mo580a(this.f373b, false);
            }
            return true;
        }

        /* renamed from: a */
        private static boolean m539a(View view) {
            LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof C0134e) {
                return ((C0134e) layoutParams).mo568b() instanceof BottomSheetBehavior;
            }
            return false;
        }

        /* renamed from: a */
        private boolean m540a(View view, FloatingActionButton floatingActionButton) {
            return this.f374c && ((C0134e) floatingActionButton.getLayoutParams()).mo560a() == view.getId() && floatingActionButton.getUserSetVisibility() == 0;
        }

        /* renamed from: b */
        private boolean m541b(View view, FloatingActionButton floatingActionButton) {
            if (!m540a(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((C0134e) floatingActionButton.getLayoutParams()).topMargin) {
                floatingActionButton.mo582b(this.f373b, false);
            } else {
                floatingActionButton.mo580a(this.f373b, false);
            }
            return true;
        }

        /* renamed from: a */
        public void mo546a(C0134e eVar) {
            if (eVar.f345h == 0) {
                eVar.f345h = 80;
            }
        }

        /* renamed from: a */
        public boolean mo411a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i) {
            List c = coordinatorLayout.mo495c((View) floatingActionButton);
            int size = c.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = (View) c.get(i2);
                if (!(view instanceof AppBarLayout)) {
                    if (m539a(view) && m541b(view, floatingActionButton)) {
                        break;
                    }
                } else if (m538a(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.mo481a((View) floatingActionButton, i);
            m537a(coordinatorLayout, floatingActionButton);
            return true;
        }

        /* renamed from: a */
        public boolean mo548a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            Rect rect2 = floatingActionButton.f359c;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        /* renamed from: a */
        public boolean mo436b(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                m538a(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
            } else if (m539a(view)) {
                m541b(view, floatingActionButton);
            }
            return false;
        }
    }

    /* renamed from: android.support.design.widget.FloatingActionButton$a */
    public static abstract class C0138a {
        /* renamed from: a */
        public void mo615a(FloatingActionButton floatingActionButton) {
        }

        /* renamed from: b */
        public void mo616b(FloatingActionButton floatingActionButton) {
        }
    }

    /* renamed from: android.support.design.widget.FloatingActionButton$b */
    private class C0139b implements C0201l {
        C0139b() {
        }

        /* renamed from: a */
        public float mo617a() {
            return ((float) FloatingActionButton.this.getSizeDimension()) / 2.0f;
        }

        /* renamed from: a */
        public void mo618a(int i, int i2, int i3, int i4) {
            FloatingActionButton.this.f359c.set(i, i2, i3, i4);
            FloatingActionButton.this.setPadding(i + FloatingActionButton.this.f357a, i2 + FloatingActionButton.this.f357a, i3 + FloatingActionButton.this.f357a, i4 + FloatingActionButton.this.f357a);
        }

        /* renamed from: a */
        public void mo619a(Drawable drawable) {
            FloatingActionButton.super.setBackgroundDrawable(drawable);
        }

        /* renamed from: b */
        public boolean mo620b() {
            return FloatingActionButton.this.f358b;
        }
    }

    public FloatingActionButton(Context context) {
        this(context, null);
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f359c = new Rect();
        this.f367k = new Rect();
        C0211q.m831a(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0098k.FloatingActionButton, i, C0097j.Widget_Design_FloatingActionButton);
        this.f360d = obtainStyledAttributes.getColorStateList(C0098k.FloatingActionButton_backgroundTint);
        this.f361e = C0214t.m841a(obtainStyledAttributes.getInt(C0098k.FloatingActionButton_backgroundTintMode, -1), null);
        this.f363g = obtainStyledAttributes.getColor(C0098k.FloatingActionButton_rippleColor, 0);
        this.f364h = obtainStyledAttributes.getInt(C0098k.FloatingActionButton_fabSize, -1);
        this.f365i = obtainStyledAttributes.getDimensionPixelSize(C0098k.FloatingActionButton_fabCustomSize, 0);
        this.f362f = obtainStyledAttributes.getDimensionPixelSize(C0098k.FloatingActionButton_borderWidth, 0);
        float dimension = obtainStyledAttributes.getDimension(C0098k.FloatingActionButton_elevation, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(C0098k.FloatingActionButton_pressedTranslationZ, 0.0f);
        this.f358b = obtainStyledAttributes.getBoolean(C0098k.FloatingActionButton_useCompatPadding, false);
        obtainStyledAttributes.recycle();
        this.f368l = new C1118n(this);
        this.f368l.mo5505a(attributeSet, i);
        this.f366j = (int) getResources().getDimension(C0091d.design_fab_image_size);
        getImpl().mo881a(this.f360d, this.f361e, this.f363g, this.f362f);
        getImpl().mo877a(dimension);
        getImpl().mo887b(dimension2);
    }

    /* renamed from: a */
    private int m527a(int i) {
        Resources resources = getResources();
        if (this.f365i != 0) {
            return this.f365i;
        }
        if (i != -1) {
            return resources.getDimensionPixelSize(i != 1 ? C0091d.design_fab_size_normal : C0091d.design_fab_size_mini);
        }
        return Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? m527a(1) : m527a(0);
    }

    /* renamed from: a */
    private static int m528a(int i, int i2) {
        int mode = MeasureSpec.getMode(i2);
        int size = MeasureSpec.getSize(i2);
        return mode != Integer.MIN_VALUE ? (mode == 0 || mode != 1073741824) ? i : size : Math.min(i, size);
    }

    /* renamed from: a */
    private C0192c m529a(final C0138a aVar) {
        if (aVar == null) {
            return null;
        }
        return new C0192c() {
            /* renamed from: a */
            public void mo610a() {
                aVar.mo615a(FloatingActionButton.this);
            }

            /* renamed from: b */
            public void mo611b() {
                aVar.mo616b(FloatingActionButton.this);
            }
        };
    }

    /* renamed from: a */
    private C0186g m530a() {
        return VERSION.SDK_INT >= 21 ? new C0195h(this, new C0139b()) : new C0186g(this, new C0139b());
    }

    private C0186g getImpl() {
        if (this.f369m == null) {
            this.f369m = m530a();
        }
        return this.f369m;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo580a(C0138a aVar, boolean z) {
        getImpl().mo889b(m529a(aVar), z);
    }

    /* renamed from: a */
    public boolean mo581a(Rect rect) {
        if (!C0626s.m2880w(this)) {
            return false;
        }
        rect.set(0, 0, getWidth(), getHeight());
        rect.left += this.f359c.left;
        rect.top += this.f359c.top;
        rect.right -= this.f359c.right;
        rect.bottom -= this.f359c.bottom;
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo582b(C0138a aVar, boolean z) {
        getImpl().mo884a(m529a(aVar), z);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().mo885a(getDrawableState());
    }

    public ColorStateList getBackgroundTintList() {
        return this.f360d;
    }

    public Mode getBackgroundTintMode() {
        return this.f361e;
    }

    public float getCompatElevation() {
        return getImpl().mo875a();
    }

    public Drawable getContentBackground() {
        return getImpl().mo890c();
    }

    public int getCustomSize() {
        return this.f365i;
    }

    public int getRippleColor() {
        return this.f363g;
    }

    public int getSize() {
        return this.f364h;
    }

    /* access modifiers changed from: 0000 */
    public int getSizeDimension() {
        return m527a(this.f364h);
    }

    public boolean getUseCompatPadding() {
        return this.f358b;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().mo886b();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getImpl().mo893f();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().mo894g();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int sizeDimension = getSizeDimension();
        this.f357a = (sizeDimension - this.f366j) / 2;
        getImpl().mo892e();
        int min = Math.min(m528a(sizeDimension, i), m528a(sizeDimension, i2));
        setMeasuredDimension(this.f359c.left + min + this.f359c.right, min + this.f359c.top + this.f359c.bottom);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && mo581a(this.f367k) && !this.f367k.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBackgroundColor(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundResource(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f360d != colorStateList) {
            this.f360d = colorStateList;
            getImpl().mo880a(colorStateList);
        }
    }

    public void setBackgroundTintMode(Mode mode) {
        if (this.f361e != mode) {
            this.f361e = mode;
            getImpl().mo882a(mode);
        }
    }

    public void setCompatElevation(float f) {
        getImpl().mo877a(f);
    }

    public void setCustomSize(int i) {
        if (i >= 0) {
            this.f365i = i;
            return;
        }
        throw new IllegalArgumentException("Custom size should be non-negative.");
    }

    public void setImageResource(int i) {
        this.f368l.mo5502a(i);
    }

    public void setRippleColor(int i) {
        if (this.f363g != i) {
            this.f363g = i;
            getImpl().mo879a(i);
        }
    }

    public void setSize(int i) {
        if (i != this.f364h) {
            this.f364h = i;
            requestLayout();
        }
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f358b != z) {
            this.f358b = z;
            getImpl().mo891d();
        }
    }

    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }
}
