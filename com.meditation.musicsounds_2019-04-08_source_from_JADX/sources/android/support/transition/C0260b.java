package android.support.transition;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;

/* renamed from: android.support.transition.b */
class C0260b implements C0263d {

    /* renamed from: android.support.transition.b$a */
    interface C0261a {
        void onAnimationPause(Animator animator);

        void onAnimationResume(Animator animator);
    }

    C0260b() {
    }

    /* renamed from: a */
    public void mo1034a(Animator animator) {
        ArrayList listeners = animator.getListeners();
        if (listeners != null) {
            int size = listeners.size();
            for (int i = 0; i < size; i++) {
                AnimatorListener animatorListener = (AnimatorListener) listeners.get(i);
                if (animatorListener instanceof C0261a) {
                    ((C0261a) animatorListener).onAnimationPause(animator);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo1035a(Animator animator, AnimatorListenerAdapter animatorListenerAdapter) {
    }

    /* renamed from: b */
    public void mo1036b(Animator animator) {
        ArrayList listeners = animator.getListeners();
        if (listeners != null) {
            int size = listeners.size();
            for (int i = 0; i < size; i++) {
                AnimatorListener animatorListener = (AnimatorListener) listeners.get(i);
                if (animatorListener instanceof C0261a) {
                    ((C0261a) animatorListener).onAnimationResume(animator);
                }
            }
        }
    }
}
