package com.seattleclouds.previewer.appmart.order.colorpicker;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ComposeShader;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.Style;
import android.graphics.Point;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import com.seattleclouds.C5451m.C5456e;
import com.seattleclouds.C5451m.C5464m;

public class NewOrderColorPickerView extends View {

    /* renamed from: a */
    private static final String f22852a = "NewOrderColorPickerView";

    /* renamed from: A */
    private int f22853A;

    /* renamed from: B */
    private Rect f22854B;

    /* renamed from: C */
    private Rect f22855C;

    /* renamed from: D */
    private Rect f22856D;

    /* renamed from: E */
    private Rect f22857E;

    /* renamed from: F */
    private Point f22858F;

    /* renamed from: G */
    private C6439a f22859G;

    /* renamed from: H */
    private C6438c f22860H;

    /* renamed from: b */
    private int f22861b;

    /* renamed from: c */
    private int f22862c;

    /* renamed from: d */
    private int f22863d;

    /* renamed from: e */
    private int f22864e;

    /* renamed from: f */
    private int f22865f;

    /* renamed from: g */
    private int f22866g;

    /* renamed from: h */
    private Paint f22867h;

    /* renamed from: i */
    private Paint f22868i;

    /* renamed from: j */
    private Paint f22869j;

    /* renamed from: k */
    private Paint f22870k;

    /* renamed from: l */
    private Paint f22871l;

    /* renamed from: m */
    private Paint f22872m;

    /* renamed from: n */
    private Shader f22873n;

    /* renamed from: o */
    private Shader f22874o;

    /* renamed from: p */
    private Shader f22875p;

    /* renamed from: q */
    private C6436a f22876q;

    /* renamed from: r */
    private C6436a f22877r;

    /* renamed from: s */
    private int f22878s;

    /* renamed from: t */
    private float f22879t;

    /* renamed from: u */
    private float f22880u;

    /* renamed from: v */
    private float f22881v;

    /* renamed from: w */
    private boolean f22882w;

    /* renamed from: x */
    private String f22883x;

    /* renamed from: y */
    private int f22884y;

    /* renamed from: z */
    private int f22885z;

    /* renamed from: com.seattleclouds.previewer.appmart.order.colorpicker.NewOrderColorPickerView$a */
    private class C6436a {

        /* renamed from: a */
        public Canvas f22886a;

        /* renamed from: b */
        public Bitmap f22887b;

        /* renamed from: c */
        public float f22888c;

        private C6436a() {
        }
    }

    /* renamed from: com.seattleclouds.previewer.appmart.order.colorpicker.NewOrderColorPickerView$b */
    static class C6437b {
        /* renamed from: a */
        public static int m31215a(Context context, float f) {
            float applyDimension = TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
            double d = (double) applyDimension;
            Double.isNaN(d);
            int i = (int) (d + 0.5d);
            if (i != 0 || applyDimension <= 0.0f) {
                return i;
            }
            return 1;
        }
    }

    /* renamed from: com.seattleclouds.previewer.appmart.order.colorpicker.NewOrderColorPickerView$c */
    public interface C6438c {
        /* renamed from: d */
        void mo20068d(int i);
    }

    public NewOrderColorPickerView(Context context) {
        this(context, null);
    }

