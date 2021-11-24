package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.support.p009v4.view.C0626s;
import android.support.transition.C0294u.C0300c;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: android.support.transition.g */
public class C0277g extends C0253at {

    /* renamed from: android.support.transition.g$a */
    private static class C0279a extends AnimatorListenerAdapter {

        /* renamed from: a */
        private final View f786a;

        /* renamed from: b */
        private boolean f787b = false;

        C0279a(View view) {
            this.f786a = view;
        }

        public void onAnimationEnd(Animator animator) {
            C0244am.m943a(this.f786a, 1.0f);
            if (this.f787b) {
                this.f786a.setLayerType(0, null);
            }
        }

        public void onAnimationStart(Animator animator) {
            if (C0626s.m2874q(this.f786a) && this.f786a.getLayerType() == 0) {
                this.f787b = true;
                this.f786a.setLayerType(2, null);
            }
        }
    }

    public C0277g() {
    }

    public C0277g(int i) {
        mo1016a(i);
    }

    /* renamed from: a */
    private static float m1040a(C0230aa aaVar, float f) {
        if (aaVar == null) {
            return f;
        }
        Float f2 = (Float) aaVar.f689a.get("android:fade:transitionAlpha");
        return f2 != null ? f2.floatValue() : f;
    }

    /* renamed from: a */
    private Animator m1041a(final View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        C0244am.m943a(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, C0244am.f713a, new float[]{f2});
        ofFloat.addListener(new C0279a(view));
        mo1080a((C0300c) new C0301v() {
            /* renamed from: a */
            public void mo971a(C0294u uVar) {
                C0244am.m943a(view, 1.0f);
                C0244am.m951e(view);
                uVar.mo1092b((C0300c) this);
            }
        });
        return ofFloat;
    }

    /* renamed from: a */
    public Animator mo1015a(ViewGroup viewGroup, View view, C0230aa aaVar, C0230aa aaVar2) {
        float f = 0.0f;
        float a = m1040a(aaVar, 0.0f);
        if (a != 1.0f) {
            f = a;
        }
        return m1041a(view, f, 1.0f);
    }

    /* renamed from: a */
    public void mo1017a(C0230aa aaVar) {
        super.mo1017a(aaVar);
        aaVar.f689a.put("android:fade:transitionAlpha", Float.valueOf(C0244am.m949c(aaVar.f690b)));
    }

    /* renamed from: b */
    public Animator mo1021b(ViewGroup viewGroup, View view, C0230aa aaVar, C0230aa aaVar2) {
        C0244am.m950d(view);
        return m1041a(view, m1040a(aaVar, 1.0f), 0.0f);
    }
}
