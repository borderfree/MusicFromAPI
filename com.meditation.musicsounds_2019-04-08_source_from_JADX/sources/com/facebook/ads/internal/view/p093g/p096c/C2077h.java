package com.facebook.ads.internal.view.p093g.p096c;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Build.VERSION;
import android.view.View;
import android.widget.Button;
import com.facebook.ads.internal.p077s.p078a.C1808r;

/* renamed from: com.facebook.ads.internal.view.g.c.h */
public class C2077h extends Button {

    /* renamed from: a */
    private final Path f6777a = new Path();

    /* renamed from: b */
    private final Path f6778b = new Path();

    /* renamed from: c */
    private final Paint f6779c;

    /* renamed from: d */
    private final Path f6780d = new Path();

    /* renamed from: e */
    private boolean f6781e = false;

    public C2077h(Context context, final boolean z) {
        super(context);
        this.f6779c = new Paint() {
            {
                setStyle(Style.FILL_AND_STROKE);
                setStrokeCap(Cap.ROUND);
                setStrokeWidth(3.0f);
                setAntiAlias(true);
                setColor(z ? -1 : -10066330);
            }
        };
        setClickable(true);
        C1808r.m8932a((View) this, 0);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        Path path;
        if (canvas.isHardwareAccelerated() && VERSION.SDK_INT < 17) {
            setLayerType(1, null);
        }
        float max = ((float) Math.max(canvas.getWidth(), canvas.getHeight())) / 100.0f;
        if (this.f6781e) {
            this.f6780d.rewind();
            float f = 26.5f * max;
            float f2 = 15.5f * max;
            this.f6780d.moveTo(f, f2);
            this.f6780d.lineTo(f, 84.5f * max);
            this.f6780d.lineTo(90.0f * max, max * 50.0f);
            this.f6780d.lineTo(f, f2);
            this.f6780d.close();
            path = this.f6780d;
        } else {
            this.f6777a.rewind();
            float f3 = 29.0f * max;
            float f4 = 21.0f * max;
            this.f6777a.moveTo(f3, f4);
            float f5 = 79.0f * max;
            this.f6777a.lineTo(f3, f5);
            float f6 = 45.0f * max;
            this.f6777a.lineTo(f6, f5);
            this.f6777a.lineTo(f6, f4);
            this.f6777a.lineTo(f3, f4);
            this.f6777a.close();
            this.f6778b.rewind();
            float f7 = 55.0f * max;
            this.f6778b.moveTo(f7, f4);
            this.f6778b.lineTo(f7, f5);
            float f8 = max * 71.0f;
            this.f6778b.lineTo(f8, f5);
            this.f6778b.lineTo(f8, f4);
            this.f6778b.lineTo(f7, f4);
            this.f6778b.close();
            canvas.drawPath(this.f6777a, this.f6779c);
            path = this.f6778b;
        }
        canvas.drawPath(path, this.f6779c);
        super.onDraw(canvas);
    }

    public void setChecked(boolean z) {
        this.f6781e = z;
        refreshDrawableState();
        invalidate();
    }
}
