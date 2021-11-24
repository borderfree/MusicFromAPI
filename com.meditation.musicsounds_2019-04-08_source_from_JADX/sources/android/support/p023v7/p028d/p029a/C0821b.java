package android.support.p023v7.p028d.p029a;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.support.p023v7.p024a.C0726a.C0727a;
import android.support.p023v7.p024a.C0726a.C0735i;
import android.support.p023v7.p024a.C0726a.C0736j;

/* renamed from: android.support.v7.d.a.b */
public class C0821b extends Drawable {

    /* renamed from: b */
    private static final float f2419b = ((float) Math.toRadians(45.0d));

    /* renamed from: a */
    private final Paint f2420a = new Paint();

    /* renamed from: c */
    private float f2421c;

    /* renamed from: d */
    private float f2422d;

    /* renamed from: e */
    private float f2423e;

    /* renamed from: f */
    private float f2424f;

    /* renamed from: g */
    private boolean f2425g;

    /* renamed from: h */
    private final Path f2426h = new Path();

    /* renamed from: i */
    private final int f2427i;

    /* renamed from: j */
    private boolean f2428j = false;

    /* renamed from: k */
    private float f2429k;

    /* renamed from: l */
    private float f2430l;

    /* renamed from: m */
    private int f2431m = 2;

    public C0821b(Context context) {
        this.f2420a.setStyle(Style.STROKE);
        this.f2420a.setStrokeJoin(Join.MITER);
        this.f2420a.setStrokeCap(Cap.BUTT);
        this.f2420a.setAntiAlias(true);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, C0736j.DrawerArrowToggle, C0727a.drawerArrowStyle, C0735i.Base_Widget_AppCompat_DrawerArrowToggle);
        mo3265a(obtainStyledAttributes.getColor(C0736j.DrawerArrowToggle_color, 0));
        mo3264a(obtainStyledAttributes.getDimension(C0736j.DrawerArrowToggle_thickness, 0.0f));
        mo3266a(obtainStyledAttributes.getBoolean(C0736j.DrawerArrowToggle_spinBars, true));
        mo3267b((float) Math.round(obtainStyledAttributes.getDimension(C0736j.DrawerArrowToggle_gapBetweenBars, 0.0f)));
        this.f2427i = obtainStyledAttributes.getDimensionPixelSize(C0736j.DrawerArrowToggle_drawableSize, 0);
        this.f2422d = (float) Math.round(obtainStyledAttributes.getDimension(C0736j.DrawerArrowToggle_barLength, 0.0f));
        this.f2421c = (float) Math.round(obtainStyledAttributes.getDimension(C0736j.DrawerArrowToggle_arrowHeadLength, 0.0f));
        this.f2423e = obtainStyledAttributes.getDimension(C0736j.DrawerArrowToggle_arrowShaftLength, 0.0f);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    private static float m3893a(float f, float f2, float f3) {
        return f + ((f2 - f) * f3);
    }

    /* renamed from: a */
    public void mo3264a(float f) {
        if (this.f2420a.getStrokeWidth() != f) {
            this.f2420a.setStrokeWidth(f);
            double d = (double) (f / 2.0f);
            double cos = Math.cos((double) f2419b);
            Double.isNaN(d);
            this.f2430l = (float) (d * cos);
            invalidateSelf();
        }
    }

    /* renamed from: a */
    public void mo3265a(int i) {
        if (i != this.f2420a.getColor()) {
            this.f2420a.setColor(i);
            invalidateSelf();
        }
    }

    /* renamed from: a */
    public void mo3266a(boolean z) {
        if (this.f2425g != z) {
            this.f2425g = z;
            invalidateSelf();
        }
    }

    /* renamed from: b */
    public void mo3267b(float f) {
        if (f != this.f2424f) {
            this.f2424f = f;
            invalidateSelf();
        }
    }

    /* renamed from: b */
    public void mo3268b(boolean z) {
        if (this.f2428j != z) {
            this.f2428j = z;
            invalidateSelf();
        }
    }

