package com.seattleclouds.modules.photoeffect;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Region.Op;

/* renamed from: com.seattleclouds.modules.photoeffect.a */
public class C6039a {

    /* renamed from: a */
    public static final String f21450a = "a";

    /* renamed from: b */
    int f21451b = 0;

    /* renamed from: c */
    int f21452c = 0;

    /* renamed from: d */
    int f21453d = 0;

    /* renamed from: e */
    int f21454e = 0;

    /* renamed from: f */
    private final RectF f21455f = new RectF();

    /* renamed from: g */
    private final Paint f21456g;

    /* renamed from: h */
    private final Paint f21457h = new Paint();

    /* renamed from: i */
    private Bitmap f21458i;

    /* renamed from: j */
    private int f21459j;

    /* renamed from: k */
    private int f21460k;

    /* renamed from: l */
    private boolean f21461l = false;

    /* renamed from: m */
    private boolean f21462m = true;

    /* renamed from: n */
    private String f21463n;

    /* renamed from: o */
    private int f21464o = 255;

    /* renamed from: p */
    private float f21465p = 1.0f;

    /* renamed from: q */
    private float f21466q = 0.0f;

    /* renamed from: r */
    private float f21467r = 1.0f;

    /* renamed from: s */
    private float f21468s = 0.0f;

    /* renamed from: t */
    private PointF f21469t = new PointF(0.0f, 0.0f);

    /* renamed from: u */
    private boolean f21470u = false;

    /* renamed from: v */
    private int f21471v = -1;

    /* renamed from: w */
    private int f21472w = -1;

    public C6039a(Bitmap bitmap, MaskProperty maskProperty) {
        this.f21458i = bitmap;
        this.f21453d = this.f21458i.getWidth();
        this.f21454e = this.f21458i.getHeight();
        this.f21459j = maskProperty.f21438a;
        this.f21460k = maskProperty.f21439b;
        this.f21452c = maskProperty.f21440c;
        this.f21451b = maskProperty.f21441d;
        this.f21464o = maskProperty.f21442e;
        this.f21465p = maskProperty.f21443f;
        this.f21466q = maskProperty.f21444g;
        this.f21462m = maskProperty.f21445h;
        this.f21463n = maskProperty.f21446i;
        m29588j();
        this.f21456g = new Paint();
        this.f21456g.setStyle(Style.STROKE);
        this.f21456g.setColor(-65536);
        this.f21456g.setStrokeWidth(2.0f);
        this.f21456g.setAntiAlias(true);
    }

    /* renamed from: a */
    private void m29587a(Canvas canvas, RectF rectF) {
        if (this.f21458i != null) {
            canvas.save();
            canvas.rotate(this.f21466q, rectF.centerX(), rectF.centerY());
            canvas.drawBitmap(this.f21458i, null, rectF, this.f21457h);
            if (mo19091e()) {
                canvas.drawRect(rectF, this.f21456g);
                canvas.clipRect(rectF, Op.INTERSECT);
            }
            canvas.restore();
        }
    }

    /* renamed from: j */
    private void m29588j() {
        this.f21455f.left = (float) mo19082b();
        this.f21455f.right = this.f21455f.left + (((float) this.f21453d) * this.f21465p);
        this.f21455f.top = (float) mo19086c();
        this.f21455f.bottom = this.f21455f.top + (((float) this.f21454e) * this.f21465p);
    }

    /* renamed from: a */
    public int mo19074a() {
        return this.f21464o;
    }

    /* renamed from: a */
    public void mo19075a(float f) {
        this.f21465p = (f - 1.0f) + this.f21467r;
        m29588j();
    }

    /* renamed from: a */
    public void mo19076a(int i) {
        this.f21459j = i;
        m29588j();
    }

    /* renamed from: a */
    public void mo19077a(Canvas canvas) {
        m29587a(canvas, this.f21455f);
        if (mo19092f()) {
            if (this.f21471v != 1 || (this.f21471v == 1 && this.f21472w == 0)) {
                this.f21459j -= this.f21452c;
                this.f21460k -= this.f21451b;
            }
            this.f21452c = 0;
            this.f21451b = 0;
            m29588j();
            mo19089d(-1);
            this.f21472w = -1;
            this.f21470u = false;
        }
    }

    /* renamed from: a */
    public void mo19078a(Canvas canvas, float f, float f2) {
        RectF rectF = new RectF(this.f21455f);
        rectF.left -= f;
        rectF.right -= f;
        rectF.top -= f2;
        rectF.bottom -= f2;
        m29587a(canvas, rectF);
    }

    /* renamed from: a */
    public void mo19079a(PointF pointF) {
        this.f21469t = pointF;
    }

    /* renamed from: a */
    public void mo19080a(boolean z) {
        this.f21461l = z;
    }

    /* renamed from: a */
    public boolean mo19081a(int i, int i2) {
        if (this.f21455f.contains((float) i, (float) i2)) {
            mo19080a(true);
            mo19085b(true);
            this.f21452c = i - (this.f21459j - this.f21452c);
            this.f21451b = i2 - (this.f21460k - this.f21451b);
            m29588j();
            return true;
        }
        m29588j();
        mo19080a(false);
        mo19085b(false);
        return false;
    }

    /* renamed from: b */
    public int mo19082b() {
        return (int) ((((float) this.f21459j) - ((((float) this.f21453d) * this.f21465p) / 2.0f)) - ((float) this.f21452c));
    }

    /* renamed from: b */
    public void mo19083b(float f) {
        this.f21466q = (f * 57.29578f) + this.f21468s;
    }

    /* renamed from: b */
    public void mo19084b(int i) {
        this.f21460k = i;
        m29588j();
    }

    /* renamed from: b */
    public void mo19085b(boolean z) {
        this.f21462m = z;
    }

    /* renamed from: c */
    public int mo19086c() {
        return (int) ((((float) this.f21460k) - ((((float) this.f21454e) * this.f21465p) / 2.0f)) - ((float) this.f21451b));
    }

    /* renamed from: c */
    public void mo19087c(int i) {
        this.f21464o = i;
        this.f21457h.setAlpha(i);
    }

    /* renamed from: c */
    public void mo19088c(boolean z) {
        if (mo19093g() == -1) {
            this.f21459j -= this.f21452c;
            this.f21460k -= this.f21451b;
            this.f21452c = 0;
            this.f21451b = 0;
        }
        this.f21470u = z;
        this.f21467r = this.f21465p;
        this.f21468s = this.f21466q;
    }

    /* renamed from: d */
    public void mo19089d(int i) {
        if (i == 0 || i == -1) {
            this.f21472w = this.f21471v;
        }
        this.f21471v = i;
    }

    /* renamed from: d */
    public boolean mo19090d() {
        return this.f21461l;
    }

    /* renamed from: e */
    public boolean mo19091e() {
        return this.f21462m;
    }

    /* renamed from: f */
    public boolean mo19092f() {
        return this.f21470u;
    }

    /* renamed from: g */
    public int mo19093g() {
        return this.f21471v;
    }

    /* renamed from: h */
    public void mo19094h() {
        this.f21458i.recycle();
    }

    /* renamed from: i */
    public MaskProperty mo19095i() {
        MaskProperty maskProperty = new MaskProperty(this.f21459j, this.f21460k, this.f21452c, this.f21451b, this.f21464o, this.f21465p, this.f21466q, this.f21462m, this.f21463n);
        return maskProperty;
    }
}
