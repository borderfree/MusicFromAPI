package com.seattleclouds.modules.nativetetris;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.FontMetrics;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ImageButton;
import android.widget.TextView;
import com.seattleclouds.App;
import com.seattleclouds.C5451m.C5457f;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.util.C6613i;
import java.io.IOException;
import java.util.HashMap;
import java.util.Timer;
import org.json.JSONException;
import org.json.JSONObject;

public class TetrisView extends SurfaceView implements Callback {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f20863a = "TetrisView";
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C5898b f20864b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public String f20865c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public TextView f20866d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public TextView f20867e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public TextView f20868f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public TextView f20869g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public ImageButton f20870h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public Timer f20871i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public Rect f20872j = null;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public Rect f20873k = null;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public Rect f20874l = null;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public Rect f20875m = null;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public Rect f20876n = null;

    /* renamed from: com.seattleclouds.modules.nativetetris.TetrisView$a */
    private static class C5897a extends Handler {
        private C5897a() {
        }
    }

    /* renamed from: com.seattleclouds.modules.nativetetris.TetrisView$b */
    class C5898b {

        /* renamed from: a */
        C5915i f20879a = null;

        /* renamed from: c */
        private int f20881c = 48;

        /* renamed from: d */
        private int f20882d = 0;

        /* renamed from: e */
        private int f20883e = 0;

        /* renamed from: f */
        private Context f20884f;

        /* renamed from: g */
        private Bitmap f20885g;

        /* renamed from: h */
        private Handler f20886h;

        /* renamed from: i */
        private HashMap<String, Drawable> f20887i;

        /* renamed from: j */
        private SurfaceHolder f20888j;

        /* renamed from: k */
        private int f20889k;

        /* renamed from: l */
        private int f20890l;

        public C5898b(SurfaceHolder surfaceHolder, Context context, Handler handler) {
            this.f20888j = surfaceHolder;
            this.f20886h = handler;
            this.f20884f = context;
            this.f20879a = new C5915i();
        }

        /* renamed from: a */
        private HashMap<String, Drawable> m28935a(Context context, String str) {
            String[] strArr;
            JSONObject d = m28942d(str);
            if (d == null) {
                return null;
            }
            HashMap<String, Drawable> hashMap = new HashMap<>(7);
            Drawable drawable = context.getResources().getDrawable(C5457f.green);
            try {
                for (String str2 : new String[]{"blue", "cyan", "green", "magenta", "orange", "red", "yellow", "background", "pause", "start"}) {
                    Drawable j = App.m25658j(d.getString(str2));
                    if (j == null) {
                        j = drawable;
                    }
                    hashMap.put(str2, j);
                }
            } catch (JSONException e) {
                String a = TetrisView.f20863a;
                StringBuilder sb = new StringBuilder();
                sb.append("ERROR");
                sb.append(e.getLocalizedMessage());
                Log.d(a, sb.toString(), e);
            }
            return hashMap;
        }

        /* renamed from: a */
        private void m28936a(int i, int i2, int i3) {
            double d = (double) i3;
            Double.isNaN(d);
            double d2 = 0.3d * d;
            Double.isNaN(d);
            int i4 = (int) (d - d2);
            TetrisView.this.f20872j = new Rect(0, i4, i2, i3);
            Double.isNaN(d);
            double d3 = 0.6d * d;
            Double.isNaN(d);
            int i5 = (int) (d - d3);
            int i6 = i2 / 2;
            TetrisView.this.f20873k = new Rect(0, i5, i6, i4);
            TetrisView.this.f20874l = new Rect(i6, i5, i2, i4);
            Double.isNaN(d);
            double d4 = 0.9d * d;
            Double.isNaN(d);
            TetrisView.this.f20875m = new Rect(0, (int) (d - d4), i2, i5);
        }

