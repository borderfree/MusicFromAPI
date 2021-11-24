package kankan.wheel.widget;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import com.seattleclouds.C5451m.C5457f;
import java.util.LinkedList;
import java.util.List;
import kankan.wheel.widget.C6697f.C6700a;
import kankan.wheel.widget.p193a.C6692b;

public class WheelView extends View {

    /* renamed from: c */
    private static final int[] f23505c = {-15658735, 11184810, 11184810};

    /* renamed from: a */
    boolean f23506a = false;

    /* renamed from: b */
    C6700a f23507b = new C6700a() {
        /* renamed from: a */
        public void mo20794a() {
            WheelView.this.f23515k = true;
            WheelView.this.mo20773a();
        }

        /* renamed from: a */
        public void mo20795a(int i) {
            WheelView.this.m32251b(i);
            int height = WheelView.this.getHeight();
            if (WheelView.this.f23516l <= height) {
                height = -height;
                if (WheelView.this.f23516l >= height) {
                    return;
                }
            }
            WheelView.this.f23516l = height;
            WheelView.this.f23514j.mo20813a();
        }

        /* renamed from: b */
        public void mo20796b() {
            if (WheelView.this.f23515k) {
                WheelView.this.mo20779b();
                WheelView.this.f23515k = false;
            }
            WheelView.this.f23516l = 0;
            WheelView.this.invalidate();
        }

        /* renamed from: c */
        public void mo20797c() {
            if (Math.abs(WheelView.this.f23516l) > 1) {
                WheelView.this.f23514j.mo20814a(WheelView.this.f23516l, 0);
            }
        }
    };

    /* renamed from: d */
    private int f23508d = 0;

    /* renamed from: e */
    private int f23509e = 5;

    /* renamed from: f */
    private int f23510f = 0;

    /* renamed from: g */
    private Drawable f23511g;

    /* renamed from: h */
    private GradientDrawable f23512h;

    /* renamed from: i */
    private GradientDrawable f23513i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C6697f f23514j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f23515k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public int f23516l;

    /* renamed from: m */
    private LinearLayout f23517m;

    /* renamed from: n */
    private int f23518n;

    /* renamed from: o */
    private C6692b f23519o;

    /* renamed from: p */
    private C6696e f23520p = new C6696e(this);

    /* renamed from: q */
    private List<C6693b> f23521q = new LinkedList();

    /* renamed from: r */
    private List<C6695d> f23522r = new LinkedList();

    /* renamed from: s */
    private List<C6694c> f23523s = new LinkedList();

    /* renamed from: t */
    private DataSetObserver f23524t = new DataSetObserver() {
        public void onChanged() {
            WheelView.this.mo20778a(false);
        }

        public void onInvalidated() {
            WheelView.this.mo20778a(true);
        }
    };

    public WheelView(Context context) {
        super(context);
        m32245a(context);
    }

