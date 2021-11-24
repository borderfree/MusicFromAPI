package android.support.transition;

import android.animation.ObjectAnimator;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.Property;

/* renamed from: android.support.transition.i */
class C0281i implements C0283k {
    C0281i() {
    }

    /* renamed from: a */
    public <T> ObjectAnimator mo1068a(T t, Property<T, PointF> property, Path path) {
        return ObjectAnimator.ofFloat(t, new C0285m(property, path), new float[]{0.0f, 1.0f});
    }
}
