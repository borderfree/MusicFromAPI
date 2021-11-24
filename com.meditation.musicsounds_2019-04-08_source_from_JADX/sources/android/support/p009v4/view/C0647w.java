package android.support.p009v4.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.os.Build.VERSION;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* renamed from: android.support.v4.view.w */
public final class C0647w {

    /* renamed from: a */
    Runnable f1804a = null;

    /* renamed from: b */
    Runnable f1805b = null;

    /* renamed from: c */
    int f1806c = -1;

    /* renamed from: d */
    private WeakReference<View> f1807d;

    /* renamed from: android.support.v4.view.w$a */
    static class C0650a implements C0651x {

        /* renamed from: a */
        C0647w f1814a;

        /* renamed from: b */
        boolean f1815b;

        C0650a(C0647w wVar) {
            this.f1814a = wVar;
        }

        /* renamed from: a */
        public void mo2566a(View view) {
            this.f1815b = false;
            C0651x xVar = null;
            if (this.f1814a.f1806c > -1) {
                view.setLayerType(2, null);
            }
            if (this.f1814a.f1804a != null) {
                Runnable runnable = this.f1814a.f1804a;
                this.f1814a.f1804a = null;
                runnable.run();
            }
            Object tag = view.getTag(2113929216);
            if (tag instanceof C0651x) {
                xVar = (C0651x) tag;
            }
            if (xVar != null) {
                xVar.mo2566a(view);
            }
        }

        /* renamed from: b */
        public void mo2567b(View view) {
            C0651x xVar = null;
            if (this.f1814a.f1806c > -1) {
                view.setLayerType(this.f1814a.f1806c, null);
                this.f1814a.f1806c = -1;
            }
            if (VERSION.SDK_INT >= 16 || !this.f1815b) {
                if (this.f1814a.f1805b != null) {
                    Runnable runnable = this.f1814a.f1805b;
                    this.f1814a.f1805b = null;
                    runnable.run();
                }
                Object tag = view.getTag(2113929216);
                if (tag instanceof C0651x) {
                    xVar = (C0651x) tag;
                }
                if (xVar != null) {
                    xVar.mo2567b(view);
                }
                this.f1815b = true;
            }
        }

        /* renamed from: c */
        public void mo2568c(View view) {
            Object tag = view.getTag(2113929216);
            C0651x xVar = tag instanceof C0651x ? (C0651x) tag : null;
            if (xVar != null) {
                xVar.mo2568c(view);
            }
        }
    }

    C0647w(View view) {
        this.f1807d = new WeakReference<>(view);
    }

    /* renamed from: a */
    private void m3014a(final View view, final C0651x xVar) {
        if (xVar != null) {
            view.animate().setListener(new AnimatorListenerAdapter() {
                public void onAnimationCancel(Animator animator) {
                    xVar.mo2568c(view);
                }

                public void onAnimationEnd(Animator animator) {
                    xVar.mo2567b(view);
                }

                public void onAnimationStart(Animator animator) {
                    xVar.mo2566a(view);
                }
            });
        } else {
            view.animate().setListener(null);
        }
    }

    /* renamed from: a */
    public long mo2552a() {
        View view = (View) this.f1807d.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0;
    }

    /* renamed from: a */
    public C0647w mo2553a(float f) {
        View view = (View) this.f1807d.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    /* renamed from: a */
    public C0647w mo2554a(long j) {
        View view = (View) this.f1807d.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    /* renamed from: a */
    public C0647w mo2555a(C0651x xVar) {
        View view = (View) this.f1807d.get();
        if (view != null) {
            if (VERSION.SDK_INT < 16) {
                view.setTag(2113929216, xVar);
                xVar = new C0650a(this);
            }
            m3014a(view, xVar);
        }
        return this;
    }

    /* renamed from: a */
    public C0647w mo2556a(final C0653z zVar) {
        final View view = (View) this.f1807d.get();
        if (view != null && VERSION.SDK_INT >= 19) {
            C06492 r1 = null;
            if (zVar != null) {
                r1 = new AnimatorUpdateListener() {
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        zVar.mo2569a(view);
                    }
                };
            }
            view.animate().setUpdateListener(r1);
        }
        return this;
    }

    /* renamed from: a */
    public C0647w mo2557a(Interpolator interpolator) {
        View view = (View) this.f1807d.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    /* renamed from: b */
    public C0647w mo2558b(float f) {
        View view = (View) this.f1807d.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }

    /* renamed from: b */
    public C0647w mo2559b(long j) {
        View view = (View) this.f1807d.get();
        if (view != null) {
            view.animate().setStartDelay(j);
        }
        return this;
    }

    /* renamed from: b */
    public void mo2560b() {
        View view = (View) this.f1807d.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* renamed from: c */
    public void mo2561c() {
        View view = (View) this.f1807d.get();
        if (view != null) {
            view.animate().start();
        }
    }
}
