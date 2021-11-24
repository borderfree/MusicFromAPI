package com.facebook.ads.internal.view.p093g.p096c;

import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.BlurMaskFilter.Blur;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import com.facebook.ads.internal.p070l.C1720f;
import com.facebook.ads.internal.view.p093g.C1994a;
import com.facebook.ads.internal.view.p093g.p094a.C2001b;
import com.facebook.ads.internal.view.p093g.p095b.C2017b;
import com.facebook.ads.internal.view.p093g.p095b.C2018c;
import com.facebook.ads.internal.view.p093g.p095b.C2027l;
import com.facebook.ads.internal.view.p093g.p095b.C2028m;
import com.facebook.ads.internal.view.p093g.p095b.C2029n;
import com.facebook.ads.internal.view.p093g.p095b.C2030o;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.facebook.ads.internal.view.g.c.j */
public class C2080j extends View implements C2001b {

    /* renamed from: a */
    private final Paint f6790a;

    /* renamed from: b */
    private final Paint f6791b;

    /* renamed from: c */
    private final Paint f6792c;

    /* renamed from: d */
    private C2084a f6793d = C2084a.CLOSE_BUTTON_MODE;

    /* renamed from: e */
    private final Paint f6794e;

    /* renamed from: f */
    private final RectF f6795f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C1994a f6796g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public int f6797h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final AtomicInteger f6798i = new AtomicInteger(0);
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final AtomicBoolean f6799j = new AtomicBoolean(false);

    /* renamed from: k */
    private final C2028m f6800k = new C2028m() {
        /* renamed from: a */
        public void mo6765a(C2027l lVar) {
            C2080j.this.f6799j.set(true);
        }
    };

    /* renamed from: l */
    private final C2030o f6801l = new C2030o() {
        /* renamed from: a */
        public void mo6765a(C2029n nVar) {
            if (C2080j.this.f6796g != null) {
                int c = C2080j.this.f6797h;
                int duration = C2080j.this.f6796g.getDuration();
                if (c <= 0) {
                    C2080j.this.f6798i.set(0);
                } else {
                    int min = Math.min(duration, c * 1000);
                    if (min != 0) {
                        C2080j.this.f6798i.set(((min - C2080j.this.f6796g.getCurrentPositionInMillis()) * 100) / min);
                    } else {
                        return;
                    }
                }
                C2080j.this.postInvalidate();
            }
        }
    };

    /* renamed from: m */
    private final C2018c f6802m = new C2018c() {
        /* renamed from: a */
        public void mo6765a(C2017b bVar) {
            C2080j.this.f6797h = 0;
            C2080j.this.f6798i.set(0);
            C2080j.this.postInvalidate();
        }
    };

    /* renamed from: com.facebook.ads.internal.view.g.c.j$a */
    public enum C2084a {
        CLOSE_BUTTON_MODE,
        SKIP_BUTTON_MODE
    }

    public C2080j(Context context, int i, int i2) {
        super(context);
        float f = getResources().getDisplayMetrics().density;
        this.f6797h = i;
        this.f6791b = new Paint();
        this.f6791b.setStyle(Style.FILL);
        this.f6791b.setColor(i2);
        this.f6792c = new Paint();
        this.f6792c.setColor(-1);
        this.f6792c.setAlpha(230);
        this.f6792c.setStyle(Style.FILL);
        this.f6792c.setStrokeWidth(1.0f * f);
        this.f6792c.setAntiAlias(true);
        this.f6790a = new Paint();
        this.f6790a.setColor(-16777216);
        this.f6790a.setStyle(Style.STROKE);
        this.f6790a.setAlpha(102);
        this.f6790a.setStrokeWidth(1.5f * f);
        this.f6790a.setAntiAlias(true);
        setLayerType(1, null);
        this.f6790a.setMaskFilter(new BlurMaskFilter(6.0f, Blur.NORMAL));
        this.f6794e = new Paint();
        this.f6794e.setColor(-10066330);
        this.f6794e.setStyle(Style.STROKE);
        this.f6794e.setStrokeWidth(f * 2.0f);
        this.f6794e.setAntiAlias(true);
        this.f6795f = new RectF();
    }

    /* renamed from: a */
    public void mo7380a(C1994a aVar) {
        this.f6796g = aVar;
        this.f6796g.getEventBus().mo6906a((T[]) new C1720f[]{this.f6800k, this.f6801l, this.f6802m});
    }

    /* renamed from: a */
    public boolean mo7537a() {
        return this.f6796g != null && (this.f6797h <= 0 || this.f6798i.get() < 0);
    }

    /* renamed from: b */
    public void mo7384b(C1994a aVar) {
        this.f6796g.getEventBus().mo6908b((T[]) new C1720f[]{this.f6802m, this.f6801l, this.f6800k});
        this.f6796g = null;
    }

    public int getSkipSeconds() {
        return this.f6797h;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (!this.f6799j.get()) {
            super.onDraw(canvas);
            return;
        }
        int min = Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        int i = min / 2;
        float f = (float) i;
        canvas.drawCircle((float) (getPaddingLeft() + i), (float) (getPaddingTop() + i), f, this.f6790a);
        canvas.drawCircle((float) (getPaddingLeft() + i), (float) (getPaddingTop() + i), f, this.f6792c);
        if (this.f6798i.get() > 0) {
            this.f6795f.set((float) getPaddingLeft(), (float) getPaddingTop(), (float) (getWidth() - getPaddingRight()), (float) (getHeight() - getPaddingBottom()));
            canvas.drawArc(this.f6795f, -90.0f, ((float) (-(this.f6798i.get() * 360))) / 100.0f, true, this.f6791b);
        } else if (this.f6793d == C2084a.SKIP_BUTTON_MODE) {
            int i2 = min / 4;
            int i3 = min / 3;
            Path path = new Path();
            path.moveTo((float) (getPaddingLeft() + i2), (float) (getPaddingTop() + i3));
            path.lineTo((float) (getPaddingLeft() + i), (float) (getPaddingTop() + i));
            int i4 = i3 * 2;
            path.lineTo((float) (getPaddingLeft() + i2), (float) (getPaddingTop() + i4));
            canvas.drawPath(path, this.f6794e);
            Path path2 = new Path();
            path2.moveTo((float) (getPaddingLeft() + i), (float) (i3 + getPaddingTop()));
            path2.lineTo((float) ((i2 * 3) + getPaddingLeft()), (float) (getPaddingTop() + i));
            path2.lineTo((float) (i + getPaddingLeft()), (float) (i4 + getPaddingTop()));
            canvas.drawPath(path2, this.f6794e);
        } else {
            int i5 = min / 3;
            int i6 = i5 * 2;
            Canvas canvas2 = canvas;
            canvas2.drawLine((float) (getPaddingLeft() + i5), (float) (getPaddingTop() + i5), (float) (getPaddingLeft() + i6), (float) (getPaddingTop() + i6), this.f6794e);
            canvas.drawLine((float) (getPaddingLeft() + i6), (float) (getPaddingTop() + i5), (float) (i5 + getPaddingLeft()), (float) (i6 + getPaddingTop()), this.f6794e);
        }
        super.onDraw(canvas);
    }

    public void setButtonMode(C2084a aVar) {
        this.f6793d = aVar;
    }
}
