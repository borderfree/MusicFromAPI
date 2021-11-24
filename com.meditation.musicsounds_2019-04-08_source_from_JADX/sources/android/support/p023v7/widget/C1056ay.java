package android.support.p023v7.widget;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import android.support.p023v7.p025b.C0810a.C0812b;
import android.support.p023v7.p025b.C0810a.C0813c;

/* renamed from: android.support.v7.widget.ay */
class C1056ay extends Drawable {

    /* renamed from: a */
    static C1057a f3652a;

    /* renamed from: b */
    private static final double f3653b = Math.cos(Math.toRadians(45.0d));

    /* renamed from: c */
    private final int f3654c;

    /* renamed from: d */
    private Paint f3655d;

    /* renamed from: e */
    private Paint f3656e;

    /* renamed from: f */
    private Paint f3657f;

    /* renamed from: g */
    private final RectF f3658g;

    /* renamed from: h */
    private float f3659h;

    /* renamed from: i */
    private Path f3660i;

    /* renamed from: j */
    private float f3661j;

    /* renamed from: k */
    private float f3662k;

    /* renamed from: l */
    private float f3663l;

    /* renamed from: m */
    private ColorStateList f3664m;

    /* renamed from: n */
    private boolean f3665n = true;

    /* renamed from: o */
    private final int f3666o;

    /* renamed from: p */
    private final int f3667p;

    /* renamed from: q */
    private boolean f3668q = true;

    /* renamed from: r */
    private boolean f3669r = false;

    /* renamed from: android.support.v7.widget.ay$a */
    interface C1057a {
        /* renamed from: a */
        void mo5281a(Canvas canvas, RectF rectF, float f, Paint paint);
    }

    C1056ay(Resources resources, ColorStateList colorStateList, float f, float f2, float f3) {
        this.f3666o = resources.getColor(C0812b.cardview_shadow_start_color);
        this.f3667p = resources.getColor(C0812b.cardview_shadow_end_color);
        this.f3654c = resources.getDimensionPixelSize(C0813c.cardview_compat_inset_shadow);
        this.f3655d = new Paint(5);
        m5767b(colorStateList);
        this.f3656e = new Paint(5);
        this.f3656e.setStyle(Style.FILL);
        this.f3659h = (float) ((int) (f + 0.5f));
        this.f3658g = new RectF();
        this.f3657f = new Paint(this.f3656e);
        this.f3657f.setAntiAlias(false);
        m5764a(f2, f3);
    }

    /* renamed from: a */
    static float m5763a(float f, float f2, boolean z) {
        if (!z) {
            return f * 1.5f;
        }
        double d = (double) (f * 1.5f);
        double d2 = 1.0d - f3653b;
        double d3 = (double) f2;
        Double.isNaN(d3);
        double d4 = d2 * d3;
        Double.isNaN(d);
        return (float) (d + d4);
    }

