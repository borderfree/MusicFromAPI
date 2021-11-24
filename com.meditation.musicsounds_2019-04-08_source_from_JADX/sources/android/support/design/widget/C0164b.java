package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.support.design.C0087a.C0088a;
import android.support.design.C0087a.C0098k;
import android.support.design.widget.C0164b;
import android.support.design.widget.CoordinatorLayout.C0131b;
import android.support.design.widget.CoordinatorLayout.C0134e;
import android.support.design.widget.SwipeDismissBehavior.C0144a;
import android.support.p009v4.view.C0626s;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import java.util.List;

/* renamed from: android.support.design.widget.b */
public abstract class C0164b<B extends C0164b<B>> {

    /* renamed from: a */
    static final Handler f487a = new Handler(Looper.getMainLooper(), new Callback() {
        public boolean handleMessage(Message message) {
            switch (message.what) {
                case 0:
                    ((C0164b) message.obj).mo808b();
                    return true;
                case 1:
                    ((C0164b) message.obj).mo809b(message.arg1);
                    return true;
                default:
                    return false;
            }
        }
    });
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final boolean f488d = (VERSION.SDK_INT >= 16 && VERSION.SDK_INT <= 19);

    /* renamed from: b */
    final C0181f f489b;

    /* renamed from: c */
    final C0204a f490c;

    /* renamed from: e */
    private final ViewGroup f491e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C0178c f492f;

    /* renamed from: g */
    private List<C0176a<B>> f493g;

    /* renamed from: h */
    private final AccessibilityManager f494h;

    /* renamed from: android.support.design.widget.b$a */
    public static abstract class C0176a<B> {
        /* renamed from: a */
        public void mo831a(B b) {
        }

        /* renamed from: a */
        public void mo832a(B b, int i) {
        }
    }

    /* renamed from: android.support.design.widget.b$b */
    final class C0177b extends SwipeDismissBehavior<C0181f> {
        C0177b() {
        }

        /* renamed from: a */
        public boolean mo445a(CoordinatorLayout coordinatorLayout, C0181f fVar, MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 3) {
                switch (actionMasked) {
                    case 0:
                        if (coordinatorLayout.mo488a((View) fVar, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                            C0202m.m810a().mo935c(C0164b.this.f490c);
                            break;
                        }
                        break;
                    case 1:
                        break;
                }
            }
            C0202m.m810a().mo936d(C0164b.this.f490c);
            return super.mo445a(coordinatorLayout, fVar, motionEvent);
        }

        /* renamed from: a */
        public boolean mo652a(View view) {
            return view instanceof C0181f;
        }
    }

    /* renamed from: android.support.design.widget.b$c */
    public interface C0178c {
        /* renamed from: a */
        void mo296a(int i, int i2);

        /* renamed from: b */
        void mo297b(int i, int i2);
    }

    /* renamed from: android.support.design.widget.b$d */
    interface C0179d {
        /* renamed from: a */
        void mo824a(View view);

        /* renamed from: b */
        void mo825b(View view);
    }

    /* renamed from: android.support.design.widget.b$e */
    interface C0180e {
        /* renamed from: a */
        void mo827a(View view, int i, int i2, int i3, int i4);
    }

    /* renamed from: android.support.design.widget.b$f */
    static class C0181f extends FrameLayout {

        /* renamed from: a */
        private C0180e f511a;

        /* renamed from: b */
        private C0179d f512b;

        C0181f(Context context) {
            this(context, null);
        }

