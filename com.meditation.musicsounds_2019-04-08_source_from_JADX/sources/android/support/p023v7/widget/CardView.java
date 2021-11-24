package android.support.p023v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.p023v7.p025b.C0810a.C0811a;
import android.support.p023v7.p025b.C0810a.C0812b;
import android.support.p023v7.p025b.C0810a.C0814d;
import android.support.p023v7.p025b.C0810a.C0815e;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;

/* renamed from: android.support.v7.widget.CardView */
public class CardView extends FrameLayout {

    /* renamed from: e */
    private static final int[] f2900e = {16842801};

    /* renamed from: f */
    private static final C0994ab f2901f;

    /* renamed from: a */
    int f2902a;

    /* renamed from: b */
    int f2903b;

    /* renamed from: c */
    final Rect f2904c;

    /* renamed from: d */
    final Rect f2905d;

    /* renamed from: g */
    private boolean f2906g;

    /* renamed from: h */
    private boolean f2907h;

    /* renamed from: i */
    private final C0993aa f2908i;

    static {
        C0994ab zVar = VERSION.SDK_INT >= 21 ? new C1131y() : VERSION.SDK_INT >= 17 ? new C1129x() : new C1132z();
        f2901f = zVar;
        f2901f.mo4932a();
    }

    public CardView(Context context) {
        this(context, null);
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0811a.cardViewStyle);
    }

    public CardView(Context context, AttributeSet attributeSet, int i) {
        Resources resources;
        int i2;
        ColorStateList valueOf;
        super(context, attributeSet, i);
        this.f2904c = new Rect();
        this.f2905d = new Rect();
        this.f2908i = new C0993aa() {

            /* renamed from: b */
            private Drawable f2910b;

            /* renamed from: a */
            public void mo4017a(int i, int i2) {
                if (i > CardView.this.f2902a) {
                    CardView.super.setMinimumWidth(i);
                }
                if (i2 > CardView.this.f2903b) {
                    CardView.super.setMinimumHeight(i2);
                }
            }

            /* renamed from: a */
            public void mo4018a(int i, int i2, int i3, int i4) {
                CardView.this.f2905d.set(i, i2, i3, i4);
                CardView.super.setPadding(i + CardView.this.f2904c.left, i2 + CardView.this.f2904c.top, i3 + CardView.this.f2904c.right, i4 + CardView.this.f2904c.bottom);
            }

            /* renamed from: a */
            public void mo4019a(Drawable drawable) {
                this.f2910b = drawable;
                CardView.this.setBackgroundDrawable(drawable);
            }

            /* renamed from: a */
            public boolean mo4020a() {
                return CardView.this.getUseCompatPadding();
            }

            /* renamed from: b */
            public boolean mo4021b() {
                return CardView.this.getPreventCornerOverlap();
            }

            /* renamed from: c */
            public Drawable mo4022c() {
                return this.f2910b;
            }

            /* renamed from: d */
            public View mo4023d() {
                return CardView.this;
            }
        };
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0815e.CardView, i, C0814d.CardView);
        if (obtainStyledAttributes.hasValue(C0815e.CardView_cardBackgroundColor)) {
            valueOf = obtainStyledAttributes.getColorStateList(C0815e.CardView_cardBackgroundColor);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(f2900e);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            if (fArr[2] > 0.5f) {
                resources = getResources();
                i2 = C0812b.cardview_light_background;
            } else {
                resources = getResources();
                i2 = C0812b.cardview_dark_background;
            }
            valueOf = ColorStateList.valueOf(resources.getColor(i2));
        }
        ColorStateList colorStateList = valueOf;
        float dimension = obtainStyledAttributes.getDimension(C0815e.CardView_cardCornerRadius, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(C0815e.CardView_cardElevation, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(C0815e.CardView_cardMaxElevation, 0.0f);
        this.f2906g = obtainStyledAttributes.getBoolean(C0815e.CardView_cardUseCompatPadding, false);
        this.f2907h = obtainStyledAttributes.getBoolean(C0815e.CardView_cardPreventCornerOverlap, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C0815e.CardView_contentPadding, 0);
        this.f2904c.left = obtainStyledAttributes.getDimensionPixelSize(C0815e.CardView_contentPaddingLeft, dimensionPixelSize);
        this.f2904c.top = obtainStyledAttributes.getDimensionPixelSize(C0815e.CardView_contentPaddingTop, dimensionPixelSize);
        this.f2904c.right = obtainStyledAttributes.getDimensionPixelSize(C0815e.CardView_contentPaddingRight, dimensionPixelSize);
        this.f2904c.bottom = obtainStyledAttributes.getDimensionPixelSize(C0815e.CardView_contentPaddingBottom, dimensionPixelSize);
        float f = dimension2 > dimension3 ? dimension2 : dimension3;
        this.f2902a = obtainStyledAttributes.getDimensionPixelSize(C0815e.CardView_android_minWidth, 0);
        this.f2903b = obtainStyledAttributes.getDimensionPixelSize(C0815e.CardView_android_minHeight, 0);
        obtainStyledAttributes.recycle();
        f2901f.mo4934a(this.f2908i, context, colorStateList, dimension, dimension2, f);
    }

    public ColorStateList getCardBackgroundColor() {
        return f2901f.mo4944i(this.f2908i);
    }

    public float getCardElevation() {
        return f2901f.mo4941e(this.f2908i);
    }

    public int getContentPaddingBottom() {
        return this.f2904c.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f2904c.left;
    }

    public int getContentPaddingRight() {
        return this.f2904c.right;
    }

    public int getContentPaddingTop() {
        return this.f2904c.top;
    }

    public float getMaxCardElevation() {
        return f2901f.mo4931a(this.f2908i);
    }

    public boolean getPreventCornerOverlap() {
        return this.f2907h;
    }

    public float getRadius() {
        return f2901f.mo4940d(this.f2908i);
    }

    public boolean getUseCompatPadding() {
        return this.f2906g;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (!(f2901f instanceof C1131y)) {
            int mode = MeasureSpec.getMode(i);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                i = MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) f2901f.mo4936b(this.f2908i)), MeasureSpec.getSize(i)), mode);
            }
            int mode2 = MeasureSpec.getMode(i2);
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i2 = MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) f2901f.mo4938c(this.f2908i)), MeasureSpec.getSize(i2)), mode2);
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(int i) {
        f2901f.mo4935a(this.f2908i, ColorStateList.valueOf(i));
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        f2901f.mo4935a(this.f2908i, colorStateList);
    }

    public void setCardElevation(float f) {
        f2901f.mo4939c(this.f2908i, f);
    }

    public void setMaxCardElevation(float f) {
        f2901f.mo4937b(this.f2908i, f);
    }

    public void setMinimumHeight(int i) {
        this.f2903b = i;
        super.setMinimumHeight(i);
    }

    public void setMinimumWidth(int i) {
        this.f2902a = i;
        super.setMinimumWidth(i);
    }

    public void setPadding(int i, int i2, int i3, int i4) {
    }

    public void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.f2907h) {
            this.f2907h = z;
            f2901f.mo4943h(this.f2908i);
        }
    }

    public void setRadius(float f) {
        f2901f.mo4933a(this.f2908i, f);
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f2906g != z) {
            this.f2906g = z;
            f2901f.mo4942g(this.f2908i);
        }
    }
}
