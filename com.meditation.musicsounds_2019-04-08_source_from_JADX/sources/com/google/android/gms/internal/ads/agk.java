package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.Window;
import java.lang.ref.WeakReference;

public final class agk implements ActivityLifecycleCallbacks, OnAttachStateChangeListener, OnGlobalLayoutListener, OnScrollChangedListener {

    /* renamed from: a */
    private static final Handler f11982a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    private final Context f11983b;

    /* renamed from: c */
    private Application f11984c;

    /* renamed from: d */
    private final PowerManager f11985d;

    /* renamed from: e */
    private final KeyguardManager f11986e;

    /* renamed from: f */
    private final aga f11987f;

    /* renamed from: g */
    private BroadcastReceiver f11988g;

    /* renamed from: h */
    private WeakReference<ViewTreeObserver> f11989h;

    /* renamed from: i */
    private WeakReference<View> f11990i;

    /* renamed from: j */
    private afp f11991j;

    /* renamed from: k */
    private boolean f11992k = false;

    /* renamed from: l */
    private int f11993l = -1;

    /* renamed from: m */
    private long f11994m = -3;

    public agk(aga aga, View view) {
        this.f11987f = aga;
        this.f11983b = aga.f11934a;
        this.f11985d = (PowerManager) this.f11983b.getSystemService("power");
        this.f11986e = (KeyguardManager) this.f11983b.getSystemService("keyguard");
        if (this.f11983b instanceof Application) {
            this.f11984c = (Application) this.f11983b;
            this.f11991j = new afp((Application) this.f11983b, this);
        }
        mo11892a(view);
    }

    /* renamed from: a */
    private final void m16191a(Activity activity, int i) {
        if (this.f11990i != null) {
            Window window = activity.getWindow();
            if (window != null) {
                View peekDecorView = window.peekDecorView();
                View view = (View) this.f11990i.get();
                if (!(view == null || peekDecorView == null || view.getRootView() != peekDecorView.getRootView())) {
                    this.f11993l = i;
                }
            }
        }
    }

    /* renamed from: b */
    private final void m16193b() {
        f11982a.post(new agl(this));
    }

