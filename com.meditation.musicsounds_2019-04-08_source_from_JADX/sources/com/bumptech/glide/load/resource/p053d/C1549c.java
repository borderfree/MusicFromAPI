package com.bumptech.glide.load.resource.p053d;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import android.view.Gravity;
import com.bumptech.glide.C1186c;
import com.bumptech.glide.load.C1490h;
import com.bumptech.glide.load.resource.p053d.C1554g.C1556b;
import com.bumptech.glide.p035b.C1180a;
import com.bumptech.glide.p040g.C1257i;
import java.nio.ByteBuffer;

/* renamed from: com.bumptech.glide.load.resource.d.c */
public class C1549c extends Drawable implements Animatable, C1556b {

    /* renamed from: a */
    private final C1550a f5028a;

    /* renamed from: b */
    private boolean f5029b;

    /* renamed from: c */
    private boolean f5030c;

    /* renamed from: d */
    private boolean f5031d;

    /* renamed from: e */
    private boolean f5032e;

    /* renamed from: f */
    private int f5033f;

    /* renamed from: g */
    private int f5034g;

    /* renamed from: h */
    private boolean f5035h;

    /* renamed from: i */
    private Paint f5036i;

    /* renamed from: j */
    private Rect f5037j;

    /* renamed from: com.bumptech.glide.load.resource.d.c$a */
    static final class C1550a extends ConstantState {

        /* renamed from: a */
        final C1554g f5038a;

        C1550a(C1554g gVar) {
            this.f5038a = gVar;
        }

        public int getChangingConfigurations() {
            return 0;
        }

        public Drawable newDrawable() {
            return new C1549c(this);
        }

        public Drawable newDrawable(Resources resources) {
            return newDrawable();
        }
    }

    public C1549c(Context context, C1180a aVar, C1490h<Bitmap> hVar, int i, int i2, Bitmap bitmap) {
        C1554g gVar = new C1554g(C1186c.m6450a(context), aVar, i, i2, hVar, bitmap);
        this(new C1550a(gVar));
    }

    C1549c(C1550a aVar) {
        this.f5032e = true;
        this.f5034g = -1;
        this.f5028a = (C1550a) C1257i.m6691a(aVar);
    }

    /* renamed from: h */
    private void m7682h() {
        this.f5033f = 0;
    }

    /* renamed from: i */
    private void m7683i() {
        C1257i.m6695a(!this.f5031d, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.f5028a.f5038a.mo6397g() != 1) {
            if (!this.f5029b) {
                this.f5029b = true;
                this.f5028a.f5038a.mo6390a((C1556b) this);
            } else {
                return;
            }
        }
        invalidateSelf();
    }

    /* renamed from: j */
    private void m7684j() {
        this.f5029b = false;
        this.f5028a.f5038a.mo6392b(this);
    }

    /* renamed from: k */
    private Rect m7685k() {
        if (this.f5037j == null) {
            this.f5037j = new Rect();
        }
        return this.f5037j;
    }

    /* renamed from: l */
    private Paint m7686l() {
        if (this.f5036i == null) {
            this.f5036i = new Paint(2);
        }
        return this.f5036i;
    }

    /* renamed from: m */
    private Callback m7687m() {
        Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        return callback;
    }

    /* renamed from: a */
    public int mo6363a() {
        return this.f5028a.f5038a.mo6394d();
    }

    /* renamed from: a */
    public void mo6364a(C1490h<Bitmap> hVar, Bitmap bitmap) {
        this.f5028a.f5038a.mo6388a(hVar, bitmap);
    }

    /* renamed from: b */
    public Bitmap mo6365b() {
        return this.f5028a.f5038a.mo6387a();
    }

    /* renamed from: c */
    public ByteBuffer mo6366c() {
        return this.f5028a.f5038a.mo6396f();
    }

    /* renamed from: d */
    public int mo6367d() {
        return this.f5028a.f5038a.mo6397g();
    }

    public void draw(Canvas canvas) {
        if (!this.f5031d) {
            if (this.f5035h) {
                Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), m7685k());
                this.f5035h = false;
            }
            canvas.drawBitmap(this.f5028a.f5038a.mo6399i(), null, m7685k(), m7686l());
        }
    }

    /* renamed from: e */
    public int mo6369e() {
        return this.f5028a.f5038a.mo6395e();
    }

    /* renamed from: f */
    public void mo6370f() {
        if (m7687m() == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        if (mo6369e() == mo6367d() - 1) {
            this.f5033f++;
        }
        if (this.f5034g != -1 && this.f5033f >= this.f5034g) {
            stop();
        }
    }

    /* renamed from: g */
    public void mo6371g() {
        this.f5031d = true;
        this.f5028a.f5038a.mo6398h();
    }

    public ConstantState getConstantState() {
        return this.f5028a;
    }

    public int getIntrinsicHeight() {
        return this.f5028a.f5038a.mo6393c();
    }

    public int getIntrinsicWidth() {
        return this.f5028a.f5038a.mo6391b();
    }

    public int getOpacity() {
        return -2;
    }

    public boolean isRunning() {
        return this.f5029b;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f5035h = true;
    }

    public void setAlpha(int i) {
        m7686l().setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        m7686l().setColorFilter(colorFilter);
    }

    public boolean setVisible(boolean z, boolean z2) {
        C1257i.m6695a(!this.f5031d, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f5032e = z;
        if (!z) {
            m7684j();
        } else if (this.f5030c) {
            m7683i();
        }
        return super.setVisible(z, z2);
    }

    public void start() {
        this.f5030c = true;
        m7682h();
        if (this.f5032e) {
            m7683i();
        }
    }

    public void stop() {
        this.f5030c = false;
        m7684j();
    }
}
