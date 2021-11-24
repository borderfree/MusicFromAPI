package com.facebook.ads.internal.view.p085b;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.widget.ProgressBar;

@TargetApi(19)
/* renamed from: com.facebook.ads.internal.view.b.b */
public class C1872b extends ProgressBar {

    /* renamed from: a */
    private static final int f6155a = Color.argb(26, 0, 0, 0);

    /* renamed from: b */
    private static final int f6156b = Color.rgb(88, 144, 255);

    /* renamed from: c */
    private Rect f6157c;

    /* renamed from: d */
    private Paint f6158d;

    public C1872b(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m9136a();
    }

    /* renamed from: a */
    private void m9136a() {
        setIndeterminate(false);
        setMax(100);
        setProgressDrawable(m9137b());
        this.f6157c = new Rect();
        this.f6158d = new Paint();
        this.f6158d.setStyle(Style.FILL);
        this.f6158d.setColor(f6155a);
    }

    /* renamed from: b */
    private Drawable m9137b() {
        return new LayerDrawable(new Drawable[]{new ColorDrawable(0), new ClipDrawable(new ColorDrawable(f6156b), 3, 1)});
    }

    /* access modifiers changed from: protected */
    public synchronized void onDraw(Canvas canvas) {
        canvas.drawRect(this.f6157c, this.f6158d);
        super.onDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f6157c.set(0, 0, getMeasuredWidth(), 2);
    }

    public synchronized void setProgress(int i) {
        super.setProgress(i == 100 ? 0 : Math.max(i, 5));
    }
}
