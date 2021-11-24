package com.seattleclouds.previewer.appmart.order.colorpicker;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: com.seattleclouds.previewer.appmart.order.colorpicker.a */
public class C6439a extends Drawable {

    /* renamed from: a */
    private int f22890a = 10;

    /* renamed from: b */
    private Paint f22891b = new Paint();

    /* renamed from: c */
    private Paint f22892c = new Paint();

    /* renamed from: d */
    private Paint f22893d = new Paint();

    /* renamed from: e */
    private int f22894e;

    /* renamed from: f */
    private int f22895f;

    /* renamed from: g */
    private Bitmap f22896g;

    public C6439a(int i) {
        this.f22890a = i;
        this.f22892c.setColor(-1);
        this.f22893d.setColor(-3421237);
    }

    /* renamed from: a */
    private void m31217a() {
        if (getBounds().width() > 0 && getBounds().height() > 0) {
            this.f22896g = Bitmap.createBitmap(getBounds().width(), getBounds().height(), Config.ARGB_8888);
            Canvas canvas = new Canvas(this.f22896g);
            Rect rect = new Rect();
            boolean z = true;
            for (int i = 0; i <= this.f22895f; i++) {
                boolean z2 = z;
                for (int i2 = 0; i2 <= this.f22894e; i2++) {
                    rect.top = this.f22890a * i;
                    rect.left = this.f22890a * i2;
                    rect.bottom = rect.top + this.f22890a;
                    rect.right = rect.left + this.f22890a;
                    canvas.drawRect(rect, z2 ? this.f22892c : this.f22893d);
                    z2 = !z2;
                }
                z = !z;
            }
        }
    }

    public void draw(Canvas canvas) {
        if (this.f22896g != null && !this.f22896g.isRecycled()) {
            canvas.drawBitmap(this.f22896g, null, getBounds(), this.f22891b);
        }
    }

    public int getOpacity() {
        return 0;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        int height = rect.height();
        this.f22894e = (int) Math.ceil((double) (rect.width() / this.f22890a));
        this.f22895f = (int) Math.ceil((double) (height / this.f22890a));
        m31217a();
    }

    public void setAlpha(int i) {
        throw new UnsupportedOperationException("Alpha is not supported by this drawable.");
    }

    public void setColorFilter(ColorFilter colorFilter) {
        throw new UnsupportedOperationException("ColorFilter is not supported by this drawable.");
    }
}
