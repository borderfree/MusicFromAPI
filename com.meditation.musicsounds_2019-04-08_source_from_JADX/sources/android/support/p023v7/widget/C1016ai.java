package android.support.p023v7.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.support.p009v4.view.C0626s;
import android.support.p023v7.widget.RecyclerView.C0936h;
import android.support.p023v7.widget.RecyclerView.C0945m;
import android.support.p023v7.widget.RecyclerView.C0946n;
import android.support.p023v7.widget.RecyclerView.C0955t;
import android.view.MotionEvent;

/* renamed from: android.support.v7.widget.ai */
class C1016ai extends C0936h implements C0945m {

    /* renamed from: g */
    private static final int[] f3487g = {16842919};

    /* renamed from: h */
    private static final int[] f3488h = new int[0];

    /* renamed from: A */
    private final int[] f3489A = new int[2];
    /* access modifiers changed from: private */

    /* renamed from: B */
    public final ValueAnimator f3490B = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
    /* access modifiers changed from: private */

    /* renamed from: C */
    public int f3491C = 0;

    /* renamed from: D */
    private final Runnable f3492D = new Runnable() {
        public void run() {
            C1016ai.this.mo5053a(500);
        }
    };

    /* renamed from: E */
    private final C0946n f3493E = new C0946n() {
        /* renamed from: a */
        public void mo4486a(RecyclerView recyclerView, int i, int i2) {
            C1016ai.this.mo5054a(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    };

    /* renamed from: a */
    int f3494a;

    /* renamed from: b */
    int f3495b;

    /* renamed from: c */
    float f3496c;

    /* renamed from: d */
    int f3497d;

    /* renamed from: e */
    int f3498e;

    /* renamed from: f */
    float f3499f;

    /* renamed from: i */
    private final int f3500i;

    /* renamed from: j */
    private final int f3501j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final StateListDrawable f3502k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final Drawable f3503l;

    /* renamed from: m */
    private final int f3504m;

    /* renamed from: n */
    private final int f3505n;

    /* renamed from: o */
    private final StateListDrawable f3506o;

    /* renamed from: p */
    private final Drawable f3507p;

    /* renamed from: q */
    private final int f3508q;

    /* renamed from: r */
    private final int f3509r;

    /* renamed from: s */
    private int f3510s = 0;

    /* renamed from: t */
    private int f3511t = 0;

    /* renamed from: u */
    private RecyclerView f3512u;

    /* renamed from: v */
    private boolean f3513v = false;

    /* renamed from: w */
    private boolean f3514w = false;

    /* renamed from: x */
    private int f3515x = 0;

    /* renamed from: y */
    private int f3516y = 0;

    /* renamed from: z */
    private final int[] f3517z = new int[2];

    /* renamed from: android.support.v7.widget.ai$a */
    private class C1019a extends AnimatorListenerAdapter {

        /* renamed from: b */
        private boolean f3521b;

        private C1019a() {
            this.f3521b = false;
        }

        public void onAnimationCancel(Animator animator) {
            this.f3521b = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (this.f3521b) {
                this.f3521b = false;
                return;
            }
            if (((Float) C1016ai.this.f3490B.getAnimatedValue()).floatValue() == 0.0f) {
                C1016ai.this.f3491C = 0;
                C1016ai.this.m5545b(0);
            } else {
                C1016ai.this.f3491C = 2;
                C1016ai.this.m5553d();
            }
        }
    }

    /* renamed from: android.support.v7.widget.ai$b */
    private class C1020b implements AnimatorUpdateListener {
        private C1020b() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            C1016ai.this.f3502k.setAlpha(floatValue);
            C1016ai.this.f3503l.setAlpha(floatValue);
            C1016ai.this.m5553d();
        }
    }

    C1016ai(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        this.f3502k = stateListDrawable;
        this.f3503l = drawable;
        this.f3506o = stateListDrawable2;
        this.f3507p = drawable2;
        this.f3504m = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f3505n = Math.max(i, drawable.getIntrinsicWidth());
        this.f3508q = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f3509r = Math.max(i, drawable2.getIntrinsicWidth());
        this.f3500i = i2;
        this.f3501j = i3;
        this.f3502k.setAlpha(255);
        this.f3503l.setAlpha(255);
        this.f3490B.addListener(new C1019a());
        this.f3490B.addUpdateListener(new C1020b());
        mo5055a(recyclerView);
    }

    /* renamed from: a */
    private int m5538a(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 == 0) {
            return 0;
        }
        int i5 = i - i3;
        int i6 = (int) (((f2 - f) / ((float) i4)) * ((float) i5));
        int i7 = i2 + i6;
        if (i7 >= i5 || i7 < 0) {
            return 0;
        }
        return i6;
    }

