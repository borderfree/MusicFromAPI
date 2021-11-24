package android.support.transition;

import android.support.transition.C0290r.C0291a;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: android.support.transition.t */
public class C0293t {

    /* renamed from: a */
    private ViewGroup f797a;

    /* renamed from: b */
    private Runnable f798b;

    /* renamed from: a */
    static C0293t m1058a(View view) {
        return (C0293t) view.getTag(C0291a.transition_current_scene);
    }

    /* renamed from: a */
    static void m1059a(View view, C0293t tVar) {
        view.setTag(C0291a.transition_current_scene, tVar);
    }

    /* renamed from: a */
    public void mo1077a() {
        if (m1058a(this.f797a) == this && this.f798b != null) {
            this.f798b.run();
        }
    }
}
