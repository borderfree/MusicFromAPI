package com.facebook.ads.internal.view.component;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.support.annotation.Keep;
import android.view.View;
import android.view.animation.LinearInterpolator;

public class CircularProgressView extends View {

    /* renamed from: a */
    private final float f6256a = (Resources.getSystem().getDisplayMetrics().density * 3.0f);

    /* renamed from: b */
    private final RectF f6257b = new RectF();

    /* renamed from: c */
    private final Paint f6258c = new Paint(1);

    /* renamed from: d */
    private final Paint f6259d;

    /* renamed from: e */
    private float f6260e = 0.0f;

    public CircularProgressView(Context context) {
        super(context);
        this.f6258c.setStyle(Style.STROKE);
        this.f6258c.setStrokeWidth(this.f6256a);
        this.f6259d = new Paint(1);
        this.f6259d.setStyle(Style.STROKE);
        this.f6259d.setStrokeWidth(this.f6256a);
    }

    /* renamed from: a */
    public void mo7246a(int i, int i2) {
        this.f6258c.setColor(i);
        this.f6259d.setColor(i2);
    }

    @Keep
    public float getProgress() {
        return this.f6260e;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawArc(this.f6257b, 0.0f, 360.0f, false, this.f6258c);
        canvas.drawArc(this.f6257b, -90.0f, (this.f6260e * 360.0f) / 100.0f, false, this.f6259d);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int min = Math.min(getDefaultSize(getSuggestedMinimumHeight(), i2), getDefaultSize(getSuggestedMinimumWidth(), i));
        setMeasuredDimension(min, min);
        float f = (float) min;
        this.f6257b.set((this.f6256a / 2.0f) + 0.0f + ((float) getPaddingLeft()), (this.f6256a / 2.0f) + 0.0f + ((float) getPaddingTop()), (f - (this.f6256a / 2.0f)) - ((float) getPaddingRight()), (f - (this.f6256a / 2.0f)) - ((float) getPaddingBottom()));
    }

    @Keep
    public void setProgress(float f) {
        this.f6260e = Math.min(f, 100.0f);
        postInvalidate();
    }

    public void setProgressWithAnimation(float f) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "progress", new float[]{f});
        ofFloat.setDuration(400);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.start();
    }
}