    /* renamed from: a */
    private void m5541a(float f) {
        int[] g = m5556g();
        float max = Math.max((float) g[0], Math.min((float) g[1], f));
        if (Math.abs(((float) this.f3495b) - max) >= 2.0f) {
            int a = m5538a(this.f3496c, max, g, this.f3512u.computeVerticalScrollRange(), this.f3512u.computeVerticalScrollOffset(), this.f3511t);
            if (a != 0) {
                this.f3512u.scrollBy(0, a);
            }
            this.f3496c = max;
        }
    }

    /* renamed from: a */
    private void m5542a(Canvas canvas) {
        int i = this.f3510s - this.f3504m;
        int i2 = this.f3495b - (this.f3494a / 2);
        this.f3502k.setBounds(0, 0, this.f3504m, this.f3494a);
        this.f3503l.setBounds(0, 0, this.f3505n, this.f3511t);
        if (m5554e()) {
            this.f3503l.draw(canvas);
            canvas.translate((float) this.f3504m, (float) i2);
            canvas.scale(-1.0f, 1.0f);
            this.f3502k.draw(canvas);
            canvas.scale(1.0f, 1.0f);
            i = this.f3504m;
        } else {
            canvas.translate((float) i, 0.0f);
            this.f3503l.draw(canvas);
            canvas.translate(0.0f, (float) i2);
            this.f3502k.draw(canvas);
        }
        canvas.translate((float) (-i), (float) (-i2));
    }

    /* renamed from: b */
    private void m5543b() {
        this.f3512u.mo4141a((C0936h) this);
        this.f3512u.mo4143a((C0945m) this);
        this.f3512u.mo4144a(this.f3493E);
    }

