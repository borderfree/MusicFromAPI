package android.support.p023v7.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region.Op;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.p009v4.p010a.p011a.C0311a;
import android.support.p009v4.view.C0626s;
import android.support.p023v7.p024a.C0726a.C0727a;
import android.support.p023v7.p024a.C0726a.C0736j;
import android.support.p023v7.p026c.p027a.C0817b;
import android.support.p023v7.p031f.C0825a;
import android.text.Layout;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;

/* renamed from: android.support.v7.widget.SwitchCompat */
public class SwitchCompat extends CompoundButton {

    /* renamed from: N */
    private static final int[] f3307N = {16842912};

    /* renamed from: b */
    private static final Property<SwitchCompat, Float> f3308b = new Property<SwitchCompat, Float>(Float.class, "thumbPos") {
        /* renamed from: a */
        public Float get(SwitchCompat switchCompat) {
            return Float.valueOf(switchCompat.f3346z);
        }

        /* renamed from: a */
        public void set(SwitchCompat switchCompat, Float f) {
            switchCompat.setThumbPosition(f.floatValue());
        }
    };

    /* renamed from: A */
    private int f3309A;

    /* renamed from: B */
    private int f3310B;

    /* renamed from: C */
    private int f3311C;

    /* renamed from: D */
    private int f3312D;

    /* renamed from: E */
    private int f3313E;

    /* renamed from: F */
    private int f3314F;

    /* renamed from: G */
    private int f3315G;

    /* renamed from: H */
    private final TextPaint f3316H;

    /* renamed from: I */
    private ColorStateList f3317I;

    /* renamed from: J */
    private Layout f3318J;

    /* renamed from: K */
    private Layout f3319K;

    /* renamed from: L */
    private TransformationMethod f3320L;

    /* renamed from: M */
    private final Rect f3321M;

    /* renamed from: a */
    ObjectAnimator f3322a;

    /* renamed from: c */
    private Drawable f3323c;

    /* renamed from: d */
    private ColorStateList f3324d;

    /* renamed from: e */
    private Mode f3325e;

    /* renamed from: f */
    private boolean f3326f;

    /* renamed from: g */
    private boolean f3327g;

    /* renamed from: h */
    private Drawable f3328h;

    /* renamed from: i */
    private ColorStateList f3329i;

    /* renamed from: j */
    private Mode f3330j;

    /* renamed from: k */
    private boolean f3331k;

    /* renamed from: l */
    private boolean f3332l;

    /* renamed from: m */
    private int f3333m;

    /* renamed from: n */
    private int f3334n;

    /* renamed from: o */
    private int f3335o;

    /* renamed from: p */
    private boolean f3336p;

    /* renamed from: q */
    private CharSequence f3337q;

    /* renamed from: r */
    private CharSequence f3338r;

    /* renamed from: s */
    private boolean f3339s;

    /* renamed from: t */
    private int f3340t;

    /* renamed from: u */
    private int f3341u;

    /* renamed from: v */
    private float f3342v;

    /* renamed from: w */
    private float f3343w;

    /* renamed from: x */
    private VelocityTracker f3344x;

    /* renamed from: y */
    private int f3345y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public float f3346z;

