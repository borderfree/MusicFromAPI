package android.support.transition;

import android.os.Build.VERSION;
import android.view.ViewGroup;

/* renamed from: android.support.transition.af */
class C0235af {

    /* renamed from: a */
    private static final C0239ai f697a = (VERSION.SDK_INT >= 18 ? new C0238ah() : new C0236ag());

    /* renamed from: a */
    static C0234ae m917a(ViewGroup viewGroup) {
        return f697a.mo982a(viewGroup);
    }

    /* renamed from: a */
    static void m918a(ViewGroup viewGroup, boolean z) {
        f697a.mo983a(viewGroup, z);
    }
}
