package android.support.design.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import android.support.p009v4.p010a.C0310a;

/* renamed from: android.support.design.widget.c */
class C0182c extends Drawable {

    /* renamed from: a */
    final Paint f513a = new Paint(1);

    /* renamed from: b */
    final Rect f514b = new Rect();

    /* renamed from: c */
    final RectF f515c = new RectF();

    /* renamed from: d */
    float f516d;

    /* renamed from: e */
    private int f517e;

    /* renamed from: f */
    private int f518f;

    /* renamed from: g */
    private int f519g;

    /* renamed from: h */
    private int f520h;

    /* renamed from: i */
    private ColorStateList f521i;

    /* renamed from: j */
    private int f522j;

    /* renamed from: k */
    private boolean f523k = true;

    /* renamed from: l */
    private float f524l;

    public C0182c() {
        this.f513a.setStyle(Style.STROKE);
    }

    /* renamed from: a */
    private Shader m676a() {
        Rect rect = this.f514b;
        copyBounds(rect);
        float height = this.f516d / ((float) rect.height());
        LinearGradient linearGradient = new LinearGradient(0.0f, (float) rect.top, 0.0f, (float) rect.bottom, new int[]{C0310a.m1166a(this.f517e, this.f522j), C0310a.m1166a(this.f518f, this.f522j), C0310a.m1166a(C0310a.m1169b(this.f518f, 0), this.f522j), C0310a.m1166a(C0310a.m1169b(this.f520h, 0), this.f522j), C0310a.m1166a(this.f520h, this.f522j), C0310a.m1166a(this.f519g, this.f522j)}, new float[]{0.0f, height, 0.5f, 0.5f, 1.0f - height, 1.0f}, TileMode.CLAMP);
        return linearGradient;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo839a(float f) {
        if (this.f516d != f) {
            this.f516d = f;
            this.f513a.setStrokeWidth(f * 1.3333f);
            this.f523k = true;
            invalidateSelf();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo840a(int i, int i2, int i3, int i4) {
        this.f517e = i;
        this.f518f = i2;
        this.f519g = i3;
        this.f520h = i4;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo841a(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f522j = colorStateList.getColorForState(getState(), this.f522j);
        }
        this.f521i = colorStateList;
        this.f523k = true;
        invalidateSelf();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo842b(float f) {
        if (f != this.f524l) {
            this.f524l = f;
            invalidateSelf();
        }
    }

    public void draw(Canvas canvas) {
        if (this.f523k) {
            this.f513a.setShader(m676a());
            this.f523k = false;
        }
        float strokeWidth = this.f513a.getStrokeWidth() / 2.0f;
        RectF rectF = this.f515c;
        copyBounds(this.f514b);
        rectF.set(this.f514b);
        rectF.left += strokeWidth;
        rectF.top += strokeWidth;
        rectF.right -= strokeWidth;
        rectF.bottom -= strokeWidth;
        canvas.save();
        canvas.rotate(this.f524l, rectF.centerX(), rectF.centerY());
        canvas.drawOval(rectF, this.f513a);
        canvas.restore();
    }

    public int getOpacity() {
        return this.f516d > 0.0f ? -3 : -2;
    }

    public boolean getPadding(Rect rect) {
        int round = Math.round(this.f516d);
        rect.set(round, round, round, round);
        return true;
    }

    public boolean isStateful() {
        return (this.f521i != null && this.f521i.isStateful()) || super.isStateful();
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.f523k = true;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        if (this.f521i != null) {
            int colorForState = this.f521i.getColorForState(iArr, this.f522j);
            if (colorForState != this.f522j) {
                this.f523k = true;
                this.f522j = colorForState;
            }
        }
        if (this.f523k) {
            invalidateSelf();
        }
        return this.f523k;
    }

    public void setAlpha(int i) {
        this.f513a.setAlpha(i);
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f513a.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
