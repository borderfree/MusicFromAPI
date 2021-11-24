package android.support.p009v4.widget;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.support.p009v4.p019g.C0509l;
import android.support.p009v4.view.p022b.C0596b;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

/* renamed from: android.support.v4.widget.d */
public class C0681d extends Drawable implements Animatable {

    /* renamed from: a */
    private static final Interpolator f1988a = new LinearInterpolator();

    /* renamed from: b */
    private static final Interpolator f1989b = new C0596b();

    /* renamed from: c */
    private static final int[] f1990c = {-16777216};

    /* renamed from: d */
    private final C0684a f1991d = new C0684a();

    /* renamed from: e */
    private float f1992e;

    /* renamed from: f */
    private Resources f1993f;

    /* renamed from: g */
    private Animator f1994g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public float f1995h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public boolean f1996i;

    /* renamed from: android.support.v4.widget.d$a */
    private static class C0684a {

        /* renamed from: a */
        final RectF f2001a = new RectF();

        /* renamed from: b */
        final Paint f2002b = new Paint();

        /* renamed from: c */
        final Paint f2003c = new Paint();

        /* renamed from: d */
        final Paint f2004d = new Paint();

        /* renamed from: e */
        float f2005e = 0.0f;

        /* renamed from: f */
        float f2006f = 0.0f;

        /* renamed from: g */
        float f2007g = 0.0f;

        /* renamed from: h */
        float f2008h = 5.0f;

        /* renamed from: i */
        int[] f2009i;

        /* renamed from: j */
        int f2010j;

        /* renamed from: k */
        float f2011k;

        /* renamed from: l */
        float f2012l;

        /* renamed from: m */
        float f2013m;

        /* renamed from: n */
        boolean f2014n;

        /* renamed from: o */
        Path f2015o;

        /* renamed from: p */
        float f2016p = 1.0f;

        /* renamed from: q */
        float f2017q;

        /* renamed from: r */
        int f2018r;

        /* renamed from: s */
        int f2019s;

        /* renamed from: t */
        int f2020t = 255;

        /* renamed from: u */
        int f2021u;

