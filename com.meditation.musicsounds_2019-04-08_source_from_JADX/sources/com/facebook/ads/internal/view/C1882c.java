package com.facebook.ads.internal.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.os.Build.VERSION;
import android.view.View;
import android.widget.RelativeLayout.LayoutParams;
import com.facebook.ads.internal.p077s.p078a.C1808r;

/* renamed from: com.facebook.ads.internal.view.c */
public class C1882c extends View {

    /* renamed from: a */
    private Paint f6192a;

    /* renamed from: b */
    private Paint f6193b;

    /* renamed from: c */
    private Paint f6194c;

    /* renamed from: d */
    private int f6195d;

    /* renamed from: e */
    private boolean f6196e;

    public C1882c(Context context) {
        this(context, 60, true);
    }

    public C1882c(Context context, int i, boolean z) {
        super(context);
        this.f6195d = i;
        this.f6196e = z;
        if (z) {
            this.f6192a = new Paint();
            this.f6192a.setColor(-3355444);
            this.f6192a.setStyle(Style.STROKE);
            this.f6192a.setStrokeWidth(3.0f);
            this.f6192a.setAntiAlias(true);
            this.f6193b = new Paint();
            this.f6193b.setColor(-1287371708);
            this.f6193b.setStyle(Style.FILL);
            this.f6193b.setAntiAlias(true);
            this.f6194c = new Paint();
            this.f6194c.setColor(-1);
            this.f6194c.setStyle(Style.STROKE);
            this.f6194c.setStrokeWidth(6.0f);
            this.f6194c.setAntiAlias(true);
        }
        m9166a();
    }

    /* renamed from: a */
    private void m9166a() {
        float f = C1808r.f5899b;
        LayoutParams layoutParams = new LayoutParams((int) (((float) this.f6195d) * f), (int) (((float) this.f6195d) * f));
        layoutParams.addRule(10);
        layoutParams.addRule(11);
        setLayoutParams(layoutParams);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (this.f6196e) {
            if (canvas.isHardwareAccelerated() && VERSION.SDK_INT < 17) {
                setLayerType(1, null);
            }
            int min = Math.min(canvas.getWidth(), canvas.getHeight());
            int i = min / 2;
            int i2 = (i * 2) / 3;
            float f = (float) i;
            canvas.drawCircle(f, f, (float) i2, this.f6192a);
            canvas.drawCircle(f, f, (float) (i2 - 2), this.f6193b);
            int i3 = min / 3;
            float f2 = (float) i3;
            float f3 = (float) (i3 * 2);
            Canvas canvas2 = canvas;
            float f4 = f2;
            float f5 = f3;
            canvas2.drawLine(f2, f4, f3, f5, this.f6194c);
            canvas2.drawLine(f3, f4, f2, f5, this.f6194c);
        }
        super.onDraw(canvas);
    }
}
