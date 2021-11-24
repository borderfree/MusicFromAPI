package android.support.p009v4.view;

import android.os.Build.VERSION;
import android.support.p004a.C0039a.C0040a;
import android.view.ViewGroup;

/* renamed from: android.support.v4.view.u */
public final class C0639u {

    /* renamed from: a */
    static final C0642c f1802a;

    /* renamed from: android.support.v4.view.u$a */
    static class C0640a extends C0642c {
        C0640a() {
        }
    }

    /* renamed from: android.support.v4.view.u$b */
    static class C0641b extends C0640a {
        C0641b() {
        }

        /* renamed from: a */
        public boolean mo2544a(ViewGroup viewGroup) {
            return viewGroup.isTransitionGroup();
        }
    }

    /* renamed from: android.support.v4.view.u$c */
    static class C0642c {
        C0642c() {
        }

        /* renamed from: a */
        public boolean mo2544a(ViewGroup viewGroup) {
            Boolean bool = (Boolean) viewGroup.getTag(C0040a.tag_transition_group);
            return ((bool == null || !bool.booleanValue()) && viewGroup.getBackground() == null && C0626s.m2870m(viewGroup) == null) ? false : true;
        }
    }

    static {
        C0642c cVar = VERSION.SDK_INT >= 21 ? new C0641b() : VERSION.SDK_INT >= 18 ? new C0640a() : new C0642c();
        f1802a = cVar;
    }

    /* renamed from: a */
    public static boolean m2990a(ViewGroup viewGroup) {
        return f1802a.mo2544a(viewGroup);
    }
}
