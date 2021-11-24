package com.seattleclouds.modules.signaturestamp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import com.seattleclouds.App;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5461j;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.C6348n;
import com.seattleclouds.util.C6620n;
import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import p194nl.siegmann.epublib.domain.TableOfContents;

public class DrawSurfaceActivity extends C6348n {
    /* access modifiers changed from: private */

    /* renamed from: n */
    public ArrayList<Path> f22284n = new ArrayList<>();
    /* access modifiers changed from: private */

    /* renamed from: o */
    public ArrayList<DrawHistory> f22285o = new ArrayList<>();
    /* access modifiers changed from: private */

    /* renamed from: p */
    public Paint f22286p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public Paint f22287q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public Paint f22288r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public Paint f22289s;

    /* renamed from: t */
    private int f22290t = 0;

    /* renamed from: u */
    private int f22291u = 0;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public Rect f22292v = null;

    /* renamed from: w */
    private C6280a f22293w;

    /* renamed from: com.seattleclouds.modules.signaturestamp.DrawSurfaceActivity$a */
    class C6280a extends SurfaceView implements Callback {

        /* renamed from: b */
        private C6281b f22296b;

        /* renamed from: c */
        private Path f22297c;

        public C6280a(Context context) {
            super(context);
            getHolder().addCallback(this);
            this.f22296b = new C6281b(getHolder(), this);
        }

        /* renamed from: a */
        public DrawHistory mo19642a(float f, float f2, int i) {
            DrawHistory drawHistory = new DrawHistory(f, f2, getWidth(), getHeight(), i);
            return drawHistory;
        }

        /* renamed from: a */
        public void mo19643a() {
            synchronized (this.f22296b.mo19652a()) {
                DrawSurfaceActivity.this.f22284n.clear();
            }
        }

        /* renamed from: a */
        public void mo19644a(DrawHistory drawHistory) {
            float f = drawHistory.f22279a;
            float f2 = drawHistory.f22280b;
            int width = getWidth();
            int height = getHeight();
            if (!(width == drawHistory.f22281c && height == drawHistory.f22282d)) {
                f += (float) ((width - drawHistory.f22281c) / 2);
                f2 += (float) ((height - drawHistory.f22282d) / 2);
            }
            mo19646b(f, f2, drawHistory.f22283e);
        }

        /* renamed from: b */
        public Bitmap mo19645b() {
            DrawSurfaceActivity.this.getWindowManager().getDefaultDisplay().getMetrics(new DisplayMetrics());
            Rect rect = new Rect(0, 0, DrawSurfaceActivity.this.f22292v.right - DrawSurfaceActivity.this.f22292v.left, DrawSurfaceActivity.this.f22292v.bottom - DrawSurfaceActivity.this.f22292v.top);
            Bitmap createBitmap = Bitmap.createBitmap(rect.right, rect.bottom, Config.ARGB_8888);
            createBitmap.setDensity(160);
            Canvas canvas = new Canvas(createBitmap);
            Paint paint = new Paint();
            paint.setColor(-1);
            paint.setStyle(Style.FILL);
            canvas.drawRect(0.0f, 0.0f, (float) rect.right, (float) rect.bottom, paint);
            canvas.drawRect(rect, DrawSurfaceActivity.this.f22289s);
            canvas.translate((float) (-DrawSurfaceActivity.this.f22292v.left), (float) (-DrawSurfaceActivity.this.f22292v.top));
            Iterator it = DrawSurfaceActivity.this.f22284n.iterator();
            while (it.hasNext()) {
                canvas.drawPath((Path) it.next(), DrawSurfaceActivity.this.f22286p);
            }
            return createBitmap;
        }

        /* renamed from: b */
        public void mo19646b(float f, float f2, int i) {
            switch (i) {
                case 0:
                    this.f22297c = new Path();
                    DrawSurfaceActivity.this.f22284n.add(this.f22297c);
                    this.f22297c.moveTo(f, f2);
                    break;
                case 1:
                case 2:
                    break;
                default:
                    return;
            }
            this.f22297c.lineTo(f, f2);
        }

        @SuppressLint({"DrawAllocation"})
        public void onDraw(Canvas canvas) {
            canvas.drawRect(new Rect(0, 0, getWidth(), getHeight()), DrawSurfaceActivity.this.f22287q);
            if (DrawSurfaceActivity.this.f22292v != null) {
                canvas.drawRect(DrawSurfaceActivity.this.f22292v, DrawSurfaceActivity.this.f22289s);
                canvas.drawRect(DrawSurfaceActivity.this.f22292v, DrawSurfaceActivity.this.f22288r);
            }
            Iterator it = DrawSurfaceActivity.this.f22284n.iterator();
            while (it.hasNext()) {
                canvas.drawPath((Path) it.next(), DrawSurfaceActivity.this.f22286p);
            }
        }