        /* renamed from: a */
        private void m28937a(Canvas canvas) {
            BlockObject blockObject;
            if (canvas != null && this.f20885g != null && this.f20887i != null) {
                BlockObject blockObject2 = null;
                canvas.drawBitmap(this.f20885g, 0.0f, 0.0f, null);
                canvas.save();
                if (this.f20879a != null) {
                    blockObject2 = this.f20879a.mo18702d();
                    blockObject = this.f20879a.mo18703e();
                    this.f20879a.mo18697a(canvas, this.f20881c, this.f20882d, this.f20887i);
                } else {
                    blockObject = null;
                }
                if (blockObject2 != null) {
                    blockObject2.mo18660a(canvas, (Drawable) this.f20887i.get(blockObject2.f20860d), this.f20881c, this.f20882d);
                }
                if (blockObject != null) {
                    blockObject.mo18660a(canvas, (Drawable) this.f20887i.get(blockObject.f20860d), this.f20881c / 2, this.f20883e);
                }
                if (this.f20879a.mo18704f() == 1) {
                    Resources resources = this.f20884f.getResources();
                    TetrisView.this.m28915a(canvas, TetrisView.this.f20872j, -16776961, resources.getString(C5462k.native_tetris_down), Style.FILL, 2, 20);
                    TetrisView.this.m28915a(canvas, TetrisView.this.f20873k, -65536, resources.getString(C5462k.native_tetris_left), Style.FILL, 2, 20);
                    TetrisView.this.m28915a(canvas, TetrisView.this.f20874l, -256, resources.getString(C5462k.native_tetris_right), Style.FILL, 2, 20);
                    TetrisView.this.m28915a(canvas, TetrisView.this.f20875m, -16711936, resources.getString(C5462k.native_tetris_rotate), Style.FILL, 2, 20);
                }
                TetrisView.this.m28915a(canvas, TetrisView.this.f20876n, -16777216, "", Style.STROKE, 4, 100);
                canvas.restore();
            }
        }

        /* renamed from: b */
        private int m28938b(int i) {
            return i / 22;
        }

        /* renamed from: b */
        private int m28939b(int i, int i2) {
            return (i - (i2 * 10)) / 2;
        }

        /* renamed from: b */
        private void m28940b(int i, int i2, int i3) {
            TetrisView.this.f20876n = new Rect(this.f20882d - 1, 0, (i2 - this.f20882d) - 1, i3);
        }

        /* renamed from: c */
        private void m28941c(int i) {
            Message obtainMessage = this.f20886h.obtainMessage();
            if (obtainMessage != null) {
                Bundle bundle = new Bundle();
                bundle.putInt("gameState", i);
                bundle.putInt("score", this.f20879a.mo18707i());
                bundle.putInt("bscore", this.f20879a.mo18708j());
                bundle.putInt("level", this.f20879a.mo18706h());
                obtainMessage.setData(bundle);
                this.f20886h.sendMessage(obtainMessage);
            }
        }