    /* renamed from: a */
    private void m5764a(float f, float f2) {
        if (f < 0.0f) {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid shadow size ");
            sb.append(f);
            sb.append(". Must be >= 0");
            throw new IllegalArgumentException(sb.toString());
        } else if (f2 >= 0.0f) {
            float d = (float) m5769d(f);
            float d2 = (float) m5769d(f2);
            if (d > d2) {
                if (!this.f3669r) {
                    this.f3669r = true;
                }
                d = d2;
            }
            if (this.f3663l != d || this.f3661j != d2) {
                this.f3663l = d;
                this.f3661j = d2;
                this.f3662k = (float) ((int) ((d * 1.5f) + ((float) this.f3654c) + 0.5f));
                this.f3665n = true;
                invalidateSelf();
            }
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Invalid max shadow size ");
            sb2.append(f2);
            sb2.append(". Must be >= 0");
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    /* renamed from: a */
    private void m5765a(Canvas canvas) {
        float f = (-this.f3659h) - this.f3662k;
        float f2 = this.f3659h + ((float) this.f3654c) + (this.f3663l / 2.0f);
        float f3 = f2 * 2.0f;
        boolean z = this.f3658g.width() - f3 > 0.0f;
        boolean z2 = this.f3658g.height() - f3 > 0.0f;
        int save = canvas.save();
        canvas.translate(this.f3658g.left + f2, this.f3658g.top + f2);
        canvas.drawPath(this.f3660i, this.f3656e);
        if (z) {
            canvas.drawRect(0.0f, f, this.f3658g.width() - f3, -this.f3659h, this.f3657f);
        }
        canvas.restoreToCount(save);
        int save2 = canvas.save();
        canvas.translate(this.f3658g.right - f2, this.f3658g.bottom - f2);
        canvas.rotate(180.0f);
        canvas.drawPath(this.f3660i, this.f3656e);
        if (z) {
            canvas.drawRect(0.0f, f, this.f3658g.width() - f3, (-this.f3659h) + this.f3662k, this.f3657f);
        }
        canvas.restoreToCount(save2);
        int save3 = canvas.save();
        canvas.translate(this.f3658g.left + f2, this.f3658g.bottom - f2);
        canvas.rotate(270.0f);
        canvas.drawPath(this.f3660i, this.f3656e);
        if (z2) {
            canvas.drawRect(0.0f, f, this.f3658g.height() - f3, -this.f3659h, this.f3657f);
        }
        canvas.restoreToCount(save3);
        int save4 = canvas.save();
        canvas.translate(this.f3658g.right - f2, this.f3658g.top + f2);
        canvas.rotate(90.0f);
        canvas.drawPath(this.f3660i, this.f3656e);
        if (z2) {
            canvas.drawRect(0.0f, f, this.f3658g.height() - f3, -this.f3659h, this.f3657f);
        }
        canvas.restoreToCount(save4);
    }

    /* renamed from: b */
    static float m5766b(float f, float f2, boolean z) {
        if (!z) {
            return f;
        }
        double d = (double) f;
        double d2 = 1.0d - f3653b;
        double d3 = (double) f2;
        Double.isNaN(d3);
        double d4 = d2 * d3;
        Double.isNaN(d);
        return (float) (d + d4);
    }

    /* renamed from: b */
    private void m5767b(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f3664m = colorStateList;
        this.f3655d.setColor(this.f3664m.getColorForState(getState(), this.f3664m.getDefaultColor()));
    }

    /* renamed from: b */
    private void m5768b(Rect rect) {
        float f = this.f3661j * 1.5f;
        this.f3658g.set(((float) rect.left) + this.f3661j, ((float) rect.top) + f, ((float) rect.right) - this.f3661j, ((float) rect.bottom) - f);
        m5770g();
    }

    /* renamed from: d */
    private int m5769d(float f) {
        int i = (int) (f + 0.5f);
        return i % 2 == 1 ? i - 1 : i;
    }

    /* renamed from: g */
    private void m5770g() {
        RectF rectF = new RectF(-this.f3659h, -this.f3659h, this.f3659h, this.f3659h);
        RectF rectF2 = new RectF(rectF);
        rectF2.inset(-this.f3662k, -this.f3662k);
        if (this.f3660i == null) {
            this.f3660i = new Path();
        } else {
            this.f3660i.reset();
        }
        this.f3660i.setFillType(FillType.EVEN_ODD);
        this.f3660i.moveTo(-this.f3659h, 0.0f);
        this.f3660i.rLineTo(-this.f3662k, 0.0f);
        this.f3660i.arcTo(rectF2, 180.0f, 90.0f, false);
        this.f3660i.arcTo(rectF, 270.0f, -90.0f, false);
        this.f3660i.close();
        float f = this.f3659h / (this.f3659h + this.f3662k);
        Paint paint = this.f3656e;
        RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, this.f3659h + this.f3662k, new int[]{this.f3666o, this.f3666o, this.f3667p}, new float[]{0.0f, f, 1.0f}, TileMode.CLAMP);
        paint.setShader(radialGradient);
        Paint paint2 = this.f3657f;
        LinearGradient linearGradient = new LinearGradient(0.0f, (-this.f3659h) + this.f3662k, 0.0f, (-this.f3659h) - this.f3662k, new int[]{this.f3666o, this.f3666o, this.f3667p}, new float[]{0.0f, 0.5f, 1.0f}, TileMode.CLAMP);
        paint2.setShader(linearGradient);
        this.f3657f.setAntiAlias(false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public float mo5261a() {
        return this.f3659h;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5262a(float f) {
        if (f >= 0.0f) {
            float f2 = (float) ((int) (f + 0.5f));
            if (this.f3659h != f2) {
                this.f3659h = f2;
                this.f3665n = true;
                invalidateSelf();
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid radius ");
        sb.append(f);
        sb.append(". Must be >= 0");
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5263a(ColorStateList colorStateList) {
        m5767b(colorStateList);
        invalidateSelf();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5264a(Rect rect) {
        getPadding(rect);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5265a(boolean z) {
        this.f3668q = z;
        invalidateSelf();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public float mo5266b() {
        return this.f3663l;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo5267b(float f) {
        m5764a(f, this.f3661j);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public float mo5268c() {
        return this.f3661j;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo5269c(float f) {
        m5764a(this.f3663l, f);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public float mo5270d() {
        return (Math.max(this.f3661j, this.f3659h + ((float) this.f3654c) + (this.f3661j / 2.0f)) * 2.0f) + ((this.f3661j + ((float) this.f3654c)) * 2.0f);
    }

    public void draw(Canvas canvas) {
        if (this.f3665n) {
            m5768b(getBounds());
            this.f3665n = false;
        }
        canvas.translate(0.0f, this.f3663l / 2.0f);
        m5765a(canvas);
        canvas.translate(0.0f, (-this.f3663l) / 2.0f);
        f3652a.mo5281a(canvas, this.f3658g, this.f3659h, this.f3655d);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public float mo5272e() {
        return (Math.max(this.f3661j, this.f3659h + ((float) this.f3654c) + ((this.f3661j * 1.5f) / 2.0f)) * 2.0f) + (((this.f3661j * 1.5f) + ((float) this.f3654c)) * 2.0f);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public ColorStateList mo5273f() {
        return this.f3664m;
    }

    public int getOpacity() {
        return -3;
    }

    public boolean getPadding(Rect rect) {
        int ceil = (int) Math.ceil((double) m5763a(this.f3661j, this.f3659h, this.f3668q));
        int ceil2 = (int) Math.ceil((double) m5766b(this.f3661j, this.f3659h, this.f3668q));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    public boolean isStateful() {
        return (this.f3664m != null && this.f3664m.isStateful()) || super.isStateful();
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f3665n = true;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        int colorForState = this.f3664m.getColorForState(iArr, this.f3664m.getDefaultColor());
        if (this.f3655d.getColor() == colorForState) {
            return false;
        }
        this.f3655d.setColor(colorForState);
        this.f3665n = true;
        invalidateSelf();
        return true;
    }

    public void setAlpha(int i) {
        this.f3655d.setAlpha(i);
        this.f3656e.setAlpha(i);
        this.f3657f.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f3655d.setColorFilter(colorFilter);
    }
}
