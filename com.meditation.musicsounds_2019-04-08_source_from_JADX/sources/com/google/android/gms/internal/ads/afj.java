package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.util.LinkedList;

public abstract class afj implements afi {

    /* renamed from: a */
    protected static volatile aga f11875a;

    /* renamed from: b */
    protected MotionEvent f11876b;

    /* renamed from: c */
    protected LinkedList<MotionEvent> f11877c = new LinkedList<>();

    /* renamed from: d */
    protected long f11878d = 0;

    /* renamed from: e */
    protected long f11879e = 0;

    /* renamed from: f */
    protected long f11880f = 0;

    /* renamed from: g */
    protected long f11881g = 0;

    /* renamed from: h */
    protected long f11882h = 0;

    /* renamed from: i */
    protected long f11883i = 0;

    /* renamed from: j */
    protected long f11884j = 0;

    /* renamed from: k */
    protected double f11885k;

    /* renamed from: l */
    protected float f11886l;

    /* renamed from: m */
    protected float f11887m;

    /* renamed from: n */
    protected float f11888n;

    /* renamed from: o */
    protected float f11889o;

    /* renamed from: p */
    protected boolean f11890p = false;

    /* renamed from: q */
    protected DisplayMetrics f11891q;

    /* renamed from: r */
    private double f11892r;

    /* renamed from: s */
    private double f11893s;

    /* renamed from: t */
    private boolean f11894t = false;

