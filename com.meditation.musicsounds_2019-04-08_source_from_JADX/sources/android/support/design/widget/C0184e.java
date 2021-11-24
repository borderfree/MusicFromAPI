package android.support.design.widget;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.support.p009v4.p014c.C0430a;
import android.support.p009v4.p018f.C0480c;
import android.support.p009v4.view.C0626s;
import android.support.p023v7.p024a.C0726a.C0736j;
import android.support.p023v7.widget.C1078bk;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import android.view.animation.Interpolator;

/* renamed from: android.support.design.widget.e */
final class C0184e {

    /* renamed from: a */
    private static final boolean f525a = (VERSION.SDK_INT < 18);

    /* renamed from: b */
    private static final Paint f526b = null;

    /* renamed from: A */
    private boolean f527A;

    /* renamed from: B */
    private Bitmap f528B;

    /* renamed from: C */
    private Paint f529C;

    /* renamed from: D */
    private float f530D;

    /* renamed from: E */
    private float f531E;

    /* renamed from: F */
    private float f532F;

    /* renamed from: G */
    private float f533G;

    /* renamed from: H */
    private int[] f534H;

    /* renamed from: I */
    private boolean f535I;

    /* renamed from: J */
    private final TextPaint f536J;

    /* renamed from: K */
    private Interpolator f537K;

    /* renamed from: L */
    private Interpolator f538L;

    /* renamed from: M */
    private float f539M;

    /* renamed from: N */
    private float f540N;

    /* renamed from: O */
    private float f541O;

    /* renamed from: P */
    private int f542P;

    /* renamed from: Q */
    private float f543Q;

    /* renamed from: R */
    private float f544R;

    /* renamed from: S */
    private float f545S;

    /* renamed from: T */
    private int f546T;

    /* renamed from: c */
    private final View f547c;

    /* renamed from: d */
    private boolean f548d;

    /* renamed from: e */
    private float f549e;

    /* renamed from: f */
    private final Rect f550f;

    /* renamed from: g */
    private final Rect f551g;

    /* renamed from: h */
    private final RectF f552h;

    /* renamed from: i */
    private int f553i = 16;

    /* renamed from: j */
    private int f554j = 16;

    /* renamed from: k */
    private float f555k = 15.0f;

    /* renamed from: l */
    private float f556l = 15.0f;

    /* renamed from: m */
    private ColorStateList f557m;

    /* renamed from: n */
    private ColorStateList f558n;

    /* renamed from: o */
    private float f559o;

    /* renamed from: p */
    private float f560p;

    /* renamed from: q */
    private float f561q;

    /* renamed from: r */
    private float f562r;

    /* renamed from: s */
    private float f563s;

    /* renamed from: t */
    private float f564t;

    /* renamed from: u */
    private Typeface f565u;

    /* renamed from: v */
    private Typeface f566v;

    /* renamed from: w */
    private Typeface f567w;

    /* renamed from: x */
    private CharSequence f568x;

    /* renamed from: y */
    private CharSequence f569y;

    /* renamed from: z */
    private boolean f570z;

    static {
        if (f526b != null) {
            f526b.setAntiAlias(true);
            f526b.setColor(-65281);
        }
    }

    public C0184e(View view) {
        this.f547c = view;
        this.f536J = new TextPaint(129);
        this.f551g = new Rect();
        this.f550f = new Rect();
        this.f552h = new RectF();
    }

    /* renamed from: a */
    private static float m681a(float f, float f2, float f3, Interpolator interpolator) {
        if (interpolator != null) {
            f3 = interpolator.getInterpolation(f3);
        }
        return C0163a.m648a(f, f2, f3);
    }