        public boolean onTouchEvent(MotionEvent motionEvent) {
            ArrayList c;
            DrawHistory a;
            synchronized (this.f22296b.mo19652a()) {
                if (motionEvent.getAction() == 0) {
                    mo19646b(motionEvent.getX(), motionEvent.getY(), motionEvent.getAction());
                    c = DrawSurfaceActivity.this.f22285o;
                    a = mo19642a(motionEvent.getX(), motionEvent.getY(), motionEvent.getAction());
                } else if (motionEvent.getAction() == 2) {
                    mo19646b(motionEvent.getX(), motionEvent.getY(), motionEvent.getAction());
                    c = DrawSurfaceActivity.this.f22285o;
                    a = mo19642a(motionEvent.getX(), motionEvent.getY(), motionEvent.getAction());
                } else if (motionEvent.getAction() == 1) {
                    mo19646b(motionEvent.getX(), motionEvent.getY(), motionEvent.getAction());
                    c = DrawSurfaceActivity.this.f22285o;
                    a = mo19642a(motionEvent.getX(), motionEvent.getY(), motionEvent.getAction());
                }
                c.add(a);
            }
            return true;
        }

        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        }

        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            this.f22296b.mo19653a(true);
            this.f22296b.start();
        }

        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            this.f22296b.mo19653a(false);
            boolean z = true;
            while (z) {
                try {
                    this.f22296b.join();
                    z = false;
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    /* renamed from: com.seattleclouds.modules.signaturestamp.DrawSurfaceActivity$b */
    class C6281b extends Thread {

        /* renamed from: b */
        private final SurfaceHolder f22299b;

        /* renamed from: c */
        private C6280a f22300c;

        /* renamed from: d */
        private boolean f22301d = false;

        public C6281b(SurfaceHolder surfaceHolder, C6280a aVar) {
            this.f22299b = surfaceHolder;
            this.f22300c = aVar;
        }

        /* renamed from: a */
        public SurfaceHolder mo19652a() {
            return this.f22299b;
        }

        /* renamed from: a */
        public void mo19653a(boolean z) {
            this.f22301d = z;
        }

        /* JADX WARNING: Removed duplicated region for block: B:30:0x003a  */
        @android.annotation.SuppressLint({"WrongCall"})
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r5 = this;
            L_0x0000:
                boolean r0 = r5.f22301d
                if (r0 == 0) goto L_0x0040
                r0 = 0
                android.view.SurfaceHolder r1 = r5.f22299b     // Catch:{ Exception -> 0x0029, all -> 0x0024 }
                android.graphics.Canvas r1 = r1.lockCanvas()     // Catch:{ Exception -> 0x0029, all -> 0x0024 }
                if (r1 == 0) goto L_0x001c
                android.view.SurfaceHolder r0 = r5.f22299b     // Catch:{ Exception -> 0x001a }
                monitor-enter(r0)     // Catch:{ Exception -> 0x001a }
                com.seattleclouds.modules.signaturestamp.DrawSurfaceActivity$a r2 = r5.f22300c     // Catch:{ all -> 0x0017 }
                r2.onDraw(r1)     // Catch:{ all -> 0x0017 }
                monitor-exit(r0)     // Catch:{ all -> 0x0017 }
                goto L_0x001c
            L_0x0017:
                r2 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0017 }
                throw r2     // Catch:{ Exception -> 0x001a }
            L_0x001a:
                r0 = move-exception
                goto L_0x002d
            L_0x001c:
                if (r1 == 0) goto L_0x0000
            L_0x001e:
                android.view.SurfaceHolder r0 = r5.f22299b
                r0.unlockCanvasAndPost(r1)
                goto L_0x0000
            L_0x0024:
                r1 = move-exception
                r4 = r1
                r1 = r0
                r0 = r4
                goto L_0x0038
            L_0x0029:
                r1 = move-exception
                r4 = r1
                r1 = r0
                r0 = r4
            L_0x002d:
                java.lang.String r2 = "SignatureStamp"
                java.lang.String r3 = "Exception:"
                android.util.Log.d(r2, r3, r0)     // Catch:{ all -> 0x0037 }
                if (r1 == 0) goto L_0x0000
                goto L_0x001e
            L_0x0037:
                r0 = move-exception
            L_0x0038:
                if (r1 == 0) goto L_0x003f
                android.view.SurfaceHolder r2 = r5.f22299b
                r2.unlockCanvasAndPost(r1)
            L_0x003f:
                throw r0
            L_0x0040:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.modules.signaturestamp.DrawSurfaceActivity.C6281b.run():void");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public void m30530m() {
        int i;
        if (this.f22292v != null) {
            int width = this.f22293w.getWidth();
            int height = this.f22293w.getHeight();
            int width2 = this.f22292v.width();
            int height2 = this.f22292v.height();
            int i2 = (width - width2) / 2;
            int i3 = (height - height2) / 2;
            this.f22292v.set(i2, i3, width2 + i2, height2 + i3);
        } else if (this.f22290t <= 0 || this.f22291u <= 0) {
            this.f22292v = new Rect(0, 0, this.f22293w.getWidth(), this.f22293w.getHeight());
        } else {
            int i4 = this.f22290t;
            int i5 = this.f22291u;
            int width3 = this.f22293w.getWidth();
            int height3 = this.f22293w.getHeight();
            if (width3 > i4 || height3 > i5) {
                float min = Math.min(((float) width3) / ((float) this.f22290t), ((float) height3) / ((float) this.f22291u));
                i = (int) (((float) i4) * min);
                height3 = (int) (((float) i5) * min);
            } else {
                i = width3;
            }
            int width4 = ((this.f22293w.getWidth() / 2) - (i / 2)) + 1;
            int height4 = (this.f22293w.getHeight() / 2) - (height3 / 2);
            this.f22292v = new Rect(width4, height4, i + width4, height3 + height4);
        }
        this.f22293w.mo19643a();
        Iterator it = this.f22285o.iterator();
        while (it.hasNext()) {
            this.f22293w.mo19644a((DrawHistory) it.next());
        }
    }

    /* renamed from: n */
    private void m30531n() {
        Boolean bool;
        Bitmap b = this.f22293w.mo19645b();
        StringBuilder sb = new StringBuilder();
        sb.append(App.m25665m());
        sb.append("/SignatureStamp");
        String sb2 = sb.toString();
        new File(sb2).mkdirs();
        String format = new SimpleDateFormat("dd-MM-yyyy_HH-mm-ss").format(new Date());
        StringBuilder sb3 = new StringBuilder();
        sb3.append(format);
        sb3.append(".png");
        String sb4 = sb3.toString();
        StringBuilder sb5 = new StringBuilder();
        sb5.append(sb2);
        sb5.append(TableOfContents.DEFAULT_PATH_SEPARATOR);
        sb5.append(sb4);
        String sb6 = sb5.toString();
        try {
            b.compress(CompressFormat.PNG, 90, new FileOutputStream(sb6));
            bool = Boolean.valueOf(true);
        } catch (Exception unused) {
            bool = Boolean.valueOf(false);
        }
        if (bool.booleanValue()) {
            Intent intent = new Intent();
            intent.putExtra("ARG_IMAGE_PATH", sb6);
            setResult(-1, intent);
            finish();
            return;
        }
        setResult(0);
        C6620n.m32028a((Context) this, C5462k.draw_surface_info, C5462k.draw_surface_save_error);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f22293w = new C6280a(this);
        this.f22293w.setLayerType(0, null);
        setContentView((View) this.f22293w);
        setResult(0);
        this.f22286p = new Paint();
        this.f22286p.setDither(true);
        this.f22286p.setColor(-16777216);
        this.f22286p.setStyle(Style.STROKE);
        this.f22286p.setStrokeJoin(Join.ROUND);
        this.f22286p.setStrokeCap(Cap.ROUND);
        this.f22286p.setAntiAlias(true);
        this.f22286p.setStrokeWidth(4.0f);
        this.f22287q = new Paint();
        this.f22287q.setStyle(Style.FILL);
        this.f22287q.setColor(-16777216);
        this.f22288r = new Paint();
        this.f22288r.setColor(-10496);
        this.f22288r.setStyle(Style.STROKE);
        this.f22288r.setStrokeWidth(3.0f);
        this.f22289s = new Paint();
        this.f22289s.setColor(-1);
        this.f22289s.setStyle(Style.FILL);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.f22290t = extras.getInt("ARG_SURFACE_WIDTH", 0);
            this.f22291u = extras.getInt("ARG_SURFACE_HEIGHT", 0);
        }
        if (bundle != null) {
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("STATE_DRAW_HISTORY");
            if (parcelableArrayList != null) {
                this.f22285o.addAll(parcelableArrayList);
            }
            this.f22292v = (Rect) bundle.getParcelable("STATE_BOUND_RECT");
        }
        this.f22293w.getViewTreeObserver().addOnGlobalLayoutListener(new OnGlobalLayoutListener() {
            public void onGlobalLayout() {
                DrawSurfaceActivity.this.m30530m();
            }
        });
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C5461j.draw_surface_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == C5458g.draw_surface_menu_use) {
            m30531n();
            return true;
        } else if (itemId != C5458g.draw_surface_menu_clear) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            this.f22293w.mo19643a();
            this.f22285o.clear();
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putParcelableArrayList("STATE_DRAW_HISTORY", this.f22285o);
        if (this.f22285o.size() > 0 && this.f22292v != null) {
            bundle.putParcelable("STATE_BOUND_RECT", this.f22292v);
        }
        super.onSaveInstanceState(bundle);
    }
}