    protected afj(Context context) {
        try {
            if (((Boolean) ane.m16650f().mo12297a(aqm.f12699bL)).booleanValue()) {
                aen.m16078a();
            } else {
                agg.m16179a(f11875a);
            }
            this.f11891q = context.getResources().getDisplayMetrics();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    private final String m16102a(Context context, String str, boolean z, View view, Activity activity, byte[] bArr) {
        C4110yz yzVar;
        int i;
        if (z) {
            try {
                yzVar = mo11846a(context, view, activity);
                this.f11894t = true;
            } catch (UnsupportedEncodingException | GeneralSecurityException unused) {
                i = 7;
                return Integer.toString(i);
            } catch (Throwable unused2) {
                i = 3;
                return Integer.toString(i);
            }
        } else {
            yzVar = mo11847a(context, null);
        }
        if (yzVar != null) {
            if (yzVar.mo11829d() != 0) {
                return aen.m16075a(yzVar, str);
            }
        }
        return Integer.toString(5);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract long mo11844a(StackTraceElement[] stackTraceElementArr);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract agh mo11845a(MotionEvent motionEvent);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C4110yz mo11846a(Context context, View view, Activity activity);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C4110yz mo11847a(Context context, C4015wb wbVar);

    public final String zza(Context context) {
        if (agi.m16186a()) {
            if (((Boolean) ane.m16650f().mo12297a(aqm.f12701bN)).booleanValue()) {
                throw new IllegalStateException("The caller must not be called from the UI thread.");
            }
        }
        return m16102a(context, null, false, null, null, null);
    }

    public final String zza(Context context, String str, View view) {
        return zza(context, str, view, null);
    }

    public final String zza(Context context, String str, View view, Activity activity) {
        return m16102a(context, str, true, view, activity, null);
    }

    public final void zza(int i, int i2, int i3) {
        MotionEvent motionEvent;
        if (this.f11876b != null) {
            this.f11876b.recycle();
        }
        if (this.f11891q != null) {
            motionEvent = MotionEvent.obtain(0, (long) i3, 1, this.f11891q.density * ((float) i), this.f11891q.density * ((float) i2), 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        } else {
            motionEvent = null;
        }
        this.f11876b = motionEvent;
        this.f11890p = false;
    }

    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(android.view.MotionEvent r13) {
        /*
            r12 = this;
            boolean r0 = r12.f11894t
            r1 = 0
            if (r0 == 0) goto L_0x0035
            r2 = 0
            r12.f11881g = r2
            r12.f11880f = r2
            r12.f11879e = r2
            r12.f11878d = r2
            r12.f11882h = r2
            r12.f11884j = r2
            r12.f11883i = r2
            java.util.LinkedList<android.view.MotionEvent> r0 = r12.f11877c
            java.util.Iterator r0 = r0.iterator()
        L_0x001b:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x002b
            java.lang.Object r2 = r0.next()
            android.view.MotionEvent r2 = (android.view.MotionEvent) r2
            r2.recycle()
            goto L_0x001b
        L_0x002b:
            java.util.LinkedList<android.view.MotionEvent> r0 = r12.f11877c
            r0.clear()
            r0 = 0
            r12.f11876b = r0
            r12.f11894t = r1
        L_0x0035:
            int r0 = r13.getAction()
            switch(r0) {
                case 0: goto L_0x0068;
                case 1: goto L_0x003d;
                case 2: goto L_0x003d;
                default: goto L_0x003c;
            }
        L_0x003c:
            goto L_0x007a
        L_0x003d:
            float r0 = r13.getRawX()
            double r2 = (double) r0
            float r0 = r13.getRawY()
            double r4 = (double) r0
            double r6 = r12.f11892r
            java.lang.Double.isNaN(r2)
            double r6 = r2 - r6
            double r8 = r12.f11893s
            java.lang.Double.isNaN(r4)
            double r8 = r4 - r8
            double r10 = r12.f11885k
            double r6 = r6 * r6
            double r8 = r8 * r8
            double r6 = r6 + r8
            double r6 = java.lang.Math.sqrt(r6)
            double r10 = r10 + r6
            r12.f11885k = r10
            r12.f11892r = r2
            r12.f11893s = r4
            goto L_0x007a
        L_0x0068:
            r2 = 0
            r12.f11885k = r2
            float r0 = r13.getRawX()
            double r2 = (double) r0
            r12.f11892r = r2
            float r0 = r13.getRawY()
            double r2 = (double) r0
            r12.f11893s = r2
        L_0x007a:
            int r0 = r13.getAction()
            r2 = 1
            r4 = 1
            switch(r0) {
                case 0: goto L_0x0119;
                case 1: goto L_0x00e3;
                case 2: goto L_0x008d;
                case 3: goto L_0x0086;
                default: goto L_0x0084;
            }
        L_0x0084:
            goto L_0x0136
        L_0x0086:
            long r0 = r12.f11881g
            long r0 = r0 + r2
            r12.f11881g = r0
            goto L_0x0136
        L_0x008d:
            long r2 = r12.f11879e
            int r0 = r13.getHistorySize()
            int r0 = r0 + r4
            long r5 = (long) r0
            long r2 = r2 + r5
            r12.f11879e = r2
            com.google.android.gms.internal.ads.agh r13 = r12.mo11845a(r13)     // Catch:{ zzcw -> 0x0136 }
            if (r13 == 0) goto L_0x00a8
            java.lang.Long r0 = r13.f11970d     // Catch:{ zzcw -> 0x0136 }
            if (r0 == 0) goto L_0x00a8
            java.lang.Long r0 = r13.f11973g     // Catch:{ zzcw -> 0x0136 }
            if (r0 == 0) goto L_0x00a8
            r0 = 1
            goto L_0x00a9
        L_0x00a8:
            r0 = 0
        L_0x00a9:
            if (r0 == 0) goto L_0x00be
            long r2 = r12.f11883i     // Catch:{ zzcw -> 0x0136 }
            java.lang.Long r0 = r13.f11970d     // Catch:{ zzcw -> 0x0136 }
            long r5 = r0.longValue()     // Catch:{ zzcw -> 0x0136 }
            java.lang.Long r0 = r13.f11973g     // Catch:{ zzcw -> 0x0136 }
            long r7 = r0.longValue()     // Catch:{ zzcw -> 0x0136 }
            r0 = 0
            long r5 = r5 + r7
            long r2 = r2 + r5
            r12.f11883i = r2     // Catch:{ zzcw -> 0x0136 }
        L_0x00be:
            android.util.DisplayMetrics r0 = r12.f11891q     // Catch:{ zzcw -> 0x0136 }
            if (r0 == 0) goto L_0x00cd
            if (r13 == 0) goto L_0x00cd
            java.lang.Long r0 = r13.f11971e     // Catch:{ zzcw -> 0x0136 }
            if (r0 == 0) goto L_0x00cd
            java.lang.Long r0 = r13.f11974h     // Catch:{ zzcw -> 0x0136 }
            if (r0 == 0) goto L_0x00cd
            r1 = 1
        L_0x00cd:
            if (r1 == 0) goto L_0x0136
            long r0 = r12.f11884j     // Catch:{ zzcw -> 0x0136 }
            java.lang.Long r2 = r13.f11971e     // Catch:{ zzcw -> 0x0136 }
            long r2 = r2.longValue()     // Catch:{ zzcw -> 0x0136 }
            java.lang.Long r13 = r13.f11974h     // Catch:{ zzcw -> 0x0136 }
            long r5 = r13.longValue()     // Catch:{ zzcw -> 0x0136 }
            r13 = 0
            long r2 = r2 + r5
            long r0 = r0 + r2
            r12.f11884j = r0     // Catch:{ zzcw -> 0x0136 }
            goto L_0x0136
        L_0x00e3:
            android.view.MotionEvent r13 = android.view.MotionEvent.obtain(r13)
            r12.f11876b = r13
            java.util.LinkedList<android.view.MotionEvent> r13 = r12.f11877c
            android.view.MotionEvent r0 = r12.f11876b
            r13.add(r0)
            java.util.LinkedList<android.view.MotionEvent> r13 = r12.f11877c
            int r13 = r13.size()
            r0 = 6
            if (r13 <= r0) goto L_0x0104
            java.util.LinkedList<android.view.MotionEvent> r13 = r12.f11877c
            java.lang.Object r13 = r13.remove()
            android.view.MotionEvent r13 = (android.view.MotionEvent) r13
            r13.recycle()
        L_0x0104:
            long r0 = r12.f11880f
            long r0 = r0 + r2
            r12.f11880f = r0
            java.lang.Throwable r13 = new java.lang.Throwable     // Catch:{ zzcw -> 0x0136 }
            r13.<init>()     // Catch:{ zzcw -> 0x0136 }
            java.lang.StackTraceElement[] r13 = r13.getStackTrace()     // Catch:{ zzcw -> 0x0136 }
            long r0 = r12.mo11844a(r13)     // Catch:{ zzcw -> 0x0136 }
            r12.f11882h = r0     // Catch:{ zzcw -> 0x0136 }
            goto L_0x0136
        L_0x0119:
            float r0 = r13.getX()
            r12.f11886l = r0
            float r0 = r13.getY()
            r12.f11887m = r0
            float r0 = r13.getRawX()
            r12.f11888n = r0
            float r13 = r13.getRawY()
            r12.f11889o = r13
            long r0 = r12.f11878d
            long r0 = r0 + r2
            r12.f11878d = r0
        L_0x0136:
            r12.f11890p = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.afj.zza(android.view.MotionEvent):void");
    }

    public void zzb(View view) {
    }
}
