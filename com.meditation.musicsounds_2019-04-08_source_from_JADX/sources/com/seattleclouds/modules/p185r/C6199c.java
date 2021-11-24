package com.seattleclouds.modules.p185r;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.C6557s;
import com.seattleclouds.util.C6620n;
import com.seattleclouds.util.C6638s;
import java.io.File;

/* renamed from: com.seattleclouds.modules.r.c */
public class C6199c extends C6557s {

    /* renamed from: ag */
    private static final Point f21992ag = new Point(600, 800);
    /* access modifiers changed from: private */

    /* renamed from: ah */
    public static final Point f21993ah = new Point(768, 1024);
    /* access modifiers changed from: private */

    /* renamed from: ai */
    public static final Point[] f21994ai = {new Point(1536, 2048), new Point(1152, 1536), new Point(768, 1024), new Point(600, 800)};

    /* renamed from: a */
    final OnGlobalLayoutListener f21995a = new OnGlobalLayoutListener() {
        public void onGlobalLayout() {
            C6199c.this.m30214az();
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: ae */
    public boolean f21996ae = false;
    /* access modifiers changed from: private */

    /* renamed from: af */
    public boolean f21997af = false;
    /* access modifiers changed from: private */

    /* renamed from: aj */
    public Boolean f21998aj;

    /* renamed from: b */
    private LinearLayout f21999b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C6207c f22000c;

    /* renamed from: d */
    private Button f22001d;

    /* renamed from: e */
    private Button f22002e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public String f22003f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public Bitmap f22004g = null;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public boolean f22005h = false;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public boolean f22006i = false;

    /* renamed from: com.seattleclouds.modules.r.c$a */
    private class C6205a extends C6217f {
        public C6205a(Context context) {
            super(context);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Integer doInBackground(Void... voidArr) {
            C6199c.this.f22004g = C6194a.m30184a(C6199c.this.f22004g);
            return null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(Integer num) {
            super.onPostExecute(num);
            C6199c.this.f22000c.invalidate();
        }
    }

    /* renamed from: com.seattleclouds.modules.r.c$b */
    private class C6206b extends C6217f {
        public C6206b(Context context) {
            super(context);
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:47:0x0193 A[SYNTHETIC, Splitter:B:47:0x0193] */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x0199 A[SYNTHETIC, Splitter:B:52:0x0199] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Integer doInBackground(java.lang.Void... r8) {
            /*
                r7 = this;
                android.graphics.Point[] r8 = com.seattleclouds.modules.p185r.C6199c.f21994ai
                int r0 = r8.length
                r1 = 0
            L_0x0006:
                if (r1 >= r0) goto L_0x00fd
                r2 = r8[r1]
                com.seattleclouds.modules.r.c r3 = com.seattleclouds.modules.p185r.C6199c.this     // Catch:{ OutOfMemoryError -> 0x00f1 }
                com.seattleclouds.modules.r.c r4 = com.seattleclouds.modules.p185r.C6199c.this     // Catch:{ OutOfMemoryError -> 0x00f1 }
                int r5 = r2.x     // Catch:{ OutOfMemoryError -> 0x00f1 }
                int r2 = r2.y     // Catch:{ OutOfMemoryError -> 0x00f1 }
                android.graphics.Bitmap r2 = r4.m30215b(r5, r2)     // Catch:{ OutOfMemoryError -> 0x00f1 }
                r3.f22004g = r2     // Catch:{ OutOfMemoryError -> 0x00f1 }
                com.seattleclouds.modules.r.c r2 = com.seattleclouds.modules.p185r.C6199c.this     // Catch:{ OutOfMemoryError -> 0x00f1 }
                boolean r2 = r2.f22005h     // Catch:{ OutOfMemoryError -> 0x00f1 }
                if (r2 == 0) goto L_0x0026
                com.seattleclouds.modules.r.c r2 = com.seattleclouds.modules.p185r.C6199c.this     // Catch:{ OutOfMemoryError -> 0x00f1 }
                r2.m30210aB()     // Catch:{ OutOfMemoryError -> 0x00f1 }
            L_0x0026:
                com.seattleclouds.modules.r.c r2 = com.seattleclouds.modules.p185r.C6199c.this     // Catch:{ OutOfMemoryError -> 0x00f1 }
                android.graphics.Bitmap r2 = r2.f22004g     // Catch:{ OutOfMemoryError -> 0x00f1 }
                int r2 = r2.getWidth()     // Catch:{ OutOfMemoryError -> 0x00f1 }
                android.graphics.Point r3 = com.seattleclouds.modules.p185r.C6199c.f21993ah     // Catch:{ OutOfMemoryError -> 0x00f1 }
                int r3 = r3.x     // Catch:{ OutOfMemoryError -> 0x00f1 }
                if (r2 > r3) goto L_0x004a
                com.seattleclouds.modules.r.c r2 = com.seattleclouds.modules.p185r.C6199c.this     // Catch:{ OutOfMemoryError -> 0x00f1 }
                android.graphics.Bitmap r2 = r2.f22004g     // Catch:{ OutOfMemoryError -> 0x00f1 }
                int r2 = r2.getHeight()     // Catch:{ OutOfMemoryError -> 0x00f1 }
                android.graphics.Point r3 = com.seattleclouds.modules.p185r.C6199c.f21993ah     // Catch:{ OutOfMemoryError -> 0x00f1 }
                int r3 = r3.y     // Catch:{ OutOfMemoryError -> 0x00f1 }
                if (r2 <= r3) goto L_0x0087
            L_0x004a:
                com.seattleclouds.modules.r.c r2 = com.seattleclouds.modules.p185r.C6199c.this     // Catch:{ OutOfMemoryError -> 0x00f1 }
                android.graphics.Bitmap r2 = r2.f22004g     // Catch:{ OutOfMemoryError -> 0x00f1 }
                int r2 = r2.getWidth()     // Catch:{ OutOfMemoryError -> 0x00f1 }
                float r2 = (float) r2     // Catch:{ OutOfMemoryError -> 0x00f1 }
                android.graphics.Point r3 = com.seattleclouds.modules.p185r.C6199c.f21993ah     // Catch:{ OutOfMemoryError -> 0x00f1 }
                int r3 = r3.x     // Catch:{ OutOfMemoryError -> 0x00f1 }
                float r3 = (float) r3     // Catch:{ OutOfMemoryError -> 0x00f1 }
                float r2 = r2 / r3
                com.seattleclouds.modules.r.c r3 = com.seattleclouds.modules.p185r.C6199c.this     // Catch:{ OutOfMemoryError -> 0x00f1 }
                com.seattleclouds.modules.r.c r4 = com.seattleclouds.modules.p185r.C6199c.this     // Catch:{ OutOfMemoryError -> 0x00f1 }
                android.graphics.Bitmap r4 = r4.f22004g     // Catch:{ OutOfMemoryError -> 0x00f1 }
                com.seattleclouds.modules.r.c r5 = com.seattleclouds.modules.p185r.C6199c.this     // Catch:{ OutOfMemoryError -> 0x00f1 }
                android.graphics.Bitmap r5 = r5.f22004g     // Catch:{ OutOfMemoryError -> 0x00f1 }
                int r5 = r5.getWidth()     // Catch:{ OutOfMemoryError -> 0x00f1 }
                float r5 = (float) r5     // Catch:{ OutOfMemoryError -> 0x00f1 }
                float r5 = r5 / r2
                int r5 = (int) r5     // Catch:{ OutOfMemoryError -> 0x00f1 }
                com.seattleclouds.modules.r.c r6 = com.seattleclouds.modules.p185r.C6199c.this     // Catch:{ OutOfMemoryError -> 0x00f1 }
                android.graphics.Bitmap r6 = r6.f22004g     // Catch:{ OutOfMemoryError -> 0x00f1 }
                int r6 = r6.getHeight()     // Catch:{ OutOfMemoryError -> 0x00f1 }
                float r6 = (float) r6     // Catch:{ OutOfMemoryError -> 0x00f1 }
                float r6 = r6 / r2
                int r2 = (int) r6     // Catch:{ OutOfMemoryError -> 0x00f1 }
                r6 = 1
                android.graphics.Bitmap r2 = com.seattleclouds.util.C6638s.m32066a(r4, r5, r2, r6)     // Catch:{ OutOfMemoryError -> 0x00f1 }
                r3.f22004g = r2     // Catch:{ OutOfMemoryError -> 0x00f1 }
            L_0x0087:
                com.seattleclouds.modules.r.c r2 = com.seattleclouds.modules.p185r.C6199c.this     // Catch:{ OutOfMemoryError -> 0x00f1 }
                boolean r2 = r2.f21996ae     // Catch:{ OutOfMemoryError -> 0x00f1 }
                if (r2 == 0) goto L_0x009f
                com.seattleclouds.modules.r.c r2 = com.seattleclouds.modules.p185r.C6199c.this     // Catch:{ OutOfMemoryError -> 0x00f1 }
                com.seattleclouds.modules.r.c r3 = com.seattleclouds.modules.p185r.C6199c.this     // Catch:{ OutOfMemoryError -> 0x00f1 }
                android.graphics.Bitmap r3 = r3.f22004g     // Catch:{ OutOfMemoryError -> 0x00f1 }
                android.graphics.Bitmap r3 = com.seattleclouds.modules.p185r.C6194a.m30184a(r3)     // Catch:{ OutOfMemoryError -> 0x00f1 }
            L_0x009b:
                r2.f22004g = r3     // Catch:{ OutOfMemoryError -> 0x00f1 }
                goto L_0x00fd
            L_0x009f:
                com.seattleclouds.modules.r.c r2 = com.seattleclouds.modules.p185r.C6199c.this     // Catch:{ OutOfMemoryError -> 0x00f1 }
                boolean r2 = r2.f22006i     // Catch:{ OutOfMemoryError -> 0x00f1 }
                if (r2 == 0) goto L_0x00fd
                android.graphics.Paint r2 = new android.graphics.Paint     // Catch:{ OutOfMemoryError -> 0x00f1 }
                r2.<init>()     // Catch:{ OutOfMemoryError -> 0x00f1 }
                android.graphics.ColorMatrix r3 = new android.graphics.ColorMatrix     // Catch:{ OutOfMemoryError -> 0x00f1 }
                r3.<init>()     // Catch:{ OutOfMemoryError -> 0x00f1 }
                r4 = 0
                r3.setSaturation(r4)     // Catch:{ OutOfMemoryError -> 0x00f1 }
                android.graphics.ColorMatrixColorFilter r5 = new android.graphics.ColorMatrixColorFilter     // Catch:{ OutOfMemoryError -> 0x00f1 }
                r5.<init>(r3)     // Catch:{ OutOfMemoryError -> 0x00f1 }
                r2.setColorFilter(r5)     // Catch:{ OutOfMemoryError -> 0x00f1 }
                com.seattleclouds.modules.r.c r3 = com.seattleclouds.modules.p185r.C6199c.this     // Catch:{ OutOfMemoryError -> 0x00f1 }
                android.graphics.Bitmap r3 = r3.f22004g     // Catch:{ OutOfMemoryError -> 0x00f1 }
                int r3 = r3.getWidth()     // Catch:{ OutOfMemoryError -> 0x00f1 }
                com.seattleclouds.modules.r.c r5 = com.seattleclouds.modules.p185r.C6199c.this     // Catch:{ OutOfMemoryError -> 0x00f1 }
                android.graphics.Bitmap r5 = r5.f22004g     // Catch:{ OutOfMemoryError -> 0x00f1 }
                int r5 = r5.getHeight()     // Catch:{ OutOfMemoryError -> 0x00f1 }
                android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ OutOfMemoryError -> 0x00f1 }
                android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r3, r5, r6)     // Catch:{ OutOfMemoryError -> 0x00f1 }
                android.graphics.Canvas r5 = new android.graphics.Canvas     // Catch:{ OutOfMemoryError -> 0x00f1 }
                r5.<init>(r3)     // Catch:{ OutOfMemoryError -> 0x00f1 }
                com.seattleclouds.modules.r.c r6 = com.seattleclouds.modules.p185r.C6199c.this     // Catch:{ OutOfMemoryError -> 0x00f1 }
                android.graphics.Bitmap r6 = r6.f22004g     // Catch:{ OutOfMemoryError -> 0x00f1 }
                r5.drawBitmap(r6, r4, r4, r2)     // Catch:{ OutOfMemoryError -> 0x00f1 }
                com.seattleclouds.modules.r.c r2 = com.seattleclouds.modules.p185r.C6199c.this     // Catch:{ OutOfMemoryError -> 0x00f1 }
                android.graphics.Bitmap r2 = r2.f22004g     // Catch:{ OutOfMemoryError -> 0x00f1 }
                r2.recycle()     // Catch:{ OutOfMemoryError -> 0x00f1 }
                com.seattleclouds.modules.r.c r2 = com.seattleclouds.modules.p185r.C6199c.this     // Catch:{ OutOfMemoryError -> 0x00f1 }
                goto L_0x009b
            L_0x00f1:
                r2 = move-exception
                java.lang.String r3 = "ImageCropFragment:"
                java.lang.String r4 = "save"
                android.util.Log.e(r3, r4, r2)
                int r1 = r1 + 1
                goto L_0x0006
            L_0x00fd:
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                com.seattleclouds.modules.r.c r0 = com.seattleclouds.modules.p185r.C6199c.this
                java.lang.String r0 = r0.f22003f
                r8.append(r0)
                java.lang.String r0 = "_temp"
                r8.append(r0)
                java.lang.String r8 = r8.toString()
                r0 = 0
                java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0183 }
                r1.<init>(r8)     // Catch:{ Exception -> 0x0183 }
                com.seattleclouds.modules.r.c r2 = com.seattleclouds.modules.p185r.C6199c.this     // Catch:{ Exception -> 0x017e, all -> 0x017b }
                android.graphics.Bitmap r2 = r2.f22004g     // Catch:{ Exception -> 0x017e, all -> 0x017b }
                android.graphics.Bitmap$CompressFormat r3 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Exception -> 0x017e, all -> 0x017b }
                r4 = 100
                r2.compress(r3, r4, r1)     // Catch:{ Exception -> 0x017e, all -> 0x017b }
                r1.close()     // Catch:{ Throwable -> 0x012a }
            L_0x012a:
                com.seattleclouds.modules.r.c r1 = com.seattleclouds.modules.p185r.C6199c.this
                android.graphics.Bitmap r1 = r1.f22004g
                r1.recycle()
                java.io.File r1 = new java.io.File
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                com.seattleclouds.modules.r.c r3 = com.seattleclouds.modules.p185r.C6199c.this
                java.lang.String r3 = r3.f22003f
                r2.append(r3)
                java.lang.String r3 = "_temp2"
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                java.io.File r2 = new java.io.File
                com.seattleclouds.modules.r.c r3 = com.seattleclouds.modules.p185r.C6199c.this
                java.lang.String r3 = r3.f22003f
                r2.<init>(r3)
                boolean r3 = r2.renameTo(r1)
                if (r3 == 0) goto L_0x016f
                java.io.File r3 = new java.io.File
                r3.<init>(r8)
                boolean r8 = r3.renameTo(r2)
                if (r8 == 0) goto L_0x016f
                r1.delete()
                return r0
            L_0x016f:
                com.seattleclouds.modules.r.c r8 = com.seattleclouds.modules.p185r.C6199c.this
                r8.m30212as()
                int r8 = com.seattleclouds.C5451m.C5462k.scan_document_failed_to_save
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
                return r8
            L_0x017b:
                r8 = move-exception
                r0 = r1
                goto L_0x0197
            L_0x017e:
                r8 = move-exception
                r0 = r1
                goto L_0x0184
            L_0x0181:
                r8 = move-exception
                goto L_0x0197
            L_0x0183:
                r8 = move-exception
            L_0x0184:
                java.lang.String r1 = "ImageCropFragment"
                java.lang.String r2 = "saveCroppedImage"
                android.util.Log.e(r1, r2, r8)     // Catch:{ all -> 0x0181 }
                int r8 = com.seattleclouds.C5451m.C5462k.scan_document_failed_to_save     // Catch:{ all -> 0x0181 }
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0181 }
                if (r0 == 0) goto L_0x0196
                r0.close()     // Catch:{ Throwable -> 0x0196 }
            L_0x0196:
                return r8
            L_0x0197:
                if (r0 == 0) goto L_0x019c
                r0.close()     // Catch:{ Throwable -> 0x019c }
            L_0x019c:
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.modules.p185r.C6199c.C6206b.doInBackground(java.lang.Void[]):java.lang.Integer");
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(Integer num) {
            super.onPostExecute(num);
            if (num == null) {
                C6199c.this.mo1318s().setResult(-1);
                C6199c.this.mo1318s().finish();
                return;
            }
            C6620n.m32028a((Context) C6199c.this.mo1318s(), C5462k.error, num.intValue());
        }
    }

    /* renamed from: com.seattleclouds.modules.r.c$c */
    private class C6207c extends View implements OnTouchListener {

        /* renamed from: b */
        private PointF f22015b;

        /* renamed from: c */
        private PointF f22016c;

        /* renamed from: d */
        private PointF f22017d;

        /* renamed from: e */
        private PointF f22018e;

        /* renamed from: f */
        private PointF f22019f;

        /* renamed from: g */
        private Path f22020g = new Path();

        /* renamed from: h */
        private Path f22021h = new Path();

        /* renamed from: i */
        private Path f22022i = new Path();

        /* renamed from: j */
        private Path f22023j = new Path();

        /* renamed from: k */
        private Path f22024k = new Path();

        /* renamed from: l */
        private float f22025l;

        /* renamed from: m */
        private float f22026m;

        /* renamed from: n */
        private Matrix f22027n = new Matrix();

        /* renamed from: o */
        private Rect f22028o = null;

        /* renamed from: p */
        private Point f22029p = new Point(170, 170);

        /* renamed from: q */
        private final Paint f22030q = new Paint() {
            {
                setStyle(Style.STROKE);
                setStrokeCap(Cap.ROUND);
                setStrokeWidth(3.0f);
                setAntiAlias(true);
                setColor(-16776961);
                setStrokeWidth(4.0f);
            }
        };

        /* renamed from: r */
        private final Paint f22031r = new Paint() {
            {
                setColor(-16776961);
                setStyle(Style.STROKE);
                setStrokeWidth(2.0f);
            }
        };

        /* renamed from: s */
        private final Paint f22032s = new Paint() {
            {
                setAlpha(229);
            }
        };

        /* renamed from: t */
        private final Paint f22033t = new Paint();

        public C6207c(Context context) {
            super(context);
            setOnTouchListener(this);
        }

        /* renamed from: a */
        private PointF m30241a(PointF pointF, float f) {
            return new PointF((pointF.x - ((float) this.f22028o.left)) / f, (pointF.y - ((float) this.f22028o.top)) / f);
        }

        /* renamed from: a */
        private void m30242a(PointF pointF) {
            if (pointF.x < ((float) this.f22028o.left)) {
                pointF.x = (float) this.f22028o.left;
            }
            if (pointF.y < ((float) this.f22028o.top)) {
                pointF.y = (float) this.f22028o.top;
            }
            if (pointF.x > ((float) this.f22028o.right)) {
                pointF.x = (float) this.f22028o.right;
            }
            if (pointF.y > ((float) this.f22028o.bottom)) {
                pointF.y = (float) this.f22028o.bottom;
            }
        }

        /* renamed from: a */
        private void m30243a(Rect rect) {
            this.f22028o = rect;
            m30244b();
        }

        /* renamed from: b */
        private void m30244b() {
            if (this.f22015b == null) {
                this.f22015b = new PointF((float) (this.f22028o.left + 10), (float) (this.f22028o.top + 10));
                this.f22016c = new PointF((float) (this.f22028o.right - 10), (float) (this.f22028o.top + 10));
                this.f22017d = new PointF((float) (this.f22028o.left + 10), (float) (this.f22028o.bottom - 10));
                this.f22018e = new PointF((float) (this.f22028o.right - 10), (float) (this.f22028o.bottom - 10));
                return;
            }
            m30242a(this.f22015b);
            m30242a(this.f22016c);
            m30242a(this.f22017d);
            m30242a(this.f22018e);
            invalidate();
        }

        /* renamed from: a */
        public PointF mo19468a(float f) {
            return new PointF((this.f22015b.x - ((float) this.f22028o.left)) / f, (this.f22015b.y - ((float) this.f22028o.top)) / f);
        }

        /* renamed from: a */
        public void mo19469a() {
            float min = Math.min(((float) getWidth()) / ((float) C6199c.this.f22004g.getWidth()), ((float) getHeight()) / ((float) C6199c.this.f22004g.getHeight()));
            int width = (int) ((((float) getWidth()) - (((float) C6199c.this.f22004g.getWidth()) * min)) / 2.0f);
            int height = (int) ((((float) getHeight()) - (((float) C6199c.this.f22004g.getHeight()) * min)) / 2.0f);
            m30243a(new Rect(width, height, (int) (((float) width) + (((float) C6199c.this.f22004g.getWidth()) * min)), (int) (((float) height) + (((float) C6199c.this.f22004g.getHeight()) * min))));
            C6199c.this.f22000c.invalidate();
        }

        /* renamed from: a */
        public void mo19470a(ColorMatrix colorMatrix) {
            if (colorMatrix == null) {
                this.f22033t.setColorFilter(null);
                this.f22032s.setColorFilter(null);
            } else {
                this.f22033t.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                this.f22032s.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            }
            invalidate();
        }

        /* renamed from: b */
        public PointF mo19471b(float f) {
            return new PointF((this.f22016c.x - ((float) this.f22028o.left)) / f, (this.f22016c.y - ((float) this.f22028o.top)) / f);
        }

        /* renamed from: c */
        public PointF mo19472c(float f) {
            return new PointF((this.f22017d.x - ((float) this.f22028o.left)) / f, (this.f22017d.y - ((float) this.f22028o.top)) / f);
        }

        /* renamed from: d */
        public PointF mo19473d(float f) {
            return new PointF((this.f22018e.x - ((float) this.f22028o.left)) / f, (this.f22018e.y - ((float) this.f22028o.top)) / f);
        }

        public void invalidate() {
            this.f22020g.reset();
            this.f22021h.reset();
            this.f22022i.reset();
            this.f22023j.reset();
            this.f22024k.reset();
            super.invalidate();
        }

        /* access modifiers changed from: protected */
        public void onDraw(Canvas canvas) {
            char c;
            Canvas canvas2 = canvas;
            if (C6199c.this.f22004g == null || C6199c.this.f22004g.isRecycled()) {
                c = 0;
            } else {
                canvas2.drawBitmap(C6199c.this.f22004g, null, this.f22028o, this.f22033t);
                if (!C6199c.this.f21997af) {
                    float min = Math.min(((float) getWidth()) / ((float) C6199c.this.f22004g.getWidth()), ((float) getHeight()) / ((float) C6199c.this.f22004g.getHeight()));
                    PointF a = m30241a(this.f22015b, min);
                    PointF a2 = m30241a(this.f22016c, min);
                    PointF a3 = m30241a(this.f22017d, min);
                    PointF a4 = m30241a(this.f22018e, min);
                    Point c2 = C6194a.m30188c(a, a2, a3, a4);
                    int i = c2.x;
                    int i2 = c2.y;
                    float[] fArr = {a.x, a.y, a2.x, a2.y, a3.x, a3.y, a4.x, a4.y};
                    float f = (float) i;
                    float f2 = (float) i2;
                    float[] fArr2 = {0.0f, 0.0f, f, 0.0f, 0.0f, f2, f, f2};
                    float max = (float) Math.max(i / this.f22029p.x, i2 / this.f22029p.y);
                    int min2 = Math.min(this.f22029p.x, (int) (f / max));
                    int min3 = Math.min(this.f22029p.y, (int) (f2 / max));
                    float width = (float) getWidth();
                    float f3 = f2;
                    float f4 = f;
                    int i3 = min3;
                    c = 0;
                    canvas.drawRect((float) ((getWidth() - min2) - 2), 0.0f, width, (float) (min3 + 2), this.f22031r);
                    this.f22027n.reset();
                    this.f22027n.setPolyToPoly(fArr, 0, fArr2, 0, fArr.length >> 1);
                    canvas.save();
                    canvas2.translate((float) ((getWidth() - min2) - 1), 1.0f);
                    canvas2.clipRect(0, 0, min2, i3);
                    canvas2.scale(((float) min2) / f4, ((float) i3) / f3);
                    canvas2.drawBitmap(C6199c.this.f22004g, this.f22027n, this.f22032s);
                    canvas.restore();
                } else {
                    return;
                }
            }
            float[] fArr3 = new float[16];
            fArr3[c] = this.f22015b.x;
            fArr3[1] = this.f22015b.y;
            fArr3[2] = this.f22016c.x;
            fArr3[3] = this.f22016c.y;
            fArr3[4] = this.f22017d.x;
            fArr3[5] = this.f22017d.y;
            fArr3[6] = this.f22018e.x;
            fArr3[7] = this.f22018e.y;
            fArr3[8] = this.f22015b.x;
            fArr3[9] = this.f22015b.y;
            fArr3[10] = this.f22017d.x;
            fArr3[11] = this.f22017d.y;
            fArr3[12] = this.f22016c.x;
            fArr3[13] = this.f22016c.y;
            fArr3[14] = this.f22018e.x;
            fArr3[15] = this.f22018e.y;
            canvas2.drawLines(fArr3, this.f22030q);
            this.f22020g.moveTo(this.f22016c.x - (((this.f22016c.x - this.f22015b.x) / 2.0f) / 0.6666f), this.f22016c.y - (((this.f22016c.y - this.f22015b.y) / 2.0f) / 0.6666f));
            this.f22020g.lineTo(this.f22017d.x - (((this.f22017d.x - this.f22018e.x) / 2.0f) / 2.0f), this.f22017d.y - (((this.f22017d.y - this.f22018e.y) / 2.0f) / 2.0f));
            canvas2.drawPath(this.f22020g, this.f22030q);
            this.f22021h.moveTo(this.f22016c.x - ((this.f22016c.x - this.f22015b.x) / 2.0f), this.f22016c.y - ((this.f22016c.y - this.f22015b.y) / 2.0f));
            this.f22021h.lineTo(this.f22017d.x - ((this.f22017d.x - this.f22018e.x) / 2.0f), this.f22017d.y - ((this.f22017d.y - this.f22018e.y) / 2.0f));
            canvas2.drawPath(this.f22021h, this.f22030q);
            this.f22022i.moveTo(this.f22016c.x - (((this.f22016c.x - this.f22015b.x) / 2.0f) / 2.0f), this.f22016c.y - (((this.f22016c.y - this.f22015b.y) / 2.0f) / 2.0f));
            this.f22022i.lineTo(this.f22017d.x - (((this.f22017d.x - this.f22018e.x) / 2.0f) / 0.6666f), this.f22017d.y - (((this.f22017d.y - this.f22018e.y) / 2.0f) / 0.6666f));
            canvas2.drawPath(this.f22022i, this.f22030q);
            this.f22023j.moveTo(this.f22015b.x - (((this.f22015b.x - this.f22017d.x) / 2.0f) / 0.6666f), this.f22015b.y - (((this.f22015b.y - this.f22017d.y) / 2.0f) / 0.6666f));
            this.f22023j.lineTo(this.f22018e.x - (((this.f22018e.x - this.f22016c.x) / 2.0f) / 2.0f), this.f22018e.y - (((this.f22018e.y - this.f22016c.y) / 2.0f) / 2.0f));
            canvas2.drawPath(this.f22023j, this.f22030q);
            this.f22024k.moveTo(this.f22015b.x - ((this.f22015b.x - this.f22017d.x) / 2.0f), this.f22015b.y - ((this.f22015b.y - this.f22017d.y) / 2.0f));
            this.f22024k.lineTo(this.f22018e.x - ((this.f22018e.x - this.f22016c.x) / 2.0f), this.f22018e.y - ((this.f22018e.y - this.f22016c.y) / 2.0f));
            canvas2.drawPath(this.f22024k, this.f22030q);
            this.f22022i.moveTo(this.f22015b.x - (((this.f22015b.x - this.f22017d.x) / 2.0f) / 2.0f), this.f22015b.y - (((this.f22015b.y - this.f22017d.y) / 2.0f) / 2.0f));
            this.f22022i.lineTo(this.f22018e.x - (((this.f22018e.x - this.f22016c.x) / 2.0f) / 0.6666f), this.f22018e.y - (((this.f22018e.y - this.f22016c.y) / 2.0f) / 0.6666f));
            canvas2.drawPath(this.f22022i, this.f22030q);
        }

        /* access modifiers changed from: protected */
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (this.f22028o == null) {
                this.f22028o = new Rect(0, 0, getWidth(), getHeight());
            }
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            PointF pointF;
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            switch (motionEvent.getAction()) {
                case 0:
                    RectF rectF = new RectF(this.f22015b.x - 100.0f, this.f22015b.y - 100.0f, this.f22015b.x + 100.0f, this.f22015b.y + 100.0f);
                    RectF rectF2 = new RectF(this.f22016c.x - 100.0f, this.f22016c.y - 100.0f, this.f22016c.x + 100.0f, this.f22016c.y + 100.0f);
                    RectF rectF3 = new RectF(this.f22017d.x - 100.0f, this.f22017d.y - 100.0f, this.f22017d.x + 100.0f, this.f22017d.y + 100.0f);
                    RectF rectF4 = new RectF(this.f22018e.x - 100.0f, this.f22018e.y - 100.0f, this.f22018e.x + 100.0f, this.f22018e.y + 100.0f);
                    if (!rectF.contains(x, y)) {
                        if (!rectF2.contains(x, y)) {
                            if (!rectF3.contains(x, y)) {
                                if (!rectF4.contains(x, y)) {
                                    this.f22019f = null;
                                    break;
                                } else {
                                    pointF = this.f22018e;
                                }
                            } else {
                                pointF = this.f22017d;
                            }
                        } else {
                            pointF = this.f22016c;
                        }
                    } else {
                        pointF = this.f22015b;
                    }
                    this.f22019f = pointF;
                    break;
                case 1:
                case 3:
                    this.f22019f = null;
                    break;
                case 2:
                    if (this.f22019f != null) {
                        float f = x - this.f22025l;
                        float f2 = y - this.f22026m;
                        this.f22019f.x += f;
                        this.f22019f.y += f2;
                        m30242a(this.f22019f);
                        break;
                    } else {
                        return false;
                    }
            }
            invalidate();
            this.f22025l = x;
            this.f22026m = y;
            return true;
        }
    }

    @TargetApi(16)
    /* renamed from: a */
    private void m30208a(ViewTreeObserver viewTreeObserver, OnGlobalLayoutListener onGlobalLayoutListener) {
        if (viewTreeObserver != null && onGlobalLayoutListener != null) {
            if (VERSION.SDK_INT >= 16) {
                viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
            } else {
                viewTreeObserver.removeGlobalOnLayoutListener(onGlobalLayoutListener);
            }
        }
    }

    /* renamed from: aA */
    private void m30209aA() {
        this.f21996ae = false;
        this.f22004g.recycle();
        m30212as();
        m30210aB();
        this.f22000c.invalidate();
    }

    /* access modifiers changed from: private */
    /* renamed from: aB */
    public void m30210aB() {
        float min = Math.min(((float) this.f22000c.getWidth()) / ((float) this.f22004g.getWidth()), ((float) this.f22000c.getHeight()) / ((float) this.f22004g.getHeight()));
        PointF a = this.f22000c.mo19468a(min);
        PointF b = this.f22000c.mo19471b(min);
        PointF c = this.f22000c.mo19472c(min);
        PointF d = this.f22000c.mo19473d(min);
        Point c2 = C6194a.m30188c(a, b, c, d);
        Point a2 = C6194a.m30186a(a, b, c, d);
        Point b2 = C6194a.m30187b(a, b, c, d);
        this.f22004g = Bitmap.createBitmap(this.f22004g, a2.x, a2.y, b2.x - a2.x, b2.y - a2.y);
        float[] fArr = {a.x - ((float) a2.x), a.y - ((float) a2.y), b.x - ((float) a2.x), b.y - ((float) a2.y), c.x - ((float) a2.x), c.y - ((float) a2.y), d.x - ((float) a2.x), d.y - ((float) a2.y)};
        float[] fArr2 = {0.0f, 0.0f, (float) c2.x, 0.0f, 0.0f, (float) c2.y, (float) c2.x, (float) c2.y};
        Bitmap createBitmap = Bitmap.createBitmap(c2.x, c2.y, Config.RGB_565);
        Matrix matrix = new Matrix();
        matrix.setPolyToPoly(fArr, 0, fArr2, 0, fArr.length >> 1);
        new Canvas(createBitmap).drawBitmap(this.f22004g, matrix, null);
        this.f22004g.recycle();
        this.f22004g = createBitmap;
        this.f22005h = true;
    }

    /* access modifiers changed from: private */
    /* renamed from: aC */
    public void m30211aC() {
        this.f22004g.recycle();
        this.f22004g = null;
        new C6206b(mo1318s()).execute(new Void[0]);
    }

    /* access modifiers changed from: private */
    /* renamed from: as */
    public void m30212as() {
        this.f22004g = m30215b(f21992ag.x, f21992ag.y);
        if (this.f22004g != null) {
            if (this.f22004g.getWidth() > f21992ag.x || this.f22004g.getHeight() > f21992ag.y) {
                float width = ((float) this.f22004g.getWidth()) / ((float) f21992ag.x);
                this.f22004g = C6638s.m32066a(this.f22004g, (int) (((float) this.f22004g.getWidth()) / width), (int) (((float) this.f22004g.getHeight()) / width), true);
            }
        }
    }

    /* renamed from: at */
    private void m30213at() {
        this.f21996ae = true;
        new C6205a(mo1318s()).execute(new Void[0]);
    }

    /* access modifiers changed from: private */
    /* renamed from: az */
    public void m30214az() {
        if (!this.f21997af) {
            this.f22000c.mo19469a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public Bitmap m30215b(int i, int i2) {
        Bitmap a = C6194a.m30185a(this.f22003f, i, i2, Config.RGB_565);
        return a != null ? C6638s.m32070a(this.f22003f, a) : a;
    }

    /* renamed from: d */
    private void m30220d() {
        Bundle m = mo1307m();
        if (m != null) {
            this.f22003f = m.getString("ARG_IMAGE_PATH");
            if (this.f22003f != null) {
                m30212as();
            }
            this.f21998aj = Boolean.valueOf(m.getBoolean("SAVE_ON_CANCEL"));
        }
        if (this.f22004g != null) {
            FrameLayout frameLayout = (FrameLayout) this.f21999b.findViewById(C5458g.frame_layout);
            this.f22000c = new C6207c(mo1318s());
            this.f22000c.setLayoutParams(new LayoutParams(-1, -1, 1.0f));
            frameLayout.addView(this.f22000c);
            ViewTreeObserver viewTreeObserver = this.f22000c.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f21995a);
            }
            ((Button) this.f21999b.findViewById(C5458g.cancel_button)).setOnClickListener(new OnClickListener() {
                public void onClick(View view) {
                    if (!C6199c.this.f21998aj.booleanValue()) {
                        File file = new File(C6199c.this.f22003f);
                        if (C6199c.this.f22003f != null) {
                            file.delete();
                        }
                    }
                    C6199c.this.mo1318s().finish();
                }
            });
            this.f22002e = (Button) this.f21999b.findViewById(C5458g.next_button);
            this.f22002e.setOnClickListener(new OnClickListener() {
                public void onClick(View view) {
                    C6199c.this.m30222e();
                }
            });
            this.f22001d = (Button) this.f21999b.findViewById(C5458g.crop_button);
            this.f22001d.setOnClickListener(new OnClickListener() {
                public void onClick(View view) {
                    C6199c.this.m30210aB();
                    C6199c.this.m30222e();
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m30222e() {
        this.f22001d.setVisibility(8);
        this.f22002e.setText(C5462k.save);
        this.f22002e.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                C6199c.this.m30211aC();
            }
        });
        this.f21997af = true;
        this.f22000c.setOnTouchListener(null);
        this.f22000c.invalidate();
        mo20292ay();
    }

    /* renamed from: L */
    public void mo1202L() {
        if (this.f22004g != null) {
            this.f22004g.recycle();
            this.f22004g = null;
        }
        super.mo1202L();
    }

    /* renamed from: a */
    public View mo1217a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        mo1318s().setRequestedOrientation(1);
        this.f21999b = (LinearLayout) layoutInflater.inflate(C5460i.fragment_scan_document_image_crop, viewGroup, false);
        m30220d();
        return this.f21999b;
    }

    /* renamed from: a */
    public void mo1239a(Menu menu) {
        menu.clear();
        if (this.f21997af) {
            menu.add(0, C5458g.original, 0, C5462k.scan_document_to_original);
            menu.add(0, C5458g.grayscale_item, 0, C5462k.scan_document_to_grayscale);
            menu.add(0, C5458g.bin, 0, C5462k.scan_document_to_threshold);
        }
        super.mo1239a(menu);
    }

    /* renamed from: a */
    public boolean mo1245a(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == C5458g.original) {
            if (this.f21996ae) {
                m30209aA();
            }
            this.f22006i = false;
            this.f22000c.mo19470a((ColorMatrix) null);
            return true;
        } else if (itemId == C5458g.grayscale_item) {
            if (this.f21996ae) {
                m30209aA();
            }
            this.f22006i = true;
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(0.0f);
            this.f22000c.mo19470a(colorMatrix);
            return true;
        } else if (itemId != C5458g.bin) {
            return super.mo1245a(menuItem);
        } else {
            if (!this.f21996ae) {
                this.f22006i = false;
                m30213at();
                this.f22000c.mo19470a((ColorMatrix) null);
            }
            return true;
        }
    }

    /* renamed from: i */
    public void mo1296i() {
        m30208a(this.f22000c.getViewTreeObserver(), this.f21995a);
        super.mo1296i();
    }
}