    /* renamed from: a */
    private static int m682a(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((((float) Color.alpha(i)) * f2) + (((float) Color.alpha(i2)) * f)), (int) ((((float) Color.red(i)) * f2) + (((float) Color.red(i2)) * f)), (int) ((((float) Color.green(i)) * f2) + (((float) Color.green(i2)) * f)), (int) ((((float) Color.blue(i)) * f2) + (((float) Color.blue(i2)) * f)));
    }

    /* renamed from: a */
    private static boolean m683a(float f, float f2) {
        return Math.abs(f - f2) < 0.001f;
    }

    /* renamed from: a */
    private static boolean m684a(Rect rect, int i, int i2, int i3, int i4) {
        return rect.left == i && rect.top == i2 && rect.right == i3 && rect.bottom == i4;
    }

    /* renamed from: a */
    private boolean m685a(Typeface typeface, Typeface typeface2) {
        return (typeface != null && !typeface.equals(typeface2)) || (typeface == null && typeface2 != null);
    }

    /* renamed from: b */
    private boolean m686b(CharSequence charSequence) {
        boolean z = true;
        if (C0626s.m2861e(this.f547c) != 1) {
            z = false;
        }
        return (z ? C0480c.f1443d : C0480c.f1442c).mo1875a(charSequence, 0, charSequence.length());
    }

    /* renamed from: c */
    private void m687c(float f) {
        TextPaint textPaint;
        int k;
        m689d(f);
        this.f563s = m681a(this.f561q, this.f562r, f, this.f537K);
        this.f564t = m681a(this.f559o, this.f560p, f, this.f537K);
        m690e(m681a(this.f555k, this.f556l, f, this.f538L));
        if (this.f558n != this.f557m) {
            textPaint = this.f536J;
            k = m682a(m693j(), m694k(), f);
        } else {
            textPaint = this.f536J;
            k = m694k();
        }
        textPaint.setColor(k);
        this.f536J.setShadowLayer(m681a(this.f543Q, this.f539M, f, (Interpolator) null), m681a(this.f544R, this.f540N, f, (Interpolator) null), m681a(this.f545S, this.f541O, f, (Interpolator) null), m682a(this.f546T, this.f542P, f));
        C0626s.m2857c(this.f547c);
    }

    /* renamed from: d */
    private Typeface m688d(int i) {
        TypedArray obtainStyledAttributes = this.f547c.getContext().obtainStyledAttributes(i, new int[]{16843692});
        try {
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                return Typeface.create(string, 0);
            }
            obtainStyledAttributes.recycle();
            return null;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: d */
    private void m689d(float f) {
        this.f552h.left = m681a((float) this.f550f.left, (float) this.f551g.left, f, this.f537K);
        this.f552h.top = m681a(this.f559o, this.f560p, f, this.f537K);
        this.f552h.right = m681a((float) this.f550f.right, (float) this.f551g.right, f, this.f537K);
        this.f552h.bottom = m681a((float) this.f550f.bottom, (float) this.f551g.bottom, f, this.f537K);
    }

    /* renamed from: e */
    private void m690e(float f) {
        m691f(f);
        this.f527A = f525a && this.f532F != 1.0f;
        if (this.f527A) {
            m696m();
        }
        C0626s.m2857c(this.f547c);
    }

    /* renamed from: f */
    private void m691f(float f) {
        boolean z;
        float f2;
        boolean z2;
        if (this.f568x != null) {
            float width = (float) this.f551g.width();
            float width2 = (float) this.f550f.width();
            boolean z3 = true;
            if (m683a(f, this.f556l)) {
                float f3 = this.f556l;
                this.f532F = 1.0f;
                if (m685a(this.f567w, this.f565u)) {
                    this.f567w = this.f565u;
                    z2 = true;
                } else {
                    z2 = false;
                }
                f2 = f3;
                z = z2;
            } else {
                f2 = this.f555k;
                if (m685a(this.f567w, this.f566v)) {
                    this.f567w = this.f566v;
                    z = true;
                } else {
                    z = false;
                }
                if (m683a(f, this.f555k)) {
                    this.f532F = 1.0f;
                } else {
                    this.f532F = f / this.f555k;
                }
                float f4 = this.f556l / this.f555k;
                width = width2 * f4 > width ? Math.min(width / f4, width2) : width2;
            }
            if (width > 0.0f) {
                z = this.f533G != f2 || this.f535I || z;
                this.f533G = f2;
                this.f535I = false;
            }
            if (this.f569y == null || z) {
                this.f536J.setTextSize(this.f533G);
                this.f536J.setTypeface(this.f567w);
                TextPaint textPaint = this.f536J;
                if (this.f532F == 1.0f) {
                    z3 = false;
                }
                textPaint.setLinearText(z3);
                CharSequence ellipsize = TextUtils.ellipsize(this.f568x, this.f536J, width, TruncateAt.END);
                if (!TextUtils.equals(ellipsize, this.f569y)) {
                    this.f569y = ellipsize;
                    this.f570z = m686b(this.f569y);
                }
            }
        }
    }

    /* renamed from: i */
    private void m692i() {
        m687c(this.f549e);
    }

    /* renamed from: j */
    private int m693j() {
        return this.f534H != null ? this.f557m.getColorForState(this.f534H, 0) : this.f557m.getDefaultColor();
    }

    /* renamed from: k */
    private int m694k() {
        return this.f534H != null ? this.f558n.getColorForState(this.f534H, 0) : this.f558n.getDefaultColor();
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00f4  */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m695l() {
        /*
            r11 = this;
            float r0 = r11.f533G
            float r1 = r11.f556l
            r11.m691f(r1)
            java.lang.CharSequence r1 = r11.f569y
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L_0x001c
            android.text.TextPaint r1 = r11.f536J
            java.lang.CharSequence r4 = r11.f569y
            java.lang.CharSequence r5 = r11.f569y
            int r5 = r5.length()
            float r1 = r1.measureText(r4, r3, r5)
            goto L_0x001d
        L_0x001c:
            r1 = 0
        L_0x001d:
            int r4 = r11.f554j
            boolean r5 = r11.f570z
            int r4 = android.support.p009v4.view.C0604d.m2741a(r4, r5)
            r5 = r4 & 112(0x70, float:1.57E-43)
            r6 = 80
            r7 = 48
            r8 = 1073741824(0x40000000, float:2.0)
            if (r5 == r7) goto L_0x0057
            if (r5 == r6) goto L_0x0051
            android.text.TextPaint r5 = r11.f536J
            float r5 = r5.descent()
            android.text.TextPaint r9 = r11.f536J
            float r9 = r9.ascent()
            float r5 = r5 - r9
            float r5 = r5 / r8
            android.text.TextPaint r9 = r11.f536J
            float r9 = r9.descent()
            float r5 = r5 - r9
            android.graphics.Rect r9 = r11.f551g
            int r9 = r9.centerY()
            float r9 = (float) r9
            float r9 = r9 + r5
            r11.f560p = r9
            goto L_0x0065
        L_0x0051:
            android.graphics.Rect r5 = r11.f551g
            int r5 = r5.bottom
            float r5 = (float) r5
            goto L_0x0063
        L_0x0057:
            android.graphics.Rect r5 = r11.f551g
            int r5 = r5.top
            float r5 = (float) r5
            android.text.TextPaint r9 = r11.f536J
            float r9 = r9.ascent()
            float r5 = r5 - r9
        L_0x0063:
            r11.f560p = r5
        L_0x0065:
            r5 = 8388615(0x800007, float:1.1754953E-38)
            r4 = r4 & r5
            r9 = 5
            r10 = 1
            if (r4 == r10) goto L_0x007d
            if (r4 == r9) goto L_0x0077
            android.graphics.Rect r1 = r11.f551g
            int r1 = r1.left
            float r1 = (float) r1
            r11.f562r = r1
            goto L_0x0088
        L_0x0077:
            android.graphics.Rect r4 = r11.f551g
            int r4 = r4.right
            float r4 = (float) r4
            goto L_0x0085
        L_0x007d:
            android.graphics.Rect r4 = r11.f551g
            int r4 = r4.centerX()
            float r4 = (float) r4
            float r1 = r1 / r8
        L_0x0085:
            float r4 = r4 - r1
            r11.f562r = r4
        L_0x0088:
            float r1 = r11.f555k
            r11.m691f(r1)
            java.lang.CharSequence r1 = r11.f569y
            if (r1 == 0) goto L_0x009f
            android.text.TextPaint r1 = r11.f536J
            java.lang.CharSequence r2 = r11.f569y
            java.lang.CharSequence r4 = r11.f569y
            int r4 = r4.length()
            float r2 = r1.measureText(r2, r3, r4)
        L_0x009f:
            int r1 = r11.f553i
            boolean r3 = r11.f570z
            int r1 = android.support.p009v4.view.C0604d.m2741a(r1, r3)
            r3 = r1 & 112(0x70, float:1.57E-43)
            if (r3 == r7) goto L_0x00d3
            if (r3 == r6) goto L_0x00cd
            android.text.TextPaint r3 = r11.f536J
            float r3 = r3.descent()
            android.text.TextPaint r4 = r11.f536J
            float r4 = r4.ascent()
            float r3 = r3 - r4
            float r3 = r3 / r8
            android.text.TextPaint r4 = r11.f536J
            float r4 = r4.descent()
            float r3 = r3 - r4
            android.graphics.Rect r4 = r11.f550f
            int r4 = r4.centerY()
            float r4 = (float) r4
            float r4 = r4 + r3
            r11.f559o = r4
            goto L_0x00e1
        L_0x00cd:
            android.graphics.Rect r3 = r11.f550f
            int r3 = r3.bottom
            float r3 = (float) r3
            goto L_0x00df
        L_0x00d3:
            android.graphics.Rect r3 = r11.f550f
            int r3 = r3.top
            float r3 = (float) r3
            android.text.TextPaint r4 = r11.f536J
            float r4 = r4.ascent()
            float r3 = r3 - r4
        L_0x00df:
            r11.f559o = r3
        L_0x00e1:
            r1 = r1 & r5
            if (r1 == r10) goto L_0x00f4
            if (r1 == r9) goto L_0x00ee
            android.graphics.Rect r1 = r11.f550f
            int r1 = r1.left
            float r1 = (float) r1
        L_0x00eb:
            r11.f561q = r1
            goto L_0x00fe
        L_0x00ee:
            android.graphics.Rect r1 = r11.f550f
            int r1 = r1.right
            float r1 = (float) r1
            goto L_0x00fc
        L_0x00f4:
            android.graphics.Rect r1 = r11.f550f
            int r1 = r1.centerX()
            float r1 = (float) r1
            float r2 = r2 / r8
        L_0x00fc:
            float r1 = r1 - r2
            goto L_0x00eb
        L_0x00fe:
            r11.m697n()
            r11.m690e(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.C0184e.m695l():void");
    }

    /* renamed from: m */
    private void m696m() {
        if (this.f528B == null && !this.f550f.isEmpty() && !TextUtils.isEmpty(this.f569y)) {
            m687c(0.0f);
            this.f530D = this.f536J.ascent();
            this.f531E = this.f536J.descent();
            int round = Math.round(this.f536J.measureText(this.f569y, 0, this.f569y.length()));
            int round2 = Math.round(this.f531E - this.f530D);
            if (round > 0 && round2 > 0) {
                this.f528B = Bitmap.createBitmap(round, round2, Config.ARGB_8888);
                new Canvas(this.f528B).drawText(this.f569y, 0, this.f569y.length(), 0.0f, ((float) round2) - this.f536J.descent(), this.f536J);
                if (this.f529C == null) {
                    this.f529C = new Paint(3);
                }
            }
        }
    }

    /* renamed from: n */
    private void m697n() {
        if (this.f528B != null) {
            this.f528B.recycle();
            this.f528B = null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo852a() {
        this.f548d = this.f551g.width() > 0 && this.f551g.height() > 0 && this.f550f.width() > 0 && this.f550f.height() > 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo853a(float f) {
        if (this.f555k != f) {
            this.f555k = f;
            mo872f();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo854a(int i) {
        if (this.f553i != i) {
            this.f553i = i;
            mo872f();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo855a(int i, int i2, int i3, int i4) {
        if (!m684a(this.f550f, i, i2, i3, i4)) {
            this.f550f.set(i, i2, i3, i4);
            this.f535I = true;
            mo852a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo856a(ColorStateList colorStateList) {
        if (this.f558n != colorStateList) {
            this.f558n = colorStateList;
            mo872f();
        }
    }

    /* renamed from: a */
    public void mo857a(Canvas canvas) {
        float ascent;
        int save = canvas.save();
        if (this.f569y != null && this.f548d) {
            float f = this.f563s;
            float f2 = this.f564t;
            boolean z = this.f527A && this.f528B != null;
            if (z) {
                ascent = this.f530D * this.f532F;
                float f3 = this.f531E;
            } else {
                ascent = this.f536J.ascent() * this.f532F;
                this.f536J.descent();
            }
            float f4 = this.f532F;
            if (z) {
                f2 += ascent;
            }
            float f5 = f2;
            if (this.f532F != 1.0f) {
                canvas.scale(this.f532F, this.f532F, f, f5);
            }
            if (z) {
                canvas.drawBitmap(this.f528B, f, f5, this.f529C);
            } else {
                canvas.drawText(this.f569y, 0, this.f569y.length(), f, f5, this.f536J);
            }
        }
        canvas.restoreToCount(save);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo858a(Typeface typeface) {
        this.f566v = typeface;
        this.f565u = typeface;
        mo872f();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo859a(Interpolator interpolator) {
        this.f538L = interpolator;
        mo872f();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo860a(CharSequence charSequence) {
        if (charSequence == null || !charSequence.equals(this.f568x)) {
            this.f568x = charSequence;
            this.f569y = null;
            m697n();
            mo872f();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo861a(int[] iArr) {
        this.f534H = iArr;
        if (!mo869c()) {
            return false;
        }
        mo872f();
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public Typeface mo862b() {
        return this.f565u != null ? this.f565u : Typeface.DEFAULT;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo863b(float f) {
        float a = C0430a.m1984a(f, 0.0f, 1.0f);
        if (a != this.f549e) {
            this.f549e = a;
            m692i();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo864b(int i) {
        if (this.f554j != i) {
            this.f554j = i;
            mo872f();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo865b(int i, int i2, int i3, int i4) {
        if (!m684a(this.f551g, i, i2, i3, i4)) {
            this.f551g.set(i, i2, i3, i4);
            this.f535I = true;
            mo852a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo866b(ColorStateList colorStateList) {
        if (this.f557m != colorStateList) {
            this.f557m = colorStateList;
            mo872f();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo867b(Interpolator interpolator) {
        this.f537K = interpolator;
        mo872f();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo868c(int i) {
        C1078bk a = C1078bk.m5879a(this.f547c.getContext(), i, C0736j.TextAppearance);
        if (a.mo5371g(C0736j.TextAppearance_android_textColor)) {
            this.f558n = a.mo5367e(C0736j.TextAppearance_android_textColor);
        }
        if (a.mo5371g(C0736j.TextAppearance_android_textSize)) {
            this.f556l = (float) a.mo5366e(C0736j.TextAppearance_android_textSize, (int) this.f556l);
        }
        this.f542P = a.mo5355a(C0736j.TextAppearance_android_shadowColor, 0);
        this.f540N = a.mo5354a(C0736j.TextAppearance_android_shadowDx, 0.0f);
        this.f541O = a.mo5354a(C0736j.TextAppearance_android_shadowDy, 0.0f);
        this.f539M = a.mo5354a(C0736j.TextAppearance_android_shadowRadius, 0.0f);
        a.mo5358a();
        if (VERSION.SDK_INT >= 16) {
            this.f565u = m688d(i);
        }
        mo872f();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final boolean mo869c() {
        return (this.f558n != null && this.f558n.isStateful()) || (this.f557m != null && this.f557m.isStateful());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public float mo870d() {
        return this.f549e;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public float mo871e() {
        return this.f556l;
    }

    /* renamed from: f */
    public void mo872f() {
        if (this.f547c.getHeight() > 0 && this.f547c.getWidth() > 0) {
            m695l();
            m692i();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public CharSequence mo873g() {
        return this.f568x;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public ColorStateList mo874h() {
        return this.f558n;
    }
}
