package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.Window;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.zzbv;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;

@TargetApi(14)
@C3464ci
public final class ait implements ActivityLifecycleCallbacks, OnAttachStateChangeListener, OnGlobalLayoutListener, OnScrollChangedListener {

    /* renamed from: a */
    private static final long f12124a = ((Long) ane.m16650f().mo12297a(aqm.f12727bn)).longValue();

    /* renamed from: b */
    private final Context f12125b;

    /* renamed from: c */
    private Application f12126c;

    /* renamed from: d */
    private final WindowManager f12127d;

    /* renamed from: e */
    private final PowerManager f12128e;

    /* renamed from: f */
    private final KeyguardManager f12129f;

    /* renamed from: g */
    private BroadcastReceiver f12130g;

    /* renamed from: h */
    private WeakReference<ViewTreeObserver> f12131h;

    /* renamed from: i */
    private WeakReference<View> f12132i;

    /* renamed from: j */
    private aiy f12133j;

    /* renamed from: k */
    private C3708li f12134k = new C3708li(f12124a);

    /* renamed from: l */
    private boolean f12135l = false;

    /* renamed from: m */
    private int f12136m = -1;

    /* renamed from: n */
    private final HashSet<aix> f12137n = new HashSet<>();

    /* renamed from: o */
    private final DisplayMetrics f12138o;

    /* renamed from: p */
    private final Rect f12139p;

