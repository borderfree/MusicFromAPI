package android.support.p009v4.widget;

import android.os.Build.VERSION;
import android.widget.EdgeEffect;

/* renamed from: android.support.v4.widget.i */
public final class C0695i {

    /* renamed from: a */
    private static final C0697b f2041a = (VERSION.SDK_INT >= 21 ? new C0696a() : new C0697b());

    /* renamed from: android.support.v4.widget.i$a */
    static class C0696a extends C0697b {
        C0696a() {
        }

        /* renamed from: a */
        public void mo2892a(EdgeEffect edgeEffect, float f, float f2) {
            edgeEffect.onPull(f, f2);
        }
    }

    /* renamed from: android.support.v4.widget.i$b */
    static class C0697b {
        C0697b() {
        }

        /* renamed from: a */
        public void mo2892a(EdgeEffect edgeEffect, float f, float f2) {
            edgeEffect.onPull(f);
        }
    }

    /* renamed from: a */
    public static void m3290a(EdgeEffect edgeEffect, float f, float f2) {
        f2041a.mo2892a(edgeEffect, f, f2);
    }
}
