package android.support.p009v4.widget;

import android.content.Context;
import android.support.p009v4.view.C0626s;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;

/* renamed from: android.support.v4.widget.s */
public class C0721s {

    /* renamed from: v */
    private static final Interpolator f2056v = new Interpolator() {
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };

    /* renamed from: a */
    private int f2057a;

    /* renamed from: b */
    private int f2058b;

    /* renamed from: c */
    private int f2059c = -1;

    /* renamed from: d */
    private float[] f2060d;

    /* renamed from: e */
    private float[] f2061e;

    /* renamed from: f */
    private float[] f2062f;

    /* renamed from: g */
    private float[] f2063g;

    /* renamed from: h */
    private int[] f2064h;

    /* renamed from: i */
    private int[] f2065i;

    /* renamed from: j */
    private int[] f2066j;

    /* renamed from: k */
    private int f2067k;

    /* renamed from: l */
    private VelocityTracker f2068l;

    /* renamed from: m */
    private float f2069m;

    /* renamed from: n */
    private float f2070n;

    /* renamed from: o */
    private int f2071o;

    /* renamed from: p */
    private int f2072p;

    /* renamed from: q */
    private OverScroller f2073q;

    /* renamed from: r */
    private final C0724a f2074r;

    /* renamed from: s */
    private View f2075s;

    /* renamed from: t */
    private boolean f2076t;

    /* renamed from: u */
    private final ViewGroup f2077u;

    /* renamed from: w */
    private final Runnable f2078w = new Runnable() {
        public void run() {
            C0721s.this.mo2928c(0);
        }
    };

    /* renamed from: android.support.v4.widget.s$a */
    public static abstract class C0724a {
        /* renamed from: a */
        public int mo454a(View view) {
            return 0;
        }

        /* renamed from: a */
        public int mo455a(View view, int i, int i2) {
            return 0;
        }

        /* renamed from: a */
        public void mo456a(int i) {
        }

        /* renamed from: a */
        public void mo2649a(int i, int i2) {
        }

        /* renamed from: a */
        public void mo457a(View view, float f, float f2) {
        }

        /* renamed from: a */
        public void mo458a(View view, int i, int i2, int i3, int i4) {
        }

        /* renamed from: a */
        public abstract boolean mo459a(View view, int i);

        /* renamed from: b */
        public int mo654b(View view) {
            return 0;
        }

        /* renamed from: b */
        public int mo460b(View view, int i, int i2) {
            return 0;
        }

        /* renamed from: b */
        public void mo2652b(int i, int i2) {
        }

        /* renamed from: b */
        public void mo655b(View view, int i) {
        }

        /* renamed from: b */
        public boolean mo2653b(int i) {
            return false;
        }

        /* renamed from: c */
        public int mo2936c(int i) {
            return i;
        }
    }

