package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Build.VERSION;

/* renamed from: android.support.transition.a */
class C0229a {

    /* renamed from: a */
    private static final C0263d f688a = (VERSION.SDK_INT >= 19 ? new C0262c() : new C0260b());

    /* renamed from: a */
    static void m905a(Animator animator) {
        f688a.mo1034a(animator);
    }

    /* renamed from: a */
    static void m906a(Animator animator, AnimatorListenerAdapter animatorListenerAdapter) {
        f688a.mo1035a(animator, animatorListenerAdapter);
    }

    /* renamed from: b */
    static void m907b(Animator animator) {
        f688a.mo1036b(animator);
    }
}
