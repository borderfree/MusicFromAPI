package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.Window;
import com.google.android.gms.ads.internal.zzbv;

@C3464ci
/* renamed from: com.google.android.gms.internal.ads.ls */
public final class C3718ls {

    /* renamed from: a */
    private final View f14409a;

    /* renamed from: b */
    private Activity f14410b;

    /* renamed from: c */
    private boolean f14411c;

    /* renamed from: d */
    private boolean f14412d;

    /* renamed from: e */
    private boolean f14413e;

    /* renamed from: f */
    private OnGlobalLayoutListener f14414f;

    /* renamed from: g */
    private OnScrollChangedListener f14415g;

    public C3718ls(Activity activity, View view, OnGlobalLayoutListener onGlobalLayoutListener, OnScrollChangedListener onScrollChangedListener) {
        this.f14410b = activity;
        this.f14409a = view;
        this.f14414f = onGlobalLayoutListener;
        this.f14415g = onScrollChangedListener;
    }

    /* renamed from: b */
    private static ViewTreeObserver m19099b(Activity activity) {
        if (activity == null) {
            return null;
        }
        Window window = activity.getWindow();
        if (window == null) {
            return null;
        }
        View decorView = window.getDecorView();
        if (decorView == null) {
            return null;
        }
        return decorView.getViewTreeObserver();
    }

    /* renamed from: e */
    private final void m19100e() {
        if (!this.f14411c) {
            if (this.f14414f != null) {
                if (this.f14410b != null) {
                    Activity activity = this.f14410b;
                    OnGlobalLayoutListener onGlobalLayoutListener = this.f14414f;
                    ViewTreeObserver b = m19099b(activity);
                    if (b != null) {
                        b.addOnGlobalLayoutListener(onGlobalLayoutListener);
                    }
                }
                zzbv.zzfg();
                C3771nr.m19228a(this.f14409a, this.f14414f);
            }
            if (this.f14415g != null) {
                if (this.f14410b != null) {
                    Activity activity2 = this.f14410b;
                    OnScrollChangedListener onScrollChangedListener = this.f14415g;
                    ViewTreeObserver b2 = m19099b(activity2);
                    if (b2 != null) {
                        b2.addOnScrollChangedListener(onScrollChangedListener);
                    }
                }
                zzbv.zzfg();
                C3771nr.m19229a(this.f14409a, this.f14415g);
            }
            this.f14411c = true;
        }
    }

    /* renamed from: f */
    private final void m19101f() {
        if (this.f14410b != null && this.f14411c) {
            if (this.f14414f != null) {
                Activity activity = this.f14410b;
                OnGlobalLayoutListener onGlobalLayoutListener = this.f14414f;
                ViewTreeObserver b = m19099b(activity);
                if (b != null) {
                    zzbv.zzem().mo13151a(b, onGlobalLayoutListener);
                }
            }
            if (this.f14415g != null) {
                Activity activity2 = this.f14410b;
                OnScrollChangedListener onScrollChangedListener = this.f14415g;
                ViewTreeObserver b2 = m19099b(activity2);
                if (b2 != null) {
                    b2.removeOnScrollChangedListener(onScrollChangedListener);
                }
            }
            this.f14411c = false;
        }
    }

    /* renamed from: a */
    public final void mo13228a() {
        this.f14413e = true;
        if (this.f14412d) {
            m19100e();
        }
    }

    /* renamed from: a */
    public final void mo13229a(Activity activity) {
        this.f14410b = activity;
    }

    /* renamed from: b */
    public final void mo13230b() {
        this.f14413e = false;
        m19101f();
    }

    /* renamed from: c */
    public final void mo13231c() {
        this.f14412d = true;
        if (this.f14413e) {
            m19100e();
        }
    }

    /* renamed from: d */
    public final void mo13232d() {
        this.f14412d = false;
        m19101f();
    }
}