    /* renamed from: b */
    private final void m16194b(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.f11989h = new WeakReference<>(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.f11988g == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            this.f11988g = new agm(this);
            this.f11983b.registerReceiver(this.f11988g, intentFilter);
        }
        if (this.f11984c != null) {
            try {
                this.f11984c.registerActivityLifecycleCallbacks(this.f11991j);
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0058, code lost:
        if (r4 == false) goto L_0x005b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x008a  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m16195c() {
        /*
            r9 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r9.f11990i
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            java.lang.ref.WeakReference<android.view.View> r0 = r9.f11990i
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            r1 = 0
            if (r0 != 0) goto L_0x0017
            r2 = -3
            r9.f11994m = r2
            r9.f11992k = r1
            return
        L_0x0017:
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            boolean r2 = r0.getGlobalVisibleRect(r2)
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            boolean r3 = r0.getLocalVisibleRect(r3)
            com.google.android.gms.internal.ads.aga r4 = r9.f11987f
            boolean r4 = r4.mo11879j()
            r5 = 1
            if (r4 != 0) goto L_0x005d
            android.app.KeyguardManager r4 = r9.f11986e
            boolean r4 = r4.inKeyguardRestrictedInputMode()
            if (r4 == 0) goto L_0x005b
            android.app.Activity r4 = com.google.android.gms.internal.ads.agi.m16183a(r0)
            if (r4 == 0) goto L_0x0057
            android.view.Window r4 = r4.getWindow()
            if (r4 != 0) goto L_0x0048
            r4 = 0
            goto L_0x004c
        L_0x0048:
            android.view.WindowManager$LayoutParams r4 = r4.getAttributes()
        L_0x004c:
            if (r4 == 0) goto L_0x0057
            int r4 = r4.flags
            r6 = 524288(0x80000, float:7.34684E-40)
            r4 = r4 & r6
            if (r4 == 0) goto L_0x0057
            r4 = 1
            goto L_0x0058
        L_0x0057:
            r4 = 0
        L_0x0058:
            if (r4 == 0) goto L_0x005b
            goto L_0x005d
        L_0x005b:
            r4 = 0
            goto L_0x005e
        L_0x005d:
            r4 = 1
        L_0x005e:
            int r6 = r0.getWindowVisibility()
            int r7 = r9.f11993l
            r8 = -1
            if (r7 == r8) goto L_0x0069
            int r6 = r9.f11993l
        L_0x0069:
            int r7 = r0.getVisibility()
            if (r7 != 0) goto L_0x0086
            boolean r0 = r0.isShown()
            if (r0 == 0) goto L_0x0086
            android.os.PowerManager r0 = r9.f11985d
            boolean r0 = r0.isScreenOn()
            if (r0 == 0) goto L_0x0086
            if (r4 == 0) goto L_0x0086
            if (r3 == 0) goto L_0x0086
            if (r2 == 0) goto L_0x0086
            if (r6 != 0) goto L_0x0086
            r1 = 1
        L_0x0086:
            boolean r0 = r9.f11992k
            if (r0 == r1) goto L_0x0097
            if (r1 == 0) goto L_0x0091
            long r2 = android.os.SystemClock.elapsedRealtime()
            goto L_0x0093
        L_0x0091:
            r2 = -2
        L_0x0093:
            r9.f11994m = r2
            r9.f11992k = r1
        L_0x0097:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.agk.m16195c():void");
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x001d */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0027 A[Catch:{ Exception -> 0x002d }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0031 A[SYNTHETIC, Splitter:B:17:0x0031] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x003e A[SYNTHETIC, Splitter:B:23:0x003e] */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m16196c(android.view.View r4) {
        /*
            r3 = this;
            r0 = 0
            java.lang.ref.WeakReference<android.view.ViewTreeObserver> r1 = r3.f11989h     // Catch:{ Exception -> 0x001d }
            if (r1 == 0) goto L_0x001d
            java.lang.ref.WeakReference<android.view.ViewTreeObserver> r1 = r3.f11989h     // Catch:{ Exception -> 0x001d }
            java.lang.Object r1 = r1.get()     // Catch:{ Exception -> 0x001d }
            android.view.ViewTreeObserver r1 = (android.view.ViewTreeObserver) r1     // Catch:{ Exception -> 0x001d }
            if (r1 == 0) goto L_0x001b
            boolean r2 = r1.isAlive()     // Catch:{ Exception -> 0x001d }
            if (r2 == 0) goto L_0x001b
            r1.removeOnScrollChangedListener(r3)     // Catch:{ Exception -> 0x001d }
            r1.removeGlobalOnLayoutListener(r3)     // Catch:{ Exception -> 0x001d }
        L_0x001b:
            r3.f11989h = r0     // Catch:{ Exception -> 0x001d }
        L_0x001d:
            android.view.ViewTreeObserver r4 = r4.getViewTreeObserver()     // Catch:{ Exception -> 0x002d }
            boolean r1 = r4.isAlive()     // Catch:{ Exception -> 0x002d }
            if (r1 == 0) goto L_0x002d
            r4.removeOnScrollChangedListener(r3)     // Catch:{ Exception -> 0x002d }
            r4.removeGlobalOnLayoutListener(r3)     // Catch:{ Exception -> 0x002d }
        L_0x002d:
            android.content.BroadcastReceiver r4 = r3.f11988g
            if (r4 == 0) goto L_0x003a
            android.content.Context r4 = r3.f11983b     // Catch:{ Exception -> 0x0038 }
            android.content.BroadcastReceiver r1 = r3.f11988g     // Catch:{ Exception -> 0x0038 }
            r4.unregisterReceiver(r1)     // Catch:{ Exception -> 0x0038 }
        L_0x0038:
            r3.f11988g = r0
        L_0x003a:
            android.app.Application r4 = r3.f11984c
            if (r4 == 0) goto L_0x0045
            android.app.Application r4 = r3.f11984c     // Catch:{ Exception -> 0x0045 }
            com.google.android.gms.internal.ads.afp r0 = r3.f11991j     // Catch:{ Exception -> 0x0045 }
            r4.unregisterActivityLifecycleCallbacks(r0)     // Catch:{ Exception -> 0x0045 }
        L_0x0045:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.agk.m16196c(android.view.View):void");
    }

    /* renamed from: a */
    public final long mo11891a() {
        if (this.f11994m == -2 && this.f11990i.get() == null) {
            this.f11994m = -3;
        }
        return this.f11994m;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo11892a(View view) {
        long j;
        View view2 = this.f11990i != null ? (View) this.f11990i.get() : null;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            m16196c(view2);
        }
        this.f11990i = new WeakReference<>(view);
        if (view != null) {
            if ((view.getWindowToken() == null && view.getWindowVisibility() == 8) ? false : true) {
                m16194b(view);
            }
            view.addOnAttachStateChangeListener(this);
            j = -2;
        } else {
            j = -3;
        }
        this.f11994m = j;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        m16191a(activity, 0);
        m16195c();
    }

    public final void onActivityDestroyed(Activity activity) {
        m16195c();
    }

    public final void onActivityPaused(Activity activity) {
        m16191a(activity, 4);
        m16195c();
    }

    public final void onActivityResumed(Activity activity) {
        m16191a(activity, 0);
        m16195c();
        m16193b();
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        m16195c();
    }

    public final void onActivityStarted(Activity activity) {
        m16191a(activity, 0);
        m16195c();
    }

    public final void onActivityStopped(Activity activity) {
        m16195c();
    }

    public final void onGlobalLayout() {
        m16195c();
    }

    public final void onScrollChanged() {
        m16195c();
    }

    public final void onViewAttachedToWindow(View view) {
        this.f11993l = -1;
        m16194b(view);
        m16195c();
    }

    public final void onViewDetachedFromWindow(View view) {
        this.f11993l = -1;
        m16195c();
        m16193b();
        m16196c(view);
    }
}
