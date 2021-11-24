package com.facebook.ads.internal.view.component;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.view.View;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.p077s.p078a.C1808r;

/* renamed from: com.facebook.ads.internal.view.component.e */
public class C1925e extends RelativeLayout {

    /* renamed from: a */
    private static final int f6348a = ((int) (C1808r.f5899b * 4.0f));

    /* renamed from: b */
    private final Path f6349b = new Path();

    /* renamed from: c */
    private final RectF f6350c = new RectF();

    public C1925e(Context context) {
        super(context);
        C1808r.m8932a((View) this, 0);
        if (VERSION.SDK_INT < 18) {
            setLayerType(1, null);
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        this.f6350c.set(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
        this.f6349b.reset();
        this.f6349b.addRoundRect(this.f6350c, (float) f6348a, (float) f6348a, Direction.CW);
        canvas.clipPath(this.f6349b);
        super.onDraw(canvas);
    }
}
