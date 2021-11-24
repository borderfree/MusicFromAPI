package com.facebook.ads.internal.view.p086c;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import com.facebook.ads.internal.p083t.C1838a;
import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.internal.view.c.c */
public class C1894c extends Drawable {

    /* renamed from: a */
    private final Paint f6229a = new Paint();

    /* renamed from: b */
    private final Paint f6230b = new Paint();

    /* renamed from: c */
    private final Path f6231c = new Path();

    /* renamed from: d */
    private final TextPaint f6232d = new TextPaint();

    /* renamed from: e */
    private final Paint f6233e = new Paint();

    /* renamed from: f */
    private int f6234f;

    /* renamed from: g */
    private int f6235g;

    /* renamed from: h */
    private String f6236h;

    /* renamed from: i */
    private int f6237i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f6238j;

    /* renamed from: k */
    private String f6239k;

    /* renamed from: l */
    private String f6240l;

    /* renamed from: m */
    private long f6241m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final Handler f6242n = new Handler();

    /* renamed from: o */
    private WeakReference<C1838a> f6243o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final Runnable f6244p = new Runnable() {
        public void run() {
            C1894c.this.m9195c();
            if (C1894c.this.f6238j) {
                C1894c.this.f6242n.postDelayed(C1894c.this.f6244p, 250);
            }
        }
    };

    public C1894c() {
        this.f6229a.setColor(Color.argb(127, 36, 36, 36));
        this.f6229a.setStyle(Style.FILL_AND_STROKE);
        this.f6230b.setAntiAlias(true);
        this.f6230b.setColor(Color.argb(191, 0, 255, 0));
        this.f6230b.setStrokeWidth(20.0f);
        this.f6230b.setStyle(Style.STROKE);
        this.f6232d.setAntiAlias(true);
        this.f6232d.setColor(-1);
        this.f6232d.setStyle(Style.FILL_AND_STROKE);
        this.f6232d.setTextSize(30.0f);
        this.f6233e.setColor(Color.argb(212, 0, 0, 0));
        this.f6233e.setStyle(Style.FILL_AND_STROKE);
        mo7229b();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m9195c() {
        String[] split;
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.f6234f <= 0) {
            if (!TextUtils.isEmpty(this.f6239k)) {
                sb.append(this.f6239k);
                sb.append("\n");
            }
            if (!TextUtils.isEmpty(this.f6240l)) {
                sb.append(this.f6240l);
                sb.append("\n");
            }
            sb.append("Sdk ");
            sb.append("5.0.0");
            sb.append(", Loaded ");
            if (this.f6241m > 0) {
                long max = Math.max(0, System.currentTimeMillis() - this.f6241m);
                int i = (int) (max / 3600000);
                long j = max % 3600000;
                int i2 = (int) (j / 60000);
                int i3 = (int) ((j % 60000) / 1000);
                if (i > 0) {
                    sb.append(i);
                    sb.append("h ");
                }
                if (i > 0 || i2 > 0) {
                    sb.append(i2);
                    sb.append("m ");
                }
                sb.append(i3);
                str = "s ago";
            } else {
                str = "Unknown";
            }
            sb.append(str);
        } else {
            sb.append("Card ");
            sb.append(this.f6235g + 1);
            sb.append(" of ");
            sb.append(this.f6234f);
        }
        sb.append("\nView: ");
        sb.append((this.f6243o == null || this.f6243o.get() == null) ? "Viewability Checker not set" : ((C1838a) this.f6243o.get()).mo7112d());
        this.f6236h = sb.toString();
        float f = -2.14748365E9f;
        for (String str2 : this.f6236h.split("\n")) {
            f = Math.max(f, this.f6232d.measureText(str2, 0, str2.length()));
        }
        this.f6237i = (int) (f + 0.5f);
        invalidateSelf();
    }

    /* renamed from: a */
    public void mo7225a(long j) {
        this.f6241m = j;
        m9195c();
    }

    /* renamed from: a */
    public void mo7226a(String str) {
        this.f6239k = str;
        m9195c();
    }

    /* renamed from: a */
    public void mo7227a(boolean z) {
        this.f6238j = z;
        if (this.f6238j) {
            this.f6242n.post(this.f6244p);
        } else {
            this.f6242n.removeCallbacks(this.f6244p);
        }
        invalidateSelf();
    }

    /* renamed from: a */
    public boolean mo7228a() {
        return this.f6238j;
    }

    /* renamed from: b */
    public void mo7229b() {
        this.f6234f = 0;
        this.f6235g = -1;
        this.f6236h = "Initializing...";
        this.f6237i = 100;
        this.f6239k = null;
        this.f6241m = -1;
        this.f6243o = null;
        mo7227a(false);
    }

    /* renamed from: b */
    public void mo7230b(String str) {
        this.f6240l = str;
        m9195c();
    }

    public void draw(Canvas canvas) {
        Canvas canvas2 = canvas;
        if (this.f6238j) {
            float width = (float) canvas.getWidth();
            float height = (float) canvas.getHeight();
            canvas.drawRect(0.0f, 0.0f, width, height, this.f6229a);
            StaticLayout staticLayout = new StaticLayout(this.f6236h, this.f6232d, this.f6237i, Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            float f = width / 2.0f;
            float f2 = height / 2.0f;
            float width2 = ((float) staticLayout.getWidth()) / 2.0f;
            float height2 = ((float) staticLayout.getHeight()) / 2.0f;
            float f3 = f - width2;
            float f4 = f2 - height2;
            StaticLayout staticLayout2 = staticLayout;
            canvas.drawRect(f3 - 40.0f, f4 - 40.0f, f + width2 + 40.0f, f2 + height2 + 40.0f, this.f6233e);
            canvas.save();
            canvas2.translate(f3, f4);
            staticLayout2.draw(canvas2);
            canvas.restore();
            this.f6231c.reset();
            this.f6231c.moveTo(0.0f, 0.0f);
            this.f6231c.lineTo(width, 0.0f);
            this.f6231c.lineTo(width, height);
            this.f6231c.lineTo(0.0f, height);
            this.f6231c.lineTo(0.0f, 0.0f);
            canvas2.drawPath(this.f6231c, this.f6230b);
        }
    }

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}