        C0181f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0098k.SnackbarLayout);
            if (obtainStyledAttributes.hasValue(C0098k.SnackbarLayout_elevation)) {
                C0626s.m2837a((View) this, (float) obtainStyledAttributes.getDimensionPixelSize(C0098k.SnackbarLayout_elevation, 0));
            }
            obtainStyledAttributes.recycle();
            setClickable(true);
        }

        /* access modifiers changed from: protected */
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            if (this.f512b != null) {
                this.f512b.mo824a(this);
            }
            C0626s.m2872o(this);
        }

        /* access modifiers changed from: protected */
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            if (this.f512b != null) {
                this.f512b.mo825b(this);
            }
        }

        /* access modifiers changed from: protected */
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            if (this.f511a != null) {
                this.f511a.mo827a(this, i, i2, i3, i4);
            }
        }

        /* access modifiers changed from: 0000 */
        public void setOnAttachStateChangeListener(C0179d dVar) {
            this.f512b = dVar;
        }

        /* access modifiers changed from: 0000 */
        public void setOnLayoutChangeListener(C0180e eVar) {
            this.f511a = eVar;
        }
    }

    /* renamed from: d */
    private void m651d(final int i) {
        if (VERSION.SDK_INT >= 12) {
            ValueAnimator valueAnimator = new ValueAnimator();
            valueAnimator.setIntValues(new int[]{0, this.f489b.getHeight()});
            valueAnimator.setInterpolator(C0163a.f483b);
            valueAnimator.setDuration(250);
            valueAnimator.addListener(new AnimatorListenerAdapter() {
                public void onAnimationEnd(Animator animator) {
                    C0164b.this.mo811c(i);
                }

                public void onAnimationStart(Animator animator) {
                    C0164b.this.f492f.mo297b(0, 180);
                }
            });
            valueAnimator.addUpdateListener(new AnimatorUpdateListener() {

                /* renamed from: b */
                private int f499b = 0;

                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    if (C0164b.f488d) {
                        C0626s.m2860d(C0164b.this.f489b, intValue - this.f499b);
                    } else {
                        C0164b.this.f489b.setTranslationY((float) intValue);
                    }
                    this.f499b = intValue;
                }
            });
            valueAnimator.start();
            return;
        }
        Animation loadAnimation = AnimationUtils.loadAnimation(this.f489b.getContext(), C0088a.design_snackbar_out);
        loadAnimation.setInterpolator(C0163a.f483b);
        loadAnimation.setDuration(250);
        loadAnimation.setAnimationListener(new AnimationListener() {
            public void onAnimationEnd(Animation animation) {
                C0164b.this.mo811c(i);
            }

            public void onAnimationRepeat(Animation animation) {
            }

            public void onAnimationStart(Animation animation) {
            }
        });
        this.f489b.startAnimation(loadAnimation);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo806a(int i) {
        C0202m.m810a().mo932a(this.f490c, i);
    }

    /* renamed from: a */
    public boolean mo807a() {
        return C0202m.m810a().mo937e(this.f490c);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo808b() {
        if (this.f489b.getParent() == null) {
            LayoutParams layoutParams = this.f489b.getLayoutParams();
            if (layoutParams instanceof C0134e) {
                C0134e eVar = (C0134e) layoutParams;
                C0177b bVar = new C0177b();
                bVar.mo649a(0.1f);
                bVar.mo653b(0.6f);
                bVar.mo650a(0);
                bVar.mo651a((C0144a) new C0144a() {
                    /* renamed from: a */
                    public void mo656a(int i) {
                        switch (i) {
                            case 0:
                                C0202m.m810a().mo936d(C0164b.this.f490c);
                                return;
                            case 1:
                            case 2:
                                C0202m.m810a().mo935c(C0164b.this.f490c);
                                return;
                            default:
                                return;
                        }
                    }

                    /* renamed from: a */
                    public void mo657a(View view) {
                        view.setVisibility(8);
                        C0164b.this.mo806a(0);
                    }
                });
                eVar.mo564a((C0131b) bVar);
                eVar.f344g = 80;
            }
            this.f491e.addView(this.f489b);
        }
        this.f489b.setOnAttachStateChangeListener(new C0179d() {
            /* renamed from: a */
            public void mo824a(View view) {
            }

            /* renamed from: b */
            public void mo825b(View view) {
                if (C0164b.this.mo807a()) {
                    C0164b.f487a.post(new Runnable() {
                        public void run() {
                            C0164b.this.mo811c(3);
                        }
                    });
                }
            }
        });
        if (!C0626s.m2880w(this.f489b)) {
            this.f489b.setOnLayoutChangeListener(new C0180e() {
                /* renamed from: a */
                public void mo827a(View view, int i, int i2, int i3, int i4) {
                    C0164b.this.f489b.setOnLayoutChangeListener(null);
                    if (C0164b.this.mo813e()) {
                        C0164b.this.mo810c();
                    } else {
                        C0164b.this.mo812d();
                    }
                }
            });
        } else if (mo813e()) {
            mo810c();
        } else {
            mo812d();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo809b(int i) {
        if (!mo813e() || this.f489b.getVisibility() != 0) {
            mo811c(i);
        } else {
            m651d(i);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo810c() {
        if (VERSION.SDK_INT >= 12) {
            final int height = this.f489b.getHeight();
            if (f488d) {
                C0626s.m2860d(this.f489b, height);
            } else {
                this.f489b.setTranslationY((float) height);
            }
            ValueAnimator valueAnimator = new ValueAnimator();
            valueAnimator.setIntValues(new int[]{height, 0});
            valueAnimator.setInterpolator(C0163a.f483b);
            valueAnimator.setDuration(250);
            valueAnimator.addListener(new AnimatorListenerAdapter() {
                public void onAnimationEnd(Animator animator) {
                    C0164b.this.mo812d();
                }

                public void onAnimationStart(Animator animator) {
                    C0164b.this.f492f.mo296a(70, 180);
                }
            });
            valueAnimator.addUpdateListener(new AnimatorUpdateListener() {

                /* renamed from: c */
                private int f509c = height;

                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    if (C0164b.f488d) {
                        C0626s.m2860d(C0164b.this.f489b, intValue - this.f509c);
                    } else {
                        C0164b.this.f489b.setTranslationY((float) intValue);
                    }
                    this.f509c = intValue;
                }
            });
            valueAnimator.start();
            return;
        }
        Animation loadAnimation = AnimationUtils.loadAnimation(this.f489b.getContext(), C0088a.design_snackbar_in);
        loadAnimation.setInterpolator(C0163a.f483b);
        loadAnimation.setDuration(250);
        loadAnimation.setAnimationListener(new AnimationListener() {
            public void onAnimationEnd(Animation animation) {
                C0164b.this.mo812d();
            }

            public void onAnimationRepeat(Animation animation) {
            }

            public void onAnimationStart(Animation animation) {
            }
        });
        this.f489b.startAnimation(loadAnimation);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo811c(int i) {
        C0202m.m810a().mo931a(this.f490c);
        if (this.f493g != null) {
            for (int size = this.f493g.size() - 1; size >= 0; size--) {
                ((C0176a) this.f493g.get(size)).mo832a(this, i);
            }
        }
        if (VERSION.SDK_INT < 11) {
            this.f489b.setVisibility(8);
        }
        ViewParent parent = this.f489b.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f489b);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo812d() {
        C0202m.m810a().mo934b(this.f490c);
        if (this.f493g != null) {
            for (int size = this.f493g.size() - 1; size >= 0; size--) {
                ((C0176a) this.f493g.get(size)).mo831a(this);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public boolean mo813e() {
        return !this.f494h.isEnabled();
    }
}