    /* renamed from: b */
    private void m5544b(float f) {
        int[] h = m5557h();
        float max = Math.max((float) h[0], Math.min((float) h[1], f));
        if (Math.abs(((float) this.f3498e) - max) >= 2.0f) {
            int a = m5538a(this.f3499f, max, h, this.f3512u.computeHorizontalScrollRange(), this.f3512u.computeHorizontalScrollOffset(), this.f3510s);
            if (a != 0) {
                this.f3512u.scrollBy(a, 0);
            }
            this.f3499f = max;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m5545b(int i) {
        int i2;
        if (i == 2 && this.f3515x != 2) {
            this.f3502k.setState(f3487g);
            m5555f();
        }
        if (i == 0) {
            m5553d();
        } else {
            mo5052a();
        }
        if (this.f3515x != 2 || i == 2) {
            if (i == 1) {
                i2 = 1500;
            }
            this.f3515x = i;
        }
        this.f3502k.setState(f3488h);
        i2 = 1200;
        m5551c(i2);
        this.f3515x = i;
    }

    /* renamed from: b */
    private void m5546b(Canvas canvas) {
        int i = this.f3511t - this.f3508q;
        int i2 = this.f3498e - (this.f3497d / 2);
        this.f3506o.setBounds(0, 0, this.f3497d, this.f3508q);
        this.f3507p.setBounds(0, 0, this.f3510s, this.f3509r);
        canvas.translate(0.0f, (float) i);
        this.f3507p.draw(canvas);
        canvas.translate((float) i2, 0.0f);
        this.f3506o.draw(canvas);
        canvas.translate((float) (-i2), (float) (-i));
    }

    /* renamed from: c */
    private void m5550c() {
        this.f3512u.mo4160b((C0936h) this);
        this.f3512u.mo4161b((C0945m) this);
        this.f3512u.mo4162b(this.f3493E);
        m5555f();
    }

    /* renamed from: c */
    private void m5551c(int i) {
        m5555f();
        this.f3512u.postDelayed(this.f3492D, (long) i);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m5553d() {
        this.f3512u.invalidate();
    }

    /* renamed from: e */
    private boolean m5554e() {
        return C0626s.m2861e(this.f3512u) == 1;
    }

    /* renamed from: f */
    private void m5555f() {
        this.f3512u.removeCallbacks(this.f3492D);
    }

    /* renamed from: g */
    private int[] m5556g() {
        this.f3517z[0] = this.f3501j;
        this.f3517z[1] = this.f3511t - this.f3501j;
        return this.f3517z;
    }

    /* renamed from: h */
    private int[] m5557h() {
        this.f3489A[0] = this.f3501j;
        this.f3489A[1] = this.f3510s - this.f3501j;
        return this.f3489A;
    }

    /* renamed from: a */
    public void mo5052a() {
        int i = this.f3491C;
        if (i != 0) {
            if (i == 3) {
                this.f3490B.cancel();
            } else {
                return;
            }
        }
        this.f3491C = 1;
        this.f3490B.setFloatValues(new float[]{((Float) this.f3490B.getAnimatedValue()).floatValue(), 1.0f});
        this.f3490B.setDuration(500);
        this.f3490B.setStartDelay(0);
        this.f3490B.start();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5053a(int i) {
        switch (this.f3491C) {
            case 1:
                this.f3490B.cancel();
                break;
            case 2:
                break;
            default:
                return;
        }
        this.f3491C = 3;
        this.f3490B.setFloatValues(new float[]{((Float) this.f3490B.getAnimatedValue()).floatValue(), 0.0f});
        this.f3490B.setDuration((long) i);
        this.f3490B.start();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5054a(int i, int i2) {
        int computeVerticalScrollRange = this.f3512u.computeVerticalScrollRange();
        int i3 = this.f3511t;
        this.f3513v = computeVerticalScrollRange - i3 > 0 && this.f3511t >= this.f3500i;
        int computeHorizontalScrollRange = this.f3512u.computeHorizontalScrollRange();
        int i4 = this.f3510s;
        this.f3514w = computeHorizontalScrollRange - i4 > 0 && this.f3510s >= this.f3500i;
        if (this.f3513v || this.f3514w) {
            if (this.f3513v) {
                float f = (float) i3;
                this.f3495b = (int) ((f * (((float) i2) + (f / 2.0f))) / ((float) computeVerticalScrollRange));
                this.f3494a = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
            }
            if (this.f3514w) {
                float f2 = (float) i4;
                this.f3498e = (int) ((f2 * (((float) i) + (f2 / 2.0f))) / ((float) computeHorizontalScrollRange));
                this.f3497d = Math.min(i4, (i4 * i4) / computeHorizontalScrollRange);
            }
            if (this.f3515x == 0 || this.f3515x == 1) {
                m5545b(1);
            }
            return;
        }
        if (this.f3515x != 0) {
            m5545b(0);
        }
    }

    /* renamed from: a */
    public void mo4371a(Canvas canvas, RecyclerView recyclerView, C0955t tVar) {
        if (this.f3510s == this.f3512u.getWidth() && this.f3511t == this.f3512u.getHeight()) {
            if (this.f3491C != 0) {
                if (this.f3513v) {
                    m5542a(canvas);
                }
                if (this.f3514w) {
                    m5546b(canvas);
                }
            }
            return;
        }
        this.f3510s = this.f3512u.getWidth();
        this.f3511t = this.f3512u.getHeight();
        m5545b(0);
    }

    /* renamed from: a */
    public void mo5055a(RecyclerView recyclerView) {
        if (this.f3512u != recyclerView) {
            if (this.f3512u != null) {
                m5550c();
            }
            this.f3512u = recyclerView;
            if (this.f3512u != null) {
                m5543b();
            }
        }
    }

    /* renamed from: a */
    public void mo4482a(boolean z) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo5056a(float f, float f2) {
        if (!m5554e() ? f >= ((float) (this.f3510s - this.f3504m)) : f <= ((float) (this.f3504m / 2))) {
            if (f2 >= ((float) (this.f3495b - (this.f3494a / 2))) && f2 <= ((float) (this.f3495b + (this.f3494a / 2)))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo4483a(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f3515x == 1) {
            boolean a = mo5056a(motionEvent.getX(), motionEvent.getY());
            boolean b = mo5057b(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!a && !b) {
                return false;
            }
            if (b) {
                this.f3516y = 1;
                this.f3499f = (float) ((int) motionEvent.getX());
            } else if (a) {
                this.f3516y = 2;
                this.f3496c = (float) ((int) motionEvent.getY());
            }
            m5545b(2);
        } else if (this.f3515x != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public void mo4484b(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f3515x != 0) {
            if (motionEvent.getAction() == 0) {
                boolean a = mo5056a(motionEvent.getX(), motionEvent.getY());
                boolean b = mo5057b(motionEvent.getX(), motionEvent.getY());
                if (a || b) {
                    if (b) {
                        this.f3516y = 1;
                        this.f3499f = (float) ((int) motionEvent.getX());
                    } else if (a) {
                        this.f3516y = 2;
                        this.f3496c = (float) ((int) motionEvent.getY());
                    }
                    m5545b(2);
                }
            } else if (motionEvent.getAction() == 1 && this.f3515x == 2) {
                this.f3496c = 0.0f;
                this.f3499f = 0.0f;
                m5545b(1);
                this.f3516y = 0;
            } else if (motionEvent.getAction() == 2 && this.f3515x == 2) {
                mo5052a();
                if (this.f3516y == 1) {
                    m5544b(motionEvent.getX());
                }
                if (this.f3516y == 2) {
                    m5541a(motionEvent.getY());
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo5057b(float f, float f2) {
        return f2 >= ((float) (this.f3511t - this.f3508q)) && f >= ((float) (this.f3498e - (this.f3497d / 2))) && f <= ((float) (this.f3498e + (this.f3497d / 2)));
    }
}
