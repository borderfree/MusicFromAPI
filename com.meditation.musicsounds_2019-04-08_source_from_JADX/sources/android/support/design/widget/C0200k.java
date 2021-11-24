package android.support.design.widget;

import android.content.Context;
import android.graphics.Canvas;
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
import android.support.design.C0087a.C0090c;
import android.support.p009v4.content.C0452b;
import android.support.p023v7.p028d.p029a.C0820a;

/* renamed from: android.support.design.widget.k */
class C0200k extends C0820a {

    /* renamed from: a */
    static final double f622a = Math.cos(Math.toRadians(45.0d));

    /* renamed from: b */
    final Paint f623b;

    /* renamed from: c */
    final Paint f624c;

    /* renamed from: d */
    final RectF f625d;

    /* renamed from: e */
    float f626e;

    /* renamed from: f */
    Path f627f;

    /* renamed from: g */
    float f628g;

    /* renamed from: h */
    float f629h;

    /* renamed from: i */
    float f630i;

    /* renamed from: j */
    float f631j;

    /* renamed from: k */
    private boolean f632k = true;

    /* renamed from: l */
    private final int f633l;

    /* renamed from: m */
    private final int f634m;

    /* renamed from: n */
    private final int f635n;

    /* renamed from: o */
    private boolean f636o = true;

    /* renamed from: p */
    private float f637p;

    /* renamed from: q */
    private boolean f638q = false;

    public C0200k(Context context, Drawable drawable, float f, float f2, float f3) {
        super(drawable);
        this.f633l = C0452b.m2068c(context, C0090c.design_fab_shadow_start_color);
        this.f634m = C0452b.m2068c(context, C0090c.design_fab_shadow_mid_color);
        this.f635n = C0452b.m2068c(context, C0090c.design_fab_shadow_end_color);
        this.f623b = new Paint(5);
        this.f623b.setStyle(Style.FILL);
        this.f626e = (float) Math.round(f);
        this.f625d = new RectF();
        this.f624c = new Paint(this.f623b);
        this.f624c.setAntiAlias(false);
        mo923a(f2, f3);
    }

    /* renamed from: a */
    public static float m795a(float f, float f2, boolean z) {
        if (!z) {
            return f * 1.5f;
        }
        double d = (double) (f * 1.5f);
        double d2 = 1.0d - f622a;
        double d3 = (double) f2;
        Double.isNaN(d3);
        double d4 = d2 * d3;
        Double.isNaN(d);
        return (float) (d + d4);
    }

    /* renamed from: a */
    private void m796a(Canvas canvas) {
        int i;
        float f;
        int i2;
        float f2;
        float f3;
        float f4;
        Canvas canvas2 = canvas;
        int save = canvas.save();
        canvas2.rotate(this.f637p, this.f625d.centerX(), this.f625d.centerY());
        float f5 = (-this.f626e) - this.f630i;
        float f6 = this.f626e;
        float f7 = f6 * 2.0f;
        boolean z = this.f625d.width() - f7 > 0.0f;
        boolean z2 = this.f625d.height() - f7 > 0.0f;
        float f8 = f6 / ((this.f631j - (this.f631j * 0.5f)) + f6);
        float f9 = f6 / ((this.f631j - (this.f631j * 0.25f)) + f6);
        float f10 = f6 / ((this.f631j - (this.f631j * 1.0f)) + f6);
        int save2 = canvas.save();
        canvas2.translate(this.f625d.left + f6, this.f625d.top + f6);
        canvas2.scale(f8, f9);
        canvas2.drawPath(this.f627f, this.f623b);
        if (z) {
            canvas2.scale(1.0f / f8, 1.0f);
            i2 = save2;
            f = f10;
            i = save;
            f2 = f9;
            canvas.drawRect(0.0f, f5, this.f625d.width() - f7, -this.f626e, this.f624c);
        } else {
            i2 = save2;
            f = f10;
            i = save;
            f2 = f9;
        }
        canvas2.restoreToCount(i2);
        int save3 = canvas.save();
        canvas2.translate(this.f625d.right - f6, this.f625d.bottom - f6);
        float f11 = f;
        canvas2.scale(f8, f11);
        canvas2.rotate(180.0f);
        canvas2.drawPath(this.f627f, this.f623b);
        if (z) {
            canvas2.scale(1.0f / f8, 1.0f);
            f3 = f2;
            f4 = f11;
            canvas.drawRect(0.0f, f5, this.f625d.width() - f7, (-this.f626e) + this.f630i, this.f624c);
        } else {
            f3 = f2;
            f4 = f11;
        }
        canvas2.restoreToCount(save3);
        int save4 = canvas.save();
        canvas2.translate(this.f625d.left + f6, this.f625d.bottom - f6);
        canvas2.scale(f8, f4);
        canvas2.rotate(270.0f);
        canvas2.drawPath(this.f627f, this.f623b);
        if (z2) {
            canvas2.scale(1.0f / f4, 1.0f);
            canvas.drawRect(0.0f, f5, this.f625d.height() - f7, -this.f626e, this.f624c);
        }
        canvas2.restoreToCount(save4);
        int save5 = canvas.save();
        canvas2.translate(this.f625d.right - f6, this.f625d.top + f6);
        float f12 = f3;
        canvas2.scale(f8, f12);
        canvas2.rotate(90.0f);
        canvas2.drawPath(this.f627f, this.f623b);
        if (z2) {
            canvas2.scale(1.0f / f12, 1.0f);
            canvas.drawRect(0.0f, f5, this.f625d.height() - f7, -this.f626e, this.f624c);
        }
        canvas2.restoreToCount(save5);
        canvas2.restoreToCount(i);
    }

