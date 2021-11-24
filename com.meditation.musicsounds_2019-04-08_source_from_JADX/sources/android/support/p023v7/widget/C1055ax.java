package android.support.p023v7.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: android.support.v7.widget.ax */
class C1055ax extends Drawable {

    /* renamed from: a */
    private float f3641a;

    /* renamed from: b */
    private final Paint f3642b;

    /* renamed from: c */
    private final RectF f3643c;

    /* renamed from: d */
    private final Rect f3644d;

    /* renamed from: e */
    private float f3645e;

    /* renamed from: f */
    private boolean f3646f = false;

    /* renamed from: g */
    private boolean f3647g = true;

    /* renamed from: h */
    private ColorStateList f3648h;

    /* renamed from: i */
    private PorterDuffColorFilter f3649i;

    /* renamed from: j */
    private ColorStateList f3650j;

    /* renamed from: k */
    private Mode f3651k = Mode.SRC_IN;

    C1055ax(ColorStateList colorStateList, float f) {
        this.f3641a = f;
        this.f3642b = new Paint(5);
        m5756b(colorStateList);
        this.f3643c = new RectF();
        this.f3644d = new Rect();
    }

    /* renamed from: a */
    private PorterDuffColorFilter m5754a(ColorStateList colorStateList, Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    /* renamed from: a */
    private void m5755a(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f3643c.set((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
        this.f3644d.set(rect);
        if (this.f3646f) {
            float a = C1056ay.m5763a(this.f3645e, this.f3641a, this.f3647g);
            this.f3644d.inset((int) Math.ceil((double) C1056ay.m5766b(this.f3645e, this.f3641a, this.f3647g)), (int) Math.ceil((double) a));
            this.f3643c.set(this.f3644d);
        }
    }

    /* renamed from: b */
    private void m5756b(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f3648h = colorStateList;
        this.f3642b.setColor(this.f3648h.getColorForState(getState(), this.f3648h.getDefaultColor()));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public float mo5245a() {
        return this.f3645e;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5246a(float f) {
        if (f != this.f3641a) {
            this.f3641a = f;
            m5755a((Rect) null);
            invalidateSelf();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5247a(float f, boolean z, boolean z2) {
        if (f != this.f3645e || this.f3646f != z || this.f3647g != z2) {
            this.f3645e = f;
            this.f3646f = z;
            this.f3647g = z2;
            m5755a((Rect) null);
            invalidateSelf();
        }
    }

    /* renamed from: a */
    public void mo5248a(ColorStateList colorStateList) {
        m5756b(colorStateList);
        invalidateSelf();
    }

    /* renamed from: b */
    public float mo5249b() {
        return this.f3641a;
    }

    /* renamed from: c */
    public ColorStateList mo5250c() {
        return this.f3648h;
    }

    public void draw(Canvas canvas) {
        boolean z;
        Paint paint = this.f3642b;
        if (this.f3649i == null || paint.getColorFilter() != null) {
            z = false;
        } else {
            paint.setColorFilter(this.f3649i);
            z = true;
        }
        canvas.drawRoundRect(this.f3643c, this.f3641a, this.f3641a, paint);
        if (z) {
            paint.setColorFilter(null);
        }
    }

    public int getOpacity() {
        return -3;
    }

    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f3644d, this.f3641a);
    }

    public boolean isStateful() {
        return (this.f3650j != null && this.f3650j.isStateful()) || (this.f3648h != null && this.f3648h.isStateful()) || super.isStateful();
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m5755a(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        int colorForState = this.f3648h.getColorForState(iArr, this.f3648h.getDefaultColor());
        boolean z = colorForState != this.f3642b.getColor();
        if (z) {
            this.f3642b.setColor(colorForState);
        }
        if (this.f3650j == null || this.f3651k == null) {
            return z;
        }
        this.f3649i = m5754a(this.f3650j, this.f3651k);
        return true;
    }

    public void setAlpha(int i) {
        this.f3642b.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f3642b.setColorFilter(colorFilter);
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f3650j = colorStateList;
        this.f3649i = m5754a(this.f3650j, this.f3651k);
        invalidateSelf();
    }

    public void setTintMode(Mode mode) {
        this.f3651k = mode;
        this.f3649i = m5754a(this.f3650j, this.f3651k);
        invalidateSelf();
    }
}
