package com.viewpagerindicator;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.p009v4.view.C0615h;
import android.support.p009v4.view.C0638t;
import android.support.p009v4.view.ViewPager;
import android.support.p009v4.view.ViewPager.C0573f;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import com.viewpagerindicator.C6681b.C6682a;
import com.viewpagerindicator.C6681b.C6683b;
import com.viewpagerindicator.C6681b.C6684c;
import com.viewpagerindicator.C6681b.C6685d;
import com.viewpagerindicator.C6681b.C6686e;
import com.viewpagerindicator.C6681b.C6687f;

public class CirclePageIndicator extends View implements C6680a {

    /* renamed from: a */
    private float f23474a;

    /* renamed from: b */
    private final Paint f23475b;

    /* renamed from: c */
    private final Paint f23476c;

    /* renamed from: d */
    private final Paint f23477d;

    /* renamed from: e */
    private ViewPager f23478e;

    /* renamed from: f */
    private C0573f f23479f;

    /* renamed from: g */
    private int f23480g;

    /* renamed from: h */
    private int f23481h;

    /* renamed from: i */
    private float f23482i;

    /* renamed from: j */
    private int f23483j;

    /* renamed from: k */
    private int f23484k;

    /* renamed from: l */
    private boolean f23485l;

    /* renamed from: m */
    private boolean f23486m;

    /* renamed from: n */
    private int f23487n;

    /* renamed from: o */
    private float f23488o;

    /* renamed from: p */
    private int f23489p;

    /* renamed from: q */
    private boolean f23490q;

    static class SavedState extends BaseSavedState {
        public static final Creator<SavedState> CREATOR = new Creator<SavedState>() {
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* renamed from: a */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };

        /* renamed from: a */
        int f23491a;

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f23491a = parcel.readInt();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f23491a);
        }
    }

    public CirclePageIndicator(Context context) {
        this(context, null);
    }

    public CirclePageIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6682a.vpiCirclePageIndicatorStyle);
    }

    public CirclePageIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23475b = new Paint(1);
        this.f23476c = new Paint(1);
        this.f23477d = new Paint(1);
        this.f23488o = -1.0f;
        this.f23489p = -1;
        if (!isInEditMode()) {
            Resources resources = getResources();
            int color = resources.getColor(C6684c.default_circle_indicator_page_color);
            int color2 = resources.getColor(C6684c.default_circle_indicator_fill_color);
            int integer = resources.getInteger(C6686e.default_circle_indicator_orientation);
            int color3 = resources.getColor(C6684c.default_circle_indicator_stroke_color);
            float dimension = resources.getDimension(C6685d.default_circle_indicator_stroke_width);
            float dimension2 = resources.getDimension(C6685d.default_circle_indicator_radius);
            boolean z = resources.getBoolean(C6683b.default_circle_indicator_centered);
            boolean z2 = resources.getBoolean(C6683b.default_circle_indicator_snap);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6687f.CirclePageIndicator, i, 0);
            this.f23485l = obtainStyledAttributes.getBoolean(C6687f.CirclePageIndicator_centered, z);
            this.f23484k = obtainStyledAttributes.getInt(C6687f.CirclePageIndicator_android_orientation, integer);
            this.f23475b.setStyle(Style.FILL);
            this.f23475b.setColor(obtainStyledAttributes.getColor(C6687f.CirclePageIndicator_pageColor, color));
            this.f23476c.setStyle(Style.STROKE);
            this.f23476c.setColor(obtainStyledAttributes.getColor(C6687f.CirclePageIndicator_strokeColor, color3));
            this.f23476c.setStrokeWidth(obtainStyledAttributes.getDimension(C6687f.CirclePageIndicator_strokeWidth, dimension));
            this.f23477d.setStyle(Style.FILL);
            this.f23477d.setColor(obtainStyledAttributes.getColor(C6687f.CirclePageIndicator_fillColor, color2));
            this.f23474a = obtainStyledAttributes.getDimension(C6687f.CirclePageIndicator_radius, dimension2);
            this.f23486m = obtainStyledAttributes.getBoolean(C6687f.CirclePageIndicator_snap, z2);
            Drawable drawable = obtainStyledAttributes.getDrawable(C6687f.CirclePageIndicator_android_background);
            if (drawable != null) {
                setBackgroundDrawable(drawable);
            }
            obtainStyledAttributes.recycle();
            this.f23487n = C0638t.m2987a(ViewConfiguration.get(context));
        }
    }

    /* renamed from: c */
    private int m32229c(int i) {
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        if (mode == 1073741824 || this.f23478e == null) {
            return size;
        }
        int b = this.f23478e.getAdapter().mo2480b();
        int paddingLeft = (int) (((float) (getPaddingLeft() + getPaddingRight())) + (((float) (b * 2)) * this.f23474a) + (((float) (b - 1)) * this.f23474a) + 1.0f);
        return mode == Integer.MIN_VALUE ? Math.min(paddingLeft, size) : paddingLeft;
    }

    /* renamed from: d */
    private int m32230d(int i) {
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            return size;
        }
        int paddingTop = (int) ((this.f23474a * 2.0f) + ((float) getPaddingTop()) + ((float) getPaddingBottom()) + 1.0f);
        return mode == Integer.MIN_VALUE ? Math.min(paddingTop, size) : paddingTop;
    }

    /* renamed from: a */
    public void mo742a(int i) {
        this.f23483j = i;
        if (this.f23479f != null) {
            this.f23479f.mo742a(i);
        }
    }

    /* renamed from: a */
    public void mo743a(int i, float f, int i2) {
        this.f23480g = i;
        this.f23482i = f;
        invalidate();
        if (this.f23479f != null) {
            this.f23479f.mo743a(i, f, i2);
        }
    }

    /* renamed from: b */
    public void mo744b(int i) {
        if (this.f23486m || this.f23483j == 0) {
            this.f23480g = i;
            this.f23481h = i;
            invalidate();
        }
        if (this.f23479f != null) {
            this.f23479f.mo744b(i);
        }
    }

    public int getFillColor() {
        return this.f23477d.getColor();
    }

    public int getOrientation() {
        return this.f23484k;
    }

    public int getPageColor() {
        return this.f23475b.getColor();
    }

    public float getRadius() {
        return this.f23474a;
    }

    public int getStrokeColor() {
        return this.f23476c.getColor();
    }

    public float getStrokeWidth() {
        return this.f23476c.getStrokeWidth();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int i4;
        float f;
        float f2;
        super.onDraw(canvas);
        if (this.f23478e != null) {
            int b = this.f23478e.getAdapter().mo2480b();
            if (b != 0) {
                if (this.f23480g >= b) {
                    setCurrentItem(b - 1);
                    return;
                }
                if (this.f23484k == 0) {
                    i4 = getWidth();
                    i3 = getPaddingLeft();
                    i2 = getPaddingRight();
                    i = getPaddingTop();
                } else {
                    i4 = getHeight();
                    i3 = getPaddingTop();
                    i2 = getPaddingBottom();
                    i = getPaddingLeft();
                }
                float f3 = this.f23474a * 3.0f;
                float f4 = ((float) i) + this.f23474a;
                float f5 = ((float) i3) + this.f23474a;
                if (this.f23485l) {
                    f5 += (((float) ((i4 - i3) - i2)) / 2.0f) - ((((float) b) * f3) / 2.0f);
                }
                float f6 = this.f23474a;
                if (this.f23476c.getStrokeWidth() > 0.0f) {
                    f6 -= this.f23476c.getStrokeWidth() / 2.0f;
                }
                for (int i5 = 0; i5 < b; i5++) {
                    float f7 = (((float) i5) * f3) + f5;
                    if (this.f23484k == 0) {
                        f2 = f4;
                    } else {
                        f2 = f7;
                        f7 = f4;
                    }
                    if (this.f23475b.getAlpha() > 0) {
                        canvas.drawCircle(f7, f2, f6, this.f23475b);
                    }
                    if (f6 != this.f23474a) {
                        canvas.drawCircle(f7, f2, this.f23474a, this.f23476c);
                    }
                }
                float f8 = ((float) (this.f23486m ? this.f23481h : this.f23480g)) * f3;
                if (!this.f23486m) {
                    f8 += this.f23482i * f3;
                }
                if (this.f23484k == 0) {
                    f = f8 + f5;
                } else {
                    float f9 = f4;
                    f4 = f8 + f5;
                    f = f9;
                }
                canvas.drawCircle(f, f4, this.f23474a, this.f23477d);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int d;
        int c;
        if (this.f23484k == 0) {
            d = m32229c(i);
            c = m32230d(i2);
        } else {
            d = m32230d(i);
            c = m32229c(i2);
        }
        setMeasuredDimension(d, c);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f23480g = savedState.f23491a;
        this.f23481h = savedState.f23491a;
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f23491a = this.f23480g;
        return savedState;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        float f;
        if (super.onTouchEvent(motionEvent)) {
            return true;
        }
        int i = 0;
        if (this.f23478e == null || this.f23478e.getAdapter().mo2480b() == 0) {
            return false;
        }
        int action = motionEvent.getAction() & 255;
        switch (action) {
            case 0:
                this.f23489p = C0615h.m2781b(motionEvent, 0);
                f = motionEvent.getX();
                break;
            case 1:
            case 3:
                if (!this.f23490q) {
                    int b = this.f23478e.getAdapter().mo2480b();
                    float width = (float) getWidth();
                    float f2 = width / 2.0f;
                    float f3 = width / 6.0f;
                    if (this.f23480g > 0 && motionEvent.getX() < f2 - f3) {
                        if (action != 3) {
                            this.f23478e.setCurrentItem(this.f23480g - 1);
                        }
                        return true;
                    } else if (this.f23480g < b - 1 && motionEvent.getX() > f2 + f3) {
                        if (action != 3) {
                            this.f23478e.setCurrentItem(this.f23480g + 1);
                        }
                        return true;
                    }
                }
                this.f23490q = false;
                this.f23489p = -1;
                if (this.f23478e.mo2276f()) {
                    this.f23478e.mo2275e();
                    break;
                }
                break;
            case 2:
                float c = C0615h.m2782c(motionEvent, C0615h.m2780a(motionEvent, this.f23489p));
                float f4 = c - this.f23488o;
                if (!this.f23490q && Math.abs(f4) > ((float) this.f23487n)) {
                    this.f23490q = true;
                }
                if (this.f23490q) {
                    this.f23488o = c;
                    if (this.f23478e.mo2276f() || this.f23478e.mo2270d()) {
                        this.f23478e.mo2262b(f4);
                        break;
                    }
                }
                break;
            case 5:
                int a = C0615h.m2779a(motionEvent);
                this.f23488o = C0615h.m2782c(motionEvent, a);
                this.f23489p = C0615h.m2781b(motionEvent, a);
                break;
            case 6:
                int a2 = C0615h.m2779a(motionEvent);
                if (C0615h.m2781b(motionEvent, a2) == this.f23489p) {
                    if (a2 == 0) {
                        i = 1;
                    }
                    this.f23489p = C0615h.m2781b(motionEvent, i);
                }
                f = C0615h.m2782c(motionEvent, C0615h.m2780a(motionEvent, this.f23489p));
                break;
        }
        this.f23488o = f;
        return true;
    }

    public void setCentered(boolean z) {
        this.f23485l = z;
        invalidate();
    }

    public void setCurrentItem(int i) {
        if (this.f23478e != null) {
            this.f23478e.setCurrentItem(i);
            this.f23480g = i;
            invalidate();
            return;
        }
        throw new IllegalStateException("ViewPager has not been bound.");
    }

    public void setFillColor(int i) {
        this.f23477d.setColor(i);
        invalidate();
    }

    public void setOnPageChangeListener(C0573f fVar) {
        this.f23479f = fVar;
    }

    public void setOrientation(int i) {
        switch (i) {
            case 0:
            case 1:
                this.f23484k = i;
                requestLayout();
                return;
            default:
                throw new IllegalArgumentException("Orientation must be either HORIZONTAL or VERTICAL.");
        }
    }

    public void setPageColor(int i) {
        this.f23475b.setColor(i);
        invalidate();
    }

    public void setRadius(float f) {
        this.f23474a = f;
        invalidate();
    }

    public void setSnap(boolean z) {
        this.f23486m = z;
        invalidate();
    }

    public void setStrokeColor(int i) {
        this.f23476c.setColor(i);
        invalidate();
    }

    public void setStrokeWidth(float f) {
        this.f23476c.setStrokeWidth(f);
        invalidate();
    }

    public void setViewPager(ViewPager viewPager) {
        if (this.f23478e != viewPager) {
            if (this.f23478e != null) {
                this.f23478e.setOnPageChangeListener(null);
            }
            if (viewPager.getAdapter() != null) {
                this.f23478e = viewPager;
                this.f23478e.setOnPageChangeListener(this);
                invalidate();
                return;
            }
            throw new IllegalStateException("ViewPager does not have adapter instance.");
        }
    }
}