    /* renamed from: c */
    public void mo3269c(float f) {
        if (this.f2429k != f) {
            this.f2429k = f;
            invalidateSelf();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0016, code lost:
        if (android.support.p009v4.p010a.p011a.C0311a.m1188i(r19) == 1) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001e, code lost:
        if (android.support.p009v4.p010a.p011a.C0311a.m1188i(r19) == 0) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void draw(android.graphics.Canvas r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            android.graphics.Rect r2 = r19.getBounds()
            int r3 = r0.f2431m
            r4 = 3
            r5 = 0
            r6 = 1
            if (r3 == r4) goto L_0x001a
            switch(r3) {
                case 0: goto L_0x0021;
                case 1: goto L_0x0018;
                default: goto L_0x0012;
            }
        L_0x0012:
            int r3 = android.support.p009v4.p010a.p011a.C0311a.m1188i(r19)
            if (r3 != r6) goto L_0x0021
        L_0x0018:
            r5 = 1
            goto L_0x0021
        L_0x001a:
            int r3 = android.support.p009v4.p010a.p011a.C0311a.m1188i(r19)
            if (r3 != 0) goto L_0x0021
            goto L_0x0018
        L_0x0021:
            float r3 = r0.f2421c
            float r4 = r0.f2421c
            float r3 = r3 * r4
            r4 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 * r4
            double r7 = (double) r3
            double r7 = java.lang.Math.sqrt(r7)
            float r3 = (float) r7
            float r7 = r0.f2422d
            float r8 = r0.f2429k
            float r3 = m3893a(r7, r3, r8)
            float r7 = r0.f2422d
            float r8 = r0.f2423e
            float r9 = r0.f2429k
            float r7 = m3893a(r7, r8, r9)
            float r8 = r0.f2430l
            float r9 = r0.f2429k
            r10 = 0
            float r8 = m3893a(r10, r8, r9)
            int r8 = java.lang.Math.round(r8)
            float r8 = (float) r8
            float r9 = f2419b
            float r11 = r0.f2429k
            float r9 = m3893a(r10, r9, r11)
            if (r5 == 0) goto L_0x005d
            r11 = 0
            goto L_0x005f
        L_0x005d:
            r11 = -1020002304(0xffffffffc3340000, float:-180.0)
        L_0x005f:
            r12 = 1127481344(0x43340000, float:180.0)
            if (r5 == 0) goto L_0x0066
            r13 = 1127481344(0x43340000, float:180.0)
            goto L_0x0067
        L_0x0066:
            r13 = 0
        L_0x0067:
            float r14 = r0.f2429k
            float r11 = m3893a(r11, r13, r14)
            double r13 = (double) r3
            r15 = r11
            double r10 = (double) r9
            double r16 = java.lang.Math.cos(r10)
            java.lang.Double.isNaN(r13)
            double r16 = r16 * r13
            r18 = r5
            long r4 = java.lang.Math.round(r16)
            float r3 = (float) r4
            double r4 = java.lang.Math.sin(r10)
            java.lang.Double.isNaN(r13)
            double r13 = r13 * r4
            long r4 = java.lang.Math.round(r13)
            float r4 = (float) r4
            android.graphics.Path r5 = r0.f2426h
            r5.rewind()
            float r5 = r0.f2424f
            android.graphics.Paint r9 = r0.f2420a
            float r9 = r9.getStrokeWidth()
            float r5 = r5 + r9
            float r9 = r0.f2430l
            float r9 = -r9
            float r10 = r0.f2429k
            float r5 = m3893a(r5, r9, r10)
            float r9 = -r7
            r10 = 1073741824(0x40000000, float:2.0)
            float r9 = r9 / r10
            android.graphics.Path r11 = r0.f2426h
            float r13 = r9 + r8
            r14 = 0
            r11.moveTo(r13, r14)
            android.graphics.Path r11 = r0.f2426h
            float r8 = r8 * r10
            float r7 = r7 - r8
            r11.rLineTo(r7, r14)
            android.graphics.Path r7 = r0.f2426h
            r7.moveTo(r9, r5)
            android.graphics.Path r7 = r0.f2426h
            r7.rLineTo(r3, r4)
            android.graphics.Path r7 = r0.f2426h
            float r5 = -r5
            r7.moveTo(r9, r5)
            android.graphics.Path r5 = r0.f2426h
            float r4 = -r4
            r5.rLineTo(r3, r4)
            android.graphics.Path r3 = r0.f2426h
            r3.close()
            r20.save()
            android.graphics.Paint r3 = r0.f2420a
            float r3 = r3.getStrokeWidth()
            int r4 = r2.height()
            float r4 = (float) r4
            r5 = 1077936128(0x40400000, float:3.0)
            float r5 = r5 * r3
            float r4 = r4 - r5
            float r5 = r0.f2424f
            r7 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 * r7
            float r4 = r4 - r5
            int r4 = (int) r4
            int r4 = r4 / 4
            int r4 = r4 * 2
            float r4 = (float) r4
            r5 = 1069547520(0x3fc00000, float:1.5)
            float r3 = r3 * r5
            float r5 = r0.f2424f
            float r3 = r3 + r5
            float r4 = r4 + r3
            int r2 = r2.centerX()
            float r2 = (float) r2
            r1.translate(r2, r4)
            boolean r2 = r0.f2425g
            if (r2 == 0) goto L_0x0116
            boolean r2 = r0.f2428j
            r2 = r2 ^ r18
            if (r2 == 0) goto L_0x010f
            r6 = -1
        L_0x010f:
            float r2 = (float) r6
            float r11 = r15 * r2
            r1.rotate(r11)
            goto L_0x011b
        L_0x0116:
            if (r18 == 0) goto L_0x011b
            r1.rotate(r12)
        L_0x011b:
            android.graphics.Path r2 = r0.f2426h
            android.graphics.Paint r3 = r0.f2420a
            r1.drawPath(r2, r3)
            r20.restore()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p023v7.p028d.p029a.C0821b.draw(android.graphics.Canvas):void");
    }

    public int getIntrinsicHeight() {
        return this.f2427i;
    }

    public int getIntrinsicWidth() {
        return this.f2427i;
    }

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i) {
        if (i != this.f2420a.getAlpha()) {
            this.f2420a.setAlpha(i);
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f2420a.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