    public WheelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m32245a(context);
    }

    public WheelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m32245a(context);
    }

    /* renamed from: a */
    private int m32243a(LinearLayout linearLayout) {
        if (!(linearLayout == null || linearLayout.getChildAt(0) == null)) {
            this.f23510f = linearLayout.getChildAt(0).getMeasuredHeight();
        }
        return Math.max((this.f23510f * this.f23509e) - ((this.f23510f * 10) / 50), getSuggestedMinimumHeight());
    }

    /* renamed from: a */
    private void m32245a(Context context) {
        this.f23514j = new C6697f(getContext(), this.f23507b);
    }

    /* renamed from: a */
    private void m32246a(Canvas canvas) {
        double itemHeight = (double) getItemHeight();
        Double.isNaN(itemHeight);
        int i = (int) (itemHeight * 1.5d);
        this.f23512h.setBounds(0, 0, getWidth(), i);
        this.f23512h.draw(canvas);
        this.f23513i.setBounds(0, getHeight() - i, getWidth(), getHeight());
        this.f23513i.draw(canvas);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m32251b(int i) {
        this.f23516l += i;
        int itemHeight = getItemHeight();
        int i2 = this.f23516l / itemHeight;
        int i3 = this.f23508d - i2;
        int a = this.f23519o.mo19682a();
        int i4 = this.f23516l % itemHeight;
        if (Math.abs(i4) <= itemHeight / 2) {
            i4 = 0;
        }
        if (this.f23506a && a > 0) {
            if (i4 > 0) {
                i3--;
                i2++;
            } else if (i4 < 0) {
                i3++;
                i2--;
            }
            while (i3 < 0) {
                i3 += a;
            }
            i3 %= a;
        } else if (i3 < 0) {
            i2 = this.f23508d;
            i3 = 0;
        } else if (i3 >= a) {
            i2 = (this.f23508d - a) + 1;
            i3 = a - 1;
        } else if (i3 > 0 && i4 > 0) {
            i3--;
            i2++;
        } else if (i3 < a - 1 && i4 < 0) {
            i3++;
            i2--;
        }
        int i5 = this.f23516l;
        if (i3 != this.f23508d) {
            mo20776a(i3, false);
        } else {
            invalidate();
        }
        this.f23516l = i5 - (i2 * itemHeight);
        if (this.f23516l > getHeight()) {
            this.f23516l = (this.f23516l % getHeight()) + getHeight();
        }
    }

    /* renamed from: b */
    private void m32252b(Canvas canvas) {
        canvas.save();
        canvas.translate(10.0f, (float) ((-(((this.f23508d - this.f23518n) * getItemHeight()) + ((getItemHeight() - getHeight()) / 2))) + this.f23516l));
        this.f23517m.draw(canvas);
        canvas.restore();
    }

    /* renamed from: b */
    private boolean m32253b(int i, boolean z) {
        View d = m32258d(i);
        if (d == null) {
            return false;
        }
        if (z) {
            this.f23517m.addView(d, 0);
        } else {
            this.f23517m.addView(d);
        }
        return true;
    }

    /* renamed from: c */
    private int m32254c(int i, int i2) {
        m32259d();
        this.f23517m.setLayoutParams(new LayoutParams(-2, -2));
        this.f23517m.measure(MeasureSpec.makeMeasureSpec(i, 0), MeasureSpec.makeMeasureSpec(0, 0));
        int measuredWidth = this.f23517m.getMeasuredWidth();
        if (i2 != 1073741824) {
            int max = Math.max(measuredWidth + 20, getSuggestedMinimumWidth());
            if (i2 != Integer.MIN_VALUE || i >= max) {
                i = max;
            }
        }
        this.f23517m.measure(MeasureSpec.makeMeasureSpec(i - 20, 1073741824), MeasureSpec.makeMeasureSpec(0, 0));
        return i;
    }

    /* renamed from: c */
    private void m32255c(Canvas canvas) {
        int height = getHeight() / 2;
        double itemHeight = (double) (getItemHeight() / 2);
        Double.isNaN(itemHeight);
        int i = (int) (itemHeight * 1.2d);
        this.f23511g.setBounds(0, height - i, getWidth(), height + i);
        this.f23511g.draw(canvas);
    }

    /* renamed from: c */
    private boolean m32256c(int i) {
        return this.f23519o != null && this.f23519o.mo19682a() > 0 && (this.f23506a || (i >= 0 && i < this.f23519o.mo19682a()));
    }

    /* renamed from: d */
    private View m32258d(int i) {
        if (this.f23519o == null || this.f23519o.mo19682a() == 0) {
            return null;
        }
        int a = this.f23519o.mo19682a();
        if (!m32256c(i)) {
            return this.f23519o.mo20804a(this.f23520p.mo20811b(), this.f23517m);
        }
        while (i < 0) {
            i += a;
        }
        return this.f23519o.mo19683a(i % a, this.f23520p.mo20810a(), this.f23517m);
    }

    /* renamed from: d */
    private void m32259d() {
        if (this.f23511g == null) {
            this.f23511g = getContext().getResources().getDrawable(C5457f.wheel_val);
        }
        if (this.f23512h == null) {
            this.f23512h = new GradientDrawable(Orientation.TOP_BOTTOM, f23505c);
        }
        if (this.f23513i == null) {
            this.f23513i = new GradientDrawable(Orientation.BOTTOM_TOP, f23505c);
        }
        setBackgroundResource(C5457f.wheel_bg);
    }

    /* renamed from: d */
    private void m32260d(int i, int i2) {
        this.f23517m.layout(0, 0, i - 20, i2);
    }

    /* renamed from: e */
    private boolean m32261e() {
        boolean z;
        C6690a itemsRange = getItemsRange();
        if (this.f23517m != null) {
            int a = this.f23520p.mo20809a(this.f23517m, this.f23518n, itemsRange);
            z = this.f23518n != a;
            this.f23518n = a;
        } else {
            m32263g();
            z = true;
        }
        if (!z) {
            z = (this.f23518n == itemsRange.mo20800a() && this.f23517m.getChildCount() == itemsRange.mo20803c()) ? false : true;
        }
        if (this.f23518n <= itemsRange.mo20800a() || this.f23518n > itemsRange.mo20802b()) {
            this.f23518n = itemsRange.mo20800a();
        } else {
            int i = this.f23518n - 1;
            while (i >= itemsRange.mo20800a() && m32253b(i, true)) {
                this.f23518n = i;
                i--;
            }
        }
        int i2 = this.f23518n;
        for (int childCount = this.f23517m.getChildCount(); childCount < itemsRange.mo20803c(); childCount++) {
            if (!m32253b(this.f23518n + childCount, false) && this.f23517m.getChildCount() == 0) {
                i2++;
            }
        }
        this.f23518n = i2;
        return z;
    }

    /* renamed from: f */
    private void m32262f() {
        if (m32261e()) {
            m32254c(getWidth(), 1073741824);
            m32260d(getWidth(), getHeight());
        }
    }

    /* renamed from: g */
    private void m32263g() {
        if (this.f23517m == null) {
            this.f23517m = new LinearLayout(getContext());
            this.f23517m.setOrientation(1);
        }
    }

    private int getItemHeight() {
        if (this.f23510f != 0) {
            return this.f23510f;
        }
        if (this.f23517m == null || this.f23517m.getChildAt(0) == null) {
            return getHeight() / this.f23509e;
        }
        this.f23510f = this.f23517m.getChildAt(0).getHeight();
        return this.f23510f;
    }

    private C6690a getItemsRange() {
        if (getItemHeight() == 0) {
            return null;
        }
        int i = this.f23508d;
        int i2 = 1;
        while (getItemHeight() * i2 < getHeight()) {
            i--;
            i2 += 2;
        }
        if (this.f23516l != 0) {
            if (this.f23516l > 0) {
                i--;
            }
            int itemHeight = this.f23516l / getItemHeight();
            i -= itemHeight;
            double d = (double) (i2 + 1);
            double asin = Math.asin((double) itemHeight);
            Double.isNaN(d);
            i2 = (int) (d + asin);
        }
        return new C6690a(i, i2);
    }

    /* renamed from: h */
    private void m32264h() {
        if (this.f23517m != null) {
            this.f23520p.mo20809a(this.f23517m, this.f23518n, new C6690a());
        } else {
            m32263g();
        }
        int i = this.f23509e / 2;
        for (int i2 = this.f23508d + i; i2 >= this.f23508d - i; i2--) {
            if (m32253b(i2, true)) {
                this.f23518n = i2;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo20773a() {
        for (C6695d a : this.f23522r) {
            a.mo19680a(this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo20774a(int i) {
        for (C6694c a : this.f23523s) {
            a.mo20808a(this, i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo20775a(int i, int i2) {
        for (C6693b a : this.f23521q) {
            a.mo20807a(this, i, i2);
        }
    }

    /* renamed from: a */
    public void mo20776a(int i, boolean z) {
        if (this.f23519o != null && this.f23519o.mo19682a() != 0) {
            int a = this.f23519o.mo19682a();
            if (i < 0 || i >= a) {
                if (this.f23506a) {
                    while (i < 0) {
                        i += a;
                    }
                    i %= a;
                } else {
                    return;
                }
            }
            if (i == this.f23508d) {
                return;
            }
            if (z) {
                int i2 = i - this.f23508d;
                if (this.f23506a) {
                    int min = (a + Math.min(i, this.f23508d)) - Math.max(i, this.f23508d);
                    if (min < Math.abs(i2)) {
                        i2 = i2 < 0 ? min : -min;
                    }
                }
                mo20780b(i2, 0);
                return;
            }
            this.f23516l = 0;
            int i3 = this.f23508d;
            this.f23508d = i;
            mo20775a(i3, this.f23508d);
            invalidate();
        }
    }

    /* renamed from: a */
    public void mo20777a(C6695d dVar) {
        this.f23522r.add(dVar);
    }

    /* renamed from: a */
    public void mo20778a(boolean z) {
        if (z) {
            this.f23520p.mo20812c();
            if (this.f23517m != null) {
                this.f23517m.removeAllViews();
            }
            this.f23516l = 0;
        } else if (this.f23517m != null) {
            this.f23520p.mo20809a(this.f23517m, this.f23518n, new C6690a());
        }
        invalidate();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo20779b() {
        for (C6695d b : this.f23522r) {
            b.mo19681b(this);
        }
    }

    /* renamed from: b */
    public void mo20780b(int i, int i2) {
        this.f23514j.mo20814a((i * getItemHeight()) - this.f23516l, i2);
    }

    /* renamed from: c */
    public boolean mo20781c() {
        return this.f23506a;
    }

    public int getCurrentItem() {
        return this.f23508d;
    }

    public C6692b getViewAdapter() {
        return this.f23519o;
    }

    public int getVisibleItems() {
        return this.f23509e;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f23519o != null && this.f23519o.mo19682a() > 0) {
            m32262f();
            m32252b(canvas);
            m32255c(canvas);
        }
        m32246a(canvas);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        m32260d(i3 - i, i4 - i2);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int mode = MeasureSpec.getMode(i);
        int mode2 = MeasureSpec.getMode(i2);
        int size = MeasureSpec.getSize(i);
        int size2 = MeasureSpec.getSize(i2);
        m32264h();
        int c = m32254c(size, mode);
        if (mode2 != 1073741824) {
            int a = m32243a(this.f23517m);
            size2 = mode2 == Integer.MIN_VALUE ? Math.min(a, size2) : a;
        }
        setMeasuredDimension(c, size2);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled() || getViewAdapter() == null) {
            return true;
        }
        switch (motionEvent.getAction()) {
            case 1:
                if (!this.f23515k) {
                    int y = ((int) motionEvent.getY()) - (getHeight() / 2);
                    int itemHeight = (y > 0 ? y + (getItemHeight() / 2) : y - (getItemHeight() / 2)) / getItemHeight();
                    if (itemHeight != 0 && m32256c(this.f23508d + itemHeight)) {
                        mo20774a(this.f23508d + itemHeight);
                        break;
                    }
                }
                break;
            case 2:
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    break;
                }
                break;
        }
        return this.f23514j.mo20816a(motionEvent);
    }

    public void setCurrentItem(int i) {
        mo20776a(i, false);
    }

    public void setCyclic(boolean z) {
        this.f23506a = z;
        mo20778a(false);
    }

    public void setInterpolator(Interpolator interpolator) {
        this.f23514j.mo20815a(interpolator);
    }

    public void setViewAdapter(C6692b bVar) {
        if (this.f23519o != null) {
            this.f23519o.mo20806b(this.f23524t);
        }
        this.f23519o = bVar;
        if (this.f23519o != null) {
            this.f23519o.mo20805a(this.f23524t);
        }
        mo20778a(true);
    }

    public void setVisibleItems(int i) {
        this.f23509e = i;
    }
}