    /* renamed from: a */
    private void m797a(Rect rect) {
        float f = this.f629h * 1.5f;
        this.f625d.set(((float) rect.left) + this.f629h, ((float) rect.top) + f, ((float) rect.right) - this.f629h, ((float) rect.bottom) - f);
        mo3236b().setBounds((int) this.f625d.left, (int) this.f625d.top, (int) this.f625d.right, (int) this.f625d.bottom);
        m800c();
    }

    /* renamed from: b */
    public static float m798b(float f, float f2, boolean z) {
        if (!z) {
            return f;
        }
        double d = (double) f;
        double d2 = 1.0d - f622a;
        double d3 = (double) f2;
        Double.isNaN(d3);
        double d4 = d2 * d3;
        Double.isNaN(d);
        return (float) (d + d4);
    }

    /* renamed from: c */
    private static int m799c(float f) {
        int round = Math.round(f);
        return round % 2 == 1 ? round - 1 : round;
    }

    /* renamed from: c */
    private void m800c() {
        RectF rectF = new RectF(-this.f626e, -this.f626e, this.f626e, this.f626e);
        RectF rectF2 = new RectF(rectF);
        rectF2.inset(-this.f630i, -this.f630i);
        if (this.f627f == null) {
            this.f627f = new Path();
        } else {
            this.f627f.reset();
        }
        this.f627f.setFillType(FillType.EVEN_ODD);
        this.f627f.moveTo(-this.f626e, 0.0f);
        this.f627f.rLineTo(-this.f630i, 0.0f);
        this.f627f.arcTo(rectF2, 180.0f, 90.0f, false);
        this.f627f.arcTo(rectF, 270.0f, -90.0f, false);
        this.f627f.close();
        float f = -rectF2.top;
        if (f > 0.0f) {
            float f2 = this.f626e / f;
            float f3 = ((1.0f - f2) / 2.0f) + f2;
            Paint paint = this.f623b;
            RadialGradient radialGradient = r8;
            RadialGradient radialGradient2 = new RadialGradient(0.0f, 0.0f, f, new int[]{0, this.f633l, this.f634m, this.f635n}, new float[]{0.0f, f2, f3, 1.0f}, TileMode.CLAMP);
            paint.setShader(radialGradient);
        }
        Paint paint2 = this.f624c;
        LinearGradient linearGradient = new LinearGradient(0.0f, rectF.top, 0.0f, rectF2.top, new int[]{this.f633l, this.f634m, this.f635n}, new float[]{0.0f, 0.5f, 1.0f}, TileMode.CLAMP);
        paint2.setShader(linearGradient);
        this.f624c.setAntiAlias(false);
    }

    /* renamed from: a */
    public float mo921a() {
        return this.f631j;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo922a(float f) {
        if (this.f637p != f) {
            this.f637p = f;
            invalidateSelf();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo923a(float f, float f2) {
        if (f < 0.0f || f2 < 0.0f) {
            throw new IllegalArgumentException("invalid shadow size");
        }
        float c = (float) m799c(f);
        float c2 = (float) m799c(f2);
        if (c > c2) {
            if (!this.f638q) {
                this.f638q = true;
            }
            c = c2;
        }
        if (this.f631j != c || this.f629h != c2) {
            this.f631j = c;
            this.f629h = c2;
            this.f630i = (float) Math.round(c * 1.5f);
            this.f628g = c2;
            this.f632k = true;
            invalidateSelf();
        }
    }

    /* renamed from: a */
    public void mo924a(boolean z) {
        this.f636o = z;
        invalidateSelf();
    }

    /* renamed from: b */
    public void mo925b(float f) {
        mo923a(f, this.f629h);
    }

    public void draw(Canvas canvas) {
        if (this.f632k) {
            m797a(getBounds());
            this.f632k = false;
        }
        m796a(canvas);
        super.draw(canvas);
    }

    public int getOpacity() {
        return -3;
    }

    public boolean getPadding(Rect rect) {
        int ceil = (int) Math.ceil((double) m795a(this.f629h, this.f626e, this.f636o));
        int ceil2 = (int) Math.ceil((double) m798b(this.f629h, this.f626e, this.f636o));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.f632k = true;
    }

    public void setAlpha(int i) {
        super.setAlpha(i);
        this.f623b.setAlpha(i);
        this.f624c.setAlpha(i);
    }
}
