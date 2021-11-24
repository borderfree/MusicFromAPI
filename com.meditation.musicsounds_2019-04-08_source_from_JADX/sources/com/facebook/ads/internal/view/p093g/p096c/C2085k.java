package com.facebook.ads.internal.view.p093g.p096c;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.view.animation.LinearInterpolator;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.facebook.ads.internal.p070l.C1720f;
import com.facebook.ads.internal.p077s.p078a.C1808r;
import com.facebook.ads.internal.view.p093g.C1994a;
import com.facebook.ads.internal.view.p093g.p094a.C2001b;
import com.facebook.ads.internal.view.p093g.p095b.C2017b;
import com.facebook.ads.internal.view.p093g.p095b.C2018c;
import com.facebook.ads.internal.view.p093g.p095b.C2023h;
import com.facebook.ads.internal.view.p093g.p095b.C2024i;
import com.facebook.ads.internal.view.p093g.p095b.C2025j;
import com.facebook.ads.internal.view.p093g.p095b.C2026k;
import com.facebook.ads.internal.view.p093g.p095b.C2029n;
import com.facebook.ads.internal.view.p093g.p095b.C2030o;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.facebook.ads.internal.view.g.c.k */
public class C2085k extends RelativeLayout implements C2001b {

    /* renamed from: a */
    private static final int f6809a = ((int) (C1808r.f5899b * 6.0f));

    /* renamed from: b */
    private ObjectAnimator f6810b;

    /* renamed from: c */
    private AtomicInteger f6811c;

    /* renamed from: d */
    private ProgressBar f6812d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C1994a f6813e;

    /* renamed from: f */
    private C1720f f6814f;

    /* renamed from: g */
    private C1720f f6815g;

    /* renamed from: h */
    private C1720f f6816h;

    /* renamed from: i */
    private C1720f f6817i;

    public C2085k(Context context) {
        this(context, f6809a, -12549889);
    }

    public C2085k(Context context, int i, int i2) {
        super(context);
        this.f6814f = new C2030o() {
            /* renamed from: a */
            public void mo6765a(C2029n nVar) {
                if (C2085k.this.f6813e != null) {
                    C2085k.this.m9773a(C2085k.this.f6813e.getDuration(), C2085k.this.f6813e.getCurrentPositionInMillis());
                }
            }
        };
        this.f6815g = new C2024i() {
            /* renamed from: a */
            public void mo6765a(C2023h hVar) {
                C2085k.this.m9775b();
            }
        };
        this.f6816h = new C2026k() {
            /* renamed from: a */
            public void mo6765a(C2025j jVar) {
                if (C2085k.this.f6813e != null) {
                    C2085k.this.m9773a(C2085k.this.f6813e.getDuration(), C2085k.this.f6813e.getCurrentPositionInMillis());
                }
            }
        };
        this.f6817i = new C2018c() {
            /* renamed from: a */
            public void mo6765a(C2017b bVar) {
                if (C2085k.this.f6813e != null) {
                    C2085k.this.m9777c();
                }
            }
        };
        this.f6811c = new AtomicInteger(-1);
        this.f6812d = new ProgressBar(context, null, 16842872);
        this.f6812d.setLayoutParams(new LayoutParams(-1, i));
        setProgressBarColor(i2);
        this.f6812d.setMax(10000);
        addView(this.f6812d);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m9773a(int i, int i2) {
        m9775b();
        if (this.f6811c.get() < i2 && i > i2) {
            this.f6810b = ObjectAnimator.ofInt(this.f6812d, "progress", new int[]{(i2 * 10000) / i, (Math.min(i2 + 250, i) * 10000) / i});
            this.f6810b.setDuration((long) Math.min(250, i - i2));
            this.f6810b.setInterpolator(new LinearInterpolator());
            this.f6810b.start();
            this.f6811c.set(i2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m9775b() {
        if (this.f6810b != null) {
            this.f6810b.cancel();
            this.f6810b.setTarget(null);
            this.f6810b = null;
            this.f6812d.clearAnimation();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m9777c() {
        m9775b();
        this.f6810b = ObjectAnimator.ofInt(this.f6812d, "progress", new int[]{0, 0});
        this.f6810b.setDuration(0);
        this.f6810b.setInterpolator(new LinearInterpolator());
        this.f6810b.start();
        this.f6811c.set(0);
    }

    /* renamed from: a */
    public void mo7544a() {
        m9775b();
        this.f6812d = null;
        this.f6813e = null;
    }

    /* renamed from: a */
    public void mo7380a(C1994a aVar) {
        this.f6813e = aVar;
        aVar.getEventBus().mo6906a((T[]) new C1720f[]{this.f6815g, this.f6816h, this.f6814f, this.f6817i});
    }

    /* renamed from: b */
    public void mo7384b(C1994a aVar) {
        aVar.getEventBus().mo6908b((T[]) new C1720f[]{this.f6814f, this.f6816h, this.f6815g, this.f6817i});
        this.f6813e = null;
    }

    public void setProgressBarColor(int i) {
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{new ColorDrawable(0), new ColorDrawable(0), new ScaleDrawable(new ColorDrawable(i), 8388611, 1.0f, -1.0f)});
        layerDrawable.setId(0, 16908288);
        layerDrawable.setId(1, 16908303);
        layerDrawable.setId(2, 16908301);
        this.f6812d.setProgressDrawable(layerDrawable);
    }
}
