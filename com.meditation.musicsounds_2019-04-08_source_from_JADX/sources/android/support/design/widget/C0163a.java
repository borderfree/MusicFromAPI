package android.support.design.widget;

import android.support.p009v4.view.p022b.C0595a;
import android.support.p009v4.view.p022b.C0596b;
import android.support.p009v4.view.p022b.C0597c;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

/* renamed from: android.support.design.widget.a */
class C0163a {

    /* renamed from: a */
    static final Interpolator f482a = new LinearInterpolator();

    /* renamed from: b */
    static final Interpolator f483b = new C0596b();

    /* renamed from: c */
    static final Interpolator f484c = new C0595a();

    /* renamed from: d */
    static final Interpolator f485d = new C0597c();

    /* renamed from: e */
    static final Interpolator f486e = new DecelerateInterpolator();

    /* renamed from: a */
    static float m648a(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    /* renamed from: a */
    static int m649a(int i, int i2, float f) {
        return i + Math.round(f * ((float) (i2 - i)));
    }
}