    public SwitchCompat(Context context) {
        this(context, null);
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0727a.switchStyle);
    }

    public SwitchCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3324d = null;
        this.f3325e = null;
        this.f3326f = false;
        this.f3327g = false;
        this.f3329i = null;
        this.f3330j = null;
        this.f3331k = false;
        this.f3332l = false;
        this.f3344x = VelocityTracker.obtain();
        this.f3321M = new Rect();
        this.f3316H = new TextPaint(1);
        Resources resources = getResources();
        this.f3316H.density = resources.getDisplayMetrics().density;
        C1078bk a = C1078bk.m5881a(context, attributeSet, C0736j.SwitchCompat, i, 0);
        this.f3323c = a.mo5357a(C0736j.SwitchCompat_android_thumb);
        if (this.f3323c != null) {
            this.f3323c.setCallback(this);
        }
        this.f3328h = a.mo5357a(C0736j.SwitchCompat_track);
        if (this.f3328h != null) {
            this.f3328h.setCallback(this);
        }
        this.f3337q = a.mo5363c(C0736j.SwitchCompat_android_textOn);
        this.f3338r = a.mo5363c(C0736j.SwitchCompat_android_textOff);
        this.f3339s = a.mo5359a(C0736j.SwitchCompat_showText, true);
        this.f3333m = a.mo5366e(C0736j.SwitchCompat_thumbTextPadding, 0);
        this.f3334n = a.mo5366e(C0736j.SwitchCompat_switchMinWidth, 0);
        this.f3335o = a.mo5366e(C0736j.SwitchCompat_switchPadding, 0);
        this.f3336p = a.mo5359a(C0736j.SwitchCompat_splitTrack, false);
        ColorStateList e = a.mo5367e(C0736j.SwitchCompat_thumbTint);
        if (e != null) {
            this.f3324d = e;
            this.f3326f = true;
        }
        Mode a2 = C1011ag.m5518a(a.mo5355a(C0736j.SwitchCompat_thumbTintMode, -1), null);
        if (this.f3325e != a2) {
            this.f3325e = a2;
            this.f3327g = true;
        }
        if (this.f3326f || this.f3327g) {
            m5314b();
        }
        ColorStateList e2 = a.mo5367e(C0736j.SwitchCompat_trackTint);
        if (e2 != null) {
            this.f3329i = e2;
            this.f3331k = true;
        }
        Mode a3 = C1011ag.m5518a(a.mo5355a(C0736j.SwitchCompat_trackTintMode, -1), null);
        if (this.f3330j != a3) {
            this.f3330j = a3;
            this.f3332l = true;
        }
        if (this.f3331k || this.f3332l) {
            m5309a();
        }
        int g = a.mo5370g(C0736j.SwitchCompat_switchTextAppearance, 0);
        if (g != 0) {
            mo4769a(context, g);
        }
        a.mo5358a();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f3341u = viewConfiguration.getScaledTouchSlop();
        this.f3345y = viewConfiguration.getScaledMinimumFlingVelocity();
        refreshDrawableState();
        setChecked(isChecked());
    }

    /* renamed from: a */
    private static float m5306a(float f, float f2, float f3) {
        return f < f2 ? f2 : f > f3 ? f3 : f;
    }

    /* renamed from: a */
    private Layout m5308a(CharSequence charSequence) {
        if (this.f3320L != null) {
            charSequence = this.f3320L.getTransformation(charSequence, this);
        }
        CharSequence charSequence2 = charSequence;
        StaticLayout staticLayout = new StaticLayout(charSequence2, this.f3316H, charSequence2 != null ? (int) Math.ceil((double) Layout.getDesiredWidth(charSequence2, this.f3316H)) : 0, Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        return staticLayout;
    }

    /* renamed from: a */
    private void m5309a() {
        if (this.f3328h == null) {
            return;
        }
        if (this.f3331k || this.f3332l) {
            this.f3328h = this.f3328h.mutate();
            if (this.f3331k) {
                C0311a.m1175a(this.f3328h, this.f3329i);
            }
            if (this.f3332l) {
                C0311a.m1178a(this.f3328h, this.f3330j);
            }
            if (this.f3328h.isStateful()) {
                this.f3328h.setState(getDrawableState());
            }
        }
    }

    /* renamed from: a */
    private void m5310a(int i, int i2) {
        Typeface typeface;
        switch (i) {
            case 1:
                typeface = Typeface.SANS_SERIF;
                break;
            case 2:
                typeface = Typeface.SERIF;
                break;
            case 3:
                typeface = Typeface.MONOSPACE;
                break;
            default:
                typeface = null;
                break;
        }
        mo4770a(typeface, i2);
    }

    /* renamed from: a */
    private void m5311a(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(3);
        super.onTouchEvent(obtain);
        obtain.recycle();
    }

    /* renamed from: a */
    private void m5312a(boolean z) {
        this.f3322a = ObjectAnimator.ofFloat(this, f3308b, new float[]{z ? 1.0f : 0.0f});
        this.f3322a.setDuration(250);
        if (VERSION.SDK_INT >= 18) {
            this.f3322a.setAutoCancel(true);
        }
        this.f3322a.start();
    }

    /* renamed from: a */
    private boolean m5313a(float f, float f2) {
        boolean z = false;
        if (this.f3323c == null) {
            return false;
        }
        int thumbOffset = getThumbOffset();
        this.f3323c.getPadding(this.f3321M);
        int i = this.f3313E - this.f3341u;
        int i2 = (this.f3312D + thumbOffset) - this.f3341u;
        int i3 = this.f3311C + i2 + this.f3321M.left + this.f3321M.right + this.f3341u;
        int i4 = this.f3315G + this.f3341u;
        if (f > ((float) i2) && f < ((float) i3) && f2 > ((float) i) && f2 < ((float) i4)) {
            z = true;
        }
        return z;
    }

    /* renamed from: b */
    private void m5314b() {
        if (this.f3323c == null) {
            return;
        }
        if (this.f3326f || this.f3327g) {
            this.f3323c = this.f3323c.mutate();
            if (this.f3326f) {
                C0311a.m1175a(this.f3323c, this.f3324d);
            }
            if (this.f3327g) {
                C0311a.m1178a(this.f3323c, this.f3325e);
            }
            if (this.f3323c.isStateful()) {
                this.f3323c.setState(getDrawableState());
            }
        }
    }

    /* renamed from: b */
    private void m5315b(MotionEvent motionEvent) {
        boolean z;
        this.f3340t = 0;
        boolean z2 = true;
        boolean z3 = motionEvent.getAction() == 1 && isEnabled();
        boolean isChecked = isChecked();
        if (z3) {
            this.f3344x.computeCurrentVelocity(1000);
            float xVelocity = this.f3344x.getXVelocity();
            if (Math.abs(xVelocity) > ((float) this.f3345y)) {
                if (!C1094bs.m6004a(this) ? xVelocity <= 0.0f : xVelocity >= 0.0f) {
                    z2 = false;
                }
                z = z2;
            } else {
                z = getTargetCheckedState();
            }
        } else {
            z = isChecked;
        }
        if (z != isChecked) {
            playSoundEffect(0);
        }
        setChecked(z);
        m5311a(motionEvent);
    }

    /* renamed from: c */
    private void m5316c() {
        if (this.f3322a != null) {
            this.f3322a.cancel();
        }
    }

    private boolean getTargetCheckedState() {
        return this.f3346z > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((C1094bs.m6004a(this) ? 1.0f - this.f3346z : this.f3346z) * ((float) getThumbScrollRange())) + 0.5f);
    }

    private int getThumbScrollRange() {
        if (this.f3328h == null) {
            return 0;
        }
        Rect rect = this.f3321M;
        this.f3328h.getPadding(rect);
        Rect a = this.f3323c != null ? C1011ag.m5519a(this.f3323c) : C1011ag.f3469a;
        return ((((this.f3309A - this.f3311C) - rect.left) - rect.right) - a.left) - a.right;
    }

    /* renamed from: a */
    public void mo4769a(Context context, int i) {
        C1078bk a = C1078bk.m5879a(context, i, C0736j.TextAppearance);
        ColorStateList e = a.mo5367e(C0736j.TextAppearance_android_textColor);
        if (e == null) {
            e = getTextColors();
        }
        this.f3317I = e;
        int e2 = a.mo5366e(C0736j.TextAppearance_android_textSize, 0);
        if (e2 != 0) {
            float f = (float) e2;
            if (f != this.f3316H.getTextSize()) {
                this.f3316H.setTextSize(f);
                requestLayout();
            }
        }
        m5310a(a.mo5355a(C0736j.TextAppearance_android_typeface, -1), a.mo5355a(C0736j.TextAppearance_android_textStyle, -1));
        this.f3320L = a.mo5359a(C0736j.TextAppearance_textAllCaps, false) ? new C0825a(getContext()) : null;
        a.mo5358a();
    }

    /* renamed from: a */
    public void mo4770a(Typeface typeface, int i) {
        float f = 0.0f;
        boolean z = false;
        if (i > 0) {
            Typeface defaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i) : Typeface.create(typeface, i);
            setSwitchTypeface(defaultFromStyle);
            int style = ((defaultFromStyle != null ? defaultFromStyle.getStyle() : 0) ^ -1) & i;
            TextPaint textPaint = this.f3316H;
            if ((style & 1) != 0) {
                z = true;
            }
            textPaint.setFakeBoldText(z);
            TextPaint textPaint2 = this.f3316H;
            if ((style & 2) != 0) {
                f = -0.25f;
            }
            textPaint2.setTextSkewX(f);
            return;
        }
        this.f3316H.setFakeBoldText(false);
        this.f3316H.setTextSkewX(0.0f);
        setSwitchTypeface(typeface);
    }

    public void draw(Canvas canvas) {
        int i;
        int i2;
        Rect rect = this.f3321M;
        int i3 = this.f3312D;
        int i4 = this.f3313E;
        int i5 = this.f3314F;
        int i6 = this.f3315G;
        int thumbOffset = getThumbOffset() + i3;
        Rect a = this.f3323c != null ? C1011ag.m5519a(this.f3323c) : C1011ag.f3469a;
        if (this.f3328h != null) {
            this.f3328h.getPadding(rect);
            thumbOffset += rect.left;
            if (a != null) {
                if (a.left > rect.left) {
                    i3 += a.left - rect.left;
                }
                i = a.top > rect.top ? (a.top - rect.top) + i4 : i4;
                if (a.right > rect.right) {
                    i5 -= a.right - rect.right;
                }
                if (a.bottom > rect.bottom) {
                    i2 = i6 - (a.bottom - rect.bottom);
                    this.f3328h.setBounds(i3, i, i5, i2);
                }
            } else {
                i = i4;
            }
            i2 = i6;
            this.f3328h.setBounds(i3, i, i5, i2);
        }
        if (this.f3323c != null) {
            this.f3323c.getPadding(rect);
            int i7 = thumbOffset - rect.left;
            int i8 = thumbOffset + this.f3311C + rect.right;
            this.f3323c.setBounds(i7, i4, i8, i6);
            Drawable background = getBackground();
            if (background != null) {
                C0311a.m1174a(background, i7, i4, i8, i6);
            }
        }
        super.draw(canvas);
    }

    public void drawableHotspotChanged(float f, float f2) {
        if (VERSION.SDK_INT >= 21) {
            super.drawableHotspotChanged(f, f2);
        }
        if (this.f3323c != null) {
            C0311a.m1172a(this.f3323c, f, f2);
        }
        if (this.f3328h != null) {
            C0311a.m1172a(this.f3328h, f, f2);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f3323c;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f3328h;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    public int getCompoundPaddingLeft() {
        if (!C1094bs.m6004a(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f3309A;
        if (!TextUtils.isEmpty(getText())) {
            compoundPaddingLeft += this.f3335o;
        }
        return compoundPaddingLeft;
    }

    public int getCompoundPaddingRight() {
        if (C1094bs.m6004a(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f3309A;
        if (!TextUtils.isEmpty(getText())) {
            compoundPaddingRight += this.f3335o;
        }
        return compoundPaddingRight;
    }

    public boolean getShowText() {
        return this.f3339s;
    }

    public boolean getSplitTrack() {
        return this.f3336p;
    }

    public int getSwitchMinWidth() {
        return this.f3334n;
    }

    public int getSwitchPadding() {
        return this.f3335o;
    }

    public CharSequence getTextOff() {
        return this.f3338r;
    }

    public CharSequence getTextOn() {
        return this.f3337q;
    }

    public Drawable getThumbDrawable() {
        return this.f3323c;
    }

    public int getThumbTextPadding() {
        return this.f3333m;
    }

    public ColorStateList getThumbTintList() {
        return this.f3324d;
    }

    public Mode getThumbTintMode() {
        return this.f3325e;
    }

    public Drawable getTrackDrawable() {
        return this.f3328h;
    }

    public ColorStateList getTrackTintList() {
        return this.f3329i;
    }

    public Mode getTrackTintMode() {
        return this.f3330j;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        if (this.f3323c != null) {
            this.f3323c.jumpToCurrentState();
        }
        if (this.f3328h != null) {
            this.f3328h.jumpToCurrentState();
        }
        if (this.f3322a != null && this.f3322a.isStarted()) {
            this.f3322a.end();
            this.f3322a = null;
        }
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            mergeDrawableStates(onCreateDrawableState, f3307N);
        }
        return onCreateDrawableState;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        Rect rect = this.f3321M;
        Drawable drawable = this.f3328h;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i2 = this.f3313E + rect.top;
        int i3 = this.f3315G - rect.bottom;
        Drawable drawable2 = this.f3323c;
        if (drawable != null) {
            if (!this.f3336p || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect a = C1011ag.m5519a(drawable2);
                drawable2.copyBounds(rect);
                rect.left += a.left;
                rect.right -= a.right;
                int save = canvas.save();
                canvas.clipRect(rect, Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = getTargetCheckedState() ? this.f3318J : this.f3319K;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            if (this.f3317I != null) {
                this.f3316H.setColor(this.f3317I.getColorForState(drawableState, 0));
            }
            this.f3316H.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                i = bounds.left + bounds.right;
            } else {
                i = getWidth();
            }
            canvas.translate((float) ((i / 2) - (layout.getWidth() / 2)), (float) (((i2 + i3) / 2) - (layout.getHeight() / 2)));
            layout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        CharSequence charSequence = isChecked() ? this.f3337q : this.f3338r;
        if (!TextUtils.isEmpty(charSequence)) {
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(' ');
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        super.onLayout(z, i, i2, i3, i4);
        int i10 = 0;
        if (this.f3323c != null) {
            Rect rect = this.f3321M;
            if (this.f3328h != null) {
                this.f3328h.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect a = C1011ag.m5519a(this.f3323c);
            int max = Math.max(0, a.left - rect.left);
            i5 = Math.max(0, a.right - rect.right);
            i10 = max;
        } else {
            i5 = 0;
        }
        if (C1094bs.m6004a(this)) {
            i7 = getPaddingLeft() + i10;
            i6 = ((this.f3309A + i7) - i10) - i5;
        } else {
            i6 = (getWidth() - getPaddingRight()) - i5;
            i7 = (i6 - this.f3309A) + i10 + i5;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            i9 = (((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2) - (this.f3310B / 2);
        } else if (gravity != 80) {
            i9 = getPaddingTop();
        } else {
            i8 = getHeight() - getPaddingBottom();
            i9 = i8 - this.f3310B;
            this.f3312D = i7;
            this.f3313E = i9;
            this.f3315G = i8;
            this.f3314F = i6;
        }
        i8 = this.f3310B + i9;
        this.f3312D = i7;
        this.f3313E = i9;
        this.f3315G = i8;
        this.f3314F = i6;
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        if (this.f3339s) {
            if (this.f3318J == null) {
                this.f3318J = m5308a(this.f3337q);
            }
            if (this.f3319K == null) {
                this.f3319K = m5308a(this.f3338r);
            }
        }
        Rect rect = this.f3321M;
        int i5 = 0;
        if (this.f3323c != null) {
            this.f3323c.getPadding(rect);
            i4 = (this.f3323c.getIntrinsicWidth() - rect.left) - rect.right;
            i3 = this.f3323c.getIntrinsicHeight();
        } else {
            i4 = 0;
            i3 = 0;
        }
        this.f3311C = Math.max(this.f3339s ? Math.max(this.f3318J.getWidth(), this.f3319K.getWidth()) + (this.f3333m * 2) : 0, i4);
        if (this.f3328h != null) {
            this.f3328h.getPadding(rect);
            i5 = this.f3328h.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i6 = rect.left;
        int i7 = rect.right;
        if (this.f3323c != null) {
            Rect a = C1011ag.m5519a(this.f3323c);
            i6 = Math.max(i6, a.left);
            i7 = Math.max(i7, a.right);
        }
        int max = Math.max(this.f3334n, (this.f3311C * 2) + i6 + i7);
        int max2 = Math.max(i5, i3);
        this.f3309A = max;
        this.f3310B = max2;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f3337q : this.f3338r;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f3344x.addMovement(motionEvent);
        switch (motionEvent.getActionMasked()) {
            case 0:
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (isEnabled() && m5313a(x, y)) {
                    this.f3340t = 1;
                    this.f3342v = x;
                    this.f3343w = y;
                    break;
                }
            case 1:
            case 3:
                if (this.f3340t != 2) {
                    this.f3340t = 0;
                    this.f3344x.clear();
                    break;
                } else {
                    m5315b(motionEvent);
                    super.onTouchEvent(motionEvent);
                    return true;
                }
            case 2:
                switch (this.f3340t) {
                    case 1:
                        float x2 = motionEvent.getX();
                        float y2 = motionEvent.getY();
                        if (Math.abs(x2 - this.f3342v) > ((float) this.f3341u) || Math.abs(y2 - this.f3343w) > ((float) this.f3341u)) {
                            this.f3340t = 2;
                            getParent().requestDisallowInterceptTouchEvent(true);
                            this.f3342v = x2;
                            this.f3343w = y2;
                            return true;
                        }
                    case 2:
                        float x3 = motionEvent.getX();
                        int thumbScrollRange = getThumbScrollRange();
                        float f = x3 - this.f3342v;
                        float f2 = thumbScrollRange != 0 ? f / ((float) thumbScrollRange) : f > 0.0f ? 1.0f : -1.0f;
                        if (C1094bs.m6004a(this)) {
                            f2 = -f2;
                        }
                        float a = m5306a(this.f3346z + f2, 0.0f, 1.0f);
                        if (a != this.f3346z) {
                            this.f3342v = x3;
                            setThumbPosition(a);
                        }
                        return true;
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setChecked(boolean z) {
        super.setChecked(z);
        boolean isChecked = isChecked();
        if (getWindowToken() == null || !C0626s.m2880w(this)) {
            m5316c();
            setThumbPosition(isChecked ? 1.0f : 0.0f);
            return;
        }
        m5312a(isChecked);
    }

    public void setShowText(boolean z) {
        if (this.f3339s != z) {
            this.f3339s = z;
            requestLayout();
        }
    }

    public void setSplitTrack(boolean z) {
        this.f3336p = z;
        invalidate();
    }

    public void setSwitchMinWidth(int i) {
        this.f3334n = i;
        requestLayout();
    }

    public void setSwitchPadding(int i) {
        this.f3335o = i;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.f3316H.getTypeface() != null && !this.f3316H.getTypeface().equals(typeface)) || (this.f3316H.getTypeface() == null && typeface != null)) {
            this.f3316H.setTypeface(typeface);
            requestLayout();
            invalidate();
        }
    }

    public void setTextOff(CharSequence charSequence) {
        this.f3338r = charSequence;
        requestLayout();
    }

    public void setTextOn(CharSequence charSequence) {
        this.f3337q = charSequence;
        requestLayout();
    }

    public void setThumbDrawable(Drawable drawable) {
        if (this.f3323c != null) {
            this.f3323c.setCallback(null);
        }
        this.f3323c = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    /* access modifiers changed from: 0000 */
    public void setThumbPosition(float f) {
        this.f3346z = f;
        invalidate();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(C0817b.m3884b(getContext(), i));
    }

    public void setThumbTextPadding(int i) {
        this.f3333m = i;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f3324d = colorStateList;
        this.f3326f = true;
        m5314b();
    }

    public void setThumbTintMode(Mode mode) {
        this.f3325e = mode;
        this.f3327g = true;
        m5314b();
    }

    public void setTrackDrawable(Drawable drawable) {
        if (this.f3328h != null) {
            this.f3328h.setCallback(null);
        }
        this.f3328h = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(C0817b.m3884b(getContext(), i));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f3329i = colorStateList;
        this.f3331k = true;
        m5309a();
    }

    public void setTrackTintMode(Mode mode) {
        this.f3330j = mode;
        this.f3332l = true;
        m5309a();
    }

    public void toggle() {
        setChecked(!isChecked());
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f3323c || drawable == this.f3328h;
    }
}