        C0684a() {
            this.f2002b.setStrokeCap(Cap.SQUARE);
            this.f2002b.setAntiAlias(true);
            this.f2002b.setStyle(Style.STROKE);
            this.f2003c.setStyle(Style.FILL);
            this.f2003c.setAntiAlias(true);
            this.f2004d.setColor(0);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo2830a() {
            return this.f2009i[mo2839b()];
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo2831a(float f) {
            this.f2008h = f;
            this.f2002b.setStrokeWidth(f);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo2832a(float f, float f2) {
            this.f2018r = (int) f;
            this.f2019s = (int) f2;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo2833a(int i) {
            this.f2021u = i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo2834a(Canvas canvas, float f, float f2, RectF rectF) {
            if (this.f2014n) {
                if (this.f2015o == null) {
                    this.f2015o = new Path();
                    this.f2015o.setFillType(FillType.EVEN_ODD);
                } else {
                    this.f2015o.reset();
                }
                float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
                float f3 = (((float) this.f2018r) * this.f2016p) / 2.0f;
                this.f2015o.moveTo(0.0f, 0.0f);
                this.f2015o.lineTo(((float) this.f2018r) * this.f2016p, 0.0f);
                this.f2015o.lineTo((((float) this.f2018r) * this.f2016p) / 2.0f, ((float) this.f2019s) * this.f2016p);
                this.f2015o.offset((min + rectF.centerX()) - f3, rectF.centerY() + (this.f2008h / 2.0f));
                this.f2015o.close();
                this.f2003c.setColor(this.f2021u);
                this.f2003c.setAlpha(this.f2020t);
                canvas.save();
                canvas.rotate(f + f2, rectF.centerX(), rectF.centerY());
                canvas.drawPath(this.f2015o, this.f2003c);
                canvas.restore();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo2835a(Canvas canvas, Rect rect) {
            RectF rectF = this.f2001a;
            float f = this.f2017q + (this.f2008h / 2.0f);
            if (this.f2017q <= 0.0f) {
                f = (((float) Math.min(rect.width(), rect.height())) / 2.0f) - Math.max((((float) this.f2018r) * this.f2016p) / 2.0f, this.f2008h / 2.0f);
            }
            rectF.set(((float) rect.centerX()) - f, ((float) rect.centerY()) - f, ((float) rect.centerX()) + f, ((float) rect.centerY()) + f);
            float f2 = (this.f2005e + this.f2007g) * 360.0f;
            float f3 = ((this.f2006f + this.f2007g) * 360.0f) - f2;
            this.f2002b.setColor(this.f2021u);
            this.f2002b.setAlpha(this.f2020t);
            float f4 = this.f2008h / 2.0f;
            rectF.inset(f4, f4);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f2004d);
            float f5 = -f4;
            rectF.inset(f5, f5);
            canvas.drawArc(rectF, f2, f3, false, this.f2002b);
            mo2834a(canvas, f2, f3, rectF);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo2836a(ColorFilter colorFilter) {
            this.f2002b.setColorFilter(colorFilter);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo2837a(boolean z) {
            if (this.f2014n != z) {
                this.f2014n = z;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo2838a(int[] iArr) {
            this.f2009i = iArr;
            mo2841b(0);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public int mo2839b() {
            return (this.f2010j + 1) % this.f2009i.length;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo2840b(float f) {
            this.f2005e = f;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo2841b(int i) {
            this.f2010j = i;
            this.f2021u = this.f2009i[this.f2010j];
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo2842c() {
            mo2841b(mo2839b());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo2843c(float f) {
            this.f2006f = f;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo2844c(int i) {
            this.f2020t = i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public int mo2845d() {
            return this.f2020t;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo2846d(float f) {
            this.f2007g = f;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public float mo2847e() {
            return this.f2005e;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo2848e(float f) {
            this.f2017q = f;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public float mo2849f() {
            return this.f2011k;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public void mo2850f(float f) {
            if (f != this.f2016p) {
                this.f2016p = f;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: g */
        public float mo2851g() {
            return this.f2012l;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: h */
        public int mo2852h() {
            return this.f2009i[this.f2010j];
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: i */
        public float mo2853i() {
            return this.f2006f;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: j */
        public float mo2854j() {
            return this.f2013m;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: k */
        public void mo2855k() {
            this.f2011k = this.f2005e;
            this.f2012l = this.f2006f;
            this.f2013m = this.f2007g;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: l */
        public void mo2856l() {
            this.f2011k = 0.0f;
            this.f2012l = 0.0f;
            this.f2013m = 0.0f;
            mo2840b(0.0f);
            mo2843c(0.0f);
            mo2846d(0.0f);
        }
    }

    public C0681d(Context context) {
        this.f1993f = ((Context) C0509l.m2252a(context)).getResources();
        this.f1991d.mo2838a(f1990c);
        mo2810a(2.5f);
        m3211a();
    }

    /* renamed from: a */
    private int m3210a(float f, int i, int i2) {
        int i3 = (i >> 24) & 255;
        int i4 = (i >> 16) & 255;
        int i5 = (i >> 8) & 255;
        int i6 = i & 255;
        return ((i3 + ((int) (((float) (((i2 >> 24) & 255) - i3)) * f))) << 24) | ((i4 + ((int) (((float) (((i2 >> 16) & 255) - i4)) * f))) << 16) | ((i5 + ((int) (((float) (((i2 >> 8) & 255) - i5)) * f))) << 8) | (i6 + ((int) (f * ((float) ((i2 & 255) - i6)))));
    }

    /* renamed from: a */
    private void m3211a() {
        final C0684a aVar = this.f1991d;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.addUpdateListener(new AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                C0681d.this.m3213a(floatValue, aVar);
                C0681d.this.m3214a(floatValue, aVar, false);
                C0681d.this.invalidateSelf();
            }
        });
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(f1988a);
        ofFloat.addListener(new AnimatorListener() {
            public void onAnimationCancel(Animator animator) {
            }

            public void onAnimationEnd(Animator animator) {
            }

            public void onAnimationRepeat(Animator animator) {
                C0681d.this.m3214a(1.0f, aVar, true);
                aVar.mo2855k();
                aVar.mo2842c();
                if (C0681d.this.f1996i) {
                    C0681d.this.f1996i = false;
                    animator.cancel();
                    animator.setDuration(1332);
                    animator.start();
                    aVar.mo2837a(false);
                    return;
                }
                C0681d.this.f1995h = C0681d.this.f1995h + 1.0f;
            }

            public void onAnimationStart(Animator animator) {
                C0681d.this.f1995h = 0.0f;
            }
        });
        this.f1994g = ofFloat;
    }

    /* renamed from: a */
    private void m3212a(float f, float f2, float f3, float f4) {
        C0684a aVar = this.f1991d;
        float f5 = this.f1993f.getDisplayMetrics().density;
        aVar.mo2831a(f2 * f5);
        aVar.mo2848e(f * f5);
        aVar.mo2841b(0);
        aVar.mo2832a(f3 * f5, f4 * f5);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m3213a(float f, C0684a aVar) {
        aVar.mo2833a(f > 0.75f ? m3210a((f - 0.75f) / 0.25f, aVar.mo2852h(), aVar.mo2830a()) : aVar.mo2852h());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m3214a(float f, C0684a aVar, boolean z) {
        float f2;
        float f3;
        if (this.f1996i) {
            m3220b(f, aVar);
        } else if (f != 1.0f || z) {
            float j = aVar.mo2854j();
            if (f < 0.5f) {
                float f4 = f / 0.5f;
                float f5 = aVar.mo2849f();
                float f6 = f5;
                f2 = (f1989b.getInterpolation(f4) * 0.79f) + 0.01f + f5;
                f3 = f6;
            } else {
                f2 = aVar.mo2849f() + 0.79f;
                f3 = f2 - (((1.0f - f1989b.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
            }
            float f7 = j + (0.20999998f * f);
            float f8 = (f + this.f1995h) * 216.0f;
            aVar.mo2840b(f3);
            aVar.mo2843c(f2);
            aVar.mo2846d(f7);
            m3221d(f8);
        }
    }

    /* renamed from: b */
    private void m3220b(float f, C0684a aVar) {
        m3213a(f, aVar);
        float floor = (float) (Math.floor((double) (aVar.mo2854j() / 0.8f)) + 1.0d);
        aVar.mo2840b(aVar.mo2849f() + (((aVar.mo2851g() - 0.01f) - aVar.mo2849f()) * f));
        aVar.mo2843c(aVar.mo2851g());
        aVar.mo2846d(aVar.mo2854j() + ((floor - aVar.mo2854j()) * f));
    }

    /* renamed from: d */
    private void m3221d(float f) {
        this.f1992e = f;
    }

    /* renamed from: a */
    public void mo2810a(float f) {
        this.f1991d.mo2831a(f);
        invalidateSelf();
    }

    /* renamed from: a */
    public void mo2811a(float f, float f2) {
        this.f1991d.mo2840b(f);
        this.f1991d.mo2843c(f2);
        invalidateSelf();
    }

    /* renamed from: a */
    public void mo2812a(int i) {
        float f;
        float f2;
        float f3;
        float f4;
        if (i == 0) {
            f = 11.0f;
            f2 = 3.0f;
            f3 = 12.0f;
            f4 = 6.0f;
        } else {
            f = 7.5f;
            f2 = 2.5f;
            f3 = 10.0f;
            f4 = 5.0f;
        }
        m3212a(f, f2, f3, f4);
        invalidateSelf();
    }

    /* renamed from: a */
    public void mo2813a(boolean z) {
        this.f1991d.mo2837a(z);
        invalidateSelf();
    }

    /* renamed from: a */
    public void mo2814a(int... iArr) {
        this.f1991d.mo2838a(iArr);
        this.f1991d.mo2841b(0);
        invalidateSelf();
    }

    /* renamed from: b */
    public void mo2815b(float f) {
        this.f1991d.mo2850f(f);
        invalidateSelf();
    }

    /* renamed from: c */
    public void mo2816c(float f) {
        this.f1991d.mo2846d(f);
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f1992e, bounds.exactCenterX(), bounds.exactCenterY());
        this.f1991d.mo2835a(canvas, bounds);
        canvas.restore();
    }

    public int getAlpha() {
        return this.f1991d.mo2845d();
    }

    public int getOpacity() {
        return -3;
    }

    public boolean isRunning() {
        return this.f1994g.isRunning();
    }

    public void setAlpha(int i) {
        this.f1991d.mo2844c(i);
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f1991d.mo2836a(colorFilter);
        invalidateSelf();
    }

    public void start() {
        Animator animator;
        long j;
        this.f1994g.cancel();
        this.f1991d.mo2855k();
        if (this.f1991d.mo2853i() != this.f1991d.mo2847e()) {
            this.f1996i = true;
            animator = this.f1994g;
            j = 666;
        } else {
            this.f1991d.mo2841b(0);
            this.f1991d.mo2856l();
            animator = this.f1994g;
            j = 1332;
        }
        animator.setDuration(j);
        this.f1994g.start();
    }

    public void stop() {
        this.f1994g.cancel();
        m3221d(0.0f);
        this.f1991d.mo2837a(false);
        this.f1991d.mo2841b(0);
        this.f1991d.mo2856l();
        invalidateSelf();
    }
}
