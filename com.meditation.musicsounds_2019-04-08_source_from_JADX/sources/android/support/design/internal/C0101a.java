package android.support.design.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.design.C0087a.C0098k;
import android.support.p023v7.widget.C1031an;
import android.util.AttributeSet;
import android.view.Gravity;

/* renamed from: android.support.design.internal.a */
public class C0101a extends C1031an {

    /* renamed from: a */
    protected boolean f222a;

    /* renamed from: b */
    boolean f223b;

    /* renamed from: c */
    private Drawable f224c;

    /* renamed from: d */
    private final Rect f225d;

    /* renamed from: e */
    private final Rect f226e;

    /* renamed from: f */
    private int f227f;

    public C0101a(Context context) {
        this(context, null);
    }

    public C0101a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0101a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f225d = new Rect();
        this.f226e = new Rect();
        this.f227f = 119;
        this.f222a = true;
        this.f223b = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0098k.ForegroundLinearLayout, i, 0);
        this.f227f = obtainStyledAttributes.getInt(C0098k.ForegroundLinearLayout_android_foregroundGravity, this.f227f);
        Drawable drawable = obtainStyledAttributes.getDrawable(C0098k.ForegroundLinearLayout_android_foreground);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f222a = obtainStyledAttributes.getBoolean(C0098k.ForegroundLinearLayout_foregroundInsidePadding, true);
        obtainStyledAttributes.recycle();
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f224c != null) {
            Drawable drawable = this.f224c;
            if (this.f223b) {
                this.f223b = false;
                Rect rect = this.f225d;
                Rect rect2 = this.f226e;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f222a) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f227f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        if (this.f224c != null) {
            this.f224c.setHotspot(f, f2);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f224c != null && this.f224c.isStateful()) {
            this.f224c.setState(getDrawableState());
        }
    }

    public Drawable getForeground() {
        return this.f224c;
    }

    public int getForegroundGravity() {
        return this.f227f;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        if (this.f224c != null) {
            this.f224c.jumpToCurrentState();
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f223b = z | this.f223b;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f223b = true;
    }

    public void setForeground(Drawable drawable) {
        if (this.f224c != drawable) {
            if (this.f224c != null) {
                this.f224c.setCallback(null);
                unscheduleDrawable(this.f224c);
            }
            this.f224c = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f227f == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    public void setForegroundGravity(int i) {
        if (this.f227f != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f227f = i;
            if (this.f227f == 119 && this.f224c != null) {
                this.f224c.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f224c;
    }
}
