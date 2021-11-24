package android.support.p009v4.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.support.p009v4.view.C0626s;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

/* renamed from: android.support.v4.widget.a */
public abstract class C0675a implements OnTouchListener {

    /* renamed from: r */
    private static final int f1952r = ViewConfiguration.getTapTimeout();

    /* renamed from: a */
    final C0676a f1953a = new C0676a();

    /* renamed from: b */
    final View f1954b;

    /* renamed from: c */
    boolean f1955c;

    /* renamed from: d */
    boolean f1956d;

    /* renamed from: e */
    boolean f1957e;

    /* renamed from: f */
    private final Interpolator f1958f = new AccelerateInterpolator();

    /* renamed from: g */
    private Runnable f1959g;

    /* renamed from: h */
    private float[] f1960h = {0.0f, 0.0f};

    /* renamed from: i */
    private float[] f1961i = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: j */
    private int f1962j;

    /* renamed from: k */
    private int f1963k;

    /* renamed from: l */
    private float[] f1964l = {0.0f, 0.0f};

    /* renamed from: m */
    private float[] f1965m = {0.0f, 0.0f};

    /* renamed from: n */
    private float[] f1966n = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: o */
    private boolean f1967o;

    /* renamed from: p */
    private boolean f1968p;

    /* renamed from: q */
    private boolean f1969q;

    /* renamed from: android.support.v4.widget.a$a */
    private static class C0676a {

        /* renamed from: a */
        private int f1970a;

        /* renamed from: b */
        private int f1971b;

        /* renamed from: c */
        private float f1972c;

        /* renamed from: d */
        private float f1973d;

        /* renamed from: e */
        private long f1974e = Long.MIN_VALUE;

        /* renamed from: f */
        private long f1975f = 0;

        /* renamed from: g */
        private int f1976g = 0;

        /* renamed from: h */
        private int f1977h = 0;

        /* renamed from: i */
        private long f1978i = -1;

        /* renamed from: j */
        private float f1979j;

        /* renamed from: k */
        private int f1980k;

        C0676a() {
        }

        /* renamed from: a */
        private float m3193a(float f) {
            return (-4.0f * f * f) + (f * 4.0f);
        }

        /* renamed from: a */
        private float m3194a(long j) {
            if (j < this.f1974e) {
                return 0.0f;
            }
            if (this.f1978i < 0 || j < this.f1978i) {
                return C0675a.m3171a(((float) (j - this.f1974e)) / ((float) this.f1970a), 0.0f, 1.0f) * 0.5f;
            }
            return (1.0f - this.f1979j) + (this.f1979j * C0675a.m3171a(((float) (j - this.f1978i)) / ((float) this.f1980k), 0.0f, 1.0f));
        }

        /* renamed from: a */
        public void mo2791a() {
            this.f1974e = AnimationUtils.currentAnimationTimeMillis();
            this.f1978i = -1;
            this.f1975f = this.f1974e;
            this.f1979j = 0.5f;
            this.f1976g = 0;
            this.f1977h = 0;
        }

        /* renamed from: a */
        public void mo2792a(float f, float f2) {
            this.f1972c = f;
            this.f1973d = f2;
        }

        /* renamed from: a */
        public void mo2793a(int i) {
            this.f1970a = i;
        }

        /* renamed from: b */
        public void mo2794b() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f1980k = C0675a.m3174a((int) (currentAnimationTimeMillis - this.f1974e), 0, this.f1971b);
            this.f1979j = m3194a(currentAnimationTimeMillis);
            this.f1978i = currentAnimationTimeMillis;
        }

        /* renamed from: b */
        public void mo2795b(int i) {
            this.f1971b = i;
        }

        /* renamed from: c */
        public boolean mo2796c() {
            return this.f1978i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f1978i + ((long) this.f1980k);
        }

        /* renamed from: d */
        public void mo2797d() {
            if (this.f1975f != 0) {
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                float a = m3193a(m3194a(currentAnimationTimeMillis));
                long j = currentAnimationTimeMillis - this.f1975f;
                this.f1975f = currentAnimationTimeMillis;
                float f = ((float) j) * a;
                this.f1976g = (int) (this.f1972c * f);
                this.f1977h = (int) (f * this.f1973d);
                return;
            }
            throw new RuntimeException("Cannot compute scroll delta before calling start()");
        }

        /* renamed from: e */
        public int mo2798e() {
            return (int) (this.f1972c / Math.abs(this.f1972c));
        }

        /* renamed from: f */
        public int mo2799f() {
            return (int) (this.f1973d / Math.abs(this.f1973d));
        }

        /* renamed from: g */
        public int mo2800g() {
            return this.f1976g;
        }

