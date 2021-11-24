package com.facebook.ads.internal.view.p093g.p096c;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout.LayoutParams;
import com.facebook.ads.internal.p070l.C1720f;
import com.facebook.ads.internal.p077s.p078a.C1808r;
import com.facebook.ads.internal.view.p093g.p094a.C2000a;
import com.facebook.ads.internal.view.p093g.p094a.C2002c;
import com.facebook.ads.internal.view.p093g.p095b.C2017b;
import com.facebook.ads.internal.view.p093g.p095b.C2018c;
import com.facebook.ads.internal.view.p093g.p095b.C2023h;
import com.facebook.ads.internal.view.p093g.p095b.C2024i;
import com.facebook.ads.internal.view.p093g.p095b.C2025j;
import com.facebook.ads.internal.view.p093g.p095b.C2026k;
import com.facebook.ads.internal.view.p093g.p097d.C2101d;

/* renamed from: com.facebook.ads.internal.view.g.c.g */
public class C2071g extends C2002c {

    /* renamed from: a */
    private final C2024i f6767a = new C2024i() {
        /* renamed from: a */
        public void mo6765a(C2023h hVar) {
            C2071g.this.f6770d.setChecked(true);
        }
    };

    /* renamed from: b */
    private final C2026k f6768b = new C2026k() {
        /* renamed from: a */
        public void mo6765a(C2025j jVar) {
            C2071g.this.f6770d.setChecked(false);
        }
    };

    /* renamed from: c */
    private final C2018c f6769c = new C2018c() {
        /* renamed from: a */
        public void mo6765a(C2017b bVar) {
            C2071g.this.f6770d.setChecked(true);
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C2077h f6770d;

    /* renamed from: e */
    private final Paint f6771e;

    /* renamed from: com.facebook.ads.internal.view.g.c.g$5 */
    static /* synthetic */ class C20765 {

        /* renamed from: a */
        static final /* synthetic */ int[] f6776a = new int[C2101d.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                com.facebook.ads.internal.view.g.d.d[] r0 = com.facebook.ads.internal.view.p093g.p097d.C2101d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f6776a = r0
                int[] r0 = f6776a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.facebook.ads.internal.view.g.d.d r1 = com.facebook.ads.internal.view.p093g.p097d.C2101d.PREPARED     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f6776a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.facebook.ads.internal.view.g.d.d r1 = com.facebook.ads.internal.view.p093g.p097d.C2101d.IDLE     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f6776a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.facebook.ads.internal.view.g.d.d r1 = com.facebook.ads.internal.view.p093g.p097d.C2101d.PAUSED     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f6776a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.facebook.ads.internal.view.g.d.d r1 = com.facebook.ads.internal.view.p093g.p097d.C2101d.PLAYBACK_COMPLETED     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f6776a     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.facebook.ads.internal.view.g.d.d r1 = com.facebook.ads.internal.view.p093g.p097d.C2101d.STARTED     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.view.p093g.p096c.C2071g.C20765.<clinit>():void");
        }
    }

    public C2071g(Context context, boolean z) {
        super(context);
        this.f6770d = new C2077h(context, z);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        double d = (double) displayMetrics.density;
        Double.isNaN(d);
        int i = (int) (d * 23.76d);
        double d2 = (double) displayMetrics.density;
        Double.isNaN(d2);
        LayoutParams layoutParams = new LayoutParams(i, (int) (d2 * 23.76d));
        layoutParams.addRule(13);
        this.f6770d.setLayoutParams(layoutParams);
        this.f6770d.setChecked(true);
        this.f6771e = new Paint();
        this.f6771e.setStyle(Style.FILL);
        if (z) {
            this.f6771e.setColor(-1728053248);
        } else {
            this.f6771e.setColor(-1);
            this.f6771e.setAlpha(204);
        }
        C1808r.m8932a((View) this, 0);
        addView(this.f6770d);
        setGravity(17);
        double d3 = (double) displayMetrics.density;
        Double.isNaN(d3);
        int i2 = (int) (d3 * 72.0d);
        double d4 = (double) displayMetrics.density;
        Double.isNaN(d4);
        LayoutParams layoutParams2 = new LayoutParams(i2, (int) (d4 * 72.0d));
        layoutParams2.addRule(13);
        setLayoutParams(layoutParams2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7465a() {
        super.mo7465a();
        if (getVideoView() != null) {
            getVideoView().getEventBus().mo6906a((T[]) new C1720f[]{this.f6767a, this.f6768b, this.f6769c});
        }
        C20754 r0 = new OnClickListener() {
            public void onClick(View view) {
                if (C2071g.this.getVideoView() != null) {
                    switch (C20765.f6776a[C2071g.this.getVideoView().getState().ordinal()]) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            C2071g.this.getVideoView().mo7422a(C2000a.USER_STARTED);
                            break;
                        case 5:
                            C2071g.this.getVideoView().mo7425a(true);
                            break;
                    }
                }
            }
        };
        this.f6770d.setClickable(false);
        setOnClickListener(r0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7466b() {
        setOnClickListener(null);
        if (getVideoView() != null) {
            getVideoView().getEventBus().mo6908b((T[]) new C1720f[]{this.f6769c, this.f6768b, this.f6767a});
        }
        super.mo7466b();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        int min = Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom()) / 2;
        canvas.drawCircle((float) (getPaddingLeft() + min), (float) (getPaddingTop() + min), (float) min, this.f6771e);
        super.onDraw(canvas);
    }
}
