package android.support.transition;

import android.animation.ObjectAnimator;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.Property;

/* renamed from: android.support.transition.j */
class C0282j implements C0283k {
    C0282j() {
    }

    /* renamed from: a */
    public <T> ObjectAnimator mo1068a(T t, Property<T, PointF> property, Path path) {
        return ObjectAnimator.ofObject(t, property, null, path);
    }
}