    public ait(Context context, View view) {
        this.f12125b = context.getApplicationContext();
        this.f12127d = (WindowManager) context.getSystemService("window");
        this.f12128e = (PowerManager) this.f12125b.getSystemService("power");
        this.f12129f = (KeyguardManager) context.getSystemService("keyguard");
        if (this.f12125b instanceof Application) {
            this.f12126c = (Application) this.f12125b;
            this.f12133j = new aiy((Application) this.f12125b, this);
        }
        this.f12138o = context.getResources().getDisplayMetrics();
        this.f12139p = new Rect();
        this.f12139p.right = this.f12127d.getDefaultDisplay().getWidth();
        this.f12139p.bottom = this.f12127d.getDefaultDisplay().getHeight();
        View view2 = this.f12132i != null ? (View) this.f12132i.get() : null;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            m16342b(view2);
        }
        this.f12132i = new WeakReference<>(view);
        if (view != null) {
            if (zzbv.zzem().mo13154a(view)) {
                m16338a(view);
            }
            view.addOnAttachStateChangeListener(this);
        }
    }

    /* renamed from: a */
    private final Rect m16335a(Rect rect) {
        return new Rect(m16340b(rect.left), m16340b(rect.top), m16340b(rect.right), m16340b(rect.bottom));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m16336a(int i) {
        boolean z;
        boolean z2;
        int i2 = i;
        if (this.f12137n.size() != 0 && this.f12132i != null) {
            View view = (View) this.f12132i.get();
            boolean z3 = i2 == 1;
            boolean z4 = view == null;
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            Rect rect3 = new Rect();
            Rect rect4 = new Rect();
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            if (view != null) {
                boolean globalVisibleRect = view.getGlobalVisibleRect(rect2);
                boolean localVisibleRect = view.getLocalVisibleRect(rect3);
                view.getHitRect(rect4);
                try {
                    view.getLocationOnScreen(iArr);
                    view.getLocationInWindow(iArr2);
                } catch (Exception e) {
                    C3643iy.m19173b("Failure getting view location.", e);
                }
                rect.left = iArr[0];
                rect.top = iArr[1];
                rect.right = rect.left + view.getWidth();
                rect.bottom = rect.top + view.getHeight();
                z2 = globalVisibleRect;
                z = localVisibleRect;
            } else {
                z2 = false;
                z = false;
            }
            int windowVisibility = view != null ? view.getWindowVisibility() : 8;
            if (this.f12136m != -1) {
                windowVisibility = this.f12136m;
            }
            boolean z5 = !z4 && zzbv.zzek().mo13130a(view, this.f12128e, this.f12129f) && z2 && z && windowVisibility == 0;
            if (z3 && !this.f12134k.mo13219a() && z5 == this.f12135l) {
                return;
            }
            if (z5 || this.f12135l || i2 != 1) {
                aiw aiw = new aiw(zzbv.zzer().mo11327b(), this.f12128e.isScreenOn(), view != null ? zzbv.zzem().mo13154a(view) : false, view != null ? view.getWindowVisibility() : 8, m16335a(this.f12139p), m16335a(rect), m16335a(rect2), z2, m16335a(rect3), z, m16335a(rect4), this.f12138o.density, z5);
                Iterator it = this.f12137n.iterator();
                while (it.hasNext()) {
                    ((aix) it.next()).mo11994a(aiw);
                }
                this.f12135l = z5;
            }
        }
    }

    /* renamed from: a */
    private final void m16337a(Activity activity, int i) {
        if (this.f12132i != null) {
            Window window = activity.getWindow();
            if (window != null) {
                View peekDecorView = window.peekDecorView();
                View view = (View) this.f12132i.get();
                if (!(view == null || peekDecorView == null || view.getRootView() != peekDecorView.getRootView())) {
                    this.f12136m = i;
                }
            }
        }
    }

    /* renamed from: a */
    private final void m16338a(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.f12131h = new WeakReference<>(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.f12130g == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            this.f12130g = new aiv(this);
            zzbv.zzfk().mo13226a(this.f12125b, this.f12130g, intentFilter);
        }
        if (this.f12126c != null) {
            try {
                this.f12126c.registerActivityLifecycleCallbacks(this.f12133j);
            } catch (Exception e) {
                C3643iy.m19173b("Error registering activity lifecycle callbacks.", e);
            }
        }
    }

    /* renamed from: b */
    private final int m16340b(int i) {
        return (int) (((float) i) / this.f12138o.density);
    }

    /* renamed from: b */
    private final void m16341b() {
        zzbv.zzek();
        C3653jh.f14275a.post(new aiu(this));
    }

    /* renamed from: b */
    private final void m16342b(View view) {
        try {
            if (this.f12131h != null) {
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.f12131h.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.f12131h = null;
            }
        } catch (Exception e) {
            C3643iy.m19173b("Error while unregistering listeners from the last ViewTreeObserver.", e);
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception e2) {
            C3643iy.m19173b("Error while unregistering listeners from the ViewTreeObserver.", e2);
        }
        if (this.f12130g != null) {
            try {
                zzbv.zzfk().mo13225a(this.f12125b, this.f12130g);
            } catch (IllegalStateException e3) {
                C3643iy.m19173b("Failed trying to unregister the receiver", e3);
            } catch (Exception e4) {
                zzbv.zzeo().mo13047a((Throwable) e4, "ActiveViewUnit.stopScreenStatusMonitoring");
            }
            this.f12130g = null;
        }
        if (this.f12126c != null) {
            try {
                this.f12126c.unregisterActivityLifecycleCallbacks(this.f12133j);
            } catch (Exception e5) {
                C3643iy.m19173b("Error registering activity lifecycle callbacks.", e5);
            }
        }
    }

    /* renamed from: a */
    public final void mo11978a() {
        m16336a(4);
    }

    /* renamed from: a */
    public final void mo11979a(aix aix) {
        this.f12137n.add(aix);
        m16336a(3);
    }

    /* renamed from: b */
    public final void mo11980b(aix aix) {
        this.f12137n.remove(aix);
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        m16337a(activity, 0);
        m16336a(3);
        m16341b();
    }

    public final void onActivityDestroyed(Activity activity) {
        m16336a(3);
        m16341b();
    }

    public final void onActivityPaused(Activity activity) {
        m16337a(activity, 4);
        m16336a(3);
        m16341b();
    }

    public final void onActivityResumed(Activity activity) {
        m16337a(activity, 0);
        m16336a(3);
        m16341b();
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        m16336a(3);
        m16341b();
    }

    public final void onActivityStarted(Activity activity) {
        m16337a(activity, 0);
        m16336a(3);
        m16341b();
    }

    public final void onActivityStopped(Activity activity) {
        m16336a(3);
        m16341b();
    }

    public final void onGlobalLayout() {
        m16336a(2);
        m16341b();
    }

    public final void onScrollChanged() {
        m16336a(1);
    }

    public final void onViewAttachedToWindow(View view) {
        this.f12136m = -1;
        m16338a(view);
        m16336a(3);
    }

    public final void onViewDetachedFromWindow(View view) {
        this.f12136m = -1;
        m16336a(3);
        m16341b();
        m16342b(view);
    }
}
