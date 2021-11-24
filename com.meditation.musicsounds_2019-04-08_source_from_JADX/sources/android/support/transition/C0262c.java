package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: android.support.transition.c */
class C0262c implements C0263d {
    C0262c() {
    }

    /* renamed from: a */
    public void mo1034a(Animator animator) {
        animator.pause();
    }

    /* renamed from: a */
    public void mo1035a(Animator animator, AnimatorListenerAdapter animatorListenerAdapter) {
        animator.addPauseListener(animatorListenerAdapter);
    }

    /* renamed from: b */
    public void mo1036b(Animator animator) {
        animator.resume();
    }
}
