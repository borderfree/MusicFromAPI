package com.facebook.ads.internal.view.component;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.widget.ImageView;
import com.facebook.ads.internal.p077s.p078a.C1808r;

/* renamed from: com.facebook.ads.internal.view.component.d */
public class C1924d extends ImageView {

    /* renamed from: a */
    private static final int f6343a = ((int) (C1808r.f5899b * 8.0f));

    /* renamed from: b */
    private final Path f6344b = new Path();

    /* renamed from: c */
    private final RectF f6345c = new RectF();

    /* renamed from: d */
    private int f6346d = f6343a;

    /* renamed from: e */
    private boolean f6347e = false;

    public C1924d(Context context) {
        super(context);
        if (VERSION.SDK_INT < 18) {
            setLayerType(1, null);
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        this.f6345c.set(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
        this.f6344b.reset();
        float min = (float) (this.f6347e ? Math.min(getWidth(), getHeight()) / 2 : this.f6346d);
        this.f6344b.addRoundRect(this.f6345c, min, min, Direction.CW);
        canvas.clipPath(this.f6344b);
        super.onDraw(canvas);
    }

    public void setFullCircleCorners(boolean z) {
        this.f6347e = z;
    }

    public void setRadius(int i) {
        this.f6346d = (int) (((float) i) * C1808r.f5899b);
    }
}
