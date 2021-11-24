package android.support.transition;

import android.animation.PropertyValuesHolder;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.Property;

/* renamed from: android.support.transition.o */
class C0287o implements C0289q {
    C0287o() {
    }

    /* renamed from: a */
    public PropertyValuesHolder mo1074a(Property<?, PointF> property, Path path) {
        return PropertyValuesHolder.ofFloat(new C0285m(property, path), new float[]{0.0f, 1.0f});
    }
}
