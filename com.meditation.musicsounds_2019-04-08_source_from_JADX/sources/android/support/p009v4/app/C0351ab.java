package android.support.p009v4.app;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;

/* renamed from: android.support.v4.app.ab */
class C0351ab implements OnAttachStateChangeListener, OnPreDrawListener {

    /* renamed from: a */
    private final View f1015a;

    /* renamed from: b */
    private ViewTreeObserver f1016b;

    /* renamed from: c */
    private final Runnable f1017c;

    private C0351ab(View view, Runnable runnable) {
        this.f1015a = view;
        this.f1016b = view.getViewTreeObserver();
        this.f1017c = runnable;
    }

    /* renamed from: a */
    public static C0351ab m1466a(View view, Runnable runnable) {
        C0351ab abVar = new C0351ab(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(abVar);
        view.addOnAttachStateChangeListener(abVar);
        return abVar;
    }

    /* renamed from: a */
    public void mo1378a() {
        (this.f1016b.isAlive() ? this.f1016b : this.f1015a.getViewTreeObserver()).removeOnPreDrawListener(this);
        this.f1015a.removeOnAttachStateChangeListener(this);
    }

    public boolean onPreDraw() {
        mo1378a();
        this.f1017c.run();
        return true;
    }

    public void onViewAttachedToWindow(View view) {
        this.f1016b = view.getViewTreeObserver();
    }

    public void onViewDetachedFromWindow(View view) {
        mo1378a();
    }
}
