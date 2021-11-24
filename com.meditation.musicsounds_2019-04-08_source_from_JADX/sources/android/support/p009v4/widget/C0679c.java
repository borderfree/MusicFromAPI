package android.support.p009v4.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build.VERSION;
import android.support.p009v4.view.C0626s;
import android.view.View;
import android.view.animation.Animation.AnimationListener;
import android.widget.ImageView;

/* renamed from: android.support.v4.widget.c */
class C0679c extends ImageView {

    /* renamed from: a */
    int f1983a;

    /* renamed from: b */
    private AnimationListener f1984b;

    /* renamed from: android.support.v4.widget.c$a */
    private class C0680a extends OvalShape {

        /* renamed from: b */
        private RadialGradient f1986b;

        /* renamed from: c */
        private Paint f1987c = new Paint();

        C0680a(int i) {
            C0679c.this.f1983a = i;
            m3208a((int) rect().width());
        }

        /* renamed from: a */
        private void m3208a(int i) {
            float f = (float) (i / 2);
            RadialGradient radialGradient = new RadialGradient(f, f, (float) C0679c.this.f1983a, new int[]{1023410176, 0}, null, TileMode.CLAMP);
            this.f1986b = radialGradient;
            this.f1987c.setShader(this.f1986b);
        }

        public void draw(Canvas canvas, Paint paint) {
            int width = C0679c.this.getWidth() / 2;
            float f = (float) width;
            float height = (float) (C0679c.this.getHeight() / 2);
            canvas.drawCircle(f, height, f, this.f1987c);
            canvas.drawCircle(f, height, (float) (width - C0679c.this.f1983a), paint);
        }

        /* access modifiers changed from: protected */
        public void onResize(float f, float f2) {
            super.onResize(f, f2);
            m3208a((int) f);
        }
    }

    C0679c(Context context, int i) {
        ShapeDrawable shapeDrawable;
        super(context);
        float f = getContext().getResources().getDisplayMetrics().density;
        int i2 = (int) (1.75f * f);
        int i3 = (int) (0.0f * f);
        this.f1983a = (int) (3.5f * f);
        if (m3206a()) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            C0626s.m2837a((View) this, f * 4.0f);
        } else {
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new C0680a(this.f1983a));
            setLayerType(1, shapeDrawable2.getPaint());
            shapeDrawable2.getPaint().setShadowLayer((float) this.f1983a, (float) i3, (float) i2, 503316480);
            int i4 = this.f1983a;
            setPadding(i4, i4, i4, i4);
            shapeDrawable = shapeDrawable2;
        }
        shapeDrawable.getPaint().setColor(i);
        C0626s.m2843a((View) this, (Drawable) shapeDrawable);
    }

    /* renamed from: a */
    private boolean m3206a() {
        return VERSION.SDK_INT >= 21;
    }

    /* renamed from: a */
    public void mo2803a(AnimationListener animationListener) {
        this.f1984b = animationListener;
    }

    public void onAnimationEnd() {
        super.onAnimationEnd();
        if (this.f1984b != null) {
            this.f1984b.onAnimationEnd(getAnimation());
        }
    }

    public void onAnimationStart() {
        super.onAnimationStart();
        if (this.f1984b != null) {
            this.f1984b.onAnimationStart(getAnimation());
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!m3206a()) {
            setMeasuredDimension(getMeasuredWidth() + (this.f1983a * 2), getMeasuredHeight() + (this.f1983a * 2));
        }
    }

    public void setBackgroundColor(int i) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i);
        }
    }
}
