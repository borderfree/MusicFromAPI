package com.facebook.ads.internal.view.p089d;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.ads.internal.p077s.p078a.C1808r;

/* renamed from: com.facebook.ads.internal.view.d.b */
public class C1947b extends RelativeLayout {

    /* renamed from: a */
    private final Paint f6456a = new Paint();

    /* renamed from: b */
    private final RectF f6457b;

    public C1947b(Context context, String str) {
        super(context);
        float f = context.getResources().getDisplayMetrics().density;
        TextView textView = new TextView(context);
        textView.setTextColor(-16777216);
        textView.setTextSize(16.0f);
        textView.setText(str);
        textView.setTypeface(Typeface.defaultFromStyle(1));
        setGravity(17);
        int i = (int) (f * 6.0f);
        textView.setPadding(i, i, i, i);
        addView(textView);
        this.f6456a.setStyle(Style.FILL);
        this.f6456a.setColor(-1);
        this.f6457b = new RectF();
        C1808r.m8932a((View) this, 0);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        float f = getContext().getResources().getDisplayMetrics().density;
        this.f6457b.set(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
        float f2 = f * 10.0f;
        canvas.drawRoundRect(this.f6457b, f2, f2, this.f6456a);
        super.onDraw(canvas);
    }
}
