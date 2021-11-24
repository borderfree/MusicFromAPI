package com.facebook.ads.internal.view.p089d;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.p077s.p078a.C1806p;

/* renamed from: com.facebook.ads.internal.view.d.a */
public class C1930a extends RelativeLayout {

    /* renamed from: a */
    private final C1806p f6371a;

    /* renamed from: b */
    private final Paint f6372b;

    /* renamed from: c */
    private final RectF f6373c;

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        float f = getContext().getResources().getDisplayMetrics().density;
        this.f6373c.set(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
        float f2 = f * 10.0f;
        canvas.drawRoundRect(this.f6373c, f2, f2, this.f6372b);
        super.onDraw(canvas);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f6371a.mo7069a(motionEvent, getRootView(), this);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