    private C0721s(Context context, ViewGroup viewGroup, C0724a aVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        } else if (aVar != null) {
            this.f2077u = viewGroup;
            this.f2074r = aVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.f2071o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.f2058b = viewConfiguration.getScaledTouchSlop();
            this.f2069m = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.f2070n = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.f2073q = new OverScroller(context, f2056v);
        } else {
            throw new IllegalArgumentException("Callback may not be null");
        }
    }

    /* renamed from: a */
    private float m3347a(float f, float f2, float f3) {
        float abs = Math.abs(f);
        if (abs < f2) {
            return 0.0f;
        }
        if (abs <= f3) {
            return f;
        }
        if (f <= 0.0f) {
            f3 = -f3;
        }
        return f3;
    }

    /* renamed from: a */
    private int m3348a(int i, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        int width = this.f2077u.getWidth();
        float f = (float) (width / 2);
        float b = f + (m3357b(Math.min(1.0f, ((float) Math.abs(i)) / ((float) width))) * f);
        int abs = Math.abs(i2);
        return Math.min(abs > 0 ? Math.round(Math.abs(b / ((float) abs)) * 1000.0f) * 4 : (int) (((((float) Math.abs(i)) / ((float) i3)) + 1.0f) * 256.0f), 600);
    }

    /* renamed from: a */
    private int m3349a(View view, int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int b = m3358b(i3, (int) this.f2070n, (int) this.f2069m);
        int b2 = m3358b(i4, (int) this.f2070n, (int) this.f2069m);
        int abs = Math.abs(i);
        int abs2 = Math.abs(i2);
        int abs3 = Math.abs(b);
        int abs4 = Math.abs(b2);
        int i5 = abs3 + abs4;
        int i6 = abs + abs2;
        if (b != 0) {
            f = (float) abs3;
            f2 = (float) i5;
        } else {
            f = (float) abs;
            f2 = (float) i6;
        }
        float f5 = f / f2;
        if (b2 != 0) {
            f3 = (float) abs4;
            f4 = (float) i5;
        } else {
            f3 = (float) abs2;
            f4 = (float) i6;
        }
        float f6 = f3 / f4;
        return (int) ((((float) m3348a(i, b, this.f2074r.mo654b(view))) * f5) + (((float) m3348a(i2, b2, this.f2074r.mo454a(view))) * f6));
    }

    /* renamed from: a */
    public static C0721s m3350a(ViewGroup viewGroup, float f, C0724a aVar) {
        C0721s a = m3351a(viewGroup, aVar);
        a.f2058b = (int) (((float) a.f2058b) * (1.0f / f));
        return a;
    }

    /* renamed from: a */
    public static C0721s m3351a(ViewGroup viewGroup, C0724a aVar) {
        return new C0721s(viewGroup.getContext(), viewGroup, aVar);
    }

    /* renamed from: a */
    private void m3352a(float f, float f2) {
        this.f2076t = true;
        this.f2074r.mo457a(this.f2075s, f, f2);
        this.f2076t = false;
        if (this.f2057a == 1) {
            mo2928c(0);
        }
    }

    /* renamed from: a */
    private void m3353a(float f, float f2, int i) {
        m3365f(i);
        float[] fArr = this.f2060d;
        this.f2062f[i] = f;
        fArr[i] = f;
        float[] fArr2 = this.f2061e;
        this.f2063g[i] = f2;
        fArr2[i] = f2;
        this.f2064h[i] = m3362e((int) f, (int) f2);
        this.f2067k |= 1 << i;
    }

    /* renamed from: a */
    private boolean m3354a(float f, float f2, int i, int i2) {
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        boolean z = false;
        if (!((this.f2064h[i] & i2) != i2 || (this.f2072p & i2) == 0 || (this.f2066j[i] & i2) == i2 || (this.f2065i[i] & i2) == i2 || (abs <= ((float) this.f2058b) && abs2 <= ((float) this.f2058b)))) {
            if (abs < abs2 * 0.5f && this.f2074r.mo2653b(i2)) {
                int[] iArr = this.f2066j;
                iArr[i] = iArr[i] | i2;
                return false;
            } else if ((this.f2065i[i] & i2) == 0 && abs > ((float) this.f2058b)) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: a */
    private boolean m3355a(int i, int i2, int i3, int i4) {
        int left = this.f2075s.getLeft();
        int top = this.f2075s.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.f2073q.abortAnimation();
            mo2928c(0);
            return false;
        }
        this.f2073q.startScroll(left, top, i5, i6, m3349a(this.f2075s, i5, i6, i3, i4));
        mo2928c(2);
        return true;
    }

    /* renamed from: a */
    private boolean m3356a(View view, float f, float f2) {
        boolean z = false;
        if (view == null) {
            return false;
        }
        boolean z2 = this.f2074r.mo654b(view) > 0;
        boolean z3 = this.f2074r.mo454a(view) > 0;
        if (z2 && z3) {
            if ((f * f) + (f2 * f2) > ((float) (this.f2058b * this.f2058b))) {
                z = true;
            }
            return z;
        } else if (z2) {
            if (Math.abs(f) > ((float) this.f2058b)) {
                z = true;
            }
            return z;
        } else {
            if (z3 && Math.abs(f2) > ((float) this.f2058b)) {
                z = true;
            }
            return z;
        }
    }

    /* renamed from: b */
    private float m3357b(float f) {
        return (float) Math.sin((double) ((f - 0.5f) * 0.47123894f));
    }

    /* renamed from: b */
    private int m3358b(int i, int i2, int i3) {
        int abs = Math.abs(i);
        if (abs < i2) {
            return 0;
        }
        if (abs <= i3) {
            return i;
        }
        if (i <= 0) {
            i3 = -i3;
        }
        return i3;
    }

    /* renamed from: b */
    private void m3359b(float f, float f2, int i) {
        int i2 = 1;
        if (!m3354a(f, f2, i, 1)) {
            i2 = 0;
        }
        if (m3354a(f2, f, i, 4)) {
            i2 |= 4;
        }
        if (m3354a(f, f2, i, 2)) {
            i2 |= 2;
        }
        if (m3354a(f2, f, i, 8)) {
            i2 |= 8;
        }
        if (i2 != 0) {
            int[] iArr = this.f2065i;
            iArr[i] = iArr[i] | i2;
            this.f2074r.mo2652b(i2, i);
        }
    }

    /* renamed from: b */
    private void m3360b(int i, int i2, int i3, int i4) {
        int left = this.f2075s.getLeft();
        int top = this.f2075s.getTop();
        if (i3 != 0) {
            i = this.f2074r.mo460b(this.f2075s, i, i3);
            C0626s.m2862e(this.f2075s, i - left);
        }
        int i5 = i;
        if (i4 != 0) {
            i2 = this.f2074r.mo455a(this.f2075s, i2, i4);
            C0626s.m2860d(this.f2075s, i2 - top);
        }
        int i6 = i2;
        if (i3 != 0 || i4 != 0) {
            this.f2074r.mo458a(this.f2075s, i5, i6, i5 - left, i6 - top);
        }
    }

    /* renamed from: c */
    private void m3361c(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (m3367g(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f2062f[pointerId] = x;
                this.f2063g[pointerId] = y;
            }
        }
    }

    /* renamed from: e */
    private int m3362e(int i, int i2) {
        int i3 = i < this.f2077u.getLeft() + this.f2071o ? 1 : 0;
        if (i2 < this.f2077u.getTop() + this.f2071o) {
            i3 |= 4;
        }
        if (i > this.f2077u.getRight() - this.f2071o) {
            i3 |= 2;
        }
        return i2 > this.f2077u.getBottom() - this.f2071o ? i3 | 8 : i3;
    }

    /* renamed from: e */
    private void m3363e(int i) {
        if (this.f2060d != null && mo2923b(i)) {
            this.f2060d[i] = 0.0f;
            this.f2061e[i] = 0.0f;
            this.f2062f[i] = 0.0f;
            this.f2063g[i] = 0.0f;
            this.f2064h[i] = 0;
            this.f2065i[i] = 0;
            this.f2066j[i] = 0;
            this.f2067k = ((1 << i) ^ -1) & this.f2067k;
        }
    }

    /* renamed from: f */
    private void m3364f() {
        if (this.f2060d != null) {
            Arrays.fill(this.f2060d, 0.0f);
            Arrays.fill(this.f2061e, 0.0f);
            Arrays.fill(this.f2062f, 0.0f);
            Arrays.fill(this.f2063g, 0.0f);
            Arrays.fill(this.f2064h, 0);
            Arrays.fill(this.f2065i, 0);
            Arrays.fill(this.f2066j, 0);
            this.f2067k = 0;
        }
    }

    /* renamed from: f */
    private void m3365f(int i) {
        if (this.f2060d == null || this.f2060d.length <= i) {
            int i2 = i + 1;
            float[] fArr = new float[i2];
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            if (this.f2060d != null) {
                System.arraycopy(this.f2060d, 0, fArr, 0, this.f2060d.length);
                System.arraycopy(this.f2061e, 0, fArr2, 0, this.f2061e.length);
                System.arraycopy(this.f2062f, 0, fArr3, 0, this.f2062f.length);
                System.arraycopy(this.f2063g, 0, fArr4, 0, this.f2063g.length);
                System.arraycopy(this.f2064h, 0, iArr, 0, this.f2064h.length);
                System.arraycopy(this.f2065i, 0, iArr2, 0, this.f2065i.length);
                System.arraycopy(this.f2066j, 0, iArr3, 0, this.f2066j.length);
            }
            this.f2060d = fArr;
            this.f2061e = fArr2;
            this.f2062f = fArr3;
            this.f2063g = fArr4;
            this.f2064h = iArr;
            this.f2065i = iArr2;
            this.f2066j = iArr3;
        }
    }

    /* renamed from: g */
    private void m3366g() {
        this.f2068l.computeCurrentVelocity(1000, this.f2069m);
        m3352a(m3347a(this.f2068l.getXVelocity(this.f2059c), this.f2070n, this.f2069m), m3347a(this.f2068l.getYVelocity(this.f2059c), this.f2070n, this.f2069m));
    }

    /* renamed from: g */
    private boolean m3367g(int i) {
        if (mo2923b(i)) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Ignoring pointerId=");
        sb.append(i);
        sb.append(" because ACTION_DOWN was not received ");
        sb.append("for this pointer before ACTION_MOVE. It likely happened because ");
        sb.append(" ViewDragHelper did not receive all the events in the event stream.");
        Log.e("ViewDragHelper", sb.toString());
        return false;
    }

    /* renamed from: a */
    public int mo2913a() {
        return this.f2057a;
    }

    /* renamed from: a */
    public void mo2914a(float f) {
        this.f2070n = f;
    }

    /* renamed from: a */
    public void mo2915a(int i) {
        this.f2072p = i;
    }

    /* renamed from: a */
    public void mo2916a(View view, int i) {
        if (view.getParent() == this.f2077u) {
            this.f2075s = view;
            this.f2059c = i;
            this.f2074r.mo655b(view, i);
            mo2928c(1);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
        sb.append(this.f2077u);
        sb.append(")");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public boolean mo2917a(int i, int i2) {
        if (this.f2076t) {
            return m3355a(i, i2, (int) this.f2068l.getXVelocity(this.f2059c), (int) this.f2068l.getYVelocity(this.f2059c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d4, code lost:
        if (r12 != r11) goto L_0x00dd;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo2918a(android.view.MotionEvent r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            int r2 = r17.getActionMasked()
            int r3 = r17.getActionIndex()
            if (r2 != 0) goto L_0x0011
            r16.mo2933e()
        L_0x0011:
            android.view.VelocityTracker r4 = r0.f2068l
            if (r4 != 0) goto L_0x001b
            android.view.VelocityTracker r4 = android.view.VelocityTracker.obtain()
            r0.f2068l = r4
        L_0x001b:
            android.view.VelocityTracker r4 = r0.f2068l
            r4.addMovement(r1)
            r4 = 2
            r6 = 1
            switch(r2) {
                case 0: goto L_0x00fb;
                case 1: goto L_0x00f6;
                case 2: goto L_0x0067;
                case 3: goto L_0x00f6;
                case 4: goto L_0x0025;
                case 5: goto L_0x0030;
                case 6: goto L_0x0028;
                default: goto L_0x0025;
            }
        L_0x0025:
            r5 = 0
            goto L_0x012d
        L_0x0028:
            int r1 = r1.getPointerId(r3)
            r0.m3363e(r1)
            goto L_0x0025
        L_0x0030:
            int r2 = r1.getPointerId(r3)
            float r7 = r1.getX(r3)
            float r1 = r1.getY(r3)
            r0.m3353a(r7, r1, r2)
            int r3 = r0.f2057a
            if (r3 != 0) goto L_0x0055
            int[] r1 = r0.f2064h
            r1 = r1[r2]
            int r3 = r0.f2072p
            r3 = r3 & r1
            if (r3 == 0) goto L_0x0025
            android.support.v4.widget.s$a r3 = r0.f2074r
            int r4 = r0.f2072p
            r1 = r1 & r4
            r3.mo2649a(r1, r2)
            goto L_0x0025
        L_0x0055:
            int r3 = r0.f2057a
            if (r3 != r4) goto L_0x0025
            int r3 = (int) r7
            int r1 = (int) r1
            android.view.View r1 = r0.mo2931d(r3, r1)
            android.view.View r3 = r0.f2075s
            if (r1 != r3) goto L_0x0025
            r0.mo2925b(r1, r2)
            goto L_0x0025
        L_0x0067:
            float[] r2 = r0.f2060d
            if (r2 == 0) goto L_0x0025
            float[] r2 = r0.f2061e
            if (r2 != 0) goto L_0x0070
            goto L_0x0025
        L_0x0070:
            int r2 = r17.getPointerCount()
            r3 = 0
        L_0x0075:
            if (r3 >= r2) goto L_0x00f1
            int r4 = r1.getPointerId(r3)
            boolean r7 = r0.m3367g(r4)
            if (r7 != 0) goto L_0x0083
            goto L_0x00ee
        L_0x0083:
            float r7 = r1.getX(r3)
            float r8 = r1.getY(r3)
            float[] r9 = r0.f2060d
            r9 = r9[r4]
            float r9 = r7 - r9
            float[] r10 = r0.f2061e
            r10 = r10[r4]
            float r10 = r8 - r10
            int r7 = (int) r7
            int r8 = (int) r8
            android.view.View r7 = r0.mo2931d(r7, r8)
            if (r7 == 0) goto L_0x00a7
            boolean r8 = r0.m3356a(r7, r9, r10)
            if (r8 == 0) goto L_0x00a7
            r8 = 1
            goto L_0x00a8
        L_0x00a7:
            r8 = 0
        L_0x00a8:
            if (r8 == 0) goto L_0x00dd
            int r11 = r7.getLeft()
            int r12 = (int) r9
            int r13 = r11 + r12
            android.support.v4.widget.s$a r14 = r0.f2074r
            int r12 = r14.mo460b(r7, r13, r12)
            int r13 = r7.getTop()
            int r14 = (int) r10
            int r15 = r13 + r14
            android.support.v4.widget.s$a r5 = r0.f2074r
            int r5 = r5.mo455a(r7, r15, r14)
            android.support.v4.widget.s$a r14 = r0.f2074r
            int r14 = r14.mo654b(r7)
            android.support.v4.widget.s$a r15 = r0.f2074r
            int r15 = r15.mo454a(r7)
            if (r14 == 0) goto L_0x00d6
            if (r14 <= 0) goto L_0x00dd
            if (r12 != r11) goto L_0x00dd
        L_0x00d6:
            if (r15 == 0) goto L_0x00f1
            if (r15 <= 0) goto L_0x00dd
            if (r5 != r13) goto L_0x00dd
            goto L_0x00f1
        L_0x00dd:
            r0.m3359b(r9, r10, r4)
            int r5 = r0.f2057a
            if (r5 != r6) goto L_0x00e5
            goto L_0x00f1
        L_0x00e5:
            if (r8 == 0) goto L_0x00ee
            boolean r4 = r0.mo2925b(r7, r4)
            if (r4 == 0) goto L_0x00ee
            goto L_0x00f1
        L_0x00ee:
            int r3 = r3 + 1
            goto L_0x0075
        L_0x00f1:
            r16.m3361c(r17)
            goto L_0x0025
        L_0x00f6:
            r16.mo2933e()
            goto L_0x0025
        L_0x00fb:
            float r2 = r17.getX()
            float r3 = r17.getY()
            r5 = 0
            int r1 = r1.getPointerId(r5)
            r0.m3353a(r2, r3, r1)
            int r2 = (int) r2
            int r3 = (int) r3
            android.view.View r2 = r0.mo2931d(r2, r3)
            android.view.View r3 = r0.f2075s
            if (r2 != r3) goto L_0x011c
            int r3 = r0.f2057a
            if (r3 != r4) goto L_0x011c
            r0.mo2925b(r2, r1)
        L_0x011c:
            int[] r2 = r0.f2064h
            r2 = r2[r1]
            int r3 = r0.f2072p
            r3 = r3 & r2
            if (r3 == 0) goto L_0x012d
            android.support.v4.widget.s$a r3 = r0.f2074r
            int r4 = r0.f2072p
            r2 = r2 & r4
            r3.mo2649a(r2, r1)
        L_0x012d:
            int r1 = r0.f2057a
            if (r1 != r6) goto L_0x0132
            r5 = 1
        L_0x0132:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p009v4.widget.C0721s.mo2918a(android.view.MotionEvent):boolean");
    }

    /* renamed from: a */
    public boolean mo2919a(View view, int i, int i2) {
        this.f2075s = view;
        this.f2059c = -1;
        boolean a = m3355a(i, i2, 0, 0);
        if (!a && this.f2057a == 0 && this.f2075s != null) {
            this.f2075s = null;
        }
        return a;
    }

    /* renamed from: a */
    public boolean mo2920a(boolean z) {
        if (this.f2057a == 2) {
            boolean computeScrollOffset = this.f2073q.computeScrollOffset();
            int currX = this.f2073q.getCurrX();
            int currY = this.f2073q.getCurrY();
            int left = currX - this.f2075s.getLeft();
            int top = currY - this.f2075s.getTop();
            if (left != 0) {
                C0626s.m2862e(this.f2075s, left);
            }
            if (top != 0) {
                C0626s.m2860d(this.f2075s, top);
            }
            if (!(left == 0 && top == 0)) {
                this.f2074r.mo458a(this.f2075s, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.f2073q.getFinalX() && currY == this.f2073q.getFinalY()) {
                this.f2073q.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                if (z) {
                    this.f2077u.post(this.f2078w);
                } else {
                    mo2928c(0);
                }
            }
        }
        return this.f2057a == 2;
    }

    /* renamed from: b */
    public int mo2921b() {
        return this.f2071o;
    }

    /* renamed from: b */
    public void mo2922b(MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            mo2933e();
        }
        if (this.f2068l == null) {
            this.f2068l = VelocityTracker.obtain();
        }
        this.f2068l.addMovement(motionEvent);
        int i2 = 0;
        switch (actionMasked) {
            case 0:
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                int pointerId = motionEvent.getPointerId(0);
                View d = mo2931d((int) x, (int) y);
                m3353a(x, y, pointerId);
                mo2925b(d, pointerId);
                int i3 = this.f2064h[pointerId];
                if ((this.f2072p & i3) != 0) {
                    this.f2074r.mo2649a(i3 & this.f2072p, pointerId);
                    return;
                }
                return;
            case 1:
                if (this.f2057a == 1) {
                    m3366g();
                    break;
                }
                break;
            case 2:
                if (this.f2057a != 1) {
                    int pointerCount = motionEvent.getPointerCount();
                    while (i2 < pointerCount) {
                        int pointerId2 = motionEvent.getPointerId(i2);
                        if (m3367g(pointerId2)) {
                            float x2 = motionEvent.getX(i2);
                            float y2 = motionEvent.getY(i2);
                            float f = x2 - this.f2060d[pointerId2];
                            float f2 = y2 - this.f2061e[pointerId2];
                            m3359b(f, f2, pointerId2);
                            if (this.f2057a != 1) {
                                View d2 = mo2931d((int) x2, (int) y2);
                                if (m3356a(d2, f, f2) && mo2925b(d2, pointerId2)) {
                                }
                            }
                        }
                        i2++;
                    }
                } else if (m3367g(this.f2059c)) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f2059c);
                    float x3 = motionEvent.getX(findPointerIndex);
                    int i4 = (int) (x3 - this.f2062f[this.f2059c]);
                    int y3 = (int) (motionEvent.getY(findPointerIndex) - this.f2063g[this.f2059c]);
                    m3360b(this.f2075s.getLeft() + i4, this.f2075s.getTop() + y3, i4, y3);
                } else {
                    return;
                }
                m3361c(motionEvent);
                return;
            case 3:
                if (this.f2057a == 1) {
                    m3352a(0.0f, 0.0f);
                    break;
                }
                break;
            case 5:
                int pointerId3 = motionEvent.getPointerId(actionIndex);
                float x4 = motionEvent.getX(actionIndex);
                float y4 = motionEvent.getY(actionIndex);
                m3353a(x4, y4, pointerId3);
                if (this.f2057a == 0) {
                    mo2925b(mo2931d((int) x4, (int) y4), pointerId3);
                    int i5 = this.f2064h[pointerId3];
                    if ((this.f2072p & i5) != 0) {
                        this.f2074r.mo2649a(i5 & this.f2072p, pointerId3);
                        return;
                    }
                    return;
                } else if (mo2929c((int) x4, (int) y4)) {
                    mo2925b(this.f2075s, pointerId3);
                    return;
                } else {
                    return;
                }
            case 6:
                int pointerId4 = motionEvent.getPointerId(actionIndex);
                if (this.f2057a == 1 && pointerId4 == this.f2059c) {
                    int pointerCount2 = motionEvent.getPointerCount();
                    while (true) {
                        if (i2 < pointerCount2) {
                            int pointerId5 = motionEvent.getPointerId(i2);
                            if (pointerId5 != this.f2059c) {
                                if (mo2931d((int) motionEvent.getX(i2), (int) motionEvent.getY(i2)) == this.f2075s && mo2925b(this.f2075s, pointerId5)) {
                                    i = this.f2059c;
                                }
                            }
                            i2++;
                        } else {
                            i = -1;
                        }
                    }
                    if (i == -1) {
                        m3366g();
                    }
                }
                m3363e(pointerId4);
                return;
            default:
                return;
        }
        mo2933e();
    }

    /* renamed from: b */
    public boolean mo2923b(int i) {
        return ((1 << i) & this.f2067k) != 0;
    }

    /* renamed from: b */
    public boolean mo2924b(int i, int i2) {
        boolean z = false;
        if (!mo2923b(i2)) {
            return false;
        }
        boolean z2 = (i & 1) == 1;
        boolean z3 = (i & 2) == 2;
        float f = this.f2062f[i2] - this.f2060d[i2];
        float f2 = this.f2063g[i2] - this.f2061e[i2];
        if (z2 && z3) {
            if ((f * f) + (f2 * f2) > ((float) (this.f2058b * this.f2058b))) {
                z = true;
            }
            return z;
        } else if (z2) {
            if (Math.abs(f) > ((float) this.f2058b)) {
                z = true;
            }
            return z;
        } else {
            if (z3 && Math.abs(f2) > ((float) this.f2058b)) {
                z = true;
            }
            return z;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo2925b(View view, int i) {
        if (view == this.f2075s && this.f2059c == i) {
            return true;
        }
        if (view == null || !this.f2074r.mo459a(view, i)) {
            return false;
        }
        this.f2059c = i;
        mo2916a(view, i);
        return true;
    }

    /* renamed from: b */
    public boolean mo2926b(View view, int i, int i2) {
        boolean z = false;
        if (view == null) {
            return false;
        }
        if (i >= view.getLeft() && i < view.getRight() && i2 >= view.getTop() && i2 < view.getBottom()) {
            z = true;
        }
        return z;
    }

    /* renamed from: c */
    public View mo2927c() {
        return this.f2075s;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo2928c(int i) {
        this.f2077u.removeCallbacks(this.f2078w);
        if (this.f2057a != i) {
            this.f2057a = i;
            this.f2074r.mo456a(i);
            if (this.f2057a == 0) {
                this.f2075s = null;
            }
        }
    }

    /* renamed from: c */
    public boolean mo2929c(int i, int i2) {
        return mo2926b(this.f2075s, i, i2);
    }

    /* renamed from: d */
    public int mo2930d() {
        return this.f2058b;
    }

    /* renamed from: d */
    public View mo2931d(int i, int i2) {
        for (int childCount = this.f2077u.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f2077u.getChildAt(this.f2074r.mo2936c(childCount));
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: d */
    public boolean mo2932d(int i) {
        int length = this.f2060d.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (mo2924b(i, i2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public void mo2933e() {
        this.f2059c = -1;
        m3364f();
        if (this.f2068l != null) {
            this.f2068l.recycle();
            this.f2068l = null;
        }
    }
}