        /* renamed from: d */
        private JSONObject m28942d(String str) {
            String str2;
            StringBuilder sb;
            String str3;
            JSONObject jSONObject = new JSONObject();
            if (str == null || str.length() == 0) {
                return null;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(".json");
            try {
                jSONObject = new JSONObject(C6613i.m31991b(App.m25649e(sb2.toString())));
            } catch (IllegalArgumentException e) {
                str3 = TetrisView.f20863a;
                sb = new StringBuilder();
                sb.append("ERROR:");
                str2 = e.getLocalizedMessage();
                r5 = e;
                sb.append(str2);
                Log.e(str3, sb.toString(), r5);
                return jSONObject;
            } catch (IOException e2) {
                str3 = TetrisView.f20863a;
                sb = new StringBuilder();
                sb.append("ERROR:");
                str2 = e2.getLocalizedMessage();
                r5 = e2;
                sb.append(str2);
                Log.e(str3, sb.toString(), r5);
                return jSONObject;
            } catch (JSONException e3) {
                str3 = TetrisView.f20863a;
                sb = new StringBuilder();
                sb.append("ERROR:");
                str2 = e3.getLocalizedMessage();
                r5 = e3;
                sb.append(str2);
                Log.e(str3, sb.toString(), r5);
                return jSONObject;
            }
            return jSONObject;
        }

        /* renamed from: i */
        private void m28943i() {
            synchronized (this.f20888j) {
                m28941c(this.f20879a.mo18704f());
            }
        }

        /* renamed from: a */
        public void mo18678a() {
            synchronized (this.f20888j) {
                if (this.f20879a.mo18704f() == 0) {
                    mo18679a(1);
                }
            }
        }

        /* renamed from: a */
        public void mo18679a(int i) {
            synchronized (this.f20888j) {
                mo18681a(i, (CharSequence) null);
            }
        }

        /* renamed from: a */
        public void mo18680a(int i, int i2) {
            synchronized (this.f20888j) {
                this.f20889k = i;
                this.f20890l = i2;
                mo18686c(TetrisView.this.f20865c);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x006e  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo18681a(int r7, java.lang.CharSequence r8) {
            /*
                r6 = this;
                android.view.SurfaceHolder r8 = r6.f20888j
                monitor-enter(r8)
                r0 = 2
                r1 = 1
                switch(r7) {
                    case 0: goto L_0x003f;
                    case 1: goto L_0x0025;
                    case 2: goto L_0x000a;
                    default: goto L_0x0008;
                }
            L_0x0008:
                goto L_0x009a
            L_0x000a:
                r6.m28941c(r0)     // Catch:{ all -> 0x009f }
                com.seattleclouds.modules.nativetetris.TetrisView r7 = com.seattleclouds.modules.nativetetris.TetrisView.this     // Catch:{ all -> 0x009f }
                java.util.Timer r7 = r7.f20871i     // Catch:{ all -> 0x009f }
                if (r7 == 0) goto L_0x001e
                com.seattleclouds.modules.nativetetris.TetrisView r7 = com.seattleclouds.modules.nativetetris.TetrisView.this     // Catch:{ all -> 0x009f }
                java.util.Timer r7 = r7.f20871i     // Catch:{ all -> 0x009f }
                r7.cancel()     // Catch:{ all -> 0x009f }
            L_0x001e:
                com.seattleclouds.modules.nativetetris.i r7 = r6.f20879a     // Catch:{ all -> 0x009f }
                r7.mo18695a(r0)     // Catch:{ all -> 0x009f }
                goto L_0x009a
            L_0x0025:
                r6.m28941c(r1)     // Catch:{ all -> 0x009f }
                com.seattleclouds.modules.nativetetris.TetrisView r7 = com.seattleclouds.modules.nativetetris.TetrisView.this     // Catch:{ all -> 0x009f }
                java.util.Timer r7 = r7.f20871i     // Catch:{ all -> 0x009f }
                if (r7 == 0) goto L_0x0039
                com.seattleclouds.modules.nativetetris.TetrisView r7 = com.seattleclouds.modules.nativetetris.TetrisView.this     // Catch:{ all -> 0x009f }
                java.util.Timer r7 = r7.f20871i     // Catch:{ all -> 0x009f }
                r7.cancel()     // Catch:{ all -> 0x009f }
            L_0x0039:
                com.seattleclouds.modules.nativetetris.i r7 = r6.f20879a     // Catch:{ all -> 0x009f }
                r7.mo18695a(r1)     // Catch:{ all -> 0x009f }
                goto L_0x009a
            L_0x003f:
                r7 = 0
                r6.m28941c(r7)     // Catch:{ all -> 0x009f }
                com.seattleclouds.modules.nativetetris.i r2 = r6.f20879a     // Catch:{ all -> 0x009f }
                int r2 = r2.mo18704f()     // Catch:{ all -> 0x009f }
                if (r2 != r0) goto L_0x0056
                com.seattleclouds.modules.nativetetris.i r0 = r6.f20879a     // Catch:{ all -> 0x009f }
                r0.mo18709k()     // Catch:{ all -> 0x009f }
                com.seattleclouds.modules.nativetetris.i r0 = r6.f20879a     // Catch:{ all -> 0x009f }
            L_0x0052:
                r0.mo18699b()     // Catch:{ all -> 0x009f }
                goto L_0x0061
            L_0x0056:
                com.seattleclouds.modules.nativetetris.i r0 = r6.f20879a     // Catch:{ all -> 0x009f }
                com.seattleclouds.modules.nativetetris.BlockObject r0 = r0.mo18702d()     // Catch:{ all -> 0x009f }
                if (r0 != 0) goto L_0x0061
                com.seattleclouds.modules.nativetetris.i r0 = r6.f20879a     // Catch:{ all -> 0x009f }
                goto L_0x0052
            L_0x0061:
                com.seattleclouds.modules.nativetetris.i r0 = r6.f20879a     // Catch:{ all -> 0x009f }
                r0.mo18695a(r7)     // Catch:{ all -> 0x009f }
                com.seattleclouds.modules.nativetetris.TetrisView r7 = com.seattleclouds.modules.nativetetris.TetrisView.this     // Catch:{ all -> 0x009f }
                java.util.Timer r7 = r7.f20871i     // Catch:{ all -> 0x009f }
                if (r7 == 0) goto L_0x0077
                com.seattleclouds.modules.nativetetris.TetrisView r7 = com.seattleclouds.modules.nativetetris.TetrisView.this     // Catch:{ all -> 0x009f }
                java.util.Timer r7 = r7.f20871i     // Catch:{ all -> 0x009f }
                r7.cancel()     // Catch:{ all -> 0x009f }
            L_0x0077:
                com.seattleclouds.modules.nativetetris.TetrisView r7 = com.seattleclouds.modules.nativetetris.TetrisView.this     // Catch:{ all -> 0x009f }
                java.util.Timer r0 = new java.util.Timer     // Catch:{ all -> 0x009f }
                java.lang.String r2 = "tetrisTimer"
                r0.<init>(r2, r1)     // Catch:{ all -> 0x009f }
                r7.f20871i = r0     // Catch:{ all -> 0x009f }
                com.seattleclouds.modules.nativetetris.TetrisView r7 = com.seattleclouds.modules.nativetetris.TetrisView.this     // Catch:{ all -> 0x009f }
                java.util.Timer r0 = r7.f20871i     // Catch:{ all -> 0x009f }
                com.seattleclouds.modules.nativetetris.TetrisView$b$1 r1 = new com.seattleclouds.modules.nativetetris.TetrisView$b$1     // Catch:{ all -> 0x009f }
                r1.<init>()     // Catch:{ all -> 0x009f }
                r2 = 0
                com.seattleclouds.modules.nativetetris.i r7 = r6.f20879a     // Catch:{ all -> 0x009f }
                int r7 = r7.mo18705g()     // Catch:{ all -> 0x009f }
                long r4 = (long) r7     // Catch:{ all -> 0x009f }
                r0.scheduleAtFixedRate(r1, r2, r4)     // Catch:{ all -> 0x009f }
            L_0x009a:
                r6.mo18690g()     // Catch:{ all -> 0x009f }
                monitor-exit(r8)     // Catch:{ all -> 0x009f }
                return
            L_0x009f:
                r7 = move-exception
                monitor-exit(r8)     // Catch:{ all -> 0x009f }
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.modules.nativetetris.TetrisView.C5898b.mo18681a(int, java.lang.CharSequence):void");
        }

        /* renamed from: a */
        public synchronized void mo18682a(String str) {
            synchronized (this.f20888j) {
                mo18679a(1);
                this.f20879a.mo18700b(this.f20884f, str);
                mo18690g();
            }
        }

        /* renamed from: b */
        public void mo18683b() {
            synchronized (this.f20888j) {
                this.f20879a.mo18698a(-1, 0);
                mo18690g();
            }
        }

        /* renamed from: b */
        public void mo18684b(String str) {
            synchronized (this.f20888j) {
                this.f20879a.mo18696a(this.f20884f, str);
            }
        }

        /* renamed from: c */
        public void mo18685c() {
            synchronized (this.f20888j) {
                this.f20879a.mo18698a(1, 0);
                mo18690g();
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x00a3, code lost:
            return;
         */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo18686c(java.lang.String r5) {
            /*
                r4 = this;
                android.view.SurfaceHolder r0 = r4.f20888j
                monitor-enter(r0)
                android.content.Context r1 = r4.f20884f     // Catch:{ all -> 0x00a4 }
                java.util.HashMap r5 = r4.m28935a(r1, r5)     // Catch:{ all -> 0x00a4 }
                r4.f20887i = r5     // Catch:{ all -> 0x00a4 }
                java.util.HashMap<java.lang.String, android.graphics.drawable.Drawable> r5 = r4.f20887i     // Catch:{ all -> 0x00a4 }
                if (r5 == 0) goto L_0x00a2
                int r5 = r4.f20889k     // Catch:{ all -> 0x00a4 }
                if (r5 <= 0) goto L_0x00a2
                int r5 = r4.f20890l     // Catch:{ all -> 0x00a4 }
                if (r5 > 0) goto L_0x0019
                goto L_0x00a2
            L_0x0019:
                java.util.HashMap<java.lang.String, android.graphics.drawable.Drawable> r5 = r4.f20887i     // Catch:{ all -> 0x00a4 }
                java.lang.String r1 = "background"
                java.lang.Object r5 = r5.get(r1)     // Catch:{ all -> 0x00a4 }
                android.graphics.drawable.BitmapDrawable r5 = (android.graphics.drawable.BitmapDrawable) r5     // Catch:{ all -> 0x00a4 }
                android.graphics.Bitmap r5 = r5.getBitmap()     // Catch:{ all -> 0x00a4 }
                int r1 = r4.f20889k     // Catch:{ all -> 0x00a4 }
                int r2 = r4.f20890l     // Catch:{ all -> 0x00a4 }
                r3 = 1
                android.graphics.Bitmap r5 = android.graphics.Bitmap.createScaledBitmap(r5, r1, r2, r3)     // Catch:{ all -> 0x00a4 }
                r4.f20885g = r5     // Catch:{ all -> 0x00a4 }
                int r5 = r4.f20890l     // Catch:{ all -> 0x00a4 }
                int r5 = r4.m28938b(r5)     // Catch:{ all -> 0x00a4 }
                r4.f20881c = r5     // Catch:{ all -> 0x00a4 }
                int r5 = r4.f20889k     // Catch:{ all -> 0x00a4 }
                int r1 = r4.f20881c     // Catch:{ all -> 0x00a4 }
                int r5 = r4.m28939b(r5, r1)     // Catch:{ all -> 0x00a4 }
                r4.f20882d = r5     // Catch:{ all -> 0x00a4 }
                int r5 = r4.f20889k     // Catch:{ all -> 0x00a4 }
                int r1 = r4.f20882d     // Catch:{ all -> 0x00a4 }
                int r5 = r5 - r1
                int r5 = r5 + 40
                r4.f20883e = r5     // Catch:{ all -> 0x00a4 }
                int r5 = r4.f20882d     // Catch:{ all -> 0x00a4 }
                int r1 = r4.f20889k     // Catch:{ all -> 0x00a4 }
                int r2 = r4.f20890l     // Catch:{ all -> 0x00a4 }
                r4.m28936a(r5, r1, r2)     // Catch:{ all -> 0x00a4 }
                int r5 = r4.f20882d     // Catch:{ all -> 0x00a4 }
                int r1 = r4.f20889k     // Catch:{ all -> 0x00a4 }
                int r2 = r4.f20890l     // Catch:{ all -> 0x00a4 }
                r4.m28940b(r5, r1, r2)     // Catch:{ all -> 0x00a4 }
                r4.mo18679a(r3)     // Catch:{ all -> 0x00a4 }
                java.lang.String r5 = com.seattleclouds.modules.nativetetris.TetrisView.f20863a     // Catch:{ all -> 0x00a4 }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a4 }
                r1.<init>()     // Catch:{ all -> 0x00a4 }
                java.lang.String r2 = "mBoxSize : "
                r1.append(r2)     // Catch:{ all -> 0x00a4 }
                int r2 = r4.f20881c     // Catch:{ all -> 0x00a4 }
                r1.append(r2)     // Catch:{ all -> 0x00a4 }
                java.lang.String r2 = "mBorderWidth : "
                r1.append(r2)     // Catch:{ all -> 0x00a4 }
                int r2 = r4.f20882d     // Catch:{ all -> 0x00a4 }
                r1.append(r2)     // Catch:{ all -> 0x00a4 }
                java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00a4 }
                android.util.Log.d(r5, r1)     // Catch:{ all -> 0x00a4 }
                java.lang.String r5 = com.seattleclouds.modules.nativetetris.TetrisView.f20863a     // Catch:{ all -> 0x00a4 }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a4 }
                r1.<init>()     // Catch:{ all -> 0x00a4 }
                java.lang.String r2 = "mNextBlockLeftMargin : "
                r1.append(r2)     // Catch:{ all -> 0x00a4 }
                int r2 = r4.f20883e     // Catch:{ all -> 0x00a4 }
                r1.append(r2)     // Catch:{ all -> 0x00a4 }
                java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00a4 }
                android.util.Log.d(r5, r1)     // Catch:{ all -> 0x00a4 }
                monitor-exit(r0)     // Catch:{ all -> 0x00a4 }
                return
            L_0x00a2:
                monitor-exit(r0)     // Catch:{ all -> 0x00a4 }
                return
            L_0x00a4:
                r5 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x00a4 }
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.modules.nativetetris.TetrisView.C5898b.mo18686c(java.lang.String):void");
        }

        /* renamed from: d */
        public void mo18687d() {
            synchronized (this.f20888j) {
                if (!this.f20879a.mo18698a(0, 1)) {
                    m28943i();
                    if (this.f20879a.mo18704f() == 2) {
                        mo18679a(2);
                    }
                } else {
                    mo18690g();
                }
            }
        }

        /* renamed from: e */
        public void mo18688e() {
            synchronized (this.f20888j) {
                this.f20879a.mo18701c();
                mo18690g();
            }
        }

        /* renamed from: f */
        public void mo18689f() {
            synchronized (this.f20888j) {
                switch (this.f20879a.mo18704f()) {
                    case 0:
                        mo18679a(1);
                        break;
                    case 1:
                        break;
                    case 2:
                        this.f20879a.mo18694a();
                        break;
                }
                mo18679a(0);
            }
        }

        /* renamed from: g */
        public void mo18690g() {
            Canvas canvas;
            Throwable th;
            try {
                canvas = this.f20888j.lockCanvas(null);
                try {
                    synchronized (this.f20888j) {
                        m28937a(canvas);
                    }
                    if (canvas != null) {
                        this.f20888j.unlockCanvasAndPost(canvas);
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                Throwable th4 = th3;
                canvas = null;
                th = th4;
                if (canvas != null) {
                    this.f20888j.unlockCanvasAndPost(canvas);
                }
                throw th;
            }
        }

        /* renamed from: h */
        public HashMap<String, Drawable> mo18691h() {
            return this.f20887i;
        }
    }

    public TetrisView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        SurfaceHolder holder = getHolder();
        holder.addCallback(this);
        this.f20864b = new C5898b(holder, context, new C5897a() {
            /* JADX WARNING: Code restructure failed: missing block: B:10:0x006f, code lost:
                r0.setImageDrawable((android.graphics.drawable.Drawable) r1.get(r2));
             */
            /* JADX WARNING: Code restructure failed: missing block: B:11:0x0078, code lost:
                r0 = com.seattleclouds.modules.nativetetris.TetrisView.m28932k(r4.f20877a);
                r1 = new java.lang.StringBuilder();
                r1.append(r5.getData().getInt("score"));
                r1.append("");
                r0.setText(r1.toString());
                r0 = com.seattleclouds.modules.nativetetris.TetrisView.m28933l(r4.f20877a);
                r1 = new java.lang.StringBuilder();
                r1.append(r5.getData().getInt("bscore"));
                r1.append("");
                r0.setText(r1.toString());
                r0 = com.seattleclouds.modules.nativetetris.TetrisView.m28934m(r4.f20877a);
                r1 = new java.lang.StringBuilder();
                r1.append(r5.getData().getInt("level"));
                r1.append("");
                r0.setText(r1.toString());
             */
            /* JADX WARNING: Code restructure failed: missing block: B:12:0x00e4, code lost:
                return;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:3:0x002d, code lost:
                if (r1 != null) goto L_0x0046;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:5:0x0044, code lost:
                if (r1 != null) goto L_0x0046;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:6:0x0046, code lost:
                r0 = com.seattleclouds.modules.nativetetris.TetrisView.m28931j(r4.f20877a);
                r2 = "start";
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void handleMessage(android.os.Message r5) {
                /*
                    r4 = this;
                    android.os.Bundle r0 = r5.getData()
                    java.lang.String r1 = "gameState"
                    int r0 = r0.getInt(r1)
                    com.seattleclouds.modules.nativetetris.TetrisView r1 = com.seattleclouds.modules.nativetetris.TetrisView.this
                    com.seattleclouds.modules.nativetetris.TetrisView$b r1 = r1.f20864b
                    java.util.HashMap r1 = r1.mo18691h()
                    r2 = 0
                    switch(r0) {
                        case 0: goto L_0x004f;
                        case 1: goto L_0x0030;
                        case 2: goto L_0x0019;
                        default: goto L_0x0018;
                    }
                L_0x0018:
                    goto L_0x0078
                L_0x0019:
                    com.seattleclouds.modules.nativetetris.TetrisView r0 = com.seattleclouds.modules.nativetetris.TetrisView.this
                    android.widget.TextView r0 = r0.f20866d
                    r0.setVisibility(r2)
                    com.seattleclouds.modules.nativetetris.TetrisView r0 = com.seattleclouds.modules.nativetetris.TetrisView.this
                    android.widget.TextView r0 = r0.f20866d
                    int r2 = com.seattleclouds.C5451m.C5462k.native_tetris_state_game_over
                    r0.setText(r2)
                    if (r1 == 0) goto L_0x0078
                    goto L_0x0046
                L_0x0030:
                    com.seattleclouds.modules.nativetetris.TetrisView r0 = com.seattleclouds.modules.nativetetris.TetrisView.this
                    android.widget.TextView r0 = r0.f20866d
                    r0.setVisibility(r2)
                    com.seattleclouds.modules.nativetetris.TetrisView r0 = com.seattleclouds.modules.nativetetris.TetrisView.this
                    android.widget.TextView r0 = r0.f20866d
                    int r2 = com.seattleclouds.C5451m.C5462k.native_tetris_state_paused
                    r0.setText(r2)
                    if (r1 == 0) goto L_0x0078
                L_0x0046:
                    com.seattleclouds.modules.nativetetris.TetrisView r0 = com.seattleclouds.modules.nativetetris.TetrisView.this
                    android.widget.ImageButton r0 = r0.f20870h
                    java.lang.String r2 = "start"
                    goto L_0x006f
                L_0x004f:
                    com.seattleclouds.modules.nativetetris.TetrisView r0 = com.seattleclouds.modules.nativetetris.TetrisView.this
                    android.widget.TextView r0 = r0.f20866d
                    r2 = 8
                    r0.setVisibility(r2)
                    com.seattleclouds.modules.nativetetris.TetrisView r0 = com.seattleclouds.modules.nativetetris.TetrisView.this
                    android.widget.TextView r0 = r0.f20866d
                    java.lang.String r2 = "Is Runing"
                    r0.setText(r2)
                    if (r1 == 0) goto L_0x0078
                    com.seattleclouds.modules.nativetetris.TetrisView r0 = com.seattleclouds.modules.nativetetris.TetrisView.this
                    android.widget.ImageButton r0 = r0.f20870h
                    java.lang.String r2 = "pause"
                L_0x006f:
                    java.lang.Object r1 = r1.get(r2)
                    android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
                    r0.setImageDrawable(r1)
                L_0x0078:
                    com.seattleclouds.modules.nativetetris.TetrisView r0 = com.seattleclouds.modules.nativetetris.TetrisView.this
                    android.widget.TextView r0 = r0.f20867e
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    android.os.Bundle r2 = r5.getData()
                    java.lang.String r3 = "score"
                    int r2 = r2.getInt(r3)
                    r1.append(r2)
                    java.lang.String r2 = ""
                    r1.append(r2)
                    java.lang.String r1 = r1.toString()
                    r0.setText(r1)
                    com.seattleclouds.modules.nativetetris.TetrisView r0 = com.seattleclouds.modules.nativetetris.TetrisView.this
                    android.widget.TextView r0 = r0.f20869g
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    android.os.Bundle r2 = r5.getData()
                    java.lang.String r3 = "bscore"
                    int r2 = r2.getInt(r3)
                    r1.append(r2)
                    java.lang.String r2 = ""
                    r1.append(r2)
                    java.lang.String r1 = r1.toString()
                    r0.setText(r1)
                    com.seattleclouds.modules.nativetetris.TetrisView r0 = com.seattleclouds.modules.nativetetris.TetrisView.this
                    android.widget.TextView r0 = r0.f20868f
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    android.os.Bundle r5 = r5.getData()
                    java.lang.String r2 = "level"
                    int r5 = r5.getInt(r2)
                    r1.append(r5)
                    java.lang.String r5 = ""
                    r1.append(r5)
                    java.lang.String r5 = r1.toString()
                    r0.setText(r5)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.modules.nativetetris.TetrisView.C58951.handleMessage(android.os.Message):void");
            }
        });
        setOnTouchListener(new OnTouchListener() {
            public boolean onTouch(View view, MotionEvent motionEvent) {
                TetrisView.this.m28916a(motionEvent);
                return false;
            }
        });
        setFocusable(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m28915a(Canvas canvas, Rect rect, int i, String str, Style style, int i2, int i3) {
        Paint paint = new Paint();
        paint.setColor(i);
        paint.setAlpha(i3);
        paint.setStyle(style);
        paint.setStrokeWidth((float) i2);
        canvas.drawRect(rect, paint);
        FontMetrics fontMetrics = new FontMetrics();
        Paint paint2 = new Paint();
        paint2.setTextAlign(Align.CENTER);
        paint2.getFontMetrics(fontMetrics);
        paint2.setTextSize(50.0f);
        canvas.drawText(str, ((float) rect.left) + ((((float) (rect.right - rect.left)) - paint2.measureText(str)) / 2.0f), ((float) rect.top) + ((((float) (rect.bottom - rect.top)) - paint2.getTextSize()) / 2.0f), paint2);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m28916a(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            if (this.f20875m.contains((int) motionEvent.getX(i), (int) motionEvent.getY(i))) {
                this.f20864b.mo18688e();
            } else if (this.f20873k.contains((int) motionEvent.getX(i), (int) motionEvent.getY(i))) {
                this.f20864b.mo18683b();
            } else if (this.f20874l.contains((int) motionEvent.getX(i), (int) motionEvent.getY(i))) {
                this.f20864b.mo18685c();
            } else if (this.f20872j.contains((int) motionEvent.getX(i), (int) motionEvent.getY(i))) {
                this.f20864b.mo18687d();
            }
            String str = f20863a;
            StringBuilder sb = new StringBuilder();
            sb.append("  pointer ");
            sb.append(motionEvent.getPointerId(i));
            sb.append(": (");
            sb.append(motionEvent.getX(i));
            sb.append(",");
            sb.append(motionEvent.getY(i));
            sb.append(")");
            Log.d(str, sb.toString());
        }
    }

    public C5898b getTetrisHolder() {
        return this.f20864b;
    }

    public void onWindowFocusChanged(boolean z) {
        if (!z) {
            this.f20864b.mo18678a();
        }
    }

    public void setBestScoreTextView(TextView textView) {
        this.f20869g = textView;
    }

    public void setLevelTextView(TextView textView) {
        this.f20868f = textView;
    }

    public void setPageID(String str) {
        this.f20865c = str;
    }

    public void setScoreTextView(TextView textView) {
        this.f20867e = textView;
    }

    public void setStartPauseButton(ImageButton imageButton) {
        this.f20870h = imageButton;
    }

    public void setStatusTextView(TextView textView) {
        this.f20866d = textView;
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.f20864b.mo18680a(i2, i3);
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
    }
}
