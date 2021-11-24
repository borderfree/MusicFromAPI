package com.viewpagerindicator;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
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
import com.viewpagerindicator.C6681b.C6687f;

public class LinePageIndicator extends View implements C6680a {

    /* renamed from: a */
    private final Paint f23492a;

    /* renamed from: b */
    private final Paint f23493b;

    /* renamed from: c */
    private ViewPager f23494c;

    /* renamed from: d */
    private C0573f f23495d;

    /* renamed from: e */
    private int f23496e;

    /* renamed from: f */
    private boolean f23497f;

    /* renamed from: g */
    private float f23498g;

    /* renamed from: h */
    private float f23499h;

    /* renamed from: i */
    private int f23500i;

    /* renamed from: j */
    private float f23501j;

    /* renamed from: k */
    private int f23502k;

    /* renamed from: l */
    private boolean f23503l;

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
        int f23504a;

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f23504a = parcel.readInt();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f23504a);
        }
    }

    public LinePageIndicator(Context context) {
        this(context, null);
    }

    public LinePageIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6682a.vpiLinePageIndicatorStyle);
    }

    public LinePageIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23492a = new Paint(1);
        this.f23493b = new Paint(1);
        this.f23501j = -1.0f;
        this.f23502k = -1;
        if (!isInEditMode()) {
            Resources resources = getResources();
            int color = resources.getColor(C6684c.default_line_indicator_selected_color);
            int color2 = resources.getColor(C6684c.default_line_indicator_unselected_color);
            float dimension = resources.getDimension(C6685d.default_line_indicator_line_width);
            float dimension2 = resources.getDimension(C6685d.default_line_indicator_gap_width);
            float dimension3 = resources.getDimension(C6685d.default_line_indicator_stroke_width);
            boolean z = resources.getBoolean(C6683b.default_line_indicator_centered);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6687f.LinePageIndicator, i, 0);
            this.f23497f = obtainStyledAttributes.getBoolean(C6687f.LinePageIndicator_centered, z);
            this.f23498g = obtainStyledAttributes.getDimension(C6687f.LinePageIndicator_lineWidth, dimension);
            this.f23499h = obtainStyledAttributes.getDimension(C6687f.LinePageIndicator_gapWidth, dimension2);
            setStrokeWidth(obtainStyledAttributes.getDimension(C6687f.LinePageIndicator_strokeWidth, dimension3));
            this.f23492a.setColor(obtainStyledAttributes.getColor(C6687f.LinePageIndicator_unselectedColor, color2));
            this.f23493b.setColor(obtainStyledAttributes.getColor(C6687f.LinePageIndicator_selectedColor, color));
            Drawable drawable = obtainStyledAttributes.getDrawable(C6687f.LinePageIndicator_android_background);
            if (drawable != null) {
                setBackgroundDrawable(drawable);
            }
            obtainStyledAttributes.recycle();
            this.f23500i = C0638t.m2987a(ViewConfiguration.get(context));
        }
    }

    /* renamed from: c */
    private int m32236c(int i) {
        float f;
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        if (mode == 1073741824 || this.f23494c == null) {
            f = (float) size;
        } else {
            int b = this.f23494c.getAdapter().mo2480b();
            f = ((float) (getPaddingLeft() + getPaddingRight())) + (((float) b) * this.f23498g) + (((float) (b - 1)) * this.f23499h);
            if (mode == Integer.MIN_VALUE) {
                f = Math.min(f, (float) size);
            }
        }
        return (int) Math.ceil((double) f);
    }

    /* renamed from: d */
    private int m32237d(int i) {
        float f;
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            f = (float) size;
        } else {
            float strokeWidth = this.f23493b.getStrokeWidth() + ((float) getPaddingTop()) + ((float) getPaddingBottom());
            f = mode == Integer.MIN_VALUE ? Math.min(strokeWidth, (float) size) : strokeWidth;
        }
        return (int) Math.ceil((double) f);
    }

    /* renamed from: a */
    public void mo742a(int i) {
        if (this.f23495d != null) {
            this.f23495d.mo742a(i);
        }
    }

    /* renamed from: a */
    public void mo743a(int i, float f, int i2) {
        if (this.f23495d != null) {
            this.f23495d.mo743a(i, f, i2);
        }
    }

    /* renamed from: b */
    public void mo744b(int i) {
        this.f23496e = i;
        invalidate();
        if (this.f23495d != null) {
            this.f23495d.mo744b(i);
        }
    }

    public float getGapWidth() {
        return this.f23499h;
    }

    public float getLineWidth() {
        return this.f23498g;
    }

    public int getSelectedColor() {
        return this.f23493b.getColor();
    }

    public float getStrokeWidth() {
        return this.f23493b.getStrokeWidth();
    }

    public int getUnselectedColor() {
        return this.f23492a.getColor();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f23494c != null) {
            int b = this.f23494c.getAdapter().mo2480b();
            if (b != 0) {
                if (this.f23496e >= b) {
                    setCurrentItem(b - 1);
                    return;
                }
                float f = this.f23498g + this.f23499h;
                float f2 = (((float) b) * f) - this.f23499h;
                float paddingTop = (float) getPaddingTop();
                float paddingLeft = (float) getPaddingLeft();
                float paddingRight = (float) getPaddingRight();
                float height = paddingTop + (((((float) getHeight()) - paddingTop) - ((float) getPaddingBottom())) / 2.0f);
                if (this.f23497f) {
                    paddingLeft += (((((float) getWidth()) - paddingLeft) - paddingRight) / 2.0f) - (f2 / 2.0f);
                }
                int i = 0;
                while (i < b) {
                    float f3 = paddingLeft + (((float) i) * f);
                    canvas.drawLine(f3, height, f3 + this.f23498g, height, i == this.f23496e ? this.f23493b : this.f23492a);
                    i++;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(m32236c(i), m32237d(i2));
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f23496e = savedState.f23504a;
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f23504a = this.f23496e;
        return savedState;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        float f;
        if (super.onTouchEvent(motionEvent)) {
            return true;
        }
        int i = 0;
        if (this.f23494c == null || this.f23494c.getAdapter().mo2480b() == 0) {
            return false;
        }
        int action = motionEvent.getAction() & 255;
        switch (action) {
            case 0:
                this.f23502k = C0615h.m2781b(motionEvent, 0);
                f = motionEvent.getX();
                break;
            case 1:
            case 3:
                if (!this.f23503l) {
                    int b = this.f23494c.getAdapter().mo2480b();
                    float width = (float) getWidth();
                    float f2 = width / 2.0f;
                    float f3 = width / 6.0f;
                    if (this.f23496e > 0 && motionEvent.getX() < f2 - f3) {
                        if (action != 3) {
                            this.f23494c.setCurrentItem(this.f23496e - 1);
                        }
                        return true;
                    } else if (this.f23496e < b - 1 && motionEvent.getX() > f2 + f3) {
                        if (action != 3) {
                            this.f23494c.setCurrentItem(this.f23496e + 1);
                        }
                        return true;
                    }
                }
                this.f23503l = false;
                this.f23502k = -1;
                if (this.f23494c.mo2276f()) {
                    this.f23494c.mo2275e();
                    break;
                }
                break;
            case 2:
                float c = C0615h.m2782c(motionEvent, C0615h.m2780a(motionEvent, this.f23502k));
                float f4 = c - this.f23501j;
                if (!this.f23503l && Math.abs(f4) > ((float) this.f23500i)) {
                    this.f23503l = true;
                }
                if (this.f23503l) {
                    this.f23501j = c;
                    if (this.f23494c.mo2276f() || this.f23494c.mo2270d()) {
                        this.f23494c.mo2262b(f4);
                        break;
                    }
                }
                break;
            case 5:
                int a = C0615h.m2779a(motionEvent);
                this.f23501j = C0615h.m2782c(motionEvent, a);
                this.f23502k = C0615h.m2781b(motionEvent, a);
                break;
            case 6:
                int a2 = C0615h.m2779a(motionEvent);
                if (C0615h.m2781b(motionEvent, a2) == this.f23502k) {
                    if (a2 == 0) {
                        i = 1;
                    }
                    this.f23502k = C0615h.m2781b(motionEvent, i);
                }
                f = C0615h.m2782c(motionEvent, C0615h.m2780a(motionEvent, this.f23502k));
                break;
        }
        this.f23501j = f;
        return true;
    }

    public void setCentered(boolean z) {
        this.f23497f = z;
        invalidate();
    }

    public void setCurrentItem(int i) {
        if (this.f23494c != null) {
            this.f23494c.setCurrentItem(i);
            this.f23496e = i;
            invalidate();
            return;
        }
        throw new IllegalStateException("ViewPager has not been bound.");
    }

    public void setGapWidth(float f) {
        this.f23499h = f;
        invalidate();
    }

    public void setLineWidth(float f) {
        this.f23498g = f;
        invalidate();
    }

    public void setOnPageChangeListener(C0573f fVar) {
        this.f23495d = fVar;
    }

    public void setSelectedColor(int i) {
        this.f23493b.setColor(i);
        invalidate();
    }

    public void setStrokeWidth(float f) {
        this.f23493b.setStrokeWidth(f);
        this.f23492a.setStrokeWidth(f);
        invalidate();
    }

    public void setUnselectedColor(int i) {
        this.f23492a.setColor(i);
        invalidate();
    }

    public void setViewPager(ViewPager viewPager) {
        if (this.f23494c != viewPager) {
            if (this.f23494c != null) {
                this.f23494c.setOnPageChangeListener(null);
            }
            if (viewPager.getAdapter() != null) {
                this.f23494c = viewPager;
                this.f23494c.setOnPageChangeListener(this);
                invalidate();
                return;
            }
            throw new IllegalStateException("ViewPager does not have adapter instance.");
        }
    }
}