    public NewOrderColorPickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NewOrderColorPickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f22878s = 255;
        this.f22879t = 360.0f;
        this.f22880u = 0.0f;
        this.f22881v = 0.0f;
        this.f22882w = false;
        this.f22883x = null;
        this.f22884y = -4342339;
        this.f22885z = -9539986;
        this.f22858F = null;
        m31203a(context, attributeSet);
    }

    /* renamed from: a */
    private Point m31198a(float f) {
        Rect rect = this.f22856D;
        float height = (float) rect.height();
        Point point = new Point();
        point.y = (int) ((height - ((f * height) / 360.0f)) + ((float) rect.top));
        point.x = rect.left;
        return point;
    }

    /* renamed from: a */
    private Point m31199a(float f, float f2) {
        Rect rect = this.f22855C;
        float height = (float) rect.height();
        float width = (float) rect.width();
        Point point = new Point();
        point.x = (int) ((f * width) + ((float) rect.left));
        point.y = (int) (((1.0f - f2) * height) + ((float) rect.top));
        return point;
    }

    /* renamed from: a */
    private Point m31200a(int i) {
        Rect rect = this.f22857E;
        float width = (float) rect.width();
        Point point = new Point();
        point.x = (int) ((width - ((((float) i) * width) / 255.0f)) + ((float) rect.left));
        point.y = rect.top;
        return point;
    }

    /* renamed from: a */
    private void m31201a() {
        this.f22867h = new Paint();
        this.f22868i = new Paint();
        this.f22871l = new Paint();
        this.f22869j = new Paint();
        this.f22870k = new Paint();
        this.f22872m = new Paint();
        this.f22868i.setStyle(Style.STROKE);
        this.f22868i.setStrokeWidth((float) C6437b.m31215a(getContext(), 2.0f));
        this.f22868i.setAntiAlias(true);
        this.f22871l.setColor(this.f22884y);
        this.f22871l.setStyle(Style.STROKE);
        this.f22871l.setStrokeWidth((float) C6437b.m31215a(getContext(), 2.0f));
        this.f22871l.setAntiAlias(true);
        this.f22870k.setColor(-14935012);
        this.f22870k.setTextSize((float) C6437b.m31215a(getContext(), 14.0f));
        this.f22870k.setAntiAlias(true);
        this.f22870k.setTextAlign(Align.CENTER);
        this.f22870k.setFakeBoldText(true);
    }

    /* renamed from: a */
    private void m31202a(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new TypedValue().data, new int[]{16842808});
        if (this.f22885z == -9539986) {
            this.f22885z = obtainStyledAttributes.getColor(0, -9539986);
        }
        if (this.f22884y == -4342339) {
            this.f22884y = obtainStyledAttributes.getColor(0, -4342339);
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    private void m31203a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C5464m.NewOrderColorPicker);
        this.f22882w = obtainStyledAttributes.getBoolean(C5464m.NewOrderColorPicker_alphaChannelVisible, false);
        this.f22883x = obtainStyledAttributes.getString(C5464m.NewOrderColorPicker_alphaChannelText);
        this.f22884y = obtainStyledAttributes.getColor(C5464m.NewOrderColorPicker_sliderColor, -4342339);
        this.f22885z = obtainStyledAttributes.getColor(C5464m.NewOrderColorPicker_borderColor, -9539986);
        obtainStyledAttributes.recycle();
        m31202a(context);
        this.f22861b = C6437b.m31215a(getContext(), 30.0f);
        this.f22862c = C6437b.m31215a(getContext(), 20.0f);
        this.f22863d = C6437b.m31215a(getContext(), 10.0f);
        this.f22864e = C6437b.m31215a(getContext(), 5.0f);
        this.f22866g = C6437b.m31215a(getContext(), 4.0f);
        this.f22865f = C6437b.m31215a(getContext(), 2.0f);
        this.f22853A = getResources().getDimensionPixelSize(C5456e.color_picker_view_required_padding);
        m31201a();
        setFocusable(true);
        setFocusableInTouchMode(true);
    }

    /* renamed from: a */
    private void m31204a(Canvas canvas) {
        Canvas canvas2 = canvas;
        Rect rect = this.f22855C;
        this.f22872m.setColor(this.f22885z);
        canvas.drawRect((float) this.f22854B.left, (float) this.f22854B.top, (float) (rect.right + 1), (float) (rect.bottom + 1), this.f22872m);
        if (this.f22873n == null) {
            LinearGradient linearGradient = new LinearGradient((float) rect.left, (float) rect.top, (float) rect.left, (float) rect.bottom, -1, -16777216, TileMode.CLAMP);
            this.f22873n = linearGradient;
        }
        if (this.f22876q == null || this.f22876q.f22888c != this.f22879t) {
            if (this.f22876q == null) {
                this.f22876q = new C6436a();
            }
            if (this.f22876q.f22887b == null) {
                int height = rect.height();
                if (height <= 0) {
                    height = 1;
                }
                this.f22876q.f22887b = Bitmap.createBitmap(rect.width(), height, Config.ARGB_8888);
            }
            if (this.f22876q.f22886a == null) {
                this.f22876q.f22886a = new Canvas(this.f22876q.f22887b);
            }
            LinearGradient linearGradient2 = new LinearGradient((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.top, -1, Color.HSVToColor(new float[]{this.f22879t, 1.0f, 1.0f}), TileMode.CLAMP);
            this.f22874o = linearGradient2;
            this.f22867h.setShader(new ComposeShader(this.f22873n, this.f22874o, Mode.MULTIPLY));
            this.f22876q.f22886a.drawRect(0.0f, 0.0f, (float) this.f22876q.f22887b.getWidth(), (float) this.f22876q.f22887b.getHeight(), this.f22867h);
            this.f22876q.f22888c = this.f22879t;
        }
        canvas2.drawBitmap(this.f22876q.f22887b, null, rect, null);
        Point a = m31199a(this.f22880u, this.f22881v);
        this.f22868i.setColor(-16777216);
        canvas2.drawCircle((float) a.x, (float) a.y, (float) (this.f22864e - C6437b.m31215a(getContext(), 1.0f)), this.f22868i);
        this.f22868i.setColor(-2236963);
        canvas2.drawCircle((float) a.x, (float) a.y, (float) this.f22864e, this.f22868i);
    }

    /* renamed from: a */
    private boolean m31205a(MotionEvent motionEvent) {
        if (this.f22858F == null) {
            return false;
        }
        int i = this.f22858F.x;
        int i2 = this.f22858F.y;
        boolean z = true;
        if (this.f22856D.contains(i, i2)) {
            this.f22879t = m31206b(motionEvent.getY());
        } else if (this.f22855C.contains(i, i2)) {
            float[] b = m31210b(motionEvent.getX(), motionEvent.getY());
            this.f22880u = b[0];
            this.f22881v = b[1];
        } else if (this.f22857E == null || !this.f22857E.contains(i, i2)) {
            z = false;
        } else {
            this.f22878s = m31207b((int) motionEvent.getX());
        }
        return z;
    }

    /* renamed from: b */
    private float m31206b(float f) {
        Rect rect = this.f22856D;
        float height = (float) rect.height();
        float f2 = f < ((float) rect.top) ? 0.0f : f > ((float) rect.bottom) ? height : f - ((float) rect.top);
        float f3 = 360.0f - ((f2 * 360.0f) / height);
        String str = f22852a;
        StringBuilder sb = new StringBuilder();
        sb.append("Hue: ");
        sb.append(f3);
        Log.d(str, sb.toString());
        return f3;
    }

    /* renamed from: b */
    private int m31207b(int i) {
        Rect rect = this.f22857E;
        int width = rect.width();
        int i2 = i < rect.left ? 0 : i > rect.right ? width : i - rect.left;
        return 255 - ((i2 * 255) / width);
    }

    /* renamed from: b */
    private void m31208b() {
        Rect rect = this.f22854B;
        int i = rect.left + 1;
        int i2 = rect.top + 1;
        int i3 = rect.bottom - 1;
        int i4 = ((rect.right - 1) - this.f22863d) - this.f22861b;
        if (this.f22882w) {
            i3 -= this.f22862c + this.f22863d;
        }
        this.f22855C = new Rect(i, i2, i4, i3);
    }

    /* renamed from: b */
    private void m31209b(Canvas canvas) {
        Canvas canvas2 = canvas;
        Rect rect = this.f22856D;
        this.f22872m.setColor(this.f22885z);
        canvas.drawRect((float) (rect.left - 1), (float) (rect.top - 1), (float) (rect.right + 1), (float) (rect.bottom + 1), this.f22872m);
        if (this.f22877r == null) {
            this.f22877r = new C6436a();
            int height = rect.height();
            if (height <= 0) {
                height = 1;
            }
            this.f22877r.f22887b = Bitmap.createBitmap(rect.width(), height, Config.ARGB_8888);
            this.f22877r.f22886a = new Canvas(this.f22877r.f22887b);
            int[] iArr = new int[((int) (((float) height) + 0.5f))];
            float f = 360.0f;
            for (int i = 0; i < iArr.length; i++) {
                iArr[i] = Color.HSVToColor(new float[]{f, 1.0f, 1.0f});
                f -= 360.0f / ((float) iArr.length);
            }
            Paint paint = new Paint();
            paint.setStrokeWidth(0.0f);
            for (int i2 = 0; i2 < iArr.length; i2++) {
                paint.setColor(iArr[i2]);
                float f2 = (float) i2;
                this.f22877r.f22886a.drawLine(0.0f, f2, (float) this.f22877r.f22887b.getWidth(), f2, paint);
            }
        }
        canvas2.drawBitmap(this.f22877r.f22887b, null, rect, null);
        Point a = m31198a(this.f22879t);
        RectF rectF = new RectF();
        rectF.left = (float) (rect.left - this.f22865f);
        rectF.right = (float) (rect.right + this.f22865f);
        rectF.top = (float) (a.y - (this.f22866g / 2));
        rectF.bottom = (float) (a.y + (this.f22866g / 2));
        canvas2.drawRoundRect(rectF, 2.0f, 2.0f, this.f22871l);
    }

    /* renamed from: b */
    private float[] m31210b(float f, float f2) {
        Rect rect = this.f22855C;
        float[] fArr = new float[2];
        float width = (float) rect.width();
        float height = (float) rect.height();
        float f3 = f < ((float) rect.left) ? 0.0f : f > ((float) rect.right) ? width : f - ((float) rect.left);
        float f4 = f2 < ((float) rect.top) ? 0.0f : f2 > ((float) rect.bottom) ? height : f2 - ((float) rect.top);
        fArr[0] = (1.0f / width) * f3;
        fArr[1] = 1.0f - ((1.0f / height) * f4);
        return fArr;
    }

    /* renamed from: c */
    private void m31211c() {
        Rect rect = this.f22854B;
        this.f22856D = new Rect((rect.right - this.f22861b) + 1, rect.top + 1, rect.right - 1, (rect.bottom - 1) - (this.f22882w ? this.f22863d + this.f22862c : 0));
    }

    /* renamed from: c */
    private void m31212c(Canvas canvas) {
        if (this.f22882w && this.f22857E != null && this.f22859G != null) {
            Rect rect = this.f22857E;
            this.f22872m.setColor(this.f22885z);
            canvas.drawRect((float) (rect.left - 1), (float) (rect.top - 1), (float) (rect.right + 1), (float) (rect.bottom + 1), this.f22872m);
            this.f22859G.draw(canvas);
            float[] fArr = {this.f22879t, this.f22880u, this.f22881v};
            LinearGradient linearGradient = new LinearGradient((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.top, Color.HSVToColor(fArr), Color.HSVToColor(0, fArr), TileMode.CLAMP);
            this.f22875p = linearGradient;
            this.f22869j.setShader(this.f22875p);
            canvas.drawRect(rect, this.f22869j);
            if (this.f22883x != null && !this.f22883x.equals("")) {
                canvas.drawText(this.f22883x, (float) rect.centerX(), (float) (rect.centerY() + C6437b.m31215a(getContext(), 4.0f)), this.f22870k);
            }
            Point a = m31200a(this.f22878s);
            RectF rectF = new RectF();
            rectF.left = (float) (a.x - (this.f22866g / 2));
            rectF.right = (float) (a.x + (this.f22866g / 2));
            rectF.top = (float) (rect.top - this.f22865f);
            rectF.bottom = (float) (rect.bottom + this.f22865f);
            canvas.drawRoundRect(rectF, 2.0f, 2.0f, this.f22871l);
        }
    }

    /* renamed from: d */
    private void m31213d() {
        if (this.f22882w) {
            Rect rect = this.f22854B;
            this.f22857E = new Rect(rect.left + 1, (rect.bottom - this.f22862c) + 1, rect.right - 1, rect.bottom - 1);
            this.f22859G = new C6439a(C6437b.m31215a(getContext(), 5.0f));
            this.f22859G.setBounds(Math.round((float) this.f22857E.left), Math.round((float) this.f22857E.top), Math.round((float) this.f22857E.right), Math.round((float) this.f22857E.bottom));
        }
    }

    private int getPreferredHeight() {
        int a = C6437b.m31215a(getContext(), 200.0f);
        return this.f22882w ? a + this.f22863d + this.f22862c : a;
    }

    private int getPreferredWidth() {
        return C6437b.m31215a(getContext(), 200.0f) + this.f22861b + this.f22863d;
    }

    /* renamed from: a */
    public void mo20046a(int i, boolean z) {
        int alpha = Color.alpha(i);
        float[] fArr = new float[3];
        Color.RGBToHSV(Color.red(i), Color.green(i), Color.blue(i), fArr);
        this.f22878s = alpha;
        this.f22879t = fArr[0];
        this.f22880u = fArr[1];
        this.f22881v = fArr[2];
        if (z && this.f22860H != null) {
            this.f22860H.mo20068d(Color.HSVToColor(this.f22878s, new float[]{this.f22879t, this.f22880u, this.f22881v}));
        }
        invalidate();
    }

    public String getAlphaSliderText() {
        return this.f22883x;
    }

    public int getBorderColor() {
        return this.f22885z;
    }

    public int getColor() {
        return Color.HSVToColor(this.f22878s, new float[]{this.f22879t, this.f22880u, this.f22881v});
    }

    public int getPaddingBottom() {
        return Math.max(super.getPaddingBottom(), this.f22853A);
    }

    public int getPaddingLeft() {
        return Math.max(super.getPaddingLeft(), this.f22853A);
    }

    public int getPaddingRight() {
        return Math.max(super.getPaddingRight(), this.f22853A);
    }

    public int getPaddingTop() {
        return Math.max(super.getPaddingTop(), this.f22853A);
    }

    public int getSliderTrackerColor() {
        return this.f22884y;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (this.f22854B.width() > 0 && this.f22854B.height() > 0) {
            m31204a(canvas);
            m31209b(canvas);
            m31212c(canvas);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x008f, code lost:
        if (r2 != false) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c1, code lost:
        if (r0 > r8) goto L_0x00c3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            int r0 = android.view.View.MeasureSpec.getMode(r8)
            int r1 = android.view.View.MeasureSpec.getMode(r9)
            int r8 = android.view.View.MeasureSpec.getSize(r8)
            int r2 = r7.getPaddingLeft()
            int r8 = r8 - r2
            int r2 = r7.getPaddingRight()
            int r8 = r8 - r2
            int r9 = android.view.View.MeasureSpec.getSize(r9)
            int r2 = r7.getPaddingBottom()
            int r9 = r9 - r2
            int r2 = r7.getPaddingTop()
            int r9 = r9 - r2
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r2) goto L_0x0093
            if (r1 != r2) goto L_0x002c
            goto L_0x0093
        L_0x002c:
            int r0 = r7.f22863d
            int r0 = r0 + r9
            int r1 = r7.f22861b
            int r0 = r0 + r1
            int r1 = r7.f22863d
            int r1 = r8 - r1
            int r2 = r7.f22861b
            int r1 = r1 - r2
            boolean r2 = r7.f22882w
            if (r2 == 0) goto L_0x0049
            int r2 = r7.f22863d
            int r3 = r7.f22862c
            int r2 = r2 + r3
            int r0 = r0 - r2
            int r2 = r7.f22863d
            int r3 = r7.f22862c
            int r2 = r2 + r3
            int r1 = r1 + r2
        L_0x0049:
            r2 = 1
            r3 = 0
            if (r0 > r8) goto L_0x004f
            r4 = 1
            goto L_0x0050
        L_0x004f:
            r4 = 0
        L_0x0050:
            if (r1 > r9) goto L_0x0053
            goto L_0x0054
        L_0x0053:
            r2 = 0
        L_0x0054:
            java.lang.String r3 = f22852a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Size - Allowed w: "
            r5.append(r6)
            r5.append(r8)
            java.lang.String r6 = " h: "
            r5.append(r6)
            r5.append(r9)
            java.lang.String r6 = " Needed w:"
            r5.append(r6)
            r5.append(r0)
            java.lang.String r6 = " h: "
            r5.append(r6)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            android.util.Log.d(r3, r5)
            if (r4 == 0) goto L_0x0087
            if (r2 == 0) goto L_0x0087
            goto L_0x0091
        L_0x0087:
            if (r2 != 0) goto L_0x008d
            if (r4 == 0) goto L_0x008d
        L_0x008b:
            r8 = r0
            goto L_0x00c3
        L_0x008d:
            if (r4 != 0) goto L_0x00c3
            if (r2 == 0) goto L_0x00c3
        L_0x0091:
            r9 = r1
            goto L_0x00c3
        L_0x0093:
            if (r0 != r2) goto L_0x00ad
            if (r1 == r2) goto L_0x00ad
            int r0 = r7.f22863d
            int r0 = r8 - r0
            int r1 = r7.f22861b
            int r0 = r0 - r1
            boolean r1 = r7.f22882w
            if (r1 == 0) goto L_0x00a8
            int r1 = r7.f22863d
            int r2 = r7.f22862c
            int r1 = r1 + r2
            int r0 = r0 + r1
        L_0x00a8:
            if (r0 <= r9) goto L_0x00ab
            goto L_0x00c3
        L_0x00ab:
            r9 = r0
            goto L_0x00c3
        L_0x00ad:
            if (r1 != r2) goto L_0x00c3
            if (r0 == r2) goto L_0x00c3
            int r0 = r7.f22863d
            int r0 = r0 + r9
            int r1 = r7.f22861b
            int r0 = r0 + r1
            boolean r1 = r7.f22882w
            if (r1 == 0) goto L_0x00c1
            int r1 = r7.f22863d
            int r2 = r7.f22862c
            int r1 = r1 + r2
            int r0 = r0 - r1
        L_0x00c1:
            if (r0 <= r8) goto L_0x008b
        L_0x00c3:
            java.lang.String r0 = f22852a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Final Size: "
            r1.append(r2)
            r1.append(r8)
            java.lang.String r2 = "x"
            r1.append(r2)
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r0, r1)
            int r0 = r7.getPaddingLeft()
            int r8 = r8 + r0
            int r0 = r7.getPaddingRight()
            int r8 = r8 + r0
            int r0 = r7.getPaddingTop()
            int r9 = r9 + r0
            int r0 = r7.getPaddingBottom()
            int r9 = r9 + r0
            r7.setMeasuredDimension(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.previewer.appmart.order.colorpicker.NewOrderColorPickerView.onMeasure(int, int):void");
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.f22878s = bundle.getInt("alpha");
            this.f22879t = bundle.getFloat("hue");
            this.f22880u = bundle.getFloat("sat");
            this.f22881v = bundle.getFloat("val");
            this.f22882w = bundle.getBoolean("show_alpha");
            this.f22883x = bundle.getString("alpha_text");
            parcelable = bundle.getParcelable("instanceState");
        }
        super.onRestoreInstanceState(parcelable);
    }

    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putInt("alpha", this.f22878s);
        bundle.putFloat("hue", this.f22879t);
        bundle.putFloat("sat", this.f22880u);
        bundle.putFloat("val", this.f22881v);
        bundle.putBoolean("show_alpha", this.f22882w);
        bundle.putString("alpha_text", this.f22883x);
        return bundle;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f22854B = new Rect();
        this.f22854B.left = getPaddingLeft();
        this.f22854B.right = i - getPaddingRight();
        this.f22854B.top = getPaddingTop();
        this.f22854B.bottom = i2 - getPaddingBottom();
        this.f22873n = null;
        this.f22874o = null;
        this.f22875p = null;
        this.f22876q = null;
        this.f22877r = null;
        String str = f22852a;
        StringBuilder sb = new StringBuilder();
        sb.append("Size: ");
        sb.append(i);
        sb.append("x");
        sb.append(i2);
        Log.d(str, sb.toString());
        m31208b();
        m31211c();
        m31213d();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0028, code lost:
        r5.f22860H.mo20068d(android.graphics.Color.HSVToColor(r5.f22878s, new float[]{r5.f22879t, r5.f22880u, r5.f22881v}));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0043, code lost:
        invalidate();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0046, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004b, code lost:
        return super.onTouchEvent(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        r5.f22858F = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0021, code lost:
        if (r0 == false) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        if (r5.f22860H == null) goto L_0x0043;
     */
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getAction()
            r1 = 0
            switch(r0) {
                case 0: goto L_0x000c;
                case 1: goto L_0x000a;
                case 2: goto L_0x001d;
                default: goto L_0x0008;
            }
        L_0x0008:
            r0 = 0
            goto L_0x0021
        L_0x000a:
            r0 = 0
            goto L_0x001b
        L_0x000c:
            android.graphics.Point r0 = new android.graphics.Point
            float r2 = r6.getX()
            int r2 = (int) r2
            float r3 = r6.getY()
            int r3 = (int) r3
            r0.<init>(r2, r3)
        L_0x001b:
            r5.f22858F = r0
        L_0x001d:
            boolean r0 = r5.m31205a(r6)
        L_0x0021:
            if (r0 == 0) goto L_0x0047
            com.seattleclouds.previewer.appmart.order.colorpicker.NewOrderColorPickerView$c r6 = r5.f22860H
            r0 = 1
            if (r6 == 0) goto L_0x0043
            com.seattleclouds.previewer.appmart.order.colorpicker.NewOrderColorPickerView$c r6 = r5.f22860H
            int r2 = r5.f22878s
            r3 = 3
            float[] r3 = new float[r3]
            float r4 = r5.f22879t
            r3[r1] = r4
            float r1 = r5.f22880u
            r3[r0] = r1
            r1 = 2
            float r4 = r5.f22881v
            r3[r1] = r4
            int r1 = android.graphics.Color.HSVToColor(r2, r3)
            r6.mo20068d(r1)
        L_0x0043:
            r5.invalidate()
            return r0
        L_0x0047:
            boolean r6 = super.onTouchEvent(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.previewer.appmart.order.colorpicker.NewOrderColorPickerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAlphaSliderText(int i) {
        setAlphaSliderText(getContext().getString(i));
    }

    public void setAlphaSliderText(String str) {
        this.f22883x = str;
        invalidate();
    }

    public void setAlphaSliderVisible(boolean z) {
        if (this.f22882w != z) {
            this.f22882w = z;
            this.f22873n = null;
            this.f22874o = null;
            this.f22875p = null;
            this.f22877r = null;
            this.f22876q = null;
            requestLayout();
        }
    }

    public void setBorderColor(int i) {
        this.f22885z = i;
        invalidate();
    }

    public void setColor(int i) {
        mo20046a(i, false);
    }

    public void setOnColorChangedListener(C6438c cVar) {
        this.f22860H = cVar;
    }

    public void setSliderTrackerColor(int i) {
        this.f22884y = i;
        this.f22871l.setColor(this.f22884y);
        invalidate();
    }
}