        /* renamed from: h */
        public int mo2801h() {
            return this.f1977h;
        }
    }

    /* renamed from: android.support.v4.widget.a$b */
    private class C0677b implements Runnable {
        C0677b() {
        }

        public void run() {
            if (C0675a.this.f1957e) {
                if (C0675a.this.f1955c) {
                    C0675a.this.f1955c = false;
                    C0675a.this.f1953a.mo2791a();
                }
                C0676a aVar = C0675a.this.f1953a;
                if (aVar.mo2796c() || !C0675a.this.mo2779a()) {
                    C0675a.this.f1957e = false;
                    return;
                }
                if (C0675a.this.f1956d) {
                    C0675a.this.f1956d = false;
                    C0675a.this.mo2782b();
                }
                aVar.mo2797d();
                C0675a.this.mo2778a(aVar.mo2800g(), aVar.mo2801h());
                C0626s.m2847a(C0675a.this.f1954b, (Runnable) this);
            }
        }
    }

    public C0675a(View view) {
        this.f1954b = view;
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        int i = (int) ((displayMetrics.density * 1575.0f) + 0.5f);
        int i2 = (int) ((displayMetrics.density * 315.0f) + 0.5f);
        float f = (float) i;
        mo2775a(f, f);
        float f2 = (float) i2;
        mo2780b(f2, f2);
        mo2776a(1);
        mo2787e(Float.MAX_VALUE, Float.MAX_VALUE);
        mo2785d(0.2f, 0.2f);
        mo2783c(1.0f, 1.0f);
        mo2781b(f1952r);
        mo2784c(500);
        mo2786d(500);
    }

    /* renamed from: a */
    static float m3171a(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    /* renamed from: a */
    private float m3172a(float f, float f2, float f3, float f4) {
        float f5;
        float a = m3171a(f * f2, 0.0f, f3);
        float f6 = m3177f(f2 - f4, a) - m3177f(f4, a);
        if (f6 < 0.0f) {
            f5 = -this.f1958f.getInterpolation(-f6);
        } else if (f6 <= 0.0f) {
            return 0.0f;
        } else {
            f5 = this.f1958f.getInterpolation(f6);
        }
        return m3171a(f5, -1.0f, 1.0f);
    }

    /* renamed from: a */
    private float m3173a(int i, float f, float f2, float f3) {
        float a = m3172a(this.f1960h[i], f2, this.f1961i[i], f);
        if (a == 0.0f) {
            return 0.0f;
        }
        float f4 = this.f1964l[i];
        float f5 = this.f1965m[i];
        float f6 = this.f1966n[i];
        float f7 = f4 * f3;
        return a > 0.0f ? m3171a(a * f7, f5, f6) : -m3171a((-a) * f7, f5, f6);
    }

    /* renamed from: a */
    static int m3174a(int i, int i2, int i3) {
        return i > i3 ? i3 : i < i2 ? i2 : i;
    }

    /* renamed from: c */
    private void m3175c() {
        if (this.f1959g == null) {
            this.f1959g = new C0677b();
        }
        this.f1957e = true;
        this.f1955c = true;
        if (this.f1967o || this.f1963k <= 0) {
            this.f1959g.run();
        } else {
            C0626s.m2848a(this.f1954b, this.f1959g, (long) this.f1963k);
        }
        this.f1967o = true;
    }

    /* renamed from: d */
    private void m3176d() {
        if (this.f1955c) {
            this.f1957e = false;
        } else {
            this.f1953a.mo2794b();
        }
    }

    /* renamed from: f */
    private float m3177f(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        switch (this.f1962j) {
            case 0:
            case 1:
                if (f < f2) {
                    return f >= 0.0f ? 1.0f - (f / f2) : (!this.f1957e || this.f1962j != 1) ? 0.0f : 1.0f;
                }
                break;
            case 2:
                if (f < 0.0f) {
                    return f / (-f2);
                }
                break;
        }
    }

    /* renamed from: a */
    public C0675a mo2775a(float f, float f2) {
        this.f1966n[0] = f / 1000.0f;
        this.f1966n[1] = f2 / 1000.0f;
        return this;
    }

    /* renamed from: a */
    public C0675a mo2776a(int i) {
        this.f1962j = i;
        return this;
    }

    /* renamed from: a */
    public C0675a mo2777a(boolean z) {
        if (this.f1968p && !z) {
            m3176d();
        }
        this.f1968p = z;
        return this;
    }

    /* renamed from: a */
    public abstract void mo2778a(int i, int i2);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo2779a() {
        C0676a aVar = this.f1953a;
        int f = aVar.mo2799f();
        int e = aVar.mo2798e();
        return (f != 0 && mo2789f(f)) || (e != 0 && mo2788e(e));
    }

    /* renamed from: b */
    public C0675a mo2780b(float f, float f2) {
        this.f1965m[0] = f / 1000.0f;
        this.f1965m[1] = f2 / 1000.0f;
        return this;
    }

    /* renamed from: b */
    public C0675a mo2781b(int i) {
        this.f1963k = i;
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo2782b() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f1954b.onTouchEvent(obtain);
        obtain.recycle();
    }

    /* renamed from: c */
    public C0675a mo2783c(float f, float f2) {
        this.f1964l[0] = f / 1000.0f;
        this.f1964l[1] = f2 / 1000.0f;
        return this;
    }

    /* renamed from: c */
    public C0675a mo2784c(int i) {
        this.f1953a.mo2793a(i);
        return this;
    }

    /* renamed from: d */
    public C0675a mo2785d(float f, float f2) {
        this.f1960h[0] = f;
        this.f1960h[1] = f2;
        return this;
    }

    /* renamed from: d */
    public C0675a mo2786d(int i) {
        this.f1953a.mo2795b(i);
        return this;
    }

    /* renamed from: e */
    public C0675a mo2787e(float f, float f2) {
        this.f1961i[0] = f;
        this.f1961i[1] = f2;
        return this;
    }

    /* renamed from: e */
    public abstract boolean mo2788e(int i);

    /* renamed from: f */
    public abstract boolean mo2789f(int i);

    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z = false;
        if (!this.f1968p) {
            return false;
        }
        switch (motionEvent.getActionMasked()) {
            case 0:
                this.f1956d = true;
                this.f1967o = false;
                break;
            case 1:
            case 3:
                m3176d();
                break;
            case 2:
                break;
        }
        this.f1953a.mo2792a(m3173a(0, motionEvent.getX(), (float) view.getWidth(), (float) this.f1954b.getWidth()), m3173a(1, motionEvent.getY(), (float) view.getHeight(), (float) this.f1954b.getHeight()));
        if (!this.f1957e && mo2779a()) {
            m3175c();
        }
        if (this.f1969q && this.f1957e) {
            z = true;
        }
        return z;
    }
}
